// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1330 implements Runnable
{
    private static String[] field7301;
    public final /* synthetic */ long field7302;
    public final /* synthetic */ long field7303;
    public final /* synthetic */ Class17 field7304;
    public final /* synthetic */ Class5815 field7305;
    
    public Class1330(final Class5815 field7305, final long field7306, final long field7307, final Class17 field7308) {
        this.field7305 = field7305;
        this.field7302 = field7306;
        this.field7303 = field7307;
        this.field7304 = field7308;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class5815.method17507(this.field7305), false);
        for (long field7302 = this.field7302; field7302 < this.field7303; ++field7302) {
            final long n = field7302 * Class5815.method17499(this.field7305);
            for (long n2 = 0L; n2 < Class5815.method17506(this.field7305); ++n2) {
                for (long n3 = 0L; n3 < Class5815.method17507(this.field7305); ++n3) {
                    class17.method171(n3, this.field7304.method137(n3 * Class5815.method17497(this.field7305) + n + n2));
                }
                Class5815.method17504(this.field7305).method21387(class17);
                for (long n4 = 0L; n4 < Class5815.method17507(this.field7305); ++n4) {
                    this.field7304.method171(n4 * Class5815.method17497(this.field7305) + n + n2, class17.method137(n4));
                }
            }
        }
    }
}
