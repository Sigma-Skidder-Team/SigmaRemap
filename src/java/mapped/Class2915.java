package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2915 extends Class2914 {
   public Class2915(Codec<Class4712> var1) {
      super(var1);
   }

   @Override
   public boolean method11249(Class1660 var1, Random var2, BlockPos var3, Class7380 var4) {
      int var7 = var2.nextInt(3) + 3;
      int var8 = var2.nextInt(3) + 3;
      int var9 = var2.nextInt(3) + 3;
      int var10 = var2.nextInt(3) + 1;
      Mutable var11 = var3.method8354();

      for (int var12 = 0; var12 <= var8; var12++) {
         for (int var13 = 0; var13 <= var7; var13++) {
            for (int var14 = 0; var14 <= var9; var14++) {
               var11.method8372(var12 + var3.method8304(), var13 + var3.getY(), var14 + var3.method8306());
               var11.method8380(Direction.field672, var10);
               if ((var12 != 0 && var12 != var8 || var13 != 0 && var13 != var7)
                  && (var14 != 0 && var14 != var9 || var13 != 0 && var13 != var7)
                  && (var12 != 0 && var12 != var8 || var14 != 0 && var14 != var9)
                  && (var12 == 0 || var12 == var8 || var13 == 0 || var13 == var7 || var14 == 0 || var14 == var9)
                  && !(var2.nextFloat() < 0.1F)
                  && this.method11250(var1, var2, var11, var4)) {
               }
            }
         }
      }

      return true;
   }
}
