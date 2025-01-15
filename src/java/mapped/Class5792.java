// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5792 extends Class5791
{
    private static String[] field23788;
    private int field23789;
    
    public Class5792(final Class852 class852) {
        super(class852);
    }
    
    @Override
    public void method17246() {
        this.field23764.field2391.method6708(this.field23764.method1938(), this.field23764.method1941(), this.field23764.method1945(), Class8520.field35157, this.field23764.method1922(), 2.5f, 0.8f + this.field23764.method2633().nextFloat() * 0.3f, false);
    }
    
    @Override
    public void method17247() {
        if (this.field23789++ >= 40) {
            this.field23764.method5127().method33696(Class7193.field27953);
        }
    }
    
    @Override
    public void method17249() {
        this.field23789 = 0;
    }
    
    @Override
    public Class7193<Class5792> method17253() {
        return Class7193.field27955;
    }
}
