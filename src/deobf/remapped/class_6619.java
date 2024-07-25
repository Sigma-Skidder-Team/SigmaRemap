package remapped;

import java.io.IOException;

public abstract class class_6619 implements class_4131 {
   private final class_4131 field_34187;

   public class_6619(class_4131 var1) {
      if (var1 != null) {
         this.field_34187 = var1;
      } else {
         throw new IllegalArgumentException("delegate == null");
      }
   }

   public final class_4131 method_30434() {
      return this.field_34187;
   }

   @Override
   public void method_19191(class_7059 var1, long var2) throws IOException {
      this.field_34187.method_19191(var1, var2);
   }

   @Override
   public void flush() throws IOException {
      this.field_34187.flush();
   }

   @Override
   public class_245 method_19192() {
      return this.field_34187.method_19192();
   }

   @Override
   public void close() throws IOException {
      this.field_34187.close();
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + "(" + this.field_34187.toString() + ")";
   }
}
