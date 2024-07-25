package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_693 extends class_4285<class_1941> {
   public class_693(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_3126(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_1941 var5) {
      float var8 = (float)(var3.nextInt(3) + 4);

      for (int var9 = 0; var8 > 0.5F; var9--) {
         for (int var10 = class_9299.method_42848(-var8); var10 <= class_9299.method_42816(var8); var10++) {
            for (int var11 = class_9299.method_42848(-var8); var11 <= class_9299.method_42816(var8); var11++) {
               if ((float)(var10 * var10 + var11 * var11) <= (var8 + 1.0F) * (var8 + 1.0F)) {
                  this.method_19906(var1, var4.method_6104(var10, var9, var11), class_4783.field_23894.method_29260());
               }
            }
         }

         var8 = (float)((double)var8 - ((double)var3.nextInt(2) + 0.5));
      }

      return true;
   }
}
