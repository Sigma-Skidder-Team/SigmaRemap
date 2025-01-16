// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class4719 extends Class4712<Class764, Class5853<Class764>>
{
    private static final ResourceLocation field20321;
    private final float field20322;
    
    public Class4719(final Class8551 class8551, final float field20322) {
        super(class8551, new Class5865(), 0.5f * field20322);
        this.field20322 = field20322;
        this.method13978(new Class1823<Class764, Class5853<Class764>>(this));
        this.method13978((Class1799<Class764, Class5853<Class764>>)new Class1835((Class4778<LivingEntity, Class5853>)this, new Class5865(0.5f, true), new Class5865(1.0f, true)));
    }
    
    public void method14026(final Class764 class764, final Class7351 class765, final float n) {
        class765.method22565(this.field20322, this.field20322, this.field20322);
    }
    
    public ResourceLocation method14027(final Class764 class764) {
        return Class4719.field20321;
    }
    
    static {
        field20321 = new ResourceLocation("textures/entity/zombie/zombie.png");
    }
}
