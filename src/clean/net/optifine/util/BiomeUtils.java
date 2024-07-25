package net.optifine.util;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.DynamicRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.optifine.config.BiomeId;
import net.optifine.override.ChunkCacheOF;

public class BiomeUtils
{
    private static Registry<Biome> biomeRegistry = getBiomeRegistry(Minecraft.getInstance().world);
    public static Biome PLAINS = biomeRegistry.getOrThrow(Biomes.PLAINS);
    public static Biome SWAMP = biomeRegistry.getOrThrow(Biomes.SWAMP);
    public static Biome SWAMP_HILLS = biomeRegistry.getOrThrow(Biomes.SWAMP_HILLS);

    public static void onWorldChanged(World worldIn)
    {
        biomeRegistry = getBiomeRegistry(worldIn);
        PLAINS = biomeRegistry.getOrThrow(Biomes.PLAINS);
        SWAMP = biomeRegistry.getOrThrow(Biomes.SWAMP);
        SWAMP_HILLS = biomeRegistry.getOrThrow(Biomes.SWAMP_HILLS);
    }

    public static Registry<Biome> getBiomeRegistry(World worldIn)
    {
        return worldIn != null ? worldIn.func_241828_r().getRegistry(Registry.BIOME_KEY) : DynamicRegistries.func_239770_b_().getRegistry(Registry.BIOME_KEY);
    }

    public static Registry<Biome> getBiomeRegistry()
    {
        return biomeRegistry;
    }

    public static ResourceLocation getLocation(Biome biome)
    {
        return getBiomeRegistry().getKey(biome);
    }

    public static int getId(Biome biome)
    {
        return getBiomeRegistry().getId(biome);
    }

    public static int getId(ResourceLocation loc)
    {
        Biome biome = getBiome(loc);
        return getBiomeRegistry().getId(biome);
    }

    public static BiomeId getBiomeId(ResourceLocation loc)
    {
        return BiomeId.make(loc);
    }

    public static Biome getBiome(ResourceLocation loc)
    {
        return getBiomeRegistry().getOrDefault(loc);
    }

    public static Set<ResourceLocation> getLocations()
    {
        return getBiomeRegistry().keySet();
    }

    public static List<Biome> getBiomes()
    {
        return Lists.newArrayList(biomeRegistry);
    }

    public static List<BiomeId> getBiomeIds()
    {
        return getBiomeIds(getLocations());
    }

    public static List<BiomeId> getBiomeIds(Collection<ResourceLocation> locations)
    {
        List<BiomeId> list = new ArrayList<>();

        for (ResourceLocation resourcelocation : locations)
        {
            BiomeId biomeid = BiomeId.make(resourcelocation);

            if (biomeid != null)
            {
                list.add(biomeid);
            }
        }

        return list;
    }

    public static Biome getBiome(IBlockDisplayReader lightReader, BlockPos blockPos)
    {
        Biome biome = PLAINS;

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
