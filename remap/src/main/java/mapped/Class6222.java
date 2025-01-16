// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.AxisAlignedBB;

public class Class6222 extends AxisAlignedBB
{
    private static String[] field25079;
    private int field25080;
    private boolean field25081;
    
    public Class6222(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(n, n2, n3, n4, n5, n6);
        this.field25080 = -1;
        this.field25081 = false;
    }
    
    public boolean method18518(final Class8902 class8902, final int field25080) {
        if (this.field25080 != field25080) {
            this.field25081 = class8902.method31351(this.minX, this.minY, this.minZ, this.maxX, this.maxY, this.maxZ);
            this.field25080 = field25080;
        }
        return this.field25081;
    }
}
