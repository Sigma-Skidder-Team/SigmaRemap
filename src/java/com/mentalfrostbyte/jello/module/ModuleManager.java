package com.mentalfrostbyte.jello.module;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.module.impl.combat.*;
import com.mentalfrostbyte.jello.module.impl.exploit.BedRockFinder;
import com.mentalfrostbyte.jello.module.impl.exploit.Dumper;
import com.mentalfrostbyte.jello.module.impl.exploit.HypixelForceUnbanner;
import com.mentalfrostbyte.jello.module.impl.gui.jello.InfoHUD;
import com.mentalfrostbyte.jello.module.impl.gui.jello.TargetHUD;
import com.mentalfrostbyte.jello.module.impl.gui.classic.ActiveMods;
import com.mentalfrostbyte.jello.module.impl.gui.jello.KeyStrokes;
import com.mentalfrostbyte.jello.module.impl.gui.jello.TabGUI;
import com.mentalfrostbyte.jello.module.impl.misc.*;
import com.mentalfrostbyte.jello.module.impl.gui.jello.*;
import com.mentalfrostbyte.jello.module.impl.item.*;
import com.mentalfrostbyte.jello.module.impl.movement.*;
import com.mentalfrostbyte.jello.module.impl.movement.VClip;
import com.mentalfrostbyte.jello.module.impl.player.*;
import com.mentalfrostbyte.jello.module.impl.render.*;
import com.mentalfrostbyte.jello.module.impl.render.classic.*;
import com.mentalfrostbyte.jello.module.impl.render.jello.*;
import com.mentalfrostbyte.jello.module.impl.render.jello.ESP;
import com.mentalfrostbyte.jello.module.impl.world.*;
import com.mentalfrostbyte.jello.settings.Setting;
import mapped.*;
import totalcross.json.JSONArray;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

import java.io.IOException;
import java.util.*;

public class ModuleManager {
    private final Map<Class<? extends Module>, Module> moduleMap = new LinkedHashMap<>();
    private Class6814 profile;
    private MacOSTouchBar macOSTouchBar;
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

    private void sortBySuffixAndRegisterEvents() {
        this.modules.sort(Comparator.comparing(Module::getSuffix));

        for (Module mod : this.modules) {
            Client.getInstance().getEventManager().register(mod);
            this.moduleMap.put(mod.getClass(), mod);
        }
    }

    public void register(ClientMode var1) {
        this.createModules();
        this.register(new Test());
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
        this.register(new GamePlay());
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
            this.register(new InfoHUD());
            this.register(new TabGUI());
            this.register(new Compass());
            this.register(new Cords());
            this.register(new ShulkerInfo());
            this.register(new KeyStrokes());
            this.register(new MiniMap());
            this.register(new com.mentalfrostbyte.jello.module.impl.gui.jello.ActiveMods());
            this.register(new TargetHUD());
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
        this.register(new StaffRepealer());
        this.register(new PathFinder());
        this.register(new JelloAIBot());
        this.register(new VClip());
        this.register(new HitSounds());
        this.register(new NoServerInfo());
        this.register(new Murderer());
        this.register(new ItemPhysics());
        this.register(new Streaming());
        this.register(new JelloEdit());
        this.register(new AutoClicker());
        this.register(new Dumper());
        this.register(new FightBot());
        this.register(new NickNameDetector());
        this.register(new PacketDumper());
        this.register(new DebugSpeed());
        this.register(new AutoMiner());

        this.sortBySuffixAndRegisterEvents();
    }

    public JSONObject load(JSONObject json) {
        JSONArray array = null;

        try {
            array = CJsonUtils.getJSONArrayOrNull(json, "mods");
        } catch (JSONException2 ignored) {
        }

        for (Module modulesFound : this.moduleMap.values()) {
            modulesFound.resetModuleState();
        }

        if (array != null) {
            for (int var15 = 0; var15 < array.length(); var15++) {
                JSONObject moduleObject = array.getJSONObject(var15);
                String moduleName = null;

                try {
                    moduleName = CJsonUtils.getStringOrDefault(moduleObject, "name", null);
                } catch (JSONException2 var13) {
                    Client.getInstance().getLogger().warn("Invalid name in mod list config");
                }

                for (Module module : this.moduleMap.values()) {
                    if (module.getName().equals(moduleName)) {
                        try {
                            module.initialize(moduleObject);
                        } catch (JSONException2 var12) {
                            Client.getInstance()
                                    .getLogger()
                                    .warn("Could not initialize mod " + module.getName() + " from config. All settings for this mod have been erased.");
                        }
                        break;
                    }
                }
            }
        } else {
            Client.getInstance().getLogger().info("Mods array does not exist in config. Assuming a blank profile...");
        }

        for (Module module : this.moduleMap.values()) {
            if (module.isEnabled()) {
                Client.getInstance().getEventManager().subscribe(module);
                if (module instanceof ModuleWithModuleSettings) {
                    ModuleWithModuleSettings moduleWithSettings = (ModuleWithModuleSettings) module;
                    if (moduleWithSettings.parentModule != null) {
                        Client.getInstance().getEventManager().subscribe(moduleWithSettings.parentModule);
                    }
                }
            } else {
                Client.getInstance().getEventManager().unsubscribe(module);
                if (module instanceof ModuleWithModuleSettings) {
                    ModuleWithModuleSettings moduleWithSettings = (ModuleWithModuleSettings) module;

                    for (Module module1 : moduleWithSettings.moduleArray) {
                        Client.getInstance().getEventManager().unsubscribe(module1);
                    }
                }
            }

            module.initialize();
        }

        return json;
    }

    public JSONObject saveCurrentConfigToJSON(JSONObject obj) {
        JSONArray array = new JSONArray();

        for (Module module : this.moduleMap.values()) {
            array.put(module.buildUpModuleData(new JSONObject()));
        }

        obj.put("mods", array);
        return obj;
    }

    public void method14658() {
        long var3 = this.method14661();

        for (Module var6 : this.moduleMap.values()) {
            for (Setting var8 : var6.getSettingMap().values()) {
                if (var8.hasPremiumSettings()) {
                    var3++;
                }

                if (var6 instanceof ModuleWithModuleSettings) {
                    for (Module var12 : ((ModuleWithModuleSettings) var6).moduleArray) {
                        for (Setting var14 : var12.getSettingMap().values()) {
                            if (var14.hasPremiumSettings()) {
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
            var4 = var1.getString("profile");
        } catch (JSONException2 var7) {
        }

        if (Client.getInstance().getClientMode() == ClientMode.CLASSIC) {
            var4 = "Classic";
        }

        this.profile = new Class6814();
        this.macOSTouchBar = new MacOSTouchBar();

        try {
            this.profile.loadProfile(var4);
            this.macOSTouchBar.method13732(var1);
        } catch (IOException var6) {
            Client.getInstance().getLogger().error("Could not load profiles!");
            var6.printStackTrace();
            throw new RuntimeException("sorry m8");
        }

        this.macOSTouchBar.init();
    }

    public void method14660(JSONObject var1) {
        var1.put("profile", this.profile.getCurrentConfig().getName);
        this.profile.getCurrentConfig().serializedConfigData = this.saveCurrentConfigToJSON(new JSONObject());

        try {
            this.profile.saveAndReplaceConfigs();
            this.macOSTouchBar.method13731(var1);
        } catch (IOException var5) {
            var5.printStackTrace();
            Client.getInstance().getLogger().warn("Unable to save mod profiles...");
        }
    }

    public int method14661() {
        Setting var3 = this.getModuleByClass(Jesus.class).getSettingMap().get("Mode");
        String var4 = (String) var3.currentValue;
        var3.setCurrentValue("Dolphin");
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

    public Class6814 getConfigurationManager() {
        return this.profile;
    }

    public MacOSTouchBar getMacOSTouchBar() {
        return this.macOSTouchBar;
    }
}
