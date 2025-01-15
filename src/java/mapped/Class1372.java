// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1372 implements Runnable
{
    private static String[] field7532;
    public final /* synthetic */ int field7533;
    public final /* synthetic */ int field7534;
    public final /* synthetic */ float[] field7535;
    public final /* synthetic */ boolean field7536;
    public final /* synthetic */ Class9117 field7537;
    
    public Class1372(final Class9117 field7537, final int field7538, final int field7539, final float[] field7540, final boolean field7541) {
        this.field7537 = field7537;
        this.field7533 = field7538;
        this.field7534 = field7539;
        this.field7535 = field7540;
        this.field7536 = field7541;
    }
    
    @Override
    public void run() {
        for (int i = this.field7533; i < this.field7534; ++i) {
            final int n = i * Class9117.method33002(this.field7537);
            for (int j = 0; j < Class9117.method33003(this.field7537); ++j) {
                Class9117.method33005(this.field7537).method29695(this.field7535, n + j * Class9117.method33004(this.field7537), this.field7536);
            }
        }
    }
}
