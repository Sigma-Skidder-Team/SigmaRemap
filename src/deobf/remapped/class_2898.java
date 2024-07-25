package remapped;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class_2898 extends class_958 {
   private static String[] field_14160;

   private class_2898(class_8829 var1) {
      super(var1, null);
      this.field_14159 = var1;
   }

   @Override
   public boolean method_4213() {
      return class_8829.method_40619(this.field_14159) == 0 && !this.field_14159.method_40588() && class_8829.method_40561(this.field_14159);
   }

   @Override
   public boolean method_4214() {
      return false;
   }

   @Override
   public void method_16796() {
      class_8829.method_40599(this.field_14159, 200);
      List var3 = this.method_13265();
      if (!var3.isEmpty()) {
         for (class_1331 var5 : var3) {
            if (!class_949.method_4184(class_8829.method_40565(this.field_14159), var5)) {
               class_8829.method_40570(this.field_14159, var5);
               return;
            }
         }

         class_949.method_4177(class_8829.method_40565(this.field_14159));
         class_8829.method_40570(this.field_14159, (class_1331)var3.get(0));
      }
   }

   private List<class_1331> method_13265() {
      class_1331 var3 = this.field_14159.method_37075();
      class_1489 var4 = ((class_6331)this.field_14159.field_41768).method_28969();
      Stream var5 = var4.method_6877(var0 -> var0 == class_236.field_769 || var0 == class_236.field_784, var3, 20, class_8122.field_41615);
      return var5.<class_1331>map(class_8009::method_36337)
         .filter(var1 -> class_8829.method_40594(this.field_14159, var1))
         .sorted(Comparator.comparingDouble(var1 -> var1.method_12180(var3)))
         .collect(Collectors.<class_1331>toList());
   }
}
