package net.minecraft.block;

public class SandBlock extends FallingBlock
{
    private final int dustColor;

    public SandBlock(int p_i2116_1_, Block.Properties p_i2116_2_)
    {
        super(p_i2116_2_);
        this.dustColor = p_i2116_1_;
    }

    public int getDustColor(BlockState state)
    {
        return this.dustColor;
    }
}
