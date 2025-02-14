package net.optifine.util;

import com.google.common.collect.Lists;
import mapped.ChunkCacheOF;
import mapped.RegistryKey;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeMaker;
import net.minecraft.world.biome.Biomes;
import net.optifine.config.BiomeId;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class BiomeUtils {
    private static Registry<Biome> biomeRegistry = getBiomeRegistry(Minecraft.getInstance().world);
    public static Biome PLAINS = getBiomeSafe(biomeRegistry, Biomes.PLAINS, () ->
    {
        return BiomeMaker.makePlainsBiome(false);
    });
    public static Biome SWAMP = getBiomeSafe(biomeRegistry, Biomes.SWAMP, () ->
    {
        return BiomeMaker.makeGenericSwampBiome(-0.2F, 0.1F, false);
    });
    public static Biome SWAMP_HILLS = getBiomeSafe(biomeRegistry, Biomes.SWAMP_HILLS, () ->
    {
        return BiomeMaker.makeGenericSwampBiome(-0.1F, 0.3F, true);
    });

    public static void onWorldChanged(World var0) {
        biomeRegistry = getBiomeRegistry(var0);
        PLAINS = getBiomeSafe(biomeRegistry, Biomes.PLAINS, () ->
        {
            return BiomeMaker.makePlainsBiome(false);
        });
        SWAMP = getBiomeSafe(biomeRegistry, Biomes.SWAMP, () ->
        {
            return BiomeMaker.makeGenericSwampBiome(-0.2F, 0.1F, false);
        });
        SWAMP_HILLS = getBiomeSafe(biomeRegistry, Biomes.SWAMP_HILLS, () ->
        {
            return BiomeMaker.makeGenericSwampBiome(-0.1F, 0.3F, true);
        });
    }

    private static Biome getBiomeSafe(Registry<Biome> registry, RegistryKey<Biome> biomeKey, Supplier<Biome> biomeDefault) {
        Biome biome = registry.getValueForKey(biomeKey);

        if (biome == null) {
            biome = biomeDefault.get();
        }

        return biome;
    }

    public static Registry<Biome> getBiomeRegistry(World worldIn) {
        return worldIn != null ? worldIn.func_241828_r().getRegistry(Registry.BIOME_KEY) : WorldGenRegistries.BIOME;
    }

    public static Registry<Biome> getBiomeRegistry() {
        return biomeRegistry;
    }

    public static ResourceLocation getLocation(Biome var0) {
        return getBiomeRegistry().getKey(var0);
    }

    public static int getId(Biome var0) {
        return getBiomeRegistry().getId(var0);
    }

    public static int getId(ResourceLocation var0) {
        Biome var3 = getBiome(var0);
        return getBiomeRegistry().getId(var3);
    }

    public static BiomeId getBiomeId(ResourceLocation var0) {
        return BiomeId.make(var0);
    }

    public static Biome getBiome(ResourceLocation var0) {
        return getBiomeRegistry().getOrDefault(var0);
    }

    public static Set<ResourceLocation> getLocations() {
        return getBiomeRegistry().keySet();
    }

    public static List<Biome> getBiomes() {
        return Lists.newArrayList(biomeRegistry);
    }

    public static List<BiomeId> getBiomeIds() {
        return getBiomeIds(getLocations());
    }

    public static List<BiomeId> getBiomeIds(Collection<ResourceLocation> locations) {
        List<BiomeId> list = new ArrayList<>();

        for (ResourceLocation resourcelocation : locations) {
            BiomeId biomeid = BiomeId.make(resourcelocation);
            if (biomeid != null) {
                list.add(biomeid);
            }
        }

        return list;
    }

    public static Biome getBiome(IBlockDisplayReader lightReader, BlockPos blockPos) {
        Biome biome = PLAINS;

        if (!(lightReader instanceof ChunkCacheOF)) {
            if (lightReader instanceof IWorldReader) {
                biome = ((IWorldReader) lightReader).getBiome(blockPos);
            }
        } else {
            biome = ((ChunkCacheOF) lightReader).getBiome(blockPos);
        }

        return biome;
    }
}
