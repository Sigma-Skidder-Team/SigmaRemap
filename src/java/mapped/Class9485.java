// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9485
{
    private final Class2075 field40770;
    private final String field40771;
    
    public Class9485(final Class2075 field40770, final String field40771) {
        this.field40770 = field40770;
        this.field40771 = field40771;
    }
    
    public Class2075 method35309() {
        return this.field40770;
    }
    
    public String method35310() {
        return this.field40771;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final Class9485 class9485 = (Class9485)o;
        if (this.field40770 == class9485.field40770) {
            if (this.field40771 == null) {
                if (class9485.field40771 != null) {
                    return false;
                }
            }
            else if (!this.field40771.equals(class9485.field40771)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "ClickEvent{action=" + this.field40770 + ", value='" + this.field40771 + '\'' + '}';
    }
    
    @Override
    public int hashCode() {
        return 31 * this.field40770.hashCode() + ((this.field40771 == null) ? 0 : this.field40771.hashCode());
    }
}
