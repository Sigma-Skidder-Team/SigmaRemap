package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_3427 extends class_3133<class_5194> {
   public class_3427(Codec<class_5194> var1) {
      super(var1);
   }

   public void method_15848(
      Random var1,
      class_5990 var2,
      class_6325 var3,
      int var4,
      int var5,
      int var6,
      double var7,
      class_2522 var9,
      class_2522 var10,
      int var11,
      long var12,
      class_5194 var14
   ) {
      if (var7 < -1.0 || var7 > 2.0) {
         class_3133.field_15561.method_14498(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, class_3133.field_15590);
      } else if (!(var7 > 1.0)) {
         class_3133.field_15561.method_14498(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, class_3133.field_15575);
      } else {
         class_3133.field_15561.method_14498(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, class_3133.field_15601);
      }
   }
}
