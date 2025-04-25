// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.blockflys;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.mods.impl.movement.SafeWalk;
import com.mentalfrostbyte.jello.mods.impl.movement.speeds.AACSpeed;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

import java.util.List;

public class AACBlockFly extends Module
{
    private float field15650;
    private float field15651;
    private int field15652;
    private int field15653;
    private int field15654;
    private int field15655;
    private double field15656;
    
    public AACBlockFly() {
        super(Category.MOVEMENT, "AAC", "Places block underneath if it is in hand");
        this.field15652 = 0;
        this.field15653 = 0;
        this.addSetting(new BooleanSetting("Haphe (AACAP)", "Never let's you touch the ground.", false));
    }
    
    @Override
    public void onEnable() {
        this.field15653 = AACBlockFly.mc.player.inventory.field2743;
        this.field15650 = AACBlockFly.mc.player.rotationYaw;
        this.field15651 = AACBlockFly.mc.player.rotationPitch;
        this.field15652 = (int) AACBlockFly.mc.player.posY;
        this.field15655 = -1;
        ((BlockFly)this.method9914()).field15750 = -1;
    }
    
    @Override
    public void onDisable() {
        if (this.field15653 != -1) {
            if (this.method9914().getStringSettingValueByName("ItemSpoof").equals("Switch")) {
                AACBlockFly.mc.player.inventory.field2743 = this.field15653;
            }
        }
        this.field15653 = -1;
        if (((BlockFly)this.method9914()).field15750 >= 0) {
            AACBlockFly.mc.method5269().method17292(new Class4321(AACBlockFly.mc.player.inventory.field2743));
            ((BlockFly)this.method9914()).field15750 = -1;
        }
        AACBlockFly.mc.timer.timerSpeed = 1.0f;
    }
    
    @EventListener
    @Class6759
    public void method10098(final Class5721 class5721) {
        if (this.isEnabled() && AACBlockFly.mc.player != null) {
            if (class5721.method16990() instanceof Class4321) {
                if (((BlockFly)this.method9914()).field15750 >= 0) {
                    class5721.setCancelled(true);
                }
            }
        }
    }
    
    @EventListener
    public void method10099(final Class5723 class5723) {
        if (this.isEnabled()) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15655 = 0;
            }
        }
    }
    
    @EventListener
    public void method10100(final Class5738 class5738) {
        if (this.isEnabled()) {
            if (AACBlockFly.mc.player.onGround) {
                if (Client.getInstance().moduleManager().getModuleByClass(SafeWalk.class).isEnabled()) {
                    class5738.method17026(true);
                }
            }
        }
    }
    
    @EventListener
    public void method10101(final Class5717 class5717) {
        if (!this.isEnabled()) {
            return;
        }
        if (this.method9914().method9883("No Sprint")) {
            AACBlockFly.mc.player.method1816(false);
        }
        if (!this.method9883("Haphe (AACAP)")) {
            AACBlockFly.mc.gameSettings.field23441.field2162 = false;
            AACBlockFly.mc.player.method1816(false);
        }
        ((BlockFly)this.method9914()).method10287(class5717);
        if (this.method9883("Haphe (AACAP)")) {
            if (AACBlockFly.mc.player.onGround && (AACBlockFly.mc.player.field2970 != 0.0f || AACBlockFly.mc.player.field2968 != 0.0f)) {
                this.field15654 = 0;
                AACBlockFly.mc.player.method2725();
                class5717.method16975(0.419998 + Class7482.method23140() * 0.1);
                if (this.field15655 < 3) {
                    ++this.field15655;
                }
            }
            else if (this.field15654 >= 0) {
                ++this.field15654;
            }
            if ((AACBlockFly.mc.player.field2970 == 0.0f && AACBlockFly.mc.player.field2968 == 0.0f) || AACBlockFly.mc.player.collidedHorizontally) {
                this.field15655 = 0;
            }
            this.field15656 = AACSpeed.method10174(this.field15654, this.field15655, () -> this.field15655 = 0);
            if (this.field15654 >= 0) {
                Class7482.method23149(class5717, this.field15656);
            }
        }
    }
    
    @EventListener
    private void method10102(final Class5735 class5735) {
        if (this.isEnabled()) {
            if (AACBlockFly.mc.world != null) {
                if (AACBlockFly.mc.player != null) {
                    if (this.method9883("Haphe (AACAP)")) {
                        if (Class7482.method23148()) {
                            if (!AACBlockFly.mc.player.method1815()) {
                                class5735.field23300 *= 1.14f;
                            }
                        }
                    }
                }
            }
        }
    }
    
    private boolean method10103() {
        final BlockRayTraceResult blockRayTraceResult = (BlockRayTraceResult)Class4609.method13699(AACBlockFly.mc.player.field4077, AACBlockFly.mc.player.field4078, Class4609.method13690(), 0.0f);
        boolean b = false;
        if (blockRayTraceResult != null) {
            if (blockRayTraceResult.getType() == RayTraceResult.Type.BLOCK) {
                if (this.method9914().getStringSettingValueByName("ItemSpoof").equals("None")) {
                    final BlockFly class7006 = (BlockFly)this.method9914();
                    if (!BlockFly.method10279(AACBlockFly.mc.player.method2715(Class316.field1877).getItem())) {
                        return false;
                    }
                }
                if (this.method9883("Haphe (AACAP)")) {
                    if (!AACBlockFly.mc.player.field2967) {
                        if (!AACBlockFly.mc.player.onGround) {
                            if (blockRayTraceResult.getFace() == Direction.UP) {
                                return false;
                            }
                            if (blockRayTraceResult.getPos().getY() != this.field15652 - 1) {
                                return false;
                            }
                        }
                    }
                }
                if (blockRayTraceResult.getFace() == Direction.UP) {
                    if (blockRayTraceResult.getPos().getY() + 2 > AACBlockFly.mc.player.posY) {
                        if (Class4609.method13708(blockRayTraceResult.getPos())) {
                            return false;
                        }
                    }
                }
                if (blockRayTraceResult.getPos().getY() == AACBlockFly.mc.player.posY) {
                    return false;
                }
                ((BlockFly)this.method9914()).method10282();
                final int field2743 = AACBlockFly.mc.player.inventory.field2743;
                if (!this.method9914().getStringSettingValueByName("ItemSpoof").equals("None")) {
                    ((BlockFly)this.method9914()).method10280();
                }
                final Class2201 method27319 = AACBlockFly.mc.playerController.method27319(AACBlockFly.mc.player, AACBlockFly.mc.world, Class316.field1877, blockRayTraceResult);
                if (this.method9914().getStringSettingValueByName("ItemSpoof").equals("Spoof") || this.method9914().getStringSettingValueByName("ItemSpoof").equals("LiteSpoof")) {
                    AACBlockFly.mc.player.inventory.field2743 = field2743;
                }
                if (method27319 == Class2201.field13400) {
                    if (!this.method9914().method9883("NoSwing")) {
                        AACBlockFly.mc.player.method2707(Class316.field1877);
                    }
                    else {
                        AACBlockFly.mc.method5269().method17292(new Class4380(Class316.field1877));
                    }
                    if (blockRayTraceResult.getFace() == Direction.UP) {
                        this.field15652 = blockRayTraceResult.getPos().getY() + 2;
                    }
                    b = true;
                }
            }
        }
        return b;
    }
    
    public List<Class9052> method10104(final Block class3833, final BlockPos class3834) {
        return Class8582.method29051(class3833, class3834, (int) AACBlockFly.mc.playerController.method27315());
    }
    
    @EventListener
    public void method10105(final Class5741 class5741) {
        if (!this.isEnabled()) {
            return;
        }
        if (this.method9883("Haphe (AACAP)")) {
            return;
        }
    }
    
    @EventListener
    @Class6755
    private void method10106(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.isEnabled()) {
            if (!updateWalkingEvent.method17046()) {
                if (Class7482.method23148()) {
                    if (AACBlockFly.mc.player.onGround) {
                        if (this.method9883("Haphe (AACAP)")) {
                            if (!AACBlockFly.mc.player.field2967) {
                                AACBlockFly.mc.player.method2725();
                            }
                        }
                    }
                }
                if (!this.method9883("Haphe (AACAP)")) {
                    if (!this.method10103()) {
                        for (float n = 0.0f; n < 0.7f; n += 0.1f) {
                            if (this.method10103()) {
                                break;
                            }
                        }
                    }
                }
                else {
                    this.method10103();
                }
            }
            else {
                double field2396 = AACBlockFly.mc.player.posY;
                if (!AACBlockFly.mc.player.field2967) {
                    if (this.method9883("Haphe (AACAP)")) {
                        field2396 = this.field15652;
                    }
                }
                final List<Class9052> method10104 = this.method10104(Blocks.STONE, new BlockPos(AACBlockFly.mc.player.posX, (double)Math.round(field2396 - 1.0), AACBlockFly.mc.player.posZ));
                if (!method10104.isEmpty()) {
                    final Class9052 class5745 = method10104.get(method10104.size() - 1);
                    final BlockRayTraceResult method10105 = Class4609.method13697(this.field15650, this.field15651, 5.0f);
                    if (!method10105.getPos().equals(class5745.field38320) || !method10105.getFace().equals(class5745.field38321)) {
                        Class4609.method13673(class5745.field38320, class5745.field38321);
                        this.field15650 = Class4609.method13673(class5745.field38320, class5745.field38321)[0];
                        this.field15651 = Class4609.method13673(class5745.field38320, class5745.field38321)[1];
                    }
                }
                updateWalkingEvent.method17041(this.field15651);
                updateWalkingEvent.method17043(this.field15650);
            }
        }
    }
    
    @EventListener
    public void method10107(final Class5722 class5722) {
        if (this.isEnabled()) {
            if (this.method9914().getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Cubecraft")) {
                if (!ColorUtils.method19114() || this.method9914().method9883("Tower while moving")) {
                    class5722.setCancelled(true);
                }
            }
        }
    }
}
