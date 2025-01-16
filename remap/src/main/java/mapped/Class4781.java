// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.Entity;

public class Class4781<T extends Entity & Class407> extends Class4703<T>
{
    private static String[] field20410;
    private final ItemRenderer field20411;
    private final float field20412;
    private final boolean field20413;
    
    public Class4781(final Class8551 class8551, final ItemRenderer field20411, final float field20412, final boolean field20413) {
        super(class8551);
        this.field20411 = field20411;
        this.field20412 = field20412;
        this.field20413 = field20413;
    }
    
    public Class4781(final Class8551 class8551, final ItemRenderer class8552) {
        this(class8551, class8552, 1.0f, false);
    }
    
    @Override
    public int method13954(final T t, final float n) {
        return this.field20413 ? 15 : super.method13954(t, n);
    }
    
    @Override
    public void method13951(final T t, final float n, final float n2, final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n3) {
        class7351.method22567();
        class7351.method22565(this.field20412, this.field20412, this.field20412);
        class7351.method22566(this.field20283.method28717());
        class7351.method22566(Vector3f.YP.rotationDegrees(180.0f));
        this.field20411.method6536(t.method2005(), Class2016.field11493, n3, Class1904.field10335, class7351, class7352);
        class7351.method22568();
        super.method13951(t, n, n2, class7351, class7352, n3);
    }
    
    @Override
    public ResourceLocation method13950(final Entity class399) {
        return Class1774.field9853;
    }
}
