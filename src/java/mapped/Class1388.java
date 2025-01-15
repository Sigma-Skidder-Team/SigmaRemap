// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1388 implements Runnable
{
    private static String[] field7642;
    public final /* synthetic */ int field7643;
    public final /* synthetic */ int field7644;
    public final /* synthetic */ int field7645;
    public final /* synthetic */ float[] field7646;
    public final /* synthetic */ boolean field7647;
    public final /* synthetic */ Class7706 field7648;
    
    public Class1388(final Class7706 field7648, final int field7649, final int field7650, final int field7651, final float[] field7652, final boolean field7653) {
        this.field7648 = field7648;
        this.field7643 = field7649;
        this.field7644 = field7650;
        this.field7645 = field7651;
        this.field7646 = field7652;
        this.field7647 = field7653;
    }
    
    @Override
    public void run() {
        if (this.field7643 != -1) {
            for (int i = this.field7644; i < Class7706.method24578(this.field7648); i += this.field7645) {
                Class7706.method24577(this.field7648).method29695(this.field7646, i * Class7706.method24576(this.field7648), this.field7647);
            }
        }
        else {
            for (int j = this.field7644; j < Class7706.method24578(this.field7648); j += this.field7645) {
                Class7706.method24577(this.field7648).method29691(this.field7646, j * Class7706.method24576(this.field7648), this.field7647);
            }
        }
    }
}
