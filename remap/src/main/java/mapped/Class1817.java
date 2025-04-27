// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;

public class Class1817<T extends PlayerEntity> extends Class1799<T, Class5860<T>>
{
    private final Class5869 field9996;
    
    public Class1817(final Class4778<T, Class5860<T>> class4778) {
        super(class4778);
        this.field9996 = new Class5869();
    }
    
    public void method6579(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        this.method6580(class7351, class7352, n, t, n2, n3, n6, n7, true);
        this.method6580(class7351, class7352, n, t, n2, n3, n6, n7, false);
    }
    
    private void method6580(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final boolean b) {
        EntityType.method23355((b ? t.method2899() : t.method2901()).getString("id")).filter(class7353 -> class7353 == EntityType.field29011).ifPresent(p10 -> {
            final Entity field9343 = Config.method28908().field9343;
            if (class7354 instanceof AbstractClientPlayerEntity) {
                final AbstractClientPlayerEntity class7358 = (AbstractClientPlayerEntity)class7354;
                final ShoulderRidingEntity field9344 = b2 ? class7358.entityShoulderLeft : class7358.entityShoulderRight;
                if (field9344 != null) {
                    Config.method28908().field9343 = field9344;
                    if (Config.method28955()) {
                        Class9216.method33835(field9344);
                    }
                }
            }
            class7355.method22567();
            class7355.method22564(b2 ? 0.4000000059604645 : -0.4000000059604645, class7354.method1814() ? -1.2999999523162842 : -1.5, 0.0);
            this.field9996.method17606(class7355, class7356.method25214(this.field9996.method17647(Class4715.field20317[class7357.method319("Variant")])), n6, Class1904.field10335, n7, n8, n9, n10, class7354.field2424);
            class7355.method22568();
            Config.method28908().field9343 = field9343;
            if (Config.method28955()) {
                Class9216.method33835(field9343);
            }
        });
    }
}
