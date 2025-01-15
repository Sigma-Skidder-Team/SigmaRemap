// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1124 implements Runnable
{
    private static String[] field6060;
    public final /* synthetic */ int field6061;
    public final /* synthetic */ int field6062;
    public final /* synthetic */ int field6063;
    public final /* synthetic */ float[][] field6064;
    public final /* synthetic */ boolean field6065;
    public final /* synthetic */ Class6874 field6066;
    
    public Class1124(final Class6874 field6066, final int field6067, final int field6068, final int field6069, final float[][] field6070, final boolean field6071) {
        this.field6066 = field6066;
        this.field6061 = field6067;
        this.field6062 = field6068;
        this.field6063 = field6069;
        this.field6064 = field6070;
        this.field6065 = field6071;
    }
    
    @Override
    public void run() {
        if (this.field6061 != -1) {
            for (int i = this.field6062; i < Class6874.method21035(this.field6066); i += this.field6063) {
                Class6874.method21034(this.field6066).method30449(this.field6064[i], this.field6065);
            }
        }
        else {
            for (int j = this.field6062; j < Class6874.method21035(this.field6066); j += this.field6063) {
                Class6874.method21034(this.field6066).method30445(this.field6064[j]);
            }
        }
    }
}
