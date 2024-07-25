package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_9248 extends class_3418 {
   public class_9248(Codec<class_1941> var1) {
      super(var1);
   }

   @Override
   public boolean method_15772(class_9379 var1, Random var2, class_1331 var3, class_2522 var4) {
      int var7 = var2.nextInt(3) + 3;
      int var8 = var2.nextInt(3) + 3;
      int var9 = var2.nextInt(3) + 3;
      int var10 = var2.nextInt(3) + 1;
      class_2921 var11 = var3.method_6089();

      for (int var12 = 0; var12 <= var8; var12++) {
         for (int var13 = 0; var13 <= var7; var13++) {
            for (int var14 = 0; var14 <= var9; var14++) {
               var11.method_13362(var12 + var3.method_12173(), var13 + var3.method_12165(), var14 + var3.method_12185());
               var11.method_13369(Direction.field_802, var10);
               if ((var12 != 0 && var12 != var8 || var13 != 0 && var13 != var7)
                  && (var14 != 0 && var14 != var9 || var13 != 0 && var13 != var7)
                  && (var12 != 0 && var12 != var8 || var14 != 0 && var14 != var9)
                  && (var12 == 0 || var12 == var8 || var13 == 0 || var13 == var7 || var14 == 0 || var14 == var9)
                  && !(var2.nextFloat() < 0.1F)
                  && this.method_15774(var1, var2, var11, var4)) {
               }
            }
         }
      }

      return true;
   }
}
