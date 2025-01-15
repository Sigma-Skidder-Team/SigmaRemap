// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1387 implements Runnable
{
    private static String[] field7635;
    public final /* synthetic */ int field7636;
    public final /* synthetic */ int field7637;
    public final /* synthetic */ int field7638;
    public final /* synthetic */ int field7639;
    public final /* synthetic */ float[] field7640;
    public final /* synthetic */ Class8328 field7641;
    
    public Class1387(final Class8328 field7641, final int field7642, final int field7643, final int field7644, final int field7645, final float[] field7646) {
        this.field7641 = field7641;
        this.field7636 = field7642;
        this.field7637 = field7643;
        this.field7638 = field7644;
        this.field7639 = field7645;
        this.field7640 = field7646;
    }
    
    @Override
    public void run() {
        for (int i = this.field7636; i < this.field7637; ++i) {
            final int n = i * this.field7638;
            final int n2 = (Class8328.method27760(this.field7641) - i + 1) * this.field7638;
            for (int j = this.field7639; j < Class8328.method27763(this.field7641); ++j) {
                final int n3 = 2 * j;
                final int n4 = 2 * (Class8328.method27763(this.field7641) - j);
                this.field7640[n3] = this.field7640[n4];
                this.field7640[n3 + 1] = -this.field7640[n4 + 1];
                final int n5 = n + n3;
                final int n6 = n2 - n3;
                this.field7640[n5] = this.field7640[n6];
                this.field7640[n5 + 1] = -this.field7640[n6 + 1];
            }
        }
    }
}
