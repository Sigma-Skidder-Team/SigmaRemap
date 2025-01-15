// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1353 implements Runnable
{
    private static String[] field7414;
    public final /* synthetic */ int field7415;
    public final /* synthetic */ int field7416;
    public final /* synthetic */ float[][] field7417;
    public final /* synthetic */ boolean field7418;
    public final /* synthetic */ Class7706 field7419;
    
    public Class1353(final Class7706 field7419, final int field7420, final int field7421, final float[][] field7422, final boolean field7423) {
        this.field7419 = field7419;
        this.field7415 = field7420;
        this.field7416 = field7421;
        this.field7417 = field7422;
        this.field7418 = field7423;
    }
    
    @Override
    public void run() {
        for (int i = this.field7415; i < this.field7416; ++i) {
            Class7706.method24577(this.field7419).method29689(this.field7417[i], this.field7418);
        }
    }
}
