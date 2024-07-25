package remapped;

import java.io.IOException;

public final class class_1088 implements class_4131 {
   private final class_8880 field_6008;
   private boolean field_6007;

   public class_1088(class_9485 var1) {
      this.field_6009 = var1;
      this.field_6008 = new class_8880(this.field_6009.field_48344.method_19192());
   }

   @Override
   public class_245 method_19192() {
      return this.field_6008;
   }

   @Override
   public void method_19191(class_7059 var1, long var2) throws IOException {
      if (!this.field_6007) {
         if (var2 != 0L) {
            this.field_6009.field_48344.method_18239(var2);
            this.field_6009.field_48344.method_18250("\r\n");
            this.field_6009.field_48344.method_19191(var1, var2);
            this.field_6009.field_48344.method_18250("\r\n");
         }
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public synchronized void flush() throws IOException {
      if (!this.field_6007) {
         this.field_6009.field_48344.flush();
      }
   }

   @Override
   public synchronized void close() throws IOException {
      if (!this.field_6007) {
         this.field_6007 = true;
         this.field_6009.field_48344.method_18250("0\r\n\r\n");
         this.field_6009.method_43820(this.field_6008);
         this.field_6009.field_48339 = 3;
      }
   }
}
