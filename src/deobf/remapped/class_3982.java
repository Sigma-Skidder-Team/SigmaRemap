package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class class_3982 extends class_4285<class_1926> {
   public class_3982(Codec<class_1926> var1) {
      super(var1);
   }

   public void method_18372(class_9379 var1, Random var2, class_1331 var3, class_1926 var4, int var5, class_2921 var6) {
      for (int var9 = 0; var9 < var5; var9++) {
         var6.method_13364(var3).method_13369(class_240.field_817, var9);
         if (!var1.method_28262(var6).method_8321(var1, var6)) {
            this.method_19906(var1, var6, var4.field_9857.method_35002(var2, var3));
         }
      }
   }

   public int method_18368(Random var1) {
      int var4 = var1.nextInt(3) + 4;
      if (var1.nextInt(12) == 0) {
         var4 *= 2;
      }

      return var4;
   }

   public boolean method_18369(class_9379 var1, class_1331 var2, int var3, class_2921 var4, class_1926 var5) {
      int var8 = var2.method_12165();
      if (var8 >= 1 && var8 + var3 + 1 < 256) {
         class_6414 var9 = var1.method_28262(var2.method_6100()).method_8360();
         if (!method_19910(var9) && !var9.method_29299(class_2351.field_11782)) {
            return false;
         } else {
            for (int var10 = 0; var10 <= var3; var10++) {
               int var11 = this.method_18370(-1, -1, var5.field_9859, var10);

               for (int var12 = -var11; var12 <= var11; var12++) {
                  for (int var13 = -var11; var13 <= var11; var13++) {
                     class_2522 var14 = var1.method_28262(var4.method_13360(var2, var12, var10, var13));
                     if (!var14.method_8345() && !var14.method_8349(class_2351.field_11737)) {
                        return false;
                     }
                  }
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public boolean method_18371(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_1926 var5) {
      int var8 = this.method_18368(var3);
      class_2921 var9 = new class_2921();
      if (this.method_18369(var1, var4, var8, var9, var5)) {
         this.method_18373(var1, var3, var4, var8, var9, var5);
         this.method_18372(var1, var3, var4, var5, var8, var9);
         return true;
      } else {
         return false;
      }
   }

   public abstract int method_18370(int var1, int var2, int var3, int var4);

   public abstract void method_18373(class_9379 var1, Random var2, class_1331 var3, int var4, class_2921 var5, class_1926 var6);
}
