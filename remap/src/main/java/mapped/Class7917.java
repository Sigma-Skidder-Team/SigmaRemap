// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class7917
{
    private static final String field32501 = "*.";
    public final String field32502;
    public final String field32503;
    public final String field32504;
    public final Class1929 field32505;
    
    public Class7917(final String s, final String s2) {
        this.field32502 = s;
        this.field32503 = (s.startsWith("*.") ? Class8846.method30960("http://" + s.substring("*.".length())).method30936() : Class8846.method30960("http://" + s).method30936());
        if (!s2.startsWith("sha1/")) {
            if (!s2.startsWith("sha256/")) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + s2);
            }
            this.field32504 = "sha256/";
            this.field32505 = Class1929.method7756(s2.substring("sha256/".length()));
        }
        else {
            this.field32504 = "sha1/";
            this.field32505 = Class1929.method7756(s2.substring("sha1/".length()));
        }
        if (this.field32505 != null) {
            return;
        }
        throw new IllegalArgumentException("pins must be base64: " + s2);
    }
    
    public boolean method25634(final String s) {
        if (!this.field32502.startsWith("*.")) {
            return s.equals(this.field32503);
        }
        return s.regionMatches(false, s.indexOf(46) + 1, this.field32503, 0, this.field32503.length());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Class7917) {
            if (this.field32502.equals(((Class7917)o).field32502)) {
                if (this.field32504.equals(((Class7917)o).field32504)) {
                    return this.field32505.equals(((Class7917) o).field32505);
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * 17 + this.field32502.hashCode()) + this.field32504.hashCode()) + this.field32505.hashCode();
    }
    
    @Override
    public String toString() {
        return this.field32504 + this.field32505.method7745();
    }
}
