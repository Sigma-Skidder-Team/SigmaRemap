// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9288
{
    private static String[] field39830;
    private Material field39831;
    private MaterialColor field39832;
    private boolean field39833;
    private SoundType field39834;
    private int field39835;
    private float field39836;
    private float field39837;
    private boolean field39838;
    private float field39839;
    private float field39840;
    private float field39841;
    private ResourceLocation field39842;
    private boolean field39843;
    private boolean field39844;
    
    private Class9288(final Material field39831, final MaterialColor field39832) {
        this.field39833 = true;
        this.field39834 = SoundType.field30570;
        this.field39839 = 0.6f;
        this.field39840 = 1.0f;
        this.field39841 = 1.0f;
        this.field39843 = true;
        this.field39831 = field39831;
        this.field39832 = field39832;
    }
    
    public static Class9288 method34279(final Material class8059) {
        return method34281(class8059, class8059.method26446());
    }
    
    public static Class9288 method34280(final Material class8059, final Class181 class8060) {
        return method34281(class8059, class8060.method816());
    }
    
    public static Class9288 method34281(final Material class8059, final MaterialColor class8060) {
        return new Class9288(class8059, class8060);
    }
    
    public static Class9288 method34282(final Block class3833) {
        final Class9288 class3834 = new Class9288(class3833.field17401, class3833.field17402);
        class3834.field39831 = class3833.field17401;
        class3834.field39837 = class3833.field17397;
        class3834.field39836 = class3833.field17398;
        class3834.field39833 = class3833.field17408;
        class3834.field39838 = class3833.field17399;
        class3834.field39835 = class3833.field17396;
        class3834.field39832 = class3833.field17402;
        class3834.field39834 = class3833.field17400;
        class3834.field39839 = class3833.method11865();
        class3834.field39840 = class3833.method11866();
        class3834.field39844 = Block.method11888(class3833);
        class3834.field39843 = Block.method11889(class3833);
        return class3834;
    }
    
    public Class9288 method34283() {
        this.field39833 = false;
        this.field39843 = false;
        return this;
    }
    
    public Class9288 method34284() {
        this.field39843 = false;
        return this;
    }
    
    public Class9288 method34285(final float field39839) {
        this.field39839 = field39839;
        return this;
    }
    
    public Class9288 method34286(final float field39840) {
        this.field39840 = field39840;
        return this;
    }
    
    public Class9288 method34287(final float field39841) {
        this.field39841 = field39841;
        return this;
    }
    
    public Class9288 method34288(final SoundType field39834) {
        this.field39834 = field39834;
        return this;
    }
    
    public Class9288 method34289(final int field39835) {
        this.field39835 = field39835;
        return this;
    }
    
    public Class9288 method34290(final float field39837, final float b) {
        this.field39837 = field39837;
        this.field39836 = Math.max(0.0f, b);
        return this;
    }
    
    public Class9288 method34291() {
        return this.method34292(0.0f);
    }
    
    public Class9288 method34292(final float n) {
        this.method34290(n, n);
        return this;
    }
    
    public Class9288 method34293() {
        this.field39838 = true;
        return this;
    }
    
    public Class9288 method34294() {
        this.field39844 = true;
        return this;
    }
    
    public Class9288 method34295() {
        this.field39842 = Class9020.field38063;
        return this;
    }
    
    public Class9288 method34296(final Block class3833) {
        this.field39842 = class3833.method11832();
        return this;
    }
}
