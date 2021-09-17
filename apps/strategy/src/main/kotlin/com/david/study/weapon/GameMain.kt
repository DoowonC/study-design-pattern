package com.david.study.weapon

class GameMain {

}

fun main() {
    val character = GameCharacter()
    character.attack()

    character.setWeapon(Knife())
    character.attack()

    character.setWeapon(Sword())
    character.attack()

    character.setWeapon(Ax())
    character.attack()
}