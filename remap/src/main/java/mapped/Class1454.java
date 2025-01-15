// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1454 implements Runnable
{
    private static String[] field8058;
    public final /* synthetic */ int field8059;
    public final /* synthetic */ int field8060;
    public final /* synthetic */ float[] field8061;
    public final /* synthetic */ Class6874 field8062;
    
    public Class1454(final Class6874 field8062, final int field8063, final int field8064, final float[] field8065) {
        this.field8062 = field8062;
        this.field8059 = field8063;
        this.field8060 = field8064;
        this.field8061 = field8065;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6874.method21035(this.field8062)];
        for (int i = this.field8059; i < this.field8060; ++i) {
            for (int j = 0; j < Class6874.method21035(this.field8062); ++j) {
                array[j] = this.field8061[j * Class6874.method21033(this.field8062) + i];
            }
            Class6874.method21036(this.field8062).method30445(array);
            for (int k = 0; k < Class6874.method21035(this.field8062); ++k) {
                this.field8061[k * Class6874.method21033(this.field8062) + i] = array[k];
            }
        }
    }
}
