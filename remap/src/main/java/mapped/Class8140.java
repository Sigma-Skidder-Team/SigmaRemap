// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class Class8140
{
    private static String[] field33536;
    private final Vec3d field33537;
    private final Entity field33538;
    private final Class2042 field33539;
    
    public Class8140(final Entity field33538, final Class2042 field33539) {
        this.field33538 = field33538;
        this.field33539 = field33539;
        this.field33537 = field33539.method8122(field33538);
    }
    
    public Class8140(final Vec3d field33537) {
        this.field33538 = null;
        this.field33537 = field33537;
        this.field33539 = null;
    }
    
    public void method26828(final Class7492 class7492, final Entity class7493) {
        if (this.field33538 == null) {
            class7493.method1927(class7492.method23256(), this.field33537);
        }
        else if (!(class7493 instanceof Class513)) {
            class7493.method1927(class7492.method23256(), this.field33537);
        }
        else {
            ((Class513)class7493).method2938(class7492.method23256(), this.field33538, this.field33539);
        }
    }
}