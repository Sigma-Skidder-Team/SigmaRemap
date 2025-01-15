// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1183 implements Runnable
{
    private static String[] field6406;
    public final /* synthetic */ long field6407;
    public final /* synthetic */ long field6408;
    public final /* synthetic */ long field6409;
    public final /* synthetic */ long field6410;
    public final /* synthetic */ long field6411;
    public final /* synthetic */ Class17 field6412;
    public final /* synthetic */ Class6733 field6413;
    
    public Class1183(final Class6733 field6413, final long field6414, final long field6415, final long field6416, final long field6417, final long field6418, final Class17 field6419) {
        this.field6413 = field6413;
        this.field6407 = field6414;
        this.field6408 = field6415;
        this.field6409 = field6416;
        this.field6410 = field6417;
        this.field6411 = field6418;
        this.field6412 = field6419;
    }
    
    @Override
    public void run() {
        for (long field6407 = this.field6407; field6407 < this.field6408; ++field6407) {
            final long n = (Class6733.method20485(this.field6413) - field6407) % Class6733.method20485(this.field6413) * this.field6409;
            final long n2 = field6407 * this.field6409;
            for (long n3 = 0L; n3 < Class6733.method20482(this.field6413); ++n3) {
                final long n4 = (Class6733.method20482(this.field6413) - n3) % Class6733.method20482(this.field6413) * this.field6410;
                final long n5 = n3 * this.field6410;
                for (long n6 = 1L; n6 < Class6733.method20484(this.field6413); n6 += 2L) {
                    final long n7 = n + n4 + this.field6411 - n6;
                    final long n8 = n2 + n5 + n6;
                    this.field6412.method171(n7, -this.field6412.method137(n8 + 2L));
                    this.field6412.method171(n7 - 1L, this.field6412.method137(n8 + 1L));
                }
            }
        }
    }
}
