// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1382 implements Runnable
{
    private static String[] field7603;
    public final /* synthetic */ int field7604;
    public final /* synthetic */ int field7605;
    public final /* synthetic */ int field7606;
    public final /* synthetic */ float[][] field7607;
    public final /* synthetic */ Class8328 field7608;
    
    public Class1382(final Class8328 field7608, final int field7609, final int field7610, final int field7611, final float[][] field7612) {
        this.field7608 = field7608;
        this.field7604 = field7609;
        this.field7605 = field7610;
        this.field7606 = field7611;
        this.field7607 = field7612;
    }
    
    @Override
    public void run() {
        for (int i = this.field7604; i < this.field7605; ++i) {
            final int n = Class8328.method27760(this.field7608) - i;
            for (int j = this.field7606; j < Class8328.method27763(this.field7608); ++j) {
                final int n2 = 2 * j;
                final int n3 = 2 * (Class8328.method27763(this.field7608) - j);
                this.field7607[0][n2] = this.field7607[0][n3];
                this.field7607[0][n2 + 1] = -this.field7607[0][n3 + 1];
                this.field7607[i][n2] = this.field7607[n][n3];
                this.field7607[i][n2 + 1] = -this.field7607[n][n3 + 1];
            }
        }
    }
}
