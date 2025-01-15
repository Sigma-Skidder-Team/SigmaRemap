// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1267 implements Runnable
{
    private static String[] field6911;
    public final /* synthetic */ long field6912;
    public final /* synthetic */ long field6913;
    public final /* synthetic */ Class22 field6914;
    public final /* synthetic */ long field6915;
    public final /* synthetic */ boolean field6916;
    public final /* synthetic */ Class8328 field6917;
    
    public Class1267(final Class8328 field6917, final long field6918, final long field6919, final Class22 field6920, final long field6921, final boolean field6922) {
        this.field6917 = field6917;
        this.field6912 = field6918;
        this.field6913 = field6919;
        this.field6914 = field6920;
        this.field6915 = field6921;
        this.field6916 = field6922;
    }
    
    @Override
    public void run() {
        for (long field6912 = this.field6912; field6912 < this.field6913; ++field6912) {
            Class8328.method27759(this.field6917).method25932(this.field6914, field6912 * this.field6915, this.field6916);
        }
    }
}
