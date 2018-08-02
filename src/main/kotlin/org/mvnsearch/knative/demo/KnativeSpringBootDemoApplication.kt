package org.mvnsearch.knative.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class KnativeSpringBootDemoApplication

@RestController
class PortalController {
    @RequestMapping("/")
    fun welcome(): String {
        return "welcome !!!"
    }
}

fun main(args: Array<String>) {
    runApplication<KnativeSpringBootDemoApplication>(*args)
}
