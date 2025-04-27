// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.List;
import java.util.function.Predicate;
import java.util.EnumSet;

public class Class3638 extends Class3446
{
    private static String[] field16881;
    public final /* synthetic */ Class803 field16882;
    
    public Class3638(final Class803 field16882) {
        this.field16882 = field16882;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        return this.field16882.method2718(Class2215.field13600).method27620() && (this.field16882.method4152() == null && this.field16882.method2634() == null) && Class803.method4689(this.field16882) && this.field16882.method2633().nextInt(10) == 0 && !this.field16882.world.method6739((Class<? extends Entity>)Class427.class, this.field16882.getBoundingBox().grow(8.0, 8.0, 8.0), (Predicate<? super Entity>)Class803.method4690()).isEmpty() && this.field16882.method2718(Class2215.field13600).method27620();
    }
    
    @Override
    public void method11016() {
        final List<Entity> method6739 = this.field16882.world.method6739(Class427.class, this.field16882.getBoundingBox().grow(8.0, 8.0, 8.0), (Predicate<? super Entity>)Class803.method4690());
        if (this.field16882.method2718(Class2215.field13600).method27620()) {
            if (!method6739.isEmpty()) {
                this.field16882.method4150().method24725(method6739.get(0), 1.2000000476837158);
            }
        }
    }
    
    @Override
    public void method11015() {
        final List<Entity> method6739 = this.field16882.world.method6739(Class427.class, this.field16882.getBoundingBox().grow(8.0, 8.0, 8.0), (Predicate<? super Entity>)Class803.method4690());
        if (!method6739.isEmpty()) {
            this.field16882.method4150().method24725(method6739.get(0), 1.2000000476837158);
        }
    }
}
