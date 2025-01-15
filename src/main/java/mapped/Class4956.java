// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4956 extends Class4943<Class4956>
{
    private String field21256;
    private Class2095 field21257;
    private byte field21258;
    private int field21259;
    private boolean field21260;
    
    public Class4956() {
        this.field21256 = "Buried_Treasure";
        this.field21257 = Class129.field389;
        this.field21258 = 2;
        this.field21259 = 50;
        this.field21260 = true;
    }
    
    public Class4956 method14927() {
        return this;
    }
    
    public Class4956 method14928(final String field21256) {
        this.field21256 = field21256;
        return this;
    }
    
    public Class4956 method14929(final Class2095 field21257) {
        this.field21257 = field21257;
        return this;
    }
    
    public Class4956 method14930(final byte field21258) {
        this.field21258 = field21258;
        return this;
    }
    
    public Class4956 method14931(final boolean field21260) {
        this.field21260 = field21260;
        return this;
    }
    
    @Override
    public Class125 method14888() {
        return new Class129(this.method14892(), this.field21256, this.field21257, this.field21258, this.field21259, this.field21260, null);
    }
}
