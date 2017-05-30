package xzfm.kotlin.control;

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by wangxizhong on 17/5/30.
 */
@RestController
class KotlinController {

    @RequestMapping(value = "/", method = arrayOf(RequestMethod.GET))
    fun test(): String {
        return "kotlin demo"
    }

    @RequestMapping(value = "/post", method = arrayOf(RequestMethod.POST))
    fun post(): String {
        return "kotlin demo--post"
    }

}
