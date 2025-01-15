// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

public class Class384 extends BlockPos
{
    private static String[] field2171;
    private int field2232;
    private int field2233;
    private int field2234;
    private int field2235;
    private Class384[] field2236;
    private boolean field2237;
    
    public Class384() {
        this(0, 0, 0, 0);
    }
    
    public Class384(final int n, final int n2, final int n3) {
        this(n, n2, n3, 0);
    }
    
    public Class384(final double n, final double n2, final double n3) {
        this(MathHelper.floor(n), MathHelper.floor(n2), MathHelper.floor(n3));
    }
    
    public Class384(final int field2232, final int field2233, final int field2234, final int field2235) {
        super(0, 0, 0);
        this.field2232 = field2232;
        this.field2233 = field2233;
        this.field2234 = field2234;
        this.field2235 = field2235;
    }
    
    @Override
    public int getX() {
        return this.field2232;
    }
    
    @Override
    public int getY() {
        return this.field2233;
    }
    
    @Override
    public int getZ() {
        return this.field2234;
    }
    
    public void method1279(final int field2232, final int field2233, final int field2234) {
        this.field2232 = field2232;
        this.field2233 = field2233;
        this.field2234 = field2234;
        this.field2237 = true;
    }
    
    public void method1280(final double n, final double n2, final double n3) {
        this.method1279(MathHelper.floor(n), MathHelper.floor(n2), MathHelper.floor(n3));
    }
    
    @Override
    public BlockPos method1149(final Direction class179) {
        if (this.field2235 > 0) {
            if (this.field2236 == null) {
                this.field2236 = new Class384[Direction.VALUES.length];
            }
            if (this.field2237) {
                this.method1283();
            }
            final int method779 = class179.getIndex();
            Class384 class180 = this.field2236[method779];
            if (class180 == null) {
                class180 = new Class384(this.field2232 + class179.getXOffset(), this.field2233 + class179.getYOffset(), this.field2234 + class179.getZOffset(), this.field2235 - 1);
                this.field2236[method779] = class180;
            }
            return class180;
        }
        return super.method1150(class179, 1).method1153();
    }
    
    @Override
    public BlockPos method1150(final Direction class179, final int n) {
        return (n != 1) ? super.method1150(class179, n).method1153() : this.method1149(class179);
    }
    
    public void method1281(final BlockPos class354, final Direction class355) {
        this.field2232 = class354.getX() + class355.getXOffset();
        this.field2233 = class354.getY() + class355.getYOffset();
        this.field2234 = class354.getZ() + class355.getZOffset();
    }
    
    public void method1282(final BlockPos class354, final Direction class355, final Direction class356) {
        this.field2232 = class354.getX() + class355.getXOffset() + class356.getXOffset();
        this.field2233 = class354.getY() + class355.getYOffset() + class356.getYOffset();
        this.field2234 = class354.getZ() + class355.getZOffset() + class356.getZOffset();
    }
    
    private void method1283() {
        for (int i = 0; i < 6; ++i) {
            final Class384 class384 = this.field2236[i];
            if (class384 != null) {
                final Direction class385 = Direction.VALUES[i];
                class384.method1279(this.field2232 + class385.getXOffset(), this.field2233 + class385.getYOffset(), this.field2234 + class385.getZOffset());
            }
        }
        this.field2237 = false;
    }
    
    @Override
    public BlockPos method1153() {
        return new BlockPos(this.field2232, this.field2233, this.field2234);
    }
    
    public static Iterable<BlockPos> method1154(final BlockPos class354, final BlockPos class355) {
        return new Class97(new BlockPos(Math.min(class354.getX(), class355.getX()), Math.min(class354.getY(), class355.getY()), Math.min(class354.getZ(), class355.getZ())), new BlockPos(Math.max(class354.getX(), class355.getX()), Math.max(class354.getY(), class355.getY()), Math.max(class354.getZ(), class355.getZ())));
    }
}
