package mapped;

import java.io.IOException;
import java.nio.ByteBuffer;

public class Class1466 implements Runnable {
   private final Class344 field7884;
   public final Class344 field7885;

   public Class1466(Class344 var1, Class344 var2) {
      this.field7885 = var1;
      this.field7884 = var2;
   }

   @Override
   public void run() {
      Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());

      try {
         this.method6465();
      } catch (IOException var7) {
         Class344.method1782(this.field7885, var7);
      } finally {
         this.method6466();
         Class344.method1783(this.field7885, null);
      }
   }

   private void method6465() throws IOException {
      try {
         while (!Thread.interrupted()) {
            ByteBuffer var3 = Class344.method1784(this.field7885).field1521.take();
            Class344.method1785(this.field7885).write(var3.array(), 0, var3.limit());
            Class344.method1785(this.field7885).flush();
         }
      } catch (InterruptedException var6) {
         for (ByteBuffer var5 : Class344.method1784(this.field7885).field1521) {
            Class344.method1785(this.field7885).write(var5.array(), 0, var5.limit());
            Class344.method1785(this.field7885).flush();
         }

         Thread.currentThread().interrupt();
      }
   }

   private void method6466() {
      try {
         if (Class344.method1786(this.field7885) != null) {
            Class344.method1786(this.field7885).close();
         }
      } catch (IOException var4) {
         this.field7885.method1687(this.field7884, var4);
      }
   }
}
