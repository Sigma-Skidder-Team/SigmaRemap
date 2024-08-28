package com.mentalfrostbyte.jello.module;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.unmapped.Setting;
import mapped.*;
import totalcross.json.JSONArray;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

import java.io.IOException;
import java.util.*;

public class ModuleManager {
    private final Map<Class<? extends Module>, Module> moduleMap = new LinkedHashMap<>();
    private Class6814 field22247;
    private Class4378 field22248;
    private List<Module> modules;

    private void createModules() {
        this.modules = new ArrayList<>();
    }

    private void register(Module var1) {
        this.modules.add(var1);
    }

    private void method14653(Class<? extends Module> var1) {
        Client.getInstance().getEventManager().method23216(var1);
        this.moduleMap.remove(var1);
    }

    private void method14654() {
        this.modules.sort(Comparator.comparing(Module::method15990));

        for (Module var4 : this.modules) {
            Client.getInstance().getEventManager().register(var4);
            this.moduleMap.put(var4.getClass(), var4);
        }

        Class6715.field29434 = true;
    }

    public void register(ClientMode var1) {
        this.createModules();
        this.register(new BlockFly());
        this.register(new Fly());
        this.register(new Class5341());
        this.register(new Class5215());
        this.register(new Class5327());
        this.register(new Class5381());
        this.register(new Class5337());
        this.register(new Class5213());
        this.register(new Class5363());
        this.register(new Class5336());
        this.register(new Class5356());
        this.register(new Class5330());
        this.register(new Class5256());
        this.register(new Class5206());
        this.register(new Class5342());
        this.register(new Class5209());
        this.register(new Class5343());
        this.register(new Class5357());
        this.register(new Class5334());
        this.register(new Class5332());
        this.register(new Class5285());
        this.register(new Class5335());
        this.register(new Class5153());
        this.register(new Class5347());
        this.register(new Class5252());
        this.register(new Class5326());
        this.register(new Class5282());
        this.register(new Class5288());
        this.register(new Class5189());
        this.register(new Class5309());
        this.register(new Class5272());
        this.register(new Class5275());
        this.register(new Class5304());
        this.register(new Class5266());
        this.register(new Class5344());
        this.register(new Class5371());
        this.register(new Class5277());
        this.register(new Class5290());
        this.register(new Class5200());
        this.register(new Class5258());
        this.register(new Class5250());
        this.register(new Class5295());
        this.register(new Class5260());
        this.register(new Class5162());
        this.register(new Class5243());
        this.register(new Class5296());
        this.register(new Class5324());
        this.register(new Class5211());
        this.register(new Class5163());
        this.register(new Class5199());
        this.register(new Class5301());
        this.register(new Class5156());
        this.register(new Class5389());
        this.register(new Class5319());
        this.register(new Class5239());
        this.register(new Class5331());
        this.register(new Class5186());
        this.register(new Class5364());
        this.register(new Class5313());
        this.register(new Class5298());
        this.register(new Class5310());
        this.register(new Class5346());
        this.register(new Class5338());
        this.register(new Class5165());
        this.register(new Class5184());
        this.register(new Class5279());
        this.register(new Class5273());
        this.register(new Class5192());
        this.register(new Class5224());
        this.register(new Class5376());
        this.register(new Class5223());
        this.register(new Class5198());
        this.register(new Class5362());
        this.register(new Class5349());
        this.register(new Class5196());
        this.register(new Class5212());
        this.register(new Class5175());
        this.register(new Class5361());
        this.register(new Class5309());
        this.register(new Class5164());
        this.register(new Class5182());
        this.register(new Class5306());
        this.register(new Class5177());
        this.register(new GameIdler());
        this.register(new Class5340());
        this.register(new Class5323());
        this.register(new Class5235());
        this.register(new Class5228());
        this.register(new Class5269());
        this.register(new Class5170());
        if (var1 != ClientMode.JELLO) {
            if (var1 == ClientMode.CLASSIC) {
                this.register(new Class5359());
                this.register(new Class5151());
                this.register(new Class5188());
                this.register(new Class5329());
                this.register(new Class5294());
            }
        } else {
            this.register(new Class5287());
            this.register(new Class5302());
            this.register(new Class5283());
            this.register(new Class5305());
            this.register(new Class5234());
            this.register(new Class5274());
            this.register(new ActiveMods());
            this.register(new Class5261());
            this.register(new Class5377());
            this.register(new Class5227());
            this.register(new Class5280());
            this.register(new Class5179());
            this.register(new Class5323());
            this.register(new Class5303());
            this.register(new Class5167());
            this.register(new Class5263());
            this.register(new Class5339());
            this.register(new Class5249());
            this.register(new Class5254());
            this.register(new Class5194());
            this.register(new Class5255());
        }

        this.register(new HypixelForceUnbanner());
        this.register(new Class5318());
        this.register(new Class5268());

        new Class8329();
        this.method14654();
    }

    public JSONObject method14656(JSONObject var1) {
        JSONArray var4 = null;

        try {
            var4 = Class8000.method27332(var1, "mods");
        } catch (JSONException2 var14) {
        }

        for (Module var6 : this.moduleMap.values()) {
            var6.method15985();
        }

        if (var4 != null) {
            for (int var15 = 0; var15 < var4.length(); var15++) {
                JSONObject var17 = var4.getJSONObject(var15);
                String var7 = null;

                try {
                    var7 = Class8000.method27330(var17, "name", null);
                } catch (JSONException2 var13) {
                    Client.getInstance().getLogger().warn("Invalid name in mod list config");
                }

                for (Module var9 : this.moduleMap.values()) {
                    if (var9.method15991().equals(var7)) {
                        try {
                            var9.method15986(var17);
                        } catch (JSONException2 var12) {
                            Client.getInstance()
                                    .getLogger()
                                    .warn("Could not initialize mod " + var9.method15991() + " from config. All settings for this mod have been erased.");
                        }
                        break;
                    }
                }
            }
        } else {
            Client.getInstance().getLogger().info("Mods array does not exist in config. Assuming a blank profile...");
        }

        for (Module var18 : this.moduleMap.values()) {
            if (var18.method15996()) {
                Client.getInstance().getEventManager().subscribe(var18);
                if (var18 instanceof Class5325) {
                    Class5325 var20 = (Class5325) var18;
                    if (var20.field23879 != null) {
                        Client.getInstance().getEventManager().subscribe(var20.field23879);
                    }
                }
            } else {
                Client.getInstance().getEventManager().unsubscribe(var18);
                if (var18 instanceof Class5325) {
                    Class5325 var19 = (Class5325) var18;

                    for (Module var11 : var19.field23878) {
                        Client.getInstance().getEventManager().unsubscribe(var11);
                    }
                }
            }

            var18.method15953();
        }

        return var1;
    }

    public JSONObject method14657(JSONObject var1) {
        JSONArray var4 = new JSONArray();

        for (Module var6 : this.moduleMap.values()) {
            var4.put(var6.method15987(new JSONObject()));
        }

        var1.put("mods", var4);
        return var1;
    }

    public void method14658() {
        long var3 = this.method14661();

        for (Module var6 : this.moduleMap.values()) {
            for (Setting var8 : var6.method15989().values()) {
                if (var8.method18623()) {
                    var3++;
                }

                if (var6 instanceof Class5325) {
                    for (Module var12 : ((Class5325) var6).field23878) {
                        for (Setting var14 : var12.method15989().values()) {
                            if (var14.method18623()) {
                                var3++;
                            }
                        }
                    }
                }
            }
        }
    }

    public void method14659(JSONObject var1) {
        String var4 = null;

        try {
            var4 = var1.method21773("profile");
        } catch (JSONException2 var7) {
        }

        if (Client.getInstance().getClientMode() == ClientMode.CLASSIC) {
            var4 = "Classic";
        }

        this.field22247 = new Class6814();
        this.field22248 = new Class4378();

        try {
            this.field22247.method20767(var4);
            this.field22248.method13732(var1);
        } catch (IOException var6) {
            Client.getInstance().getLogger().error("Could not load profiles!");
            var6.printStackTrace();
            throw new RuntimeException("sorry m8");
        }

        this.field22248.method13738();
    }

    public void method14660(JSONObject var1) {
        var1.put("profile", this.field22247.method20770().field31263);
        this.field22247.method20770().field31262 = this.method14657(new JSONObject());

        try {
            this.field22247.method20769();
            this.field22248.method13731(var1);
        } catch (IOException var5) {
            var5.printStackTrace();
            Client.getInstance().getLogger().warn("Unable to save mod profiles...");
        }
    }

    public int method14661() {
        Setting var3 = this.method14662(Class5381.class).method15989().get("Mode");
        String var4 = (String) var3.currentValue;
        var3.method18620("Dolphin");
        var3.currentValue = var4;
        return 0;
    }

    public Module method14662(Class<? extends Module> var1) {
        return this.moduleMap.get(var1);
    }

    public Module method14663(Class<? extends Module> var1) {
        if (var1.getSuperclass() == Class5325.class) {
            Class5325 var4 = (Class5325) this.moduleMap.get(var1.getSuperclass());

            for (Module var8 : var4.field23878) {
                if (var8.getClass() == var1) {
                    return var8;
                }
            }
        }

        return this.moduleMap.get(var1);
    }

    public Map<Class<? extends Module>, Module> method14664() {
        return this.moduleMap;
    }

    public List<Module> method14665(ModuleCategory var1) {
        ArrayList var4 = new ArrayList();

        for (Module var6 : this.moduleMap.values()) {
            if (var6.method15993().equals(var1)) {
                var4.add(var6);
            }
        }

        return var4;
    }

    public List<Module> method14666() {
        ArrayList var3 = new ArrayList();

        for (Module var5 : this.moduleMap.values()) {
            if (var5.method15996()) {
                var3.add(var5);
            }
        }

        return var3;
    }

    public Class6814 method14667() {
        return this.field22247;
    }

    public Class4378 method14668() {
        return this.field22248;
    }
}
