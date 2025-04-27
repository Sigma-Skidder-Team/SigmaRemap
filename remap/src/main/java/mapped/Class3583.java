// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3583 extends Class3574
{
    private static String[] field16706;
    private final Class827 field16707;
    private int field16708;
    
    public Class3583(final Class827 field16707, final double n, final boolean b) {
        super(field16707, n, b);
        this.field16707 = field16707;
    }
    
    @Override
    public void method11015() {
        super.method11015();
        this.field16708 = 0;
    }
    
    @Override
    public void method11018() {
        super.method11018();
        this.field16707.method4213(false);
    }
    
    @Override
    public void method11016() {
        super.method11016();
        ++this.field16708;
        this.field16707.method4213(this.field16708 >= 5 && this.field16686 < 10);
    }
}
