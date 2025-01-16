// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class437 extends TileEntity
{
    private static String[] field2661;
    private Class181 field2662;
    
    public Class437() {
        super(Class5412.field22564);
    }
    
    public Class437(final Class181 class181) {
        this();
        this.method2214(class181);
    }
    
    @Override
    public Class4357 method2195() {
        return new Class4357(this.field2657, 11, this.method2196());
    }
    
    public Class181 method2213() {
        if (this.field2662 == null) {
            this.field2662 = ((Class3900)this.method2194().getBlock()).method11993();
        }
        return this.field2662;
    }
    
    public void method2214(final Class181 field2662) {
        this.field2662 = field2662;
    }
}
