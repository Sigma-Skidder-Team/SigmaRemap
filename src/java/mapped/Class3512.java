// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3512 extends Class3511
{
    private static String[] field16504;
    public final /* synthetic */ Class771 field16506;
    
    private Class3512(final Class771 field16506) {
        this.field16506 = field16506;
        super(field16506);
    }
    
    @Override
    public void method11016() {
        if (this.field16506.method4152() == null) {
            if (Class771.method4272(this.field16506) != null) {
                this.field16506.method4147().method24667(Class771.method4272(this.field16506), (float)this.field16506.method4174(), (float)this.field16506.method4173());
            }
        }
        else {
            this.field16506.method4147().method24667(this.field16506.method4152(), (float)this.field16506.method4174(), (float)this.field16506.method4173());
        }
    }
}
