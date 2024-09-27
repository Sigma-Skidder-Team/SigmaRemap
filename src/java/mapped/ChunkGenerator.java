package mapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ServerWorld;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class ChunkGenerator {
   public static final Codec<ChunkGenerator> field24984 = Registry.field16136.dispatchStable(ChunkGenerator::method17790, Function.identity());
   public final BiomeProvider field24985;
   public final BiomeProvider field24986;
   private final Class9763 field24987;
   private final long field24988;
   private final List<ChunkPos> field24989 = Lists.newArrayList();

   public ChunkGenerator(BiomeProvider var1, Class9763 var2) {
      this(var1, var1, var2, 0L);
   }

   public ChunkGenerator(BiomeProvider var1, BiomeProvider var2, Class9763 var3, long var4) {
      this.field24985 = var1;
      this.field24986 = var2;
      this.field24987 = var3;
      this.field24988 = var4;
   }

   private void method17817() {
      if (this.field24989.isEmpty()) {
         Class9245 var3 = this.field24987.method38382();
         if (var3 != null && var3.method34769() != 0) {
            ArrayList var4 = Lists.newArrayList();

            for (Biome var6 : this.field24985.method7201()) {
               if (var6.method32507().method24277(Structure.field18067)) {
                  var4.add(var6);
               }
            }

            int var19 = var3.method34767();
            int var20 = var3.method34769();
            int var7 = var3.method34768();
            Random var8 = new Random();
            var8.setSeed(this.field24988);
            double var9 = var8.nextDouble() * Math.PI * 2.0;
            int var11 = 0;
            int var12 = 0;

            for (int var13 = 0; var13 < var20; var13++) {
               double var14 = (double)(4 * var19 + var19 * var12 * 6) + (var8.nextDouble() - 0.5) * (double)var19 * 2.5;
               int var16 = (int)Math.round(Math.cos(var9) * var14);
               int var17 = (int)Math.round(Math.sin(var9) * var14);
               BlockPos var18 = this.field24985.method7203((var16 << 4) + 8, 0, (var17 << 4) + 8, 112, var4::contains, var8);
               if (var18 != null) {
                  var16 = var18.getX() >> 4;
                  var17 = var18.getZ() >> 4;
               }

               this.field24989.add(new ChunkPos(var16, var17));
               var9 += (Math.PI * 2) / (double)var7;
               if (++var11 == var7) {
                  var12++;
                  var11 = 0;
                  var7 += 2 * var7 / (var12 + 1);
                  var7 = Math.min(var7, var20 - var13);
                  var9 += var8.nextDouble() * Math.PI * 2.0;
               }
            }
         }
      }
   }

   public abstract Codec<? extends ChunkGenerator> method17790();

   public abstract ChunkGenerator method17791(long var1);

   public void method17818(Registry<Biome> var1, IChunk var2) {
      ChunkPos var5 = var2.getPos();
      ((Class1672)var2).method7110(new BiomeContainer(var1, var5, this.field24986));
   }

   public void method17819(long var1, BiomeManager var3, IChunk var4, Class97 var5) {
      BiomeManager var8 = var3.copyWithProvider(this.field24985);
      Class2420 var9 = new Class2420();
      byte var10 = 8;
      ChunkPos var11 = var4.getPos();
      int var12 = var11.x;
      int var13 = var11.z;
      Class7478 var14 = this.field24985.getNoiseBiome(var11.x << 2, 0, var11.z << 2).method32507();
      BitSet var15 = ((Class1672)var4).method7117(var5);

      for (int var16 = var12 - 8; var16 <= var12 + 8; var16++) {
         for (int var17 = var13 - 8; var17 <= var13 + 8; var17++) {
            List<Supplier<Class6815<?>>> var18 = var14.method24276(var5);
            ListIterator<Supplier<Class6815<?>>> var19 = var18.listIterator();

            while (var19.hasNext()) {
               int var20 = var19.nextIndex();
               Class6815<?> var21 = var19.next().get();
               var9.method10373(var1 + (long)var20, var16, var17);
               if (var21.method20776(var9, var16, var17)) {
                  var21.method20777(var4, var8::getBiome, var9, this.method17807(), var16, var17, var12, var13, var15);
               }
            }
         }
      }
   }

   @Nullable
   public BlockPos method17820(ServerWorld var1, Structure<?> var2, BlockPos var3, int var4, boolean var5) {
      if (this.field24985.method7205(var2)) {
         if (var2 != Structure.field18067) {
            Class8483 var16 = this.field24987.method38381(var2);
            return var16 != null ? var2.method11369(var1, var1.method6893(), var3, var4, var5, var1.method6967(), var16) : null;
         } else {
            this.method17817();
            BlockPos var8 = null;
            double var9 = Double.MAX_VALUE;
            BlockPos.Mutable var11 = new BlockPos.Mutable();

            for (ChunkPos var13 : this.field24989) {
               var11.method8372((var13.x << 4) + 8, 32, (var13.z << 4) + 8);
               double var14 = var11.method8318(var3);
               if (var8 != null) {
                  if (var14 < var9) {
                     var8 = new BlockPos(var11);
                     var9 = var14;
                  }
               } else {
                  var8 = new BlockPos(var11);
                  var9 = var14;
               }
            }

            return var8;
         }
      } else {
         return null;
      }
   }

   public void method17821(Class1691 var1, Class7480 var2) {
      int var5 = var1.method7241();
      int var6 = var1.method7242();
      int var7 = var5 * 16;
      int var8 = var6 * 16;
      BlockPos var9 = new BlockPos(var7, 0, var8);
      Biome var10 = this.field24985.getNoiseBiome((var5 << 2) + 2, 2, (var6 << 2) + 2);
      Class2420 var11 = new Class2420();
      long var12 = var11.method10371(var1.method6967(), var7, var8);

      try {
         var10.method32508(var2, this, var1, var12, var11, var9);
      } catch (Exception var16) {
         CrashReport var15 = CrashReport.makeCrashReport(var16, "Biome decoration");
         var15.makeCategory("Generation").addDetail("CenterX", var5).addDetail("CenterZ", var6).addDetail("Seed", var12).addDetail("Biome", var10);
         throw new ReportedException(var15);
      }
   }

   public abstract void method17801(Class1691 var1, IChunk var2);

   public void method17809(Class1691 var1) {
   }

   public Class9763 method17822() {
      return this.field24987;
   }

   public int method17823() {
      return 64;
   }

   public BiomeProvider method17824() {
      return this.field24986;
   }

   public int method17806() {
      return 256;
   }

   public List<Class6692> method17808(Biome var1, Class7480 var2, Class179 var3, BlockPos var4) {
      return var1.method32499().method31968(var3);
   }

   public void method17825(DynamicRegistries var1, Class7480 var2, IChunk var3, TemplateManager var4, long var5) {
      ChunkPos var9 = var3.getPos();
      Biome var10 = this.field24985.getNoiseBiome((var9.x << 2) + 2, 0, (var9.z << 2) + 2);
      this.method17826(Class9438.field43844, var1, var2, var3, var4, var5, var9, var10);

      for (Supplier var12 : var10.method32507().method24278()) {
         this.method17826((Class9300<?, ?>)var12.get(), var1, var2, var3, var4, var5, var9, var10);
      }
   }

   private void method17826(Class9300<?, ?> var1, DynamicRegistries var2, Class7480 var3, IChunk var4, TemplateManager var5, long var6, ChunkPos var8, Biome var9) {
      StructureStart var12 = var3.method24341(Class2002.method8391(var4.getPos(), 0), var1.field43174, var4);
      int var13 = var12 == null ? 0 : var12.method17123();
      Class8483 var14 = this.field24987.method38381(var1.field43174);
      if (var14 != null) {
         StructureStart var15 = var1.method35098(var2, this, this.field24985, var5, var6, var8, var9, var13, var14);
         var3.method24342(Class2002.method8391(var4.getPos(), 0), var1.field43174, var15, var4);
      }
   }

   public void method17827(ISeedReader var1, Class7480 var2, IChunk var3) {
      byte var6 = 8;
      int var7 = var3.getPos().x;
      int var8 = var3.getPos().z;
      int var9 = var7 << 4;
      int var10 = var8 << 4;
      Class2002 var11 = Class2002.method8391(var3.getPos(), 0);

      for (int var12 = var7 - 8; var12 <= var7 + 8; var12++) {
         for (int var13 = var8 - 8; var13 <= var8 + 8; var13++) {
            long var14 = ChunkPos.asLong(var12, var13);

            for (StructureStart var17 : var1.getChunk(var12, var13).getStructureStarts().values()) {
               try {
                  if (var17 != StructureStart.field24194 && var17.method17110().method38391(var9, var10, var9 + 15, var10 + 15)) {
                     var2.method24343(var11, var17.method17125(), var14, var3);
                     Class7393.method23619(var1, var17);
                  }
               } catch (Exception var21) {
                  CrashReport var19 = CrashReport.makeCrashReport(var21, "Generating structure reference");
                  CrashReportCategory var20 = var19.makeCategory("Structure");
                  var20.addDetail("Id", () -> Registry.field16114.getKey(var17.method17125()).toString());
                  var20.addDetail("Name", () -> var17.method17125().method11373());
                  var20.addDetail("Class", () -> var17.method17125().getClass().getCanonicalName());
                  throw new ReportedException(var19);
               }
            }
         }
      }
   }

   public abstract void method17803(Class1660 var1, Class7480 var2, IChunk var3);

   public int method17807() {
      return 63;
   }

   public abstract int method17797(int var1, int var2, Heightmap.Type var3);

   public abstract IBlockReader method17798(int var1, int var2);

   public int method17828(int var1, int var2, Heightmap.Type var3) {
      return this.method17797(var1, var2, var3);
   }

   public int method17829(int var1, int var2, Heightmap.Type var3) {
      return this.method17797(var1, var2, var3) - 1;
   }

   public boolean method17830(ChunkPos var1) {
      this.method17817();
      return this.field24989.contains(var1);
   }

   static {
      Registry.<Codec<? extends ChunkGenerator>>register(Registry.field16136, "noise", NoiseChunkGenerator.field24963);
      Registry.<Codec<? extends ChunkGenerator>>register(Registry.field16136, "flat", Class5648.field24998);
      Registry.<Codec<? extends ChunkGenerator>>register(Registry.field16136, "debug", Class5647.field24991);
   }
}
