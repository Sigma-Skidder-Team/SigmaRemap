// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1654 implements Runnable
{
    private static String[] field9263;
    public final /* synthetic */ long field9264;
    public final /* synthetic */ long field9265;
    public final /* synthetic */ Class17 field9266;
    public final /* synthetic */ double field9267;
    
    public Class1654(final long field9264, final long field9265, final Class17 field9266, final double field9267) {
        this.field9264 = field9264;
        this.field9265 = field9265;
        this.field9266 = field9266;
        this.field9267 = field9267;
    }
    
    @Override
    public void run() {
        for (long field9264 = this.field9264; field9264 < this.field9265; ++field9264) {
            this.field9266.method171(field9264, this.field9266.method137(field9264) * this.field9267);
        }
    }
}
