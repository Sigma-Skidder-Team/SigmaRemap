// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1374 implements Runnable
{
    private static String[] field7546;
    public final /* synthetic */ long field7547;
    public final /* synthetic */ long field7548;
    public final /* synthetic */ Class23 field7549;
    public final /* synthetic */ Class23 field7550;
    
    public Class1374(final Class23 field7550, final long field7551, final long field7552, final Class23 field7553) {
        this.field7550 = field7550;
        this.field7547 = field7551;
        this.field7548 = field7552;
        this.field7549 = field7553;
    }
    
    @Override
    public void run() {
        for (long field7547 = this.field7547; field7547 < this.field7548; ++field7547) {
            this.field7549.method159(field7547, (byte)(1 - this.field7550.method125(field7547)));
        }
    }
}
