package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.IBiomeMagnifier;
import net.minecraft.world.biome.provider.EndBiomeProvider;
import net.minecraft.world.gen.ChunkGenerator;

import java.io.File;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Supplier;

public class DimensionType {
   public static final ResourceLocation OVERWORLD_ID = new ResourceLocation("overworld");
   public static final ResourceLocation THE_NETHER_ID = new ResourceLocation("the_nether");
   public static final ResourceLocation THE_END_ID = new ResourceLocation("the_end");
   public static final Codec<DimensionType> CODEC = RecordCodecBuilder.create(
           builder ->      builder.group(
               Codec.LONG
                  .optionalFieldOf("fixed_time")
                  .xmap(
                          type ->      type.<OptionalLong>map(OptionalLong::of).orElseGet(OptionalLong::empty),
                          type -> !     type.isPresent() ? Optional.empty() : Optional.<Long>of(     type.getAsLong())
                  )
                  .forGetter(type -> type.fixedTime),
               Codec.BOOL.fieldOf("has_skylight").forGetter(DimensionType::hasSkyLight),
               Codec.BOOL.fieldOf("has_ceiling").forGetter(DimensionType::getHasCeiling),
               Codec.BOOL.fieldOf("ultrawarm").forGetter(DimensionType::isUltrawarm),
               Codec.BOOL.fieldOf("natural").forGetter(DimensionType::isNatural),
               Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(DimensionType::getCoordinateScale),
               Codec.BOOL.fieldOf("piglin_safe").forGetter(DimensionType::isPiglinSafe),
               Codec.BOOL.fieldOf("bed_works").forGetter(DimensionType::doesBedWork),
               Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(DimensionType::doesRespawnAnchorWorks),
               Codec.BOOL.fieldOf("has_raids").forGetter(DimensionType::isHasRaids),
               Codec.intRange(0, 256).fieldOf("logical_height").forGetter(DimensionType::getLogicalHeight),
               ResourceLocation.CODEC.fieldOf("infiniburn").forGetter(type -> type.infiniburn),
               ResourceLocation.CODEC.fieldOf("effects").orElse(OVERWORLD_ID).forGetter(type -> type.effects),
               Codec.FLOAT.fieldOf("ambient_light").forGetter(type -> type.ambientLight)
            )
            .apply(     builder, DimensionType::new)
   );
   public static final float[] MOON_PHASE_FACTORS = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final RegistryKey<DimensionType> OVERWORLD = RegistryKey.<DimensionType>getOrCreateKey(Registry.DIMENSION_TYPE_KEY, new ResourceLocation("overworld"));
   public static final RegistryKey<DimensionType> THE_NETHER = RegistryKey.<DimensionType>getOrCreateKey(Registry.DIMENSION_TYPE_KEY, new ResourceLocation("the_nether"));
   public static final RegistryKey<DimensionType> THE_END = RegistryKey.<DimensionType>getOrCreateKey(Registry.DIMENSION_TYPE_KEY, new ResourceLocation("the_end"));
   public static final DimensionType OVERWORLD_TYPE = new DimensionType(
      OptionalLong.empty(),
      true,
      false,
      false,
      true,
      1.0,
      false,
      false,
      true,
      false,
      true,
      256,
      ColumnFuzzedBiomeMagnifier.INSTANCE,
      BlockTags.INFINIBURN_OVERWORLD.getName(),
           OVERWORLD_ID,
      0.0F
   );
   public static final DimensionType NETHER_TYPE = new DimensionType(
      OptionalLong.of(18000L),
      false,
      true,
      true,
      false,
      8.0,
      false,
      true,
      false,
      true,
      false,
      128,
      FuzzedBiomeMagnifier.INSTANCE,
      BlockTags.INFINIBURN_NETHER.getName(),
           THE_NETHER_ID,
      0.1F
   );
   public static final DimensionType END_TYPE = new DimensionType(
      OptionalLong.of(6000L),
      false,
      false,
      false,
      false,
      1.0,
      true,
      false,
      false,
      false,
      true,
      256,
      FuzzedBiomeMagnifier.INSTANCE,
      BlockTags.INFINIBURN_END.getName(),
           THE_END_ID,
      0.0F
   );
   public static final RegistryKey<DimensionType> OVERWORLD_CAVES = RegistryKey.<DimensionType>getOrCreateKey(Registry.DIMENSION_TYPE_KEY, new ResourceLocation("overworld_caves"));
   public static final DimensionType OVERWORLD_CAVES_TYPE = new DimensionType(
      OptionalLong.empty(),
      true,
      true,
      false,
      true,
      1.0,
      false,
      false,
      true,
      false,
      true,
      256,
      ColumnFuzzedBiomeMagnifier.INSTANCE,
      BlockTags.INFINIBURN_OVERWORLD.getName(),
           OVERWORLD_ID,
      0.0F
   );
   public static final Codec<Supplier<DimensionType>> DIMENSION_TYPE_CODEC = RegistryKeyCodec.create(Registry.DIMENSION_TYPE_KEY, CODEC);
   private final OptionalLong fixedTime;
   private final boolean hasSkyLight;
   private final boolean hasCeiling;
   private final boolean ultrawarm;
   private final boolean natural;
   private final double coordinateScale;
   private final boolean hasDragonFight;
   private final boolean piglinSafe;
   private final boolean bedWorks;
   private final boolean respawnAnchorWorks;
   private final boolean hasRaids;
   private final int logicalHeight;
   private final IBiomeMagnifier magnifier;
   private final ResourceLocation infiniburn;
   private final ResourceLocation effects;
   private final float ambientLight;
   private final transient float[] ambientWorldLight;

   public DimensionType(
      OptionalLong var1,
      boolean var2,
      boolean var3,
      boolean var4,
      boolean var5,
      double var6,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      int var12,
      ResourceLocation var13,
      ResourceLocation var14,
      float var15
   ) {
      this(var1, var2, var3, var4, var5, var6, false, var8, var9, var10, var11, var12, FuzzedBiomeMagnifier.INSTANCE, var13, var14, var15);
   }

   public DimensionType(
      OptionalLong var1,
      boolean var2,
      boolean var3,
      boolean var4,
      boolean var5,
      double var6,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12,
      int var13,
      IBiomeMagnifier var14,
      ResourceLocation var15,
      ResourceLocation var16,
      float var17
   ) {
      this.fixedTime = var1;
      this.hasSkyLight = var2;
      this.hasCeiling = var3;
      this.ultrawarm = var4;
      this.natural = var5;
      this.coordinateScale = var6;
      this.hasDragonFight = var8;
      this.piglinSafe = var9;
      this.bedWorks = var10;
      this.respawnAnchorWorks = var11;
      this.hasRaids = var12;
      this.logicalHeight = var13;
      this.magnifier = var14;
      this.infiniburn = var15;
      this.effects = var16;
      this.ambientLight = var17;
      this.ambientWorldLight = defaultAmbientLightWorld(var17);
   }

   private static float[] defaultAmbientLightWorld(float light) {
      float[] afloat = new float[16];

      for (int i = 0; i <= 15; ++i)
      {
         float f = (float)i / 15.0F;
         float f1 = f / (4.0F - 3.0F * f);
         afloat[i] = MathHelper.lerp(light, f1, 1.0F);
      }

      return afloat;
   }

   @Deprecated
   public static DataResult<RegistryKey<World>> decodeWorldKey(Dynamic<?> dynamic) {
      Optional<Number> optional = dynamic.asNumber().result();

      if (optional.isPresent())
      {
         int i = optional.get().intValue();

         if (i == -1)
         {
            return DataResult.success(World.THE_NETHER);
         }

         if (i == 0)
         {
            return DataResult.success(World.OVERWORLD);
         }

         if (i == 1)
         {
            return DataResult.success(World.THE_END);
         }
      }

      return World.CODEC.parse(dynamic);
   }

   public static DynamicRegistriesImpl registerTypes(DynamicRegistriesImpl impl) {
      MutableRegistry<DimensionType> mutableregistry = impl.getRegistry(Registry.DIMENSION_TYPE_KEY);
      mutableregistry.register(OVERWORLD, OVERWORLD_TYPE, Lifecycle.stable());
      mutableregistry.register(OVERWORLD_CAVES, OVERWORLD_CAVES_TYPE, Lifecycle.stable());
      mutableregistry.register(THE_NETHER, NETHER_TYPE, Lifecycle.stable());
      mutableregistry.register(THE_END, END_TYPE, Lifecycle.stable());
      return impl;
   }

   private static ChunkGenerator getEndChunkGenerator(Registry<Biome> lookUpRegistryBiome, Registry<DimensionSettings> settingsRegistry, long seed) {
      return new NoiseChunkGenerator(new EndBiomeProvider(lookUpRegistryBiome, seed), seed, () -> settingsRegistry.getOrThrow(DimensionSettings.field_242737_f));
   }

   private static ChunkGenerator getNetherChunkGenerator(Registry<Biome> lookUpRegistryBiome, Registry<DimensionSettings> lookUpRegistryDimensionType, long seed) {
      return new NoiseChunkGenerator(NetherBiomeProviderPreset.DEFAULT_NETHER_PROVIDER_PRESET.build(lookUpRegistryBiome, seed), seed, () -> lookUpRegistryDimensionType.getOrThrow(DimensionSettings.field_242736_e));
   }

   public static SimpleRegistry<Dimension> getDefaultSimpleRegistry(Registry<DimensionType> lookUpRegistryDimensionType, Registry<Biome> lookUpRegistryBiome, Registry<DimensionSettings> lookUpRegistryDimensionSettings, long seed) {
      SimpleRegistry<Dimension> simpleregistry = new SimpleRegistry<>(Registry.DIMENSION_KEY, Lifecycle.experimental());
      simpleregistry.register(Dimension.THE_NETHER, new Dimension(() -> lookUpRegistryDimensionType.getOrThrow(THE_NETHER), getNetherChunkGenerator(lookUpRegistryBiome, lookUpRegistryDimensionSettings, seed)), Lifecycle.stable());
      simpleregistry.register(Dimension.THE_END, new Dimension(() -> lookUpRegistryDimensionType.getOrThrow(THE_END), getEndChunkGenerator(lookUpRegistryBiome, lookUpRegistryDimensionSettings, seed)), Lifecycle.stable());
      return simpleregistry;
   }

   public static double getCoordinateDifference(DimensionType firstType, DimensionType secondType) {
      double d0 = firstType.getCoordinateScale();
      double d1 = secondType.getCoordinateScale();
      return d0 / d1;
   }

   @Deprecated
   public String getSuffix() {
      return this.isSame(END_TYPE) ? "_end" : "";
   }

   public static File getDimensionFolder(RegistryKey<World> dimensionKey, File worldFolder) {
      if (dimensionKey != World.OVERWORLD) {
         if (dimensionKey != World.THE_END) {
            return dimensionKey != World.THE_NETHER
               ? new File(worldFolder, "dimensions/" + dimensionKey.getLocation().getNamespace() + "/" + dimensionKey.getLocation().getPath())
               : new File(worldFolder, "DIM-1");
         } else {
            return new File(worldFolder, "DIM1");
         }
      } else {
         return worldFolder;
      }
   }

   public boolean hasSkyLight() {
      return this.hasSkyLight;
   }

   public boolean getHasCeiling() {
      return this.hasCeiling;
   }

   public boolean isUltrawarm() {
      return this.ultrawarm;
   }

   public boolean isNatural() {
      return this.natural;
   }

   public double getCoordinateScale() {
      return this.coordinateScale;
   }

   public boolean isPiglinSafe() {
      return this.piglinSafe;
   }

   public boolean doesBedWork() {
      return this.bedWorks;
   }

   public boolean doesRespawnAnchorWorks() {
      return this.respawnAnchorWorks;
   }

   public boolean isHasRaids() {
      return this.hasRaids;
   }

   public int getLogicalHeight() {
      return this.logicalHeight;
   }

   public boolean doesHasDragonFight() {
      return this.hasDragonFight;
   }

   public IBiomeMagnifier getMagnifier() {
      return this.magnifier;
   }

   public boolean doesFixedTimeExist() {
      return this.fixedTime.isPresent();
   }

   public float getCelestrialAngleByTime(long dayTime) {
      double d0 = MathHelper.frac((double)this.fixedTime.orElse(dayTime) / 24000.0D - 0.25D);
      double d1 = 0.5D - Math.cos(d0 * Math.PI) / 2.0D;
      return (float)(d0 * 2.0D + d1) / 3.0F;
   }

   public int getMoonPhase(long dayTime) {
      return (int)(dayTime / 24000L % 8L + 8L) % 8;
   }

   public float getAmbientLight(int lightIn) {
      return this.ambientWorldLight[lightIn];
   }

   public ITag<Block> isInfiniBurn() {
      ITag var3 = BlockTags.getCollection().get(this.infiniburn);
      return (ITag<Block>)(var3 == null ? BlockTags.INFINIBURN_OVERWORLD : var3);
   }

   public ResourceLocation getEffects() {
      return this.effects;
   }

   public boolean isSame(DimensionType type) {
      return this == type
         ? true
         : this.hasSkyLight == type.hasSkyLight
            && this.hasCeiling == type.hasCeiling
            && this.ultrawarm == type.ultrawarm
            && this.natural == type.natural
            && this.coordinateScale == type.coordinateScale
            && this.hasDragonFight == type.hasDragonFight
            && this.piglinSafe == type.piglinSafe
            && this.bedWorks == type.bedWorks
            && this.respawnAnchorWorks == type.respawnAnchorWorks
            && this.hasRaids == type.hasRaids
            && this.logicalHeight == type.logicalHeight
            && Float.compare(type.ambientLight, this.ambientLight) == 0
            && this.fixedTime.equals(type.fixedTime)
            && this.magnifier.equals(type.magnifier)
            && this.infiniburn.equals(type.infiniburn)
            && this.effects.equals(type.effects);
   }
}
