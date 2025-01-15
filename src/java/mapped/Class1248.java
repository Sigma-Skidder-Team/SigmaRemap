// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1248 implements Runnable
{
    private static String[] field6788;
    public final /* synthetic */ int field6789;
    public final /* synthetic */ int field6790;
    public final /* synthetic */ double[] field6791;
    public final /* synthetic */ int field6792;
    public final /* synthetic */ double[] field6793;
    public final /* synthetic */ Class6970 field6794;
    
    public Class1248(final Class6970 field6794, final int field6795, final int field6796, final double[] field6797, final int field6798, final double[] field6799) {
        this.field6794 = field6794;
        this.field6789 = field6795;
        this.field6790 = field6796;
        this.field6791 = field6797;
        this.field6792 = field6798;
        this.field6793 = field6799;
    }
    
    @Override
    public void run() {
        for (int i = this.field6789; i < this.field6790; ++i) {
            final int n = 2 * i;
            final int n2 = n + 1;
            this.field6791[this.field6792 + i] = this.field6793[n] - this.field6793[n2];
            this.field6791[this.field6792 + Class6970.method21394(this.field6794) - i] = this.field6793[n] + this.field6793[n2];
        }
    }
}
