package remapped;

import java.io.IOException;
import java.nio.ByteBuffer;

public class class_8578 implements Runnable {
   private final class_4833 field_43965;

   public class_8578(class_4833 var1, class_4833 var2) {
      this.field_43966 = var1;
      this.field_43965 = var2;
   }

   @Override
   public void run() {
      Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());

      try {
         this.method_39455();
      } catch (IOException var7) {
         class_4833.method_22247(this.field_43966, var7);
      } finally {
         this.method_39457();
         class_4833.method_22246(this.field_43966, null);
      }
   }

   private void method_39455() throws IOException {
      try {
         while (!Thread.interrupted()) {
            ByteBuffer var3 = class_4833.method_22225(this.field_43966).field_30007.take();
            class_4833.method_22242(this.field_43966).write(var3.array(), 0, var3.limit());
            class_4833.method_22242(this.field_43966).flush();
         }
      } catch (InterruptedException var6) {
         for (ByteBuffer var5 : class_4833.method_22225(this.field_43966).field_30007) {
            class_4833.method_22242(this.field_43966).write(var5.array(), 0, var5.limit());
            class_4833.method_22242(this.field_43966).flush();
         }

         Thread.currentThread().interrupt();
      }
   }

   private void method_39457() {
      try {
         if (class_4833.method_22230(this.field_43966) != null) {
            class_4833.method_22230(this.field_43966).close();
         }
      } catch (IOException var4) {
         this.field_43966.method_2696(this.field_43965, var4);
      }
   }
}
