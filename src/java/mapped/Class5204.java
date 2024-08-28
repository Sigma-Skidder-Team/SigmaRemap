package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.util.List;

public class Class5204 extends Module {
    private float field23520;
    private float field23521;
    private int field23522 = 0;
    private int field23523 = 0;
    private int field23524;
    private int field23525;
    private double field23526;

    public Class5204() {
        super(ModuleCategory.MOVEMENT, "AAC", "Places block underneath if it is in hand");
        this.method15972(new Class6004("Haphe (AACAP)", "Never let's you touch the ground.", false));
    }

    @Override
    public void isInDevelopment() {
        this.field23523 = mc.field1339.field4902.field5443;
        this.field23520 = mc.field1339.field5031;
        this.field23521 = mc.field1339.field5032;
        this.field23522 = (int) mc.field1339.getPosY();
        this.field23525 = -1;
        ((BlockFly) this.method16004()).field23884 = -1;
    }

    @Override
    public void method15965() {
        if (this.field23523 != -1 && this.method16004().getStringSettingValueByName("ItemSpoof").equals("Switch")) {
            mc.field1339.field4902.field5443 = this.field23523;
        }

        this.field23523 = -1;
        if (((BlockFly) this.method16004()).field23884 >= 0) {
            mc.getClientPlayNetHandler().sendPacket(new Class5539(mc.field1339.field4902.field5443));
            ((BlockFly) this.method16004()).field23884 = -1;
        }

        mc.field1284.field40360 = 1.0F;
    }

    @EventTarget
    @LowerPriority
    public void method16202(Class4402 var1) {
        if (this.method15996() && mc.field1339 != null) {
            if (var1.method13932() instanceof Class5539 && ((BlockFly) this.method16004()).field23884 >= 0) {
                var1.method13900(true);
            }
        }
    }

    @EventTarget
    public void method16203(Class4396 var1) {
        if (this.method15996()) {
            Packet var4 = var1.method13898();
            if (var4 instanceof Class5473) {
                this.field23525 = 0;
            }
        }
    }

    @EventTarget
    public void method16204(Class4417 var1) {
        if (this.method15996()) {
            if (mc.field1339.field5036 && Client.getInstance().getModuleManager().method14662(Class5363.class).method15996()) {
                var1.method13966(true);
            }
        }
    }

    @EventTarget
    public void method16205(Class4435 var1) {
        if (this.method15996()) {
            if (this.method16004().method15974("No Sprint")) {
                mc.field1339.setSprinting(false);
            }

            if (!this.method15974("Haphe (AACAP)")) {
                mc.field1299.field44638.field13071 = false;
                mc.field1339.setSprinting(false);
            }

            ((BlockFly) this.method16004()).method16741(var1);
            if (this.method15974("Haphe (AACAP)")) {
                if (!mc.field1339.field5036 || mc.field1339.field4984 == 0.0F && mc.field1339.field4982 == 0.0F) {
                    if (this.field23524 >= 0) {
                        this.field23524++;
                    }
                } else {
                    this.field23524 = 0;
                    mc.field1339.method2914();
                    var1.method13995(0.419998 + (double) Class9567.method37079() * 0.1);
                    if (this.field23525 < 3) {
                        this.field23525++;
                    }
                }

                if (mc.field1339.field4984 == 0.0F && mc.field1339.field4982 == 0.0F || mc.field1339.field5037) {
                    this.field23525 = 0;
                }

                this.field23526 = Class5154.method16016(this.field23524, this.field23525, () -> this.field23525 = 0);
                if (this.field23524 >= 0) {
                    Class9567.method37088(var1, this.field23526);
                }
            }
        }
    }

    @EventTarget
    private void method16206(Class4423 var1) {
        if (this.method15996() && mc.field1338 != null && mc.field1339 != null) {
            if (this.method15974("Haphe (AACAP)") && Class9567.method37087() && !mc.field1339.method3337()) {
                var1.field21557 *= 1.14F;
            }
        }
    }

    private boolean method16207() {
        Class8711 var3 = (Class8711) Class9217.method34569(mc.field1339.field6122, mc.field1339.field6123, Class9217.method34560(), 0.0F);
        boolean var4 = false;
        if (var3 != null && var3.method31417() == Class2100.field13690) {
            if (this.method16004().getStringSettingValueByName("ItemSpoof").equals("None")) {
                BlockFly var10000 = (BlockFly) this.method16004();
                if (!BlockFly.method16733(mc.field1339.method3094(Hand.field182).method32107())) {
                    return false;
                }
            }

            if (this.method15974("Haphe (AACAP)") && !mc.field1339.field4981 && !mc.field1339.field5036) {
                if (var3.method31424() == Direction.field673) {
                    return false;
                }

                if (var3.method31423().getY() != this.field23522 - 1) {
                    return false;
                }
            }

            if (var3.method31424() == Direction.field673
                    && (double) (var3.method31423().getY() + 2) > mc.field1339.getPosY()
                    && Class9217.method34578(var3.method31423())) {
                return false;
            }

            if ((double) var3.method31423().getY() == mc.field1339.getPosY()) {
                return false;
            }

            ((BlockFly) this.method16004()).method16736();
            int var5 = mc.field1339.field4902.field5443;
            if (!this.method16004().getStringSettingValueByName("ItemSpoof").equals("None")) {
                ((BlockFly) this.method16004()).method16734();
            }

            Class2274 var6 = mc.field1337.method23139(mc.field1339, mc.field1338, Hand.field182, var3);
            if (this.method16004().getStringSettingValueByName("ItemSpoof").equals("Spoof") || this.method16004().getStringSettingValueByName("ItemSpoof").equals("LiteSpoof")) {
                mc.field1339.field4902.field5443 = var5;
            }

            if (var6 == Class2274.field14818) {
                if (!this.method16004().method15974("NoSwing")) {
                    mc.field1339.swingArm(Hand.field182);
                } else {
                    mc.getClientPlayNetHandler().sendPacket(new CAnimateHandPacket(Hand.field182));
                }

                if (var3.method31424() == Direction.field673) {
                    this.field23522 = var3.method31423().getY() + 2;
                }

                var4 = true;
            }
        }

        return var4;
    }

    public List<Class9238> method16208(Block var1, BlockPos var2) {
        return Class9291.method35030(var1, var2, (int) mc.field1337.method23135());
    }

    @EventTarget
    public void method16209(Class4422 var1) {
        if (this.method15996()) {
            if (!this.method15974("Haphe (AACAP)")) {
            }
        }
    }

    @EventTarget
    @LowestPriority
    private void method16210(Class4399 var1) {
        if (this.method15996()) {
            if (!var1.method13921()) {
                if (Class9567.method37087() && mc.field1339.field5036 && this.method15974("Haphe (AACAP)") && !mc.field1339.field4981) {
                    mc.field1339.method2914();
                }

                if (!this.method15974("Haphe (AACAP)")) {
                    if (!this.method16207()) {
                        float var11 = 0.0F;

                        while (var11 < 0.7F && !this.method16207()) {
                            var11 += 0.1F;
                        }
                    }
                } else {
                    this.method16207();
                }
            } else {
                double var4 = mc.field1339.getPosY();
                if (!mc.field1339.field4981 && this.method15974("Haphe (AACAP)")) {
                    var4 = this.field23522;
                }

                BlockPos var6 = new BlockPos(mc.field1339.getPosX(), (double) Math.round(var4 - 1.0), mc.field1339.getPosZ());
                List var7 = this.method16208(Blocks.STONE, var6);
                if (!var7.isEmpty()) {
                    Class9238 var8 = (Class9238) var7.get(var7.size() - 1);
                    Class8711 var9 = Class9217.method34567(this.field23520, this.field23521, 5.0F);
                    if (!var9.method31423().equals(var8.field42516) || !var9.method31424().equals(var8.field42517)) {
                        float[] var10 = Class9217.method34543(var8.field42516, var8.field42517);
                        this.field23520 = Class9217.method34543(var8.field42516, var8.field42517)[0];
                        this.field23521 = Class9217.method34543(var8.field42516, var8.field42517)[1];
                    }
                }

                var1.method13916(this.field23521);
                var1.method13918(this.field23520);
            }
        }
    }

    @EventTarget
    public void method16211(Class4436 var1) {
        if (this.method15996()) {
            if (this.method16004().getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
                    && (!Class5628.method17686() || this.method16004().method15974("Tower while moving"))) {
                var1.method13900(true);
            }
        }
    }
}
