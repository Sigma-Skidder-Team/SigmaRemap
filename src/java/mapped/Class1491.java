// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1491 implements Runnable
{
    private static String[] field8287;
    public final /* synthetic */ int field8288;
    public final /* synthetic */ int field8289;
    public final /* synthetic */ int field8290;
    public final /* synthetic */ Class17 field8291;
    public final /* synthetic */ boolean field8292;
    public final /* synthetic */ Class9033 field8293;
    
    public Class1491(final Class9033 field8293, final int field8294, final int field8295, final int field8296, final Class17 field8297, final boolean field8298) {
        this.field8293 = field8293;
        this.field8288 = field8294;
        this.field8289 = field8295;
        this.field8290 = field8296;
        this.field8291 = field8297;
        this.field8292 = field8298;
    }
    
    @Override
    public void run() {
        if (this.field8288 != -1) {
            for (long n = this.field8289; n < Class9033.method32456(this.field8293); n += this.field8290) {
                Class9033.method32452(this.field8293).method18043(this.field8291, n * Class9033.method32455(this.field8293), this.field8292);
            }
        }
        else {
            for (long n2 = this.field8289; n2 < Class9033.method32456(this.field8293); n2 += this.field8290) {
                Class9033.method32452(this.field8293).method18039(this.field8291, n2 * Class9033.method32455(this.field8293), this.field8292);
            }
        }
    }
}
