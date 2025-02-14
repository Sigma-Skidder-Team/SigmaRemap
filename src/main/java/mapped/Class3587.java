package mapped;

import com.mentalfrostbyte.jello.account.Account;
import com.mentalfrostbyte.jello.account.Ban;

import java.util.Comparator;
import java.util.Date;

public final class Class3587 implements Comparator<Account> {
   private static String[] field19530;
   public final String field19531;

   public Class3587(String var1) {
      this.field19531 = var1;
   }

   public int compare(Account var1, Account var2) {
      Ban var5 = var1.getBanInfo(this.field19531);
      Ban var6 = var2.getBanInfo(this.field19531);
      Date var7;
      if (var5 != null) {
         var7 = var5.method31735();
      } else {
         var7 = new Date();
      }

      Date var8;
      if (var6 != null) {
         var8 = var6.method31735();
      } else {
         var8 = new Date();
      }

      if (var5 != null && var6 != null) {
         long var9 = var7.getTime() - new Date().getTime();
         long var11 = var8.getTime() - new Date().getTime();
         if (var9 < 0L && var11 < 0L) {
            return var8.compareTo(var7);
         }
      }

      return var7.compareTo(var8);
   }
}
