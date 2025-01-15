package net.minecraft.world.dimension;

import javax.annotation.Nullable;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProviderType;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.ChunkGeneratorType;
import net.minecraft.world.gen.NetherGenSettings;

public class NetherDimension extends Dimension
{
    private static final Vec3d field_227177_f_ = new Vec3d((double)0.2F, (double)0.03F, (double)0.03F);

    public NetherDimension(World p_i1257_1_, DimensionType p_i1257_2_)
    {
        super(p_i1257_1_, p_i1257_2_, 0.1F);
        this.doesWaterVaporize = true;
        this.nether = true;
    }

    public Vec3d getFogColor(float celestialAngle, float partialTicks)
    {
        return field_227177_f_;
    }

    public ChunkGenerator<?> createChunkGenerator()
    {
        NetherGenSettings nethergensettings = ChunkGeneratorType.CAVES.createSettings();
        nethergensettings.setDefaultBlock(Blocks.NETHERRACK.getDefaultState());
        nethergensettings.setDefaultFluid(Blocks.LAVA.getDefaultState());
        return ChunkGeneratorType.CAVES.create(this.world, BiomeProviderType.FIXED.create(BiomeProviderType.FIXED.func_226840_a_(this.world.getWorldInfo()).setBiome(Biomes.NETHER)), nethergensettings);
    }

    public boolean isSurfaceWorld()
    {
        return false;
    }

    @Nullable
    public BlockPos findSpawn(ChunkPos chunkPosIn, boolean checkValid)
    {
        return null;
    }

    @Nullable
    public BlockPos findSpawn(int posX, int posZ, boolean checkValid)
    {
        return null;
    }

    public float calculateCelestialAngle(long worldTime, float partialTicks)
    {
        return 0.5F;
    }

    public boolean canRespawnHere()
    {
        return false;
    }

    public boolean doesXZShowFog(int x, int z)
    {
        return true;
    }

    public WorldBorder createWorldBorder()
    {
        return new WorldBorder()
        {
            public double getCenterX()
            {
                return super.getCenterX() / 8.0D;
            }
            public double getCenterZ()
            {
                return super.getCenterZ() / 8.0D;
            }
        };
    }

    public DimensionType getType()
    {
        return DimensionType.THE_NETHER;
    }
}
