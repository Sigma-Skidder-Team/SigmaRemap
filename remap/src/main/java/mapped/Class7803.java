// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7803<X, Y>
{
    private X field31969;
    private Y field31970;
    
    public Class7803(final X field31969, final Y field31970) {
        this.field31969 = field31969;
        this.field31970 = field31970;
    }
    
    @Override
    public String toString() {
        return "Pair{" + this.field31969 + ", " + this.field31970 + '}';
    }
    
    public X method25203() {
        return this.field31969;
    }
    
    public Y method25204() {
        return this.field31970;
    }
    
    public void method25205(final X field31969) {
        this.field31969 = field31969;
    }
    
    public void method25206(final Y field31970) {
        this.field31970 = field31970;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class7803)) {
            return false;
        }
        final Class7803 class7803 = (Class7803)o;
        if (class7803.method25207(this)) {
            final Object method25203 = this.method25203();
            final Object method25204 = class7803.method25203();
            if (method25203 != null) {
                if (!method25203.equals(method25204)) {
                    return false;
                }
            }
            else if (method25204 != null) {
                return false;
            }
            final Object method25205 = this.method25204();
            final Object method25206 = class7803.method25204();
            if (method25205 != null) {
                return method25205.equals(method25206);
            }
            else return method25206 == null;
        }
        return false;
    }
    
    public boolean method25207(final Object o) {
        return o instanceof Class7803;
    }
    
    @Override
    public int hashCode() {
        final int n = 1;
        final Object method25203 = this.method25203();
        final int n2 = n * 59 + ((method25203 != null) ? method25203.hashCode() : 43);
        final Object method25204 = this.method25204();
        return n2 * 59 + ((method25204 != null) ? method25204.hashCode() : 43);
    }
}
