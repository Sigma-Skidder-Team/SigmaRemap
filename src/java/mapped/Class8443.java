// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8443 implements Class8444
{
    private static String[] field34699;
    private Class399 field34700;
    
    @Override
    public int method28177() {
        return (int)(this.field34700.method1865().getLeastSignificantBits() & 0x7FFFFFFFL);
    }
    
    @Override
    public Class354 method28178() {
        return this.field34700.method1650().field38922;
    }
    
    @Override
    public Class3090 method28179() {
        return this.field34700.method1650().field38921;
    }
    
    @Override
    public String method28180() {
        return this.field34700.method1874() ? this.field34700.method1873().getString() : null;
    }
    
    @Override
    public int method28181() {
        if (this.field34700 instanceof Class511) {
            return (int)((Class511)this.field34700).method2664();
        }
        return 0;
    }
    
    @Override
    public int method28182() {
        if (this.field34700 instanceof Class511) {
            return (int)((Class511)this.field34700).method2701();
        }
        return 0;
    }
    
    public Class399 method28183() {
        return this.field34700;
    }
    
    public void method28184(final Class399 field34700) {
        this.field34700 = field34700;
    }
}
