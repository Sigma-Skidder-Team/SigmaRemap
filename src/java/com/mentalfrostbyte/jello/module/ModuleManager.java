package com.mentalfrostbyte.jello.module;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.module.impl.combat.*;
import com.mentalfrostbyte.jello.module.impl.exploit.BedRockFinder;
import com.mentalfrostbyte.jello.module.impl.gui.classic.ActiveMods;
import com.mentalfrostbyte.jello.module.impl.gui.jello.KeyStrokes;
import com.mentalfrostbyte.jello.module.impl.gui.jello.TabGUI;
import com.mentalfrostbyte.jello.module.impl.misc.*;
import com.mentalfrostbyte.jello.module.impl.gui.jello.*;
import com.mentalfrostbyte.jello.module.impl.item.*;
import com.mentalfrostbyte.jello.module.impl.movement.*;
import com.mentalfrostbyte.jello.module.impl.player.*;
import com.mentalfrostbyte.jello.module.impl.render.*;
import com.mentalfrostbyte.jello.module.impl.render.classic.*;
import com.mentalfrostbyte.jello.module.impl.render.jello.*;
import com.mentalfrostbyte.jello.module.impl.render.jello.ESP;
import com.mentalfrostbyte.jello.module.impl.world.*;
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
        this.modules.sort(Comparator.comparing(Module::getSuffix));

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
        this.register(new Speed());
        this.register(new EntitySpeed());
        this.register(new LongJump());
        this.register(new Jesus());
        this.register(new ClickTP());
        this.register(new NoSlow());
        this.register(new SafeWalk());
        this.register(new Phase());
        this.register(new Strafe());
        this.register(new Step());
        this.register(new BoatFly());
        this.register(new FastLadder());
        this.register(new HighJump());
        this.register(new ElytraFly());
        this.register(new Spider());
        this.register(new KillAura());
        this.register(new AntiKnockback());
        this.register(new Criticals());
        this.register(new InvMove());
        this.register(new Aimbot());
        this.register(new Regen());
        this.register(new InfiniteAura());
        this.register(new FastBow());
        this.register(new WTap());
        this.register(new BowAimbot());
        this.register(new AntiBot());
        this.register(new TargetStrafe());
        this.register(new InteractRange());
        this.register(new AutoLog());
        this.register(new Teams());
        this.register(new AntiVoid());
        this.register(new ServerCrasher());
        this.register(new Disabler());
        this.register(new FakeLag());
        this.register(new DVDSimulator());
        this.register(new AutoArmor());
        this.register(new AutoTools());
        this.register(new AutoMLG());
        this.register(new ChestStealer());
        this.register(new AutoPotion());
        this.register(new InvManager());
        this.register(new AutoSoup());
        this.register(new AutoSprint());
        this.register(new AutoRespawn());
        this.register(new NoViewReset());
        this.register(new Sneak());
        this.register(new Derp());
        this.register(new NoFall());
        this.register(new Parkour());
        this.register(new OldHitting());
        this.register(new FastEat());
        this.register(new Blink());
        this.register(new AutoWalk());
        this.register(new AutoGapple());
        this.register(new LowFire());
        this.register(new NameProtect());
        this.register(new Fullbright());
        this.register(new Freecam());
        this.register(new NoHurtCam());
        this.register(new Breadcrumbs());
        this.register(new ChestESP());
        this.register(new AntiBlind());
        this.register(new XRay());
        this.register(new Tracers());
        this.register(new CameraNoClip());
        this.register(new Search());
        this.register(new FPSBooster());
        this.register(new com.mentalfrostbyte.jello.module.impl.world.Timer());
        this.register(new Nuker());
        this.register(new FastPlace());
        this.register(new AutoFarm());
        this.register(new NewChunks());
        this.register(new AntiCactus());
        this.register(new Weather());
        this.register(new FastBreak());
        this.register(new AntiVanish());
        this.register(new InteractRange());
        this.register(new Spammer());
        this.register(new Jargon());
        this.register(new ChatFilter());
        this.register(new ChatCleaner());
        this.register(new GameIdler());
        this.register(new Class5340());
        this.register(new Auto32k());
        this.register(new CakeEater());
        this.register(new Unstuck());
        this.register(new AntiLevitation());
        this.register(new FakeForge());
        if (var1 != ClientMode.JELLO) {
            if (var1 == ClientMode.CLASSIC) {
                this.register(new ActiveMods());
                this.register(new com.mentalfrostbyte.jello.module.impl.gui.classic.TabGUI());
                this.register(new Nametags());
                this.register(new com.mentalfrostbyte.jello.module.impl.render.classic.ESP());
                this.register(new com.mentalfrostbyte.jello.module.impl.gui.classic.KeyStrokes());
            }
        } else {
            this.register(new TabGUI());
            this.register(new Compass());
            this.register(new Cords());
            this.register(new ShulkerInfo());
            this.register(new KeyStrokes());
            this.register(new MiniMap());
            this.register(new com.mentalfrostbyte.jello.module.impl.gui.jello.ActiveMods());
            this.register(new RearView());
            this.register(new NameTags());
            this.register(new Waypoints());
            this.register(new Projectiles());
            this.register(new BrainFreeze());
            this.register(new Auto32k());
            this.register(new PortalGui());
            this.register(new PortalGodMode());
            this.register(new MusicParticles());
            this.register(new ESP());
            this.register(new AutoFish());
            this.register(new AutoCrystal());
            this.register(new AutoTotem());
            this.register(new NoteblockPlayer());
        }

        this.register(new HypixelForceUnbanner());
        this.register(new PacketEssentials());
        this.register(new BedRockFinder());

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
                    if (var9.getName().equals(var7)) {
                        try {
                            var9.method15986(var17);
                        } catch (JSONException2 var12) {
                            Client.getInstance()
                                    .getLogger()
                                    .warn("Could not initialize mod " + var9.getName() + " from config. All settings for this mod have been erased.");
                        }
                        break;
                    }
                }
            }
        } else {
            Client.getInstance().getLogger().info("Mods array does not exist in config. Assuming a blank profile...");
        }

        for (Module var18 : this.moduleMap.values()) {
            if (var18.isEnabled()) {
                Client.getInstance().getEventManager().subscribe(var18);
                if (var18 instanceof ModuleWithModuleSettings) {
                    ModuleWithModuleSettings var20 = (ModuleWithModuleSettings) var18;
                    if (var20.module != null) {
                        Client.getInstance().getEventManager().subscribe(var20.module);
                    }
                }
            } else {
                Client.getInstance().getEventManager().unsubscribe(var18);
                if (var18 instanceof ModuleWithModuleSettings) {
                    ModuleWithModuleSettings var19 = (ModuleWithModuleSettings) var18;

                    for (Module var11 : var19.moduleArray) {
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
            for (Setting var8 : var6.getSettingMap().values()) {
                if (var8.method18623()) {
                    var3++;
                }

                if (var6 instanceof ModuleWithModuleSettings) {
                    for (Module var12 : ((ModuleWithModuleSettings) var6).moduleArray) {
                        for (Setting var14 : var12.getSettingMap().values()) {
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
        Setting var3 = this.getModuleByClass(Jesus.class).getSettingMap().get("Mode");
        String var4 = (String) var3.currentValue;
        var3.method18620("Dolphin");
        var3.currentValue = var4;
        return 0;
    }

    public Module getModuleByClass(Class<? extends Module> module) {
        return this.moduleMap.get(module);
    }

    public Map<Class<? extends Module>, Module> getModuleMap() {
        return this.moduleMap;
    }

    public List<Module> getModulesByCategory(ModuleCategory category) {
        ArrayList<Module> moduleList = new ArrayList<>();

        for (Module moduleFromMap : this.moduleMap.values()) {
            if (moduleFromMap.getAdjustedCategoryBasedOnClientMode().equals(category)) {
                moduleList.add(moduleFromMap);
            }
        }

        return moduleList;
    }

    public List<Module> getEnabledModules() {
        ArrayList<Module> moduleList = new ArrayList();

        for (Module moduleFromMap : this.moduleMap.values()) {
            if (moduleFromMap.isEnabled()) {
                moduleList.add(moduleFromMap);
            }
        }

        return moduleList;
    }

    public Class6814 method14667() {
        return this.field22247;
    }

    public Class4378 method14668() {
        return this.field22248;
    }
}
