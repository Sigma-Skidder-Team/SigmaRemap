// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1329 implements Runnable
{
    private static String[] field7294;
    public final /* synthetic */ int field7295;
    public final /* synthetic */ int field7296;
    public final /* synthetic */ int field7297;
    public final /* synthetic */ float[] field7298;
    public final /* synthetic */ float[] field7299;
    public final /* synthetic */ Class7978 field7300;
    
    public Class1329(final Class7978 field7300, final int field7301, final int field7302, final int field7303, final float[] field7304, final float[] field7305) {
        this.field7300 = field7300;
        this.field7295 = field7301;
        this.field7296 = field7302;
        this.field7297 = field7303;
        this.field7298 = field7304;
        this.field7299 = field7305;
    }
    
    @Override
    public void run() {
        for (int i = this.field7295; i < this.field7296; ++i) {
            final int n = 2 * i;
            final int n2 = n + 1;
            final int n3 = this.field7297 + i;
            this.field7298[n] = this.field7299[n3] * Class7978.method26004(this.field7300)[n];
            this.field7298[n2] = this.field7299[n3] * Class7978.method26004(this.field7300)[n2];
        }
    }
}
