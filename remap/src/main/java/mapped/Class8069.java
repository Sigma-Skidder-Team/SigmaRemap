// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8069<A, B, C>
{
    private A field33239;
    private B field33240;
    private C field33241;
    
    @Override
    public String toString() {
        return "Triple{" + this.field33239 + ", " + this.field33240 + ", " + this.field33241 + '}';
    }
    
    public A method26469() {
        return this.field33239;
    }
    
    public B method26470() {
        return this.field33240;
    }
    
    public C method26471() {
        return this.field33241;
    }
    
    public void method26472(final A field33239) {
        this.field33239 = field33239;
    }
    
    public void method26473(final B field33240) {
        this.field33240 = field33240;
    }
    
    public void method26474(final C field33241) {
        this.field33241 = field33241;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class8069)) {
            return false;
        }
        final Class8069 class8069 = (Class8069)o;
        if (class8069.method26475(this)) {
            final Object method26469 = this.method26469();
            final Object method26470 = class8069.method26469();
            if (method26469 != null) {
                if (!method26469.equals(method26470)) {
                    return false;
                }
            }
            else if (method26470 != null) {
                return false;
            }
            final Object method26471 = this.method26470();
            final Object method26472 = class8069.method26470();
            if (method26471 != null) {
                if (!method26471.equals(method26472)) {
                    return false;
                }
            }
            else if (method26472 != null) {
                return false;
            }
            final Object method26473 = this.method26471();
            final Object method26474 = class8069.method26471();
            if (method26473 != null) {
                return method26473.equals(method26474);
            }
            else return method26474 == null;
        }
        return false;
    }
    
    public boolean method26475(final Object o) {
        return o instanceof Class8069;
    }
    
    @Override
    public int hashCode() {
        final int n = 1;
        final Object method26469 = this.method26469();
        final int n2 = n * 59 + ((method26469 != null) ? method26469.hashCode() : 43);
        final Object method26470 = this.method26470();
        final int n3 = n2 * 59 + ((method26470 != null) ? method26470.hashCode() : 43);
        final Object method26471 = this.method26471();
        return n3 * 59 + ((method26471 != null) ? method26471.hashCode() : 43);
    }
    
    public Class8069(final A field33239, final B field33240, final C field33241) {
        this.field33239 = field33239;
        this.field33240 = field33240;
        this.field33241 = field33241;
    }
}
