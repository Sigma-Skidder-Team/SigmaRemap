// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import java.util.BitSet;

public final class BitSetVoxelShapePart extends VoxelShapePart
{
    private final BitSet bitSet;
    private int startX;
    private int startY;
    private int startZ;
    private int endX;
    private int endY;
    private int endZ;
    
    public BitSetVoxelShapePart(final int n, final int n2, final int n3) {
        this(n, n2, n3, n, n2, n3, 0, 0, 0);
    }
    
    public BitSetVoxelShapePart(final int n, final int n2, final int n3, final int field33912, final int field33913, final int field33914, final int field33915, final int field33916, final int field33917) {
        super(n, n2, n3);
        this.bitSet = new BitSet(n * n2 * n3);
        this.startX = field33912;
        this.startY = field33913;
        this.startZ = field33914;
        this.endX = field33915;
        this.endY = field33916;
        this.endZ = field33917;
    }
    
    public BitSetVoxelShapePart(final VoxelShapePart class8260) {
        super(class8260.xSize, class8260.ySize, class8260.zSize);
        if (!(class8260 instanceof BitSetVoxelShapePart)) {
            this.bitSet = new BitSet(this.xSize * this.ySize * this.zSize);
            for (int i = 0; i < this.xSize; ++i) {
                for (int j = 0; j < this.ySize; ++j) {
                    for (int k = 0; k < this.zSize; ++k) {
                        if (class8260.isFilled(i, j, k)) {
                            this.bitSet.set(this.getIndex(i, j, k));
                        }
                    }
                }
            }
        }
        else {
            this.bitSet = (BitSet)((BitSetVoxelShapePart)class8260).bitSet.clone();
        }
        this.startX = class8260.getStart(Direction.Axis.X);
        this.startY = class8260.getStart(Direction.Axis.Y);
        this.startZ = class8260.getStart(Direction.Axis.Z);
        this.endX = class8260.getEnd(Direction.Axis.X);
        this.endY = class8260.getEnd(Direction.Axis.Y);
        this.endZ = class8260.getEnd(Direction.Axis.Z);
    }
    
    public int getIndex(final int n, final int n2, final int n3) {
        return (n * this.ySize + n2) * this.zSize + n3;
    }
    
    @Override
    public boolean isFilled(final int n, final int n2, final int n3) {
        return this.bitSet.get(this.getIndex(n, n2, n3));
    }
    
    @Override
    public void setFilled(final int b, final int b2, final int b3, final boolean b4, final boolean value) {
        this.bitSet.set(this.getIndex(b, b2, b3), value);
        if (b4) {
            if (value) {
                this.startX = Math.min(this.startX, b);
                this.startY = Math.min(this.startY, b2);
                this.startZ = Math.min(this.startZ, b3);
                this.endX = Math.max(this.endX, b + 1);
                this.endY = Math.max(this.endY, b2 + 1);
                this.endZ = Math.max(this.endZ, b3 + 1);
            }
        }
    }
    
    @Override
    public boolean isEmpty() {
        return this.bitSet.isEmpty();
    }
    
    @Override
    public int getStart(final Direction.Axis class111) {
        return class111.getCoordinate(this.startX, this.startY, this.startZ);
    }
    
    @Override
    public int getEnd(final Direction.Axis class111) {
        return class111.getCoordinate(this.endX, this.endY, this.endZ);
    }
    
    @Override
    public boolean isZAxisLineFull(final int n, final int n2, final int n3, final int n4) {
        if (n3 >= 0) {
            if (n4 >= 0) {
                if (n >= 0) {
                    if (n3 < this.xSize) {
                        if (n4 < this.ySize) {
                            if (n2 <= this.zSize) {
                                return this.bitSet.nextClearBit(this.getIndex(n3, n4, n)) >= this.getIndex(n3, n4, n2);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }
    
    @Override
    public void setZAxisLine(final int n, final int n2, final int n3, final int n4, final boolean value) {
        this.bitSet.set(this.getIndex(n3, n4, n), this.getIndex(n3, n4, n2), value);
    }

    static BitSetVoxelShapePart func_197852_a(VoxelShapePart first, VoxelShapePart second, IDoubleListMerger xMerger, IDoubleListMerger yMerger, IDoubleListMerger zMerger, IBooleanFunction op)
    {
        BitSetVoxelShapePart bitsetvoxelshapepart = new BitSetVoxelShapePart(xMerger.func_212435_a().size() - 1, yMerger.func_212435_a().size() - 1, zMerger.func_212435_a().size() - 1);
        int[] aint = new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        xMerger.forMergedIndexes((p_199628_7_, p_199628_8_, p_199628_9_) ->
        {
            boolean[] aboolean = new boolean[]{false};
            boolean flag = yMerger.forMergedIndexes((p_199627_10_, p_199627_11_, p_199627_12_) -> {
                boolean[] aboolean1 = new boolean[]{false};
                boolean flag1 = zMerger.forMergedIndexes((p_199629_12_, p_199629_13_, p_199629_14_) -> {
                    boolean flag2 = op.apply(first.contains(p_199628_7_, p_199627_10_, p_199629_12_), second.contains(p_199628_8_, p_199627_11_, p_199629_13_));

                    if (flag2)
                    {
                        bitsetvoxelshapepart.bitSet.set(bitsetvoxelshapepart.getIndex(p_199628_9_, p_199627_12_, p_199629_14_));
                        aint[2] = Math.min(aint[2], p_199629_14_);
                        aint[5] = Math.max(aint[5], p_199629_14_);
                        aboolean1[0] = true;
                    }

                    return true;
                });

                if (aboolean1[0])
                {
                    aint[1] = Math.min(aint[1], p_199627_12_);
                    aint[4] = Math.max(aint[4], p_199627_12_);
                    aboolean[0] = true;
                }

                return flag1;
            });

            if (aboolean[0])
            {
                aint[0] = Math.min(aint[0], p_199628_9_);
                aint[3] = Math.max(aint[3], p_199628_9_);
            }

            return flag;
        });
        bitsetvoxelshapepart.startX = aint[0];
        bitsetvoxelshapepart.startY = aint[1];
        bitsetvoxelshapepart.startZ = aint[2];
        bitsetvoxelshapepart.endX = aint[3] + 1;
        bitsetvoxelshapepart.endY = aint[4] + 1;
        bitsetvoxelshapepart.endZ = aint[5] + 1;
        return bitsetvoxelshapepart;
    }
}
