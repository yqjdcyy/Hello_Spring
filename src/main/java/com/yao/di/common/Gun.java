package com.yao.di.common;

/**
 * Creator: Yao
 * Date:    2018/9/11
 * For:
 * Other:
 */
public class Gun implements Weapon {
    @Override
    public void fire() {
        System.out.println("Gun firing");
    }
}
