// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.Class7178;
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
import com.mentalfrostbyte.jello.settings.Setting;

import java.io.IOException;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Class7060
{
    private Map<Class<? extends Module>, Module> field27468;
    private Class9076 field27469;
    private Class7178 field27470;
    private List<Module> field27471;
    
    public Class7060() {
        this.field27468 = new LinkedHashMap<Class<? extends Module>, Module>();
    }
    
    private void method21540() {
        this.field27471 = new ArrayList<Module>();
    }
    
    private void addModule(final Module class3167) {
        this.field27471.add(class3167);
    }
    
    private void method21542(final Class<? extends Module> clazz) {
        Client.method35173().method35188().method21095(clazz);
        this.field27468.remove(clazz);
    }
    
    private void method21543() {
        Collections.sort(this.field27471, new Class4450(this));
        for (final Module class3167 : this.field27471) {
            Client.method35173().method35188().method21094(class3167);
            this.field27468.put(class3167.getClass(), class3167);
        }
        Class9146.field38766 = true;
    }
    
    public void method21544(final Class2209 class2209) {
        this.method21540();
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
        if (class2209 != Class2209.field13464) {
            if (class2209 == Class2209.field13465) {
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
        this.method21543();
    }
    
    public Class4405 method21545(final Class4405 class4405) {
        Class88 method26638 = null;
        try {
            method26638 = Class8105.method26638(class4405, "mods");
        }
        catch (final Class2381 class4406) {}
        final Iterator<Module> iterator = this.field27468.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method9894();
        }
        if (method26638 != null) {
            for (int i = 0; i < method26638.method462(); ++i) {
                final Class4405 method26639 = method26638.method457(i);
                Object method26640 = null;
                try {
                    method26640 = Class8105.method26636(method26639, "name", null);
                }
                catch (final Class2381 class4407) {
                    Client.method35173().method35187().method20241("Invalid name in mod list config");
                }
                for (final Module class4408 : this.field27468.values()) {
                    if (class4408.getName().equals(method26640)) {
                        try {
                            class4408.method9895(method26639);
                        }
                        catch (final Class2381 class4409) {
                            Client.method35173().method35187().method20241("Could not initialize mod " + class4408.getName() + " from config. All settings for this mod have been erased.");
                        }
                        break;
                    }
                }
            }
        }
        else {
            Client.method35173().method35187().method20240("Mods array does not exist in config. Assuming a blank profile...");
        }
        for (final Module class4410 : this.field27468.values()) {
            if (class4410.method9906()) {
                Client.method35173().method35188().method21092(class4410);
                if (class4410 instanceof ModuleWithSettings) {
                    final ModuleWithSettings class4411 = (ModuleWithSettings)class4410;
                    if (class4411.field15743 != null) {
                        Client.method35173().method35188().method21092(class4411.field15743);
                    }
                }
            }
            else {
                Client.method35173().method35188().method21093(class4410);
                if (class4410 instanceof ModuleWithSettings) {
                    final Module[] field15742 = ((ModuleWithSettings)class4410).field15742;
                    for (int length = field15742.length, j = 0; j < length; ++j) {
                        Client.method35173().method35188().method21093(field15742[j]);
                    }
                }
            }
            class4410.method9917();
        }
        return class4405;
    }
    
    public Class4405 method21546(final Class4405 class4405) {
        final Class88 class4406 = new Class88();
        final Iterator<Module> iterator = this.field27468.values().iterator();
        while (iterator.hasNext()) {
            class4406.method486(iterator.next().method9896(new Class4405()));
        }
        class4405.method13301("mods", class4406);
        return class4405;
    }
    
    public void method21547() {
        long n = this.method21550();
        for (final Module class3167 : this.field27468.values()) {
            final Iterator<Setting> iterator2 = class3167.method9899().values().iterator();
            while (iterator2.hasNext()) {
                if (iterator2.next().getValue()) {
                    ++n;
                }
                if (!(class3167 instanceof ModuleWithSettings)) {
                    continue;
                }
                final Module[] field15742 = ((ModuleWithSettings)class3167).field15742;
                for (int length = field15742.length, i = 0; i < length; ++i) {
                    final Iterator<Setting> iterator3 = field15742[i].method9899().values().iterator();
                    while (iterator3.hasNext()) {
                        if (!iterator3.next().getValue()) {
                            continue;
                        }
                        ++n;
                    }
                }
            }
        }
    }
    
    public void method21548(final Class4405 class4405) {
        String method13268 = null;
        try {
            method13268 = class4405.method13268("profile");
        }
        catch (final Class2381 class4406) {}
        if (Client.method35173().method35209() == Class2209.field13465) {
            method13268 = "Classic";
        }
        this.field27469 = new Class9076();
        this.field27470 = new Class7178();
        try {
            this.field27469.method32704(method13268);
            this.field27470.method21963(class4405);
        }
        catch (final IOException ex) {
            Client.method35173().method35187().method20242("Could not load profiles!");
            ex.printStackTrace();
            throw new RuntimeException("sorry m8");
        }
        this.field27470.method21969();
    }
    
    public void method21549(final Class4405 class4405) {
        class4405.method13301("profile", this.field27469.method32707().field33839);
        this.field27469.method32707().field33838 = this.method21546(new Class4405());
        try {
            this.field27469.method32706();
            this.field27470.method21962(class4405);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
            Client.method35173().method35187().method20241("Unable to save mod profiles...");
        }
    }
    
    public int method21550() {
        final Setting class4997 = this.method21551(Jesus.class).method9899().get("Mode");
        final String field21511 = (String)class4997.currentValue;
        class4997.method15199("Dolphin");
        class4997.currentValue = (T)field21511;
        return 0;
    }
    
    public Module method21551(final Class<? extends Module> clazz) {
        return this.field27468.get(clazz);
    }
    
    public Module method21552(final Class<? extends Module> clazz) {
        if (clazz.getSuperclass() == ModuleWithSettings.class) {
            for (final Module class3167 : this.field27468.get(clazz.getSuperclass()).field15742) {
                if (class3167.getClass() == clazz) {
                    return class3167;
                }
            }
        }
        return this.field27468.get(clazz);
    }
    
    public Map<Class<? extends Module>, Module> method21553() {
        return this.field27468;
    }
    
    public List<Module> method21554(final Category class8013) {
        final ArrayList list = new ArrayList();
        for (final Module class8014 : this.field27468.values()) {
            if (!class8014.getCategory2().equals(class8013)) {
                continue;
            }
            list.add(class8014);
        }
        return list;
    }
    
    public List<Module> method21555() {
        final ArrayList list = new ArrayList();
        for (final Module class3167 : this.field27468.values()) {
            if (!class3167.method9906()) {
                continue;
            }
            list.add(class3167);
        }
        return list;
    }
    
    public Class9076 method21556() {
        return this.field27469;
    }
    
    public Class7178 method21557() {
        return this.field27470;
    }
}
