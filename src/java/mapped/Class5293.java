package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.entity.Entity;

public class Class5293 extends Module {
    public Class5293() {
        super(ModuleCategory.RENDER, "Vanilla", "Draws a line arround players");
    }

    @EventTarget
    public void method16625(TickEvent var1) {
        if (this.isEnabled()) {
            for (Entity var5 : mc.world.method6835()) {
                if (!Client.getInstance().getCombatManager().method29346(var5)) {
                    boolean var6 = Class5628.method17744(var5) == Class2258.field14690 && this.method16004().getBooleanValueFromSetttingName("Show Players");
                    boolean var7 = Class5628.method17744(var5) == Class2258.field14689 && this.method16004().getBooleanValueFromSetttingName("Show Mobs");
                    boolean var8 = Class5628.method17744(var5) == Class2258.field14691 && this.method16004().getBooleanValueFromSetttingName("Show Passives");
                    boolean var9 = !var5.method3342() || this.method16004().getBooleanValueFromSetttingName("Show Invisibles");
                    var5.method3341((var7 || var6 || var8) && var9 && var5 != mc.player);
                }
            }
        }
    }

    @Override
    public void onDisable() {
        for (Entity var4 : mc.world.method6835()) {
            var4.method3341(false);
        }
    }
}
