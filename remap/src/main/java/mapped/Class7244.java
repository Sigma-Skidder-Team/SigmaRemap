// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import java.util.Iterator;

public class Class7244 implements Iterator<BlockPos>
{
    private Class7245 field28069;
    private Class384 field28070;
    private int field28071;
    private int field28072;
    private int field28073;
    private int field28074;
    private static final int field28075 = 0;
    private static final int field28076 = 1;
    private static final int field28077 = 2;
    
    public Class7244(BlockPos method22142, BlockPos method22143, final int n, final int n2) {
        this.field28070 = new Class384(0, 0, 0);
        this.field28071 = 0;
        final boolean b = method22142.getX() > method22143.getX();
        final boolean b2 = method22142.getY() > method22143.getY();
        final boolean b3 = method22142.getZ() > method22143.getZ();
        method22142 = this.method22142(method22142, b, b2, b3);
        method22143 = this.method22142(method22143, b, b2, b3);
        this.field28072 = (b ? -1 : 1);
        this.field28073 = (b2 ? -1 : 1);
        this.field28074 = (b3 ? -1 : 1);
        final Vec3d method22144 = new Vec3d(method22143.getX() - method22142.getX(), method22143.getY() - method22142.getY(), method22143.getZ() - method22142.getZ()).normalize();
        final double abs = Math.abs(method22144.dotProduct(new Vec3d(1.0, 0.0, 0.0)));
        final double abs2 = Math.abs(method22144.dotProduct(new Vec3d(0.0, 1.0, 0.0)));
        final double abs3 = Math.abs(method22144.dotProduct(new Vec3d(0.0, 0.0, 1.0)));
        if (abs3 >= abs2 && abs3 >= abs) {
            this.field28071 = 2;
            final BlockPos class354 = new BlockPos(method22142.getZ(), method22142.getY() - n, method22142.getX() - n2);
            final BlockPos class355 = new BlockPos(method22143.getZ(), method22142.getY() + n + 1, method22142.getX() + n2 + 1);
            final int n3 = method22143.getZ() - method22142.getZ();
            this.field28069 = new Class7245(class354, class355, (method22143.getY() - method22142.getY()) / (1.0 * n3), (method22143.getX() - method22142.getX()) / (1.0 * n3));
        }
        else if (abs2 >= abs && abs2 >= abs3) {
            this.field28071 = 1;
            final BlockPos class356 = new BlockPos(method22142.getY(), method22142.getX() - n, method22142.getZ() - n2);
            final BlockPos class357 = new BlockPos(method22143.getY(), method22142.getX() + n + 1, method22142.getZ() + n2 + 1);
            final int n4 = method22143.getY() - method22142.getY();
            this.field28069 = new Class7245(class356, class357, (method22143.getX() - method22142.getX()) / (1.0 * n4), (method22143.getZ() - method22142.getZ()) / (1.0 * n4));
        }
        else {
            this.field28071 = 0;
            final BlockPos class358 = new BlockPos(method22142.getX(), method22142.getY() - n, method22142.getZ() - n2);
            final BlockPos class359 = new BlockPos(method22143.getX(), method22142.getY() + n + 1, method22142.getZ() + n2 + 1);
            final int n5 = method22143.getX() - method22142.getX();
            this.field28069 = new Class7245(class358, class359, (method22143.getY() - method22142.getY()) / (1.0 * n5), (method22143.getZ() - method22142.getZ()) / (1.0 * n5));
        }
    }
    
    private BlockPos method22142(BlockPos class354, final boolean b, final boolean b2, final boolean b3) {
        if (b) {
            class354 = new BlockPos(-class354.getX(), class354.getY(), class354.getZ());
        }
        if (b2) {
            class354 = new BlockPos(class354.getX(), -class354.getY(), class354.getZ());
        }
        if (b3) {
            class354 = new BlockPos(class354.getX(), class354.getY(), -class354.getZ());
        }
        return class354;
    }
    
    @Override
    public boolean hasNext() {
        return this.field28069.hasNext();
    }
    
    @Override
    public BlockPos next() {
        final BlockPos next = this.field28069.next();
        switch (this.field28071) {
            case 0: {
                this.field28070.method1279(next.getX() * this.field28072, next.getY() * this.field28073, next.getZ() * this.field28074);
                return this.field28070;
            }
            case 1: {
                this.field28070.method1279(next.getY() * this.field28072, next.getX() * this.field28073, next.getZ() * this.field28074);
                return this.field28070;
            }
            case 2: {
                this.field28070.method1279(next.getZ() * this.field28072, next.getY() * this.field28073, next.getX() * this.field28074);
                return this.field28070;
            }
            default: {
                this.field28070.method1279(next.getX() * this.field28072, next.getY() * this.field28073, next.getZ() * this.field28074);
                return this.field28070;
            }
        }
    }
    
    @Override
    public void remove() {
        throw new RuntimeException("Not supported");
    }
    
    public static void main(final String[] array) {
        final Class7244 class7244 = new Class7244(new BlockPos(10, 20, 30), new BlockPos(30, 40, 20), 1, 1);
        while (class7244.hasNext()) {
            System.out.println("" + class7244.next());
        }
    }
}
