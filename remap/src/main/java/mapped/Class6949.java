// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class Class6949
{
    private static String[] field27206;
    private final Class6438 field27207;
    private final float field27208;
    private final int field27209;
    
    public Class6949(final BlockPos class354, final float n, final int n2) {
        this(new Class6439(class354), n, n2);
    }
    
    public Class6949(final Vec3d class5487, final float n, final int n2) {
        this(new Class6439(new BlockPos(class5487)), n, n2);
    }
    
    public Class6949(final Class6438 field27207, final float field27208, final int field27209) {
        this.field27207 = field27207;
        this.field27208 = field27208;
        this.field27209 = field27209;
    }
    
    public Class6438 method21335() {
        return this.field27207;
    }
    
    public float method21336() {
        return this.field27208;
    }
    
    public int method21337() {
        return this.field27209;
    }
}
