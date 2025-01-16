// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9100
{
    private Object[] field38545;
    private int field38546;
    
    public Class9100(final Object[] array) {
        this.field38546 = 0;
        this.field38545 = array.clone();
    }
    
    public Class9100(final Object o, final Object o2) {
        this(new Object[] { o, o2 });
    }
    
    public Class9100(final Object o, final Object o2, final Object o3) {
        this(new Object[] { o, o2, o3 });
    }
    
    public Class9100(final Object o, final Object o2, final Object o3, final Object o4) {
        this(new Object[] { o, o2, o3, o4 });
    }
    
    @Override
    public int hashCode() {
        if (this.field38546 == 0) {
            this.field38546 = 7;
            for (int i = 0; i < this.field38545.length; ++i) {
                final Object o = this.field38545[i];
                if (o != null) {
                    this.field38546 = 31 * this.field38546 + o.hashCode();
                }
            }
        }
        return this.field38546;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class9100)) {
            return false;
        }
        final Object[] method32894 = ((Class9100)o).method32894();
        if (method32894.length == this.field38545.length) {
            for (int i = 0; i < this.field38545.length; ++i) {
                if (!method32893(this.field38545[i], method32894[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    private static boolean method32893(final Object o, final Object obj) {
        return o == obj || (o != null && obj != null && o.equals(obj));
    }
    
    private Object[] method32894() {
        return this.field38545;
    }
    
    public Object[] method32895() {
        return this.field38545.clone();
    }
    
    @Override
    public String toString() {
        return "[" + Config.method28888(this.field38545) + "]";
    }
}
