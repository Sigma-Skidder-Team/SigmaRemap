// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7277
{
    private int field28182;
    private int field28183;
    private int field28184;
    
    public int method22301() {
        return this.field28182;
    }
    
    public int method22302() {
        return this.field28183;
    }
    
    public int method22303() {
        return this.field28184;
    }
    
    public void method22304(final int field28182) {
        this.field28182 = field28182;
    }
    
    public void method22305(final int field28183) {
        this.field28183 = field28183;
    }
    
    public void method22306(final int field28184) {
        this.field28184 = field28184;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Class7277) {
            final Class7277 class7277 = (Class7277)o;
            return class7277.method22307(this) && this.method22301() == class7277.method22301() && this.method22302() == class7277.method22302() && this.method22303() == class7277.method22303();
        }
        return false;
    }
    
    public boolean method22307(final Object o) {
        return o instanceof Class7277;
    }
    
    @Override
    public int hashCode() {
        return ((1 * 59 + this.method22301()) * 59 + this.method22302()) * 59 + this.method22303();
    }
    
    @Override
    public String toString() {
        return "Vector(blockX=" + this.method22301() + ", blockY=" + this.method22302() + ", blockZ=" + this.method22303() + ")";
    }
    
    public Class7277(final int field28182, final int field28183, final int field28184) {
        this.field28182 = field28182;
        this.field28183 = field28183;
        this.field28184 = field28184;
    }
}
