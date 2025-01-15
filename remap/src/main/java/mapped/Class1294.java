// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1294 implements Runnable
{
    private static String[] field7071;
    public final /* synthetic */ int field7072;
    public final /* synthetic */ int field7073;
    public final /* synthetic */ int field7074;
    public final /* synthetic */ int field7075;
    public final /* synthetic */ float[] field7076;
    public final /* synthetic */ Class8328 field7077;
    
    public Class1294(final Class8328 field7077, final int field7078, final int field7079, final int field7080, final int field7081, final float[] field7082) {
        this.field7077 = field7077;
        this.field7072 = field7078;
        this.field7073 = field7079;
        this.field7074 = field7080;
        this.field7075 = field7081;
        this.field7076 = field7082;
    }
    
    @Override
    public void run() {
        for (int i = this.field7072; i < this.field7073; ++i) {
            final int n = i * this.field7074;
            final int n2 = (Class8328.method27760(this.field7077) - i + 1) * this.field7074;
            for (int j = this.field7075; j < Class8328.method27763(this.field7077); ++j) {
                final int n3 = 2 * j;
                final int n4 = 2 * (Class8328.method27763(this.field7077) - j);
                this.field7076[n3] = this.field7076[n4];
                this.field7076[n3 + 1] = -this.field7076[n4 + 1];
                final int n5 = n + n3;
                final int n6 = n2 - n3;
                this.field7076[n5] = this.field7076[n6];
                this.field7076[n5 + 1] = -this.field7076[n6 + 1];
            }
        }
    }
}
