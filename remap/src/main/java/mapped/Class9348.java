// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9348
{
    private Class5260 field40121;
    private Object field40122;
    
    public Class5260 method34655() {
        return this.field40121;
    }
    
    public Object method34656() {
        return this.field40122;
    }
    
    public void method34657(final Class5260 field40121) {
        this.field40121 = field40121;
    }
    
    public void method34658(final Object field40122) {
        this.field40122 = field40122;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class9348)) {
            return false;
        }
        final Class9348 class9348 = (Class9348)o;
        if (class9348.method34659(this)) {
            final Class5260 method34655 = this.method34655();
            final Class5260 method34656 = class9348.method34655();
            if (method34655 != null) {
                if (!method34655.equals(method34656)) {
                    return false;
                }
            }
            else if (method34656 != null) {
                return false;
            }
            final Object method34657 = this.method34656();
            final Object method34658 = class9348.method34656();
            if (method34657 != null) {
                return method34657.equals(method34658);
            }
            else return method34658 == null;
        }
        return false;
    }
    
    public boolean method34659(final Object o) {
        return o instanceof Class9348;
    }
    
    @Override
    public int hashCode() {
        final int n = 1;
        final Class5260 method34655 = this.method34655();
        final int n2 = n * 59 + ((method34655 != null) ? method34655.hashCode() : 43);
        final Object method34656 = this.method34656();
        return n2 * 59 + ((method34656 != null) ? method34656.hashCode() : 43);
    }
    
    @Override
    public String toString() {
        return "Particle.ParticleData(type=" + this.method34655() + ", value=" + this.method34656() + ")";
    }
    
    public Class9348(final Class5260 field40121, final Object field40122) {
        this.field40121 = field40121;
        this.field40122 = field40122;
    }
}
