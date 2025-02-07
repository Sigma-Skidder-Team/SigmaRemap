// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.impl.render.ActiveMods;
import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.impl.BezierSetting;
import mapped.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;

public abstract class Module
{
    public static Minecraft mc;
    public String name;
    public String desc;
    public Category category;
    public boolean enabled;
    public boolean field15519;
    private boolean field15520;
    private static List<Class<? extends Module>> field15521;
    private Module field15522;
    private int field15523;
    private Set<String> field15524;
    public Map<String, Setting> field15525;
    
    public Module(final Category category, final String name, final String desc) {
        this.field15520 = true;
        this.field15522 = null;
        this.field15523 = 0;
        this.field15524 = new HashSet<String>();
        this.field15525 = new LinkedHashMap<String, Setting>();
        this.category = category;
        this.name = name;
        this.desc = desc;
    }
    
    public void addSetting(final Setting class4997) {
        if (!this.field15525.containsKey(class4997.method15204())) {
            this.field15525.put(class4997.method15204(), class4997);
            return;
        }
        throw new IllegalArgumentException("Attempted to add an option with the same name");
    }
    
    public Object method9882(final String s) {
        return this.field15525.get(s).method15198();
    }
    
    public boolean method9883(final String s) {
        try {
            return Boolean.parseBoolean(this.method9882(s).toString());
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public float[] method9884(final String s) {
        final Setting class4997 = (Setting)this.method9882(s);
        if (!(class4997 instanceof BezierSetting)) {
            return null;
        }
        return ((BezierSetting)class4997).method15217();
    }
    
    public int method9885(final String s) {
        try {
            return Integer.parseInt(this.method9882(s).toString());
        }
        catch (final Exception ex) {
            return -1;
        }
    }
    
    public float getNumberSettingValueByName(final String s) {
        try {
            return Float.parseFloat(this.method9882(s).toString());
        }
        catch (final Exception ex) {
            return -1.0f;
        }
    }
    
    public String getStringSettingValueByName(final String s) {
        try {
            return (String)this.method9882(s);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public List<Setting> method9888(final String s) {
        try {
            return this.field15525.get(s).method15224();
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public void method9889(final String s, final Object o) {
        this.field15525.get(s).method15199(o);
    }
    
    public void method9890(final String s, final boolean b) {
        this.field15525.get(s).method15199(b);
    }
    
    public void method9891(final String s, final int i) {
        this.field15525.get(s).method15199(i);
    }
    
    public void method9892(final String s, final boolean b) {
        this.field15525.get(s).method15199(b);
    }
    
    public void method9893(final String s, final String s2) {
        this.field15525.get(s).method15199(s2);
    }
    
    public void resetModuleState() {
        if (this.enabled) {
            this.onDisable();
        }
        this.enabled = false;
        this.field15519 = true;
        final Iterator<Setting> iterator = this.field15525.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method15194();
        }
    }
    
    public JSONObject method9895(final JSONObject JSONObject) {
        final JSONArray method26638 = CJsonUtils.getJSONArrayOrNull(JSONObject, "options");
        try {
            this.enabled = JSONObject.getBoolean("enabled");
        }
        catch (final JSONException class4406) {}
        try {
            this.field15519 = JSONObject.getBoolean("allowed");
        }
        catch (final JSONException class4407) {}
        if (method26638 != null) {
            for (int i = 0; i < method26638.length(); ++i) {
                final JSONObject method26639 = method26638.getJSONObject(i);
                Object method26640 = null;
                try {
                    method26640 = CJsonUtils.method26636(method26639, "name", null);
                }
                catch (final JSONException class4408) {}
                for (final Setting class4409 : this.field15525.values()) {
                    if (class4409.method15204().equals(method26640)) {
                        try {
                            class4409.method15186(method26639);
                        }
                        catch (final JSONException class4410) {
                            Client.getInstance().getLogger().warn("Could not initialize settings of " + this.getName() + "." + class4409.method15204() + " from config.");
                        }
                        break;
                    }
                }
            }
        }
        if (this.enabled && Module.mc.world != null) {
            this.onEnable();
        }
        return JSONObject;
    }
    
    public JSONObject method9896(final JSONObject JSONObject) {
        JSONObject.put("name", this.getName());
        JSONObject.method13295("enabled", this.enabled);
        JSONObject.method13295("allowed", this.method9911());
        final JSONArray class4406 = new JSONArray();
        final Iterator<Setting> iterator = this.field15525.values().iterator();
        while (iterator.hasNext()) {
            class4406.method486(iterator.next().method15193(new JSONObject()));
        }
        JSONObject.put("options", class4406);
        return JSONObject;
    }
    
    public void onEnable() {
        if (this.getClass().isAnnotationPresent(Class6752.class)) {
            if (!Module.field15521.contains(this.getClass())) {
                Client.getInstance().getLogger().warn("This mod is still in development. Be careful!");
                Module.field15521.add(this.getClass());
            }
        }
    }
    
    public void onDisable() {
    }
    
    public boolean method9898() {
        return this.isEnabled();
    }
    
    public Map<String, Setting> method9899() {
        return this.field15525;
    }
    
    public String getFormattedName() {
        return this.name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getDesc() {
        return this.desc;
    }
    
    public Category getCategoryBasedOnMode() {
        if (Client.getInstance().getClientMode() == ClientMode.CLASSIC && this.category == Category.ITEM) {
            return Category.PLAYER;
        }
        if (Client.getInstance().getClientMode() == ClientMode.CLASSIC && this.category == Category.EXPLOIT) {
            return Category.MISC;
        }
        return this.category;
    }
    
    public int method9904() {
        return this.field15523;
    }
    
    public Category getCategory() {
        return this.category;
    }
    
    public boolean isEnabled() {
        return Client.getInstance().getClientMode() != ClientMode.NOADDONS && (Client.getInstance().getClientMode() != ClientMode.CLASSIC || this.method9916()) && this.enabled;
    }
    
    public void method9907(final boolean enabled) {
        if (this.enabled != enabled) {
            if (!(this.enabled = enabled)) {
                Client.getInstance().getEventBus().unregister(this);
                this.onDisable();
            }
            else {
                Client.getInstance().getEventBus().register(this);
                this.onEnable();
            }
        }
        Client.getInstance().method35189().getJelloTouch().method21968(this);
    }
    
    public void method9908(final boolean field15518) {
        if (!(this.enabled = field15518)) {
            Client.getInstance().getEventBus().unregister(this);
        }
        else {
            Client.getInstance().getEventBus().register(this);
        }
    }
    
    public void method9909(final boolean enabled) {
        if (this.enabled != enabled) {
            if (!(this.enabled = enabled)) {
                Client.getInstance().getEventBus().unregister(this);
                if (!(this instanceof ModuleWithSettings)) {
                    if (Client.getInstance().getClientMode() == ClientMode.JELLO) {
                        if (Client.getInstance().method35189().getModuleByClass(com.mentalfrostbyte.jello.mods.impl.gui.ActiveMods.class).method9883("Sound")) {
                            Client.getInstance().method35196().method32830("deactivate");
                        }
                    }
                    if (Client.getInstance().getClientMode() == ClientMode.CLASSIC) {
                        if (Client.getInstance().method35189().getModuleByClass(ActiveMods.class).method9883("Sound")) {
                            Minecraft.method5277().method5299().method6422(Class6836.method20933(Class8520.field35617, 0.6f));
                        }
                    }
                }
                this.onDisable();
            }
            else {
                Client.getInstance().getEventBus().register(this);
                if (Client.getInstance().getClientMode() == ClientMode.JELLO) {
                    if (Client.getInstance().method35189().getModuleByClass(com.mentalfrostbyte.jello.mods.impl.gui.ActiveMods.class).method9883("Sound")) {
                        Client.getInstance().method35196().method32830("activate");
                    }
                }
                if (Client.getInstance().getClientMode() == ClientMode.CLASSIC) {
                    if (Client.getInstance().method35189().getModuleByClass(ActiveMods.class).method9883("Sound")) {
                        Minecraft.method5277().method5299().method6422(Class6836.method20933(Class8520.field35617, 0.7f));
                    }
                }
                this.onEnable();
                ++this.field15523;
            }
        }
        Client.getInstance().method35189().getJelloTouch().method21968(this);
    }
    
    public void method9910() {
        if (this.isEnabled()) {
            this.method9909(false);
        }
        else {
            this.method9909(true);
        }
    }
    
    public boolean method9911() {
        return this.field15519;
    }
    
    public void method9912(final boolean field15519) {
        this.field15519 = field15519;
    }
    
    public void method9913(final Module field15522) {
        this.field15522 = field15522;
    }
    
    public Module method9914() {
        return (this.field15522 != null) ? this.field15522 : this;
    }
    
    public void method9915(final boolean field15520) {
        this.field15520 = field15520;
    }
    
    public boolean method9916() {
        return this.field15520;
    }
    
    public void initialize() {
    }
    
    static {
        Module.mc = Minecraft.method5277();
        Module.field15521 = new ArrayList<Class<? extends Module>>();
    }
}
