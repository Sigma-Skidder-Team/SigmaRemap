// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1651 implements Runnable
{
    private static String[] field9241;
    public final /* synthetic */ int field9242;
    public final /* synthetic */ int field9243;
    public final /* synthetic */ float[] field9244;
    public final /* synthetic */ boolean field9245;
    public final /* synthetic */ Class7706 field9246;
    
    public Class1651(final Class7706 field9246, final int field9247, final int field9248, final float[] field9249, final boolean field9250) {
        this.field9246 = field9246;
        this.field9242 = field9247;
        this.field9243 = field9248;
        this.field9244 = field9249;
        this.field9245 = field9250;
    }
    
    @Override
    public void run() {
        for (int i = this.field9242; i < this.field9243; ++i) {
            Class7706.method24577(this.field9246).method29691(this.field9244, i * Class7706.method24576(this.field9246), this.field9245);
        }
    }
}
