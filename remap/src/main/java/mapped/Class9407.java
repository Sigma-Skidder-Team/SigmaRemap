// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;

public class Class9407
{
    public double field40373;
    public double field40374;
    public double field40375;
    
    public Class9407(final double field40373, final double field40374, final double field40375) {
        this.field40373 = field40373;
        this.field40374 = field40374;
        this.field40375 = field40375;
    }
    
    public Class9407(final BlockPos class354) {
        this.field40373 = class354.getX();
        this.field40374 = class354.getY();
        this.field40375 = class354.getZ();
    }
    
    public double method34993() {
        return this.field40373;
    }
    
    public double method34994() {
        return this.field40374;
    }
    
    public double method34995() {
        return this.field40375;
    }
    
    public Class9407 method34996(final double n, final double n2, final double n3) {
        return new Class9407(this.field40373 + n, this.field40374 + n2, this.field40375 + n3);
    }
    
    public Class9407 method34997() {
        return new Class9407(Math.floor(this.field40373), Math.floor(this.field40374), Math.floor(this.field40375));
    }
    
    public double method34998(final Class9407 class9407) {
        return Math.pow(class9407.field40373 - this.field40373, 2.0) + Math.pow(class9407.field40374 - this.field40374, 2.0) + Math.pow(class9407.field40375 - this.field40375, 2.0);
    }
    
    public Class9407 method34999(final Class9407 class9407) {
        return this.method34996(class9407.method34993(), class9407.method34994(), class9407.method34995());
    }
    
    public Vec3i method35000() {
        return new Vec3i(this.field40373, this.field40374, this.field40375);
    }
    
    @Override
    public String toString() {
        return "[" + this.field40373 + ";" + this.field40374 + ";" + this.field40375 + "]";
    }
    
    public Class9407 method35001(final Class9407 class9407) {
        return this.method34996(-class9407.method34993(), -class9407.method34994(), -class9407.method34995());
    }
    
    public Class9407 method35002(final Class9407 class9407) {
        return new Class9407(this.field40374 * class9407.field40375 - this.field40375 * class9407.field40374, this.field40375 * class9407.field40373 - this.field40373 * class9407.field40375, this.field40373 * class9407.field40374 - this.field40374 * class9407.field40373);
    }
    
    public Class9407 method35003() {
        final double sqrt = Math.sqrt(this.field40373 * this.field40373 + this.field40374 * this.field40374 + this.field40375 * this.field40375);
        return (sqrt >= 1.0E-4) ? new Class9407(this.field40373 / sqrt, this.field40374 / sqrt, this.field40375 / sqrt) : new Class9407(0.0, 0.0, 0.0);
    }
}
