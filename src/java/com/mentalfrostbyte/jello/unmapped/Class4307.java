package com.mentalfrostbyte.jello.unmapped;

import mapped.JSONObject;
import mapped.Minecraft;

public abstract class Class4307 extends Class4305 {
    public static int field20939 = 0;

    public Class4307(String var1) {
        super(null, var1, 0, 0, Minecraft.getInstance().field1283.method8043(), Minecraft.getInstance().field1283.method8044());
    }

    public int method13313() {
        return 30;
    }

    @Override
    public void method13161(JSONObject var1) {
        super.method13161(var1);
        this.method13268(Minecraft.getInstance().field1283.method8043());
        this.method13270(Minecraft.getInstance().field1283.method8044());
    }

    @Override
    public void method13065(int var1) {
        if (var1 == Minecraft.getInstance().field1299.field44652.field13070.field34875) {
            Minecraft.getInstance().field1283.method8034();
            Minecraft.getInstance().field1299.field44626 = Minecraft.getInstance().field1283.method8040();
        }

        super.method13065(var1);
    }
}
