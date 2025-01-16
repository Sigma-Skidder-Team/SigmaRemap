// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class7074 extends Class7075
{
    private static String[] field27547;
    public BlockPos field27548;
    public boolean field27549;
    
    public Class7074(final Class7075 class7075) {
        this(class7075.method21654(), class7075.method21652(), class7075.method21653(), class7075.method21651(), class7075.field27553);
    }
    
    public Class7074(final World class1847, final PlayerEntity class1848, final Class316 class1849, final ItemStack class1850, final BlockRayTraceResult class1851) {
        super(class1847, class1848, class1849, class1850, class1851);
        this.field27549 = true;
        this.field27548 = class1851.getPos().method1149(class1851.getFace());
        this.field27549 = class1847.getBlockState(class1851.getPos()).method21750(this);
    }
    
    public static Class7074 method21647(final Class7074 class7074, final BlockPos class7075, final Direction class7076) {
        return new Class7074(class7074.method21654(), class7074.method21652(), class7074.method21653(), class7074.method21651(), new BlockRayTraceResult(new Vec3d(class7075.getX() + 0.5 + class7076.getXOffset() * 0.5, class7075.getY() + 0.5 + class7076.getYOffset() * 0.5, class7075.getZ() + 0.5 + class7076.getZOffset() * 0.5), class7076, class7075, false));
    }
    
    @Override
    public BlockPos method21639() {
        return this.field27549 ? super.method21639() : this.field27548;
    }
    
    public boolean method21640() {
        return this.field27549 || this.method21654().getBlockState(this.method21639()).method21750(this);
    }
    
    public boolean method21641() {
        return this.field27549;
    }
    
    public Direction method21642() {
        return Direction.getFacingDirections(this.field27551)[0];
    }
    
    public Direction[] method21643() {
        final Direction[] method775 = Direction.getFacingDirections(this.field27551);
        if (!this.field27549) {
            Direction method776;
            int n;
            for (method776 = this.method21648(), n = 0; n < method775.length && method775[n] != method776.getOpposite(); ++n) {}
            if (n > 0) {
                System.arraycopy(method775, 0, method775, 1, n);
                method775[0] = method776.getOpposite();
            }
            return method775;
        }
        return method775;
    }
}
