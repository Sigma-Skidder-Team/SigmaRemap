package com.mentalfrostbyte.jello.module;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.module.impl.gui.classic.ActiveMods;
import com.mentalfrostbyte.jello.module.util.InDevelopment;
import com.mentalfrostbyte.jello.settings.SpeedRampSetting;
import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.SubOptionSetting2;
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
    public boolean allowed;
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

    public boolean getBooleanValueFromSettingName(String var1) {
        try {
            return Boolean.parseBoolean(this.getSettingValueBySettingName(var1).toString());
        } catch (Exception var5) {
            return false;
        }
    }

    public float[] method15975(String settingName) {
        Setting settingNameValue = (Setting) this.getSettingValueBySettingName(settingName);
        return !(settingNameValue instanceof SpeedRampSetting) ? null : ((SpeedRampSetting) settingNameValue).getValues();
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
            return ((SubOptionSetting2.CustomSubOptionSetting) this.settingMap.get(var1)).getSubSettings();
        } catch (Exception var5) {
            return null;
        }
    }

    public void method15980(String var1, Object var2) {
        this.settingMap.get(var1).setCurrentValue(var2);
    }

    public void method15981(String var1, boolean var2) {
        this.settingMap.get(var1).setCurrentValue(var2);
    }

    public void method15982(String var1, int var2) {
        this.settingMap.get(var1).setCurrentValue(var2);
    }

    public void method15983(String var1, boolean var2) {
        this.settingMap.get(var1).setCurrentValue(var2);
    }

    public void method15984(String var1, String var2) {
        this.settingMap.get(var1).setCurrentValue(var2);
    }

    public void resetModuleState() {
        if (this.enabled) {
            this.onDisable();
        }

        this.enabled = false;
        this.allowed = true;

        for (Setting var4 : this.settingMap.values()) {
            var4.resetToDefault();
        }
    }

    public JSONObject initialize(JSONObject var1) {
        JSONArray var4 = CJsonUtils.getJSONArrayOrNull(var1, "options");

        this.enabled = var1.method21763("enabled");

        this.allowed = var1.method21763("allowed");

        if (var4 != null) {
            for (int var5 = 0; var5 < var4.length(); var5++) {
                JSONObject  var6 = var4.getJSONObject(var5);
                String   var7 = CJsonUtils.getStringOrDefault(var6, "name", null);

                for (Setting var9 : this.settingMap.values()) {
                    if (var9.getName().equals(var7)) {
                        try {
                            var9.loadCurrentValueFromJSONObject(var6);
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

    public JSONObject buildUpModuleData(JSONObject obj) {
        try {
            obj.put("name", this.getName());
            obj.method21800("enabled", this.enabled);
            obj.method21800("allowed", this.isAllowed());
            JSONArray jsonArray = new JSONArray();

            for (Setting<?> s : this.settingMap.values()) {
                jsonArray.put(s.buildUpSettingData(new JSONObject()));
            }

            obj.put("options", jsonArray);
            return obj;
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

    public boolean isEnabled2() {
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

        Client.getInstance().getModuleManager().getMacOSTouchBar().method13737(this);
    }

    public void setEnabledBasic(boolean enabled) {
        this.enabled = enabled;
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
                            && Client.getInstance().getModuleManager().getModuleByClass(com.mentalfrostbyte.jello.module.impl.gui.jello.ActiveMods.class).getBooleanValueFromSettingName("Sound")) {
                        Client.getInstance().getSoundManager().play("deactivate");
                    }

                    if (Client.getInstance().getClientMode() == ClientMode.CLASSIC
                            && Client.getInstance().getModuleManager().getModuleByClass(ActiveMods.class).getBooleanValueFromSettingName("Sound")) {
                        Minecraft.getInstance().getSoundHandler().method1000(MinecraftSoundManager.playSoundWithCustomPitch(SoundEvents.STONE_BUTTON_CLICK_ON, 0.6F));
                    }
                }

                this.onDisable();
            } else {
                Client.getInstance().getEventManager().subscribe(this);
                if (Client.getInstance().getClientMode() == ClientMode.JELLO
                        && Client.getInstance().getModuleManager().getModuleByClass(com.mentalfrostbyte.jello.module.impl.gui.jello.ActiveMods.class).getBooleanValueFromSettingName("Sound")) {
                    Client.getInstance().getSoundManager().play("activate");
                }

                if (Client.getInstance().getClientMode() == ClientMode.CLASSIC
                        && Client.getInstance().getModuleManager().getModuleByClass(ActiveMods.class).getBooleanValueFromSettingName("Sound")) {
                    Minecraft.getInstance().getSoundHandler().method1000(MinecraftSoundManager.playSoundWithCustomPitch(SoundEvents.STONE_BUTTON_CLICK_ON, 0.7F));
                }

                this.onEnable();
                this.randomAssOffset++;
            }
        }

        Client.getInstance().getModuleManager().getMacOSTouchBar().method13737(this);
    }

    public void toggle() {
        this.setEnabled(!this.isEnabled());
    }

    public boolean isAllowed() {
        return this.allowed;
    }

    public void setAllowed(boolean var1) {
        this.allowed = var1;
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

    public void initialize() {
    }
}
