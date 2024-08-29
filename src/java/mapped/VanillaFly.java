package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4426;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class VanillaFly extends Module {
    private boolean field23995;
    private int field23996;

    public VanillaFly() {
        super(ModuleCategory.MOVEMENT, "Vanilla", "Regular vanilla fly");
        this.registerSetting(new NumberSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.28F, 10.0F, 0.01F));
        this.registerSetting(new BooleanSetting("Kick bypass", "Bypass vanilla kick for flying", true));
    }

    @Override
    public void onEnable() {
        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
                this.field23995 = false;
            }
        } else {
            mc.gameSettings.keyBindSneak.field13071 = false;
            this.field23995 = true;
        }
    }

    @Override
    public void onDisable() {
        Class5628.method17725(-0.08);
        double var3 = Class9567.method37075();
        Class9567.method37090(var3);
        if (this.field23995) {
            mc.gameSettings.keyBindSneak.field13071 = true;
        }
    }

    @EventTarget
    private void method16916(Class4430 var1) {
        if (this.isEnabled()) {
            if (var1.method13977() == mc.gameSettings.keyBindSneak.field13070.field34875) {
                var1.method13900(true);
                this.field23995 = true;
            }
        }
    }

    @EventTarget
    private void method16917(Class4426 var1) {
        if (this.isEnabled()) {
            if (var1.method13973() == mc.gameSettings.keyBindSneak.field13070.field34875) {
                var1.method13900(true);
                this.field23995 = false;
            }
        }
    }

    @EventTarget
    public void method16918(Class4399 var1) {
        if (this.isEnabled()) {
            if (!mc.player.onGround && this.getBooleanValueFromSetttingName("Kick bypass")) {
                if (this.field23996 > 0 && this.field23996 % 30 == 0 && !Class5628.method17730(mc.player, 0.01F)) {
                    if (Class8005.method27349() != Class5989.field26129.method18582()) {
                        var1.method13912(var1.method13911() - 0.04);
                    } else {
                        double var4 = this.method16920();
                        if (var4 < 0.0) {
                            return;
                        }

                        double var6 = var1.method13911();
                       List<Double> var8 = new ArrayList();
                        if (!(var6 - var4 > 9.0)) {
                            mc.getConnection().sendPacket(new Class5605(var1.method13909(), var4, var1.method13913(), true));
                        } else {
                            while (var6 > var4 + 9.0) {
                                var6 -= 9.0;
                                var8.add(var6);
                                mc.getConnection().sendPacket(new Class5605(var1.method13909(), var6, var1.method13913(), true));
                            }

                            for (Double var10 : var8) {
                                mc.getConnection().sendPacket(new Class5605(var1.method13909(), var10, var1.method13913(), true));
                            }

                            mc.getConnection().sendPacket(new Class5605(var1.method13909(), var4, var1.method13913(), true));
                            Collections.reverse(var8);

                            for (Double var12 : var8) {
                                mc.getConnection().sendPacket(new Class5605(var1.method13909(), var12, var1.method13913(), true));
                            }

                            mc.getConnection().sendPacket(new Class5605(var1.method13909(), var1.method13911(), var1.method13913(), true));
                        }

                        this.field23996 = 0;
                    }
                }
            }
        }
    }

    @EventTarget
    public void method16919(Class4435 var1) {
        if (this.isEnabled()) {
            if (!Class5628.method17730(mc.player, 0.01F)) {
                this.field23996++;
            } else {
                this.field23996 = 0;
            }

            double var4 = this.getNumberValueBySettingName("Speed");
            double var6 = !mc.gameSettings.field44636.field13071 ? 0.0 : var4 / 2.0;
            if (mc.gameSettings.field44636.field13071 && mc.gameSettings.keyBindSneak.field13071) {
                var6 = 0.0;
            } else if (!this.field23995) {
                if (mc.gameSettings.field44636.field13071) {
                    var6 = var4 / 2.0;
                }
            } else {
                var6 = -var4 / 2.0;
            }

            Class9567.method37088(var1, var4);
            var1.method13995(var6);
            Class5628.method17725(var1.method13994());
        }
    }

    private double method16920() {
        if (!(mc.player.getPositionVec().field18049 < 1.0)) {
            if (!mc.player.onGround) {
                AxisAlignedBB var3 = mc.player.boundingBox.method19662(0.0, -mc.player.getPositionVec().field18049, 0.0);
                Iterator var4 = mc.world.method7055(mc.player, var3).iterator();
                double var5 = -1.0;

                while (var4.hasNext()) {
                    VoxelShape var7 = (VoxelShape) var4.next();
                    if (var7.method19514().field28453 > var5) {
                        var5 = var7.method19514().field28453;
                    }
                }

                return var5;
            } else {
                return mc.player.getPosY();
            }
        } else {
            return -1.0;
        }
    }
}
