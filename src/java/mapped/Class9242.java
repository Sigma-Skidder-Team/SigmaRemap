package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.optifine.Config;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class Class9242 {
   private static String[] field42522;
   public final WorldRenderer field42523;
   public final World field42524;
   public int field42525;
   public int field42526;
   public int field42527;
   public Class8066[] field42528;
   private Map<ChunkPos, Class8836[]> field42529 = new HashMap<ChunkPos, Class8836[]>();

   public Class9242(Class9016 var1, World var2, int var3, WorldRenderer var4) {
      this.field42523 = var4;
      this.field42524 = var2;
      this.method34758(var3);
      this.method34755(var1);
   }

   public void method34755(Class9016 var1) {
      int var4 = this.field42526 * this.field42525 * this.field42527;
      this.field42528 = new Class8066[var4];

      for (int var5 = 0; var5 < this.field42526; var5++) {
         for (int var6 = 0; var6 < this.field42525; var6++) {
            for (int var7 = 0; var7 < this.field42527; var7++) {
               int var8 = this.method34757(var5, var6, var7);
               Class8066[] var10000 = this.field42528;
               var1.getClass();
               var10000[var8] = new Class8066(var1);
               this.field42528[var8].method27712(var5 * 16, var6 * 16, var7 * 16);
               if (Config.method26978() && Config.isRenderRegions()) {
                  this.method34762(this.field42528[var8]);
               }
            }
         }
      }

      for (int var11 = 0; var11 < this.field42528.length; var11++) {
         Class8066 var12 = this.field42528[var11];

         for (int var13 = 0; var13 < Direction.VALUES.length; var13++) {
            Direction var14 = Direction.VALUES[var13];
            BlockPos var9 = var12.method27723(var14);
            Class8066 var10 = this.method34761(var9);
            var12.method27744(var14, var10);
         }
      }
   }

   public void deleteGlResources() {
      for (Class8066 var6 : this.field42528) {
         var6.method27717();
      }

      this.method34763();
   }

   private int method34757(int var1, int var2, int var3) {
      return (var3 * this.field42525 + var2) * this.field42526 + var1;
   }

   public void method34758(int var1) {
      int var4 = var1 * 2 + 1;
      this.field42526 = var4;
      this.field42525 = 16;
      this.field42527 = var4;
   }

   public void method34759(double var1, double var3) {
      int var7 = MathHelper.floor(var1);
      int var8 = MathHelper.floor(var3);

      for (int var9 = 0; var9 < this.field42526; var9++) {
         int var10 = this.field42526 * 16;
         int var11 = var7 - 8 - var10 / 2;
         int var12 = var11 + Math.floorMod(var9 * 16 - var11, var10);

         for (int var13 = 0; var13 < this.field42527; var13++) {
            int var14 = this.field42527 * 16;
            int var15 = var8 - 8 - var14 / 2;
            int var16 = var15 + Math.floorMod(var13 * 16 - var15, var14);

            for (int var17 = 0; var17 < this.field42525; var17++) {
               int var18 = var17 * 16;
               Class8066 var19 = this.field42528[this.method34757(var9, var17, var13)];
               var19.method27712(var12, var18, var16);
            }
         }
      }
   }

   public void method34760(int var1, int var2, int var3, boolean var4) {
      int var7 = Math.floorMod(var1, this.field42526);
      int var8 = Math.floorMod(var2, this.field42525);
      int var9 = Math.floorMod(var3, this.field42527);
      Class8066 var10 = this.field42528[this.method34757(var7, var8, var9)];
      var10.method27719(var4);
   }

   @Nullable
   public Class8066 method34761(BlockPos var1) {
      int var4 = var1.getX() >> 4;
      int var5 = var1.getY() >> 4;
      int var6 = var1.getZ() >> 4;
      if (var5 >= 0 && var5 < this.field42525) {
         var4 = MathHelper.normalizeAngle(var4, this.field42526);
         var6 = MathHelper.normalizeAngle(var6, this.field42527);
         return this.field42528[this.method34757(var4, var5, var6)];
      } else {
         return null;
      }
   }

   private void method34762(Class8066 var1) {
      BlockPos var4 = var1.method27718();
      int var5 = var4.getX() >> 8 << 8;
      int var6 = var4.getZ() >> 8 << 8;
      ChunkPos var7 = new ChunkPos(var5, var6);
      RenderType[] var8 = RenderType.field21819;
      Class8836[] var9 = this.field42529.get(var7);
      if (var9 == null) {
         var9 = new Class8836[var8.length];

         for (int var10 = 0; var10 < var8.length; var10++) {
            var9[var10] = new Class8836(var8[var10]);
         }

         this.field42529.put(var7, var9);
      }

      for (int var13 = 0; var13 < var8.length; var13++) {
         RenderType var11 = var8[var13];
         Class8836 var12 = var9[var13];
         if (var12 != null) {
            var1.method27711(var11).method7309(var12);
         }
      }
   }

   public void method34763() {
      for (ChunkPos var4 : this.field42529.keySet()) {
         Class8836[] var5 = this.field42529.get(var4);

         for (int var6 = 0; var6 < var5.length; var6++) {
            Class8836 var7 = var5[var6];
            if (var7 != null) {
               var7.method31988();
            }

            var5[var6] = null;
         }
      }

      this.field42529.clear();
   }
}
