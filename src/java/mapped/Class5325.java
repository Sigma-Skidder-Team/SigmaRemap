package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.module.util.InDevelopment;
import com.mentalfrostbyte.jello.unmapped.Setting;
import totalcross.json.JSONArray;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@InDevelopment
public class Class5325 extends Module {
    private final List<Class6547> field23882 = new ArrayList<>();
    public Module[] moduleArray;
    public Module module;
    public ModeSetting modeSetting;
    private final List<String> stringList = new ArrayList<>();

    public Class5325(ModuleCategory category, String type, String description, Module... modules) {
        super(category, type, description);
        this.moduleArray = modules;

        for (Module moduleFromArray : this.moduleArray) {
            Client.getInstance().getEventManager().register(moduleFromArray);
            this.stringList.add(moduleFromArray.getName());
            moduleFromArray.method16003(this);
        }

        this.registerSetting(this.modeSetting = new ModeSetting("Type", type + " mode", 0, this.stringList.toArray(new String[0])));
        this.modeSetting.method18616(var1x -> this.method16724());
        this.method16724();
    }

    public void method16724() {
        this.method16725();

        for (Module var6 : this.moduleArray) {
            boolean var7 = this.getStringSettingValueByName("Type").equals(var6.name);
            if (this.isEnabled() && mc.player != null) {
                var6.setState(var7);
                if (var7) {
                    this.module = var6;
                }
            } else if (this.isEnabled()) {
                var6.method15998(var7);
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
    public boolean method15988() {
        if (this.module == null) {
            this.method16724();
        }

        return this.module != null ? this.module.method15988() : this.isEnabled();
    }

    @Override
    public JSONObject method15986(JSONObject var1) {
        JSONObject var4 = Class8000.method27331(var1, "sub-options");
        if (var4 != null) {
            for (Module var8 : this.moduleArray) {
                JSONArray var9 = Class8000.method27332(var4, var8.getName());
                if (var9 != null) {
                    for (int var10 = 0; var10 < var9.length(); var10++) {
                        JSONObject var11 = var9.getJSONObject(var10);
                        String var12 = Class8000.method27330(var11, "name", null);

                        for (Setting var14 : var8.settingMap.values()) {
                            if (var14.getName().equals(var12)) {
                                try {
                                    var14.method18610(var11);
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

        JSONObject var18 = super.method15986(var1);
        if (this.enabled) {
            this.method16724();
        }

        return var18;
    }

    @Override
    public JSONObject method15987(JSONObject var1) {
        try {
            JSONObject var4 = new JSONObject();

            for (Module var8 : this.moduleArray) {
                JSONArray var9 = new JSONArray();

                for (Setting var11 : var8.settingMap.values()) {
                    var9.put(var11.addDataToJSONObject(new JSONObject()));
                }

                var4.put(var8.getName(), var9);
            }

            var1.put("sub-options", var4);
            return super.method15987(var1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void isInDevelopment() {
        this.method16724();
        if (this.module instanceof PremiumModule && !Client.getInstance().getNetworkManager().isPremium()) {
            this.method15998(false);
        }
    }

    @Override
    public void method15965() {
        for (Module var6 : this.moduleArray) {
            var6.method15999(false);
        }
    }

    @Override
    public void method15985() {
        for (Module var6 : this.moduleArray) {
            var6.setState(false);
        }

        super.method15985();
    }

    public final Class5325 method16727(Class6547 var1) {
        this.field23882.add(var1);
        return this;
    }

    public final void method16728(Module var1, boolean var2) {
        for (Class6547 var6 : this.field23882) {
            var6.method19891(this, var1, var2);
        }
    }

    @Override
    public void method15953() {
        super.method15953();

        for (Module var6 : this.moduleArray) {
            var6.method15953();
        }
    }
}
