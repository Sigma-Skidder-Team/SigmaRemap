// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5745 extends Class5714
{
    private static String[] field23331;
    private double field23332;
    private Class5487 field23333;
    
    public Class5745(final double field23332, final Class5487 field23333) {
        this.field23332 = field23332;
        this.field23333 = field23333;
    }
    
    public double method17049() {
        return this.field23332;
    }
    
    public void method17050(final double field22771) {
        this.method16961(true);
        this.field23333.field22771 = field22771;
    }
    
    public double method17051() {
        return this.field23333.field22771;
    }
    
    public Class5487 method17052() {
        return this.field23333;
    }
}
