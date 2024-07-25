package remapped;

import java.util.Optional;

public class class_4294 extends class_7571 {
   private static String[] field_20832;

   public class_4294(class_545 var1, boolean var2) {
      this.field_20833 = var1;
      this.field_20831 = var2;
   }

   @Override
   public Optional<Float> method_34424(class_2730 var1, class_6163 var2, BlockPos var3, class_2522 var4, class_4774 var5) {
      return var3.equals(var3) && this.field_20831
         ? Optional.<Float>of(class_4783.field_23900.method_29264())
         : super.method_34424(var1, var2, var3, var4, var5);
   }
}
