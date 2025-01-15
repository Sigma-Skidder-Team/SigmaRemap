// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2028 implements Class2022
{
    private static String[] field11556;
    private final int field11557;
    private final int field11558;
    private final float field11559;
    private final float field11560;
    private final float field11561;
    private final int field11562;
    public final /* synthetic */ Class1740 field11563;
    
    private Class2028(final Class1740 field11563, final int n, final int n2, final int n3, final int n4, final float n5, final float n6, final int field11564) {
        this.field11563 = field11563;
        this.field11557 = n2 - n;
        this.field11558 = n3 - n4;
        this.field11561 = n5 / Class1740.method6158(field11563);
        this.field11559 = (n6 + n + Class1740.method6159(field11563)) / Class1740.method6158(field11563);
        this.field11560 = (Class1740.method6160(field11563) - n3 + Class1740.method6161(field11563)) / Class1740.method6158(field11563);
        this.field11562 = field11564;
    }
    
    @Override
    public int method8068() {
        return this.field11557;
    }
    
    @Override
    public int method8069() {
        return this.field11558;
    }
    
    @Override
    public float method8071() {
        return Class1740.method6158(this.field11563);
    }
    
    @Override
    public float method8070() {
        return this.field11561;
    }
    
    @Override
    public float method8081() {
        return this.field11559;
    }
    
    @Override
    public float method8079() {
        return this.field11560;
    }
    
    @Override
    public void method8072(final int n, final int n2) {
        final Class1846 class1846 = new Class1846(Class2235.field13732, this.field11557, this.field11558, false);
        class1846.method6658(Class1740.method6162(this.field11563), this.field11562, this.field11557, this.field11558, Class1740.method6163(this.field11563), Class1740.method6163(this.field11563), Class1740.method6159(this.field11563), Class1740.method6161(this.field11563), 0, 0);
        class1846.method6653(0, n, n2, 0, 0, this.field11557, this.field11558, false, true);
    }
    
    @Override
    public boolean method8073() {
        return false;
    }
}
