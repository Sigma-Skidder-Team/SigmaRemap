package net.minecraft.util.palette;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkSection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UpgradeData {
   private static final Logger field40387 = LogManager.getLogger();
   public static final UpgradeData field40388 = new UpgradeData();
   private static final Class1976[] field40389 = Class1976.values();
   private final EnumSet<Class1976> field40390 = EnumSet.<Class1976>noneOf(Class1976.class);
   private final int[][] field40391 = new int[16][];
   private static final Map<Block, Class2234> field40392 = new IdentityHashMap<Block, Class2234>();
   private static final Set<Class2234> field40393 = Sets.newHashSet();

   private UpgradeData() {
   }

   public UpgradeData(CompoundNBT var1) {
      this();
      if (var1.contains("Indices", 10)) {
         CompoundNBT var4 = var1.getCompound("Indices");

         for (int var5 = 0; var5 < this.field40391.length; var5++) {
            String var6 = String.valueOf(var5);
            if (var4.contains(var6, 11)) {
               this.field40391[var5] = var4.getIntArray(var6);
            }
         }
      }

      int var9 = var1.getInt("Sides");

      for (Class1976 var8 : Class1976.values()) {
         if ((var9 & 1 << var8.ordinal()) != 0) {
            this.field40390.add(var8);
         }
      }
   }

   public void method32603(Chunk var1) {
      this.method32606(var1);

      for (Class1976 var7 : field40389) {
         method32604(var1, var7);
      }

      World var8 = var1.method7144();
      field40393.forEach(var1x -> var1x.method8971(var8));
   }

   private static void method32604(Chunk var0, Class1976 var1) {
      World var4 = var0.method7144();
      if (var0.getUpgradeData().field40390.remove(var1)) {
         Set var5 = var1.method8262();
         boolean var6 = false;
         byte var7 = 15;
         boolean var8 = var5.contains(Direction.EAST);
         boolean var9 = var5.contains(Direction.WEST);
         boolean var10 = var5.contains(Direction.SOUTH);
         boolean var11 = var5.contains(Direction.NORTH);
         boolean var12 = var5.size() == 1;
         ChunkPos var13 = var0.getPos();
         int var14 = var13.getX() + (!var12 || !var11 && !var10 ? (!var9 ? 15 : 0) : 1);
         int var15 = var13.getX() + (!var12 || !var11 && !var10 ? (!var9 ? 15 : 0) : 14);
         int var16 = var13.getZ() + (!var12 || !var8 && !var9 ? (!var11 ? 15 : 0) : 1);
         int var17 = var13.getZ() + (!var12 || !var8 && !var9 ? (!var11 ? 15 : 0) : 14);
         Direction[] var18 = Direction.values();
         BlockPos.Mutable var19 = new BlockPos.Mutable();

         for (BlockPos var21 : BlockPos.method8364(var14, 0, var16, var15, var4.method7034() - 1, var17)) {
            BlockState var22 = var4.getBlockState(var21);
            BlockState var23 = var22;

            for (Direction var27 : var18) {
               var19.method8377(var21, var27);
               var23 = method32605(var23, var27, var4, var21, var19);
            }

            Block.method11543(var22, var23, var4, var21, 18);
         }
      }
   }

   private static BlockState method32605(BlockState var0, Direction var1, Class1660 var2, BlockPos var3, BlockPos var4) {
      return field40392.getOrDefault(var0.getBlock(), Class2230.field14619).method8970(var0, var1, var2.getBlockState(var4), var2, var3, var4);
   }

   private void method32606(Chunk var1) {
      BlockPos.Mutable var4 = new BlockPos.Mutable();
      BlockPos.Mutable var5 = new BlockPos.Mutable();
      ChunkPos var6 = var1.getPos();
      World var7 = var1.method7144();

      for (int var8 = 0; var8 < 16; var8++) {
         ChunkSection var9 = var1.getSections()[var8];
         int[] var10 = this.field40391[var8];
         this.field40391[var8] = null;
         if (var9 != null && var10 != null && var10.length > 0) {
            Direction[] var11 = Direction.values();
            Class8556 var12 = var9.method21865();

            for (int var16 : var10) {
               int var17 = var16 & 15;
               int var18 = var16 >> 8 & 15;
               int var19 = var16 >> 4 & 15;
               var4.method8372(var6.getX() + var17, (var8 << 4) + var18, var6.getZ() + var19);
               BlockState var20 = (BlockState)var12.method30499(var16);
               BlockState var21 = var20;

               for (Direction var25 : var11) {
                  var5.method8377(var4, var25);
                  if (var4.getX() >> 4 == var6.x && var4.getZ() >> 4 == var6.z) {
                     var21 = method32605(var21, var25, var7, var4, var5);
                  }
               }

               Block.method11543(var20, var21, var7, var4, 18);
            }
         }
      }

      for (int var26 = 0; var26 < this.field40391.length; var26++) {
         if (this.field40391[var26] != null) {
            field40387.warn("Discarding update data for section {} for chunk ({} {})", var26, var6.x, var6.z);
         }

         this.field40391[var26] = null;
      }
   }

   public boolean method32607() {
      for (int[] var6 : this.field40391) {
         if (var6 != null) {
            return false;
         }
      }

      return this.field40390.isEmpty();
   }

   public CompoundNBT method32608() {
      CompoundNBT var3 = new CompoundNBT();
      CompoundNBT var4 = new CompoundNBT();

      for (int var5 = 0; var5 < this.field40391.length; var5++) {
         String var6 = String.valueOf(var5);
         if (this.field40391[var5] != null && this.field40391[var5].length != 0) {
            var4.method111(var6, this.field40391[var5]);
         }
      }

      if (!var4.method134()) {
         var3.put("Indices", var4);
      }

      int var8 = 0;

      for (Class1976 var7 : this.field40390) {
         var8 |= 1 << var7.ordinal();
      }

      var3.method100("Sides", (byte)var8);
      return var3;
   }

   // $VF: synthetic method
   public static Map method32610() {
      return field40392;
   }

   // $VF: synthetic method
   public static Set method32611() {
      return field40393;
   }
}
