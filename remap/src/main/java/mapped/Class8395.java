// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

public class Class8395
{
    private static String[] field34413;
    private final String field34414;
    private long field34415;
    private Vec3d field34416;
    public final /* synthetic */ Class686 field34417;
    
    public Class8395(final Class686 field34417, final String field34418, final Vec3d field34419) {
        this.field34417 = field34417;
        this.field34414 = field34418;
        this.field34416 = field34419;
        this.field34415 = Util.method27837();
    }
    
    public String method27992() {
        return this.field34414;
    }
    
    public long method27993() {
        return this.field34415;
    }
    
    public Vec3d method27994() {
        return this.field34416;
    }
    
    public void method27995(final Vec3d field34416) {
        this.field34416 = field34416;
        this.field34415 = Util.method27837();
    }
}
