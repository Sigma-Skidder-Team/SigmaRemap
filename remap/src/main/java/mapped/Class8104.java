// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import java.util.Objects;

public class Class8104
{
    private final Vec3d field33367;
    private final float field33368;
    private final float field33369;
    
    public Class8104(final Vec3d field33367, final float field33368, final float field33369) {
        this.field33367 = field33367;
        this.field33368 = field33368;
        this.field33369 = field33369;
    }
    
    public Vec3d method26627() {
        return this.field33367;
    }
    
    public float method26628() {
        return this.field33368;
    }
    
    public float method26629() {
        return this.field33369;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class8104 class8104 = (Class8104)o;
            if (Float.compare(class8104.field33368, this.field33368) == 0) {
                if (Float.compare(class8104.field33369, this.field33369) == 0) {
                    return Objects.equals(this.field33367, class8104.field33367);
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.field33367, this.field33368, this.field33369);
    }
    
    @Override
    public String toString() {
        return "PosAndRot[" + this.field33367 + " (" + this.field33368 + ", " + this.field33369 + ")]";
    }
}
