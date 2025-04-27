// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3541 extends Class3446
{
    private static String[] field16589;
    private final Class791 field16590;
    private int field16591;
    
    public Class3541(final Class791 field16590) {
        this.field16590 = field16590;
    }
    
    @Override
    public boolean method11013() {
        if (this.field16591 < this.field16590.ticksExisted) {
            if (this.field16590.method4394()) {
                if (this.field16590.method4414()) {
                    return Class791.method4418(this.field16590).nextInt(400) == 1;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return !this.field16590.method1706() && (this.field16590.method4394() || Class791.method4419(this.field16590).nextInt(600) != 1) && Class791.method4420(this.field16590).nextInt(2000) != 1;
    }
    
    @Override
    public void method11015() {
        this.field16590.method4377(true);
        this.field16591 = 0;
    }
    
    @Override
    public void method11018() {
        this.field16590.method4377(false);
        this.field16591 = this.field16590.ticksExisted + 200;
    }
}
