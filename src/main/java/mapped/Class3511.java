// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3511 extends Class3446
{
    private static String[] field16504;
    public final /* synthetic */ Class770 field16505;
    
    public Class3511(final Class770 field16505) {
        this.field16505 = field16505;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        return this.field16505.method4268() > 0;
    }
    
    @Override
    public void method11015() {
        super.method11015();
        Class770.method4269(this.field16505).method24733();
    }
    
    @Override
    public void method11018() {
        super.method11018();
        this.field16505.method4266(Class2107.field12213);
    }
    
    @Override
    public void method11016() {
        if (this.field16505.method4152() != null) {
            this.field16505.method4147().method24667(this.field16505.method4152(), (float)this.field16505.method4174(), (float)this.field16505.method4173());
        }
    }
}
