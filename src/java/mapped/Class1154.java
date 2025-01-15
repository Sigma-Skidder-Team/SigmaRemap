// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1154 implements Runnable
{
    private static String[] field6248;
    public final /* synthetic */ int field6249;
    public final /* synthetic */ int field6250;
    public final /* synthetic */ int field6251;
    public final /* synthetic */ float[] field6252;
    public final /* synthetic */ int field6253;
    public final /* synthetic */ int field6254;
    public final /* synthetic */ Class8328 field6255;
    
    public Class1154(final Class8328 field6255, final int field6256, final int field6257, final int field6258, final float[] field6259, final int field6260, final int field6261) {
        this.field6255 = field6255;
        this.field6249 = field6256;
        this.field6250 = field6257;
        this.field6251 = field6258;
        this.field6252 = field6259;
        this.field6253 = field6260;
        this.field6254 = field6261;
    }
    
    @Override
    public void run() {
        for (int i = this.field6249; i < this.field6250; ++i) {
            final int n = i * this.field6251;
            final int n2 = (Class8328.method27760(this.field6255) - i) * this.field6251;
            final int n3 = n + Class8328.method27763(this.field6255);
            this.field6252[n3] = this.field6252[n2 + 1];
            this.field6252[n3 + 1] = -this.field6252[n2];
        }
        for (int j = this.field6249; j < this.field6250; ++j) {
            final int n4 = j * this.field6251;
            final int n5 = (Class8328.method27760(this.field6255) - j + 1) * this.field6251;
            for (int k = Class8328.method27763(this.field6255) + 2; k < this.field6251; k += 2) {
                final int n6 = n5 - k;
                final int n7 = n4 + k;
                this.field6252[n7] = this.field6252[n6];
                this.field6252[n7 + 1] = -this.field6252[n6 + 1];
            }
        }
        for (int l = this.field6253; l < this.field6254; ++l) {
            final int n8 = (Class8328.method27760(this.field6255) - l) % Class8328.method27760(this.field6255) * this.field6251;
            final int n9 = l * this.field6251;
            for (int n10 = 0; n10 < this.field6251; n10 += 2) {
                final int n11 = n8 + (this.field6251 - n10) % this.field6251;
                final int n12 = n9 + n10;
                this.field6252[n11] = this.field6252[n12];
                this.field6252[n11 + 1] = -this.field6252[n12 + 1];
            }
        }
    }
}
