// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8573
{
    private final String field36047;
    private final String field36048;
    
    public Class8573(final String field36047, final String field36048) {
        this.field36047 = field36047;
        this.field36048 = field36048;
    }
    
    public String method29024() {
        return this.field36047;
    }
    
    public String method29025() {
        return this.field36048;
    }
    
    public String method29026() {
        return "#define " + this.field36047 + " " + this.field36048;
    }
    
    @Override
    public String toString() {
        return this.method29026();
    }
}
