package com.nhankv.solidexample.isp.before

class Manager {
    lateinit var worker: IWorker

    fun setWorket(w: IWorker) {
        worker = w
    }

    fun manage() {
        worker.work()
    }
}
