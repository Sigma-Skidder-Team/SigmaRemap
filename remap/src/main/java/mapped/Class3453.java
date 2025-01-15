// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3453<T extends Class511> extends Class3448<T>
{
    private static String[] field16275;
    private final Class799 field16291;
    public final /* synthetic */ Class799 field16292;
    
    public Class3453(final Class799 field16292, final Class799 field16293, final Class<T> clazz, final float n, final double n2, final double n3) {
        this.field16292 = field16292;
        super(field16293, clazz, n, n2, n3);
        this.field16291 = field16293;
    }
    
    @Override
    public boolean method11013() {
        return super.method11013() && this.field16279 instanceof Class815 && !this.field16291.method4480() && this.method11023((Class815)this.field16279);
    }
    
    private boolean method11023(final Class815 class815) {
        return class815.method4787() >= Class799.method4605(this.field16292).nextInt(5);
    }
    
    @Override
    public void method11015() {
        this.field16292.method4153(null);
        super.method11015();
    }
    
    @Override
    public void method11016() {
        this.field16292.method4153(null);
        super.method11016();
    }
}
