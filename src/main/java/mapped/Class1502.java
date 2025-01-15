// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1502 implements Runnable
{
    private static String[] field8356;
    public final /* synthetic */ int field8357;
    public final /* synthetic */ int field8358;
    public final /* synthetic */ int field8359;
    public final /* synthetic */ int field8360;
    public final /* synthetic */ double[] field8361;
    public final /* synthetic */ Class8983 field8362;
    
    public Class1502(final Class8983 field8362, final int field8363, final int field8364, final int field8365, final int field8366, final double[] field8367) {
        this.field8362 = field8362;
        this.field8357 = field8363;
        this.field8358 = field8364;
        this.field8359 = field8365;
        this.field8360 = field8366;
        this.field8361 = field8367;
    }
    
    @Override
    public void run() {
        for (int i = this.field8357; i < this.field8358; ++i) {
            final int n = i * this.field8359;
            final int n2 = (Class8983.method31976(this.field8362) - i + 1) * this.field8359;
            for (int j = this.field8360; j < Class8983.method31979(this.field8362); ++j) {
                final int n3 = 2 * j;
                final int n4 = 2 * (Class8983.method31979(this.field8362) - j);
                this.field8361[n3] = this.field8361[n4];
                this.field8361[n3 + 1] = -this.field8361[n4 + 1];
                final int n5 = n + n3;
                final int n6 = n2 - n3;
                this.field8361[n5] = this.field8361[n6];
                this.field8361[n5 + 1] = -this.field8361[n6 + 1];
            }
        }
    }
}
