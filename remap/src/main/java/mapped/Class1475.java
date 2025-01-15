// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1475 implements Runnable
{
    private static String[] field8188;
    public final /* synthetic */ long field8189;
    public final /* synthetic */ long field8190;
    public final /* synthetic */ Class17 field8191;
    public final /* synthetic */ boolean field8192;
    public final /* synthetic */ Class5815 field8193;
    
    public Class1475(final Class5815 field8193, final long field8194, final long field8195, final Class17 field8196, final boolean field8197) {
        this.field8193 = field8193;
        this.field8189 = field8194;
        this.field8190 = field8195;
        this.field8191 = field8196;
        this.field8192 = field8197;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class5815.method17507(this.field8193), false);
        for (long field8189 = this.field8189; field8189 < this.field8190; ++field8189) {
            final long n = field8189 * Class5815.method17509(this.field8193);
            for (long n2 = 0L; n2 < Class5815.method17506(this.field8193); ++n2) {
                for (long n3 = 0L; n3 < Class5815.method17507(this.field8193); ++n3) {
                    class17.method171(n3, this.field8191.method137(n3 * Class5815.method17508(this.field8193) + n + n2));
                }
                Class5815.method17504(this.field8193).method21391(class17, this.field8192);
                for (long n4 = 0L; n4 < Class5815.method17507(this.field8193); ++n4) {
                    this.field8191.method171(n4 * Class5815.method17508(this.field8193) + n + n2, class17.method137(n4));
                }
            }
        }
    }
}
