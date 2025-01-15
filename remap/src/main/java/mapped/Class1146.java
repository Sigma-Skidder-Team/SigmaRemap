// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1146 implements Runnable
{
    private static String[] field6193;
    public final /* synthetic */ int field6194;
    public final /* synthetic */ int field6195;
    public final /* synthetic */ int field6196;
    public final /* synthetic */ double[] field6197;
    public final /* synthetic */ int field6198;
    public final /* synthetic */ int field6199;
    public final /* synthetic */ Class8983 field6200;
    
    public Class1146(final Class8983 field6200, final int field6201, final int field6202, final int field6203, final double[] field6204, final int field6205, final int field6206) {
        this.field6200 = field6200;
        this.field6194 = field6201;
        this.field6195 = field6202;
        this.field6196 = field6203;
        this.field6197 = field6204;
        this.field6198 = field6205;
        this.field6199 = field6206;
    }
    
    @Override
    public void run() {
        for (int i = this.field6194; i < this.field6195; ++i) {
            final int n = i * this.field6196;
            final int n2 = (Class8983.method31976(this.field6200) - i) * this.field6196;
            final int n3 = n + Class8983.method31979(this.field6200);
            this.field6197[n3] = this.field6197[n2 + 1];
            this.field6197[n3 + 1] = -this.field6197[n2];
        }
        for (int j = this.field6194; j < this.field6195; ++j) {
            final int n4 = j * this.field6196;
            final int n5 = (Class8983.method31976(this.field6200) - j + 1) * this.field6196;
            for (int k = Class8983.method31979(this.field6200) + 2; k < this.field6196; k += 2) {
                final int n6 = n5 - k;
                final int n7 = n4 + k;
                this.field6197[n7] = this.field6197[n6];
                this.field6197[n7 + 1] = -this.field6197[n6 + 1];
            }
        }
        for (int l = this.field6198; l < this.field6199; ++l) {
            final int n8 = (Class8983.method31976(this.field6200) - l) % Class8983.method31976(this.field6200) * this.field6196;
            final int n9 = l * this.field6196;
            for (int n10 = 0; n10 < this.field6196; n10 += 2) {
                final int n11 = n8 + (this.field6196 - n10) % this.field6196;
                final int n12 = n9 + n10;
                this.field6197[n11] = this.field6197[n12];
                this.field6197[n11 + 1] = -this.field6197[n12 + 1];
            }
        }
    }
}
