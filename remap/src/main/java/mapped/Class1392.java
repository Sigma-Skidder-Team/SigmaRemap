// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1392 implements Runnable
{
    private static String[] field7669;
    public final /* synthetic */ int field7670;
    public final /* synthetic */ int field7671;
    public final /* synthetic */ int field7672;
    public final /* synthetic */ float[] field7673;
    public final /* synthetic */ float[] field7674;
    public final /* synthetic */ int field7675;
    
    public Class1392(final int field7670, final int field7671, final int field7672, final float[] field7673, final float[] field7674, final int field7675) {
        this.field7670 = field7670;
        this.field7671 = field7671;
        this.field7672 = field7672;
        this.field7673 = field7673;
        this.field7674 = field7674;
        this.field7675 = field7675;
    }
    
    @Override
    public void run() {
        final int n = this.field7670 + this.field7671;
        int n2 = 1;
        int i = this.field7672;
        while (i > 512) {
            i >>= 2;
            n2 <<= 2;
            Class9133.method33275(i, this.field7673, n - i, this.field7674, this.field7675 - i);
        }
        Class9133.method33271(i, 0, this.field7673, n - i, this.field7675, this.field7674);
        int n3 = n2 >> 1;
        final int n4 = this.field7670 - i;
        for (int j = this.field7671 - i; j > 0; j -= i) {
            ++n3;
            Class9133.method33271(i, Class9133.method33269(i, j, n3, this.field7673, this.field7670, this.field7675, this.field7674), this.field7673, n4 + j, this.field7675, this.field7674);
        }
    }
}
