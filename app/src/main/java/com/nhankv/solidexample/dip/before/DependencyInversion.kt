package com.nhankv.solidexample.dip.before

class DependencyInversion {
    fun test(orderId: Int, userId: Int) {
        val db: Database = Database()
        db.save(orderId)

        val logger: Logger = Logger()
        logger.logInfo("This is logger")

        val email: EmailSender = EmailSender()
        email.sendEmail(userId)
    }
}
