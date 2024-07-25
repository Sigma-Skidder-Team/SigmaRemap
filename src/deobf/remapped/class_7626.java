package remapped;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class class_7626 {
   private static String[] field_38809;
   public final WorldRenderer field_38811;
   public final World field_38808;
   public int field_38812;
   public int field_38810;
   public int field_38813;
   public class_3511[] field_38807;
   private Map<class_2034, class_6076[]> field_38806 = new HashMap<class_2034, class_6076[]>();

   public class_7626(class_6705 var1, World var2, int var3, WorldRenderer var4) {
      this.field_38811 = var4;
      this.field_38808 = var2;
      this.method_34570(var3);
      this.method_34564(var1);
   }

   public void method_34564(class_6705 var1) {
      int var4 = this.field_38810 * this.field_38812 * this.field_38813;
      this.field_38807 = new class_3511[var4];

      for (int var5 = 0; var5 < this.field_38810; var5++) {
         for (int var6 = 0; var6 < this.field_38812; var6++) {
            for (int var7 = 0; var7 < this.field_38813; var7++) {
               int var8 = this.method_34567(var5, var6, var7);
               class_3511[] var10000 = this.field_38807;
               var1.getClass();
               var10000[var8] = new class_3511(var1);
               this.field_38807[var8].method_16163(var5 * 16, var6 * 16, var7 * 16);
               if (Config.method_14407() && Config.method_14351()) {
                  this.method_34562(this.field_38807[var8]);
               }
            }
         }
      }

      for (int var11 = 0; var11 < this.field_38807.length; var11++) {
         class_3511 var12 = this.field_38807[var11];

         for (int var13 = 0; var13 < Direction.field_803.length; var13++) {
            Direction var14 = Direction.field_803[var13];
            BlockPos var9 = var12.method_16143(var14);
            class_3511 var10 = this.method_34563(var9);
            var12.method_16139(var14, var10);
         }
      }
   }

   public void method_34568() {
      for (class_3511 var6 : this.field_38807) {
         var6.method_16167();
      }

      this.method_34565();
   }

   private int method_34567(int var1, int var2, int var3) {
      return (var3 * this.field_38812 + var2) * this.field_38810 + var1;
   }

   public void method_34570(int var1) {
      int var4 = var1 * 2 + 1;
      this.field_38810 = var4;
      this.field_38812 = 16;
      this.field_38813 = var4;
   }

   public void method_34566(double var1, double var3) {
      int var7 = class_9299.method_42847(var1);
      int var8 = class_9299.method_42847(var3);

      for (int var9 = 0; var9 < this.field_38810; var9++) {
         int var10 = this.field_38810 * 16;
         int var11 = var7 - 8 - var10 / 2;
         int var12 = var11 + Math.floorMod(var9 * 16 - var11, var10);

         for (int var13 = 0; var13 < this.field_38813; var13++) {
            int var14 = this.field_38813 * 16;
            int var15 = var8 - 8 - var14 / 2;
            int var16 = var15 + Math.floorMod(var13 * 16 - var15, var14);

            for (int var17 = 0; var17 < this.field_38812; var17++) {
               int var18 = var17 * 16;
               class_3511 var19 = this.field_38807[this.method_34567(var9, var17, var13)];
               var19.method_16163(var12, var18, var16);
            }
         }
      }
   }

   public void method_34569(int var1, int var2, int var3, boolean var4) {
      int var7 = Math.floorMod(var1, this.field_38810);
      int var8 = Math.floorMod(var2, this.field_38812);
      int var9 = Math.floorMod(var3, this.field_38813);
      class_3511 var10 = this.field_38807[this.method_34567(var7, var8, var9)];
      var10.method_16169(var4);
   }

   @Nullable
   public class_3511 method_34563(BlockPos var1) {
      int var4 = var1.method_12173() >> 4;
      int var5 = var1.method_12165() >> 4;
      int var6 = var1.method_12185() >> 4;
      if (var5 >= 0 && var5 < this.field_38812) {
         var4 = class_9299.method_42788(var4, this.field_38810);
         var6 = class_9299.method_42788(var6, this.field_38813);
         return this.field_38807[this.method_34567(var4, var5, var6)];
      } else {
         return null;
      }
   }

   private void method_34562(class_3511 var1) {
      BlockPos var4 = var1.method_16189();
      int var5 = var4.method_12173() >> 8 << 8;
      int var6 = var4.method_12185() >> 8 << 8;
      class_2034 var7 = new class_2034(var5, var6);
      RenderLayer[] var8 = RenderLayer.field_17580;
      class_6076[] var9 = this.field_38806.get(var7);
      if (var9 == null) {
         var9 = new class_6076[var8.length];

         for (int var10 = 0; var10 < var8.length; var10++) {
            var9[var10] = new class_6076(var8[var10]);
         }

         this.field_38806.put(var7, var9);
      }

      for (int var13 = 0; var13 < var8.length; var13++) {
         RenderLayer var11 = var8[var13];
         class_6076 var12 = var9[var13];
         if (var12 != null) {
            var1.method_16180(var11).method_36287(var12);
         }
      }
   }

   public void method_34565() {
      for (class_2034 var4 : this.field_38806.keySet()) {
         class_6076[] var5 = this.field_38806.get(var4);

         for (int var6 = 0; var6 < var5.length; var6++) {
            class_6076 var7 = var5[var6];
            if (var7 != null) {
               var7.method_27833();
            }

            var5[var6] = null;
         }
      }

      this.field_38806.clear();
   }
}
