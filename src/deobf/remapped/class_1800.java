package remapped;

import java.util.List;

public enum class_1800 {
   @Override
   public void method_16031(class_6331 var1, class_2810 var2, List<class_3577> var3, int var4, BlockPos var5) {
      if (var4 < 100) {
         if (var4 < 80) {
            if (var4 != 0) {
               if (var4 < 5) {
                  var1.method_43364(3001, new BlockPos(0, 128, 0), 0);
               }
            } else {
               for (class_3577 var9 : var3) {
                  var9.method_16625(new BlockPos(0, 128, 0));
               }
            }
         } else {
            var1.method_43364(3001, new BlockPos(0, 128, 0), 0);
         }
      } else {
         var2.method_12768(field_17115);
         var2.method_12770();

         for (class_3577 var11 : var3) {
            var11.method_16625((BlockPos)null);
            var1.method_29573(var11, var11.getPosX(), var11.method_37309(), var11.getPosZ(), 6.0F, class_7298.field_37310);
            var11.method_37204();
         }
      }
   }
}
