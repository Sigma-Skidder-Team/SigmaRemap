package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.account.Account;
import com.mentalfrostbyte.jello.account.AccountManager;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4307;

public class Class4314 extends Class4307 {
   public Class4282 field21027;
   public Class4282 field21028;
   public Class4300 field21029;
   public Class4300 field21030;
   public AccountManager field21031 = Client.getInstance().getAccountManager();
   private String field21032 = "§7Waiting...";

   public Class4314(Account var1) {
      super("Alt Manager");
      this.method13300(false);
      short var4 = 400;
      int var5 = 114;
      int var6 = (this.method13267() - var4) / 2;
      this.method13230(this.field21027 = new Class4282(this, "username", var6, var5, var4, 45, Class4282.field20741, "", "New name", ResourceRegistry.field38868));
      var5 += 80;
      this.method13230(this.field21028 = new Class4282(this, "password", var6, var5, var4, 45, Class4282.field20741, "", "New password", ResourceRegistry.field38868));
      var5 += 190;
      this.method13230(this.field21029 = new Class4300(this, "edit", var6, var5, var4, 40, "Edit", Class1979.field12899.field12910));
      var5 += 50;
      this.method13230(this.field21030 = new Class4300(this, "back", var6, var5, var4, 40, "Cancel", Class1979.field12899.field12910));
      this.field21028.method13155(true);
      this.field21028.method13147("*");
      this.field21029.method13251((var2, var3) -> {
         if (this.field21027.method13303().length() > 0) {
            if (!this.field21027.method13303().equals(var1.method34216())) {
               var1.method34225(this.field21027.method13303());
            }

            var1.method34222(this.field21027.method13303());
         }

         var1.method34221(this.field21028.method13303());
         this.field21032 = "Edited!";
      });
      this.field21030.method13251((var0, var1x) -> Client.getInstance().getGuiManager().method33482(new Class4317()));
   }

   @Override
   public void method13027(float var1) {
      Class3192.method11455(0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), Class7925.field33940);
      Class3192.method11426(0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), Class5628.method17688(Class1979.field12908.field12910, 0.1F));
      Class3192.method11426(0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), Class5628.method17688(Class1979.field12891.field12910, 0.95F));
      Class3192.method11440(
         ResourceRegistry.field38868, (float)(this.method13267() / 2), 20.0F, "Edit Alt", Class1979.field12896.field12910, Class2218.field14492, Class2218.field14488
      );
      Class3192.method11441(
         ResourceRegistry.field38868,
         (float)(this.method13267() / 2),
         40.0F,
         this.field21032,
         Class1979.field12896.field12910,
         Class2218.field14492,
         Class2218.field14488,
         true
      );
      super.method13027(var1);
   }

   @Override
   public void method13065(int var1) {
      super.method13065(var1);
      if (var1 == 256) {
         Client.getInstance().getGuiManager().method33482(new Class4317());
      }
   }
}
