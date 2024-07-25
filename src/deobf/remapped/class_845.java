package remapped;

import java.net.URISyntaxException;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;

public class class_845 {
   public class_193 field_4416;
   private static Thread field_4417 = null;
   public class_1565 field_4419;

   public void method_3693() {
      this.method_3690();
   }

   public void method_3690() {
      HashMap var3 = new HashMap();
      var3.put("Cookie", "agoratk=00");
      var3.put("X-Forwarded-For", "1.1.1.1");
      var3.put("User-Agent", "Agora client");
      var3.put("Referer", "https://agora.sigmaclient.info");
      String var4 = SigmaMainClass.getInstance().getAccountManager().method_23077().replaceAll("-", "");

      try {
         this.field_4416 = new class_193(this, "wss://wsprg.sigmaclient.info/ws/agora/" + var4, var3);
         this.field_4416.method_22232(HttpsURLConnection.getDefaultSSLSocketFactory());
         this.field_4416.method_22238();
      } catch (URISyntaxException var6) {
         var6.printStackTrace();
      }
   }

   public void method_3688() {
      SigmaIRC.method_20850();
   }

   public synchronized void method_3691() {
      if (field_4417 == null) {
         field_4417 = new Thread(() -> {
            try {
               Thread.sleep(10000L);
            } catch (InterruptedException var4) {
               var4.printStackTrace();
            }

            this.method_3690();
            field_4417 = null;
         });
         field_4417.start();
      }
   }

   public void method_3689() {
      class_1792.method_7984();
   }
}
