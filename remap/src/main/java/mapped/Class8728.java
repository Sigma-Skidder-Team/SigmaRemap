// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8728
{
    private final String field36660;
    private final String field36661;
    
    public Class8728(final String field36660, final String field36661) {
        if (field36660 == null) {
            throw new NullPointerException("scheme == null");
        }
        if (field36661 != null) {
            this.field36660 = field36660;
            this.field36661 = field36661;
            return;
        }
        throw new NullPointerException("realm == null");
    }
    
    public String method30120() {
        return this.field36660;
    }
    
    public String method30121() {
        return this.field36661;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Class8728) {
            if (((Class8728)o).field36660.equals(this.field36660)) {
                return ((Class8728) o).field36661.equals(this.field36661);
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * 29 + this.field36661.hashCode()) + this.field36660.hashCode();
    }
    
    @Override
    public String toString() {
        return this.field36660 + " realm=\"" + this.field36661 + "\"";
    }
}
