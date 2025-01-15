// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1385 implements Runnable
{
    private static String[] field7621;
    public final /* synthetic */ int field7622;
    public final /* synthetic */ int field7623;
    public final /* synthetic */ int field7624;
    public final /* synthetic */ int field7625;
    public final /* synthetic */ double[] field7626;
    public final /* synthetic */ double[][] field7627;
    public final /* synthetic */ Class8983 field7628;
    
    public Class1385(final Class8983 field7628, final int field7629, final int field7630, final int field7631, final int field7632, final double[] field7633, final double[][] field7634) {
        this.field7628 = field7628;
        this.field7622 = field7629;
        this.field7623 = field7630;
        this.field7624 = field7631;
        this.field7625 = field7632;
        this.field7626 = field7633;
        this.field7627 = field7634;
    }
    
    @Override
    public void run() {
        for (int i = this.field7622; i < this.field7623; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < this.field7624; ++j) {
                final int n2 = i * this.field7625 + 2 * j;
                this.field7626[n2] = this.field7627[j][n];
                this.field7626[n2 + 1] = this.field7627[j][n + 1];
            }
        }
    }
}
