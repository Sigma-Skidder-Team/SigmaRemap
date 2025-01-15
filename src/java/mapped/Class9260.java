// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9260
{
    public final Class9336 field39720;
    public final int field39721;
    public final int field39722;
    
    public Class9260(final Class9336 field39720, final int n) {
        this.field39720 = field39720;
        this.field39721 = Class7498.method23352(field39720.method34592(), n);
        this.field39722 = Class7498.method23352(field39720.method34593(), n);
    }
    
    @Override
    public String toString() {
        return "Holder{width=" + this.field39721 + ", height=" + this.field39722 + ", name=" + this.field39720.method34591() + '}';
    }
}
