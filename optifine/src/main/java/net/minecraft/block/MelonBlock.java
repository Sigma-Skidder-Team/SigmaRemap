package net.minecraft.block;

public class MelonBlock extends StemGrownBlock
{
    protected MelonBlock(Block.Properties p_i2427_1_)
    {
        super(p_i2427_1_);
    }

    public StemBlock getStem()
    {
        return (StemBlock)Blocks.MELON_STEM;
    }

    public AttachedStemBlock getAttachedStem()
    {
        return (AttachedStemBlock)Blocks.ATTACHED_MELON_STEM;
    }
}
