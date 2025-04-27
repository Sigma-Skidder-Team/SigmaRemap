// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8844
{
    private float field37170;
    private float field37171;
    private float field37172;
    
    public float method30903() {
        return this.field37170;
    }
    
    public float method30904() {
        return this.field37171;
    }
    
    public float method30905() {
        return this.field37172;
    }
    
    public void method30906(final float field37170) {
        this.field37170 = field37170;
    }
    
    public void method30907(final float field37171) {
        this.field37171 = field37171;
    }
    
    public void method30908(final float field37172) {
        this.field37172 = field37172;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Class8844) {
            final Class8844 class8844 = (Class8844)o;
            return class8844.method30909(this) && Float.compare(this.method30903(), class8844.method30903()) == 0 && Float.compare(this.method30904(), class8844.method30904()) == 0 && Float.compare(this.method30905(), class8844.method30905()) == 0;
        }
        return false;
    }
    
    public boolean method30909(final Object o) {
        return o instanceof Class8844;
    }
    
    @Override
    public int hashCode() {
        return ((59 + Float.floatToIntBits(this.method30903())) * 59 + Float.floatToIntBits(this.method30904())) * 59 + Float.floatToIntBits(this.method30905());
    }
    
    @Override
    public String toString() {
        return "EulerAngle(x=" + this.method30903() + ", y=" + this.method30904() + ", z=" + this.method30905() + ")";
    }
    
    public Class8844(final float field37170, final float field37171, final float field37172) {
        this.field37170 = field37170;
        this.field37171 = field37171;
        this.field37172 = field37172;
    }
}
