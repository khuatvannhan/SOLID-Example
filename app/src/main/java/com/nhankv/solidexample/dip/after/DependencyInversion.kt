package com.nhankv.solidexample.dip.after

class DependencyInversion {
    fun test(orderId: Int, userId: Int) {
        val dbRoom: IDatabase = RoomDatabase()
        val dbRealm: IDatabase = RealmDatabase()
        dbRoom.save(orderId)
        dbRealm.save(orderId)

        val logger: ILogger = Logger()
        logger.logInfo("This is logger")

        val email: IEmailSender = EmailSender()
        email.sendEmail(userId)
    }
}
