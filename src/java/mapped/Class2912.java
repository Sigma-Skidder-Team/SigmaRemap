package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2912 extends Class2898<Class4712> {
   private static final BlockPos field17996 = new BlockPos(8, 3, 8);
   private static final Class7481 field17997 = new Class7481(field17996);

   public Class2912(Codec<Class4712> var1) {
      super(var1);
   }

   private static int method11248(int var0, int var1, int var2, int var3) {
      return Math.max(Math.abs(var0 - var2), Math.abs(var1 - var3));
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4712 var5) {
      Class7481 var8 = new Class7481(var4);
      if (method11248(var8.field32174, var8.field32175, field17997.field32174, field17997.field32175) > 1) {
         return true;
      } else {
         Mutable var9 = new Mutable();

         for (int var10 = var8.method24357(); var10 <= var8.method24359(); var10++) {
            for (int var11 = var8.method24356(); var11 <= var8.method24358(); var11++) {
               if (method11248(field17996.method8304(), field17996.method8306(), var11, var10) <= 16) {
                  var9.method8372(var11, field17996.getY(), var10);
                  if (!var9.equals(field17996)) {
                     var1.method6725(var9, Blocks.STONE.method11579(), 2);
                  } else {
                     var1.method6725(var9, Blocks.field36399.method11579(), 2);
                  }
               }
            }
         }

         return true;
      }
   }
}
