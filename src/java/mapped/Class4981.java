// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4981 implements Class4974
{
    private static String[] field21448;
    public final /* synthetic */ Class7508 field21449;
    
    private Class4981(final Class7508 field21449) {
        this.field21449 = field21449;
    }
    
    @Override
    public Class6287 method15159() {
        Class2314 class2314 = this.field21449.field29105.method23632().method16348();
        boolean b = false;
        if (this.field21449.field29105.method23631(Class2207.field13436)) {
            class2314 = this.field21449.field29105.method23633().method16349();
            b = true;
        }
        final Class6299 class2315 = new Class6299(class2314, class2314, b);
        Class7508.method23430(this.field21449, new Class4990(this.field21449, null));
        return class2315;
    }
}
