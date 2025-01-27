// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.settings.impl;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.Type;
import mapped.*;

import java.util.Iterator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class StringSetting extends Setting<String> {
    private List<String> field21518;
    private List<String> field21519;

    public StringSetting(final String s, final String s2, final int n, final String... a) {
        super(s, s2, Type.STRING, a[n]);
        this.field21518 = new ArrayList<String>();
        this.field21519 = new ArrayList<String>();
        this.field21518 = Arrays.asList(a);
    }

    public StringSetting(final String s, final String s2, final String s3, final String... a) {
        super(s, s2, Type.STRING, s3);
        this.field21518 = new ArrayList<String>();
        this.field21519 = new ArrayList<String>();
        this.field21518 = Arrays.asList(a);
    }

    public StringSetting setPremiumMode(final String... array) {
        return this;
    }

    @Override
    public boolean getValue() {
        return this.field21519.size() > 0;
    }

    @Override
    public void method15201() {
        this.field21519.clear();
    }

    public String method15212() {
        if (!this.field21519.contains(this.currentValue)) {
            return super.method15198();
        }
        return (String) this.value;
    }

    public int method15213() {
        int n = 0;
        final Iterator<String> iterator = this.field21518.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(this.currentValue)) {
                return n;
            }
            ++n;
        }
        return 0;
    }

    public void method15214(final int n) {
        if (n > this.field21518.size()) {
            return;
        }
        if (this.field21519.contains(this.field21518.get(n)) && Minecraft.method5277() != null) {
            Client.method35173().method35197().method25776(new Class6224("Premium", "Not yet available for free version"));
            return;
        }
        this.method15199(this.field21518.get(n));
    }

    @Override
    public JSONObject method15186(final JSONObject JSONObject) {
        this.currentValue = Class8105.method26636(JSONObject, "value", this.method15203());
        int n = 0;
        final Iterator<String> iterator = this.field21518.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().equals(this.currentValue)) {
                continue;
            }
            n = 1;
        }
        if (n == 0) {
            this.currentValue = this.method15203();
        }
        return JSONObject;
    }

    public List<String> method15215() {
        return this.field21518;
    }
}
