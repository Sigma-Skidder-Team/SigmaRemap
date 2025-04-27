// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.phases;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.PremiumModule;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;

public class NCPPhase extends PremiumModule
{
    private boolean field16030;
    private int field16031;
    private int field16032;
    
    public NCPPhase() {
        super("NCP", "Phase for NCP anticheat", Category.MOVEMENT);
        this.addSetting(new BooleanSetting("Hypixel", "Hypixel bypass", true));
    }
    
    @Override
    public void onEnable() {
        this.field16030 = false;
        if (!NCPPhase.mc.player.collidedHorizontally) {
            this.field16031 = -1;
        }
        else {
            this.field16031 = 0;
            if (NCPPhase.mc.player.onGround) {
                NCPPhase.mc.method5269().method17292(new Class4354(NCPPhase.mc.player.posX, NCPPhase.mc.player.posY + 0.0626, NCPPhase.mc.player.posZ, false));
            }
        }
    }
    
    @EventListener
    private void method10698(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.isEnabled() && updateWalkingEvent.isPre()) {
            if (NCPPhase.mc.gameSettings.field23440.method1056()) {
                final double field2395 = NCPPhase.mc.player.posX;
                final double field2396 = NCPPhase.mc.player.posY;
                final double field2397 = NCPPhase.mc.player.posZ;
                if (!ColorUtils.method19114()) {
                    if (ColorUtils.method19160(NCPPhase.mc.player, 0.001f) && !method10703()) {
                        NCPPhase.mc.player.setPosition(field2395, field2396 - 1.0, field2397);
                        updateWalkingEvent.method17037(field2396 - 1.0);
                        updateWalkingEvent.method17033(true);
                        updateWalkingEvent.method17043(updateWalkingEvent.method17042() + 10.0f);
                        ColorUtils.method19155(0.0);
                    }
                    else if (NCPPhase.mc.player.posY == (int) NCPPhase.mc.player.posY) {
                        NCPPhase.mc.player.setPosition(field2395, field2396 - 0.3, field2397);
                    }
                }
            }
            Label_0045: {
                if (this.field16031 > 0) {
                    if (this.field16030) {
                        if (method10703()) {
                            ++this.field16032;
                            final float n = (float)Math.sin(this.field16032) * 5.0f;
                            final float n2 = (float)Math.cos(this.field16032) * 5.0f;
                            updateWalkingEvent.method17043(updateWalkingEvent.method17042() + n);
                            updateWalkingEvent.method17041(updateWalkingEvent.method17040() + n2);
                            break Label_0045;
                        }
                    }
                }
                if (this.field16031 < 0) {
                    return;
                }
            }
            updateWalkingEvent.method17033(true);
        }
    }
    
    @EventListener
    private void method10699(final Class5717 class5717) {
        if (!this.isEnabled()) {
            return;
        }
        if (NCPPhase.mc.player.collidedHorizontally) {
            if (this.field16031 != 0) {
                this.field16031 = 0;
                if (NCPPhase.mc.player.onGround) {
                    NCPPhase.mc.method5269().method17292(new Class4354(NCPPhase.mc.player.posX, NCPPhase.mc.player.posY + 0.0626, NCPPhase.mc.player.posZ, false));
                }
            }
        }
        if (this.field16031 >= 0) {
            if (this.field16031 != 0) {
                if (!method10703()) {
                    this.field16030 = false;
                    MovementUtil.method23149(class5717, 0.0);
                    return;
                }
                if (!this.field16030) {
                    MovementUtil.method23149(class5717, this.getBooleanValueFromSettingName("Hypixel") ? 0.03 : 0.0031);
                }
                else {
                    MovementUtil.method23149(class5717, 0.617);
                }
            }
            else {
                MovementUtil.method23149(class5717, 0.0);
                this.method10702(6.000000238415E-4);
            }
            ++this.field16031;
        }
    }
    
    @EventListener
    private void method10700(final Class5713 class5713) {
        if (this.isEnabled()) {
            class5713.setCancelled(true);
        }
    }
    
    @EventListener
    private void method10701(final Class5723 class5723) {
        if (this.isEnabled()) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4328) {
                final Class4328 class5724 = (Class4328)method16998;
                class5724.field19380 = NCPPhase.mc.player.rotationYaw;
                class5724.field19381 = NCPPhase.mc.player.rotationPitch;
                this.field16030 = true;
            }
        }
    }
    
    private void method10702(final double n) {
        double n2 = NCPPhase.mc.player.field4085.field24722;
        double n3 = NCPPhase.mc.player.field4085.field24721;
        float field2399 = NCPPhase.mc.player.rotationYaw;
        if (n2 != 0.0) {
            if (n3 <= 0.0) {
                if (n3 < 0.0) {
                    field2399 += ((n2 <= 0.0) ? -45 : 45);
                }
            }
            else {
                field2399 += ((n2 <= 0.0) ? 45 : -45);
            }
            n3 = 0.0;
            if (n2 <= 0.0) {
                if (n2 < 0.0) {
                    n2 = -1.0;
                }
            }
            else {
                n2 = 1.0;
            }
        }
        NCPPhase.mc.player.setPosition(NCPPhase.mc.player.posX + (n2 * n * Math.cos(Math.toRadians(field2399 + 90.0f)) + n3 * n * Math.sin(Math.toRadians(field2399 + 90.0f))), NCPPhase.mc.player.posY, NCPPhase.mc.player.posZ + (n2 * n * Math.sin(Math.toRadians(field2399 + 90.0f)) - n3 * n * Math.cos(Math.toRadians(field2399 + 90.0f))));
    }
    
    public static boolean method10703() {
        return NCPPhase.mc.world.method6981(NCPPhase.mc.player, NCPPhase.mc.player.boundingBox).count() != 0L;
    }
}
