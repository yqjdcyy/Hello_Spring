package com.yao.di.setter;

import com.yao.di.common.Weapon;

/**
 * Creator: Yao
 * Date:    2018/9/11
 * For:
 * Other:
 */
public class Hunter {

    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void hunt() {
        if (null != weapon)
            weapon.fire();
        else
            System.out.println("Fist is punching");
        System.out.println("hunt a rabbit");
    }
}
