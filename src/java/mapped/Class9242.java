package mapped;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class Class9242 {
   private static String[] field42522;
   public final Class264 field42523;
   public final World field42524;
   public int field42525;
   public int field42526;
   public int field42527;
   public Class8066[] field42528;
   private Map<Class7481, Class8836[]> field42529 = new HashMap<Class7481, Class8836[]>();

   public Class9242(Class9016 var1, World var2, int var3, Class264 var4) {
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
               if (Class7944.method26978() && Class7944.method26977()) {
                  this.method34762(this.field42528[var8]);
               }
            }
         }
      }

      for (int var11 = 0; var11 < this.field42528.length; var11++) {
         Class8066 var12 = this.field42528[var11];

         for (int var13 = 0; var13 < Direction.field685.length; var13++) {
            Direction var14 = Direction.field685[var13];
            BlockPos var9 = var12.method27723(var14);
            Class8066 var10 = this.method34761(var9);
            var12.method27744(var14, var10);
         }
      }
   }

   public void method34756() {
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
      int var7 = MathHelper.method37769(var1);
      int var8 = MathHelper.method37769(var3);

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
      int var4 = var1.method8304() >> 4;
      int var5 = var1.getY() >> 4;
      int var6 = var1.method8306() >> 4;
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
      int var5 = var4.method8304() >> 8 << 8;
      int var6 = var4.method8306() >> 8 << 8;
      Class7481 var7 = new Class7481(var5, var6);
      Class4520[] var8 = Class4520.field21819;
      Class8836[] var9 = this.field42529.get(var7);
      if (var9 == null) {
         var9 = new Class8836[var8.length];

         for (int var10 = 0; var10 < var8.length; var10++) {
            var9[var10] = new Class8836(var8[var10]);
         }

         this.field42529.put(var7, var9);
      }

      for (int var13 = 0; var13 < var8.length; var13++) {
         Class4520 var11 = var8[var13];
         Class8836 var12 = var9[var13];
         if (var12 != null) {
            var1.method27711(var11).method7309(var12);
         }
      }
   }

   public void method34763() {
      for (Class7481 var4 : this.field42529.keySet()) {
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