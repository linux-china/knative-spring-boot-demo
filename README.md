Knative Spring Boot Demo
========================

Knative Spring Boot Application with Container Deployment.

# How to build with Google Kubernetes Engine

The application use JIB to build Docker images, please refer https://github.com/GoogleContainerTools/jib

* Build Docker image and push to gcr.io

```
mvn -P gke -DskipTests clean package
```

# How to visit

You should get KNative ingress gateway IP, then execute http call by domain name convention.

```
export KNATIVE_GATEWAY=$(kubectl get svc knative-ingressgateway -n istio-system -o 'jsonpath={.status.loadBalancer.ingress[0].ip}')
curl -H "Host: knative-spring-boot-demo.default.example.com" http://$KNATIVE_GATEWAY
```