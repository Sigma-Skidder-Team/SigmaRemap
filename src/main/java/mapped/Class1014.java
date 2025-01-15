// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1014 implements Runnable
{
    private static String[] field5421;
    public final /* synthetic */ int field5422;
    public final /* synthetic */ int field5423;
    public final /* synthetic */ double[] field5424;
    public final /* synthetic */ int field5425;
    public final /* synthetic */ Class8983 field5426;
    
    public Class1014(final Class8983 field5426, final int field5427, final int field5428, final double[] field5429, final int field5430) {
        this.field5426 = field5426;
        this.field5422 = field5427;
        this.field5423 = field5428;
        this.field5424 = field5429;
        this.field5425 = field5430;
    }
    
    @Override
    public void run() {
        for (int i = this.field5422; i < this.field5423; ++i) {
            Class8983.method31975(this.field5426).method26074(this.field5424, i * this.field5425);
        }
    }
}
