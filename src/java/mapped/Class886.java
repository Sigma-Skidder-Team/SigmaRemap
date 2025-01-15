// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class886 implements Runnable
{
    private static String[] field4782;
    public final /* synthetic */ int field4783;
    public final /* synthetic */ int field4784;
    public final /* synthetic */ float[] field4785;
    public final /* synthetic */ boolean field4786;
    public final /* synthetic */ Class6710 field4787;
    
    public Class886(final Class6710 field4787, final int field4788, final int field4789, final float[] field4790, final boolean field4791) {
        this.field4787 = field4787;
        this.field4783 = field4788;
        this.field4784 = field4789;
        this.field4785 = field4790;
        this.field4786 = field4791;
    }
    
    @Override
    public void run() {
        for (int i = this.field4783; i < this.field4784; ++i) {
            Class6710.method20381(this.field4787).method34183(this.field4785, i * Class6710.method20380(this.field4787), this.field4786);
        }
    }
}
