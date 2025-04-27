// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.speeds;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.Fly;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;

public class YPortSpeed extends Module
{
    private boolean field15959;
    private double field15960;
    private double field15961;
    private double field15962;
    private int field15963;
    
    public YPortSpeed() {
        super(Category.MOVEMENT, "YPort", "YPort speed");
        this.addSetting(new StringSetting("Mode", "YPort mode", 0, new String[] { "NCP", "OldNCP" }));
        this.addSetting(new BooleanSetting("OnGround", "See yourself on ground", true));
    }
    
    @EventListener
    public void method10596(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.isEnabled()) {
            if (YPortSpeed.mc.player != null) {
                if (!Client.getInstance().moduleManager().getModuleByClass(Fly.class).isEnabled()) {
                    if (YPortSpeed.mc.player.onGround) {
                        if (updateWalkingEvent.isPre()) {
                            if (ColorUtils.method19146()) {
                                updateWalkingEvent.method17037(updateWalkingEvent.method17036() + 1.0E-14);
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void onEnable() {
        this.field15959 = false;
        this.field15963 = 0;
        this.field15961 = ((YPortSpeed.mc.player != null) ? MovementUtil.method23136() : 0.2873);
        this.field15960 = YPortSpeed.mc.player.posY;
    }
    
    @Override
    public void onDisable() {
        this.field15959 = false;
        if (YPortSpeed.mc.player.getMotion().y > 0.33) {
            ColorUtils.method19155(-0.43 + MovementUtil.method23140() * 0.1);
            MovementUtil.method23151(MovementUtil.method23136());
        }
    }
    
    @EventListener
    public void method10597(final Class5717 class5717) {
        if (!this.isEnabled() || Client.getInstance().moduleManager().getModuleByClass(Fly.class).isEnabled()) {
            return;
        }
        if (YPortSpeed.mc.player.field2967) {
            return;
        }
        final String method9887 = this.getStringSettingValueByName("Mode");
        switch (method9887) {
            case "NCP": {
                if (MovementUtil.isMoving() && YPortSpeed.mc.player.onGround) {
                    YPortSpeed.mc.player.method2725();
                    class5717.method16975(YPortSpeed.mc.player.getMotion().y);
                    MovementUtil.method23149(class5717, 0.461);
                    this.field15959 = true;
                    YPortSpeed.mc.player.stepHeight = 0.5f;
                    break;
                }
                if (this.field15959 && ColorUtils.method19160(YPortSpeed.mc.player, (float)(MovementUtil.method23141() + MovementUtil.method23140() * 0.1 + 0.0010000000474974513))) {
                    this.field15959 = !this.field15959;
                    MovementUtil.method23149(class5717, 0.312);
                    class5717.method16975(-0.43 + MovementUtil.method23140() * 0.1);
                    ColorUtils.method19155(class5717.method16974());
                    YPortSpeed.mc.player.stepHeight = 0.0f;
                    break;
                }
                if (this.field15959) {
                    class5717.method16975(-0.1);
                    this.field15959 = !this.field15959;
                    break;
                }
                break;
            }
            case "OldNCP": {
                if (YPortSpeed.mc.player.onGround && ColorUtils.method19114()) {
                    this.field15963 = 2;
                }
                if (this.field15963 == 1 && ColorUtils.method19114()) {
                    this.field15963 = 2;
                    this.field15961 = 1.38 * MovementUtil.method23136() - 0.01;
                }
                else if (this.field15963 == 2) {
                    this.field15963 = 3;
                    class5717.method16975((0.401448482 + 0.002 * Math.random()) * (1.0 + Math.sqrt(MovementUtil.method23140() / 2.0f) / 2.0));
                    this.field15961 *= 2.149;
                }
                else if (this.field15963 == 3) {
                    this.field15963 = 4;
                    this.field15961 = this.field15962 - 0.66 * (this.field15962 - MovementUtil.method23136());
                }
                else {
                    if (YPortSpeed.mc.world.method6981(YPortSpeed.mc.player, YPortSpeed.mc.player.boundingBox.offset(0.0, YPortSpeed.mc.player.getMotion().y, 0.0)).count() > 0L || YPortSpeed.mc.player.collidedVertically) {
                        this.field15963 = 1;
                    }
                    this.field15961 = this.field15962 - this.field15962 / 159.0;
                }
                MovementUtil.method23149(class5717, this.field15961 = Math.max(this.field15961, MovementUtil.method23136()));
                YPortSpeed.mc.player.stepHeight = 0.6f;
                ColorUtils.method19155(class5717.method16974());
                break;
            }
        }
    }
    
    @EventListener
    private void method10598(final Class5747 class5747) {
        if (this.isEnabled()) {
            if (!this.getStringSettingValueByName("Mode").equalsIgnoreCase("NCP")) {
                if (!Client.getInstance().moduleManager().getModuleByClass(Fly.class).isEnabled()) {
                    if (!YPortSpeed.mc.player.method1706()) {
                        if (!YPortSpeed.mc.player.method1723()) {
                            if (!YPortSpeed.mc.player.method2688()) {
                                if (!YPortSpeed.mc.gameSettings.field23439.field2162) {
                                    if (!YPortSpeed.mc.player.method2688()) {
                                        if (!MovementUtil.method23142()) {
                                            if (!YPortSpeed.mc.player.method1706()) {
                                                if (ColorUtils.method19160(YPortSpeed.mc.player, 1.0f)) {
                                                    if (!YPortSpeed.mc.player.onGround) {
                                                        if (this.field15963 == 3) {
                                                            ColorUtils.method19155(-0.3994);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                final double n = YPortSpeed.mc.player.posX - YPortSpeed.mc.player.prevPosX;
                                final double n2 = YPortSpeed.mc.player.posZ - YPortSpeed.mc.player.prevPosZ;
                                this.field15962 = Math.sqrt(n * n + n2 * n2);
                            }
                        }
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10599(final Class5741 class5741) {
        if (this.isEnabled()) {
            if (ColorUtils.method19160(YPortSpeed.mc.player, 0.43f)) {
                if (YPortSpeed.mc.player.fallDistance <= 0.09) {
                    if (this.getBooleanValueFromSettingName("OnGround")) {
                        if (!YPortSpeed.mc.gameSettings.field23439.field2162) {
                            if (!Client.getInstance().moduleManager().getModuleByClass(Fly.class).isEnabled()) {
                                if (YPortSpeed.mc.player.onGround) {
                                    if (ColorUtils.method19160(YPortSpeed.mc.player, 0.001f)) {
                                        this.field15960 = YPortSpeed.mc.player.posY;
                                    }
                                }
                                YPortSpeed.mc.player.posY = this.field15960;
                                YPortSpeed.mc.player.lastTickPosY = this.field15960;
                                YPortSpeed.mc.player.field3019 = this.field15960;
                                YPortSpeed.mc.player.prevPosY = this.field15960;
                                if (MovementUtil.isMoving()) {
                                    YPortSpeed.mc.player.field3013 = 0.099999994f;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @EventListener
    private void method10600(final Class5723 class5723) {
        if (this.isEnabled()) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15962 = 0.0;
            }
        }
    }
}
