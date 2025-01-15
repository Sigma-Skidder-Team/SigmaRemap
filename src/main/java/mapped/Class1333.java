// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1333 implements Runnable
{
    private static String[] field7313;
    public final /* synthetic */ int field7314;
    public final /* synthetic */ int field7315;
    public final /* synthetic */ int field7316;
    public final /* synthetic */ float[] field7317;
    public final /* synthetic */ Class9267 field7318;
    
    public Class1333(final Class9267 field7318, final int field7319, final int field7320, final int field7321, final float[] field7322) {
        this.field7318 = field7318;
        this.field7314 = field7319;
        this.field7315 = field7320;
        this.field7316 = field7321;
        this.field7317 = field7322;
    }
    
    @Override
    public void run() {
        final int n = this.field7314 + Class9267.method34189(this.field7318) - 1;
        for (int i = this.field7315; i < this.field7316; ++i) {
            final int n2 = this.field7314 + i;
            final float n3 = this.field7317[n2];
            final int n4 = n - i;
            this.field7317[n2] = this.field7317[n4];
            this.field7317[n4] = n3;
        }
    }
}
