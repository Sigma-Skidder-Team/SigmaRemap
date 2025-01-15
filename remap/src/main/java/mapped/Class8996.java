// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix3f;
import net.minecraft.client.renderer.Matrix4f;

public final class Class8996
{
    private static String[] field37953;
    private final Matrix4f field37954;
    private final Matrix3f field37955;
    
    private Class8996(final Matrix4f field37954, final Matrix3f field37955) {
        this.field37954 = field37954;
        this.field37955 = field37955;
    }
    
    public Matrix4f method32111() {
        return this.field37954;
    }
    
    public Matrix3f method32112() {
        return this.field37955;
    }
    
    @Override
    public String toString() {
        return this.field37954.toString() + this.field37955.toString();
    }
}
