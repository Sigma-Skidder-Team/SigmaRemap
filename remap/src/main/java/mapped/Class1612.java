// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1612 implements Runnable
{
    private static String[] field9000;
    public final /* synthetic */ int field9001;
    public final /* synthetic */ int field9002;
    public final /* synthetic */ int field9003;
    public final /* synthetic */ int field9004;
    public final /* synthetic */ float[] field9005;
    public final /* synthetic */ int field9006;
    public final /* synthetic */ Class6362 field9007;
    
    public Class1612(final Class6362 field9007, final int field9008, final int field9009, final int field9010, final int field9011, final float[] field9012, final int field9013) {
        this.field9007 = field9007;
        this.field9001 = field9008;
        this.field9002 = field9009;
        this.field9003 = field9010;
        this.field9004 = field9011;
        this.field9005 = field9012;
        this.field9006 = field9013;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field9001];
        for (int i = this.field9002; i >= this.field9003; --i) {
            final int n = i * Class6362.method18997(this.field9007);
            final int n2 = i * this.field9004;
            for (int j = Class6362.method18998(this.field9007) - 1; j >= 0; --j) {
                System.arraycopy(this.field9005, n + j * Class6362.method18999(this.field9007), array, 0, Class6362.method19001(this.field9007));
                Class6362.method19000(this.field9007).method25937(array);
                System.arraycopy(array, 0, this.field9005, n2 + j * this.field9006, this.field9001);
            }
        }
    }
}
