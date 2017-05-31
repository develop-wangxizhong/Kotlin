package xzfm.kotlin.control;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import xzfm.kotlin.service.Service

/**
 * Created by wangxizhong on 17/5/30.
 */
@RestController
class KotlinController {

    @Autowired
    private var service: Service? = null

    @RequestMapping(value = "/", method = arrayOf(RequestMethod.GET))
    fun test(): Int? {
        return service?.calculationSum(2, 3)
    }

    @RequestMapping(value = "/post", method = arrayOf(RequestMethod.POST))
    fun post(): String {
        return "kotlin demo--post"
    }
}
