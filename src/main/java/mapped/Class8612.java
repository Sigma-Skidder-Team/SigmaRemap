// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8612
{
    private static String[] field36147;
    private int field36148;
    private String field36149;
    
    public Class8612() {
        this.field36148 = -1;
    }
    
    public Class8612 method29205(final int field36148) {
        this.field36148 = field36148;
        return this;
    }
    
    public Class8612 method29206(final String field36149) {
        this.field36149 = field36149;
        return this;
    }
    
    public Class9435 method29207() {
        return new Class9435(this.field36148, this.field36149);
    }
}
