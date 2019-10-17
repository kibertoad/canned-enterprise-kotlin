package net.kiberion.starter

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HeartbeatController {

    @GetMapping("/heartbeat")
    fun heartbeat() = "OK"

}