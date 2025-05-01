// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;

public class ReloadedFly extends Module {
    private int field15585;
    private double field15586;
    private boolean field15587;

    public ReloadedFly() {
        super(Category.MOVEMENT, "Reloaded", "A fly for AnticheatReloaded");
        this.addSetting(new NumberSetting("Speed", "Fly speed", 4.0f, Float.class, 0.3f, 8.0f, 0.1f));
        this.addSetting(new BooleanSetting("Offset", "Offset while flying", false));
        this.addSetting(new BooleanSetting("NoFall", "Avoid getting fall damage when flying down", true));
    }

    @Override
    public void onEnable() {
        this.field15586 = ReloadedFly.mc.player.posY;
        this.field15585 = 0;
        if (!ReloadedFly.mc.gameSettings.field23440.method1056()) {
            if (!ReloadedFly.mc.gameSettings.field23440.method1056()) {
                this.field15587 = false;
            }
        } else {
            ReloadedFly.mc.gameSettings.field23440.field2162 = false;
            this.field15587 = true;
        }
    }

    @Override
    public void onDisable() {
        MovementUtil.method23151(0.0);
        if (ReloadedFly.mc.player.getMotion().y > 0.0) {
            AllUtils.method19155(-0.0789);
        }
    }

    @EventListener
    private void method9993(final Class5752 class5752) {
        if (this.isEnabled()) {
            if (class5752.method17061() == ReloadedFly.mc.gameSettings.field23440.field2161.field32860) {
                class5752.setCancelled(true);
                this.field15587 = true;
            }
        }
    }

    @EventListener
    private void method9994(final Class5715 class5715) {
        if (this.isEnabled()) {
            if (class5715.method16963() == ReloadedFly.mc.gameSettings.field23440.field2161.field32860) {
                class5715.setCancelled(true);
                this.field15587 = false;
            }
        }
    }

    @EventListener
    @LowerPriority
    public void method9995(final Class5717 class5717) {
        if (this.isEnabled()) {
            if (this.field15585 != -1) {
                if (this.field15585 == 0) {
                    if (Math.abs(class5717.method16974()) < 0.08) {
                        class5717.method16975(this.getBooleanValueFromSettingName("Offset") ? -0.01 : 0.0);
                    }
                    AllUtils.method19155(class5717.method16974());
                    MovementUtil.method23149(class5717, 0.35);
                }
            } else {
                double n = this.getBooleanValueFromSettingName("Offset") ? 0.01 : 0.0;
                if (this.field15587) {
                    n -= this.getNumberSettingValueByName("Speed") / 2.0f;
                }
                if (ReloadedFly.mc.gameSettings.field23439.method1056()) {
                    n += this.getNumberSettingValueByName("Speed") / 2.0f;
                }
                class5717.method16975(n);
                AllUtils.method19155(class5717.method16974());
                MovementUtil.method23149(class5717, this.getNumberSettingValueByName("Speed"));
            }
        }
    }

    @EventListener
    public void method9996(final UpdateWalkingEventI updateWalkingEvent) {
        if (this.isEnabled() && updateWalkingEvent.isPre()) {
            ++this.field15585;
            if (this.field15585 != 2) {
                if (this.field15585 > 2) {
                    if (this.field15585 >= 20) {
                        if (this.field15585 % 20 == 0) {
                            updateWalkingEvent.method17037(-150.0 - Math.random() * 150.0);
                        }
                    }
                }
            } else {
                updateWalkingEvent.method17037(-150.0 - Math.random() * 150.0);
            }
            if (this.getBooleanValueFromSettingName("NoFall")) {
                updateWalkingEvent.method17045(true);
            }
            updateWalkingEvent.method17033(true);
        }
    }

    @EventListener
    public void method9997(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled()) {
            final IPacket method16998 = eventReceivePacket.getPacket();
            if (method16998 instanceof SPlayerPositionLookPacket) {
                final SPlayerPositionLookPacket class5724 = (SPlayerPositionLookPacket) method16998;
                if (this.field15585 >= 1) {
                    this.field15585 = -1;
                }
                this.field15586 = class5724.field19378;
                class5724.yaw = ReloadedFly.mc.player.rotationYaw;
                class5724.pitch = ReloadedFly.mc.player.rotationPitch;
            }
        }
    }

    @EventListener
    public void method9998(final Class5721 class5721) {
        if (this.isEnabled()) {
            final IPacket method16990 = class5721.method16990();
            if (method16990 instanceof Class4353) {
                final Class4353 class5722 = (Class4353) method16990;
                if (this.field15585 == -1) {
                    if (this.getBooleanValueFromSettingName("NoFall")) {
                        class5722.field19504 = true;
                    }
                }
            }
        }
    }

    @EventListener
    public void method9999(final Class5741 class5741) {
        if (this.isEnabled()) {
            final double field15586 = this.field15586;
            ReloadedFly.mc.player.posY = field15586;
            ReloadedFly.mc.player.lastTickPosY = field15586;
            ReloadedFly.mc.player.field3019 = field15586;
            ReloadedFly.mc.player.prevPosY = field15586;
        }
    }
}
