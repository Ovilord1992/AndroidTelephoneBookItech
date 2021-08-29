package com.example.telephonebooks.model

import com.github.javafaker.Faker

class UserService {
    val users: List<UserItem> = (1..30).map {
        UserItem(
            imgId = Faker.instance().avatar().image(),
            userName = Faker.instance().name().fullName(),
            numTelephone = Faker.instance().phoneNumber().phoneNumber()
    )}
}