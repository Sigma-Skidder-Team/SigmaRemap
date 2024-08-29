package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Class5282 extends Module {
    private List<Entity> field23754 = new ArrayList<Entity>();

    public Class5282() {
        super(ModuleCategory.COMBAT, "BowAimbot", "Automatically aims at players while using a bow");
        this.registerSetting(new ModeSetting("Sort mode", "Sort mode", 0, "Angle", "Range"));
        this.registerSetting(new NumberSetting<Float>("Range", "Range value", 70.0F, Float.class, 10.0F, 100.0F, 1.0F));
        this.registerSetting(new BooleanSetting("Silent", "Server-sided rotations.", false));
        this.registerSetting(new BooleanSetting("Teams", "Target team", true));
        this.registerSetting(new BooleanSetting("Players", "Target players", true));
        this.registerSetting(new BooleanSetting("Animals/Monsters", "Target animals and monsters", false));
        this.registerSetting(new BooleanSetting("Anti-Bot", "Doesn't target bots", true));
        this.registerSetting(new BooleanSetting("Invisible", "Target invisible entites", true));
    }

    // $VF: synthetic method
    public static Minecraft method16572() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16573() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16574() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16575() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16576() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16577() {
        return mc;
    }

    @Override
    public void method15965() {
        this.field23754.clear();
    }

    @EventTarget
    private void method16569(Class4399 var1) {
        if (this.isEnabled() && var1.method13921()) {
            if (!(mc.player.method3158().getItem() instanceof Class3263)) {
                this.field23754.clear();
            } else {
                this.field23754 = this.method16571(this.method16004().getNumberValueBySettingName("Range"));
            }

            if (!this.field23754.isEmpty() && this.getBooleanValueFromSetttingName("Silent")) {
                float[] var4 = Class9142.method34146((Class880) this.field23754.get(0));
                var1.method13918(var4[0]);
                var1.method13916(var4[1]);
            }
        }
    }

    @EventTarget
    private void method16570(Class4415 var1) {
        if (this.isEnabled() && !this.getBooleanValueFromSetttingName("Silent")) {
            if (!this.field23754.isEmpty()) {
                float[] var4 = Class9142.method34146((Class880) this.field23754.get(0));
                mc.player.field5031 = var4[0];
                mc.player.field5032 = var4[1];
            }
        }
    }

    public List<Entity> method16571(float var1) {
        List var4 = Class5628.method17708();
        Iterator var5 = var4.iterator();

        while (var5.hasNext()) {
            Entity var6 = (Entity) var5.next();
            if (var6 == mc.player) {
                var5.remove();
            } else if (Client.getInstance().getFriendManager().method26997(var6)) {
                var5.remove();
            } else if (!(var6 instanceof Class880)) {
                var5.remove();
            } else if (((Class880) var6).method3042() == 0.0F) {
                var5.remove();
            } else if (mc.player.method3275(var6) > var1) {
                var5.remove();
            } else if (!mc.player.method3026((Class880) var6)) {
                var5.remove();
            } else if (var6 instanceof ArmorStandEntity) {
                var5.remove();
            } else if (!this.getBooleanValueFromSetttingName("Players") && var6 instanceof PlayerEntity) {
                var5.remove();
            } else if (this.getBooleanValueFromSetttingName("Anti-Bot") && var6 instanceof PlayerEntity && Client.getInstance().getCombatManager().method29346(var6)) {
                var5.remove();
            } else if (!this.getBooleanValueFromSetttingName("Invisible") && var6.method3342()) {
                var5.remove();
            } else if (!this.getBooleanValueFromSetttingName("Animals/Monsters") && !(var6 instanceof PlayerEntity)) {
                var5.remove();
            } else if (mc.player.getRidingEntity() != null && mc.player.getRidingEntity().equals(var6)) {
                var5.remove();
            } else if (var6.method3362()) {
                var5.remove();
            } else if (var6 instanceof PlayerEntity && Class8781.method31662((PlayerEntity) var6) && !this.getBooleanValueFromSetttingName("Teams")) {
                var5.remove();
            }
        }

        String var8 = this.getStringSettingValueByName("Sort mode");
        switch (var8) {
            case "Range":
                Collections.sort(var4, new Class3610(this));
                break;
            case "Angle":
                Collections.sort(var4, new Class3592(this));
        }

        return var4;
    }
}
