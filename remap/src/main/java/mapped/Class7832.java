// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7832 implements Class7831<Class7832>
{
    private final ResourceLocation field32067;
    private final float field32068;
    private final float field32069;
    private final int field32070;
    private final Class2158 field32071;
    private final boolean field32072;
    private final boolean field32073;
    private final int field32074;
    
    public Class7832(final String s, final float field32068, final float field32069, final int field32070, final Class2158 field32071, final boolean field32072, final boolean field32073, final int field32074) {
        this.field32067 = new ResourceLocation(s);
        this.field32068 = field32068;
        this.field32069 = field32069;
        this.field32070 = field32070;
        this.field32071 = field32071;
        this.field32072 = field32072;
        this.field32073 = field32073;
        this.field32074 = field32074;
    }
    
    public ResourceLocation method25304() {
        return this.field32067;
    }
    
    public ResourceLocation method25305() {
        return new ResourceLocation(this.field32067.method7798(), "sounds/" + this.field32067.method7797() + ".ogg");
    }
    
    public float method25306() {
        return this.field32068;
    }
    
    public float method25307() {
        return this.field32069;
    }
    
    @Override
    public int method25300() {
        return this.field32070;
    }
    
    public Class7832 method25301() {
        return this;
    }
    
    @Override
    public void method25302(final Class9382 class9382) {
        if (this.field32073) {
            class9382.method34846(this);
        }
    }
    
    public Class2158 method25308() {
        return this.field32071;
    }
    
    public boolean method25309() {
        return this.field32072;
    }
    
    public boolean method25310() {
        return this.field32073;
    }
    
    public int method25311() {
        return this.field32074;
    }
}
