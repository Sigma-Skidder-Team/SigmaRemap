package mapped;

import java.util.List;
import java.util.Random;

public class Class4173 extends Class4167 {
   private static String[] field20435;

   public Class4173(int var1, Class9764 var2, Direction var3) {
      super(Class7792.field33433, var1);
      this.method12939(var3);
      this.field20444 = var2;
   }

   public Class4173(Class8761 var1, Class39 var2) {
      super(Class7792.field33433, var2);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      int var6 = 1;
      Direction var7 = this.method12938();
      if (var7 == Direction.WEST || var7 == Direction.NORTH) {
         var6 = 5;
      }

      this.method12902((Class4175)var1, var2, var3, 0, var6, var3.nextInt(8) > 0);
      this.method12903((Class4175)var1, var2, var3, 0, var6, var3.nextInt(8) > 0);
   }

   public static Class4173 method12910(List<Class4178> var0, int var1, int var2, int var3, Direction var4, int var5) {
      Class9764 var8 = Class9764.method38388(var1, var2, var3, -3, 0, 0, 9, 7, 9, var4);
      return method12904(var8) && Class4178.method12918(var0, var8) == null ? new Class4173(var5, var8, var4) : null;
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, Class5646 var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      Class7380 var10 = Class8487.field36643
         .method11579()
         .method23465(Class3239.field18680, Boolean.valueOf(true))
         .method23465(Class3239.field18682, Boolean.valueOf(true));
      Class7380 var11 = Class8487.field36643
         .method11579()
         .method23465(Class3239.field18683, Boolean.valueOf(true))
         .method23465(Class3239.field18681, Boolean.valueOf(true));
      this.method12927(var1, var5, 0, 0, 0, 8, 1, 8, Class8487.field36642.method11579(), Class8487.field36642.method11579(), false);
      this.method12927(var1, var5, 0, 2, 0, 8, 5, 8, Class8487.field36387.method11579(), Class8487.field36387.method11579(), false);
      this.method12927(var1, var5, 0, 6, 0, 8, 6, 5, Class8487.field36642.method11579(), Class8487.field36642.method11579(), false);
      this.method12927(var1, var5, 0, 2, 0, 2, 5, 0, Class8487.field36642.method11579(), Class8487.field36642.method11579(), false);
      this.method12927(var1, var5, 6, 2, 0, 8, 5, 0, Class8487.field36642.method11579(), Class8487.field36642.method11579(), false);
      this.method12927(var1, var5, 1, 3, 0, 1, 4, 0, var11, var11, false);
      this.method12927(var1, var5, 7, 3, 0, 7, 4, 0, var11, var11, false);
      this.method12927(var1, var5, 0, 2, 4, 8, 2, 8, Class8487.field36642.method11579(), Class8487.field36642.method11579(), false);
      this.method12927(var1, var5, 1, 1, 4, 2, 2, 4, Class8487.field36387.method11579(), Class8487.field36387.method11579(), false);
      this.method12927(var1, var5, 6, 1, 4, 7, 2, 4, Class8487.field36387.method11579(), Class8487.field36387.method11579(), false);
      this.method12927(var1, var5, 1, 3, 8, 7, 3, 8, var11, var11, false);
      this.method12923(
         var1,
         Class8487.field36643.method11579().method23465(Class3239.field18681, Boolean.valueOf(true)).method23465(Class3239.field18682, Boolean.valueOf(true)),
         0,
         3,
         8,
         var5
      );
      this.method12923(
         var1,
         Class8487.field36643.method11579().method23465(Class3239.field18683, Boolean.valueOf(true)).method23465(Class3239.field18682, Boolean.valueOf(true)),
         8,
         3,
         8,
         var5
      );
      this.method12927(var1, var5, 0, 3, 6, 0, 3, 7, var10, var10, false);
      this.method12927(var1, var5, 8, 3, 6, 8, 3, 7, var10, var10, false);
      this.method12927(var1, var5, 0, 3, 4, 0, 5, 5, Class8487.field36642.method11579(), Class8487.field36642.method11579(), false);
      this.method12927(var1, var5, 8, 3, 4, 8, 5, 5, Class8487.field36642.method11579(), Class8487.field36642.method11579(), false);
      this.method12927(var1, var5, 1, 3, 5, 2, 5, 5, Class8487.field36642.method11579(), Class8487.field36642.method11579(), false);
      this.method12927(var1, var5, 6, 3, 5, 7, 5, 5, Class8487.field36642.method11579(), Class8487.field36642.method11579(), false);
      this.method12927(var1, var5, 1, 4, 5, 1, 5, 5, var11, var11, false);
      this.method12927(var1, var5, 7, 4, 5, 7, 5, 5, var11, var11, false);

      for (int var12 = 0; var12 <= 5; var12++) {
         for (int var13 = 0; var13 <= 8; var13++) {
            this.method12932(var1, Class8487.field36642.method11579(), var13, -1, var12, var5);
         }
      }

      return true;
   }
}
