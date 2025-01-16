// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.LivingEntity;

public class Class1815<T extends LivingEntity> extends Class1799<T, Class5860<T>>
{
    public static final ResourceLocation field9991;
    private final Class6300 field9992;
    
    public Class1815(final Class4778<T, Class5860<T>> class4778) {
        super(class4778);
        (this.field9992 = new Class6300(64, 64, 0, 0)).method18636(-8.0f, -16.0f, -8.0f, 16.0f, 32.0f, 16.0f);
    }
    
    public void method6551(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (t.method2744()) {
            final Class4150 method25214 = class7352.method25214(Class6332.method18770(Class1815.field9991));
            for (int i = 0; i < 3; ++i) {
                class7351.method22567();
                class7351.method22566(Vector3f.YP.rotationDegrees(n5 * -(45 + i * 5)));
                final float n8 = 0.75f * i;
                class7351.method22565(n8, n8, n8);
                class7351.method22564(0.0, -0.2f + 0.6f * i, 0.0);
                this.field9992.method18643(class7351, method25214, n, Class1904.field10335);
                class7351.method22568();
            }
        }
    }
    
    static {
        field9991 = new ResourceLocation("textures/entity/trident_riptide.png");
    }
}
