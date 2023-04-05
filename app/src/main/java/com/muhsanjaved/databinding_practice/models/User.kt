package com.muhsanjaved.databinding_practice.models

data class User(
    val name:String,
    val email:String,
    val phoneNo:String,
    val message:String,
    val address:String,
    val logType: LogType
){
    enum class LogType{
        CALL,
        EMAIL,
        MESSAGE
    }

    companion object {
        val  userList:List<User> = listOf(
            User("Ali", "ali@gmail.com","","","Lahore",LogType.EMAIL),
            User("Usman", "","03054684546","","Karachi",LogType.CALL),
            User("Uzair", "","","Hi...","Qamber",LogType.MESSAGE),
            User("Saad", "","","How are your?","Lankana",LogType.MESSAGE),
            User("Umair", "Umairali@gmail.com","","","Islamabad",LogType.EMAIL),
            User("Sheraz", "","","What's Up?","Karachi",LogType.MESSAGE),
            User("Sajid", "","0315644654897","","Karachi",LogType.CALL),
            User("Nadeem", "","","Hello !!","Islamabad",LogType.MESSAGE),
            User("muhsan", "","","Hi Muhsan Javed","Islamabad",LogType.MESSAGE),
            User("hyderAli", "hyderAli999@gmail.com","","","Islamabad",LogType.EMAIL),

            User("Sajid", "","0315644654897","","Karachi",LogType.CALL),
            User("Nadeem", "","","Hello !!","Islamabad",LogType.MESSAGE),
            User("muhsan", "","","Hi Muhsan Javed","Islamabad",LogType.MESSAGE),
            User("hyderAli", "hyderAli999@gmail.com","","","Islamabad",LogType.EMAIL),
            User("Ali", "ali@gmail.com","","","Lahore",LogType.EMAIL),
            User("Usman", "","03054684546","","Karachi",LogType.CALL),
            User("Uzair", "","","Hi...","Qamber",LogType.MESSAGE),
            User("Saad", "","","How are your?","Lankana",LogType.MESSAGE),
            User("Umair", "Umairali@gmail.com","","","Islamabad",LogType.EMAIL),
            User("Sheraz", "","","What's Up?","Karachi",LogType.MESSAGE),

        )
    }
}
