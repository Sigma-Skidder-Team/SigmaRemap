// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3473 extends Class3472
{
    private static String[] field16370;
    private Class512 field16371;
    private final Class800 field16372;
    
    public Class3473(final Class800 field16372, final double n, final Class120 class120, final boolean b) {
        super(field16372, n, class120, b);
        this.field16372 = field16372;
    }
    
    @Override
    public void method11016() {
        super.method11016();
        if (this.field16371 == null && this.field16358.method2633().nextInt(600) == 0) {
            this.field16371 = this.field16365;
        }
        else if (this.field16358.method2633().nextInt(500) == 0) {
            this.field16371 = null;
        }
    }
    
    @Override
    public boolean method11039() {
        return (this.field16371 == null || !this.field16371.equals(this.field16365)) && super.method11039();
    }
    
    @Override
    public boolean method11013() {
        return super.method11013() && !this.field16372.method4480();
    }
}
