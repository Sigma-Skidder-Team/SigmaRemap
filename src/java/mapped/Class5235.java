package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class5235 extends Module {
    public static BlockPos field23588;

    public Class5235() {
        super(ModuleCategory.WORLD, "CakeEater", "Automatically eats cake");
        this.method15972(new Class6004("No Swing", "Removes the swing animation.", true));
        this.method15972(new Class6004("Mineplex", "Mineplex mode.", true));
    }

    // $VF: synthetic method
    public static Minecraft method16322() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16323() {
        return mc;
    }

    @Override
    public void method15965() {
        field23588 = null;
    }

    @EventTarget
    private void method16319(Class4396 var1) {
        if (this.method15996()) {
            if (var1.method13898() instanceof SChatPacket) {
                SChatPacket var4 = (SChatPacket) var1.method13898();
                if (var4.method17648().getString().equals("§9Game> §r§7You cannot eat your own cake!§r")) {
                    var1.method13900(true);
                }
            }
        }
    }

    @EventTarget
    @HigherPriority
    private void method16320(Class4399 var1) {
        if (this.method15996()) {
            Class5325 var4 = (Class5325) Client.getInstance().getModuleManager().method14662(Fly.class);
            if (var4.method16726() instanceof MineplexFly) {
                MineplexFly var5 = (MineplexFly) var4.method16726();
                if (var5.method16456()) {
                    return;
                }
            }

            if (!var1.method13921()) {
                if (field23588 != null) {
                    if (this.method15974("No Swing") && !this.method15974("Mineplex")) {
                        mc.getClientPlayNetHandler().sendPacket(new CAnimateHandPacket(Hand.field182));
                    } else if (!this.method15974("No Swing")) {
                        mc.player.swingArm(Hand.field182);
                    }

                    Class8711 var7 = new Class8711(
                            new Vector3d(
                                    (double) field23588.method8304() + 0.4 + Math.random() * 0.2,
                                    (double) field23588.getY() + 0.5,
                                    (double) field23588.method8306() + 0.4 + Math.random() * 0.2
                            ),
                            Direction.field673,
                            field23588,
                            false
                    );
                    mc.getClientPlayNetHandler().sendPacket(new Class5570(Hand.field182, var7));
                }
            } else {
                List var8 = this.method16321(!this.method15974("Mineplex") ? mc.field1337.method23135() : 6.0F);
                if (var8.isEmpty()) {
                    field23588 = null;
                } else {
                    Collections.sort(var8, new Class3593(this));
                    field23588 = (BlockPos) var8.get(0);
                    if (!this.method15974("Mineplex")) {
                        float[] var6 = Class9142.method34144(
                                (double) field23588.method8304() + 0.5, (double) field23588.method8306() + 0.5, field23588.getY()
                        );
                        var1.method13918(var6[0]);
                        var1.method13916(var6[1]);
                    }
                }
            }
        }
    }

    private List<BlockPos> method16321(float var1) {
        ArrayList var4 = new ArrayList();

        for (float var5 = var1 + 2.0F; var5 >= -var1 + 1.0F; var5--) {
            for (float var6 = -var1; var6 <= var1; var6++) {
                for (float var7 = -var1; var7 <= var1; var7++) {
                    BlockPos var8 = new BlockPos(
                            mc.player.getPosX() + (double) var6,
                            mc.player.getPosY() + (double) var5,
                            mc.player.getPosZ() + (double) var7
                    );
                    if (mc.world.method6738(var8).method23383() instanceof Class3394
                            && Math.sqrt(
                            mc.player.method3276((double) var8.method8304() + 0.5, (double) var8.getY() + 0.5, (double) var8.method8306() + 0.5)
                    )
                            < (double) var1) {
                        var4.add(var8);
                    }
                }
            }
        }

        return var4;
    }
}