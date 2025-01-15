// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1642 implements Runnable
{
    private static String[] field9181;
    public final /* synthetic */ long field9182;
    public final /* synthetic */ long field9183;
    public final /* synthetic */ Class22 field9184;
    public final /* synthetic */ boolean field9185;
    public final /* synthetic */ Class6498 field9186;
    
    public Class1642(final Class6498 field9186, final long field9187, final long field9188, final Class22 field9189, final boolean field9190) {
        this.field9186 = field9186;
        this.field9182 = field9187;
        this.field9183 = field9188;
        this.field9184 = field9189;
        this.field9185 = field9190;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class6498.method19573(this.field9186), false);
        for (long field9182 = this.field9182; field9182 < this.field9183; ++field9182) {
            final long n = field9182 * Class6498.method19572(this.field9186);
            for (long n2 = 0L; n2 < Class6498.method19575(this.field9186); ++n2) {
                for (long n3 = 0L; n3 < Class6498.method19573(this.field9186); ++n3) {
                    class22.method169(n3, this.field9184.method135(n + n3 * Class6498.method19574(this.field9186) + n2));
                }
                Class6498.method19569(this.field9186).method34182(class22, this.field9185);
                for (long n4 = 0L; n4 < Class6498.method19573(this.field9186); ++n4) {
                    this.field9184.method169(n + n4 * Class6498.method19574(this.field9186) + n2, class22.method135(n4));
                }
            }
        }
    }
}
