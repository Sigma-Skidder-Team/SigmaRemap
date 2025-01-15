// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7549
{
    private final boolean field29946;
    private final boolean field29947;
    private final boolean field29948;
    private final boolean field29949;
    private final Class222 field29950;
    private int field29951;
    
    public Class7549(final boolean field29946, final boolean field29947, final boolean field29948, final boolean field29949, final Class222 field29950, final int field29951) {
        this.field29946 = field29946;
        this.field29947 = field29947;
        this.field29948 = field29948;
        this.field29949 = field29949;
        this.field29950 = field29950;
        this.field29951 = field29951;
    }
    
    public boolean method23709() {
        return this.field29946;
    }
    
    public boolean method23710() {
        return this.field29947;
    }
    
    public boolean method23711() {
        return this.field29948;
    }
    
    public boolean method23712() {
        return this.field29949;
    }
    
    public Class222 method23713() {
        return this.field29950;
    }
    
    public int method23714() {
        return this.field29951;
    }
    
    @Override
    public String toString() {
        return "DoorConnectionHandler.DoorData(lower=" + this.method23709() + ", rightHinge=" + this.method23710() + ", powered=" + this.method23711() + ", open=" + this.method23712() + ", facing=" + this.method23713() + ", type=" + this.method23714() + ")";
    }
}
