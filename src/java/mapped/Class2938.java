package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2938 extends Class2898<Class4712> {
   public Class2938(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4712 var5) {
      Mutable var8 = new Mutable();
      Mutable var9 = new Mutable();

      for (int var10 = 0; var10 < 16; var10++) {
         for (int var11 = 0; var11 < 16; var11++) {
            int var12 = var4.method8304() + var10;
            int var13 = var4.method8306() + var11;
            int var14 = var1.method6736(Class101.field299, var12, var13);
            var8.method8372(var12, var14, var13);
            var9.method8374(var8).method8380(Direction.field672, 1);
            Class8907 var15 = var1.method7003(var8);
            if (var15.method32505(var1, var9, false)) {
               var1.method6725(var9, Blocks.ICE.method11579(), 2);
            }

            if (var15.method32506(var1, var8)) {
               var1.method6725(var8, Blocks.SNOW.method11579(), 2);
               Class7380 var16 = var1.method6738(var9);
               if (var16.method23462(Class3471.field19323)) {
                  var1.method6725(var9, var16.method23465(Class3471.field19323, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}