// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3570 extends Class3545
{
    private static String[] field16664;
    private final Class7843 field16665;
    public final /* synthetic */ Class843 field16666;
    
    public Class3570(final Class843 field16666, final Class787 class787) {
        this.field16666 = field16666;
        super(class787, false);
        this.field16665 = new Class7843().method25340().method25342();
    }
    
    @Override
    public boolean method11013() {
        if (Class843.method5048(this.field16666) != null) {
            if (Class843.method5048(this.field16666).method4152() != null) {
                if (this.method11097(Class843.method5048(this.field16666).method4152(), this.field16665)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16666.method4153(Class843.method5048(this.field16666).method4152());
        super.method11015();
    }
}
