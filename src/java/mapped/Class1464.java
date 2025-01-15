// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1464 implements Runnable
{
    private static String[] field8123;
    public final /* synthetic */ long field8124;
    public final /* synthetic */ long field8125;
    public final /* synthetic */ Class22 field8126;
    public final /* synthetic */ boolean field8127;
    public final /* synthetic */ Class5934 field8128;
    
    public Class1464(final Class5934 field8128, final long field8129, final long field8130, final Class22 field8131, final boolean field8132) {
        this.field8128 = field8128;
        this.field8124 = field8129;
        this.field8125 = field8130;
        this.field8126 = field8131;
        this.field8127 = field8132;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class5934.method17845(this.field8128), false);
        for (long field8124 = this.field8124; field8124 < this.field8125; ++field8124) {
            final long n = field8124 * Class5934.method17848(this.field8128);
            for (long n2 = 0L; n2 < Class5934.method17846(this.field8128); ++n2) {
                for (long n3 = 0L; n3 < Class5934.method17845(this.field8128); ++n3) {
                    class22.method169(n3, this.field8126.method135(n + n3 * Class5934.method17849(this.field8128) + n2));
                }
                Class5934.method17842(this.field8128).method30450(class22, this.field8127);
                for (long n4 = 0L; n4 < Class5934.method17845(this.field8128); ++n4) {
                    this.field8126.method169(n + n4 * Class5934.method17849(this.field8128) + n2, class22.method135(n4));
                }
            }
        }
    }
}
