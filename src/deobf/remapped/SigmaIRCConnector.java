package remapped;

import com.mojang.authlib.exceptions.AuthenticationException;
import java.io.IOException;

public class SigmaIRCConnector implements class_6224 {
   private SigmaIRC sigmaIRC;

   public SigmaIRCConnector(SigmaIRC var1) {
      this.sigmaIRC = var1;
   }

   @Override
   public void method_28452(Object... var1) {
      JSONObjectImpl var4 = (JSONObjectImpl)var1[0];
      System.out.println(var4);
      if (SigmaIRC.method_20849(this.sigmaIRC).field_9603 != null && SigmaIRC.method_20849(this.sigmaIRC).field_9603.method_5370() != null) {
         try {
            SigmaIRC.method_20847(this.sigmaIRC, SigmaIRC.method_20849(this.sigmaIRC).field_9603.method_5370(), var4.method_5861("serverHash"));
            System.out.println("s");
            JSONObjectImpl var5 = new JSONObjectImpl();
            var5.method_5820("username", SigmaIRC.method_20849(this.sigmaIRC).field_9603.method_5366());
            this.sigmaIRC.field_21933.method_19325("server-auth", var5);
         } catch (AuthenticationException | IOException | class_7584 var6) {
            var6.printStackTrace();
         }

         SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Jello connect", "Connected!", NotificationIcons.field_11030));
      }
   }
}
