// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import java.util.List;
import java.util.function.Predicate;

public class Class3477 extends Class3446
{
    private static String[] field16383;
    private int field16384;
    public final /* synthetic */ Class840 field16385;
    
    private Class3477(final Class840 field16385) {
        this.field16385 = field16385;
    }
    
    @Override
    public boolean method11013() {
        return this.field16384 <= this.field16385.field2424 && (!this.field16385.field2391.method6739((Class<? extends Entity>)Class427.class, this.field16385.method1886().method18495(8.0, 8.0, 8.0), (Predicate<? super Entity>)Class840.field4478).isEmpty() || !this.field16385.method2718(Class2215.field13600).method27620());
    }
    
    @Override
    public void method11015() {
        final List<Entity> method6739 = this.field16385.field2391.method6739((Class<? extends Entity>)Class427.class, this.field16385.method1886().method18495(8.0, 8.0, 8.0), (Predicate<? super Entity>)Class840.field4478);
        if (!method6739.isEmpty()) {
            this.field16385.method4150().method24725((Entity)method6739.get(0), 1.2000000476837158);
            this.field16385.method1695(Class8520.field35123, 1.0f, 1.0f);
        }
        this.field16384 = 0;
    }
    
    @Override
    public void method11018() {
        final Class8321 method2718 = this.field16385.method2718(Class2215.field13600);
        if (!method2718.method27620()) {
            this.method11042(method2718);
            this.field16385.method1803(Class2215.field13600, Class8321.field34174);
            this.field16384 = this.field16385.field2424 + Class840.method5012(this.field16385).nextInt(100);
        }
    }
    
    @Override
    public void method11016() {
        final List<Entity> method6739 = this.field16385.field2391.method6739((Class<? extends Entity>)Class427.class, this.field16385.method1886().method18495(8.0, 8.0, 8.0), (Predicate<? super Entity>)Class840.field4478);
        final Class8321 method6740 = this.field16385.method2718(Class2215.field13600);
        if (method6740.method27620()) {
            if (!method6739.isEmpty()) {
                this.field16385.method4150().method24725((Entity)method6739.get(0), 1.2000000476837158);
            }
        }
        else {
            this.method11042(method6740);
            this.field16385.method1803(Class2215.field13600, Class8321.field34174);
        }
    }
    
    private void method11042(final Class8321 class8321) {
        if (!class8321.method27620()) {
            final Class427 class8322 = new Class427(this.field16385.field2391, this.field16385.method1938(), this.field16385.method1944() - 0.30000001192092896, this.field16385.method1945(), class8321);
            class8322.method2117(40);
            class8322.method2112(this.field16385.method1865());
            final float n = Class840.method5013(this.field16385).nextFloat() * 6.2831855f;
            final float n2 = 0.02f * Class840.method5014(this.field16385).nextFloat();
            class8322.method1937(0.3f * -MathHelper.sin(this.field16385.field2399 * 0.017453292f) * MathHelper.cos(this.field16385.field2400 * 0.017453292f) + MathHelper.cos(n) * n2, 0.3f * MathHelper.sin(this.field16385.field2400 * 0.017453292f) * 1.5f, 0.3f * MathHelper.cos(this.field16385.field2399 * 0.017453292f) * MathHelper.cos(this.field16385.field2400 * 0.017453292f) + MathHelper.sin(n) * n2);
            this.field16385.field2391.method6886(class8322);
        }
    }
}
