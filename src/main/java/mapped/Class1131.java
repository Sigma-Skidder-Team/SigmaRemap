// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1131 implements Runnable
{
    private static String[] field6111;
    public final /* synthetic */ long field6112;
    public final /* synthetic */ long field6113;
    public final /* synthetic */ Class22 field6114;
    public final /* synthetic */ Class22 field6115;
    public final /* synthetic */ long field6116;
    public final /* synthetic */ boolean field6117;
    public final /* synthetic */ Class6362 field6118;
    
    public Class1131(final Class6362 field6118, final long field6119, final long field6120, final Class22 field6121, final Class22 field6122, final long field6123, final boolean field6124) {
        this.field6118 = field6118;
        this.field6112 = field6119;
        this.field6113 = field6120;
        this.field6114 = field6121;
        this.field6115 = field6122;
        this.field6116 = field6123;
        this.field6117 = field6124;
    }
    
    @Override
    public void run() {
        for (long field6112 = this.field6112; field6112 < this.field6113; ++field6112) {
            final long n = field6112 * Class6362.method19005(this.field6118);
            for (long n2 = 0L; n2 < Class6362.method19006(this.field6118); ++n2) {
                Class8601.method29152(this.field6114, n + n2 * Class6362.method19007(this.field6118), this.field6115, field6112 * Class6362.method19006(this.field6118) * this.field6116 + n2 * this.field6116, Class6362.method19008(this.field6118));
                Class6362.method19000(this.field6118).method25948(this.field6115, field6112 * Class6362.method19006(this.field6118) * this.field6116 + n2 * this.field6116, this.field6117);
            }
        }
    }
}
