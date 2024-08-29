package mapped;

import com.google.common.collect.Lists;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class5201 extends Module {
    public Entity field23513;
    public Vector3d field23514;
    public Thread field23515;
    public boolean field23516 = false;
    private List<Class9510> field23512;

    public Class5201() {
        super(ModuleCategory.MISC, "JelloAIBot", "Experimental");
    }

    @Override
    public void onDisable() {
        Client.getInstance().method19950().method31738();
        this.field23515 = null;
    }

    public Entity method16193() {
        ArrayList var3 = Lists.newArrayList(mc.world.method6835());
        var3.remove(mc.player);
        Iterator var4 = var3.iterator();

        while (var4.hasNext()) {
            Entity var5 = (Entity) var4.next();
            if (!(var5 instanceof PlayerEntity) || Client.getInstance().getCombatManager().method29346(var5) || !Class5628.method17730(var5, 2.0F)) {
                var4.remove();
            }
        }

        List var6 = Class9217.method34548(var3);
        return var6.size() != 0 ? (Entity) var6.get(0) : null;
    }

    public boolean method16194() {
        return this.field23513 == null || this.field23513.positionVec.method11341(this.field23514) > 6.0;
    }

    @EventTarget
    public void method16195(TickEvent var1) {
        if (mc.player != null) {
            if (mc.player.ticksExisted % 14 == 0) {
                Entity var4 = this.method16193();
                if (this.field23515 == null
                        && (this.field23512 == null || this.field23512.isEmpty() || (var4 != this.field23513 || this.method16194()) && var4 != null)) {
                    this.field23515 = new Thread(() -> {
                        Class5628.method17678("calc");
                        this.field23516 = true;

                        try {
                            Class9823 var4x = new Class9823();
                            Class9510 var5 = new Class9510(new Class9110(mc.player.getPosition()));
                            Class7860 var6 = new Class7860(this.field23513 = var4);
                            this.field23514 = this.field23513.positionVec;
                            Class7267 var7 = new Class7267(var5, var6);
                            var7.field31173 = true;
                            var7.field31176 = 310;
                            var7.field31170 = 20000;
                            var7.field31174 = true;
                            var7.field31175 = true;
                            this.field23512 = var4x.method38776(var7);
                            Client.getInstance().method19950().method31739(this.field23512);
                            this.field23515 = null;
                            Class5628.method17678("calc" + this.field23512.size());
                        } catch (Exception var8) {
                            var8.printStackTrace();
                            this.field23515 = null;
                        }
                    });
                    this.field23515.start();
                }
            }
        }
    }
}
