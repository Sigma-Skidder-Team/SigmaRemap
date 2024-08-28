package mapped;

import com.mentalfrostbyte.jello.account.Account;

import java.util.Comparator;

public final class Class3578 implements Comparator<Account> {
   private static String[] field19518;

   public int compare(Account var1, Account var2) {
      return var1.method34237() >= var2.method34237() ? (var1.method34237() <= var2.method34237() ? 0 : -1) : 1;
   }
}
