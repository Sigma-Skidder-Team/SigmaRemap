package net.minecraft.world.chunk.storage;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.Arrays;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.LongArrayNBT;
import net.minecraft.nbt.ShortNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.util.palette.UpgradeData;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.ITickList;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.chunk.*;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.lighting.WorldLightManager;
import net.minecraft.world.server.ServerChunkProvider;
import net.minecraft.world.server.ServerWorldLightManager;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChunkSerializer {
   private static final Logger field45421 = LogManager.getLogger();

   public static ChunkPrimer method38087(ServerWorld var0, TemplateManager var1, Class1653 var2, ChunkPos var3, CompoundNBT var4) {
      ChunkGenerator var7 = var0.getChunkProvider().getChunkGenerator();
      BiomeProvider var8 = var7.getBiomeProvider();
      CompoundNBT var9 = var4.getCompound("Level");
      ChunkPos var10 = new ChunkPos(var9.getInt("xPos"), var9.getInt("zPos"));
      if (!Objects.equals(var3, var10)) {
         field45421.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", var3, var3, var10);
      }

      BiomeContainer var11 = new BiomeContainer(
         var0.func_241828_r().<Biome>getRegistry(Registry.BIOME_KEY), var3, var8, !var9.contains("Biomes", 11) ? null : var9.getIntArray("Biomes")
      );
      UpgradeData var12 = !var9.contains("UpgradeData", 10) ? UpgradeData.field40388 : new UpgradeData(var9.getCompound("UpgradeData"));
      Class6806 var13 = new Class6806<Block>(var0x -> var0x == null || var0x.getDefaultState().isAir(), var3, var9.getList("ToBeTicked", 9));
      Class6806 var14 = new Class6806<Fluid>(var0x -> var0x == null || var0x == Fluids.EMPTY, var3, var9.getList("LiquidsToBeTicked", 9));
      boolean var15 = var9.getBoolean("isLightOn");
      ListNBT var16 = var9.getList("Sections", 10);
      byte var17 = 16;
      ChunkSection[] var18 = new ChunkSection[16];
      boolean var19 = var0.getDimensionType().hasSkyLight();
      ServerChunkProvider var20 = var0.getChunkProvider();
      WorldLightManager var21 = var20.getLightManager();
      if (var15) {
         var21.method609(var3, true);
      }

      for (int var22 = 0; var22 < var16.size(); var22++) {
         CompoundNBT var30 = var16.getCompound(var22);
         byte var25 = var30.getByte("Y");
         if (var30.contains("Palette", 9) && var30.contains("BlockStates", 12)) {
            ChunkSection var27 = new ChunkSection(var25 << 4);
            var27.method21865().method30502(var30.getList("Palette", 10), var30.getLongArray("BlockStates"));
            var27.method21864();
            if (!var27.method21858()) {
               var18[var25] = var27;
            }

            var2.method6679(var3, var27);
         }

         if (var15) {
            if (var30.contains("BlockLight", 7)) {
               var21.method606(LightType.BLOCK, SectionPos.from(var3, var25), new NibbleArray(var30.getByteArray("BlockLight")), true);
            }

            if (var19 && var30.contains("SkyLight", 7)) {
               var21.method606(LightType.SKY, SectionPos.from(var3, var25), new NibbleArray(var30.getByteArray("SkyLight")), true);
            }
         }
      }

      long var23 = var9.getLong("InhabitedTime");
      Class2076 var40 = getChunkStatus(var4);
      Object var43;
      if (var40 != Class2076.field13525) {
         ChunkPrimer var26 = new ChunkPrimer(var3, var12, var18, var13, var14);
         var26.setBiomes(var11);
         var43 = var26;
         var26.setInhabitedTime(var23);
         var26.method7111(ChunkStatus.method34304(var9.getString("Status")));
         if (var26.getStatus().isAtLeast(ChunkStatus.FEATURES)) {
            var26.method7119(var21);
         }

         if (!var15 && var26.getStatus().isAtLeast(ChunkStatus.LIGHT)) {
            for (BlockPos var29 : BlockPos.method8364(var3.getX(), 0, var3.getZ(), var3.getXEnd(), 255, var3.getZEnd())) {
               if (((IChunk)var43).getBlockState(var29).getLightValue() != 0) {
                  var26.method7105(var29);
               }
            }
         }
      } else {
         Object var41;
         if (!var9.contains("TileTicks", 9)) {
            var41 = var13;
         } else {
            var41 = Class6801.<Block>method20722(var9.getList("TileTicks", 10), Registry.BLOCK::getKey, Registry.BLOCK::getOrDefault);
         }

         Object var44;
         if (!var9.contains("LiquidTicks", 9)) {
            var44 = var14;
         } else {
            var44 = Class6801.<Fluid>method20722(var9.getList("LiquidTicks", 10), Registry.FLUID::getKey, Registry.FLUID::getOrDefault);
         }

         var43 = new Chunk(
            var0.method6970(), var3, var11, var12, (ITickList<Block>)var41, (ITickList<Fluid>)var44, var23, var18, var1x -> method38090(var9, var1x)
         );
      }

      ((IChunk)var43).setLight(var15);
      CompoundNBT var42 = var9.getCompound("Heightmaps");
      EnumSet var45 = EnumSet.<Heightmap.Type>noneOf(Heightmap.Type.class);

      for (Heightmap.Type var31 : ((IChunk)var43).getStatus().method34305()) {
         String var32 = var31.method283();
         if (!var42.contains(var32, 12)) {
            var45.add(var31);
         } else {
            ((IChunk)var43).setHeightmap(var31, var42.getLongArray(var32));
         }
      }

      Heightmap.method24577((IChunk)var43, var45);
      CompoundNBT var47 = var9.getCompound("Structures");
      ((IChunk)var43).setStructureStarts(method38092(var1, var47, var0.getSeed()));
      ((IChunk)var43).method7102(method38093(var3, var47));
      if (var9.getBoolean("shouldSave")) {
         ((IChunk)var43).setModified(true);
      }

      ListNBT var48 = var9.getList("PostProcessing", 9);

      for (int var49 = 0; var49 < var48.size(); var49++) {
         ListNBT var33 = var48.getList(var49);

         for (int var34 = 0; var34 < var33.size(); var34++) {
            ((IChunk)var43).addPackedPosition(var33.getShort(var34), var49);
         }
      }

      if (var40 == Class2076.field13525) {
         return new Class1673((Chunk)var43);
      } else {
         ChunkPrimer var50 = (ChunkPrimer)var43;
         ListNBT var51 = var9.getList("Entities", 10);

         for (int var52 = 0; var52 < var51.size(); var52++) {
            var50.method7108(var51.getCompound(var52));
         }

         ListNBT var53 = var9.getList("TileEntities", 10);

         for (int var35 = 0; var35 < var53.size(); var35++) {
            CompoundNBT var36 = var53.getCompound(var35);
            ((IChunk)var43).addTileEntity(var36);
         }

         ListNBT var54 = var9.getList("Lights", 9);

         for (int var55 = 0; var55 < var54.size(); var55++) {
            ListNBT var37 = var54.getList(var55);

            for (int var38 = 0; var38 < var37.size(); var38++) {
               var50.method7104(var37.getShort(var38), var55);
            }
         }

         CompoundNBT var56 = var9.getCompound("CarvingMasks");

         for (String var58 : var56.keySet()) {
            GenerationStageCarving var39 = GenerationStageCarving.valueOf(var58);
            var50.method7118(var39, BitSet.valueOf(var56.getByteArray(var58)));
         }

         return var50;
      }
   }

   public static CompoundNBT method38088(ServerWorld var0, IChunk var1) {
      ChunkPos var4 = var1.getPos();
      CompoundNBT var5 = new CompoundNBT();
      CompoundNBT var6 = new CompoundNBT();
      var5.putInt("DataVersion", SharedConstants.getVersion().getWorldVersion());
      var5.put("Level", var6);
      var6.putInt("xPos", var4.x);
      var6.putInt("zPos", var4.z);
      var6.putLong("LastUpdate", var0.getGameTime());
      var6.putLong("InhabitedTime", var1.getInhabitedTime());
      var6.putString("Status", var1.getStatus().method34298());
      UpgradeData var7 = var1.getUpgradeData();
      if (!var7.method32607()) {
         var6.put("UpgradeData", var7.method32608());
      }

      ChunkSection[] var8 = var1.getSections();
      ListNBT var9 = new ListNBT();
      ServerWorldLightManager var10 = var0.getChunkProvider().getLightManager();
      boolean var11 = var1.hasLight();

      for (int var12 = -1; var12 < 17; var12++) {
         int var13 = var12;
         ChunkSection var14 = Arrays.<ChunkSection>stream(var8)
            .filter(var1x -> var1x != null && var1x.getYLocation() >> 4 == var13)
            .findFirst()
            .orElse(Chunk.field9111);
         NibbleArray var15 = var10.getLightEngine(LightType.BLOCK).method642(SectionPos.from(var4, var13));
         NibbleArray var16 = var10.getLightEngine(LightType.SKY).method642(SectionPos.from(var4, var13));
         if (var14 != Chunk.field9111 || var15 != null || var16 != null) {
            CompoundNBT var17 = new CompoundNBT();
            var17.putByte("Y", (byte)(var13 & 0xFF));
            if (var14 != Chunk.field9111) {
               var14.method21865().method30503(var17, "Palette", "BlockStates");
            }

            if (var15 != null && !var15.method20677()) {
               var17.putByteArray("BlockLight", var15.method20669());
            }

            if (var16 != null && !var16.method20677()) {
               var17.putByteArray("SkyLight", var16.method20669());
            }

            var9.add(var17);
         }
      }

      var6.put("Sections", var9);
      if (var11) {
         var6.putBoolean("isLightOn", true);
      }

      BiomeContainer var22 = var1.getBiomes();
      if (var22 != null) {
         var6.putIntArray("Biomes", var22.method7198());
      }

      ListNBT var23 = new ListNBT();

      for (BlockPos var26 : var1.getTileEntitiesPos()) {
         CompoundNBT var30 = var1.getTileEntityNBT(var26);
         if (var30 != null) {
            var23.add(var30);
         }
      }

      var6.put("TileEntities", var23);
      ListNBT var25 = new ListNBT();
      if (var1.getStatus().method34303() != Class2076.field13525) {
         ChunkPrimer var27 = (ChunkPrimer)var1;
         var25.addAll(var27.method7109());
         var6.put("Lights", method38094(var27.method7103()));
         CompoundNBT var31 = new CompoundNBT();

         for (GenerationStageCarving var20 : GenerationStageCarving.values()) {
            BitSet var21 = var27.method7116(var20);
            if (var21 != null) {
               var31.putByteArray(var20.toString(), var21.toByteArray());
            }
         }

         var6.put("CarvingMasks", var31);
      } else {
         Chunk var28 = (Chunk)var1;
         var28.method7147(false);

         for (int var32 = 0; var32 < var28.method7146().length; var32++) {
            for (Entity var37 : var28.method7146()[var32]) {
               CompoundNBT var39 = new CompoundNBT();
               if (var37.writeUnlessPassenger(var39)) {
                  var28.method7147(true);
                  var25.add(var39);
               }
            }
         }
      }

      var6.put("Entities", var25);
      ITickList var29 = var1.getBlocksToBeTicked();
      if (!(var29 instanceof Class6806)) {
         if (!(var29 instanceof Class6801)) {
            var6.put("TileTicks", var0.getBlockTickScheduler().method20733(var4));
         } else {
            var6.put("TileTicks", ((Class6801)var29).method20721());
         }
      } else {
         var6.put("ToBeTicked", ((Class6806)var29).method20737());
      }

      ITickList var33 = var1.getFluidsToBeTicked();
      if (!(var33 instanceof Class6806)) {
         if (!(var33 instanceof Class6801)) {
            var6.put("LiquidTicks", var0.getPendingFluidTicks().method20733(var4));
         } else {
            var6.put("LiquidTicks", ((Class6801)var33).method20721());
         }
      } else {
         var6.put("LiquidsToBeTicked", ((Class6806)var33).method20737());
      }

      var6.put("PostProcessing", method38094(var1.getPackedPositions()));
      CompoundNBT var36 = new CompoundNBT();

      for (Entry var40 : var1.getHeightmaps()) {
         if (var1.getStatus().method34305().contains(var40.getKey())) {
            var36.put(((Heightmap.Type)var40.getKey()).method283(), new LongArrayNBT(((Heightmap)var40.getValue()).method24583()));
         }
      }

      var6.put("Heightmaps", var36);
      var6.put("Structures", method38091(var4, var1.getStructureStarts(), var1.method7101()));
      return var5;
   }

   public static Class2076 getChunkStatus(CompoundNBT var0) {
      if (var0 != null) {
         ChunkStatus var3 = ChunkStatus.method34304(var0.getCompound("Level").getString("Status"));
         if (var3 != null) {
            return var3.method34303();
         }
      }

      return Class2076.field13524;
   }

   private static void method38090(CompoundNBT var0, Chunk var1) {
      ListNBT var4 = var0.getList("Entities", 10);
      World var5 = var1.method7144();

      for (int var6 = 0; var6 < var4.size(); var6++) {
         CompoundNBT var7 = var4.getCompound(var6);
         EntityType.method33223(var7, var5, var1x -> {
            var1.addEntity(var1x);
            return var1x;
         });
         var1.method7147(true);
      }

      ListNBT var12 = var0.getList("TileEntities", 10);

      for (int var13 = 0; var13 < var12.size(); var13++) {
         CompoundNBT var8 = var12.getCompound(var13);
         boolean var9 = var8.getBoolean("keepPacked");
         if (!var9) {
            BlockPos var10 = new BlockPos(var8.getInt("x"), var8.getInt("y"), var8.getInt("z"));
            TileEntity var11 = TileEntity.method3772(var1.getBlockState(var10), var8);
            if (var11 != null) {
               var1.method7135(var11);
            }
         } else {
            var1.addTileEntity(var8);
         }
      }
   }

   private static CompoundNBT method38091(ChunkPos var0, Map<Structure<?>, StructureStart<?>> var1, Map<Structure<?>, LongSet> var2) {
      CompoundNBT var5 = new CompoundNBT();
      CompoundNBT var6 = new CompoundNBT();

      for (Entry var8 : var1.entrySet()) {
         var6.put(((Structure)var8.getKey()).method11373(), ((StructureStart)var8.getValue()).method17114(var0.x, var0.z));
      }

      var5.put("Starts", var6);
      CompoundNBT var10 = new CompoundNBT();

      for (Entry var9 : var2.entrySet()) {
         var10.put(((Structure)var9.getKey()).method11373(), new LongArrayNBT((LongSet)var9.getValue()));
      }

      var5.put("References", var10);
      return var5;
   }

   private static Map<Structure<?>, StructureStart<?>> method38092(TemplateManager var0, CompoundNBT var1, long var2) {
      HashMap var6 = Maps.newHashMap();
      CompoundNBT var7 = var1.getCompound("Starts");

      for (String var9 : var7.keySet()) {
         String var10 = var9.toLowerCase(Locale.ROOT);
         Structure var11 = (Structure) Structure.field_236365_a_.get(var10);
         if (var11 != null) {
            StructureStart var12 = Structure.method11366(var0, var7.getCompound(var9), var2);
            if (var12 != null) {
               var6.put(var11, var12);
            }
         } else {
            field45421.error("Unknown structure start: {}", var10);
         }
      }

      return var6;
   }

   private static Map<Structure<?>, LongSet> method38093(ChunkPos var0, CompoundNBT var1) {
      HashMap var4 = Maps.newHashMap();
      CompoundNBT var5 = var1.getCompound("References");

      for (String var7 : var5.keySet()) {
         var4.put(Structure.field_236365_a_.get(var7.toLowerCase(Locale.ROOT)), new LongOpenHashSet(Arrays.stream(var5.getLongArray(var7)).filter(var2 -> {
            ChunkPos var6 = new ChunkPos(var2);
            if (var6.getChessboardDistance(var0) <= 8) {
               return true;
            } else {
               field45421.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", var7, var6, var0);
               return false;
            }
         }).toArray()));
      }

      return var4;
   }

   public static ListNBT method38094(ShortList[] var0) {
      ListNBT var3 = new ListNBT();

      for (ShortList var7 : var0) {
         ListNBT var8 = new ListNBT();
         if (var7 != null) {
            ShortListIterator var9 = var7.iterator();

            while (var9.hasNext()) {
               Short var10 = (Short)var9.next();
               var8.add(ShortNBT.valueOf(var10));
            }
         }

         var3.add(var8);
      }

      return var3;
   }
}
