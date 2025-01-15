// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1367 implements Runnable
{
    private static String[] field7508;
    public final /* synthetic */ int field7509;
    public final /* synthetic */ int field7510;
    public final /* synthetic */ float[] field7511;
    public final /* synthetic */ float field7512;
    
    public Class1367(final int field7509, final int field7510, final float[] field7511, final float field7512) {
        this.field7509 = field7509;
        this.field7510 = field7510;
        this.field7511 = field7511;
        this.field7512 = field7512;
    }
    
    @Override
    public void run() {
        for (int i = this.field7509; i < this.field7510; ++i) {
            final float[] field7511 = this.field7511;
            final int n = i;
            field7511[n] *= this.field7512;
        }
    }
}
