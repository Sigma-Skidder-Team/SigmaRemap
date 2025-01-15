// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1611 implements Runnable
{
    private static String[] field8994;
    public final /* synthetic */ long field8995;
    public final /* synthetic */ long field8996;
    public final /* synthetic */ Class22 field8997;
    public final /* synthetic */ boolean field8998;
    public final /* synthetic */ Class6710 field8999;
    
    public Class1611(final Class6710 field8999, final long field9000, final long field9001, final Class22 field9002, final boolean field9003) {
        this.field8999 = field8999;
        this.field8995 = field9000;
        this.field8996 = field9001;
        this.field8997 = field9002;
        this.field8998 = field9003;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class6710.method20385(this.field8999), false);
        for (long field8995 = this.field8995; field8995 < this.field8996; ++field8995) {
            for (long n = 0L; n < Class6710.method20385(this.field8999); ++n) {
                class22.method169(n, this.field8997.method135(n * Class6710.method20384(this.field8999) + field8995));
            }
            Class6710.method20383(this.field8999).method34186(class22, this.field8998);
            for (long n2 = 0L; n2 < Class6710.method20385(this.field8999); ++n2) {
                this.field8997.method169(n2 * Class6710.method20384(this.field8999) + field8995, class22.method135(n2));
            }
        }
    }
}
