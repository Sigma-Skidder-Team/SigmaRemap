// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;

public class Class8867
{
    private String field37271;
    private String field37272;
    private int field37273;
    private Set<Integer> field37274;
    private String field37275;
    private String field37276;
    private String field37277;
    
    public String method31140() {
        return this.field37271;
    }
    
    public String method31141() {
        return this.field37272;
    }
    
    public int method31142() {
        return this.field37273;
    }
    
    public Set<Integer> method31143() {
        return this.field37274;
    }
    
    public String method31144() {
        return this.field37275;
    }
    
    public String method31145() {
        return this.field37276;
    }
    
    public String method31146() {
        return this.field37277;
    }
    
    public void method31147(final String field37271) {
        this.field37271 = field37271;
    }
    
    public void method31148(final String field37272) {
        this.field37272 = field37272;
    }
    
    public void method31149(final int field37273) {
        this.field37273 = field37273;
    }
    
    public void method31150(final Set<Integer> field37274) {
        this.field37274 = field37274;
    }
    
    public void method31151(final String field37275) {
        this.field37275 = field37275;
    }
    
    public void method31152(final String field37276) {
        this.field37276 = field37276;
    }
    
    public void method31153(final String field37277) {
        this.field37277 = field37277;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class8867)) {
            return false;
        }
        final Class8867 class8867 = (Class8867)o;
        if (class8867.method31154(this)) {
            final String method31140 = this.method31140();
            final String method31141 = class8867.method31140();
            if (method31140 != null) {
                if (!method31140.equals(method31141)) {
                    return false;
                }
            }
            else if (method31141 != null) {
                return false;
            }
            final String method31142 = this.method31141();
            final String method31143 = class8867.method31141();
            if (method31142 != null) {
                if (!method31142.equals(method31143)) {
                    return false;
                }
            }
            else if (method31143 != null) {
                return false;
            }
            if (this.method31142() == class8867.method31142()) {
                final Set<Integer> method31144 = this.method31143();
                final Set<Integer> method31145 = class8867.method31143();
                if (method31144 != null) {
                    if (!method31144.equals(method31145)) {
                        return false;
                    }
                }
                else if (method31145 != null) {
                    return false;
                }
                final String method31146 = this.method31144();
                final String method31147 = class8867.method31144();
                if (method31146 != null) {
                    if (!method31146.equals(method31147)) {
                        return false;
                    }
                }
                else if (method31147 != null) {
                    return false;
                }
                final String method31148 = this.method31145();
                final String method31149 = class8867.method31145();
                if (method31148 != null) {
                    if (!method31148.equals(method31149)) {
                        return false;
                    }
                }
                else if (method31149 != null) {
                    return false;
                }
                final String method31150 = this.method31146();
                final String method31151 = class8867.method31146();
                if (method31150 != null) {
                    return method31150.equals(method31151);
                }
                else return method31151 == null;
            }
            return false;
        }
        return false;
    }
    
    public boolean method31154(final Object o) {
        return o instanceof Class8867;
    }
    
    @Override
    public int hashCode() {
        final int n = 1;
        final String method31140 = this.method31140();
        final int n2 = n * 59 + ((method31140 != null) ? method31140.hashCode() : 43);
        final String method31141 = this.method31141();
        final int n3 = (n2 * 59 + ((method31141 != null) ? method31141.hashCode() : 43)) * 59 + this.method31142();
        final Set<Integer> method31142 = this.method31143();
        final int n4 = n3 * 59 + ((method31142 != null) ? method31142.hashCode() : 43);
        final String method31143 = this.method31144();
        final int n5 = n4 * 59 + ((method31143 != null) ? method31143.hashCode() : 43);
        final String method31144 = this.method31145();
        final int n6 = n5 * 59 + ((method31144 != null) ? method31144.hashCode() : 43);
        final String method31145 = this.method31146();
        return n6 * 59 + ((method31145 != null) ? method31145.hashCode() : 43);
    }
    
    @Override
    public String toString() {
        return "VersionInfo(javaVersion=" + this.method31140() + ", operatingSystem=" + this.method31141() + ", serverProtocol=" + this.method31142() + ", enabledProtocols=" + this.method31143() + ", platformName=" + this.method31144() + ", platformVersion=" + this.method31145() + ", pluginVersion=" + this.method31146() + ")";
    }
    
    public Class8867(final String field37271, final String field37272, final int field37273, final Set<Integer> field37274, final String field37275, final String field37276, final String field37277) {
        this.field37271 = field37271;
        this.field37272 = field37272;
        this.field37273 = field37273;
        this.field37274 = field37274;
        this.field37275 = field37275;
        this.field37276 = field37276;
        this.field37277 = field37277;
    }
}
