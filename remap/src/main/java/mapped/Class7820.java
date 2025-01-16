// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.MoreObjects;
import com.google.common.cache.LoadingCache;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.Vec3d;

public class Class7820
{
    private final BlockPos field32030;
    private final Direction field32031;
    private final Direction field32032;
    private final LoadingCache<BlockPos, Class7990> field32033;
    private final int field32034;
    private final int field32035;
    private final int field32036;
    
    public Class7820(final BlockPos field32030, final Direction field32031, final Direction field32032, final LoadingCache<BlockPos, Class7990> field32033, final int field32034, final int field32035, final int field32036) {
        this.field32030 = field32030;
        this.field32031 = field32031;
        this.field32032 = field32032;
        this.field32033 = field32033;
        this.field32034 = field32034;
        this.field32035 = field32035;
        this.field32036 = field32036;
    }
    
    public BlockPos method25265() {
        return this.field32030;
    }
    
    public Direction method25266() {
        return this.field32031;
    }
    
    public Direction method25267() {
        return this.field32032;
    }
    
    public int method25268() {
        return this.field32034;
    }
    
    public int method25269() {
        return this.field32035;
    }
    
    public Class7990 method25270(final int n, final int n2, final int n3) {
        return (Class7990)this.field32033.getUnchecked((Object)Class8691.method29798(this.field32030, this.method25266(), this.method25267(), n, n2, n3));
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("up", (Object)this.field32032).add("forwards", (Object)this.field32031).add("frontTopLeft", (Object)this.field32030).toString();
    }
    
    public Class9402 method25271(final Direction class179, final BlockPos class180, final double n, final Vec3d class181, final double n2) {
        final Direction method25266 = this.method25266();
        final Direction method25267 = method25266.rotateY();
        final double n3 = this.method25265().getY() + 1 - n * this.method25269();
        double n4;
        double n5;
        if (method25267 != Direction.NORTH) {
            if (method25267 != Direction.SOUTH) {
                if (method25267 != Direction.WEST) {
                    n4 = this.method25265().getX() + (1.0 - n2) * this.method25268();
                    n5 = class180.getZ() + 0.5;
                }
                else {
                    n4 = this.method25265().getX() + 1 - (1.0 - n2) * this.method25268();
                    n5 = class180.getZ() + 0.5;
                }
            }
            else {
                n4 = class180.getX() + 0.5;
                n5 = this.method25265().getZ() + (1.0 - n2) * this.method25268();
            }
        }
        else {
            n4 = class180.getX() + 0.5;
            n5 = this.method25265().getZ() + 1 - (1.0 - n2) * this.method25268();
        }
        double n6;
        double n7;
        if (method25266.getOpposite() != class179) {
            if (method25266.getOpposite() != class179.getOpposite()) {
                if (method25266.getOpposite() != class179.rotateY()) {
                    n6 = class181.z;
                    n7 = -class181.x;
                }
                else {
                    n6 = -class181.z;
                    n7 = class181.x;
                }
            }
            else {
                n6 = -class181.x;
                n7 = -class181.z;
            }
        }
        else {
            n6 = class181.x;
            n7 = class181.z;
        }
        return new Class9402(new Vec3d(n4, n3, n5), new Vec3d(n6, class181.y, n7), (method25266.getHorizontalIndex() - class179.getOpposite().getHorizontalIndex()) * 90);
    }
}
