// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class334 implements Class335, Class333
{
    private Class335 field2057;
    private boolean field2058;
    private float[] field2059;
    
    public Class334(final Class335 field2057) {
        this.field2057 = field2057;
    }
    
    @Override
    public float[] method1014() {
        if (!this.field2058) {
            this.field2059 = this.field2057.method1014();
            this.field2058 = true;
        }
        return this.field2059;
    }
    
    @Override
    public void method1013() {
        this.field2058 = false;
    }
    
    @Override
    public Class2212 method1008() {
        return Class2212.field13483;
    }
    
    @Override
    public String toString() {
        return "cached(" + this.field2057 + ")";
    }
}
