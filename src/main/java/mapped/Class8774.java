// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8774 implements Class8775
{
    private static String[] field36888;
    private final Class3833 field36889;
    private Class9357 field36890;
    
    public Class8774(final Class3833 field36889) {
        this.field36890 = Class9357.field40141;
        this.field36889 = field36889;
    }
    
    public Class8774 method30478(final Class7979 class7979) {
        this.field36890 = class7979.method26013();
        return this;
    }
    
    @Override
    public Class122 method30479() {
        return new Class154(this.field36889, this.field36890, null);
    }
}
