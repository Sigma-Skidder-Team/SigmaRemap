// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1408 implements Runnable
{
    private static String[] field7778;
    public final /* synthetic */ int field7779;
    public final /* synthetic */ int field7780;
    public final /* synthetic */ int field7781;
    public final /* synthetic */ double[][] field7782;
    public final /* synthetic */ Class8983 field7783;
    
    public Class1408(final Class8983 field7783, final int field7784, final int field7785, final int field7786, final double[][] field7787) {
        this.field7783 = field7783;
        this.field7779 = field7784;
        this.field7780 = field7785;
        this.field7781 = field7786;
        this.field7782 = field7787;
    }
    
    @Override
    public void run() {
        for (int i = this.field7779; i < this.field7780; ++i) {
            final int n = Class8983.method31976(this.field7783) - i;
            for (int j = this.field7781; j < Class8983.method31979(this.field7783); ++j) {
                final int n2 = 2 * j;
                final int n3 = 2 * (Class8983.method31979(this.field7783) - j);
                this.field7782[0][n2] = this.field7782[0][n3];
                this.field7782[0][n2 + 1] = -this.field7782[0][n3 + 1];
                this.field7782[i][n2] = this.field7782[n][n3];
                this.field7782[i][n2 + 1] = -this.field7782[n][n3 + 1];
            }
        }
    }
}
