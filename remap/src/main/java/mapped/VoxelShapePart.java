// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public abstract class VoxelShapePart
{
    private static final Direction.Axis[] AXIS_VALUES;
    public final int xSize;
    public final int ySize;
    public final int zSize;
    
    public VoxelShapePart(final int xSize, final int ySize, final int zSize) {
        this.xSize = xSize;
        this.ySize = ySize;
        this.zSize = zSize;
    }
    
    public boolean containsWithRotation(final AxisRotation axisRotation, final int n, final int n2, final int n3) {
        return this.contains(axisRotation.getCoordinate(n, n2, n3, Direction.Axis.X), axisRotation.getCoordinate(n, n2, n3, Direction.Axis.Y), axisRotation.getCoordinate(n, n2, n3, Direction.Axis.Z));
    }
    
    public boolean contains(final int n, final int n2, final int n3) {
        if (n >= 0) {
            if (n2 >= 0) {
                if (n3 >= 0) {
                    if (n < this.xSize) {
                        if (n2 < this.ySize) {
                            if (n3 < this.zSize) {
                                return this.isFilled(n, n2, n3);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }
    
    public boolean isFilledWithRotation(final AxisRotation axisRotation, final int n, final int n2, final int n3) {
        return this.isFilled(axisRotation.getCoordinate(n, n2, n3, Direction.Axis.X), axisRotation.getCoordinate(n, n2, n3, Direction.Axis.Y), axisRotation.getCoordinate(n, n2, n3, Direction.Axis.Z));
    }
    
    public abstract boolean isFilled(final int p0, final int p1, final int p2);
    
    public abstract void setFilled(final int p0, final int p1, final int p2, final boolean p3, final boolean p4);
    
    public boolean isEmpty() {
        for (final Direction.Axis class111 : VoxelShapePart.AXIS_VALUES) {
            if (this.getStart(class111) >= this.getEnd(class111)) {
                return true;
            }
        }
        return false;
    }
    
    public abstract int getStart(final Direction.Axis p0);
    
    public abstract int getEnd(final Direction.Axis p0);
    
    public int firstFilled(final Direction.Axis class111, final int n, final int n2) {
        final int method27430 = this.getSize(class111);
        if (n < 0 || n2 < 0) {
            return method27430;
        }
        final Direction.Axis method27431 = AxisRotation.FORWARD.rotate(class111);
        final Direction.Axis method27432 = AxisRotation.BACKWARD.rotate(class111);
        if (n < this.getSize(method27431) && n2 < this.getSize(method27432)) {
            final AxisRotation method27433 = AxisRotation.from(Direction.Axis.X, class111);
            for (int i = 0; i < method27430; ++i) {
                if (this.isFilledWithRotation(method27433, i, n, n2)) {
                    return i;
                }
            }
            return method27430;
        }
        return method27430;
    }
    
    public int lastFilled(final Direction.Axis class111, final int n, final int n2) {
        if (n < 0 || n2 < 0) {
            return 0;
        }
        final Direction.Axis method983 = AxisRotation.FORWARD.rotate(class111);
        final Direction.Axis method984 = AxisRotation.BACKWARD.rotate(class111);
        if (n < this.getSize(method983) && n2 < this.getSize(method984)) {
            final int method985 = this.getSize(class111);
            final AxisRotation method986 = AxisRotation.from(Direction.Axis.X, class111);
            for (int i = method985 - 1; i >= 0; --i) {
                if (this.isFilledWithRotation(method986, i, n, n2)) {
                    return i + 1;
                }
            }
            return 0;
        }
        return 0;
    }
    
    public int getSize(final Direction.Axis class111) {
        return class111.getCoordinate(this.xSize, this.ySize, this.zSize);
    }
    
    public int getXSize() {
        return this.getSize(Direction.Axis.X);
    }
    
    public int getYSize() {
        return this.getSize(Direction.Axis.Y);
    }
    
    public int getZSize() {
        return this.getSize(Direction.Axis.Z);
    }
    
    public void forEachEdge(final Class8670 class8670, final boolean b) {
        this.forEachEdgeOnAxis(class8670, AxisRotation.NONE, b);
        this.forEachEdgeOnAxis(class8670, AxisRotation.FORWARD, b);
        this.forEachEdgeOnAxis(class8670, AxisRotation.BACKWARD, b);
    }
    
    private void forEachEdgeOnAxis(final Class8670 class8670, final AxisRotation class8671, final boolean b) {
        final AxisRotation method984 = class8671.reverse();
        final int method985 = this.getSize(method984.rotate(Direction.Axis.X));
        final int method986 = this.getSize(method984.rotate(Direction.Axis.Y));
        final int method987 = this.getSize(method984.rotate(Direction.Axis.Z));
        for (int i = 0; i <= method985; ++i) {
            for (int j = 0; j <= method986; ++j) {
                int n = -1;
                for (int k = 0; k <= method987; ++k) {
                    int n2 = 0;
                    int n3 = 0;
                    for (int l = 0; l <= 1; ++l) {
                        for (int n4 = 0; n4 <= 1; ++n4) {
                            if (this.containsWithRotation(method984, i + l - 1, j + n4 - 1, k)) {
                                ++n2;
                                n3 ^= (l ^ n4);
                            }
                        }
                    }
                    if (n2 != 1) {
                        if (n2 != 3) {
                            if (n2 != 2 || (n3 & 0x1) != 0x0) {
                                if (n == -1) {
                                    continue;
                                }
                                class8670.consume(method984.getCoordinate(i, j, n, Direction.Axis.X), method984.getCoordinate(i, j, n, Direction.Axis.Y), method984.getCoordinate(i, j, n, Direction.Axis.Z), method984.getCoordinate(i, j, k, Direction.Axis.X), method984.getCoordinate(i, j, k, Direction.Axis.Y), method984.getCoordinate(i, j, k, Direction.Axis.Z));
                                n = -1;
                                continue;
                            }
                        }
                    }
                    if (!b) {
                        class8670.consume(method984.getCoordinate(i, j, k, Direction.Axis.X), method984.getCoordinate(i, j, k, Direction.Axis.Y), method984.getCoordinate(i, j, k, Direction.Axis.Z), method984.getCoordinate(i, j, k + 1, Direction.Axis.X), method984.getCoordinate(i, j, k + 1, Direction.Axis.Y), method984.getCoordinate(i, j, k + 1, Direction.Axis.Z));
                    }
                    else if (n == -1) {
                        n = k;
                    }
                }
            }
        }
    }
    
    public boolean isZAxisLineFull(final int n, final int n2, final int n3, final int n4) {
        for (int i = n; i < n2; ++i) {
            if (!this.contains(n3, n4, i)) {
                return false;
            }
        }
        return true;
    }
    
    public void setZAxisLine(final int n, final int n2, final int n3, final int n4, final boolean b) {
        for (int i = n; i < n2; ++i) {
            this.setFilled(n3, n4, i, false, b);
        }
    }
    
    public boolean isXZRectangleFull(final int n, final int n2, final int n3, final int n4, final int n5) {
        for (int i = n; i < n2; ++i) {
            if (!this.isZAxisLineFull(n3, n4, i, n5)) {
                return false;
            }
        }
        return true;
    }
    
    public void forEachBox(final Class8670 class8670, final boolean b) {
        final BitSetVoxelShapePart class8671 = new BitSetVoxelShapePart(this);
        for (int i = 0; i <= this.xSize; ++i) {
            for (int j = 0; j <= this.ySize; ++j) {
                int n = -1;
                for (int k = 0; k <= this.zSize; ++k) {
                    if (!class8671.contains(i, j, k)) {
                        if (n != -1) {
                            int n2 = i;
                            int n3 = i;
                            int n4 = j;
                            int n5 = j;
                            class8671.setZAxisLine(n, k, i, j, false);
                            while (class8671.isZAxisLineFull(n, k, n2 - 1, n4)) {
                                class8671.setZAxisLine(n, k, n2 - 1, n4, false);
                                --n2;
                            }
                            while (class8671.isZAxisLineFull(n, k, n3 + 1, n4)) {
                                class8671.setZAxisLine(n, k, n3 + 1, n4, false);
                                ++n3;
                            }
                            while (class8671.isXZRectangleFull(n2, n3 + 1, n, k, n4 - 1)) {
                                for (int l = n2; l <= n3; ++l) {
                                    class8671.setZAxisLine(n, k, l, n4 - 1, false);
                                }
                                --n4;
                            }
                            while (class8671.isXZRectangleFull(n2, n3 + 1, n, k, n5 + 1)) {
                                for (int n6 = n2; n6 <= n3; ++n6) {
                                    class8671.setZAxisLine(n, k, n6, n5 + 1, false);
                                }
                                ++n5;
                            }
                            class8670.consume(n2, n4, n, n3 + 1, n5 + 1, k);
                            n = -1;
                        }
                    }
                    else if (!b) {
                        class8670.consume(i, j, k, i + 1, j + 1, k + 1);
                    }
                    else if (n == -1) {
                        n = k;
                    }
                }
            }
        }
    }
    
    public void method27438(final Class8466 class8466) {
        this.method27439(class8466, AxisRotation.NONE);
        this.method27439(class8466, AxisRotation.FORWARD);
        this.method27439(class8466, AxisRotation.BACKWARD);
    }
    
    private void method27439(final Class8466 class8466, final AxisRotation class8467) {
        final AxisRotation method984 = class8467.reverse();
        final Direction.Axis method985 = method984.rotate(Direction.Axis.Z);
        final int method986 = this.getSize(method984.rotate(Direction.Axis.X));
        final int method987 = this.getSize(method984.rotate(Direction.Axis.Y));
        final int method988 = this.getSize(method985);
        final Direction method989 = Direction.getFacingFromAxisDirection(method985, AxisDirection.NEGATIVE);
        final Direction method990 = Direction.getFacingFromAxisDirection(method985, AxisDirection.POSITIVE);
        for (int i = 0; i < method986; ++i) {
            for (int j = 0; j < method987; ++j) {
                boolean b = false;
                for (int k = 0; k <= method988; ++k) {
                    final boolean b2 = k != method988 && this.isFilledWithRotation(method984, i, j, k);
                    if (!b) {
                        if (b2) {
                            class8466.method28259(method989, method984.getCoordinate(i, j, k, Direction.Axis.X), method984.getCoordinate(i, j, k, Direction.Axis.Y), method984.getCoordinate(i, j, k, Direction.Axis.Z));
                        }
                    }
                    if (b) {
                        if (!b2) {
                            class8466.method28259(method990, method984.getCoordinate(i, j, k - 1, Direction.Axis.X), method984.getCoordinate(i, j, k - 1, Direction.Axis.Y), method984.getCoordinate(i, j, k - 1, Direction.Axis.Z));
                        }
                    }
                    b = b2;
                }
            }
        }
    }
    
    static {
        AXIS_VALUES = Direction.Axis.values();
    }
}
