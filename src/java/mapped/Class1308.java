// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1308 implements Runnable
{
    private static String[] field7169;
    public final /* synthetic */ int field7170;
    public final /* synthetic */ int field7171;
    public final /* synthetic */ float[] field7172;
    public final /* synthetic */ boolean field7173;
    public final /* synthetic */ Class9117 field7174;
    
    public Class1308(final Class9117 field7174, final int field7175, final int field7176, final float[] field7177, final boolean field7178) {
        this.field7174 = field7174;
        this.field7170 = field7175;
        this.field7171 = field7176;
        this.field7172 = field7177;
        this.field7173 = field7178;
    }
    
    @Override
    public void run() {
        for (int i = this.field7170; i < this.field7171; ++i) {
            final int n = i * Class9117.method33002(this.field7174);
            for (int j = 0; j < Class9117.method33003(this.field7174); ++j) {
                Class9117.method33005(this.field7174).method29691(this.field7172, n + j * Class9117.method33004(this.field7174), this.field7173);
            }
        }
    }
}
