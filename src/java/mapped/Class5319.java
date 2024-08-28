package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4402;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.util.ArrayList;
import java.util.List;

public class Class5319 extends Module {
    public static Class1116 field23863;
    public float field23866;
    public float field23867;
    private final List<Packet<?>> field23864 = new ArrayList<Packet<?>>();
    private Vector3d field23865;

    public Class5319() {
        super(ModuleCategory.PLAYER, "Blink", "Stops your packets to blink");
    }

    @Override
    public void isInDevelopment() {
        this.field23865 = new Vector3d(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ());
        this.field23866 = mc.player.field5031;
        this.field23867 = mc.player.field5032;
        field23863 = new Class1116(mc.world, mc.player.getGameProfile());
        field23863.field4902 = mc.player.field4902;
        field23863.method3269(this.field23865.field18048, this.field23865.field18049, this.field23865.field18050, this.field23866, this.field23867);
        field23863.field4967 = mc.player.field4967;
        mc.world.method6846(-1, field23863);
    }

    @Override
    public void method15965() {
        int var3 = this.field23864.size();

        for (int var4 = 0; var4 < var3; var4++) {
            mc.getClientPlayNetHandler().sendPacket(this.field23864.get(var4));
        }

        this.field23864.clear();
        mc.world.method6848(-1);
    }

    @EventTarget
    private void method16710(Class4402 var1) {
        if (this.method15996()) {
            if (mc.player != null && var1.method13932() instanceof CEntityActionPacket
                    || var1.method13932() instanceof Class5603
                    || var1.method13932() instanceof CUseEntityPacket
                    || var1.method13932() instanceof CAnimateHandPacket
                    || var1.method13932() instanceof Class5555) {
                this.field23864.add(var1.method13932());
                var1.method13900(true);
            }
        }
    }
}
