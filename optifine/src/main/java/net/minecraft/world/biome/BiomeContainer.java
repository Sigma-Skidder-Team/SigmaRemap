package net.minecraft.world.biome;

import javax.annotation.Nullable;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.provider.BiomeProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BiomeContainer implements BiomeManager.IBiomeReader
{
    private static final Logger LOGGER = LogManager.getLogger();
    private static final int WIDTH_BITS = (int)Math.round(Math.log(16.0D) / Math.log(2.0D)) - 2;
    private static final int HEIGHT_BITS = (int)Math.round(Math.log(256.0D) / Math.log(2.0D)) - 2;
    public static final int BIOMES_SIZE = 1 << WIDTH_BITS + WIDTH_BITS + HEIGHT_BITS;
    public static final int HORIZONTAL_MASK = (1 << WIDTH_BITS) - 1;
    public static final int VERTICAL_MASK = (1 << HEIGHT_BITS) - 1;
    private final Biome[] biomes;

    public BiomeContainer(Biome[] p_i2834_1_)
    {
        this.biomes = p_i2834_1_;
    }

    private BiomeContainer()
    {
        this(new Biome[BIOMES_SIZE]);
    }

    public BiomeContainer(PacketBuffer p_i2835_1_)
    {
        this();

        for (int i = 0; i < this.biomes.length; ++i)
        {
            int j = p_i2835_1_.readInt();
            Biome biome = Registry.BIOME.getByValue(j);

            if (biome == null)
            {
                LOGGER.warn("Received invalid biome id: " + j);
                this.biomes[i] = Biomes.PLAINS;
            }
            else
            {
                this.biomes[i] = biome;
            }
        }
    }

    public BiomeContainer(ChunkPos p_i2836_1_, BiomeProvider p_i2836_2_)
    {
        this();
        int i = p_i2836_1_.getXStart() >> 2;
        int j = p_i2836_1_.getZStart() >> 2;

        for (int k = 0; k < this.biomes.length; ++k)
        {
            int l = k & HORIZONTAL_MASK;
            int i1 = k >> WIDTH_BITS + WIDTH_BITS & VERTICAL_MASK;
            int j1 = k >> WIDTH_BITS & HORIZONTAL_MASK;
            this.biomes[k] = p_i2836_2_.getNoiseBiome(i + l, i1, j + j1);
        }
    }

    public BiomeContainer(ChunkPos p_i2837_1_, BiomeProvider p_i2837_2_, @Nullable int[] p_i2837_3_)
    {
        this();
        int i = p_i2837_1_.getXStart() >> 2;
        int j = p_i2837_1_.getZStart() >> 2;

        if (p_i2837_3_ != null)
        {
            for (int k = 0; k < p_i2837_3_.length; ++k)
            {
                this.biomes[k] = Registry.BIOME.getByValue(p_i2837_3_[k]);

                if (this.biomes[k] == null)
                {
                    int l = k & HORIZONTAL_MASK;
                    int i1 = k >> WIDTH_BITS + WIDTH_BITS & VERTICAL_MASK;
                    int j1 = k >> WIDTH_BITS & HORIZONTAL_MASK;
                    this.biomes[k] = p_i2837_2_.getNoiseBiome(i + l, i1, j + j1);
                }
            }
        }
        else
        {
            for (int k1 = 0; k1 < this.biomes.length; ++k1)
            {
                int l1 = k1 & HORIZONTAL_MASK;
                int i2 = k1 >> WIDTH_BITS + WIDTH_BITS & VERTICAL_MASK;
                int j2 = k1 >> WIDTH_BITS & HORIZONTAL_MASK;
                this.biomes[k1] = p_i2837_2_.getNoiseBiome(i + l1, i2, j + j2);
            }
        }
    }

    public int[] getBiomeIds()
    {
        int[] aint = new int[this.biomes.length];

        for (int i = 0; i < this.biomes.length; ++i)
        {
            aint[i] = Registry.BIOME.getId(this.biomes[i]);
        }

        return aint;
    }

    public void writeToBuf(PacketBuffer buf)
    {
        for (Biome biome : this.biomes)
        {
            buf.writeInt(Registry.BIOME.getId(biome));
        }
    }

    public BiomeContainer clone()
    {
        return new BiomeContainer((Biome[])this.biomes.clone());
    }

    public Biome getNoiseBiome(int x, int y, int z)
    {
        int i = x & HORIZONTAL_MASK;
        int j = MathHelper.clamp(y, 0, VERTICAL_MASK);
        int k = z & HORIZONTAL_MASK;
        return this.biomes[j << WIDTH_BITS + WIDTH_BITS | k << WIDTH_BITS | i];
    }
}
