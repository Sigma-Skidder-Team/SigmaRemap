package mapped;

import java.util.List;
import java.util.Random;

public class Class4172 extends Class4167 {
   private static String[] field20434;

   public Class4172(int var1, Class9764 var2, Direction var3) {
      super(Class7792.field33439, var1);
      this.method12939(var3);
      this.field20444 = var2;
   }

   public Class4172(Class8761 var1, Class39 var2) {
      super(Class7792.field33439, var2);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      this.method12901((Class4175)var1, var2, var3, 5, 3, true);
      this.method12901((Class4175)var1, var2, var3, 5, 11, true);
   }

   public static Class4172 method12909(List<Class4178> var0, int var1, int var2, int var3, Direction var4, int var5) {
      Class9764 var8 = Class9764.method38388(var1, var2, var3, -5, -3, 0, 13, 14, 13, var4);
      return method12904(var8) && Class4178.method12918(var0, var8) == null ? new Class4172(var5, var8, var4) : null;
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, Class5646 var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      this.method12927(var1, var5, 0, 3, 0, 12, 4, 12, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 0, 5, 0, 12, 13, 12, Blocks.AIR.method11579(), Blocks.AIR.method11579(), false);
      this.method12927(var1, var5, 0, 5, 0, 1, 12, 12, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 11, 5, 0, 12, 12, 12, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 2, 5, 11, 4, 12, 12, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 8, 5, 11, 10, 12, 12, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 5, 9, 11, 7, 12, 12, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 2, 5, 0, 4, 12, 1, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 8, 5, 0, 10, 12, 1, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 5, 9, 0, 7, 12, 1, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 2, 11, 2, 10, 12, 10, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      Class7380 var10 = Blocks.field36643
         .method11579()
         .method23465(Class3239.field18683, Boolean.valueOf(true))
         .method23465(Class3239.field18681, Boolean.valueOf(true));
      Class7380 var11 = Blocks.field36643
         .method11579()
         .method23465(Class3239.field18680, Boolean.valueOf(true))
         .method23465(Class3239.field18682, Boolean.valueOf(true));
      Class7380 var12 = var11.method23465(Class3239.field18683, Boolean.valueOf(true));
      Class7380 var13 = var11.method23465(Class3239.field18681, Boolean.valueOf(true));

      for (int var14 = 1; var14 <= 11; var14 += 2) {
         this.method12927(var1, var5, var14, 10, 0, var14, 11, 0, var10, var10, false);
         this.method12927(var1, var5, var14, 10, 12, var14, 11, 12, var10, var10, false);
         this.method12927(var1, var5, 0, 10, var14, 0, 11, var14, var11, var11, false);
         this.method12927(var1, var5, 12, 10, var14, 12, 11, var14, var11, var11, false);
         this.method12923(var1, Blocks.field36642.method11579(), var14, 13, 0, var5);
         this.method12923(var1, Blocks.field36642.method11579(), var14, 13, 12, var5);
         this.method12923(var1, Blocks.field36642.method11579(), 0, 13, var14, var5);
         this.method12923(var1, Blocks.field36642.method11579(), 12, 13, var14, var5);
         if (var14 != 11) {
            this.method12923(var1, var10, var14 + 1, 13, 0, var5);
            this.method12923(var1, var10, var14 + 1, 13, 12, var5);
            this.method12923(var1, var11, 0, 13, var14 + 1, var5);
            this.method12923(var1, var11, 12, 13, var14 + 1, var5);
         }
      }

      this.method12923(
         var1,
         Blocks.field36643.method11579().method23465(Class3239.field18680, Boolean.valueOf(true)).method23465(Class3239.field18681, Boolean.valueOf(true)),
         0,
         13,
         0,
         var5
      );
      this.method12923(
         var1,
         Blocks.field36643.method11579().method23465(Class3239.field18682, Boolean.valueOf(true)).method23465(Class3239.field18681, Boolean.valueOf(true)),
         0,
         13,
         12,
         var5
      );
      this.method12923(
         var1,
         Blocks.field36643.method11579().method23465(Class3239.field18682, Boolean.valueOf(true)).method23465(Class3239.field18683, Boolean.valueOf(true)),
         12,
         13,
         12,
         var5
      );
      this.method12923(
         var1,
         Blocks.field36643.method11579().method23465(Class3239.field18680, Boolean.valueOf(true)).method23465(Class3239.field18683, Boolean.valueOf(true)),
         12,
         13,
         0,
         var5
      );

      for (int var19 = 3; var19 <= 9; var19 += 2) {
         this.method12927(var1, var5, 1, 7, var19, 1, 8, var19, var12, var12, false);
         this.method12927(var1, var5, 11, 7, var19, 11, 8, var19, var13, var13, false);
      }

      Class7380 var20 = Blocks.field36644.method11579().method23465(Class3421.field19131, Direction.NORTH);

      for (int var15 = 0; var15 <= 6; var15++) {
         int var16 = var15 + 4;

         for (int var17 = 5; var17 <= 7; var17++) {
            this.method12923(var1, var20, var17, 5 + var15, var16, var5);
         }

         if (var16 >= 5 && var16 <= 8) {
            this.method12927(var1, var5, 5, 5, var16, 7, var15 + 4, var16, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
         } else if (var16 >= 9 && var16 <= 10) {
            this.method12927(var1, var5, 5, 8, var16, 7, var15 + 4, var16, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
         }

         if (var15 >= 1) {
            this.method12927(
               var1, var5, 5, 6 + var15, var16, 7, 9 + var15, var16, Blocks.AIR.method11579(), Blocks.AIR.method11579(), false
            );
         }
      }

      for (int var21 = 5; var21 <= 7; var21++) {
         this.method12923(var1, var20, var21, 12, 11, var5);
      }

      this.method12927(var1, var5, 5, 6, 7, 5, 7, 7, var13, var13, false);
      this.method12927(var1, var5, 7, 6, 7, 7, 7, 7, var12, var12, false);
      this.method12927(var1, var5, 5, 13, 12, 7, 13, 12, Blocks.AIR.method11579(), Blocks.AIR.method11579(), false);
      this.method12927(var1, var5, 2, 5, 2, 3, 5, 3, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 2, 5, 9, 3, 5, 10, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 2, 5, 4, 2, 5, 8, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 9, 5, 2, 10, 5, 3, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 9, 5, 9, 10, 5, 10, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 10, 5, 4, 10, 5, 8, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      Class7380 var22 = var20.method23465(Class3421.field19131, Direction.EAST);
      Class7380 var23 = var20.method23465(Class3421.field19131, Direction.WEST);
      this.method12923(var1, var23, 4, 5, 2, var5);
      this.method12923(var1, var23, 4, 5, 3, var5);
      this.method12923(var1, var23, 4, 5, 9, var5);
      this.method12923(var1, var23, 4, 5, 10, var5);
      this.method12923(var1, var22, 8, 5, 2, var5);
      this.method12923(var1, var22, 8, 5, 3, var5);
      this.method12923(var1, var22, 8, 5, 9, var5);
      this.method12923(var1, var22, 8, 5, 10, var5);
      this.method12927(var1, var5, 3, 4, 4, 4, 4, 8, Blocks.SOUL_SAND.method11579(), Blocks.SOUL_SAND.method11579(), false);
      this.method12927(var1, var5, 8, 4, 4, 9, 4, 8, Blocks.SOUL_SAND.method11579(), Blocks.SOUL_SAND.method11579(), false);
      this.method12927(var1, var5, 3, 5, 4, 4, 5, 8, Blocks.field36645.method11579(), Blocks.field36645.method11579(), false);
      this.method12927(var1, var5, 8, 5, 4, 9, 5, 8, Blocks.field36645.method11579(), Blocks.field36645.method11579(), false);
      this.method12927(var1, var5, 4, 2, 0, 8, 2, 12, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 0, 2, 4, 12, 2, 8, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 4, 0, 0, 8, 1, 3, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 4, 0, 9, 8, 1, 12, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 0, 0, 4, 3, 1, 8, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);
      this.method12927(var1, var5, 9, 0, 4, 12, 1, 8, Blocks.field36642.method11579(), Blocks.field36642.method11579(), false);

      for (int var24 = 4; var24 <= 8; var24++) {
         for (int var18 = 0; var18 <= 2; var18++) {
            this.method12932(var1, Blocks.field36642.method11579(), var24, -1, var18, var5);
            this.method12932(var1, Blocks.field36642.method11579(), var24, -1, 12 - var18, var5);
         }
      }

      for (int var25 = 0; var25 <= 2; var25++) {
         for (int var26 = 4; var26 <= 8; var26++) {
            this.method12932(var1, Blocks.field36642.method11579(), var25, -1, var26, var5);
            this.method12932(var1, Blocks.field36642.method11579(), 12 - var25, -1, var26, var5);
         }
      }

      return true;
   }
}
