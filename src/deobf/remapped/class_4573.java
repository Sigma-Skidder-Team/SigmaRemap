package remapped;

import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class class_4573 extends IOException {
   private final List<class_591> field_22268 = Lists.newArrayList();
   private final String field_22270;

   public class_4573(String var1) {
      this.field_22268.add(new class_591(null));
      this.field_22270 = var1;
   }

   public class_4573(String var1, Throwable var2) {
      super(var2);
      this.field_22268.add(new class_591(null));
      this.field_22270 = var1;
   }

   public void method_21220(String var1) {
      class_591.method_2777(this.field_22268.get(0), var1);
   }

   public void method_21218(String var1) {
      class_591.method_2781(this.field_22268.get(0), var1);
      this.field_22268.add(0, new class_591(null));
   }

   @Override
   public String getMessage() {
      return "Invalid " + this.field_22268.get(this.field_22268.size() - 1) + ": " + this.field_22270;
   }

   public static class_4573 method_21217(Exception var0) {
      if (!(var0 instanceof class_4573)) {
         String var3 = var0.getMessage();
         if (var0 instanceof FileNotFoundException) {
            var3 = "File not found";
         }

         return new class_4573(var3, var0);
      } else {
         return (class_4573)var0;
      }
   }
}
