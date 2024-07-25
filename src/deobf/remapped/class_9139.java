package remapped;

import java.io.IOException;

public abstract class class_9139 implements class_5322 {
   private final class_5322 field_46739;

   public class_9139(class_5322 var1) {
      if (var1 != null) {
         this.field_46739 = var1;
      } else {
         throw new IllegalArgumentException("delegate == null");
      }
   }

   public final class_5322 method_42055() {
      return this.field_46739;
   }

   @Override
   public long method_24273(class_7059 var1, long var2) throws IOException {
      return this.field_46739.method_24273(var1, var2);
   }

   @Override
   public class_245 method_19192() {
      return this.field_46739.method_19192();
   }

   @Override
   public void close() throws IOException {
      this.field_46739.close();
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + "(" + this.field_46739.toString() + ")";
   }
}
