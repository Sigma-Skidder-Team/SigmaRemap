// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1531 implements Runnable
{
    private static String[] field8544;
    public final /* synthetic */ long field8545;
    public final /* synthetic */ long field8546;
    public final /* synthetic */ Class22 field8547;
    public final /* synthetic */ Class6874 field8548;
    
    public Class1531(final Class6874 field8548, final long field8549, final long field8550, final Class22 field8551) {
        this.field8548 = field8548;
        this.field8545 = field8549;
        this.field8546 = field8550;
        this.field8547 = field8551;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class6874.method21038(this.field8548), false);
        for (long field8545 = this.field8545; field8545 < this.field8546; ++field8545) {
            for (long n = 0L; n < Class6874.method21038(this.field8548); ++n) {
                class22.method169(n, this.field8547.method135(n * Class6874.method21037(this.field8548) + field8545));
            }
            Class6874.method21036(this.field8548).method30446(class22);
            for (long n2 = 0L; n2 < Class6874.method21038(this.field8548); ++n2) {
                this.field8547.method169(n2 * Class6874.method21037(this.field8548) + field8545, class22.method135(n2));
            }
        }
    }
}
