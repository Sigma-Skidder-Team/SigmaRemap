// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class972 implements Runnable
{
    private static String[] field5177;
    public final /* synthetic */ int field5178;
    public final /* synthetic */ int field5179;
    public final /* synthetic */ int field5180;
    public final /* synthetic */ float[][] field5181;
    public final /* synthetic */ boolean field5182;
    public final /* synthetic */ Class7706 field5183;
    
    public Class972(final Class7706 field5183, final int field5184, final int field5185, final int field5186, final float[][] field5187, final boolean field5188) {
        this.field5183 = field5183;
        this.field5178 = field5184;
        this.field5179 = field5185;
        this.field5180 = field5186;
        this.field5181 = field5187;
        this.field5182 = field5188;
    }
    
    @Override
    public void run() {
        if (this.field5178 != -1) {
            for (int i = this.field5179; i < Class7706.method24578(this.field5183); i += this.field5180) {
                Class7706.method24577(this.field5183).method29693(this.field5181[i], this.field5182);
            }
        }
        else {
            for (int j = this.field5179; j < Class7706.method24578(this.field5183); j += this.field5180) {
                Class7706.method24577(this.field5183).method29689(this.field5181[j], this.field5182);
            }
        }
    }
}
