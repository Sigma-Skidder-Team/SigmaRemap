// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1481 implements Runnable
{
    private static String[] field8228;
    public final /* synthetic */ int field8229;
    public final /* synthetic */ int field8230;
    public final /* synthetic */ int field8231;
    public final /* synthetic */ float[] field8232;
    public final /* synthetic */ boolean field8233;
    public final /* synthetic */ Class6874 field8234;
    
    public Class1481(final Class6874 field8234, final int field8235, final int field8236, final int field8237, final float[] field8238, final boolean field8239) {
        this.field8234 = field8234;
        this.field8229 = field8235;
        this.field8230 = field8236;
        this.field8231 = field8237;
        this.field8232 = field8238;
        this.field8233 = field8239;
    }
    
    @Override
    public void run() {
        if (this.field8229 != -1) {
            for (int i = this.field8230; i < Class6874.method21035(this.field8234); i += this.field8231) {
                Class6874.method21034(this.field8234).method30451(this.field8232, i * Class6874.method21033(this.field8234), this.field8233);
            }
        }
        else {
            for (int j = this.field8230; j < Class6874.method21035(this.field8234); j += this.field8231) {
                Class6874.method21034(this.field8234).method30447(this.field8232, j * Class6874.method21033(this.field8234));
            }
        }
    }
}
