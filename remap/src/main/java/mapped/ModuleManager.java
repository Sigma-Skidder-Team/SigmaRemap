// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.JelloTouch;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.combat.*;
import com.mentalfrostbyte.jello.mods.impl.gui.*;
import com.mentalfrostbyte.jello.mods.impl.item.*;
import com.mentalfrostbyte.jello.mods.impl.misc.*;
import com.mentalfrostbyte.jello.mods.impl.movement.*;
import com.mentalfrostbyte.jello.mods.impl.movement.Jesus;
import com.mentalfrostbyte.jello.mods.impl.player.*;
import com.mentalfrostbyte.jello.mods.impl.render.*;
import com.mentalfrostbyte.jello.mods.impl.render.ActiveMods;
import com.mentalfrostbyte.jello.mods.impl.world.*;
import totalcross.json.CJsonUtils;
import totalcross.json.JSONArray;
import totalcross.json.JSONException;
import totalcross.json.JSONObject;

import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ModuleManager
{
    private Map<Class<? extends Module>, Module> moduleMap;
    private ProfileManager profile;
    private JelloTouch macOSTouchBar;
    private List<Module> modules;
    
    public ModuleManager() {
        this.moduleMap = new LinkedHashMap<Class<? extends Module>, Module>();
    }
    
    private void createModules() {
        this.modules = new ArrayList<Module>();
    }
    
    private void addModule(final Module class3167) {
        this.modules.add(class3167);
    }

    private void sortBySuffixAndRegisterEvents() {
        this.modules.sort(new Class4450(this));
        for (final Module mod : this.modules) {
            Client.getInstance().getEventBus().register2(mod);
            this.moduleMap.put(mod.getClass(), mod);
        }
        Class9146.field38766 = true;
    }
    
    public void register(final ClientMode clientMode) {
        this.createModules();
        this.addModule(new BlockFly());
        this.addModule(new Fly());
        this.addModule(new Speed());
        this.addModule(new EntitySpeed());
        this.addModule(new LongJump());
        this.addModule(new Jesus());
        this.addModule(new ClickTP());
        this.addModule(new NoSlow());
        this.addModule(new SafeWalk());
        this.addModule(new Phase());
        this.addModule(new Strafe());
        this.addModule(new Step());
        this.addModule(new BoatFly());
        this.addModule(new FastLadder());
        this.addModule(new HighJump());
        this.addModule(new ElytraFly());
        this.addModule(new Spider());
        this.addModule(new KillAura());
        this.addModule(new AntiKnockBack());
        this.addModule(new Criticals());
        this.addModule(new InvMove());
        this.addModule(new Aimbot());
        this.addModule(new Regen());
        this.addModule(new InfiniteAura());
        this.addModule(new FastBow());
        this.addModule(new WTap());
        this.addModule(new BowAimbot());
        this.addModule(new AntiBot());
        this.addModule(new TargetStrafe());
        this.addModule(new InteractRange());
        this.addModule(new AutoLog());
        this.addModule(new Teams());
        this.addModule(new AntiVoid());
        this.addModule(new ServerCrasher());
        this.addModule(new Disabler());
        this.addModule(new FakeLag());
        this.addModule(new DVDSimulator());
        this.addModule(new AutoArmor());
        this.addModule(new AutoTools());
        this.addModule(new AutoMLG());
        this.addModule(new ChestStealer());
        this.addModule(new AutoPotion());
        this.addModule(new InvManager());
        this.addModule(new AutoSoup());
        this.addModule(new AutoSprint());
        this.addModule(new AutoRespawn());
        this.addModule(new NoViewReset());
        this.addModule(new Sneak());
        this.addModule(new Derp());
        this.addModule(new NoFall());
        this.addModule(new Parkour());
        this.addModule(new OldHitting());
        this.addModule(new FastEat());
        this.addModule(new Blink());
        this.addModule(new AutoWalk());
        this.addModule(new AutoGapple());
        this.addModule(new LowFire());
        this.addModule(new NameProtect());
        this.addModule(new Fullbright());
        this.addModule(new Freecam());
        this.addModule(new NoHurtCam());
        this.addModule(new Breadcrumbs());
        this.addModule(new ChestESP());
        this.addModule(new AntiBlind());
        this.addModule(new XRay());
        this.addModule(new Tracers());
        this.addModule(new CameraNoClip());
        this.addModule(new Search());
        this.addModule(new Streaming());
        this.addModule(new FPSBooster());
        this.addModule(new Timer());
        this.addModule(new Nuker());
        this.addModule(new FastPlace());
        this.addModule(new AutoFarm());
        this.addModule(new NewChunks());
        this.addModule(new AntiCactus());
        this.addModule(new Weather());
        this.addModule(new FastBreak());
        this.addModule(new AntiVanish());
        this.addModule(new InteractRange());
        this.addModule(new Spammer());
        this.addModule(new Jargon());
        this.addModule(new ChatFilter());
        this.addModule(new ChatCleaner());
        this.addModule(new GameIdler());
        this.addModule(new GamePlay());
        this.addModule(new Auto32k());
        this.addModule(new CakeEater());
        this.addModule(new Unstuck());
        this.addModule(new AntiLevitation());
        this.addModule(new FakeForge());
        if (clientMode != ClientMode.JELLO) {
            if (clientMode == ClientMode.CLASSIC) {
                this.addModule(new ActiveMods());
                this.addModule(new TabGUI());
                this.addModule(new NameTags());
                this.addModule(new ESP());
                this.addModule(new OldKeyStrokes());
            }
        }
        else {
            this.addModule(new NewTabGUI());
            this.addModule(new Compass());
            this.addModule(new Cords());
            this.addModule(new ShulkerInfo());
            this.addModule(new KeyStrokes());
            this.addModule(new MiniMap());
            this.addModule(new com.mentalfrostbyte.jello.mods.impl.gui.ActiveMods());
            this.addModule(new RearView());
            this.addModule(new NewNameTags());
            this.addModule(new Waypoints());
            this.addModule(new Projectiles());
            this.addModule(new BrainFreeze());
            this.addModule(new Auto32k());
            this.addModule(new PortalGui());
            this.addModule(new PortalGodMode());
            this.addModule(new MusicParticles());
            this.addModule(new NewESP());
            this.addModule(new AutoFish());
            this.addModule(new AutoCrystal());
            this.addModule(new AutoTotem());
            this.addModule(new NoteblockPlayer());
        }
        this.sortBySuffixAndRegisterEvents();
    }
    
    public JSONObject load(final JSONObject json) {
        JSONArray array = null;
        try {
            array = CJsonUtils.getJSONArrayOrNull(json, "mods");
        }
        catch (final JSONException ignored) {}
        for (Module module : this.moduleMap.values()) {
            module.resetModuleState();
        }
        if (array != null) {
            for (int i = 0; i < array.length(); ++i) {
                final JSONObject method26639 = array.getJSONObject(i);
                Object moduleObject = null;
                try {
                    moduleObject = CJsonUtils.getStringOrDefault(method26639, "name", null);
                }
                catch (final JSONException class4407) {
                    Client.getInstance().getLogger().warn("Invalid name in mod list config");
                }
                for (final Module class4408 : this.moduleMap.values()) {
                    if (class4408.getName().equals(moduleObject)) {
                        try {
                            class4408.method9895(method26639);
                        }
                        catch (final JSONException class4409) {
                            Client.getInstance().getLogger().warn("Could not initialize mod " + class4408.getName() + " from config. All settings for this mod have been erased.");
                        }
                        break;
                    }
                }
            }
        }
        else {
            Client.getInstance().getLogger().info("Mods array does not exist in config. Assuming a blank profile...");
        }
        for (final Module class4410 : this.moduleMap.values()) {
            if (class4410.isEnabled()) {
                Client.getInstance().getEventBus().register(class4410);
                if (class4410 instanceof ModuleWithSettings) {
                    final ModuleWithSettings class4411 = (ModuleWithSettings)class4410;
                    if (class4411.parentModule != null) {
                        Client.getInstance().getEventBus().register(class4411.parentModule);
                    }
                }
            }
            else {
                Client.getInstance().getEventBus().unregister(class4410);
                if (class4410 instanceof ModuleWithSettings) {
                    final Module[] module1 = ((ModuleWithSettings)class4410).moduleArray;
                    for (int length = module1.length, j = 0; j < length; ++j) {
                        Client.getInstance().getEventBus().unregister(module1[j]);
                    }
                }
            }
            class4410.initialize();
        }
        return json;
    }
    
    public JSONObject saveCurrentConfigToJSON(final JSONObject JSONObject) {
        final JSONArray class4406 = new JSONArray();
        final Iterator<Module> iterator = this.moduleMap.values().iterator();
        while (iterator.hasNext()) {
            class4406.put(iterator.next().method9896(new JSONObject()));
        }
        JSONObject.put("mods", class4406);
        return JSONObject;
    }
    
    public void loadModProfiles(final JSONObject JSONObject) {
        String method13268 = null;
        try {
            method13268 = JSONObject.getString("profile");
        }
        catch (final JSONException class4406) {}
        if (Client.getInstance().getClientMode() == ClientMode.CLASSIC) {
            method13268 = "Classic";
        }
        this.profile = new ProfileManager();
        this.macOSTouchBar = new JelloTouch();
        try {
            this.profile.method32704(method13268);
            this.macOSTouchBar.method21963(JSONObject);
        }
        catch (final IOException ex) {
            Client.getInstance().getLogger().error("Could not load profiles!");
            ex.printStackTrace();
            throw new RuntimeException("sorry m8");
        }
        this.macOSTouchBar.method21969();
    }
    
    public void saveModProfiles(final JSONObject JSONObject) {
        JSONObject.put("profile", this.profile.method32707().field33839);
        this.profile.method32707().field33838 = this.saveCurrentConfigToJSON(new JSONObject());
        try {
            this.profile.method32706();
            this.macOSTouchBar.method21962(JSONObject);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
            Client.getInstance().getLogger().warn("Unable to save mod profiles...");
        }
    }

    public Module getModuleByClass(final Class<? extends Module> clazz) {
        return this.moduleMap.get(clazz);
    }

    public Map<Class<? extends Module>, Module> getModuleMap() {
        return this.moduleMap;
    }
    
    public List<Module> getModulesByCategory(final Category category) {
        ArrayList<Module> moduleList = new ArrayList<>();

        for (Module moduleFromMap : this.moduleMap.values()) {
            if (moduleFromMap.getCategoryBasedOnMode().equals(category)) {
                moduleList.add(moduleFromMap);
            }
        }

        return moduleList;
    }

    public ProfileManager getProfile() {
        return this.profile;
    }
    
    public JelloTouch getJelloTouch() {
        return this.macOSTouchBar;
    }
}
