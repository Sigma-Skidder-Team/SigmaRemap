// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1244 implements Runnable
{
    private static String[] field6766;
    public final /* synthetic */ long field6767;
    public final /* synthetic */ long field6768;
    public final /* synthetic */ Class22 field6769;
    public final /* synthetic */ float field6770;
    
    public Class1244(final long field6767, final long field6768, final Class22 field6769, final float field6770) {
        this.field6767 = field6767;
        this.field6768 = field6768;
        this.field6769 = field6769;
        this.field6770 = field6770;
    }
    
    @Override
    public void run() {
        for (long field6767 = this.field6767; field6767 < this.field6768; ++field6767) {
            this.field6769.method171(field6767, this.field6769.method137(field6767) * this.field6770);
        }
    }
}
