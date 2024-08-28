package com.mentalfrostbyte.jello.unmapped;

import mapped.Class8000;
import mapped.Class9318;
import mapped.JSONObject;

public class Class6000 extends Class6001<Class9318> {
    public Class6000(String var1, String var2, float var3, float var4, float var5, float var6) {
        super(var1, var2, Class2314.field15860, new Class9318(var3, var4, var5, var6));
    }

    @Override
    public JSONObject method18610(JSONObject var1) {
        this.field26179 = new Class9318(Class8000.method27332(var1, "value"));
        return var1;
    }

    @Override
    public JSONObject method18611(JSONObject var1) {
        var1.method21806("name", this.method18625());
        var1.method21806("value", this.method18619().method35208());
        return var1;
    }

    public void method18612(float var1, float var2, float var3, float var4) {
        this.method18614(var1, var2, var3, var4, true);
    }

    public float[] method18613() {
        Class9318 var3 = this.method18619();
        return new float[]{var3.field43257, var3.field43258, var3.field43259, var3.field43260};
    }

    public void method18614(float var1, float var2, float var3, float var4, boolean var5) {
        Class9318 var8 = new Class9318(var1, var2, var3, var4);
        if (!this.field26179.equals(var8)) {
            this.field26179 = var8;
            if (var5) {
                this.method18617();
            }
        }
    }
}
