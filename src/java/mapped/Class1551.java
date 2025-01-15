// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1551 implements Runnable
{
    private static String[] field8666;
    public final /* synthetic */ long field8667;
    public final /* synthetic */ long field8668;
    public final /* synthetic */ long field8669;
    public final /* synthetic */ long field8670;
    public final /* synthetic */ Class22 field8671;
    public final /* synthetic */ boolean field8672;
    public final /* synthetic */ Class6362 field8673;
    
    public Class1551(final Class6362 field8673, final long field8674, final long field8675, final long field8676, final long field8677, final Class22 field8678, final boolean field8679) {
        this.field8673 = field8673;
        this.field8667 = field8674;
        this.field8668 = field8675;
        this.field8669 = field8676;
        this.field8670 = field8677;
        this.field8671 = field8678;
        this.field8672 = field8679;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(2L * Class6362.method19009(this.field8673), false);
        for (long field8667 = this.field8667; field8667 < this.field8668; ++field8667) {
            final long n = field8667 * this.field8669;
            for (long n2 = 0L; n2 < Class6362.method19008(this.field8673); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6362.method19009(this.field8673); ++n4) {
                    final long n5 = 2L * n4;
                    final long n6 = n4 * this.field8670 + n + n3;
                    class22.method169(n5, this.field8671.method135(n6));
                    class22.method169(n5 + 1L, this.field8671.method135(n6 + 1L));
                }
                Class6362.method19004(this.field8673).method25930(class22, this.field8672);
                for (long n7 = 0L; n7 < Class6362.method19009(this.field8673); ++n7) {
                    final long n8 = 2L * n7;
                    final long n9 = n7 * this.field8670 + n + n3;
                    this.field8671.method169(n9, class22.method135(n8));
                    this.field8671.method169(n9 + 1L, class22.method135(n8 + 1L));
                }
            }
        }
    }
}
