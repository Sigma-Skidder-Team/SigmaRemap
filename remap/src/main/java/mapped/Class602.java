// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class602 extends Class599
{
    private static String[] field3532;
    private final Class5063 field3533;
    
    public Class602(final Class5063 field3533, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(Class869.method5277(), n, n2, n3, n4, n5);
        this.field3533 = field3533;
    }
    
    @Override
    public int method3485() {
        return this.field3533.method15555();
    }
    
    @Override
    public boolean method3486(final int n, final int n2, final double n3, final double n4) {
        return this.field3533.method15556(n, n2, n3, n4);
    }
    
    @Override
    public boolean method3487(final int n) {
        return this.field3533.method15557(n);
    }
    
    @Override
    public void method3489() {
        this.field3533.method15558();
    }
    
    @Override
    public void method3491(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7) {
        this.field3533.method15554(n, n2, n3, n4, n5, n6);
    }
    
    public int method3521() {
        return this.field3513;
    }
    
    @Override
    public int method3488() {
        return this.field3533.method15559();
    }
    
    @Override
    public int method3508() {
        return this.field3533.method15560();
    }
    
    @Override
    public boolean method3012(final double n, final double n2, final double n3) {
        return this.field3533.method15494(n, n2, n3) || super.method3012(n, n2, n3);
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        return this.field3533.method15368(n, n2, n3) || super.method2982(n, n2, n3);
    }
    
    @Override
    public boolean method2985(final double n, final double n2, final int n3) {
        return this.field3533.method15492(n, n2, n3);
    }
    
    @Override
    public boolean method2984(final double n, final double n2, final int n3, final double n4, final double n5) {
        return this.field3533.method15493(n, n2, n3, n4, n5);
    }
}