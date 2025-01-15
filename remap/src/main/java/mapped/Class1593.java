// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1593 implements Runnable
{
    private static String[] field8888;
    public final /* synthetic */ long field8889;
    public final /* synthetic */ long field8890;
    public final /* synthetic */ Class17 field8891;
    public final /* synthetic */ boolean field8892;
    public final /* synthetic */ Class7568 field8893;
    
    public Class1593(final Class7568 field8893, final long field8894, final long field8895, final Class17 field8896, final boolean field8897) {
        this.field8893 = field8893;
        this.field8889 = field8894;
        this.field8890 = field8895;
        this.field8891 = field8896;
        this.field8892 = field8897;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class7568.method23785(this.field8893), false);
        for (long field8889 = this.field8889; field8889 < this.field8890; ++field8889) {
            final long n = field8889 * Class7568.method23784(this.field8893);
            for (long n2 = 0L; n2 < Class7568.method23787(this.field8893); ++n2) {
                for (long n3 = 0L; n3 < Class7568.method23785(this.field8893); ++n3) {
                    class17.method171(n3, this.field8891.method137(n + n3 * Class7568.method23786(this.field8893) + n2));
                }
                Class7568.method23781(this.field8893).method30722(class17, this.field8892);
                for (long n4 = 0L; n4 < Class7568.method23785(this.field8893); ++n4) {
                    this.field8891.method171(n + n4 * Class7568.method23786(this.field8893) + n2, class17.method137(n4));
                }
            }
        }
    }
}
