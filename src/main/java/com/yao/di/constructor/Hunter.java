package com.yao.di.constructor;

import com.yao.di.common.Weapon;

/**
 * Creator: Yao
 * Date:    2018/9/11
 * For:
 * Other:
 */
public class Hunter {

    private Weapon weapon;

    public Hunter(Weapon weapon) {
        this.weapon = weapon;
    }

    public void hunt() {
        weapon.fire();
        System.out.println("hunt a rabbit");
    }
}
