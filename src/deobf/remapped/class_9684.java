package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import javax.annotation.Nullable;

public class class_9684 extends class_4285<class_4436> {
   public class_9684(Codec<class_4436> var1) {
      super(var1);
   }

   public boolean method_44775(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_4436 var5) {
      class_6414 var8 = var5.field_21648.method_8360();
      BlockPos var9 = method_44774(var1, var4.method_6089().method_13370(class_9249.field_47216, 1, var1.method_28261() - 1), var8);
      if (var9 == null) {
         return false;
      } else {
         int var10 = var5.method_20590().method_15936(var3);
         boolean var11 = false;

         for (BlockPos var13 : BlockPos.method_6106(var9, var10, var10, var10)) {
            if (var13.method_12176(var9) > var10) {
               break;
            }

            class_2522 var14 = var1.method_28262(var13);
            if (var14.method_8350(var8)) {
               this.method_19906(var1, var13, var5.field_21650);
               var11 = true;
            }
         }

         return var11;
      }
   }

   @Nullable
   private static BlockPos method_44774(class_9379 var0, class_2921 var1, class_6414 var2) {
      while (var1.method_12165() > 1) {
         class_2522 var5 = var0.method_28262(var1);
         if (var5.method_8350(var2)) {
            return var1;
         }

         var1.method_13368(Direction.field_802);
      }

      return null;
   }
}
