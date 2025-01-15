package net.optifine;

import com.google.common.collect.AbstractIterator;
import java.util.Iterator;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class BlockPosM extends BlockPos
{
    private int mx;
    private int my;
    private int mz;
    private int level;
    private BlockPosM[] facings;
    private boolean needsUpdate;

    public BlockPosM()
    {
        this(0, 0, 0, 0);
    }

    public BlockPosM(int x, int y, int z)
    {
        this(x, y, z, 0);
    }

    public BlockPosM(double xIn, double yIn, double zIn)
    {
        this(MathHelper.floor(xIn), MathHelper.floor(yIn), MathHelper.floor(zIn));
    }

    public BlockPosM(int x, int y, int z, int level)
    {
        super(0, 0, 0);
        this.mx = x;
        this.my = y;
        this.mz = z;
        this.level = level;
    }

    public int getX()
    {
        return this.mx;
    }

    public int getY()
    {
        return this.my;
    }

    public int getZ()
    {
        return this.mz;
    }

    public void setXyz(int x, int y, int z)
    {
        this.mx = x;
        this.my = y;
        this.mz = z;
        this.needsUpdate = true;
    }

    public void setXyz(double xIn, double yIn, double zIn)
    {
        this.setXyz(MathHelper.floor(xIn), MathHelper.floor(yIn), MathHelper.floor(zIn));
    }

    public BlockPos offset(Direction facing)
    {
        if (this.level <= 0)
        {
            return super.offset(facing, 1).toImmutable();
        }
        else
        {
            if (this.facings == null)
            {
                this.facings = new BlockPosM[Direction.VALUES.length];
            }

            if (this.needsUpdate)
            {
                this.update();
            }

            int i = facing.getIndex();
            BlockPosM blockposm = this.facings[i];

            if (blockposm == null)
            {
                int j = this.mx + facing.getXOffset();
                int k = this.my + facing.getYOffset();
                int l = this.mz + facing.getZOffset();
                blockposm = new BlockPosM(j, k, l, this.level - 1);
                this.facings[i] = blockposm;
            }

            return blockposm;
        }
    }

    public BlockPos offset(Direction facing, int n)
    {
        return n == 1 ? this.offset(facing) : super.offset(facing, n).toImmutable();
    }

    public void setPosMove(BlockPos pos, Direction facing)
    {
        this.mx = pos.getX() + facing.getXOffset();
        this.my = pos.getY() + facing.getYOffset();
        this.mz = pos.getZ() + facing.getZOffset();
    }

    public void setPosMove(BlockPos pos, Direction facing, Direction facing2)
    {
        this.mx = pos.getX() + facing.getXOffset() + facing2.getXOffset();
        this.my = pos.getY() + facing.getYOffset() + facing2.getYOffset();
        this.mz = pos.getZ() + facing.getZOffset() + facing2.getZOffset();
    }

    private void update()
    {
        for (int i = 0; i < 6; ++i)
        {
            BlockPosM blockposm = this.facings[i];

            if (blockposm != null)
            {
                Direction direction = Direction.VALUES[i];
                int j = this.mx + direction.getXOffset();
                int k = this.my + direction.getYOffset();
                int l = this.mz + direction.getZOffset();
                blockposm.setXyz(j, k, l);
            }
        }

        this.needsUpdate = false;
    }

    public BlockPos toImmutable()
    {
        return new BlockPos(this.mx, this.my, this.mz);
    }

    public static Iterable getAllInBoxMutable(BlockPos from, BlockPos to)
    {
        final BlockPos blockpos = new BlockPos(Math.min(from.getX(), to.getX()), Math.min(from.getY(), to.getY()), Math.min(from.getZ(), to.getZ()));
        final BlockPos blockpos1 = new BlockPos(Math.max(from.getX(), to.getX()), Math.max(from.getY(), to.getY()), Math.max(from.getZ(), to.getZ()));
        return new Iterable()
        {
            public Iterator iterator()
            {
                return new AbstractIterator()
                {
                    private BlockPosM theBlockPosM = null;
                    protected BlockPosM computeNext0()
                    {
                        if (this.theBlockPosM == null)
                        {
                            this.theBlockPosM = new BlockPosM(blockpos.getX(), blockpos.getY(), blockpos.getZ(), 3);
                            return this.theBlockPosM;
                        }
                        else if (this.theBlockPosM.equals(blockpos1))
                        {
                            return (BlockPosM) this.endOfData();
                        }
                        else
                        {
                            int i = this.theBlockPosM.getX();
                            int j = this.theBlockPosM.getY();
                            int k = this.theBlockPosM.getZ();

                            if (i < blockpos1.getX())
                            {
                                ++i;
                            }
                            else if (j < blockpos1.getY())
                            {
                                i = blockpos.getX();
                                ++j;
                            }
                            else if (k < blockpos1.getZ())
                            {
                                i = blockpos.getX();
                                j = blockpos.getY();
                                ++k;
                            }

                            this.theBlockPosM.setXyz(i, j, k);
                            return this.theBlockPosM;
                        }
                    }
                    protected Object computeNext()
                    {
                        return this.computeNext0();
                    }
                };
            }
        };
    }
}
