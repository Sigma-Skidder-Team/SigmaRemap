// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;

public class CubecraftFly extends Module {
    private boolean field15693;
    private boolean field15694;
    private int field15695;
    private static int field15696;
    private final TimerUtil timer;
    private double field15698;

    public CubecraftFly() {
        super(Category.MOVEMENT, "Cubecraft", "Fly for Cubecraft");
        this.timer = new TimerUtil();
        this.addSetting(new StringSetting("Mode", "Mode", 0, "Basic", "Fast", "Test"));
        this.addSetting(new BooleanSetting("Damage", "Allows you to go up.", true));
        this.addSetting(new BooleanSetting("Smooth fly", "Better look.", true));
    }

    public static boolean method10177() {
        return CubecraftFly.field15696 == 1;
    }

    @Override
    public void onEnable() {
        this.field15695 = 0;
        this.field15693 = false;
        CubecraftFly.field15696 = 0;
        if (CubecraftFly.mc.player.onGround) {
            if (this.getStringSettingValueByName("Mode").equalsIgnoreCase("Basic")) {
                CubecraftFly.mc.timer.timerSpeed = 0.3f;
            }
            this.field15694 = true;
            this.method10182();
        } else {
            this.field15694 = (ViaManager.method34762() != Class7906.field32452.method25613() && !this.getBooleanValueFromSettingName("Damage"));
        }
    }

    @Override
    public void onDisable() {
        this.timer.reset();
        this.timer.stop();
        if (ViaManager.method34762() != Class7906.field32452.method25613()) {
            if (this.field15695 != 0) {
                this.field15695 = -2;
            } else {
                ColorUtils.method19155(-0.078);
                MovementUtil.method23151(0.2);
            }
        } else if (CubecraftFly.field15696 == 1) {
            if (this.field15695 == 0) {
                this.field15695 = -2;
            } else {
                ColorUtils.method19155(-0.078);
                MovementUtil.method23151(0.2);
                this.field15695 = 0;
            }
        }
        CubecraftFly.mc.timer.timerSpeed = 1.0f;
        CubecraftFly.field15696 = 0;
    }

    @EventListener
    @Class6754
    public void method10178(final Class5717 class5717) {
        if (!this.isEnabled()) {
            if (this.field15695 < 0) {
                if (this.field15695 == -2) {
                    class5717.method16975(0.53);
                } else {
                    CubecraftFly.mc.timer.timerSpeed = 1.0f;
                    class5717.method16975(-0.078);
                }
                MovementUtil.method23149(class5717, 0.26);
                ++this.field15695;
            }
            return;
        }
        if (CubecraftFly.mc.player.ticksExisted <= 1) {
            this.field15698 = CubecraftFly.mc.player.posY;
        }
        if (!this.field15694) {
            if (CubecraftFly.mc.player.onGround) {
                CubecraftFly.mc.timer.timerSpeed = 0.3f;
                this.field15694 = true;
                this.method10182();
            }
            return;
        }
        if (CubecraftFly.mc.player.hurtResistantTime != 0 && !this.field15693) {
            this.field15693 = !this.field15693;
        }
        if (ViaManager.method34762() == Class7906.field32452.method25613()) {
            if (this.field15695 >= 0 && CubecraftFly.field15696 == 1) {
                double a = 0.0;
                float field26532 = 1.0f;
                double n = 0.0;
                final String method9887 = this.getStringSettingValueByName("Mode");
                switch (method9887) {
                    case "Basic": {
                        if (this.field15695 == 0) {
                            a = 0.4;
                            n = 2.4;
                            field26532 = 0.3f;
                            break;
                        }
                        if (this.field15695 == 1) {
                            a = -0.4;
                            n = 0.27;
                            field26532 = 0.3f;
                            break;
                        }
                        if (this.field15695 == 2) {
                            a = 0.0;
                            n = 2.4;
                            field26532 = 1.0f;
                            this.field15695 = -1;
                            break;
                        }
                        break;
                    }
                    case "Fast": {
                        if (this.field15695 == 0) {
                            a = 0.52500000000001;
                            n = 3.0;
                            break;
                        }
                        if (this.field15695 == 1) {
                            a = -0.2625;
                            n = 0.2873;
                            break;
                        }
                        if (this.field15695 == 2) {
                            a = -0.2625;
                            n = 0.2;
                            this.field15695 = -1;
                            break;
                        }
                        break;
                    }
                    case "Test": {
                        field26532 = 0.3f;
                        if (this.field15695 == 0) {
                            a = 2.0000000001E-4;
                            n = 2.4;
                            break;
                        }
                        if (this.field15695 == 1) {
                            a = -1.0E-4;
                            n = 0.2873;
                            break;
                        }
                        if (this.field15695 == 2) {
                            a = -1.0E-4;
                            n = 2.3;
                            field26532 = 1.0f;
                            this.field15695 = -1;
                            break;
                        }
                        break;
                    }
                }
                if (this.timer.getElapsedTime() > 2000L) {
                    if (this.timer.isRunning()) {
                        CubecraftFly.mc.method5269().method17292(new Class4354(CubecraftFly.mc.player.posX, 3.2E7, CubecraftFly.mc.player.posZ, false));
                        Client.getInstance().getNotificationManager().send(new Notification("Cubecraft fly", "Lagbacked you to avoid ban"));
                        this.timer.stop();
                    }
                    class5717.method16975(0.0);
                    MovementUtil.method23149(class5717, 0.0);
                    return;
                }
                CubecraftFly.mc.timer.timerSpeed = field26532;
                if (Math.abs(a) < 1.0E-5) {
                    CubecraftFly.mc.player.setPosition(CubecraftFly.mc.player.posX, CubecraftFly.mc.player.posY + a, CubecraftFly.mc.player.posZ);
                    class5717.method16975(0.0);
                } else {
                    class5717.method16975(a);
                }
                MovementUtil.method23149(class5717, n);
            }
            if (CubecraftFly.field15696 == 1) {
                ++this.field15695;
            } else {
                MovementUtil.method23149(class5717, 0.0);
            }
        } else {
            double n3 = 0.0;
            double n4 = 0.0;
            float field26533 = 0.3f;
            ++this.field15695;
            final String method9888 = this.getStringSettingValueByName("Mode");
            switch (method9888) {
                case "Basic": {
                    if (this.field15695 == 0) {
                        n3 = 0.4;
                        n4 = 2.4;
                        field26533 = 0.3f;
                        break;
                    }
                    if (this.field15695 == 1) {
                        n3 = -0.4;
                        n4 = 0.27;
                        field26533 = 0.3f;
                        break;
                    }
                    if (this.field15695 == 2) {
                        n3 = 0.0;
                        n4 = 2.4;
                        field26533 = 1.0f;
                        this.field15695 = -1;
                        break;
                    }
                    break;
                }
                case "Fast": {
                    field26533 = 1.0f;
                    if (this.field15695 == 0) {
                        n3 = 0.52500000000001;
                        n4 = 3.0;
                        break;
                    }
                    if (this.field15695 == 1) {
                        n3 = -0.2625;
                        n4 = 0.2873;
                        break;
                    }
                    if (this.field15695 == 2) {
                        n3 = -0.2625;
                        n4 = 0.2;
                        this.field15695 = -1;
                        break;
                    }
                    break;
                }
                case "Test": {
                    field26533 = 1.0f;
                    if (this.field15695 == 0) {
                        n3 = 2.0E-5;
                        n4 = 2.4;
                        break;
                    }
                    if (this.field15695 == 1) {
                        n3 = -9.9E-6;
                        n4 = 0.2873;
                        break;
                    }
                    if (this.field15695 == 2) {
                        n3 = -1.0E-5;
                        n4 = 0.2;
                        this.field15695 = -1;
                        break;
                    }
                    break;
                }
            }
            if (this.timer.getElapsedTime() > 2000L) {
                this.timer.stop();
                Client.getInstance().getNotificationManager().send(new Notification("Cubecraft fly", "Lagbacked you to avoid ban"));
                CubecraftFly.mc.method5269().method17292(new Class4354(CubecraftFly.mc.player.posX, 3.2E7, CubecraftFly.mc.player.posZ, false));
            }
            if (!ColorUtils.method19160(CubecraftFly.mc.player, 0.01f) && (CubecraftFly.mc.method5282() == null || !CubecraftFly.mc.method5282().field41613.equalsIgnoreCase("play.cubecraft.net"))) {
                n3 = -0.01;
            }
            if (!ColorUtils.method19160(CubecraftFly.mc.player, (float) (-n3))) {
                class5717.method16975(n3);
            } else {
                class5717.method16975(-0.07);
            }
            CubecraftFly.mc.timer.timerSpeed = field26533;
            MovementUtil.method23149(class5717, n4);
        }
    }

    @EventListener
    public void method10179(final UpdateWalkingEvent updateWalkingEvent) {
        if (!this.isEnabled() || !this.field15694) {
            return;
        }
        updateWalkingEvent.method17033(true);
        if (ViaManager.method34762() == Class7906.field32452.method25613() && (CubecraftFly.field15696 == 0 || (CubecraftFly.field15696 == 1 && this.timer.getElapsedTime() > 2000L)) && this.field15694) {
            updateWalkingEvent.setCancelled(true);
        }
        updateWalkingEvent.method17045(true);
    }

    @EventListener
    public void method10180(final Class5723 class5723) {
        if (!this.isEnabled() || CubecraftFly.mc.world == null || CubecraftFly.mc.method5269() == null) {
            return;
        }
        final IPacket method16998 = class5723.method16998();
        if (method16998 instanceof Class4328) {
            final Class4328 class5724 = (Class4328) method16998;
            if (ViaManager.method34762() != Class7906.field32452.method25613()) {
                class5724.field19381 = CubecraftFly.mc.player.rotationPitch;
                class5724.field19380 = CubecraftFly.mc.player.rotationYaw;
                return;
            }
            if (CubecraftFly.field15696 == 0) {
                this.timer.reset();
                this.timer.start();
                class5723.setCancelled(true);
                CubecraftFly.mc.method5269().method17292(new Class4355(class5724.field19377, class5724.field19378, class5724.field19379, class5724.field19380, class5724.field19381, this.getBooleanValueFromSettingName("Damage")));
            }
            ++CubecraftFly.field15696;
        }
    }

    @EventListener
    public void method10181(final Class5741 class5741) {
        if (!this.isEnabled() || !this.field15694 || !this.getBooleanValueFromSettingName("Smooth fly")) {
            return;
        }
        if (CubecraftFly.mc.player.onGround && ColorUtils.method19160(CubecraftFly.mc.player, 0.001f)) {
            this.field15698 = CubecraftFly.mc.player.posY;
        }
        CubecraftFly.mc.player.posY = this.field15698;
        CubecraftFly.mc.player.lastTickPosY = this.field15698;
        CubecraftFly.mc.player.field3019 = this.field15698;
        CubecraftFly.mc.player.prevPosY = this.field15698;
        if (MovementUtil.isMoving()) {
            CubecraftFly.mc.player.field3013 = 0.099999994f;
        }
    }

    private void method10182() {
        if (ColorUtils.method19150()) {
            return;
        }
        if (ViaManager.method34762() == Class7906.field32452.method25613()) {
            this.field15698 = CubecraftFly.mc.player.posY;
            final double field2395 = CubecraftFly.mc.player.posX;
            final double field2396 = CubecraftFly.mc.player.posY;
            final double field2397 = CubecraftFly.mc.player.posZ;
            double n = this.getBooleanValueFromSettingName("Damage") ? (field2396 - 3.0000001192093) : 3.2E7;
            if (!ColorUtils.method19148()) {
                n = field2396 - 3.0000001192093;
            }
            CubecraftFly.mc.method5269().method17292(new Class4354(field2395, n, field2397, false));
        } else {
            if (this.getBooleanValueFromSettingName("Damage")) {
                final double field2398 = CubecraftFly.mc.player.posX;
                final double field2399 = CubecraftFly.mc.player.posY;
                final double field2400 = CubecraftFly.mc.player.posZ;
                for (int n2 = 49 + MovementUtil.method23140() * 17, i = 0; i < n2; ++i) {
                    CubecraftFly.mc.method5269().method17292(new Class4354(field2398, field2399 + 0.06248 + (Math.random() - 0.5) * 1.0E-8, field2400, false));
                    CubecraftFly.mc.method5269().method17292(new Class4354(field2398, field2399 + 1.0E-14 + (Math.random() - 0.5) * 1.0E-8, field2400, false));
                }
                CubecraftFly.mc.method5269().method17292(new Class4354(field2398, field2399, field2400, true));
            }
            this.timer.start();
        }
    }
}
