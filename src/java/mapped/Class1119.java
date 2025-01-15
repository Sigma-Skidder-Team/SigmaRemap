// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1119 implements Runnable
{
    private static String[] field6028;
    public final /* synthetic */ int field6029;
    public final /* synthetic */ int field6030;
    public final /* synthetic */ float[][] field6031;
    public final /* synthetic */ boolean field6032;
    public final /* synthetic */ Class7706 field6033;
    
    public Class1119(final Class7706 field6033, final int field6034, final int field6035, final float[][] field6036, final boolean field6037) {
        this.field6033 = field6033;
        this.field6029 = field6034;
        this.field6030 = field6035;
        this.field6031 = field6036;
        this.field6032 = field6037;
    }
    
    @Override
    public void run() {
        for (int i = this.field6029; i < this.field6030; ++i) {
            Class7706.method24577(this.field6033).method29693(this.field6031[i], this.field6032);
        }
    }
}
