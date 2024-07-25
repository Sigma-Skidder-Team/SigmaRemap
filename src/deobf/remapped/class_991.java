package remapped;

import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class class_991 {
   private static String[] field_5043;
   private final Path field_5045;
   private class_9882 field_5044;

   public class_991(class_6322 var1, Path var2) {
      this.field_5045 = var2;
      this.field_5044 = class_9882.method_45531(var1, var2);
   }

   public class_9882 method_4319() {
      return this.field_5044;
   }

   public void method_4318() {
      this.field_5044.method_38598(this.field_5045);
   }

   public class_991 method_4317(UnaryOperator<class_9882> var1) {
      (this.field_5044 = var1.apply(this.field_5044)).method_38598(this.field_5045);
      return this;
   }
}
