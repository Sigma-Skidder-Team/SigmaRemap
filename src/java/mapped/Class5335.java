package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.util.Iterator;
import java.util.List;

public class Class5335 extends Class5325 {
    public Class5335() {
        super(ModuleCategory.COMBAT, "Aimbot", "Automatically aim at players", new Class5383(), new Class5345(), new Class5350());
        this.method15972(new Class6004("Players", "Aim at players", true));
        this.method15972(new Class6004("Animals/Monsters", "Aim at animals and monsters", false));
        this.method15972(new Class6004("Invisible", "Aim at invisible entites", true));
    }

    public Entity method16750(float var1) {
        List var4 = Class5628.method17708();
        Entity var5 = null;
        Iterator var6 = var4.iterator();

        while (var6.hasNext()) {
            Entity var7 = (Entity) var6.next();
            if (var7 != mc.field1339) {
                if (!Client.getInstance().getFriendManager().method26997(var7)) {
                    if (var7 instanceof Class880) {
                        if (((Class880) var7).method3042() != 0.0F) {
                            if (!(mc.field1339.method3275(var7) > var1)) {
                                if (mc.field1339.method3026((Class880) var7)) {
                                    if (!(var7 instanceof Class1005)) {
                                        if (!this.method15974("Players") && var7 instanceof PlayerEntity) {
                                            var6.remove();
                                        } else if (var7 instanceof PlayerEntity && Client.getInstance().getCombatManager().method29346(var7)) {
                                            var6.remove();
                                        } else if (!this.method15974("Invisible") && var7.method3342()) {
                                            var6.remove();
                                        } else if (!this.method15974("Animals/Monsters") && !(var7 instanceof PlayerEntity)) {
                                            var6.remove();
                                        } else if (mc.field1339.method3421() != null && mc.field1339.method3421().equals(var7)) {
                                            var6.remove();
                                        } else if (!var7.method3362()) {
                                            if (var7 instanceof PlayerEntity
                                                    && Class8781.method31662((PlayerEntity) var7)
                                                    && Client.getInstance().getModuleManager().method14662(Class5275.class).method15996()) {
                                                var6.remove();
                                            } else if (var5 == null || mc.field1339.method3275(var7) < mc.field1339.method3275(var5)) {
                                                var5 = var7;
                                            }
                                        } else {
                                            var6.remove();
                                        }
                                    } else {
                                        var6.remove();
                                    }
                                } else {
                                    var6.remove();
                                }
                            } else {
                                var6.remove();
                            }
                        } else {
                            var6.remove();
                        }
                    } else {
                        var6.remove();
                    }
                } else {
                    var6.remove();
                }
            } else {
                var6.remove();
            }
        }

        return var5;
    }
}
