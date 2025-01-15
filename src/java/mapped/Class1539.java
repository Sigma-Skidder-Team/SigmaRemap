// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1539 implements Runnable
{
    private static String[] field8599;
    public final /* synthetic */ long field8600;
    public final /* synthetic */ long field8601;
    public final /* synthetic */ Class17 field8602;
    public final /* synthetic */ boolean field8603;
    public final /* synthetic */ Class7568 field8604;
    
    public Class1539(final Class7568 field8604, final long field8605, final long field8606, final Class17 field8607, final boolean field8608) {
        this.field8604 = field8604;
        this.field8600 = field8605;
        this.field8601 = field8606;
        this.field8602 = field8607;
        this.field8603 = field8608;
    }
    
    @Override
    public void run() {
        for (long field8600 = this.field8600; field8600 < this.field8601; ++field8600) {
            final long n = field8600 * Class7568.method23784(this.field8604);
            for (long n2 = 0L; n2 < Class7568.method23785(this.field8604); ++n2) {
                Class7568.method23779(this.field8604).method30724(this.field8602, n + n2 * Class7568.method23786(this.field8604), this.field8603);
            }
        }
    }
}
