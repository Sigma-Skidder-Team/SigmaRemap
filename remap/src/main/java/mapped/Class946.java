// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class946 implements Runnable
{
    private static String[] field4994;
    public final /* synthetic */ int field4995;
    public final /* synthetic */ int field4996;
    public final /* synthetic */ int field4997;
    public final /* synthetic */ int field4998;
    public final /* synthetic */ int field4999;
    public final /* synthetic */ int field5000;
    public final /* synthetic */ float[] field5001;
    public final /* synthetic */ Class6362 field5002;
    
    public Class946(final Class6362 field5002, final int field5003, final int field5004, final int field5005, final int field5006, final int field5007, final int field5008, final float[] field5009) {
        this.field5002 = field5002;
        this.field4995 = field5003;
        this.field4996 = field5004;
        this.field4997 = field5005;
        this.field4998 = field5006;
        this.field4999 = field5007;
        this.field5000 = field5008;
        this.field5001 = field5009;
    }
    
    @Override
    public void run() {
        for (int i = this.field4995; i < this.field4996; ++i) {
            final int n = (Class6362.method19003(this.field5002) - i) % Class6362.method19003(this.field5002) * this.field4997;
            final int n2 = i * this.field4997;
            for (int j = 1; j < this.field4998; ++j) {
                final int n3 = (Class6362.method18998(this.field5002) - j) * this.field4999;
                final int n4 = j * this.field4999;
                final int n5 = n + n3;
                for (int k = 0; k < Class6362.method19001(this.field5002); ++k) {
                    final int n6 = 2 * k;
                    final int n7 = this.field5000 - n6;
                    final int n8 = n2 + n4 + n6;
                    this.field5001[n5 + n7 % this.field5000] = this.field5001[n8];
                    this.field5001[n5 + (n7 + 1) % this.field5000] = -this.field5001[n8 + 1];
                }
            }
        }
    }
}
