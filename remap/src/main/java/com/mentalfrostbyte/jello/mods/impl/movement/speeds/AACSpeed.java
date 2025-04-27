// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.speeds;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;

public class AACSpeed extends Module
{
    private int field15686;
    private int field15687;
    private int field15688;
    private double field15689;
    private double field15690;
    private double field15691;
    private float field15692;
    
    public AACSpeed() {
        super(Category.MOVEMENT, "AAC", "Speed for AAC");
        this.field15691 = 0.0;
        this.addSetting(new StringSetting("Mode", "Mode", 0, "Basic", "Fast1", "Fast2").setPremiumMode("Fast2"));
        this.addSetting(new BooleanSetting("Fluid Fix", "Makes your jump fluid.", true));
        this.addSetting(new BooleanSetting("Auto Jump", "Automatically jumps for you.", true));
    }
    
    @Override
    public void onEnable() {
        this.field15686 = -1;
        this.field15687 = 0;
        this.field15691 = AACSpeed.mc.player.posY;
        this.field15692 = MovementUtil.method23144()[0];
        this.field15688 = 0;
    }
    
    @Override
    public void onDisable() {
        MovementUtil.method23154(0.27, MovementUtil.method23144()[0], this.field15692, 45.0f);
    }
    
    @EventListener
    public void method10166(final Class5723 class5723) {
        if (this.isEnabled()) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15687 = 0;
            }
        }
    }
    
    @EventListener
    public void method10167(final Class5717 class5717) {
        if (!this.isEnabled()) {
            return;
        }
        final String method9887 = this.getStringSettingValueByName("Mode");
        if (ColorUtils.method19160(AACSpeed.mc.player, 0.01f)) {
            if (this.field15688 <= 1) {
                ++this.field15688;
            }
            else {
                this.field15687 = 0;
                this.field15686 = -1;
            }
            if (ColorUtils.method19114() && this.getBooleanValueFromSettingName("Auto Jump")) {
                AACSpeed.mc.player.method2725();
                class5717.method16975(AACSpeed.mc.player.getMotion().y);
            }
        }
        else if (this.field15686 >= 0) {
            ++this.field15686;
        }
        if ((AACSpeed.mc.player.field2970 == 0.0f && AACSpeed.mc.player.field2968 == 0.0f) || AACSpeed.mc.player.collidedHorizontally || AACSpeed.mc.player.field2970 <= 0.0f) {
            this.field15687 = 0;
        }
        final String s = method9887;
        switch (s) {
            case "Basic": {
                this.field15689 = method10174(this.field15686, this.field15687, () -> this.field15687 = 0);
                break;
            }
            case "Fast1": {
                this.field15689 = this.method10171(this.field15686, this.field15687);
                class5717.method16975(this.field15690 = this.method10170(this.field15686));
                AACSpeed.mc.player.getMotion().y = this.field15690;
                break;
            }
            case "Fast2": {
                this.field15689 = this.method10173(this.field15686, this.field15687);
                class5717.method16975(this.field15690 = this.method10172(this.field15686));
                AACSpeed.mc.player.getMotion().y = this.field15690;
                break;
            }
        }
        if (!ColorUtils.method19114()) {
            this.field15689 = 0.0;
        }
        if (AACSpeed.mc.player.collidedHorizontally) {
            this.field15689 = ((this.field15689 * 0.9 < 0.27) ? 0.27 : (this.field15689 * 0.9));
        }
        if (this.field15686 >= 0) {
            this.field15692 = MovementUtil.method23153(class5717, this.field15689, MovementUtil.method23144()[0], this.field15692, 45.0f);
        }
        ColorUtils.method19155(class5717.method16974());
    }
    
    @EventListener
    public void method10168(final Class5741 class5741) {
        if (!this.isEnabled()) {
            return;
        }
        if (!this.getBooleanValueFromSettingName("Fluid Fix")) {
            return;
        }
        if (AACSpeed.mc.player.collided) {
            AACSpeed.mc.player.posY = AACSpeed.mc.player.getBoundingBox().minY;
            this.field15691 = AACSpeed.mc.player.posY;
            this.field15686 = -1;
            return;
        }
        final String method9887 = this.getStringSettingValueByName("Mode");
        float n = 13.0f;
        if (!method9887.equals("Fast1")) {
            if (method9887.equals("Basic")) {
                return;
            }
        }
        else {
            n = 11.0f;
        }
        if (this.field15686 <= n && this.field15686 >= 0) {
            AACSpeed.mc.player.posY = this.field15691 + Math.cos(Math.toRadians(this.field15686 / n * 180.0f - 90.0f));
            AACSpeed.mc.player.field3013 = 0.0f;
        }
    }
    
    @EventListener
    public void method10169(final Class5722 class5722) {
        this.field15686 = 0;
        this.field15688 = 0;
        this.field15692 = MovementUtil.method23144()[0];
        final String method9887 = this.getStringSettingValueByName("Mode");
        switch (method9887) {
            case "Basic": {
                if (this.field15687 < 3) {
                    ++this.field15687;
                    break;
                }
                break;
            }
            case "Fast1": {
                if (this.field15687 < 5) {
                    ++this.field15687;
                }
                if (this.field15686 < 11 && this.field15686 > 0) {
                    this.field15687 = 0;
                    break;
                }
                break;
            }
            case "Fast2": {
                if (this.field15687 < 4) {
                    ++this.field15687;
                    break;
                }
                break;
            }
        }
    }
    
    private double method10170(final int n) {
        double field22771 = AACSpeed.mc.player.getMotion().y;
        final boolean method19160 = ColorUtils.method19160(AACSpeed.mc.player, 0.37f);
        final double[] array = { 0.41, 0.309, 0.21, 0.113, 0.03, -0.05, -0.12, -0.192, -0.26, -0.33, method19160 ? -0.0 : -0.4, method19160 ? -0.13 : -0.47 };
        if (n >= 0) {
            if (n < array.length) {
                field22771 = array[n];
            }
        }
        return field22771;
    }
    
    private double method10171(final int n, final int n2) {
        final boolean method19160 = ColorUtils.method19160(AACSpeed.mc.player, 0.37f);
        final double[] array = { 0.497, 0.671, 0.719, 0.733, 0.738 };
        final double[] array2 = { 0.303, 0.407, 0.436, 0.444, 0.447 };
        final double[] array3 = { 0.0, 0.003, 0.004, 0.004, 0.004 };
        final double[] array4 = { 0.605, 0.685, 0.708, 0.716, 0.719 };
        final double[] array5 = { 0.367, 0.415, 0.429, 0.434, 0.434 };
        if (n >= 0) {
            if (n2 >= 1) {
                if (n2 <= 5) {
                    if (n != 0) {
                        if (n != 1) {
                            if (n == 10 && method19160) {
                                this.field15689 = array4[n2 - 1];
                            }
                            else if (n == 11 && method19160) {
                                this.field15689 = array5[n2 - 1];
                            }
                            else {
                                this.field15689 -= array3[n2 - 1];
                            }
                        }
                        else {
                            this.field15689 = array2[n2 - 1];
                        }
                    }
                    else {
                        this.field15689 = array[n2 - 1];
                    }
                    if (n2 == 1) {
                        if (n == 2) {
                            this.field15689 -= 0.002;
                        }
                    }
                    if (n2 == 2) {
                        if (n == 2 || n == 3) {
                            this.field15689 -= 0.001;
                        }
                    }
                }
            }
        }
        return this.field15689;
    }
    
    private double method10172(final int n) {
        double field22771 = AACSpeed.mc.player.getMotion().y;
        final boolean method19160 = ColorUtils.method19160(AACSpeed.mc.player, 0.37f);
        final double[] array = { 0.41, 0.309, 0.21, 0.113, 0.03, -0.06, -0.14, -0.22, -0.29, 0.0, -0.082, -0.11, 0.0, -0.18 };
        if (n >= 0) {
            if (n < array.length) {
                field22771 = array[n];
            }
        }
        if (n >= 9) {
            if (n <= 11) {
                if (!method19160) {
                    field22771 -= 0.36;
                }
            }
        }
        if (n >= 12) {
            if (n <= 13) {
                if (!method19160) {
                    field22771 -= 0.5;
                }
            }
        }
        return field22771;
    }
    
    private double method10173(final int n, final int n2) {
        final boolean method19160 = ColorUtils.method19160(AACSpeed.mc.player, 0.37f);
        final double[] array = { 0.497, 0.709, 0.746, 0.753 };
        final double[] array2 = { 0.303, 0.43, 0.4525, 0.456 };
        final double[] array3 = { 0.0, 0.0036, 0.0041, 0.0042 };
        final double[] array4 = { 0.605, 0.707, 0.728, 0.731 };
        final double[] array5 = { 0.367, 0.429, 0.441, 0.443 };
        final double[] array6 = { 0.668, 0.73, 0.741, 0.743 };
        final double[] array7 = { 0.405, 0.442, 0.449, 0.45 };
        if (n >= 0) {
            if (n2 >= 1) {
                if (n2 <= 4) {
                    if (n != 0) {
                        if (n != 1) {
                            if (n == 9 && method19160) {
                                this.field15689 = array4[n2 - 1];
                            }
                            else if (n == 10 && method19160) {
                                this.field15689 = array5[n2 - 1];
                            }
                            else if (n == 12 && method19160) {
                                this.field15689 = array6[n2 - 1];
                            }
                            else if (n == 13 && method19160) {
                                this.field15689 = array7[n2 - 1];
                            }
                            else {
                                this.field15689 -= array3[n2 - 1];
                            }
                        }
                        else {
                            this.field15689 = array2[n2 - 1];
                        }
                    }
                    else {
                        this.field15689 = array[n2 - 1];
                    }
                    if (n2 == 1) {
                        if (n != 2) {
                            if (n == 11) {
                                this.field15689 -= 0.003;
                            }
                        }
                        else {
                            this.field15689 -= 0.002;
                        }
                    }
                    if (n2 == 2) {
                        if (n == 2 || n == 3) {
                            this.field15689 -= 0.001;
                        }
                    }
                }
            }
        }
        return this.field15689;
    }
    
    public static double method10174(final int n, final int n2, final Runnable runnable) {
        double n3 = 0.29;
        final double n4 = 0.3019;
        final double n5 = 0.0286 - n / 1000.0;
        final double[] array = { 0.497, 0.3031, 0.302, n4, n4, n4, n4, n4, n4, n4, n4, 0.3, 0.301, 0.298, 0.297 };
        final double[] array2 = { 0.1069, 0.0642, 0.0629, 0.0607, 0.0584, 0.0561, 0.0539, 0.0517, 0.0496, 0.0475, 0.0455, 0.045, 0.042, 0.042, 0.042 };
        final double[] array3 = { 0.046, n5, n5, n5, n5, n5, n5, n5, n5, n5, n5, 0.018, n5 + 0.001, n5 + 0.001, n5 + 0.001 };
        if (n >= 0) {
            if (n < array.length) {
                n3 = array[n];
            }
            if (n2 >= 2) {
                if (n < array2.length) {
                    n3 += array2[n];
                }
            }
            if (n2 >= 3) {
                if (n < array3.length) {
                    n3 += array3[n];
                }
            }
            if (n == 12) {
                if (n2 <= 2) {
                    runnable.run();
                }
            }
            if (AACSpeed.mc.player.field2970 <= 0.0f) {
                n3 -= 0.06;
            }
            if (AACSpeed.mc.player.collidedHorizontally) {
                n3 -= 0.1;
                runnable.run();
            }
            return n3;
        }
        return n3;
    }
}
