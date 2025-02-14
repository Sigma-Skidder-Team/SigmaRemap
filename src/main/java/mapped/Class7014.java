package mapped;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public final class Class7014 extends Authenticator {
   private static String[] field30306;
   public final String field30307;
   public final String field30308;

   public Class7014(String var1, String var2) {
      this.field30307 = var1;
      this.field30308 = var2;
   }

   @Override
   public PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication(this.field30307, this.field30308.toCharArray());
   }
}
