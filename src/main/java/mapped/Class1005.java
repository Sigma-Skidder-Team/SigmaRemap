// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1005 implements Runnable
{
    private static String[] field5360;
    public final /* synthetic */ long field5361;
    public final /* synthetic */ long field5362;
    public final /* synthetic */ Class17 field5363;
    public final /* synthetic */ long field5364;
    public final /* synthetic */ Class17 field5365;
    public final /* synthetic */ long field5366;
    
    public Class1005(final long field5361, final long field5362, final Class17 field5363, final long field5364, final Class17 field5365, final long field5366) {
        this.field5361 = field5361;
        this.field5362 = field5362;
        this.field5363 = field5363;
        this.field5364 = field5364;
        this.field5365 = field5365;
        this.field5366 = field5366;
    }
    
    @Override
    public void run() {
        for (long field5361 = this.field5361; field5361 < this.field5362; ++field5361) {
            this.field5363.method171(this.field5364 + field5361, this.field5365.method137(this.field5366 + field5361));
        }
    }
}
