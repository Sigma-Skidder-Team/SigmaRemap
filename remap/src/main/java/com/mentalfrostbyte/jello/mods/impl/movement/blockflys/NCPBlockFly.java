// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.blockflys;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.mods.impl.movement.SafeWalk;
import com.mentalfrostbyte.jello.mods.impl.movement.Fly;
import com.mentalfrostbyte.jello.mods.impl.movement.Speed;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class NCPBlockFly extends Module
{
    private float field15621;
    private float field15622;
    private Class9301 field15623;
    private int field15624;
    private int field15625;
    private int field15626;
    private Class316 field15627;
    private BlockFly field15628;
    private boolean field15629;
    private boolean field15630;
    private double field15631;
    
    public NCPBlockFly() {
        super(Category.MOVEMENT, "NCP", "Places block underneath");
        this.field15624 = -1;
        this.field15628 = null;
        this.field15630 = false;
        this.addSetting(new StringSetting("Speed Mode", "Speed mode", 0, new String[] { "None", "Jump", "AAC", "Cubecraft", "Slow", "Sneak" }));
        this.addSetting(new BooleanSetting("KeepRotations", "Keeps your rotations.", true));
        this.addSetting(new NumberSetting("Extend", "Extend value", 0.0f, Float.class, 0.0f, 6.0f, 0.1f));
        this.addSetting(new BooleanSetting("Downwards", "Allows you to go down when sneaking.", true));
    }
    
    @Override
    public void initialize() {
        this.field15628 = (BlockFly)this.method9914();
    }
    
    @Override
    public void onEnable() {
        this.field15624 = NCPBlockFly.mc.player.inventory.field2743;
        final float n = 999.0f;
        this.field15621 = n;
        this.field15622 = n;
        ((BlockFly)this.method9914()).field15750 = -1;
        if (NCPBlockFly.mc.gameSettings.field23440.method1056()) {
            if (this.getBooleanValueFromSettingName("Downwards")) {
                NCPBlockFly.mc.gameSettings.field23440.field2162 = false;
                this.field15629 = true;
            }
        }
        if (!NCPBlockFly.mc.gameSettings.field23440.method1056()) {
            this.field15629 = false;
        }
        this.field15631 = -1.0;
        this.field15630 = false;
        if (NCPBlockFly.mc.player.onGround) {
            this.field15631 = NCPBlockFly.mc.player.posY;
        }
        this.field15626 = -1;
    }
    
    @Override
    public void onDisable() {
        if (this.field15624 != -1) {
            if (this.method9914().getStringSettingValueByName("ItemSpoof").equals("Switch")) {
                NCPBlockFly.mc.player.inventory.field2743 = this.field15624;
            }
        }
        this.field15624 = -1;
        if (((BlockFly)this.method9914()).field15750 >= 0) {
            NCPBlockFly.mc.method5269().method17292(new Class4321(NCPBlockFly.mc.player.inventory.field2743));
            ((BlockFly)this.method9914()).field15750 = -1;
        }
        MovementUtil.method23151(MovementUtil.method23136() * 0.9);
        NCPBlockFly.mc.timer.timerSpeed = 1.0f;
        if (this.getStringSettingValueByName("Speed Mode").equals("Cubecraft")) {
            if (this.field15626 == 0) {
                ColorUtils.method19155(-0.0789);
            }
        }
    }
    
    @EventListener
    public void method10044(final Class5738 class5738) {
        if (this.isEnabled()) {
            if (this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && !Client.getInstance().moduleManager().getModuleByClass(Fly.class).isEnabled()) {
                if (NCPBlockFly.mc.world.method6981(NCPBlockFly.mc.player, NCPBlockFly.mc.player.boundingBox.expand(0.0, -1.5, 0.0).contract(0.05, 0.0, 0.05).contract(-0.05, 0.0, -0.05)).count() == 0L) {
                    if (NCPBlockFly.mc.player.fallDistance < 1.0f) {
                        class5738.method17026(true);
                    }
                }
            }
            else if (NCPBlockFly.mc.player.onGround) {
                if (Client.getInstance().moduleManager().getModuleByClass(SafeWalk.class).isEnabled()) {
                    if (!this.field15629 || !this.getBooleanValueFromSettingName("Downwards")) {
                        class5738.method17026(true);
                    }
                }
            }
        }
    }
    
    @EventListener
    private void method10045(final Class5752 class5752) {
        if (this.isEnabled() && this.getBooleanValueFromSettingName("Downwards")) {
            if (class5752.method17061() == NCPBlockFly.mc.gameSettings.field23440.field2161.field32860) {
                class5752.setCancelled(true);
                this.field15629 = true;
            }
        }
    }
    
    @EventListener
    private void method10046(final Class5715 class5715) {
        if (this.isEnabled() && this.getBooleanValueFromSettingName("Downwards")) {
            if (class5715.method16963() == NCPBlockFly.mc.gameSettings.field23440.field2161.field32860) {
                class5715.setCancelled(true);
                this.field15629 = false;
            }
        }
    }
    
    @EventListener
    @LowerPriority
    public void method10047(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.isEnabled() && this.field15628.method10281() != 0) {
            if (!updateWalkingEvent.isPre()) {
                this.field15628.method10282();
                if (this.field15623 != null) {
                    final BlockRayTraceResult class5745 = new BlockRayTraceResult(method10053(this.field15623.field39906, this.field15623.field39907), this.field15623.field39907, this.field15623.field39906, false);
                    final int field2743 = NCPBlockFly.mc.player.inventory.field2743;
                    if (!this.method9914().getStringSettingValueByName("ItemSpoof").equals("None")) {
                        this.field15628.method10280();
                    }
                    NCPBlockFly.mc.playerController.method27319(NCPBlockFly.mc.player, NCPBlockFly.mc.world, this.field15627, class5745);
                    if (!this.method9914().getBooleanValueFromSettingName("NoSwing")) {
                        NCPBlockFly.mc.player.method2707(this.field15627);
                    }
                    else {
                        NCPBlockFly.mc.method5269().method17292(new Class4380(this.field15627));
                    }
                    if (this.method9914().getStringSettingValueByName("ItemSpoof").equals("Spoof") || this.method9914().getStringSettingValueByName("ItemSpoof").equals("LiteSpoof")) {
                        NCPBlockFly.mc.player.inventory.field2743 = field2743;
                    }
                }
            }
            else {
                ++this.field15625;
                updateWalkingEvent.method17033(true);
                this.field15627 = Class316.field1877;
                final BlockFly field2744 = this.field15628;
                Label_0094: {
                    if (BlockFly.method10279(NCPBlockFly.mc.player.method2715(Class316.field1878).getItem())) {
                        if (!NCPBlockFly.mc.player.method2715(this.field15627).method27620()) {
                            final BlockFly field2745 = this.field15628;
                            if (BlockFly.method10279(NCPBlockFly.mc.player.method2715(this.field15627).getItem())) {
                                break Label_0094;
                            }
                        }
                        this.field15627 = Class316.field1878;
                    }
                }
                double n = updateWalkingEvent.method17034();
                double n2 = updateWalkingEvent.method17038();
                double n3 = updateWalkingEvent.method17036();
                if (!NCPBlockFly.mc.player.collidedHorizontally) {
                    if (!NCPBlockFly.mc.gameSettings.field23439.field2162) {
                        final double[] method10052 = this.method10052();
                        n = method10052[0];
                        n2 = method10052[1];
                    }
                }
                Label_0177: {
                    if (NCPBlockFly.mc.player.getMotion().y < 0.0) {
                        if (NCPBlockFly.mc.player.fallDistance > 1.0f) {
                            if (Class4609.method13697(0.0f, 90.0f, 3.0f).getType() == RayTraceResult.Type.MISS) {
                                n3 += Math.min(NCPBlockFly.mc.player.getMotion().y * 2.0, 4.0);
                                break Label_0177;
                            }
                        }
                    }
                    if (this.field15629 && this.getBooleanValueFromSettingName("Downwards")) {
                        --n3;
                    }
                    else if (this.getStringSettingValueByName("Speed Mode").equals("Jump") || this.getStringSettingValueByName("Speed Mode").equals("Cubecraft")) {
                        if (!NCPBlockFly.mc.gameSettings.field23439.method1056()) {
                            n3 = this.field15631;
                        }
                    }
                }
                if (!Class4609.method13708(new BlockPos(NCPBlockFly.mc.player.method1934().getX(), NCPBlockFly.mc.player.method1934().getY() - 1.0, NCPBlockFly.mc.player.method1934().getZ()))) {
                    n = NCPBlockFly.mc.player.method1934().getX();
                    n2 = NCPBlockFly.mc.player.method1934().getZ();
                }
                final BlockPos class5746 = new BlockPos(n, n3 - 1.0, n2);
                if (!Class4609.method13708(class5746) && this.field15628.method10285(this.field15627)) {
                    if ((this.field15623 = Class4609.method13705(class5746, !this.field15629 && this.getBooleanValueFromSettingName("Downwards"))) != null) {
                        final float[] method10053 = Class4609.method13672(this.field15623.field39906, this.field15623.field39907);
                        this.field15622 = method10053[0];
                        this.field15621 = method10053[1];
                        updateWalkingEvent.method17043(this.field15622);
                        updateWalkingEvent.method17041(this.field15621);
                    }
                }
                else {
                    if (this.getBooleanValueFromSettingName("KeepRotations")) {
                        if (this.field15621 != 999.0f) {
                            updateWalkingEvent.method17043(this.field15622);
                            updateWalkingEvent.method17041(this.field15621);
                        }
                    }
                    this.field15623 = null;
                }
                if (NCPBlockFly.mc.player.rotationYaw != updateWalkingEvent.method17042()) {
                    if (NCPBlockFly.mc.player.rotationPitch != updateWalkingEvent.method17040()) {
                        this.field15625 = 0;
                    }
                }
            }
        }
    }
    
    @EventListener
    @HigherPriority
    public void method10048(final Class5717 class5717) {
        if (!this.isEnabled() || this.field15628.method10281() == 0) {
            return;
        }
        if (NCPBlockFly.mc.player.onGround || ColorUtils.method19160(NCPBlockFly.mc.player, 0.01f)) {
            this.field15631 = NCPBlockFly.mc.player.posY;
        }
        if (this.method9914().getBooleanValueFromSettingName("No Sprint")) {
            NCPBlockFly.mc.player.method1816(false);
        }
        if (NCPBlockFly.mc.player.onGround) {
            this.field15626 = 0;
        }
        else if (this.field15626 >= 0) {
            ++this.field15626;
        }
        if (this.field15628 == null) {
            this.field15628 = (BlockFly)this.method9914();
        }
        final String method9887 = this.getStringSettingValueByName("Speed Mode");
        switch (method9887) {
            case "Jump": {
                if (NCPBlockFly.mc.player.onGround && ColorUtils.method19114() && !NCPBlockFly.mc.player.method1809() && !this.field15629) {
                    this.field15630 = false;
                    NCPBlockFly.mc.player.method2725();
                    ((Speed) Client.getInstance().moduleManager().getModuleByClass(Speed.class)).method10269();
                    this.field15630 = true;
                    class5717.method16975(NCPBlockFly.mc.player.getMotion().y);
                    class5717.method16973(NCPBlockFly.mc.player.getMotion().x);
                    class5717.method16977(NCPBlockFly.mc.player.getMotion().z);
                    break;
                }
                break;
            }
            case "AAC": {
                if (this.field15625 == 0 && NCPBlockFly.mc.player.onGround) {
                    MovementUtil.method23149(class5717, MovementUtil.method23136() * 0.82);
                    break;
                }
                break;
            }
            case "Cubecraft": {
                double n2 = 0.2;
                final float method9888 = this.method10055(MathHelper.method35668(NCPBlockFly.mc.player.rotationYaw));
                if (NCPBlockFly.mc.gameSettings.field23439.method1056()) {
                    NCPBlockFly.mc.timer.timerSpeed = 1.0f;
                }
                else if (NCPBlockFly.mc.player.onGround) {
                    if (ColorUtils.method19114() && !NCPBlockFly.mc.player.method1809() && !this.field15629) {
                        class5717.method16975(1.00000000000001);
                    }
                }
                else if (this.field15626 == 1) {
                    if (class5717.method16974() <= 0.9) {
                        this.field15626 = -1;
                    }
                    else {
                        class5717.method16975(0.122);
                        NCPBlockFly.mc.timer.timerSpeed = 0.7f;
                        n2 = 2.4;
                    }
                }
                else if (this.field15626 == 2) {
                    if (class5717.method16974() > 0.05) {
                        this.field15626 = -1;
                    }
                    else {
                        NCPBlockFly.mc.timer.timerSpeed = 0.7f;
                        n2 = 0.28;
                    }
                }
                else if (this.field15626 == 3) {
                    NCPBlockFly.mc.timer.timerSpeed = 0.3f;
                    n2 = 2.4;
                }
                else if (this.field15626 == 4) {
                    n2 = 0.28;
                    NCPBlockFly.mc.timer.timerSpeed = 1.0f;
                }
                else if (this.field15626 == 6) {
                    class5717.method16975(-1.023456987345906);
                }
                if (!ColorUtils.method19114()) {
                    n2 = 0.0;
                }
                if (NCPBlockFly.mc.player.fallDistance < 1.0f) {
                    MovementUtil.method23153(class5717, n2, method9888, method9888, 360.0f);
                }
                ColorUtils.method19155(class5717.method16974());
                break;
            }
            case "Slow": {
                if (NCPBlockFly.mc.player.onGround) {
                    class5717.method16973(class5717.method16972() * 0.75);
                    class5717.method16977(class5717.method16976() * 0.75);
                    break;
                }
                class5717.method16973(class5717.method16972() * 0.93);
                class5717.method16977(class5717.method16976() * 0.93);
                break;
            }
            case "Sneak": {
                if (NCPBlockFly.mc.player.onGround) {
                    class5717.method16973(class5717.method16972() * 0.65);
                    class5717.method16977(class5717.method16976() * 0.65);
                    break;
                }
                class5717.method16973(class5717.method16972() * 0.85);
                class5717.method16977(class5717.method16976() * 0.85);
                break;
            }
        }
        this.field15628.method10287(class5717);
    }
    
    @EventListener
    @LowerPriority
    public void method10049(final Class5721 class5721) {
        if (this.isEnabled() && NCPBlockFly.mc.player != null) {
            if (class5721.method16990() instanceof Class4321) {
                if (((BlockFly)this.method9914()).field15750 >= 0) {
                    class5721.setCancelled(true);
                }
            }
        }
    }
    
    @EventListener
    public void method10050(final Class5722 class5722) {
        if (this.isEnabled() && this.field15630) {
            if (this.method9914().getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Cubecraft")) {
                if (!ColorUtils.method19114() || this.method9914().getBooleanValueFromSettingName("Tower while moving")) {
                    class5722.setCancelled(true);
                }
            }
        }
    }
    
    @EventListener
    public void method10051(final Class5741 class5741) {
        if (this.isEnabled()) {
            if (this.getStringSettingValueByName("Speed Mode").equals("Cubecraft")) {
                if (this.field15626 >= 0) {
                    if (NCPBlockFly.mc.player.fallDistance > 1.2f) {
                        return;
                    }
                    if (NCPBlockFly.mc.player.field3019 < this.field15631) {
                        return;
                    }
                    if (!NCPBlockFly.mc.player.field2967) {
                        NCPBlockFly.mc.player.posY = this.field15631;
                        NCPBlockFly.mc.player.lastTickPosY = this.field15631;
                        NCPBlockFly.mc.player.field3019 = this.field15631;
                        NCPBlockFly.mc.player.prevPosY = this.field15631;
                        if (MovementUtil.isMoving()) {
                            NCPBlockFly.mc.player.field3013 = 0.099999994f;
                        }
                    }
                }
            }
        }
    }
    
    public double[] method10052() {
        final double field2395 = NCPBlockFly.mc.player.posX;
        final double field2396 = NCPBlockFly.mc.player.posZ;
        final double n = NCPBlockFly.mc.player.field4085.field24722;
        final double n2 = NCPBlockFly.mc.player.field4085.field24721;
        final float field2397 = NCPBlockFly.mc.player.rotationYaw;
        BlockPos class354 = new BlockPos(field2395, NCPBlockFly.mc.player.posY - 1.0, field2396);
        double n3 = field2395;
        double n4 = field2396;
        double n5 = 0.0;
        final double n6 = this.getNumberSettingValueByName("Extend") * 2.0f;
        while (Class4609.method13708(class354)) {
            final double n7 = field2395;
            final double n8 = field2396;
            ++n5;
            if (n5 > n6) {
                n5 = n6;
            }
            n3 = n7 + (n * 0.45 * Math.cos(Math.toRadians(field2397 + 90.0f)) + n2 * 0.45 * Math.sin(Math.toRadians(field2397 + 90.0f))) * n5;
            n4 = n8 + (n * 0.45 * Math.sin(Math.toRadians(field2397 + 90.0f)) - n2 * 0.45 * Math.cos(Math.toRadians(field2397 + 90.0f))) * n5;
            if (n5 == n6) {
                break;
            }
            class354 = new BlockPos(n3, NCPBlockFly.mc.player.posY - 1.0, n4);
        }
        return new double[] { n3, n4 };
    }
    
    public static Vec3d method10053(final BlockPos class354, final Direction class355) {
        final double n = class354.getX() + 0.5;
        final double n2 = class354.getY() + 0.5;
        final double n3 = class354.getZ() + 0.5;
        double n4 = n + class355.getXOffset() / 2.0;
        double n5 = n3 + class355.getZOffset() / 2.0;
        double n6 = n2 + class355.getYOffset() / 2.0;
        final double n7 = 0.2;
        if (class355 != Direction.UP && class355 != Direction.DOWN) {
            n6 += method10054(n7, -n7);
        }
        else {
            n4 += method10054(n7, -n7);
            n5 += method10054(n7, -n7);
        }
        if (class355 == Direction.WEST || class355 == Direction.EAST) {
            n5 += method10054(n7, -n7);
        }
        if (class355 == Direction.SOUTH || class355 == Direction.NORTH) {
            n4 += method10054(n7, -n7);
        }
        return new Vec3d(n4, n6, n5);
    }
    
    public static double method10054(final double n, final double n2) {
        return Math.random() * (n - n2) + n2;
    }
    
    public float method10055(float n) {
        float n2 = 0.0f;
        final float field2968 = NCPBlockFly.mc.player.field2968;
        final float field2969 = NCPBlockFly.mc.player.field2970;
        if (field2968 <= 0.0f) {
            if (field2968 < 0.0f) {
                if (field2969 <= 0.0f) {
                    if (field2969 >= 0.0f) {
                        n += 90.0f;
                    }
                    else {
                        n -= 45.0f;
                    }
                }
                else {
                    n += 45.0f;
                }
            }
        }
        else if (field2969 <= 0.0f) {
            if (field2969 >= 0.0f) {
                n -= 90.0f;
            }
            else {
                n += 45.0f;
            }
        }
        else {
            n -= 45.0f;
        }
        if (n >= 45.0f && n <= 135.0f) {
            n2 = 90.0f;
        }
        else if (n < 135.0f && n > -135.0f) {
            if (n <= -45.0f && n >= -135.0f) {
                n2 = -90.0f;
            }
            else if (n >= -45.0f) {
                if (n <= 45.0f) {
                    n2 = 0.0f;
                }
            }
        }
        else {
            n2 = 180.0f;
        }
        if (field2969 < 0.0f) {
            n2 -= 180.0f;
        }
        return n2 + 90.0f;
    }
}
