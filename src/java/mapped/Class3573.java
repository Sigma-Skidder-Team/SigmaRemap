package mapped;

import com.mentalfrostbyte.jello.account.Account;

import java.util.Comparator;

public final class Class3573 implements Comparator<Account> {
   private static String[] field19512;

   public int compare(Account var1, Account var2) {
      return var1.method34238() >= var2.method34238() ? (var1.method34238() <= var2.method34238() ? 0 : -1) : 1;
   }
}
