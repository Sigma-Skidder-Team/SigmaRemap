package remapped;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class class_8880 extends class_245 {
   private class_245 field_45384;

   public class_8880(class_245 var1) {
      if (var1 != null) {
         this.field_45384 = var1;
      } else {
         throw new IllegalArgumentException("delegate == null");
      }
   }

   public final class_245 method_40856() {
      return this.field_45384;
   }

   public final class_8880 method_40855(class_245 var1) {
      if (var1 != null) {
         this.field_45384 = var1;
         return this;
      } else {
         throw new IllegalArgumentException("delegate == null");
      }
   }

   @Override
   public class_245 method_1070(long var1, TimeUnit var3) {
      return this.field_45384.method_1070(var1, var3);
   }

   @Override
   public long method_1078() {
      return this.field_45384.method_1078();
   }

   @Override
   public boolean method_1079() {
      return this.field_45384.method_1079();
   }

   @Override
   public long method_1073() {
      return this.field_45384.method_1073();
   }

   @Override
   public class_245 method_1074(long var1) {
      return this.field_45384.method_1074(var1);
   }

   @Override
   public class_245 method_1075() {
      return this.field_45384.method_1075();
   }

   @Override
   public class_245 method_1077() {
      return this.field_45384.method_1077();
   }

   @Override
   public void method_1072() throws IOException {
      this.field_45384.method_1072();
   }
}
