package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5180 extends Module {
    public Class5180() {
        super(ModuleCategory.MISC, "NickNameDetector", "Detect if a player has a custom name");
    }

    @EventTarget
    private void method16125(Class4428 var1) {
        if (this.method15996()) {
            for (Entity var5 : Class5628.method17680()) {
                if (!Client.getInstance().getCombatManager().method29346(var5) && var5.field5055 > 30 && var5.method3381()) {
                    Class5628.method17678(var5.method2941().getUnformattedComponentText() + " might have a custom nametag");
                }
            }
        }
    }
}
