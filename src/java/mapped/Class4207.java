package mapped;

import java.util.List;
import java.util.Random;

public class Class4207 extends Class4194 {
   private static String[] field20514;

   public Class4207(int var1, Random var2, Class9764 var3, Direction var4) {
      super(Class7792.field33450, var1);
      this.method12939(var4);
      this.field20495 = this.method12985(var2);
      this.field20444 = var3;
   }

   public Class4207(Class8761 var1, Class39 var2) {
      super(Class7792.field33450, var2);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      this.method12986((Class4196)var1, var2, var3, 1, 1);
   }

   public static Class4207 method13000(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      Class9764 var9 = Class9764.method38388(var2, var3, var4, -1, -1, 0, 9, 5, 11, var5);
      return method12989(var9) && Class4178.method12918(var0, var9) == null ? new Class4207(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, Class5646 var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      this.method12928(var1, var5, 0, 0, 0, 8, 4, 10, true, var4, Class9331.method35288());
      this.method12984(var1, var4, var5, this.field20495, 1, 1, 0);
      this.method12927(var1, var5, 1, 1, 10, 3, 3, 10, field20443, field20443, false);
      this.method12928(var1, var5, 4, 1, 1, 4, 3, 1, false, var4, Class9331.method35288());
      this.method12928(var1, var5, 4, 1, 3, 4, 3, 3, false, var4, Class9331.method35288());
      this.method12928(var1, var5, 4, 1, 7, 4, 3, 7, false, var4, Class9331.method35288());
      this.method12928(var1, var5, 4, 1, 9, 4, 3, 9, false, var4, Class9331.method35288());

      for (int var10 = 1; var10 <= 3; var10++) {
         this.method12923(
            var1,
            Blocks.field36628
               .method11579()
               .method23465(Class3237.field18680, Boolean.valueOf(true))
               .method23465(Class3237.field18682, Boolean.valueOf(true)),
            4,
            var10,
            4,
            var5
         );
         this.method12923(
            var1,
            Blocks.field36628
               .method11579()
               .method23465(Class3237.field18680, Boolean.valueOf(true))
               .method23465(Class3237.field18682, Boolean.valueOf(true))
               .method23465(Class3237.field18681, Boolean.valueOf(true)),
            4,
            var10,
            5,
            var5
         );
         this.method12923(
            var1,
            Blocks.field36628
               .method11579()
               .method23465(Class3237.field18680, Boolean.valueOf(true))
               .method23465(Class3237.field18682, Boolean.valueOf(true)),
            4,
            var10,
            6,
            var5
         );
         this.method12923(
            var1,
            Blocks.field36628
               .method11579()
               .method23465(Class3237.field18683, Boolean.valueOf(true))
               .method23465(Class3237.field18681, Boolean.valueOf(true)),
            5,
            var10,
            5,
            var5
         );
         this.method12923(
            var1,
            Blocks.field36628
               .method11579()
               .method23465(Class3237.field18683, Boolean.valueOf(true))
               .method23465(Class3237.field18681, Boolean.valueOf(true)),
            6,
            var10,
            5,
            var5
         );
         this.method12923(
            var1,
            Blocks.field36628
               .method11579()
               .method23465(Class3237.field18683, Boolean.valueOf(true))
               .method23465(Class3237.field18681, Boolean.valueOf(true)),
            7,
            var10,
            5,
            var5
         );
      }

      this.method12923(
         var1,
         Blocks.field36628.method11579().method23465(Class3237.field18680, Boolean.valueOf(true)).method23465(Class3237.field18682, Boolean.valueOf(true)),
         4,
         3,
         2,
         var5
      );
      this.method12923(
         var1,
         Blocks.field36628.method11579().method23465(Class3237.field18680, Boolean.valueOf(true)).method23465(Class3237.field18682, Boolean.valueOf(true)),
         4,
         3,
         8,
         var5
      );
      Class7380 var12 = Blocks.field36560.method11579().method23465(Class3461.field19293, Direction.WEST);
      Class7380 var11 = Blocks.field36560
         .method11579()
         .method23465(Class3461.field19293, Direction.WEST)
         .method23465(Class3461.field19297, Class84.field209);
      this.method12923(var1, var12, 4, 1, 2, var5);
      this.method12923(var1, var11, 4, 2, 2, var5);
      this.method12923(var1, var12, 4, 1, 8, var5);
      this.method12923(var1, var11, 4, 2, 8, var5);
      return true;
   }
}
