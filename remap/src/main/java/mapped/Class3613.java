// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3613 extends Class3446
{
    private static String[] field16803;
    private final Class791 field16804;
    
    public Class3613(final Class791 field16804) {
        this.field16804 = field16804;
    }
    
    @Override
    public boolean method11013() {
        return this.field16804.method2625() && this.field16804.method4414() && ((this.field16804.method4397() && Class791.method4416(this.field16804).nextInt(500) == 1) || Class791.method4417(this.field16804).nextInt(6000) == 1);
    }
    
    @Override
    public boolean method11017() {
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16804.method4382(true);
    }
}
