package mapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ReportedException;
import net.minecraft.entity.EntityClassification;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.*;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.WorldGenRegion;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.gen.settings.DimensionStructuresSettings;
import net.minecraft.world.gen.settings.StructureSeparationSettings;
import net.minecraft.world.gen.settings.StructureSpreadSettings;
import net.minecraft.world.server.ServerWorld;

import java.util.BitSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class ChunkGenerator {
   public static final Codec<ChunkGenerator> field_235948_a_ = Registry.CHUNK_GENERATOR_CODEC.dispatchStable(ChunkGenerator::func_230347_a_, Function.identity());
   public final BiomeProvider biomeProvider;
   public final BiomeProvider field_235949_c_;
   private final DimensionStructuresSettings settings;
   private final long field_235950_e_;
   private final List<ChunkPos> field_235951_f_ = Lists.newArrayList();

   public ChunkGenerator(BiomeProvider var1, DimensionStructuresSettings var2) {
      this(var1, var1, var2, 0L);
   }

   public ChunkGenerator(BiomeProvider var1, BiomeProvider var2, DimensionStructuresSettings var3, long var4) {
      this.biomeProvider = var1;
      this.field_235949_c_ = var2;
      this.settings = var3;
      this.field_235950_e_ = var4;
   }

   private void func_235958_g_() {
      if (this.field_235951_f_.isEmpty())
      {
         StructureSpreadSettings structurespreadsettings = this.settings.func_236199_b_();
         if (structurespreadsettings != null && structurespreadsettings.func_236663_c_() != 0)
         {
            List<Biome> list = Lists.newArrayList();

            for (Biome biome : this.biomeProvider.getBiomes())
            {
               if (biome.getGenerationSettings().hasStructure(Structure.STRONGHOLD))
               {
                  list.add(biome);
               }
            }

            int k1 = structurespreadsettings.func_236660_a_();
            int l1 = structurespreadsettings.func_236663_c_();
            int i = structurespreadsettings.func_236662_b_();
            Random random = new Random();
            random.setSeed(this.field_235950_e_);
            double d0 = random.nextDouble() * Math.PI * 2.0;
            int j = 0;
            int k = 0;

            for (int l = 0; l < l1; l++) {
               double d1 = (double)(4 * k1 + k1 * k * 6) + (random.nextDouble() - 0.5D) * (double)k1 * 2.5D;
               int i1 = (int)Math.round(Math.cos(d0) * d1);
               int j1 = (int)Math.round(Math.sin(d0) * d1);

               BlockPos blockpos = this.biomeProvider.findBiomePosition((i1 << 4) + 8, 0, (j1 << 4) + 8, 112, list::contains, random);
               if (blockpos != null) {
                  i1 = blockpos.getX() >> 4;
                  j1 = blockpos.getZ() >> 4;
               }

               this.field_235951_f_.add(new ChunkPos(i1, j1));
               d0 += (Math.PI * 2D) / (double)i;
               ++j;

               if (j == i)
               {
                  ++k;
                  j = 0;
                  i = i + 2 * i / (k + 1);
                  i = Math.min(i, l1 - l);
                  d0 += random.nextDouble() * Math.PI * 2.0D;
               }
            }
         }
      }
   }

   public abstract Codec<? extends ChunkGenerator> func_230347_a_();

   public abstract ChunkGenerator func_230349_a_(long var1);

   public void func_242706_a(Registry<Biome> var1, IChunk var2) {
      ChunkPos var5 = var2.getPos();
      ((ChunkPrimer)var2).setBiomes(new BiomeContainer(var1, var5, this.field_235949_c_));
   }

   public void func_230350_a_(long var1, BiomeManager var3, IChunk var4, GenerationStageCarving var5) {
      BiomeManager biomemanager = var3.copyWithProvider(this.biomeProvider);
      SharedSeedRandom sharedseedrandom = new SharedSeedRandom();

      ChunkPos chunkpos = var4.getPos();
      int j = chunkpos.x;
      int k = chunkpos.z;

      BiomeGenerationSettings biomegenerationsettings = this.biomeProvider.getNoiseBiome(chunkpos.x << 2, 0, chunkpos.z << 2).getGenerationSettings();
      BitSet bitset = ((ChunkPrimer)var4).getOrAddCarvingMask(var5);

      for (int l = j - 8; l <= j + 8; l++) {
         for (int i1 = k - 8; i1 <= k + 8; i1++) {
            List<Supplier<ConfiguredCarver<?>>> list = biomegenerationsettings.getCarvers(var5);
            ListIterator<Supplier<ConfiguredCarver<?>>> listiterator = list.listIterator();

            while (listiterator.hasNext()) {
               int var20 = listiterator.nextIndex();
               ConfiguredCarver<?> configuredcarver = listiterator.next().get();
               sharedseedrandom.setLargeFeatureSeed(var1 + (long)var20, l, i1);
               if (configuredcarver.shouldCarve(sharedseedrandom, l, i1)) {
                  configuredcarver.carveRegion(var4, biomemanager::getBiome, sharedseedrandom, this.func_230356_f_(), l, i1, j, k, bitset);
               }
            }
         }
      }
   }

   @Nullable
   public BlockPos func_235956_a_(ServerWorld serverWorld, Structure<?> structureIn, BlockPos blockPos, int p_235956_4_, boolean p_235956_5_) {
      if (this.biomeProvider.hasStructure(structureIn)) {
         if (structureIn != Structure.STRONGHOLD) {
            StructureSeparationSettings structureseparationsettings = this.settings.func_236197_a_(structureIn);
            return structureseparationsettings == null ? null : structureIn.func_236388_a_(serverWorld, serverWorld.func_241112_a_(), blockPos, p_235956_4_, p_235956_5_, serverWorld.getSeed(), structureseparationsettings);
         } else {
            this.func_235958_g_();
            BlockPos blockpos = null;
            double d0 = Double.MAX_VALUE;
            BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();

            for (ChunkPos chunkpos : this.field_235951_f_) {
               blockpos$mutable.setPos((chunkpos.x << 4) + 8, 32, (chunkpos.z << 4) + 8);
               double d1 = blockpos$mutable.distanceSq(blockPos);
               if (blockpos != null) {
                  if (d1 < d0) {
                     blockpos = new BlockPos(blockpos$mutable);
                     d0 = d1;
                  }
               } else {
                  blockpos = new BlockPos(blockpos$mutable);
                  d0 = d1;
               }
            }

            return blockpos;
         }
      } else {
         return null;
      }
   }

   public void func_230351_a_(WorldGenRegion worldRegion, StructureManager strucMang) {
      int i = worldRegion.getMainChunkX();
      int j = worldRegion.getMainChunkZ();
      int k = i * 16;
      int l = j * 16;
      BlockPos blockpos = new BlockPos(k, 0, l);
      Biome biome = this.biomeProvider.getNoiseBiome((i << 2) + 2, 2, (j << 2) + 2);
      SharedSeedRandom sharedseedrandom = new SharedSeedRandom();
      long i1 = sharedseedrandom.setDecorationSeed(worldRegion.getSeed(), k, l);

      try {
         biome.generateFeatures(strucMang, this, worldRegion, i1, sharedseedrandom, blockpos);
      } catch (Exception e) {
         CrashReport crashreport = CrashReport.makeCrashReport(e, "Biome decoration");
         crashreport.makeCategory("Generation").addDetail("CenterX", i).addDetail("CenterZ", j).addDetail("Seed", i1).addDetail("Biome", biome);
         throw new ReportedException(crashreport);
      }
   }

   public abstract void generateSurface(WorldGenRegion var1, IChunk var2);

   public void func_230354_a_(WorldGenRegion var1) {
   }

   public DimensionStructuresSettings func_235957_b_() {
      return this.settings;
   }

   public int getGroundHeight() {
      return 64;
   }

   public BiomeProvider getBiomeProvider() {
      return this.field_235949_c_;
   }

   public int func_230355_e_() {
      return 256;
   }

   public List<MobSpawnInfo.Spawners> func_230353_a_(Biome var1, StructureManager var2, EntityClassification var3, BlockPos var4) {
      return var1.getMobSpawnInfo().getSpawners(var3);
   }

   public void func_242707_a(DynamicRegistries var1, StructureManager var2, IChunk var3, TemplateManager var4, long var5) {
      ChunkPos chunkpos = var3.getPos();
      Biome biome = this.biomeProvider.getNoiseBiome((chunkpos.x << 2) + 2, 0, (chunkpos.z << 2) + 2);
      this.func_242705_a(StructureFeatures.STRONGHOLD, var1, var2, var3, var4, var5, chunkpos, biome);

      for (Supplier < StructureFeature <? , ? >> var12 : biome.getGenerationSettings().getStructures()) {
         this.func_242705_a(var12.get(), var1, var2, var3, var4, var5, chunkpos, biome);
      }
   }

   private void func_242705_a(StructureFeature<?, ?> var1, DynamicRegistries var2, StructureManager var3, IChunk var4, TemplateManager var5, long var6, ChunkPos var8, Biome var9) {
      StructureStart structurestart = var3.method24341(SectionPos.from(var4.getPos(), 0), var1.field_236268_b_, var4);
      int i = structurestart == null ? 0 : structurestart.getRefCount();
      StructureSeparationSettings structureseparationsettings = this.settings.func_236197_a_(var1.field_236268_b_);
      if (structureseparationsettings != null) {
         StructureStart<?> structurestart1 = var1.method35098(var2, this, this.biomeProvider, var5, var6, var8, var9, i, structureseparationsettings);
         var3.func_235014_a_(SectionPos.from(var4.getPos(), 0), var1.field_236268_b_, structurestart1, var4);
      }
   }

   public void func_235953_a_(ISeedReader var1, StructureManager var2, IChunk var3) {
      int j = var3.getPos().x;
      int k = var3.getPos().z;
      int l = j << 4;
      int i1 = k << 4;
      SectionPos sectionpos = SectionPos.from(var3.getPos(), 0);

      for (int j1 = j - 8; j1 <= j + 8; j1++) {
         for (int k1 = k - 8; k1 <= k + 8; k1++) {
            long l1 = ChunkPos.asLong(j1, k1);

            for (StructureStart<?> structurestart : var1.getChunk(j1, k1).getStructureStarts().values()) {
               try {
                  if (structurestart != StructureStart.field24194 && structurestart.getBoundingBox().intersectsWith(l, i1, l + 15, i1 + 15)) {
                     var2.func_235012_a_(sectionpos, structurestart.getStructure(), l1, var3);
                     DebugPacketSender.sendStructureStart(var1, structurestart);
                  }
               } catch (Exception exception) {
                  CrashReport crashreport = CrashReport.makeCrashReport(exception, "Generating structure reference");
                  CrashReportCategory crashreportcategory = crashreport.makeCategory("Structure");
                  crashreportcategory.addDetail("Id", () -> Registry.STRUCTURE_FEATURE.getKey(structurestart.getStructure()).toString());
                  crashreportcategory.addDetail("Name", () -> structurestart.getStructure().method11373());
                  crashreportcategory.addDetail("Class", () -> structurestart.getStructure().getClass().getCanonicalName());
                  throw new ReportedException(crashreport);
               }
            }
         }
      }
   }

   public abstract void func_230352_b_(IWorld var1, StructureManager var2, IChunk var3);

   public int func_230356_f_() {
      return 63;
   }

   public abstract int getHeight(int var1, int var2, Heightmap.Type var3);

   public abstract IBlockReader func_230348_a_(int var1, int var2);

   public int getNoiseHeight(int var1, int var2, Heightmap.Type var3) {
      return this.getHeight(var1, var2, var3);
   }

   public int getNoiseHeightMinusOne(int var1, int var2, Heightmap.Type var3) {
      return this.getHeight(var1, var2, var3) - 1;
   }

   public boolean func_235952_a_(ChunkPos var1) {
      this.func_235958_g_();
      return this.field_235951_f_.contains(var1);
   }

   static {
      Registry.register(Registry.CHUNK_GENERATOR_CODEC, "noise", NoiseChunkGenerator.field_236079_d_);
      Registry.register(Registry.CHUNK_GENERATOR_CODEC, "flat", FlatChunkGenerator.field_236069_d_);
      Registry.register(Registry.CHUNK_GENERATOR_CODEC, "debug", DebugChunkGenerator.field_236066_e_);
   }
}
