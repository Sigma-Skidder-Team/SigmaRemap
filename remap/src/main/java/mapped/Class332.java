// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class332 implements Class328, Class333
{
    private final Class328 field2054;
    private boolean field2055;
    private float field2056;
    
    public Class332(final Class328 field2054) {
        this.field2054 = field2054;
    }
    
    @Override
    public float method1009() {
        if (!this.field2055) {
            this.field2056 = this.field2054.method1009();
            this.field2055 = true;
        }
        return this.field2056;
    }
    
    @Override
    public void method1013() {
        this.field2055 = false;
    }
    
    @Override
    public Class2212 method1008() {
        return Class2212.field13483;
    }
    
    @Override
    public String toString() {
        return "cached(" + this.field2054 + ")";
    }
}
