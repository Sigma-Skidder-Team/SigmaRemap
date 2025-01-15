// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1469 implements Runnable
{
    private static String[] field8154;
    public final /* synthetic */ long field8155;
    public final /* synthetic */ long field8156;
    public final /* synthetic */ Class17 field8157;
    public final /* synthetic */ Class7992 field8158;
    
    public Class1469(final Class7992 field8158, final long field8159, final long field8160, final Class17 field8161) {
        this.field8158 = field8158;
        this.field8155 = field8159;
        this.field8156 = field8160;
        this.field8157 = field8161;
    }
    
    @Override
    public void run() {
        for (long field8155 = this.field8155; field8155 < this.field8156; ++field8155) {
            final long n = 2L * field8155;
            final long n2 = n + 1L;
            final double n3 = -this.field8157.method137(n) * Class7992.method26154(this.field8158).method137(n2) + this.field8157.method137(n2) * Class7992.method26154(this.field8158).method137(n);
            this.field8157.method171(n, this.field8157.method137(n) * Class7992.method26154(this.field8158).method137(n) + this.field8157.method137(n2) * Class7992.method26154(this.field8158).method137(n2));
            this.field8157.method171(n2, n3);
        }
    }
}
