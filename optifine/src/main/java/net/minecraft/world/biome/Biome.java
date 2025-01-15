package net.minecraft.world.biome;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.ReportedException;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.util.ObjectIntIdentityMap;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.Util;
import net.minecraft.util.WeightedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.GrassColors;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.LightType;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.PerlinNoiseGenerator;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.carver.ICarverConfig;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Biome
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final Set<Biome> BIOMES = Sets.newHashSet();
    public static final ObjectIntIdentityMap<Biome> MUTATION_TO_BASE_ID_MAP = new ObjectIntIdentityMap<>();
    protected static final PerlinNoiseGenerator TEMPERATURE_NOISE = new PerlinNoiseGenerator(new SharedSeedRandom(1234L), 0, 0);
    public static final PerlinNoiseGenerator INFO_NOISE = new PerlinNoiseGenerator(new SharedSeedRandom(2345L), 0, 0);
    @Nullable
    protected String translationKey;
    protected final float depth;
    protected final float scale;
    protected final float temperature;
    protected final float downfall;
    protected final int waterColor;
    protected final int waterFogColor;
    private final int skyColor;
    @Nullable
    protected final String parent;
    protected final ConfiguredSurfaceBuilder<?> surfaceBuilder;
    protected final Biome.Category category;
    protected final Biome.RainType precipitation;
    protected final Map < GenerationStage.Carving, List < ConfiguredCarver<? >>> carvers = Maps.newHashMap();
    protected final Map < GenerationStage.Decoration, List < ConfiguredFeature <? , ? >>> features = Maps.newHashMap();
    protected final List < ConfiguredFeature <? , ? >> flowers = Lists.newArrayList();
    protected final Map < Structure<?>, IFeatureConfig > structures = Maps.newHashMap();
    private final Map<EntityClassification, List<Biome.SpawnListEntry>> spawns = Maps.newHashMap();
    private final ThreadLocal<Long2FloatLinkedOpenHashMap> field_225488_v = ThreadLocal.withInitial(() ->
    {
        return Util.make(() -> {
            Long2FloatLinkedOpenHashMap long2floatlinkedopenhashmap = new Long2FloatLinkedOpenHashMap(1024, 0.25F)
            {
                protected void rehash(int p_rehash_1_)
                {
                }
            };
            long2floatlinkedopenhashmap.defaultReturnValue(Float.NaN);
            return long2floatlinkedopenhashmap;
        });
    });

    @Nullable
    public static Biome getMutationForBiome(Biome biome)
    {
        return MUTATION_TO_BASE_ID_MAP.getByValue(Registry.BIOME.getId(biome));
    }

    public static <C extends ICarverConfig> ConfiguredCarver<C> createCarver(WorldCarver<C> carver, C config)
    {
        return new ConfiguredCarver<>(carver, config);
    }

    protected Biome(Biome.Builder p_i1214_1_)
    {
        if (p_i1214_1_.surfaceBuilder != null && p_i1214_1_.precipitation != null && p_i1214_1_.category != null && p_i1214_1_.depth != null && p_i1214_1_.scale != null && p_i1214_1_.temperature != null && p_i1214_1_.downfall != null && p_i1214_1_.waterColor != null && p_i1214_1_.waterFogColor != null)
        {
            this.surfaceBuilder = p_i1214_1_.surfaceBuilder;
            this.precipitation = p_i1214_1_.precipitation;
            this.category = p_i1214_1_.category;
            this.depth = p_i1214_1_.depth;
            this.scale = p_i1214_1_.scale;
            this.temperature = p_i1214_1_.temperature;
            this.downfall = p_i1214_1_.downfall;
            this.waterColor = p_i1214_1_.waterColor;
            this.waterFogColor = p_i1214_1_.waterFogColor;
            this.skyColor = this.calculateSkyColor();
            this.parent = p_i1214_1_.parent;

            for (GenerationStage.Decoration generationstage$decoration : GenerationStage.Decoration.values())
            {
                this.features.put(generationstage$decoration, Lists.newArrayList());
            }

            for (EntityClassification entityclassification : EntityClassification.values())
            {
                this.spawns.put(entityclassification, Lists.newArrayList());
            }
        }
        else
        {
            throw new IllegalStateException("You are missing parameters to build a proper biome for " + this.getClass().getSimpleName() + "\n" + p_i1214_1_);
        }
    }

    public boolean isMutation()
    {
        return this.parent != null;
    }

    private int calculateSkyColor()
    {
        float f = this.temperature;
        f = f / 3.0F;
        f = MathHelper.clamp(f, -1.0F, 1.0F);
        return MathHelper.hsvToRGB(0.62222224F - f * 0.05F, 0.5F + f * 0.1F, 1.0F);
    }

    public int getSkyColor()
    {
        return this.skyColor;
    }

    protected void addSpawn(EntityClassification type, Biome.SpawnListEntry spawnListEntry)
    {
        this.spawns.get(type).add(spawnListEntry);
    }

    public List<Biome.SpawnListEntry> getSpawns(EntityClassification creatureType)
    {
        return this.spawns.get(creatureType);
    }

    public Biome.RainType getPrecipitation()
    {
        return this.precipitation;
    }

    public boolean isHighHumidity()
    {
        return this.getDownfall() > 0.85F;
    }

    public float getSpawningChance()
    {
        return 0.1F;
    }

    protected float getTemperatureRaw(BlockPos pos)
    {
        if (pos.getY() > 64)
        {
            float f = (float)(TEMPERATURE_NOISE.noiseAt((double)((float)pos.getX() / 8.0F), (double)((float)pos.getZ() / 8.0F), false) * 4.0D);
            return this.getDefaultTemperature() - (f + (float)pos.getY() - 64.0F) * 0.05F / 30.0F;
        }
        else
        {
            return this.getDefaultTemperature();
        }
    }

    public final float getTemperature(BlockPos p_225486_1_)
    {
        long i = p_225486_1_.toLong();
        Long2FloatLinkedOpenHashMap long2floatlinkedopenhashmap = this.field_225488_v.get();
        float f = long2floatlinkedopenhashmap.get(i);

        if (!Float.isNaN(f))
        {
            return f;
        }
        else
        {
            float f1 = this.getTemperatureRaw(p_225486_1_);

            if (long2floatlinkedopenhashmap.size() == 1024)
            {
                long2floatlinkedopenhashmap.removeFirstFloat();
            }

            long2floatlinkedopenhashmap.put(i, f1);
            return f1;
        }
    }

    public boolean doesWaterFreeze(IWorldReader worldIn, BlockPos pos)
    {
        return this.doesWaterFreeze(worldIn, pos, true);
    }

    public boolean doesWaterFreeze(IWorldReader worldIn, BlockPos water, boolean mustBeAtEdge)
    {
        if (this.getTemperature(water) >= 0.15F)
        {
            return false;
        }
        else
        {
            if (water.getY() >= 0 && water.getY() < 256 && worldIn.getLightFor(LightType.BLOCK, water) < 10)
            {
                BlockState blockstate = worldIn.getBlockState(water);
                IFluidState ifluidstate = worldIn.getFluidState(water);

                if (ifluidstate.getFluid() == Fluids.WATER && blockstate.getBlock() instanceof FlowingFluidBlock)
                {
                    if (!mustBeAtEdge)
                    {
                        return true;
                    }

                    boolean flag = worldIn.hasWater(water.west()) && worldIn.hasWater(water.east()) && worldIn.hasWater(water.north()) && worldIn.hasWater(water.south());

                    if (!flag)
                    {
                        return true;
                    }
                }
            }

            return false;
        }
    }

    public boolean doesSnowGenerate(IWorldReader worldIn, BlockPos pos)
    {
        if (this.getTemperature(pos) >= 0.15F)
        {
            return false;
        }
        else
        {
            if (pos.getY() >= 0 && pos.getY() < 256 && worldIn.getLightFor(LightType.BLOCK, pos) < 10)
            {
                BlockState blockstate = worldIn.getBlockState(pos);

                if (blockstate.isAir() && Blocks.SNOW.getDefaultState().isValidPosition(worldIn, pos))
                {
                    return true;
                }
            }

            return false;
        }
    }

    public void addFeature(GenerationStage.Decoration decorationStage, ConfiguredFeature <? , ? > featureIn)
    {
        if (featureIn.feature == Feature.DECORATED_FLOWER)
        {
            this.flowers.add(featureIn);
        }

        this.features.get(decorationStage).add(featureIn);
    }

    public <C extends ICarverConfig> void addCarver(GenerationStage.Carving stage, ConfiguredCarver<C> carver)
    {
        this.carvers.computeIfAbsent(stage, (p_203604_0_) ->
        {
            return Lists.newArrayList();
        }).add(carver);
    }

    public List < ConfiguredCarver<? >> getCarvers(GenerationStage.Carving stage)
    {
        return this.carvers.computeIfAbsent(stage, (p_203610_0_) ->
        {
            return Lists.newArrayList();
        });
    }

    public <C extends IFeatureConfig> void addStructure(ConfiguredFeature < C, ? extends Structure<C >> structureIn)
    {
        this.structures.put(structureIn.feature, structureIn.config);
    }

    public <C extends IFeatureConfig> boolean hasStructure(Structure<C> structureIn)
    {
        return this.structures.containsKey(structureIn);
    }

    @Nullable
    public <C extends IFeatureConfig> C getStructureConfig(Structure<C> structureIn)
    {
        return (C)(this.structures.get(structureIn));
    }

    public List < ConfiguredFeature <? , ? >> getFlowers()
    {
        return this.flowers;
    }

    public List < ConfiguredFeature <? , ? >> getFeatures(GenerationStage.Decoration decorationStage)
    {
        return this.features.get(decorationStage);
    }

    public void decorate(GenerationStage.Decoration stage, ChunkGenerator <? extends GenerationSettings > chunkGenerator, IWorld worldIn, long seed, SharedSeedRandom random, BlockPos pos)
    {
        int i = 0;

        for (ConfiguredFeature <? , ? > configuredfeature : this.features.get(stage))
        {
            random.setFeatureSeed(seed, i, stage.ordinal());

            try
            {
                configuredfeature.place(worldIn, chunkGenerator, random, pos);
            }
            catch (Exception exception)
            {
                CrashReport crashreport = CrashReport.makeCrashReport(exception, "Feature placement");
                crashreport.makeCategory("Feature").addDetail("Id", Registry.FEATURE.getKey(configuredfeature.feature)).addDetail("Description", () ->
                {
                    return configuredfeature.feature.toString();
                });
                throw new ReportedException(crashreport);
            }

            ++i;
        }
    }

    public int getGrassColor(double posX, double posZ)
    {
        double d0 = (double)MathHelper.clamp(this.getDefaultTemperature(), 0.0F, 1.0F);
        double d1 = (double)MathHelper.clamp(this.getDownfall(), 0.0F, 1.0F);
        return GrassColors.get(d0, d1);
    }

    public int getFoliageColor()
    {
        double d0 = (double)MathHelper.clamp(this.getDefaultTemperature(), 0.0F, 1.0F);
        double d1 = (double)MathHelper.clamp(this.getDownfall(), 0.0F, 1.0F);
        return FoliageColors.get(d0, d1);
    }

    public void buildSurface(Random random, IChunk chunkIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed)
    {
        this.surfaceBuilder.setSeed(seed);
        this.surfaceBuilder.buildSurface(random, chunkIn, this, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed);
    }

    public Biome.TempCategory getTempCategory()
    {
        if (this.category == Biome.Category.OCEAN)
        {
            return Biome.TempCategory.OCEAN;
        }
        else if ((double)this.getDefaultTemperature() < 0.2D)
        {
            return Biome.TempCategory.COLD;
        }
        else
        {
            return (double)this.getDefaultTemperature() < 1.0D ? Biome.TempCategory.MEDIUM : Biome.TempCategory.WARM;
        }
    }

    public final float getDepth()
    {
        return this.depth;
    }

    public final float getDownfall()
    {
        return this.downfall;
    }

    public ITextComponent getDisplayName()
    {
        return new TranslationTextComponent(this.getTranslationKey());
    }

    public String getTranslationKey()
    {
        if (this.translationKey == null)
        {
            this.translationKey = Util.makeTranslationKey("biome", Registry.BIOME.getKey(this));
        }

        return this.translationKey;
    }

    public final float getScale()
    {
        return this.scale;
    }

    public final float getDefaultTemperature()
    {
        return this.temperature;
    }

    public final int getWaterColor()
    {
        return this.waterColor;
    }

    public final int getWaterFogColor()
    {
        return this.waterFogColor;
    }

    public final Biome.Category getCategory()
    {
        return this.category;
    }

    public ConfiguredSurfaceBuilder<?> getSurfaceBuilder()
    {
        return this.surfaceBuilder;
    }

    public ISurfaceBuilderConfig getSurfaceBuilderConfig()
    {
        return this.surfaceBuilder.getConfig();
    }

    @Nullable
    public String getParent()
    {
        return this.parent;
    }

    public static class Builder
    {
        @Nullable
        private ConfiguredSurfaceBuilder<?> surfaceBuilder;
        @Nullable
        private Biome.RainType precipitation;
        @Nullable
        private Biome.Category category;
        @Nullable
        private Float depth;
        @Nullable
        private Float scale;
        @Nullable
        private Float temperature;
        @Nullable
        private Float downfall;
        @Nullable
        private Integer waterColor;
        @Nullable
        private Integer waterFogColor;
        @Nullable
        private String parent;

        public <SC extends ISurfaceBuilderConfig> Biome.Builder surfaceBuilder(SurfaceBuilder<SC> surfaceBuilderIn, SC surfaceBuilderConfigIn)
        {
            this.surfaceBuilder = new ConfiguredSurfaceBuilder<>(surfaceBuilderIn, surfaceBuilderConfigIn);
            return this;
        }

        public Biome.Builder surfaceBuilder(ConfiguredSurfaceBuilder<?> surfaceBuilderIn)
        {
            this.surfaceBuilder = surfaceBuilderIn;
            return this;
        }

        public Biome.Builder precipitation(Biome.RainType precipitationIn)
        {
            this.precipitation = precipitationIn;
            return this;
        }

        public Biome.Builder category(Biome.Category biomeCategory)
        {
            this.category = biomeCategory;
            return this;
        }

        public Biome.Builder depth(float depthIn)
        {
            this.depth = depthIn;
            return this;
        }

        public Biome.Builder scale(float scaleIn)
        {
            this.scale = scaleIn;
            return this;
        }

        public Biome.Builder temperature(float temperatureIn)
        {
            this.temperature = temperatureIn;
            return this;
        }

        public Biome.Builder downfall(float downfallIn)
        {
            this.downfall = downfallIn;
            return this;
        }

        public Biome.Builder waterColor(int waterColorIn)
        {
            this.waterColor = waterColorIn;
            return this;
        }

        public Biome.Builder waterFogColor(int waterFogColorIn)
        {
            this.waterFogColor = waterFogColorIn;
            return this;
        }

        public Biome.Builder parent(@Nullable String parentIn)
        {
            this.parent = parentIn;
            return this;
        }

        public String toString()
        {
            return "BiomeBuilder{\nsurfaceBuilder=" + this.surfaceBuilder + ",\nprecipitation=" + this.precipitation + ",\nbiomeCategory=" + this.category + ",\ndepth=" + this.depth + ",\nscale=" + this.scale + ",\ntemperature=" + this.temperature + ",\ndownfall=" + this.downfall + ",\nwaterColor=" + this.waterColor + ",\nwaterFogColor=" + this.waterFogColor + ",\nparent='" + this.parent + '\'' + "\n" + '}';
        }
    }

    public static enum Category
    {
        NONE("none"),
        TAIGA("taiga"),
        EXTREME_HILLS("extreme_hills"),
        JUNGLE("jungle"),
        MESA("mesa"),
        PLAINS("plains"),
        SAVANNA("savanna"),
        ICY("icy"),
        THEEND("the_end"),
        BEACH("beach"),
        FOREST("forest"),
        OCEAN("ocean"),
        DESERT("desert"),
        RIVER("river"),
        SWAMP("swamp"),
        MUSHROOM("mushroom"),
        NETHER("nether");

        private static final Map<String, Biome.Category> BY_NAME = Arrays.stream(values()).collect(Collectors.toMap(Biome.Category::getName, (p_222353_0_) -> {
            return p_222353_0_;
        }));
        private final String name;

        private Category(String p_i3702_3_)
        {
            this.name = p_i3702_3_;
        }

        public String getName()
        {
            return this.name;
        }
    }

    public static enum RainType
    {
        NONE("none"),
        RAIN("rain"),
        SNOW("snow");

        private static final Map<String, Biome.RainType> BY_NAME = Arrays.stream(values()).collect(Collectors.toMap(Biome.RainType::getName, (p_222360_0_) -> {
            return p_222360_0_;
        }));
        private final String name;

        private RainType(String p_i3143_3_)
        {
            this.name = p_i3143_3_;
        }

        public String getName()
        {
            return this.name;
        }
    }

    public static class SpawnListEntry extends WeightedRandom.Item
    {
        public final EntityType<?> entityType;
        public final int minGroupCount;
        public final int maxGroupCount;

        public SpawnListEntry(EntityType<?> p_i1103_1_, int p_i1103_2_, int p_i1103_3_, int p_i1103_4_)
        {
            super(p_i1103_2_);
            this.entityType = p_i1103_1_;
            this.minGroupCount = p_i1103_3_;
            this.maxGroupCount = p_i1103_4_;
        }

        public String toString()
        {
            return EntityType.getKey(this.entityType) + "*(" + this.minGroupCount + "-" + this.maxGroupCount + "):" + this.itemWeight;
        }
    }

    public static enum TempCategory
    {
        OCEAN("ocean"),
        COLD("cold"),
        MEDIUM("medium"),
        WARM("warm");

        private static final Map<String, Biome.TempCategory> BY_NAME = Arrays.stream(values()).collect(Collectors.toMap(Biome.TempCategory::getName, (p_222356_0_) -> {
            return p_222356_0_;
        }));
        private final String name;

        private TempCategory(String p_i3657_3_)
        {
            this.name = p_i3657_3_;
        }

        public String getName()
        {
            return this.name;
        }
    }
}
