package xzfm.kotlin.service

/**
 * Created by wangxizhong on 2017/5/31.
 */
@org.springframework.stereotype.Service
class ServiceImpl : Service {
    override fun calculationSum(index1: Int, index2: Int): Int {
        return index1 + index2
    }
}