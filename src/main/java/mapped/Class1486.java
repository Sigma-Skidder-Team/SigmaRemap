// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1486 implements Runnable
{
    private static String[] field8260;
    public final /* synthetic */ int field8261;
    public final /* synthetic */ long field8262;
    public final /* synthetic */ int field8263;
    public final /* synthetic */ Class17 field8264;
    public final /* synthetic */ boolean field8265;
    public final /* synthetic */ Class4406 field8266;
    
    public Class1486(final Class4406 field8266, final int field8267, final long field8268, final int field8269, final Class17 field8270, final boolean field8271) {
        this.field8266 = field8266;
        this.field8261 = field8267;
        this.field8262 = field8268;
        this.field8263 = field8269;
        this.field8264 = field8270;
        this.field8265 = field8271;
    }
    
    @Override
    public void run() {
        if (this.field8261 != -1) {
            for (long field8262 = this.field8262; field8262 < Class4406.method13334(this.field8266); field8262 += this.field8263) {
                Class4406.method13333(this.field8266).method30728(this.field8264, field8262 * Class4406.method13336(this.field8266), this.field8265);
            }
        }
        else {
            for (long field8263 = this.field8262; field8263 < Class4406.method13337(this.field8266); field8263 += this.field8263) {
                Class4406.method13333(this.field8266).method30724(this.field8264, field8263 * Class4406.method13336(this.field8266), this.field8265);
            }
        }
    }
}
