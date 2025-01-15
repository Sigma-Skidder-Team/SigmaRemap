// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1299 implements Runnable
{
    private static String[] field7105;
    public final /* synthetic */ int field7106;
    public final /* synthetic */ int field7107;
    public final /* synthetic */ float[] field7108;
    public final /* synthetic */ boolean field7109;
    public final /* synthetic */ Class9117 field7110;
    
    public Class1299(final Class9117 field7110, final int field7111, final int field7112, final float[] field7113, final boolean field7114) {
        this.field7110 = field7110;
        this.field7106 = field7111;
        this.field7107 = field7112;
        this.field7108 = field7113;
        this.field7109 = field7114;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class9117.method33008(this.field7110)];
        for (int i = this.field7106; i < this.field7107; ++i) {
            final int n = i * Class9117.method33004(this.field7110);
            for (int j = 0; j < Class9117.method33006(this.field7110); ++j) {
                for (int k = 0; k < Class9117.method33008(this.field7110); ++k) {
                    array[k] = this.field7108[k * Class9117.method33002(this.field7110) + n + j];
                }
                Class9117.method33009(this.field7110).method29693(array, this.field7109);
                for (int l = 0; l < Class9117.method33008(this.field7110); ++l) {
                    this.field7108[l * Class9117.method33002(this.field7110) + n + j] = array[l];
                }
            }
        }
    }
}
