package remapped;

import java.io.IOException;

public class class_4267 implements Packet<class_392> {
   private static String[] field_20676;
   private class_1331 field_20677;
   private class_2522 field_20678;

   public class_4267() {
   }

   public class_4267(class_1331 var1, class_2522 var2) {
      this.field_20677 = var1;
      this.field_20678 = var2;
   }

   public class_4267(class_6163 var1, class_1331 var2) {
      this(var2, var1.method_28262(var2));
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_20677 = var1.method_37748();
      this.field_20678 = class_6414.field_32758.method_14040(var1.method_37778());
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37770(this.field_20677);
      var1.method_37743(class_6414.method_29285(this.field_20678));
   }

   public void method_19869(class_392 var1) {
      var1.method_1960(this);
   }

   public class_2522 method_19868() {
      return this.field_20678;
   }

   public class_1331 method_19867() {
      return this.field_20677;
   }
}
