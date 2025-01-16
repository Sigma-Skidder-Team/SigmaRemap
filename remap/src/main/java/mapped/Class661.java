// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class661 extends Class662
{
    private static String[] field3691;
    private final Class6470 field3692;
    
    public Class661(final Class5760 class5760, final int n, final int n2, final int n3, final int n4, final Class6470 field3692) {
        super(class5760, n, n2, n3, n4, (float)field3692.method19469(field3692.method19476(class5760)));
        this.field3692 = field3692;
        this.method3711();
    }
    
    @Override
    public void method3710() {
        this.field3692.method19475(this.field3693, this.field3692.method19470(this.field3694));
        this.field3693.method17121();
    }
    
    @Override
    public void method3711() {
        this.method3367(this.field3692.method19477(this.field3693));
    }
    
    public static int method3712(final Widget class573) {
        return class573.field3424;
    }
    
    public static int method3713(final Widget class573) {
        return class573.field3425;
    }
    
    public Class6469 method3709() {
        return this.field3692;
    }
}
