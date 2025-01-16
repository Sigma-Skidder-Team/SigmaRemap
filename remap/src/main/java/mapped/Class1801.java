// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public class Class1801<T extends LivingEntity, M extends Class5845<T>> extends Class1799<T, M>
{
    private static final ResourceLocation field9968;
    private final Class5923<T> field9969;
    
    public Class1801(final Class4778<T, M> class4778) {
        super(class4778);
        this.field9969 = new Class5923<T>();
    }
    
    public void method6551(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final ItemStack method2718 = t.method2718(Class2215.field13604);
        if (method2718.getItem() == Items.field31584) {
            ResourceLocation class7353 = null;
            if (!(t instanceof Class754)) {
                class7353 = Class1801.field9968;
                if (Config.method28987()) {
                    class7353 = Class9404.method34969(method2718, class7353);
                }
            }
            else {
                final Class754 class7354 = (Class754)t;
                Label_0166: {
                    if (class7354.method4099() && class7354.method4100() != null) {
                        class7353 = class7354.method4100();
                    }
                    else {
                        if (class7354.method4108()) {
                            if (class7354.method4094()) {
                                if (class7354.method4098() != null) {
                                    if (class7354.method2895(Class189.field610)) {
                                        class7353 = class7354.method4098();
                                        break Label_0166;
                                    }
                                }
                            }
                        }
                        class7353 = Class1801.field9968;
                        if (Config.method28987()) {
                            class7353 = Class9404.method34969(method2718, class7353);
                        }
                    }
                }
            }
            class7351.method22567();
            class7351.method22564(0.0, 0.0, 0.125);
            this.method6559().method17569(this.field9969);
            this.field9969.method17580(t, n2, n3, n5, n6, n7);
            this.field9969.method17564(class7351, ItemRenderer.method6532(class7352, this.field9969.method17647(class7353), false, method2718.method27671()), n, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
            class7351.method22568();
        }
    }
    
    static {
        field9968 = new ResourceLocation("textures/entity/elytra.png");
    }
}
