package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2951 extends Class2898<Class4728> {
   private static final Class7380 field18027 = Class8487.field37009
      .method11579()
      .method23465(Class3418.field19125, Integer.valueOf(1))
      .method23465(Class3418.field19126, Class181.field642)
      .method23465(Class3418.field19127, Integer.valueOf(0));
   private static final Class7380 field18028 = field18027.method23465(Class3418.field19126, Class181.field644)
      .method23465(Class3418.field19127, Integer.valueOf(1));
   private static final Class7380 field18029 = field18027.method23465(Class3418.field19126, Class181.field644);
   private static final Class7380 field18030 = field18027.method23465(Class3418.field19126, Class181.field643);

   public Class2951(Codec<Class4728> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4728 var5) {
      int var8 = 0;
      Mutable var9 = var4.method8354();
      Mutable var10 = var4.method8354();
      if (var1.method7007(var9)) {
         if (Class8487.field37009.method11579().method23443(var1, var9)) {
            int var11 = var3.nextInt(12) + 5;
            if (var3.nextFloat() < var5.field22399) {
               int var12 = var3.nextInt(4) + 1;

               for (int var13 = var4.method8304() - var12; var13 <= var4.method8304() + var12; var13++) {
                  for (int var14 = var4.method8306() - var12; var14 <= var4.method8306() + var12; var14++) {
                     int var15 = var13 - var4.method8304();
                     int var16 = var14 - var4.method8306();
                     if (var15 * var15 + var16 * var16 <= var12 * var12) {
                        var10.method8372(var13, var1.method6736(Class101.field296, var13, var14) - 1, var14);
                        if (method11219(var1.method6738(var10).method23383())) {
                           var1.method6725(var10, Class8487.field36398.method11579(), 2);
                        }
                     }
                  }
               }
            }

            for (int var17 = 0; var17 < var11 && var1.method7007(var9); var17++) {
               var1.method6725(var9, field18027, 2);
               var9.method8380(Direction.field673, 1);
            }

            if (var9.getY() - var4.getY() >= 3) {
               var1.method6725(var9, field18028, 2);
               var1.method6725(var9.method8380(Direction.field672, 1), field18029, 2);
               var1.method6725(var9.method8380(Direction.field672, 1), field18030, 2);
            }
         }

         var8++;
      }

      return var8 > 0;
   }
}
