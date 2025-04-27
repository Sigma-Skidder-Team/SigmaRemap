// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;

public class Class6387
{
    public final String field25500;
    public final String field25501;
    public final String field25502;
    
    private Class6387(final String field25500) {
        this.field25500 = field25500;
        this.field25501 = null;
        this.field25502 = null;
    }
    
    private Class6387(final String field25500, final String field25501, final String field25502) {
        this.field25500 = field25500;
        this.field25501 = field25501;
        this.field25502 = field25502;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class6387 class6387 = (Class6387)o;
            if (Objects.equals(this.field25500, class6387.field25500)) {
                if (Objects.equals(this.field25501, class6387.field25501)) {
                    return Objects.equals(this.field25502, class6387.field25502);
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.field25500, this.field25501, this.field25502);
    }
    
    @Override
    public String toString() {
        return "Segment{fullText='" + this.field25500 + '\'' + ", linkTitle='" + this.field25501 + '\'' + ", linkUrl='" + this.field25502 + '\'' + '}';
    }
    
    public String method19064() {
        return this.method19065() ? this.field25501 : this.field25500;
    }
    
    public boolean method19065() {
        return this.field25501 != null;
    }
    
    public String method19066() {
        if (this.method19065()) {
            return this.field25502;
        }
        throw new IllegalStateException("Not a link: " + this);
    }
    
    public static Class6387 method19067(final String s, final String s2) {
        return new Class6387(null, s, s2);
    }
    
    public static Class6387 method19068(final String s) {
        return new Class6387(s);
    }
}
