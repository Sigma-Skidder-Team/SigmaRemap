package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4398;
import com.mentalfrostbyte.jello.event.impl.Class4404;
import com.mentalfrostbyte.jello.event.impl.Class4425;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5307 extends Module {
    private int field23843;
    private double field23844;

    public Class5307() {
        super(ModuleCategory.MOVEMENT, "Unfull", "Weird Hypixel VClip for some blocks");
    }

    @EventTarget
    private void method16680(Class4404 var1) {
        if (this.isEnabled()) {
            if ((int) mc.player.getPosY() == this.field23843 && !mc.player.field4981) {
                Class5628.method17725(-2.0);
            }

            if (mc.player.getPosY() > (double) this.field23843 && mc.player.field4981 && !mc.player.method3331()) {
                this.field23843++;
            }

            if (mc.player.getPosY() % 1.0 == 0.0 && mc.player.method3331()) {
                this.field23843--;
            }
        }
    }

    @EventTarget
    private void method16681(Class4398 var1) {
        if (this.isEnabled()) {
            if (var1.method13903() != null && var1.method13902().getY() == this.field23843 - 1
                    || var1.method13902().getY() == this.field23843
                    || var1.method13902().getY() == this.field23843 + 1 && mc.world.getBlockState(var1.method13902()).getBlock() instanceof Class3208
                    || mc.world.getBlockState(var1.method13902()).getBlock() instanceof Class3465
                    || mc.world.getBlockState(var1.method13902()).getBlock() instanceof Class3421
                    || mc.world.getBlockState(var1.method13902()).getBlock() instanceof Class3415
                    || mc.world.getBlockState(var1.method13902()).getBlock() instanceof Class3377) {
                var1.method13905(null);
            }
        }
    }

    @EventTarget
    private void method16682(Class4425 var1) {
        if (this.isEnabled()) {
            var1.method13900(true);
        }
    }

    @Override
    public void onEnable() {
        this.field23843 = (int) mc.player.getPosY();
        this.field23844 = (double) this.field23843 - mc.player.getPosY();
    }
}
