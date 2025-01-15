// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1442 implements Runnable
{
    private static String[] field7983;
    public final /* synthetic */ long field7984;
    public final /* synthetic */ long field7985;
    public final /* synthetic */ Class17 field7986;
    public final /* synthetic */ Class8983 field7987;
    
    public Class1442(final Class8983 field7987, final long field7988, final long field7989, final Class17 field7990) {
        this.field7987 = field7987;
        this.field7984 = field7988;
        this.field7985 = field7989;
        this.field7986 = field7990;
    }
    
    @Override
    public void run() {
        for (long field7984 = this.field7984; field7984 < this.field7985; ++field7984) {
            Class8983.method31975(this.field7987).method26083(this.field7986, field7984 * Class8983.method31980(this.field7987));
        }
    }
}
