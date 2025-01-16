// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public class Class355 extends BlockPos
{
    private static String[] field2182;
    private final int field2183;
    
    public Class355(final BlockPos class354, final int field2183) {
        super(class354.getX(), class354.getY(), class354.getZ());
        this.field2183 = field2183;
    }
    
    public int method1163() {
        return this.field2183;
    }
}
