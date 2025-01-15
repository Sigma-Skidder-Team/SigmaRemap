// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class4800 extends Class4803
{
    public static int field20458;
    
    public Class4800(final String s) {
        super(null, s, 0, 0, Class869.method5277().field4632.method7694(), Class869.method5277().field4632.method7695());
    }
    
    public int method14201() {
        return 30;
    }
    
    @Override
    public void method14203(final Class4405 class4405) {
        super.method14203(class4405);
        this.method14277(Class869.method5277().field4632.method7694());
        this.method14279(Class869.method5277().field4632.method7695());
    }
    
    @Override
    public void method14204(final int n) {
        if (n == Class869.method5277().field4648.field23454.field2161.field32860) {
            Class869.method5277().field4632.method7685();
            Class869.method5277().field4648.field23430 = Class869.method5277().field4632.method7691();
        }
        super.method14204(n);
    }
    
    static {
        Class4800.field20458 = 0;
    }
}
