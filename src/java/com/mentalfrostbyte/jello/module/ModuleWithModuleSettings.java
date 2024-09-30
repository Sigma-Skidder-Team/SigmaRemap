package com.mentalfrostbyte.jello.module;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.util.InDevelopment;
import com.mentalfrostbyte.jello.settings.Setting;
import mapped.Class6547;
import mapped.CJsonUtils;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import totalcross.json.JSONArray;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * For example the Fly module
 */
@InDevelopment
public class ModuleWithModuleSettings extends Module {
    private final List<Class6547> field23882 = new ArrayList<>();
    public Module[] moduleArray;
    public Module parentModule;
    public ModeSetting modeSetting;
    private final List<String> stringList = new ArrayList<>();

    public ModuleWithModuleSettings(ModuleCategory category, String type, String description, Module... modules) {
        super(category, type, description);
        this.moduleArray = modules;

        for (Module moduleFromArray : this.moduleArray) {
            Client.getInstance().getEventManager().register(moduleFromArray);
            this.stringList.add(moduleFromArray.getName());
            moduleFromArray.method16003(this);
        }

        this.registerSetting(this.modeSetting = new ModeSetting("Type", type + " mode", 0, this.stringList.toArray(new String[0])));
        this.modeSetting.addObserver(var1x -> this.method16724());
        this.method16724();
    }

    public void method16724() {
        this.method16725();

        for (Module var6 : this.moduleArray) {
            boolean var7 = this.getStringSettingValueByName("Type").equals(var6.name);
            if (this.isEnabled() && mc.player != null) {
                var6.setState(var7);
                if (var7) {
                    this.parentModule = var6;
                }
            } else if (this.isEnabled()) {
                var6.setEnabledBasic(var7);
            }

            this.method16728(var6, var7);
        }
    }

    private void method16725() {
        boolean var3 = false;

        for (Module var7 : this.moduleArray) {
            if (this.getStringSettingValueByName("Type").equals(var7.name)) {
                var3 = true;
            }
        }

        if (!var3) {
            this.method15984("Type", this.moduleArray[0].name);
        }
    }

    public Module method16726() {
        this.method16725();

        for (Module var6 : this.moduleArray) {
            if (this.getStringSettingValueByName("Type").equals(var6.name)) {
                return var6;
            }
        }

        return null;
    }

    @Override
    public boolean isEnabled2() {
        if (this.parentModule == null) {
            this.method16724();
        }

        return this.parentModule != null ? this.parentModule.isEnabled2() : this.isEnabled();
    }

    @Override
    public JSONObject initialize(JSONObject var1) {
        JSONObject var4 = CJsonUtils.getJSONObjectOrNull(var1, "sub-options");
        if (var4 != null) {
            for (Module var8 : this.moduleArray) {
                JSONArray var9 = CJsonUtils.getJSONArrayOrNull(var4, var8.getName());
                if (var9 != null) {
                    for (int var10 = 0; var10 < var9.length(); var10++) {
                        JSONObject var11 = var9.getJSONObject(var10);
                        String var12 = CJsonUtils.getStringOrDefault(var11, "name", null);

                        for (Setting var14 : var8.settingMap.values()) {
                            if (var14.getName().equals(var12)) {
                                try {
                                    var14.loadCurrentValueFromJSONObject(var11);
                                } catch (JSONException2 var16) {
                                    Client.getInstance()
                                            .getLogger()
                                            .warn("Could not initialize settings of " + var8.getName() + "." + var14.getName() + " from config.");
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }

        JSONObject var18 = super.initialize(var1);
        if (this.enabled) {
            this.method16724();
        }

        return var18;
    }

    @Override
    public JSONObject buildUpModuleData(JSONObject obj) {
        try {
            JSONObject var4 = new JSONObject();

            for (Module var8 : this.moduleArray) {
                JSONArray var9 = new JSONArray();

                for (Setting var11 : var8.settingMap.values()) {
                    var9.put(var11.buildUpSettingData(new JSONObject()));
                }

                var4.put(var8.getName(), var9);
            }

            obj.put("sub-options", var4);
            return super.buildUpModuleData(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onEnable() {
        this.method16724();
        if (!Client.getInstance().getNetworkManager().isPremium()) {
            this.setEnabledBasic(false);
        }
    }

    @Override
    public void onDisable() {
        for (Module var6 : this.moduleArray) {
            var6.setEnabled(false);
        }
    }

    @Override
    public void resetModuleState() {
        for (Module var6 : this.moduleArray) {
            var6.setState(false);
        }

        super.resetModuleState();
    }

    public final ModuleWithModuleSettings method16727(Class6547 var1) {
        this.field23882.add(var1);
        return this;
    }

    public final void method16728(Module var1, boolean var2) {
        for (Class6547 var6 : this.field23882) {
            var6.method19891(this, var1, var2);
        }
    }

    @Override
    public void initialize() {
        super.initialize();

        for (Module var6 : this.moduleArray) {
            var6.initialize();
        }
    }
}
