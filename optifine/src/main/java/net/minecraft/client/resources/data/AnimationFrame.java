package net.minecraft.client.resources.data;

public class AnimationFrame
{
    private final int frameIndex;
    private final int frameTime;

    public AnimationFrame(int p_i2411_1_)
    {
        this(p_i2411_1_, -1);
    }

    public AnimationFrame(int p_i2412_1_, int p_i2412_2_)
    {
        this.frameIndex = p_i2412_1_;
        this.frameTime = p_i2412_2_;
    }

    public boolean hasNoTime()
    {
        return this.frameTime == -1;
    }

    public int getFrameTime()
    {
        return this.frameTime;
    }

    public int getFrameIndex()
    {
        return this.frameIndex;
    }
}
