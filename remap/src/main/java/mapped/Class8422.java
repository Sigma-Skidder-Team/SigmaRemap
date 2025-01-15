// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3i;

public class Class8422
{
    public double field34567;
    public double field34568;
    public double field34569;
    
    public Class8422(final double field34567, final double field34568, final double field34569) {
        this.field34567 = field34567;
        this.field34568 = field34568;
        this.field34569 = field34569;
    }
    
    public Class8422(final BlockPos class354) {
        this.field34567 = class354.getX();
        this.field34568 = class354.getY();
        this.field34569 = class354.getZ();
    }
    
    public double method28112() {
        return this.field34567;
    }
    
    public double method28113() {
        return this.field34568;
    }
    
    public double method28114() {
        return this.field34569;
    }
    
    public Class8422 method28115(final double n, final double n2, final double n3) {
        return new Class8422(this.field34567 + n, this.field34568 + n2, this.field34569 + n3);
    }
    
    public Class8422 method28116() {
        return new Class8422(Math.floor(this.field34567), Math.floor(this.field34568), Math.floor(this.field34569));
    }
    
    public BlockPos method28117() {
        return new BlockPos(Math.floor(this.field34567), Math.floor(this.field34568), Math.floor(this.field34569));
    }
    
    public double method28118(final Class8422 class8422) {
        return Math.pow(class8422.field34567 - this.field34567, 2.0) + Math.pow(class8422.field34568 - this.field34568, 2.0) + Math.pow(class8422.field34569 - this.field34569, 2.0);
    }
    
    public Class8422 method28119(final Class8422 class8422) {
        return this.method28115(class8422.method28112(), class8422.method28113(), class8422.method28114());
    }
    
    public Vec3i method28120() {
        return new Vec3i(this.field34567, this.field34568, this.field34569);
    }
    
    @Override
    public String toString() {
        return "[" + this.field34567 + ";" + this.field34568 + ";" + this.field34569 + "]";
    }
    
    public Class8422 method28121(final Class8422 class8422) {
        return this.method28115(-class8422.method28112(), -class8422.method28113(), -class8422.method28114());
    }
    
    public Class8422 method28122(final Class8422 class8422) {
        return new Class8422(this.field34568 * class8422.field34569 - this.field34569 * class8422.field34568, this.field34569 * class8422.field34567 - this.field34567 * class8422.field34569, this.field34567 * class8422.field34568 - this.field34568 * class8422.field34567);
    }
    
    public Class8422 method28123() {
        final double sqrt = Math.sqrt(this.field34567 * this.field34567 + this.field34568 * this.field34568 + this.field34569 * this.field34569);
        return (sqrt >= 1.0E-4) ? new Class8422(this.field34567 / sqrt, this.field34568 / sqrt, this.field34569 / sqrt) : new Class8422(0.0, 0.0, 0.0);
    }
}
