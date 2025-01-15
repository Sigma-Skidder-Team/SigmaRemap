// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8531
{
    private static String[] field35806;
    public float field35807;
    public float field35808;
    public float field35809;
    public float field35810;
    
    public Class8531(final float field35807, final float field35808, final float field35809, final float field35810) {
        this.field35807 = field35807;
        this.field35808 = field35808;
        this.field35809 = field35809;
        this.field35810 = field35810;
    }
    
    public Class8531(final Class88 class88) {
        this.field35807 = Float.parseFloat(class88.method459(0));
        this.field35808 = Float.parseFloat(class88.method459(1));
        this.field35809 = Float.parseFloat(class88.method459(2));
        this.field35810 = Float.parseFloat(class88.method459(3));
    }
    
    public Class88 method28615() {
        final Class88 class88 = new Class88();
        class88.method493(0, Float.toString(this.field35807));
        class88.method493(1, Float.toString(this.field35808));
        class88.method493(2, Float.toString(this.field35809));
        class88.method493(3, Float.toString(this.field35810));
        return class88;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o != null && o instanceof Class8531) {
            final Class8531 class8531 = (Class8531)o;
            if (this.field35807 == class8531.field35807) {
                if (this.field35808 == class8531.field35808) {
                    if (this.field35809 == class8531.field35809) {
                        if (this.field35810 == class8531.field35810) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
}
