// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class653 extends Class649
{
    private final Class5328 field3678;
    private final Class1912 field3679;
    private final boolean field3680;
    public final /* synthetic */ Class748 field3681;
    
    public Class653(final Class748 field3681, final int n, final int n2, final Class5328 field3682, final boolean field3683) {
        this.field3681 = field3681;
        super(n, n2);
        this.field3678 = field3682;
        this.field3679 = Class869.method5277().method5325().method6446(field3682);
        this.field3680 = field3683;
    }
    
    @Override
    public void method3705() {
        if (!this.method3707()) {
            if (!this.field3680) {
                Class748.method4078(this.field3681, this.field3678);
            }
            else {
                Class748.method4077(this.field3681, this.field3678);
            }
            Class748.method4090(this.field3681).clear();
            Class748.method4091(this.field3681).clear();
            this.field3681.method2969();
            this.field3681.method2992();
        }
    }
    
    @Override
    public void method3362(final int n, final int n2) {
        String str = Class8822.method30773(this.field3678.method16455(), new Object[0]);
        if (!this.field3680) {
            if (this.field3678 != Class9439.field40483) {
                str += " II";
            }
        }
        this.field3681.method3031(str, n, n2);
    }
    
    @Override
    public void method3706() {
        Class869.method5277().method5290().method5849(this.field3679.method7504().method6340());
        Class565.method3298(this.field3426 + 2, this.field3427 + 2, this.method3303(), 18, 18, this.field3679);
    }
}