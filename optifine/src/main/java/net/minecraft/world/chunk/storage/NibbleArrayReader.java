package net.minecraft.world.chunk.storage;

public class NibbleArrayReader
{
    public final byte[] data;
    private final int depthBits;
    private final int depthBitsPlusFour;

    public NibbleArrayReader(byte[] p_i2770_1_, int p_i2770_2_)
    {
        this.data = p_i2770_1_;
        this.depthBits = p_i2770_2_;
        this.depthBitsPlusFour = p_i2770_2_ + 4;
    }

    public int get(int x, int y, int z)
    {
        int i = x << this.depthBitsPlusFour | z << this.depthBits | y;
        int j = i >> 1;
        int k = i & 1;
        return k == 0 ? this.data[j] & 15 : this.data[j] >> 4 & 15;
    }
}
