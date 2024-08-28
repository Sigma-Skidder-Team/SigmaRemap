package com.mentalfrostbyte.jello.unmapped;

import mapped.Class8000;
import totalcross.json.JSONObject;

public class Class6002 extends Class6001<Integer> {
    private final String[] field26184;

    public Class6002(String var1, String var2, Integer var3, String... var4) {
        super(var1, var2, Class2314.field15857, var3);
        this.field26184 = var4;
    }

    @Override
    public JSONObject method18610(JSONObject var1) {
        this.field26179 = Class8000.method27326(var1, "value", this.method18624());
        return var1;
    }

    public String[] method18627() {
        return this.field26184;
    }
}
