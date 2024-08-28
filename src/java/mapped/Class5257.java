package mapped;

import com.google.common.collect.Lists;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class5257 extends PremiumModule {
    public ArrayList<Thread> field23644 = new ArrayList<Thread>();
    public Entity field23645;
    public Vector3d field23646;

    public Class5257(String var1, String var2, ModuleCategory var3) {
        super("FightBot", "Jello AI Fight Bot", ModuleCategory.WORLD);
    }

    @EventTarget
    public void method16419(Class4428 var1) {
        if (!this.method15996()) {
        }
    }

    public List<Entity> method16420() {
        ArrayList var3 = Lists.newArrayList(field23386.field1338.method6835());
        var3.remove(field23386.field1339);
        Iterator var4 = var3.iterator();

        while (var4.hasNext()) {
            Entity var5 = (Entity) var4.next();
            if (!(var5 instanceof PlayerEntity) || Client.getInstance().getCombatManager().method29346(var5)) {
                var4.remove();
            }
        }

        List var6 = Class9217.method34548(var3);
        return var6.size() <= 1 ? var6 : var6.subList(0, Math.min(3, var6.size() - 1));
    }
}
