// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4983 implements Class4974
{
    private static String[] field21452;
    public final /* synthetic */ Class7508 field21453;
    
    private Class4983(final Class7508 field21453) {
        this.field21453 = field21453;
    }
    
    @Override
    public Class6287 method15159() {
        if (!this.field21453.field29105.method23631(Class2207.field13432)) {
            final Class5233 method23632 = this.field21453.field29105.method23632();
            final Class6290 class6290 = new Class6290(method23632.method16348(), method23632.method16349());
            Class7508.method23430(this.field21453, Class7508.method23433(this.field21453).method24254());
            return class6290;
        }
        final Class5233 method23633 = this.field21453.field29105.method23633();
        if (this.field21453.field29105.method23631(Class2207.field13432, Class2207.field13443, Class2207.field13448, Class2207.field13431)) {
            Class7508.method23430(this.field21453, new Class4983(this.field21453));
            return Class7508.method23436(this.field21453, method23633.method16349());
        }
        Class7508.method23433(this.field21453).method24253(new Class4983(this.field21453));
        return new Class4977(this.field21453, null).method15159();
    }
}
