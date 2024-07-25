package remapped;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Map;

public class class_9380 extends Thread {
   private class_8356 field_47943 = null;
   private static final String field_47942 = "\r\n";
   private static Charset field_47940 = Charset.forName("ASCII");

   public class_9380(class_8356 var1) {
      super("HttpPipelineSender");
      this.field_47943 = var1;
   }

   @Override
   public void run() {
      class_9144 var3 = null;

      try {
         this.method_43374();

         while (!Thread.interrupted()) {
            var3 = this.field_47943.method_38493();
            class_1951 var4 = var3.method_42078();
            OutputStream var5 = this.field_47943.method_38478();
            this.method_43373(var4, var5);
            this.field_47943.method_38473(var3);
         }
      } catch (InterruptedException var6) {
         return;
      } catch (Exception var7) {
         this.field_47943.method_38485(var3, var7);
      }
   }

   private void method_43374() throws IOException {
      String var3 = this.field_47943.method_38469();
      int var4 = this.field_47943.method_38474();
      Proxy var5 = this.field_47943.method_38490();
      Socket var6 = new Socket(var5);
      var6.connect(new InetSocketAddress(var3, var4), 5000);
      this.field_47943.method_38489(var6);
   }

   private void method_43373(class_1951 var1, OutputStream var2) throws IOException {
      this.method_43372(var2, var1.method_9012() + " " + var1.method_9011() + " " + var1.method_9021() + "\r\n");
      Map var5 = var1.method_9017();

      for (String var7 : var5.keySet()) {
         String var8 = var1.method_9017().get(var7);
         this.method_43372(var2, var7 + ": " + var8 + "\r\n");
      }

      this.method_43372(var2, "\r\n");
   }

   private void method_43372(OutputStream var1, String var2) throws IOException {
      byte[] var5 = var2.getBytes(field_47940);
      var1.write(var5);
   }
}
