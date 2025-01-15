// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1415 implements Runnable
{
    private static String[] field7823;
    public final /* synthetic */ int field7824;
    public final /* synthetic */ int field7825;
    public final /* synthetic */ float[] field7826;
    public final /* synthetic */ Class6362 field7827;
    
    public Class1415(final Class6362 field7827, final int field7828, final int field7829, final float[] field7830) {
        this.field7827 = field7827;
        this.field7824 = field7828;
        this.field7825 = field7829;
        this.field7826 = field7830;
    }
    
    @Override
    public void run() {
        for (int i = this.field7824; i < this.field7825; ++i) {
            final int n = i * Class6362.method18997(this.field7827);
            for (int j = 0; j < Class6362.method18998(this.field7827); ++j) {
                Class6362.method19000(this.field7827).method25927(this.field7826, n + j * Class6362.method18999(this.field7827));
            }
        }
    }
}
