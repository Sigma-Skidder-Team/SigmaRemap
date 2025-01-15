package net.minecraft.world.gen.feature.structure;

import net.minecraft.util.math.MutableBoundingBox;

public abstract class MarginedStructureStart extends StructureStart
{
    public MarginedStructureStart(Structure<?> p_i4177_1_, int p_i4177_2_, int p_i4177_3_, MutableBoundingBox p_i4177_4_, int p_i4177_5_, long p_i4177_6_)
    {
        super(p_i4177_1_, p_i4177_2_, p_i4177_3_, p_i4177_4_, p_i4177_5_, p_i4177_6_);
    }

    protected void recalculateStructureSize()
    {
        super.recalculateStructureSize();
        int i = 12;
        this.bounds.minX -= 12;
        this.bounds.minY -= 12;
        this.bounds.minZ -= 12;
        this.bounds.maxX += 12;
        this.bounds.maxY += 12;
        this.bounds.maxZ += 12;
    }
}
