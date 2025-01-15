// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1116 implements Runnable
{
    private static String[] field6010;
    public final /* synthetic */ int field6011;
    public final /* synthetic */ int field6012;
    public final /* synthetic */ float[][] field6013;
    public final /* synthetic */ Class8328 field6014;
    
    public Class1116(final Class8328 field6014, final int field6015, final int field6016, final float[][] field6017) {
        this.field6014 = field6014;
        this.field6011 = field6015;
        this.field6012 = field6016;
        this.field6013 = field6017;
    }
    
    @Override
    public void run() {
        for (int i = this.field6011; i < this.field6012; ++i) {
            Class8328.method27759(this.field6014).method25925(this.field6013[i]);
        }
    }
}
