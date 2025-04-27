// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class4716 extends Class4712<Class778, Class5857<Class778>>
{
    private static final ResourceLocation field20318;
    
    public Class4716(final Class8551 class8551) {
        super(class8551, new Class5857(0.0f), 0.5f);
        this.method13978((Class1799<Class778, Class5857<Class778>>)new Class1828(this));
    }
    
    public void method14021(final Class778 class778, final float n, final float n2, final MatrixStack class779, final IRenderTypeBuffer class780, final int n3) {
        this.field20301.method17591(!class778.getHeldItemMainhand().method27620());
        super.method14006(class778, n, n2, class779, class780, n3);
    }
    
    public ResourceLocation method14022(final Class778 class778) {
        return Class4716.field20318;
    }
    
    public void method14023(final Class778 class778, final MatrixStack class779, final float n) {
        class779.method22565(0.9375f, 0.9375f, 0.9375f);
    }
    
    static {
        field20318 = new ResourceLocation("textures/entity/witch.png");
    }
}
