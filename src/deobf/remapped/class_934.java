package remapped;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class class_934 implements class_2995 {
   private static String[] field_4778;
   private final MinecraftClient field_4779;
   private double field_4776 = Double.MIN_VALUE;
   private List<class_4190> field_4777 = Collections.<class_4190>emptyList();

   public class_934(MinecraftClient var1) {
      this.field_4779 = var1;
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      double var11 = (double) Util.getMeasuringTimeNano();
      if (var11 - this.field_4776 > 1.0E8) {
         this.field_4776 = var11;
         class_8145 var13 = this.field_4779.gameRenderer.method_35949().method_41633();
         this.field_4777 = var13.field_41768.method_6676(var13, var13.method_37241().method_18898(6.0), var0 -> true).collect(Collectors.<class_4190>toList());
      }

      class_7907 var16 = var2.method_11645(class_3581.method_16744());

      for (class_4190 var15 : this.field_4777) {
         class_4316.method_20051(var1, var16, var15, -var3, -var5, -var7, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
