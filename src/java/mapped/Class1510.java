// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1510 implements Runnable
{
    private static String[] field8408;
    public final /* synthetic */ int field8409;
    public final /* synthetic */ int field8410;
    public final /* synthetic */ float[][] field8411;
    public final /* synthetic */ Class8328 field8412;
    
    public Class1510(final Class8328 field8412, final int field8413, final int field8414, final float[][] field8415) {
        this.field8412 = field8412;
        this.field8409 = field8413;
        this.field8410 = field8414;
        this.field8411 = field8415;
    }
    
    @Override
    public void run() {
        for (int i = this.field8409; i < this.field8410; ++i) {
            Class8328.method27759(this.field8412).method25933(this.field8411[i]);
        }
    }
}
