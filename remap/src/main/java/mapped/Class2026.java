// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2026 implements Class2022
{
    private static String[] field11540;
    private final int field11541;
    private final int field11542;
    private final int field11543;
    private final int field11544;
    private final Class1846 field11545;
    
    private Class2026(final int field11543, final int field11544, final int field11545, final int field11546, final Class1846 field11547) {
        this.field11541 = field11545;
        this.field11542 = field11546;
        this.field11543 = field11543;
        this.field11544 = field11544;
        this.field11545 = field11547;
    }
    
    @Override
    public float method8071() {
        return 2.0f;
    }
    
    @Override
    public int method8068() {
        return this.field11541;
    }
    
    @Override
    public int method8069() {
        return this.field11542;
    }
    
    @Override
    public float method8070() {
        return (float)(this.field11541 / 2 + 1);
    }
    
    @Override
    public void method8072(final int n, final int n2) {
        this.field11545.method6653(0, n, n2, this.field11543, this.field11544, this.field11541, this.field11542, false, false);
    }
    
    @Override
    public boolean method8073() {
        return this.field11545.method6646().method8430() > 1;
    }
    
    @Override
    public float method8083() {
        return 0.5f;
    }
    
    @Override
    public float method8082() {
        return 0.5f;
    }
}
