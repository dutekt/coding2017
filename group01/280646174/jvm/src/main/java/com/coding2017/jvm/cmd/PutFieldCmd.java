package com.coding2017.jvm.cmd;

import com.coding2017.jvm.clz.ClassFile;
import com.coding2017.jvm.constant.ConstantPool;
import com.coding2017.jvm.engine.ExecutionResult;
import com.coding2017.jvm.engine.StackFrame;

public class PutFieldCmd extends TwoOperandCmd {

    public PutFieldCmd(ClassFile clzFile, String opCode) {
        super(clzFile, opCode);
    }

    @Override
    public String toString(ConstantPool pool) {

        return super.getOperandAsField(pool);
    }

    @Override
    public void execute(StackFrame frame, ExecutionResult result) {

    }
}
