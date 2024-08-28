package mapped;

import com.mentalfrostbyte.jello.account.Account;
import com.mentalfrostbyte.jello.unmapped.Class4305;

import java.util.List;

public class Class1428 implements Runnable {
   public final Class4313 field7661;
   public final List<Account> field7662;
   public final boolean field7663;
   public final Class4313 field7664;

   public Class1428(Class4313 var1, Class4313 var2, List var3, boolean var4) {
      this.field7664 = var1;
      this.field7661 = var2;
      this.field7662 = var3;
      this.field7663 = var4;
   }

   @Override
   public void run() {
      int var3 = 0;
      if (Class4313.method13382(this.field7664) != null) {
         var3 = Class4313.method13382(this.field7664).method13513();
         this.field7661.method13236(Class4313.method13382(this.field7664));
      }

      Class4305 var4 = this.field7661.method13221("alts");
      if (var4 != null) {
         this.field7661.method13236(var4);
      }

      this.field7661
         .method13233(
            Class4313.method13383(
               this.field7664,
               new Class4339(
                  this.field7661,
                  "alts",
                  0,
                  114,
                  (int)((float) Minecraft.getInstance().field1283.method8043() * Class4313.method13384(this.field7664)) - 4,
                  Minecraft.getInstance().field1283.method8044() - 119 - Class4313.method13385(this.field7664)
               )
            )
         );

      for (Account var6 : this.field7662) {
         Class4313.method13386(this.field7664, var6, this.field7663);
      }

      Class4313.method13382(this.field7664).method13512(var3);
      Class4313.method13382(this.field7664).method13300(false);
      Class4313.method13382(this.field7664).method13515(false);
   }
}
