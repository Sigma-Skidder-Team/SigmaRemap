package mapped;

import com.mentalfrostbyte.jello.account.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Class8270 {
   private static String[] field35560;

   public static List<Account> method28878(List<Account> var0, Class2209 var1, String var2, String var3) {
      List var6 = method28879(var0, var1, var2);
      var3 = var3.toLowerCase();
      if (var3.length() != 0) {
         ArrayList var7 = new ArrayList();
         Iterator var8 = var6.iterator();

         while (var8.hasNext()) {
            Account var9 = (Account)var8.next();
            if (var9.getKnownName().toLowerCase().startsWith(var3)) {
               var7.add(var9);
               var8.remove();
            }
         }

         Iterator var12 = var6.iterator();

         while (var12.hasNext()) {
            Account var10 = (Account)var12.next();
            if (var10.getKnownName().toLowerCase().contains(var3)) {
               var7.add(var10);
               var12.remove();
            }
         }

         var7.addAll(var6);
         return var7;
      } else {
         return var6;
      }
   }

   public static List<Account> method28879(List<Account> var0, Class2209 var1, String var2) {
      ArrayList var5 = new ArrayList(var0);
      switch (Class8864.field40054[var1.ordinal()]) {
         case 1:
            Collections.sort(var5, new Class3591());
            break;
         case 2:
            Collections.sort(var5, new Class3587(var2));
            break;
         case 3:
            Collections.sort(var5, new Class3573());
            break;
         case 4:
            Collections.sort(var5, new Class3578());
            break;
         case 5:
            Collections.sort(var5, new Class3572());
      }

      return var5;
   }
}
