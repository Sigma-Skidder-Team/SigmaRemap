// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6655
{
    private final int field26311;
    private final Class8191 field26312;
    
    public Class8087 method20236(final Class8087 class8087, final Integer[] array) {
        if (this.field26312 == null) {
            return class8087;
        }
        return this.field26312.method27127(class8087, array);
    }
    
    public int method20237() {
        return this.field26311;
    }
    
    public Class8191 method20238() {
        return this.field26312;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class6655)) {
            return false;
        }
        final Class6655 class6655 = (Class6655)o;
        if (!class6655.method20239(this)) {
            return false;
        }
        if (this.method20237() == class6655.method20237()) {
            final Class8191 method20238 = this.method20238();
            final Class8191 method20239 = class6655.method20238();
            if (method20238 != null) {
                return method20238.equals(method20239);
            }
            else return method20239 == null;
        }
        return false;
    }
    
    public boolean method20239(final Object o) {
        return o instanceof Class6655;
    }
    
    @Override
    public int hashCode() {
        final int n = 59 + this.method20237();
        final Class8191 method20238 = this.method20238();
        return n * 59 + ((method20238 != null) ? method20238.hashCode() : 43);
    }
    
    @Override
    public String toString() {
        return "ParticleRewriter.NewParticle(id=" + this.method20237() + ", handler=" + this.method20238() + ")";
    }
    
    public Class6655(final int field26311, final Class8191 field26312) {
        this.field26311 = field26311;
        this.field26312 = field26312;
    }
}
