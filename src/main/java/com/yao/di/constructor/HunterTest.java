package com.yao.di.constructor;

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

        Hunter hunter;

        hunter = new Hunter(new Knife());
        hunter.hunt();

        hunter = new Hunter(new Gun());
        hunter.hunt();
    }
}
