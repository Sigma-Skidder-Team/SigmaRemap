package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class Class5223 extends Module {
    private BlockPos field23566;
    private List<BlockPos> field23567;

    public Class5223() {
        super(ModuleCategory.WORLD, "Nuker", "Destroys blocks around you");
        this.method15972(new Class6009<Float>("Range", "Range value for nuker", 6.0F, Float.class, 2.0F, 10.0F, 1.0F));
        this.method15972(new Class6005("Mode", "Mode", 0, "All", "One hit", "Bed", "Egg"));
        this.method15972(new Class6004("NoSwing", "Removes the swing animation.", false));
        this.method15972(new Class6003("Blocks", "Blocks to destroy", true));
        this.method15972(new Class6010("Color", "The rendered block color", Class1979.field12899.field12910, true));
    }

    public static void method16265(BlockPos var0) {
        mc.getClientPlayNetHandler().sendPacket(new Class5492(Class2070.field13484, var0, Direction.field673));
        mc.getClientPlayNetHandler().sendPacket(new Class5492(Class2070.field13486, var0, Direction.field673));
        mc.world.method6730(var0, Blocks.AIR.method11579());
    }

    @EventTarget
    private void method16263(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            this.field23567 = this.method16267(this.method15977("Range") / 2.0F);
            if (this.field23567.isEmpty()) {
                this.field23566 = null;
            } else if (mc.field1337.method23157() != Class1894.field11103) {
                if (this.field23566 != null) {
                    if (mc.world.method6738(this.field23566).method23393()
                            || Math.sqrt(
                            mc.player
                                    .method3276(
                                            (double) this.field23566.method8304() + 0.5,
                                            (double) this.field23566.getY() + 0.5,
                                            (double) this.field23566.method8306() + 0.5
                                    )
                    )
                            > 6.0) {
                        this.field23566 = this.field23567.get(0);
                    }

                    float[] var4 = Class9142.method34144(
                            (double) this.field23566.method8304(), (double) this.field23566.method8306(), (double) this.field23566.getY()
                    );
                    var1.method13918(var4[0]);
                    var1.method13916(var4[1]);
                    Class4430 var5 = new Class4430(0, false, this.field23566);
                    Client.getInstance().getEventManager().call(var5);
                    mc.field1337.method23134(this.field23566, Class9217.method34580(this.field23566));
                    if (!this.method15974("NoSwing")) {
                        mc.player.swingArm(Hand.field182);
                    } else {
                        mc.getClientPlayNetHandler().sendPacket(new CAnimateHandPacket(Hand.field182));
                    }
                } else {
                    this.field23566 = this.field23567.get(0);
                    float[] var6 = Class9142.method34144(
                            (double) this.field23566.method8304() + 0.5, (double) this.field23566.method8306(), (double) this.field23566.getY() + 0.5
                    );
                    var1.method13918(var6[0]);
                    var1.method13916(var6[1]);
                    Class4430 var8 = new Class4430(0, false, this.field23566);
                    Client.getInstance().getEventManager().call(var8);
                    mc.field1337.method23134(this.field23566, Class9217.method34580(this.field23566));
                    if (!this.method15974("NoSwing")) {
                        mc.player.swingArm(Hand.field182);
                    } else {
                        mc.getClientPlayNetHandler().sendPacket(new CAnimateHandPacket(Hand.field182));
                    }
                }
            } else {
                for (BlockPos var9 : this.field23567) {
                    mc.getClientPlayNetHandler().sendPacket(new Class5492(Class2070.field13484, var9, Class9217.method34580(var9)));
                    if (!this.method15974("NoSwing")) {
                        mc.player.swingArm(Hand.field182);
                    } else {
                        mc.getClientPlayNetHandler().sendPacket(new CAnimateHandPacket(Hand.field182));
                    }
                }
            }
        }
    }

    @EventTarget
    public void method16264(Class4420 var1) {
        if (this.field23566 != null && !mc.world.method6738(this.field23566).method23393()) {
            int var4 = Class5628.method17688(this.method15976("Color"), 0.4F);
            GL11.glPushMatrix();
            GL11.glDisable(2929);
            double var5 = (double) this.field23566.method8304() - mc.gameRenderer.getActiveRenderInfo().method37504().method11320();
            double var7 = (double) this.field23566.getY() - mc.gameRenderer.getActiveRenderInfo().method37504().method11321();
            double var9 = (double) this.field23566.method8306() - mc.gameRenderer.getActiveRenderInfo().method37504().method11322();
            Class6488 var11 = mc.world.method6738(this.field23566).method23414(mc.world, this.field23566).method19514();
            Class9388 var12 = new Class9388(
                    var5 + var11.field28449,
                    var7 + var11.field28450,
                    var9 + var11.field28451,
                    var5 + var11.field28452,
                    var7 + var11.field28453,
                    var9 + var11.field28454
            );
            Class3192.method11459(var12, var4);
            GL11.glEnable(2929);
            GL11.glPopMatrix();
        }
    }

    private boolean method16266(BlockPos var1) {
        Block var4 = mc.world.method6738(var1).method23383();
        return mc.world.method6738(var1).method23384().method31089() || var4 instanceof Class3194;
    }

    private List<BlockPos> method16267(float var1) {
        ArrayList var4 = new ArrayList();

        for (float var5 = var1 + 2.0F; var5 >= -var1 + 1.0F; var5--) {
            for (float var6 = -var1; var6 <= var1; var6++) {
                for (float var7 = -var1; var7 <= var1; var7++) {
                    BlockPos var8 = new BlockPos(
                            mc.player.getPosX() + (double) var6,
                            mc.player.getPosY() + (double) var5,
                            mc.player.getPosZ() + (double) var7
                    );
                    if (!mc.world.method6738(var8).method23393()
                            && mc.world.method6738(var8).method23449().method23474()
                            && Math.sqrt(
                            mc.player.method3276((double) var8.method8304() + 0.5, (double) var8.getY() + 0.5, (double) var8.method8306() + 0.5)
                    )
                            < (double) var1) {
                        String var9 = this.getStringSettingValueByName("Mode");
                        switch (var9) {
                            case "One hit":
                                if (!this.method16266(var8)) {
                                    continue;
                                }
                                break;
                            case "Bed":
                                if (!(mc.world.method6738(var8).method23383() instanceof Class3250)) {
                                    continue;
                                }
                                break;
                            case "Egg":
                                if (!(mc.world.method6738(var8).method23383() instanceof Class3214)) {
                                    continue;
                                }
                        }

                        var4.add(var8);
                    }
                }
            }
        }

        return var4;
    }
}
