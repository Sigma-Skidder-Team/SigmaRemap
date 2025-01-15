package net.optifine.util;

import java.util.Set;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.ILightReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.optifine.override.ChunkCacheOF;

public class BiomeUtils
{
    public static ResourceLocation getLocation(Biome biome)
    {
        return Registry.BIOME.getKey(biome);
    }

    public static Biome getBiome(ResourceLocation loc)
    {
        return !Registry.BIOME.containsKey(loc) ? null : Registry.BIOME.getOrDefault(loc);
    }

    public static Biome getBiomeSafe(ResourceLocation loc)
    {
        return Registry.BIOME.getOrDefault(loc);
    }

    public static Set<ResourceLocation> getLocations()
    {
        return Registry.BIOME.keySet();
    }

    public static Biome getBiome(ILightReader lightReader, BlockPos blockPos)
    {
        Biome biome = Biomes.PLAINS;

        if (lightReader instanceof ChunkCacheOF)
        {
            biome = ((ChunkCacheOF)lightReader).getBiome(blockPos);
        }
        else if (lightReader instanceof IWorldReader)
        {
            biome = ((IWorldReader)lightReader).getBiome(blockPos);
        }

        return biome;
    }
}
