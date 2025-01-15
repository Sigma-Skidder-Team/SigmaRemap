// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7276
{
    private int field28179;
    private Class1967 field28180;
    private Object field28181;
    
    public Class7276(final int field28179, final Class1967 field28180, final Object field28181) {
        this.field28179 = field28179;
        this.field28180 = field28180;
        this.field28181 = field28181;
    }
    
    public int method22294() {
        return this.field28179;
    }
    
    public Class1967 method22295() {
        return this.field28180;
    }
    
    public Object method22296() {
        return this.field28181;
    }
    
    public void method22297(final int field28179) {
        this.field28179 = field28179;
    }
    
    public void method22298(final Class1967 field28180) {
        this.field28180 = field28180;
    }
    
    public void method22299(final Object field28181) {
        this.field28181 = field28181;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class7276)) {
            return false;
        }
        final Class7276 class7276 = (Class7276)o;
        if (!class7276.method22300(this)) {
            return false;
        }
        if (this.method22294() == class7276.method22294()) {
            final Class1967 method22295 = this.method22295();
            final Class1967 method22296 = class7276.method22295();
            if (method22295 != null) {
                if (!method22295.equals(method22296)) {
                    return false;
                }
            }
            else if (method22296 != null) {
                return false;
            }
            final Object method22297 = this.method22296();
            final Object method22298 = class7276.method22296();
            if (method22297 != null) {
                if (!method22297.equals(method22298)) {
                    return false;
                }
            }
            else if (method22298 != null) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    public boolean method22300(final Object o) {
        return o instanceof Class7276;
    }
    
    @Override
    public int hashCode() {
        final int n = 1 * 59 + this.method22294();
        final Class1967 method22295 = this.method22295();
        final int n2 = n * 59 + ((method22295 != null) ? method22295.hashCode() : 43);
        final Object method22296 = this.method22296();
        return n2 * 59 + ((method22296 != null) ? method22296.hashCode() : 43);
    }
    
    @Override
    public String toString() {
        return "Metadata(id=" + this.method22294() + ", metaType=" + this.method22295() + ", value=" + this.method22296() + ")";
    }
}
