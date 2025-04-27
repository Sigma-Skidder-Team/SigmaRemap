// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

public class Class3586 extends Class3446
{
    private static String[] field16712;
    private final Class830 field16713;
    private final double field16714;
    private final int field16715;
    private boolean field16716;
    
    public Class3586(final Class830 field16713, final double field16714, final int field16715) {
        this.field16713 = field16713;
        this.field16714 = field16714;
        this.field16715 = field16715;
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16713.world.method6703()) {
            if (this.field16713.method1706()) {
                return this.field16713.getPosY() < this.field16715 - 2;
            }
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return this.method11013() && !this.field16716;
    }
    
    @Override
    public void method11016() {
        if (this.field16713.getPosY() < this.field16715 - 1) {
            if (this.field16713.method4150().method24731() || this.field16713.method4946()) {
                final Vec3d method24905 = Class7775.method24905(this.field16713, 4, 8, new Vec3d(this.field16713.getPosX(), this.field16715 - 1, this.field16713.getPosZ()));
                if (method24905 == null) {
                    this.field16716 = true;
                    return;
                }
                this.field16713.method4150().method24724(method24905.x, method24905.y, method24905.z, this.field16714);
            }
        }
    }
    
    @Override
    public void method11015() {
        this.field16713.method4947(true);
        this.field16716 = false;
    }
    
    @Override
    public void method11018() {
        this.field16713.method4947(false);
    }
}
