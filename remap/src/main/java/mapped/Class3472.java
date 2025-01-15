// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.EnumSet;

public class Class3472 extends Class3446
{
    private static final Class7843 field16357;
    public final Class787 field16358;
    private final double field16359;
    private double field16360;
    private double field16361;
    private double field16362;
    private double field16363;
    private double field16364;
    public Class512 field16365;
    private int field16366;
    private boolean field16367;
    private final Class120 field16368;
    private final boolean field16369;
    
    public Class3472(final Class787 class787, final double n, final Class120 class788, final boolean b) {
        this(class787, n, b, class788);
    }
    
    public Class3472(final Class787 field16358, final double field16359, final boolean field16360, final Class120 field16361) {
        this.field16358 = field16358;
        this.field16359 = field16359;
        this.field16368 = field16361;
        this.field16369 = field16360;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
        if (!(field16358.method4150() instanceof Class7747) && !(field16358.method4150() instanceof Class7750)) {
            throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
        }
    }
    
    @Override
    public boolean method11013() {
        if (this.field16366 <= 0) {
            this.field16365 = this.field16358.world.method7135(Class3472.field16357, this.field16358);
            return this.field16365 != null && (this.method11038(this.field16365.getHeldItemMainhand()) || this.method11038(this.field16365.method2714()));
        }
        --this.field16366;
        return false;
    }
    
    public boolean method11038(final ItemStack class8321) {
        return this.field16368.test(class8321);
    }
    
    @Override
    public boolean method11017() {
        if (this.method11039()) {
            if (this.field16358.method1734(this.field16365) >= 36.0) {
                this.field16360 = this.field16365.getPosX();
                this.field16361 = this.field16365.getPosY();
                this.field16362 = this.field16365.getPosZ();
            }
            else {
                if (this.field16365.method1733(this.field16360, this.field16361, this.field16362) > 0.010000000000000002) {
                    return false;
                }
                if (Math.abs(this.field16365.rotationPitch - this.field16363) > 5.0 || Math.abs(this.field16365.rotationYaw - this.field16364) > 5.0) {
                    return false;
                }
            }
            this.field16363 = this.field16365.rotationPitch;
            this.field16364 = this.field16365.rotationYaw;
        }
        return this.method11013();
    }
    
    public boolean method11039() {
        return this.field16369;
    }
    
    @Override
    public void method11015() {
        this.field16360 = this.field16365.getPosX();
        this.field16361 = this.field16365.getPosY();
        this.field16362 = this.field16365.getPosZ();
        this.field16367 = true;
    }
    
    @Override
    public void method11018() {
        this.field16365 = null;
        this.field16358.method4150().method24733();
        this.field16366 = 100;
        this.field16367 = false;
    }
    
    @Override
    public void method11016() {
        this.field16358.method4147().method24667(this.field16365, (float)(this.field16358.method4174() + 20), (float)this.field16358.method4173());
        if (this.field16358.method1734(this.field16365) >= 6.25) {
            this.field16358.method4150().method24725(this.field16365, this.field16359);
        }
        else {
            this.field16358.method4150().method24733();
        }
    }
    
    public boolean method11040() {
        return this.field16367;
    }
    
    static {
        field16357 = new Class7843().method25337(10.0).method25338().method25339().method25341().method25340();
    }
}
