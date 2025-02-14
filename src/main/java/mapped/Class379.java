package mapped;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Map;

public class Class379 extends Thread {
   private Class9433 field1635 = null;
   private static final String field1636 = "\r\n";
   private static Charset field1637 = Charset.forName("ASCII");

   public Class379(Class9433 var1) {
      super("HttpPipelineSender");
      this.field1635 = var1;
   }

   @Override
   public void run() {
      Class9638 var3 = null;

      try {
         this.method1854();

         while (!Thread.interrupted()) {
            var3 = this.field1635.method36213();
            Class7432 var4 = var3.method37562();
            OutputStream var5 = this.field1635.method36211();
            this.method1855(var4, var5);
            this.field1635.method36218(var3);
         }
      } catch (InterruptedException var6) {
         return;
      } catch (Exception var7) {
         this.field1635.method36223(var3, var7);
      }
   }

   private void method1854() throws IOException {
      String var3 = this.field1635.method36230();
      int var4 = this.field1635.method36231();
      Proxy var5 = this.field1635.method36232();
      Socket var6 = new Socket(var5);
      var6.connect(new InetSocketAddress(var3, var4), 5000);
      this.field1635.method36210(var6);
   }

   private void method1855(Class7432 var1, OutputStream var2) throws IOException {
      this.method1856(var2, var1.method23997() + " " + var1.method23998() + " " + var1.method23999() + "\r\n");
      Map<String, String> var5 = var1.method24000();

      for (String var7 : var5.keySet()) {
         String var8 = var1.method24000().get(var7);
         this.method1856(var2, var7 + ": " + var8 + "\r\n");
      }

      this.method1856(var2, "\r\n");
   }

   private void method1856(OutputStream var1, String var2) throws IOException {
      byte[] var5 = var2.getBytes(field1637);
      var1.write(var5);
   }
}
