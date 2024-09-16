package com.mentalfrostbyte.jello.module;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.module.impl.gui.classic.ActiveMods;
import com.mentalfrostbyte.jello.module.util.InDevelopment;
import com.mentalfrostbyte.jello.unmapped.SpeedRampSetting;
import com.mentalfrostbyte.jello.unmapped.Setting;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.util.SoundEvents;
import totalcross.json.JSONArray;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

import java.util.*;

public abstract class Module {
    public static Minecraft mc = Minecraft.getInstance();
    public String name;
    public String descriptor;
    public ModuleCategory category;
    public boolean enabled;
    public boolean field23391;
    private boolean field23392 = true;
    private Module field23394 = null;

    private static final List<Class<? extends Module>> moduleList = new ArrayList<>();
    public Map<String, Setting> settingMap = new LinkedHashMap<>();
    private int randomAssOffset = 0;

    public Module(ModuleCategory category, String name, String description) {
        this.category = category;
        this.name = name;
        this.descriptor = description;
    }

    public void registerSetting(Setting setting) {
        if (!this.settingMap.containsKey(setting.getName())) {
            this.settingMap.put(setting.getName(), setting);
        } else {
            throw new IllegalArgumentException("Attempted to add an option with the same name");
        }
    }

    public Object getSettingValueBySettingName(String settingName) {
        return this.settingMap.get(settingName).getCurrentValue();
    }

    public boolean getBooleanValueFromSetttingName(String var1) {
        try {
            return Boolean.parseBoolean(this.getSettingValueBySettingName(var1).toString());
        } catch (Exception var5) {
            return false;
        }
    }

    public float[] method15975(String settingName) {
        Setting settingNameValue = (Setting) this.getSettingValueBySettingName(settingName);
        return !(settingNameValue instanceof SpeedRampSetting) ? null : ((SpeedRampSetting) settingNameValue).method18613();
    }

    public int parseSettingValueToIntBySettingName(String settingName) {
        try {
            return Integer.parseInt(this.getSettingValueBySettingName(settingName).toString());
        } catch (Exception var5) {
            return -1;
        }
    }

    public float getNumberValueBySettingName(String var1) {
        try {
            return Float.parseFloat(this.getSettingValueBySettingName(var1).toString());
        } catch (Exception var5) {
            return -1.0F;
        }
    }

    public String getStringSettingValueByName(String var1) {
        try {
            return (String) this.getSettingValueBySettingName(var1);
        } catch (Exception var5) {
            return null;
        }
    }

    public List<Setting> method15979(String var1) {
        try {
            return ((Class6008) this.settingMap.get(var1)).method18635();
        } catch (Exception var5) {
            return null;
        }
    }

    public void method15980(String var1, Object var2) {
        this.settingMap.get(var1).method18620(var2);
    }

    public void method15981(String var1, boolean var2) {
        this.settingMap.get(var1).method18620(var2);
    }

    public void method15982(String var1, int var2) {
        this.settingMap.get(var1).method18620(var2);
    }

    public void method15983(String var1, boolean var2) {
        this.settingMap.get(var1).method18620(var2);
    }

    public void method15984(String var1, String var2) {
        this.settingMap.get(var1).method18620(var2);
    }

    public void method15985() {
        if (this.enabled) {
            this.onDisable();
        }

        this.enabled = false;
        this.field23391 = true;

        for (Setting var4 : this.settingMap.values()) {
            var4.method18615();
        }
    }

    public JSONObject method15986(JSONObject var1) {
        JSONArray var4 = Class8000.method27332(var1, "options");

        this.enabled = var1.method21763("enabled");

        this.field23391 = var1.method21763("allowed");

        if (var4 != null) {
            for (int var5 = 0; var5 < var4.length(); var5++) {
                JSONObject  var6 = var4.getJSONObject(var5);
                String   var7 = Class8000.method27330(var6, "name", null);

                for (Setting var9 : this.settingMap.values()) {
                    if (var9.getName().equals(var7)) {
                        try {
                            var9.method18610(var6);
                        } catch (JSONException2 var11) {
                            Client.getInstance()
                                    .getLogger()
                                    .warn("Could not initialize settings of " + this.getName() + "." + var9.getName() + " from config.");
                        }
                        break;
                    }
                }
            }
        }

        if (this.enabled && mc.world != null) {
            this.onEnable();
        }

        return var1;
    }

    public JSONObject method15987(JSONObject jo) {
        try {
            jo.put("name", this.getName());
            jo.method21800("enabled", this.enabled);
            jo.method21800("allowed", this.method16001());
            JSONArray jsonArray = new JSONArray();

            for (Setting s : this.settingMap.values()) {
                jsonArray.put(s.addDataToJSONObject(new JSONObject()));
            }

            jo.put("options", jsonArray);
            return jo;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void onEnable() {
        if (this.getClass().isAnnotationPresent(InDevelopment.class) && !moduleList.contains(this.getClass())) {
            Client.getInstance().getLogger().warn("This mod is still in development. Be careful!");
            moduleList.add(this.getClass());
        }
    }

    public void onDisable() {
    }

    public boolean method15988() {
        return this.isEnabled();
    }

    public Map<String, Setting> getSettingMap() {
        return this.settingMap;
    }

    public String getSuffix() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.descriptor;
    }

    public ModuleCategory getAdjustedCategoryBasedOnClientMode() {
        if (Client.getInstance().getClientMode() == ClientMode.CLASSIC && this.category == ModuleCategory.ITEM) {
            return ModuleCategory.PLAYER;
        } else {
            return Client.getInstance().getClientMode() == ClientMode.CLASSIC && this.category == ModuleCategory.EXPLOIT
                    ? ModuleCategory.MISC
                    : this.category;
        }
    }

    public int method15994() {
        return this.randomAssOffset;
    }

    public ModuleCategory getCategory() {
        return this.category;
    }

    public boolean isEnabled() {
        if (Client.getInstance().getClientMode() != ClientMode.NOADDONS) {
            return (Client.getInstance().getClientMode() != ClientMode.CLASSIC || this.method16006()) && this.enabled;
        } else {
            return false;
        }
    }

    public void setState(boolean enabled) {
        if (this.enabled != enabled) {
            if (!(this.enabled = enabled)) {
                Client.getInstance().getEventManager().unsubscribe(this);
                this.onDisable();
            } else {
                Client.getInstance().getEventManager().subscribe(this);
                this.onEnable();
            }
        }

        Client.getInstance().getModuleManager().method14668().method13737(this);
    }

    public void method15998(boolean var1) {
        this.enabled = var1;
        if (!this.enabled) {
            Client.getInstance().getEventManager().unsubscribe(this);
        } else {
            Client.getInstance().getEventManager().subscribe(this);
        }
    }

    public void setEnabled(boolean newEnabled) {
        if (this.enabled != newEnabled) {
            if (!(this.enabled = newEnabled)) {
                Client.getInstance().getEventManager().unsubscribe(this);
                if (!(this instanceof ModuleWithModuleSettings)) {
                    if (Client.getInstance().getClientMode() == ClientMode.JELLO
                            && Client.getInstance().getModuleManager().getModuleByClass(com.mentalfrostbyte.jello.module.impl.gui.jello.ActiveMods.class).getBooleanValueFromSetttingName("Sound")) {
                        Client.getInstance().getSoundManager().play("deactivate");
                    }

                    if (Client.getInstance().getClientMode() == ClientMode.CLASSIC
                            && Client.getInstance().getModuleManager().getModuleByClass(ActiveMods.class).getBooleanValueFromSetttingName("Sound")) {
                        Minecraft.getInstance().getSoundHandler().method1000(MinecraftSoundManager.playSoundWithCustomPitch(SoundEvents.STONE_BUTTON_CLICK_ON, 0.6F));
                    }
                }

                this.onDisable();
            } else {
                Client.getInstance().getEventManager().subscribe(this);
                if (Client.getInstance().getClientMode() == ClientMode.JELLO
                        && Client.getInstance().getModuleManager().getModuleByClass(com.mentalfrostbyte.jello.module.impl.gui.jello.ActiveMods.class).getBooleanValueFromSetttingName("Sound")) {
                    Client.getInstance().getSoundManager().play("activate");
                }

                if (Client.getInstance().getClientMode() == ClientMode.CLASSIC
                        && Client.getInstance().getModuleManager().getModuleByClass(ActiveMods.class).getBooleanValueFromSetttingName("Sound")) {
                    Minecraft.getInstance().getSoundHandler().method1000(MinecraftSoundManager.playSoundWithCustomPitch(SoundEvents.STONE_BUTTON_CLICK_ON, 0.7F));
                }

                this.onEnable();
                this.randomAssOffset++;
            }
        }

        Client.getInstance().getModuleManager().method14668().method13737(this);
    }

    public void toggle() {
        this.setEnabled(!this.isEnabled());
    }

    public boolean method16001() {
        return this.field23391;
    }

    public void method16002(boolean var1) {
        this.field23391 = var1;
    }

    public void method16003(Module var1) {
        this.field23394 = var1;
    }

    public Module access() {
        return this.field23394 != null ? this.field23394 : this;
    }

    public void method16005(boolean var1) {
        this.field23392 = var1;
    }

    public boolean method16006() {
        return this.field23392;
    }

    public void method15953() {
    }
}
