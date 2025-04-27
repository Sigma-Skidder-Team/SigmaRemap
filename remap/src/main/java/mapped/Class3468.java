// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3468 extends Class3467
{
    private static String[] field16346;
    private final boolean field16347;
    private int field16348;
    
    public Class3468(final Class759 field16340, final boolean field16341) {
        super(field16340);
        this.field16340 = field16340;
        this.field16347 = field16341;
    }
    
    @Override
    public boolean method11017() {
        if (this.field16347) {
            if (this.field16348 > 0) {
                return super.method11017();
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16348 = 20;
        this.method11034(true);
    }
    
    @Override
    public void method11018() {
        this.method11034(false);
    }
    
    @Override
    public void method11016() {
        --this.field16348;
        super.method11016();
    }
}
