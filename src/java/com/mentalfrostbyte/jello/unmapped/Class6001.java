package com.mentalfrostbyte.jello.unmapped;

import mapped.Class9792;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public abstract class Class6001<T> {
    public final Class2314 field26178;
    public final String field26181;
    public final String field26182;
    private final List<Class9792> field26183 = new ArrayList<Class9792>();
    public T field26179;
    public T field26180;

    public Class6001(String var1, String var2, Class2314 var3, T var4) {
        this.field26178 = var3;
        this.field26179 = this.field26180 = var4;
        this.field26181 = var1;
        this.field26182 = var2;
    }

    public abstract JSONObject method18610(JSONObject var1);

    public JSONObject method18611(JSONObject var1) {
        var1.put("name", this.method18625());
        var1.put("value", this.field26179);
        return var1;
    }

    public void method18615() {
        this.field26179 = this.field26180;
    }

    public final Class6001 method18616(Class9792 var1) {
        this.field26183.add(var1);
        return this;
    }

    public final void method18617() {
        for (Class9792 var4 : this.field26183) {
            var4.method38603(this);
        }
    }

    public Class2314 method18618() {
        return this.field26178;
    }

    public T method18619() {
        return this.field26179;
    }

    public void method18620(T var1) {
        this.method18621(var1, true);
    }

    public void method18621(T var1, boolean var2) {
        if (this.field26179 != var1) {
            this.field26179 = var1;
            if (var2) {
                this.method18617();
            }
        }
    }

    public void method18622() {
    }

    public boolean method18623() {
        return false;
    }

    public T method18624() {
        return this.field26180;
    }

    public String method18625() {
        return this.field26181;
    }

    public String method18626() {
        return this.field26182;
    }

    @Override
    public String toString() {
        return this.method18619().toString();
    }
}
