// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class9474
{
    private final Class7576 field40736;
    private final Class7576 field40737;
    
    public Class9474(final Class7576 field40736, final Class7576 field40737) {
        if (field40736 != null && field40737 != null) {
            this.field40736 = field40736;
            this.field40737 = field40737;
            return;
        }
        throw new NullPointerException("Nodes must be provided.");
    }
    
    public Class7576 method35260() {
        return this.field40736;
    }
    
    public Class7576 method35261() {
        return this.field40737;
    }
    
    @Override
    public String toString() {
        return "<NodeTuple keyNode=" + this.field40736.toString() + "; valueNode=" + this.field40737.toString() + ">";
    }
}
