package com.yao.di.setter;

import com.yao.di.common.Gun;
import com.yao.di.common.Knife;

/**
 * Creator: Yao
 * Date:    2018/9/11
 * For:
 * Other:
 */
public class HunterTest {

    public static void main(String[] args) {

        Hunter hunter = new Hunter();

        hunter.hunt();
        hunter.setWeapon(new Knife());
        hunter.hunt();
        hunter.setWeapon(new Gun());
        hunter.hunt();
    }
}
