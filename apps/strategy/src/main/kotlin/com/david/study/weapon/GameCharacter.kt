package com.david.study.weapon

class GameCharacter {
    // 체력,마력,스테미너 등..
    private var weapon: Weapon? = null

    fun attack() {
        if(weapon != null) {
            weapon!!.attack()
        } else println("무기가 없어서 공격할 수 없습니다.")
    }

    fun setWeapon(weapon: Weapon) {
        this.weapon = weapon
    }
}
