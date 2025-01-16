// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public abstract class Class1837<T extends Entity, M extends Class5845<T>> extends Class1799<T, M>
{
    public Class1837(final Class4778<T, M> class4778) {
        super(class4778);
    }
    
    @Override
    public void method6554(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final Class4150 method25214 = class7352.method25214(this.method6606());
        if (Config.method28955()) {
            Class9216.method33837();
        }
        Config.method28908().field9363 = true;
        this.method6559().method17564(class7351, method25214, 15728640, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
        Config.method28908().field9363 = false;
        if (Config.method28955()) {
            Class9216.method33838();
        }
    }
    
    public abstract Class6332 method6606();
}
