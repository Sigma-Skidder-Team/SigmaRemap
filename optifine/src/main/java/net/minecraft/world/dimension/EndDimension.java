package net.minecraft.world.dimension;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.biome.provider.BiomeProviderType;
import net.minecraft.world.end.DragonFightManager;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.ChunkGeneratorType;
import net.minecraft.world.gen.EndGenerationSettings;
import net.minecraft.world.server.ServerWorld;

public class EndDimension extends Dimension
{
    public static final BlockPos SPAWN = new BlockPos(100, 50, 0);
    private final DragonFightManager dragonFightManager;

    public EndDimension(World p_i1403_1_, DimensionType p_i1403_2_)
    {
        super(p_i1403_1_, p_i1403_2_, 0.0F);
        CompoundNBT compoundnbt = p_i1403_1_.getWorldInfo().getDimensionData(DimensionType.THE_END);
        this.dragonFightManager = p_i1403_1_ instanceof ServerWorld ? new DragonFightManager((ServerWorld)p_i1403_1_, compoundnbt.getCompound("DragonFight")) : null;
    }

    public ChunkGenerator<?> createChunkGenerator()
    {
        EndGenerationSettings endgenerationsettings = ChunkGeneratorType.FLOATING_ISLANDS.createSettings();
        endgenerationsettings.setDefaultBlock(Blocks.END_STONE.getDefaultState());
        endgenerationsettings.setDefaultFluid(Blocks.AIR.getDefaultState());
        endgenerationsettings.setSpawnPos(this.getSpawnCoordinate());
        return ChunkGeneratorType.FLOATING_ISLANDS.create(this.world, BiomeProviderType.THE_END.create(BiomeProviderType.THE_END.func_226840_a_(this.world.getWorldInfo())), endgenerationsettings);
    }

    public float calculateCelestialAngle(long worldTime, float partialTicks)
    {
        return 0.0F;
    }

    @Nullable
    public float[] calcSunriseSunsetColors(float celestialAngle, float partialTicks)
    {
        return null;
    }

    public Vec3d getFogColor(float celestialAngle, float partialTicks)
    {
        int i = 10518688;
        float f = MathHelper.cos(celestialAngle * ((float)Math.PI * 2F)) * 2.0F + 0.5F;
        f = MathHelper.clamp(f, 0.0F, 1.0F);
        float f1 = 0.627451F;
        float f2 = 0.5019608F;
        float f3 = 0.627451F;
        f1 = f1 * (f * 0.0F + 0.15F);
        f2 = f2 * (f * 0.0F + 0.15F);
        f3 = f3 * (f * 0.0F + 0.15F);
        return new Vec3d((double)f1, (double)f2, (double)f3);
    }

    public boolean isSkyColored()
    {
        return false;
    }

    public boolean canRespawnHere()
    {
        return false;
    }

    public boolean isSurfaceWorld()
    {
        return false;
    }

    public float getCloudHeight()
    {
        return 8.0F;
    }

    @Nullable
    public BlockPos findSpawn(ChunkPos chunkPosIn, boolean checkValid)
    {
        Random random = new Random(this.world.getSeed());
        BlockPos blockpos = new BlockPos(chunkPosIn.getXStart() + random.nextInt(15), 0, chunkPosIn.getZEnd() + random.nextInt(15));
        return this.world.getGroundAboveSeaLevel(blockpos).getMaterial().blocksMovement() ? blockpos : null;
    }

    public BlockPos getSpawnCoordinate()
    {
        return SPAWN;
    }

    @Nullable
    public BlockPos findSpawn(int posX, int posZ, boolean checkValid)
    {
        return this.findSpawn(new ChunkPos(posX >> 4, posZ >> 4), checkValid);
    }

    public boolean doesXZShowFog(int x, int z)
    {
        return false;
    }

    public DimensionType getType()
    {
        return DimensionType.THE_END;
    }

    public void onWorldSave()
    {
        CompoundNBT compoundnbt = new CompoundNBT();

        if (this.dragonFightManager != null)
        {
            compoundnbt.put("DragonFight", this.dragonFightManager.write());
        }

        this.world.getWorldInfo().setDimensionData(DimensionType.THE_END, compoundnbt);
    }

    public void tick()
    {
        if (this.dragonFightManager != null)
        {
            this.dragonFightManager.tick();
        }
    }

    @Nullable
    public DragonFightManager getDragonFightManager()
    {
        return this.dragonFightManager;
    }
}
