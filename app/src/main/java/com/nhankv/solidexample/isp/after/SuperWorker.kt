package com.nhankv.solidexample.isp.after

class SuperWorker: IWorkable, IFeedable {
    override fun work() {
        //...working much more
    }

    override fun eat() {
        //...eating in launch break
    }
}
