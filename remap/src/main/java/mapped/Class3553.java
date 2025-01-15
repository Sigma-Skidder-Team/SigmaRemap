// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

import java.util.EnumSet;

public class Class3553 extends Class3545
{
    private static String[] field16624;
    private final Class815 field16625;
    private LivingEntity field16626;
    private int field16627;
    public final /* synthetic */ Class816 field16628;
    
    public Class3553(final Class816 field16628, final Class815 field16629) {
        this.field16628 = field16628;
        super(field16629, false);
        this.field16625 = field16629;
        this.method11019(EnumSet.of(Class2139.field12583));
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16625.method4205()) {
            return false;
        }
        final Entity method4206 = this.field16625.method4206();
        if (method4206 instanceof Class821) {
            final Class821 class821 = (Class821)method4206;
            this.field16626 = class821.method2634();
            return class821.method2635() != this.field16627 && this.method11097(this.field16626, Class7843.field32117);
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16602.method4153(this.field16626);
        final Entity method4206 = this.field16625.method4206();
        if (method4206 instanceof Class821) {
            this.field16627 = ((Class821)method4206).method2635();
        }
        super.method11015();
    }
}
