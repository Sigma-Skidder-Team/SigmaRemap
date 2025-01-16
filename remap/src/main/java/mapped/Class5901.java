// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.function.Consumer;

public abstract class Class5901 implements Consumer<Class6300>
{
    public final Function<ResourceLocation, Class6332> field24268;
    public int field24269;
    public int field24270;
    
    public Class5901(final Function<ResourceLocation, Class6332> field24268) {
        this.field24269 = 64;
        this.field24270 = 32;
        this.field24268 = field24268;
    }
    
    @Override
    public void accept(final Class6300 class6300) {
    }
    
    public final Class6332 method17647(final ResourceLocation class1932) {
        return this.field24268.apply(class1932);
    }
    
    public abstract void method17564(final MatrixStack p0, final Class4150 p1, final int p2, final int p3, final float p4, final float p5, final float p6, final float p7);
}
