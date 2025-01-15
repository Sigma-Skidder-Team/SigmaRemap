// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5822 extends Class5821
{
    private static String[] field23906;
    private Class8599 field23907;
    
    private Class5822() {
    }
    
    @Override
    public synchronized Class8598 method17513(final int n) {
        if (this.field23907 != null && Class8599.method29136(this.field23907) == n) {
            return this.field23907;
        }
        return this.field23907 = new Class8599(n);
    }
}
