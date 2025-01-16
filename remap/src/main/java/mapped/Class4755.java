// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4755 extends Class4754
{
    private static final ResourceLocation field20378;
    
    public Class4755(final Class8551 class8551) {
        super(class8551);
    }
    
    @Override
    public ResourceLocation method14091(final Class780 class780) {
        return Class4755.field20378;
    }
    
    public void method14092(final Class780 class780, final MatrixStack class781, final float n) {
        class781.method22565(1.2f, 1.2f, 1.2f);
    }
    
    static {
        field20378 = new ResourceLocation("textures/entity/skeleton/wither_skeleton.png");
    }
}
