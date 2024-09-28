package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkSection;
import net.optifine.Config;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class Class8597 {
   private static String[] field38677;
   public static final int field38678 = 63;
   public static final Direction[][] field38679 = method30745(false);
   public static final Direction[][] field38680 = method30745(true);
   private static int field38681 = 0;
   private static int field38682 = -1;
   private static int field38683 = 16;
   private static World field38684 = null;
   private static int field38685 = Integer.MIN_VALUE;
   private static int field38686 = Integer.MIN_VALUE;

   public static int method30743(World var0, Entity var1, int var2) {
      int var5 = MathHelper.floor(var1.getPosX()) >> 4;
      int var6 = MathHelper.floor(var1.getPosY()) >> 4;
      int var7 = MathHelper.floor(var1.getPosZ()) >> 4;
      var6 = Config.method26830(var6, 0, 15);
      Chunk var8 = var0.getChunk(var5, var7);
      int var9 = var5 - var2;
      int var10 = var5 + var2;
      int var11 = var7 - var2;
      int var12 = var7 + var2;
      if (var0 != field38684 || var5 != field38685 || var7 != field38686) {
         field38681 = 0;
         field38683 = 16;
         field38684 = var0;
         field38685 = var5;
         field38686 = var7;
      }

      if (field38681 == 0) {
         field38682 = -1;
      }

      int var13 = field38682;
      switch (field38681) {
         case 0:
            var10 = var5;
            var12 = var7;
            break;
         case 1:
            var9 = var5;
            var12 = var7;
            break;
         case 2:
            var10 = var5;
            var11 = var7;
            break;
         case 3:
            var9 = var5;
            var11 = var7;
      }

      for (int var14 = var9; var14 < var10; var14++) {
         for (int var15 = var11; var15 < var12; var15++) {
            Chunk var16 = var0.getChunk(var14, var15);
            if (!var16.isEmpty()) {
               ChunkSection[] var17 = var16.getSections();

               for (int var18 = var17.length - 1; var18 > var13; var18--) {
                  ChunkSection var19 = var17[var18];
                  if (var19 != null && !var19.method21858()) {
                     if (var18 > var13) {
                        var13 = var18;
                     }
                     break;
                  }
               }

               try {
                  Map<BlockPos, TileEntity> var24 = var16.method7145();
                  if (!var24.isEmpty()) {
                     for (BlockPos var20 : var24.keySet()) {
                        int var21 = var20.getY() >> 4;
                        if (var21 > var13) {
                           var13 = var21;
                        }
                     }
                  }
               } catch (ConcurrentModificationException var22) {
               }

               Class51[] var25 = var16.method7146();

               for (int var27 = var25.length - 1; var27 > var13; var27--) {
                  Class51 var28 = var25[var27];
                  if (!var28.isEmpty() && (var16 != var8 || var27 != var6 || var28.size() != 1)) {
                     if (var27 > var13) {
                        var13 = var27;
                     }
                     break;
                  }
               }
            }
         }
      }

      if (field38681 < 3) {
         field38682 = var13;
         var13 = field38683;
      } else {
         field38683 = var13;
         field38682 = -1;
      }

      field38681 = (field38681 + 1) % 4;
      return var13 << 4;
   }

   public static boolean method30744() {
      return field38681 == 0;
   }

   private static Direction[][] method30745(boolean var0) {
      byte var3 = 64;
      Direction[][] var4 = new Direction[var3][];

      for (int var5 = 0; var5 < var3; var5++) {
         ArrayList<Direction> var6 = new ArrayList();

         for (int var7 = 0; var7 < Direction.VALUES.length; var7++) {
            Direction var8 = Direction.VALUES[var7];
            Direction var9 = !var0 ? var8 : var8.getOpposite();
            int var10 = 1 << var9.ordinal();
            if ((var5 & var10) != 0) {
               var6.add(var8);
            }
         }

         Direction[] var11 = var6.toArray(new Direction[var6.size()]);
         var4[var5] = var11;
      }

      return var4;
   }

   public static Direction[] method30746(int var0) {
      int var3 = ~var0 & 63;
      return field38680[var3];
   }

   public static void method30747() {
      field38684 = null;
   }
}
