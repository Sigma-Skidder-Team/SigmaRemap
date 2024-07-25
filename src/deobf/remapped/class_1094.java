package remapped;

import java.util.List;
import java.util.stream.Collectors;

public abstract class class_1094 extends class_266 {
   public class_1094() {
      super(class_7542.field_38486);
   }

   public static int method_4819(int var0) {
      return 40 + var0 * 13;
   }

   @Override
   public void method_5312() {
      for (class_7114 var4 : this.field_950) {
         if (var4 instanceof class_1200) {
            ((class_1200)var4).method_5312();
         }
      }
   }

   public void method_4820() {
      List var3 = this.field_942
         .stream()
         .filter(class_8949.class::isInstance)
         .<class_8949>map(class_8949.class::cast)
         .<String>map(class_8949::method_41091)
         .collect(Collectors.toList());
      class_7567.method_34412(var3);
   }
}
