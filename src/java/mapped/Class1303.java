// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1303 implements Runnable
{
    private static String[] field7133;
    public final /* synthetic */ long field7134;
    public final /* synthetic */ long field7135;
    public final /* synthetic */ Class17 field7136;
    public final /* synthetic */ boolean field7137;
    public final /* synthetic */ Class5815 field7138;
    
    public Class1303(final Class5815 field7138, final long field7139, final long field7140, final Class17 field7141, final boolean field7142) {
        this.field7138 = field7138;
        this.field7134 = field7139;
        this.field7135 = field7140;
        this.field7136 = field7141;
        this.field7137 = field7142;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class5815.method17505(this.field7138), false);
        for (long field7134 = this.field7134; field7134 < this.field7135; ++field7134) {
            final long n = field7134 * Class5815.method17508(this.field7138);
            for (long n2 = 0L; n2 < Class5815.method17506(this.field7138); ++n2) {
                for (long n3 = 0L; n3 < Class5815.method17505(this.field7138); ++n3) {
                    class17.method171(n3, this.field7136.method137(n + n3 * Class5815.method17509(this.field7138) + n2));
                }
                Class5815.method17502(this.field7138).method21391(class17, this.field7137);
                for (long n4 = 0L; n4 < Class5815.method17505(this.field7138); ++n4) {
                    this.field7136.method171(n + n4 * Class5815.method17509(this.field7138) + n2, class17.method137(n4));
                }
            }
        }
    }
}
