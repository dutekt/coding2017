package com.coding2017.jvm.print;

import com.coding2017.jvm.constant.ConstantPool;

public class ConstantPoolPrinter {
    ConstantPool pool;

    ConstantPoolPrinter(ConstantPool pool) {
        this.pool = pool;
    }

    public void print() {

        System.out.println("Constant Pool:");

    }
}
