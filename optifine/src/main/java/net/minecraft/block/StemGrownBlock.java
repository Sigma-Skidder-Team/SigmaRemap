package net.minecraft.block;

public abstract class StemGrownBlock extends Block
{
    public StemGrownBlock(Block.Properties p_i2640_1_)
    {
        super(p_i2640_1_);
    }

    public abstract StemBlock getStem();

    public abstract AttachedStemBlock getAttachedStem();
}
