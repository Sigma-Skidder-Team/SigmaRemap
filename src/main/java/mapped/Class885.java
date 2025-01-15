// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class885 implements Runnable
{
    private static String[] field4777;
    public final /* synthetic */ long field4778;
    public final /* synthetic */ long field4779;
    public final /* synthetic */ Class17 field4780;
    public final /* synthetic */ Class5815 field4781;
    
    public Class885(final Class5815 field4781, final long field4782, final long field4783, final Class17 field4784) {
        this.field4781 = field4781;
        this.field4778 = field4782;
        this.field4779 = field4783;
        this.field4780 = field4784;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class5815.method17505(this.field4781), false);
        for (long field4778 = this.field4778; field4778 < this.field4779; ++field4778) {
            final long n = field4778 * Class5815.method17497(this.field4781);
            for (long n2 = 0L; n2 < Class5815.method17506(this.field4781); ++n2) {
                for (long n3 = 0L; n3 < Class5815.method17505(this.field4781); ++n3) {
                    class17.method171(n3, this.field4780.method137(n + n3 * Class5815.method17499(this.field4781) + n2));
                }
                Class5815.method17502(this.field4781).method21387(class17);
                for (long n4 = 0L; n4 < Class5815.method17505(this.field4781); ++n4) {
                    this.field4780.method171(n + n4 * Class5815.method17499(this.field4781) + n2, class17.method137(n4));
                }
            }
        }
    }
}
