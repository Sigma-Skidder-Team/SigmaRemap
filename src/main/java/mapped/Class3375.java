// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3375 extends Class3167
{
    public static boolean field16048;
    
    public Class3375() {
        super(Class8013.field32984, "FPSBooster", "Disables Armor Stand and particle rendering");
    }
    
    @Override
    public void method9917() {
        super.method9917();
        Class3375.field16048 = this.method9906();
    }
    
    @Override
    public void method9897() {
        Class3375.field16048 = false;
    }
    
    @Override
    public void method9879() {
        Class3375.field16048 = true;
    }
    
    static {
        Class3375.field16048 = false;
    }
}
