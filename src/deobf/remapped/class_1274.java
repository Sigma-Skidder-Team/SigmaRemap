package remapped;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public final class class_1274 extends Authenticator {
   private static String[] field_7010;

   public class_1274(String var1, String var2) {
      this.field_7009 = var1;
      this.field_7011 = var2;
   }

   @Override
   public PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication(this.field_7009, this.field_7011.toCharArray());
   }
}
