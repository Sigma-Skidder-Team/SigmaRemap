// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class6055
{
    private boolean field24607;
    private String field24608;
    private String field24609;
    private String field24610;
    private List<String> field24611;
    
    public boolean method17990() {
        return this.field24607;
    }
    
    public String method17991() {
        return this.field24608;
    }
    
    public String method17992() {
        return this.field24609;
    }
    
    public String method17993() {
        return this.field24610;
    }
    
    public List<String> method17994() {
        return this.field24611;
    }
    
    public void method17995(final boolean field24607) {
        this.field24607 = field24607;
    }
    
    public void method17996(final String field24608) {
        this.field24608 = field24608;
    }
    
    public void method17997(final String field24609) {
        this.field24609 = field24609;
    }
    
    public void method17998(final String field24610) {
        this.field24610 = field24610;
    }
    
    public void method17999(final List<String> field24611) {
        this.field24611 = field24611;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class6055)) {
            return false;
        }
        final Class6055 class6055 = (Class6055)o;
        if (!class6055.method18000(this)) {
            return false;
        }
        if (this.method17990() == class6055.method17990()) {
            final String method17991 = this.method17991();
            final String method17992 = class6055.method17991();
            if (method17991 != null) {
                if (!method17991.equals(method17992)) {
                    return false;
                }
            }
            else if (method17992 != null) {
                return false;
            }
            final String method17993 = this.method17992();
            final String method17994 = class6055.method17992();
            if (method17993 != null) {
                if (!method17993.equals(method17994)) {
                    return false;
                }
            }
            else if (method17994 != null) {
                return false;
            }
            final String method17995 = this.method17993();
            final String method17996 = class6055.method17993();
            if (method17995 != null) {
                if (!method17995.equals(method17996)) {
                    return false;
                }
            }
            else if (method17996 != null) {
                return false;
            }
            final List<String> method17997 = this.method17994();
            final List<String> method17998 = class6055.method17994();
            if (method17997 != null) {
                return method17997.equals(method17998);
            }
            else return method17998 == null;
        }
        return false;
    }
    
    public boolean method18000(final Object o) {
        return o instanceof Class6055;
    }
    
    @Override
    public int hashCode() {
        final int n = 59 + (this.method17990() ? 79 : 97);
        final String method17991 = this.method17991();
        final int n2 = n * 59 + ((method17991 != null) ? method17991.hashCode() : 43);
        final String method17992 = this.method17992();
        final int n3 = n2 * 59 + ((method17992 != null) ? method17992.hashCode() : 43);
        final String method17993 = this.method17993();
        final int n4 = n3 * 59 + ((method17993 != null) ? method17993.hashCode() : 43);
        final List<String> method17994 = this.method17994();
        return n4 * 59 + ((method17994 != null) ? method17994.hashCode() : 43);
    }
    
    @Override
    public String toString() {
        return "PluginInfo(enabled=" + this.method17990() + ", name=" + this.method17991() + ", version=" + this.method17992() + ", main=" + this.method17993() + ", authors=" + this.method17994() + ")";
    }
    
    public Class6055(final boolean field24607, final String field24608, final String field24609, final String field24610, final List<String> field24611) {
        this.field24607 = field24607;
        this.field24608 = field24608;
        this.field24609 = field24609;
        this.field24610 = field24610;
        this.field24611 = field24611;
    }
}
