package com.mentalfrostbyte.jello.module;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.module.util.InDevelopment;
import com.mentalfrostbyte.jello.unmapped.Class6000;
import com.mentalfrostbyte.jello.unmapped.Class6001;
import mapped.*;

import java.util.*;

public abstract class Module {
    public static Minecraft mc = Minecraft.getInstance();
    private static final List<Class<? extends Module>> moduleList = new ArrayList<Class<? extends Module>>();
    public String name;
    public String descriptor;
    public ModuleCategory category;
    public boolean enabled;
    public boolean field23391;
    public Map<String, Class6001> field23397 = new LinkedHashMap<String, Class6001>();
    private boolean field23392 = true;
    private Module field23394 = null;
    private int field23395 = 0;
    private final Set<String> field23396 = new HashSet<String>();

    public Module(ModuleCategory var1, String var2, String var3) {
        this.category = var1;
        this.name = var2;
        this.descriptor = var3;
    }

    public void method15972(Class6001 var1) {
        if (!this.field23397.containsKey(var1.method18625())) {
            this.field23397.put(var1.method18625(), var1);
        } else {
            throw new IllegalArgumentException("Attempted to add an option with the same name");
        }
    }

    public Object method15973(String var1) {
        return this.field23397.get(var1).method18619();
    }

    public boolean method15974(String var1) {
        try {
            return Boolean.parseBoolean(this.method15973(var1).toString());
        } catch (Exception var5) {
            return false;
        }
    }

    public float[] method15975(String var1) {
        Class6001 var4 = (Class6001) this.method15973(var1);
        return !(var4 instanceof Class6000) ? null : ((Class6000) var4).method18613();
    }

    public int method15976(String var1) {
        try {
            return Integer.parseInt(this.method15973(var1).toString());
        } catch (Exception var5) {
            return -1;
        }
    }

    public float method15977(String var1) {
        try {
            return Float.parseFloat(this.method15973(var1).toString());
        } catch (Exception var5) {
            return -1.0F;
        }
    }

    public String getStringSettingValueByName(String var1) {
        try {
            return (String) this.method15973(var1);
        } catch (Exception var5) {
            return null;
        }
    }

    public List<Class6001> method15979(String var1) {
        try {
            return ((Class6008) this.field23397.get(var1)).method18635();
        } catch (Exception var5) {
            return null;
        }
    }

    public void method15980(String var1, Object var2) {
        this.field23397.get(var1).method18620(var2);
    }

    public void method15981(String var1, boolean var2) {
        this.field23397.get(var1).method18620(var2);
    }

    public void method15982(String var1, int var2) {
        this.field23397.get(var1).method18620(var2);
    }

    public void method15983(String var1, boolean var2) {
        this.field23397.get(var1).method18620(var2);
    }

    public void method15984(String var1, String var2) {
        this.field23397.get(var1).method18620(var2);
    }

    public void method15985() {
        if (this.enabled) {
            this.method15965();
        }

        this.enabled = false;
        this.field23391 = true;

        for (Class6001 var4 : this.field23397.values()) {
            var4.method18615();
        }
    }

    public JSONObject method15986(JSONObject var1) {
        Class2344 var4 = Class8000.method27332(var1, "options");

        this.enabled = var1.method21763("enabled");

        this.field23391 = var1.method21763("allowed");

        if (var4 != null) {
            for (int var5 = 0; var5 < var4.method9134(); var5++) {
                JSONObject  var6 = var4.method9129(var5);
                String   var7 = Class8000.method27330(var6, "name", null);

                for (Class6001 var9 : this.field23397.values()) {
                    if (var9.method18625().equals(var7)) {
                        try {
                            var9.method18610(var6);
                        } catch (Class2499 var11) {
                            Client.getInstance()
                                    .getLogger()
                                    .method20357("Could not initialize settings of " + this.method15991() + "." + var9.method18625() + " from config.");
                        }
                        break;
                    }
                }
            }
        }

        if (this.enabled && mc.world != null) {
            this.isInDevelopment();
        }

        return var1;
    }

    public JSONObject method15987(JSONObject var1) {
        try {
            var1.method21806("name", this.method15991());
            var1.method21800("enabled", this.enabled);
            var1.method21800("allowed", this.method16001());
            Class2344 var4 = new Class2344();

            for (Class6001 var6 : this.field23397.values()) {
                var4.method9158(var6.method18611(new JSONObject()));
            }

            var1.method21806("options", var4);
            return var1;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public void isInDevelopment() {
        if (this.getClass().isAnnotationPresent(InDevelopment.class) && !moduleList.contains(this.getClass())) {
            Client.getInstance().getLogger().method20357("This mod is still in development. Be careful!");
            moduleList.add(this.getClass());
        }
    }

    public void method15965() {
    }

    public boolean method15988() {
        return this.method15996();
    }

    public Map<String, Class6001> method15989() {
        return this.field23397;
    }

    public String method15990() {
        return this.name;
    }

    public String method15991() {
        return this.name;
    }

    public String method15992() {
        return this.descriptor;
    }

    public ModuleCategory method15993() {
        if (Client.getInstance().getClientMode() == ClientMode.CLASSIC && this.category == ModuleCategory.ITEM) {
            return ModuleCategory.PLAYER;
        } else {
            return Client.getInstance().getClientMode() == ClientMode.CLASSIC && this.category == ModuleCategory.EXPLOIT
                    ? ModuleCategory.MISC
                    : this.category;
        }
    }

    public int method15994() {
        return this.field23395;
    }

    public ModuleCategory method15995() {
        return this.category;
    }

    public boolean method15996() {
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
                this.method15965();
            } else {
                Client.getInstance().getEventManager().subscribe(this);
                this.isInDevelopment();
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

    public void method15999(boolean var1) {
        if (this.enabled != var1) {
            if (!(this.enabled = var1)) {
                Client.getInstance().getEventManager().unsubscribe(this);
                if (!(this instanceof Class5325)) {
                    if (Client.getInstance().getClientMode() == ClientMode.JELLO
                            && Client.getInstance().getModuleManager().method14662(ActiveMods.class).method15974("Sound")) {
                        Client.getInstance().getSoundManager().play("deactivate");
                    }

                    if (Client.getInstance().getClientMode() == ClientMode.CLASSIC
                            && Client.getInstance().getModuleManager().method14662(Class5359.class).method15974("Sound")) {
                        Minecraft.getInstance().method1546().method1000(Class6339.method19292(Class6067.field27131, 0.6F));
                    }
                }

                this.method15965();
            } else {
                Client.getInstance().getEventManager().subscribe(this);
                if (Client.getInstance().getClientMode() == ClientMode.JELLO
                        && Client.getInstance().getModuleManager().method14662(ActiveMods.class).method15974("Sound")) {
                    Client.getInstance().getSoundManager().play("activate");
                }

                if (Client.getInstance().getClientMode() == ClientMode.CLASSIC
                        && Client.getInstance().getModuleManager().method14662(Class5359.class).method15974("Sound")) {
                    Minecraft.getInstance().method1546().method1000(Class6339.method19292(Class6067.field27131, 0.7F));
                }

                this.isInDevelopment();
                this.field23395++;
            }
        }

        Client.getInstance().getModuleManager().method14668().method13737(this);
    }

    public void method16000() {
        this.method15999(!this.method15996());
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

    public Module method16004() {
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
