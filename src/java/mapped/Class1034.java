// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1034 implements Runnable
{
    private static String[] field5540;
    public final /* synthetic */ int field5541;
    public final /* synthetic */ int field5542;
    public final /* synthetic */ double[] field5543;
    public final /* synthetic */ boolean field5544;
    public final /* synthetic */ Class5815 field5545;
    
    public Class1034(final Class5815 field5545, final int field5546, final int field5547, final double[] field5548, final boolean field5549) {
        this.field5545 = field5545;
        this.field5541 = field5546;
        this.field5542 = field5547;
        this.field5543 = field5548;
        this.field5544 = field5549;
    }
    
    @Override
    public void run() {
        for (int i = this.field5541; i < this.field5542; ++i) {
            final int n = i * Class5815.method17497(this.field5545);
            for (int j = 0; j < Class5815.method17498(this.field5545); ++j) {
                Class5815.method17500(this.field5545).method21392(this.field5543, n + j * Class5815.method17499(this.field5545), this.field5544);
            }
        }
    }
}
