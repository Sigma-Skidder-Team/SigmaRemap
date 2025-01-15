// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1098 implements Runnable
{
    private static String[] field5927;
    public final /* synthetic */ long field5928;
    public final /* synthetic */ int field5929;
    public final /* synthetic */ int field5930;
    public final /* synthetic */ int field5931;
    public final /* synthetic */ Class17 field5932;
    public final /* synthetic */ boolean field5933;
    public final /* synthetic */ Class8983 field5934;
    
    public Class1098(final Class8983 field5934, final long field5935, final int field5936, final int field5937, final int field5938, final Class17 field5939, final boolean field5940) {
        this.field5934 = field5934;
        this.field5928 = field5935;
        this.field5929 = field5936;
        this.field5930 = field5937;
        this.field5931 = field5938;
        this.field5932 = field5939;
        this.field5933 = field5940;
    }
    
    @Override
    public void run() {
        if (this.field5928 != 0L) {
            if (this.field5929 != 1) {
                for (long n = this.field5930; n < Class8983.method31978(this.field5934); n += this.field5931) {
                    Class8983.method31975(this.field5934).method26091(this.field5932, n * Class8983.method31980(this.field5934), this.field5933);
                }
            }
            else {
                for (long n2 = this.field5930; n2 < Class8983.method31978(this.field5934); n2 += this.field5931) {
                    Class8983.method31975(this.field5934).method26083(this.field5932, n2 * Class8983.method31980(this.field5934));
                }
            }
        }
        else if (this.field5929 != -1) {
            for (long n3 = this.field5930; n3 < Class8983.method31978(this.field5934); n3 += this.field5931) {
                Class8983.method31975(this.field5934).method26079(this.field5932, n3 * Class8983.method31980(this.field5934), this.field5933);
            }
        }
        else {
            for (long n4 = this.field5930; n4 < Class8983.method31978(this.field5934); n4 += this.field5931) {
                Class8983.method31975(this.field5934).method26075(this.field5932, n4 * Class8983.method31980(this.field5934));
            }
        }
    }
}
