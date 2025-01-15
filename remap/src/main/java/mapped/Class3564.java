// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.UUID;
import java.util.function.Predicate;

public class Class3564 extends Class3555<Class511>
{
    private static String[] field16633;
    private Class511 field16652;
    private Class511 field16653;
    private int field16654;
    public final /* synthetic */ Class803 field16655;
    
    public Class3564(final Class803 field16655, final Class<Class511> clazz, final boolean b, final boolean b2, final Predicate<Class511> predicate) {
        this.field16655 = field16655;
        super(field16655, clazz, 10, b, b2, predicate);
    }
    
    @Override
    public boolean method11013() {
        if (this.field16635 > 0 && this.field16602.method2633().nextInt(this.field16635) != 0) {
            return false;
        }
        for (final UUID uuid : Class803.method4698(this.field16655)) {
            if (uuid == null) {
                continue;
            }
            if (!(this.field16655.field2391 instanceof Class1849)) {
                continue;
            }
            final Entity method6914 = ((Class1849)this.field16655.field2391).method6914(uuid);
            if (!(method6914 instanceof Class511)) {
                continue;
            }
            final Class511 field16653 = (Class511)method6914;
            this.field16653 = field16653;
            this.field16652 = field16653.method2634();
            return field16653.method2635() != this.field16654 && this.method11097(this.field16652, this.field16637);
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16655.method4153(this.field16652);
        this.field16636 = this.field16652;
        if (this.field16653 != null) {
            this.field16654 = this.field16653.method2635();
        }
        this.field16655.method1695(Class8520.field35202, 1.0f, 1.0f);
        Class803.method4699(this.field16655, true);
        Class803.method4700(this.field16655);
        super.method11015();
    }
}
