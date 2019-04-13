package com.nhankv.solidexample.isp.after

class Worker: IWorkable, IFeedable {
    override fun work() {
        //...working
    }

    override fun eat() {
        //...eating in launch break
    }
}
