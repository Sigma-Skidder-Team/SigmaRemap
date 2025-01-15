// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3i;

public class Class1271 implements Runnable
{
    public final /* synthetic */ Class4935 field6938;
    public final /* synthetic */ int field6939;
    public final /* synthetic */ int field6940;
    public final /* synthetic */ Vec3i field6941;
    public final /* synthetic */ Class4935 field6942;
    
    public Class1271(final Class4935 field6942, final Class4935 field6943, final int field6944, final int field6945, final Vec3i field6946) {
        this.field6942 = field6942;
        this.field6938 = field6943;
        this.field6939 = field6944;
        this.field6940 = field6945;
        this.field6941 = field6946;
    }
    
    @Override
    public void run() {
        if (this.field6942.field21164 == null) {
            this.field6938.method14239(this.field6942.field21164 = new Class4862(this.field6938, "popover", this.field6939, this.field6940, this.field6941));
            Class4935.method14843(this.field6942, this.field6942.field21164);
        }
    }
}
