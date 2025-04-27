// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class2027 implements Class2022
{
    private static String[] field11546;
    private final float field11547;
    private final Class1846 field11548;
    private final int field11549;
    private final int field11550;
    private final int field11551;
    private final int field11552;
    private final int field11553;
    private final int field11554;
    private final float field11555;
    
    private Class2027(final float field11547, final Class1846 field11548, final int field11549, final int field11550, final int field11551, final int field11552, final int field11553, final int field11554) {
        this.field11555 = 1.0f;
        this.field11547 = field11547;
        this.field11548 = field11548;
        this.field11549 = field11549;
        this.field11550 = field11550;
        this.field11551 = field11551;
        this.field11552 = field11552;
        this.field11553 = field11553;
        this.field11554 = field11554;
    }
    
    @Override
    public float method8071() {
        return 1.0f / this.field11547;
    }
    
    @Override
    public int method8068() {
        return this.field11551;
    }
    
    @Override
    public int method8069() {
        return this.field11552;
    }
    
    @Override
    public float method8070() {
        return (float)this.field11553;
    }
    
    @Override
    public float method8079() {
        return super.method8079() + 7.0f - this.field11554;
    }
    
    @Override
    public void method8072(final int n, final int n2) {
        this.field11548.method6653(0, n, n2, this.field11549, this.field11550, this.field11551, this.field11552, false, false);
    }
    
    @Override
    public boolean method8073() {
        return this.field11548.method6646().method8430() > 1;
    }
    
    @Override
    public float method8082() {
        return this.field11555;
    }
}
