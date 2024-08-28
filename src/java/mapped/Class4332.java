package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.account.Account;
import com.mentalfrostbyte.jello.unmapped.Class4305;

import java.util.Random;

public class Class4332 extends Class4305 {
   public Class4300 field21140;
   public Class4300 field21141;
   public Class4300 field21142;
   public Class4300 field21143;
   public Class4300 field21144;
   public Class4300 field21145;
   public Class4300 field21146;
   public Class4300 field21147;
   public Class4300 field21148;

   public Class4332(Class4305 var1, String var2, int var3, int var4) {
      super(var1, var2, var3, var4, 760, 87);
      this.method13230(this.field21140 = new Class4300(this, "reload", 0, 0, 120, 40, "Reload", Class1979.field12891.field12910));
      this.method13230(this.field21141 = new Class4300(this, "back", 0, 48, 120, 40, "Back", Class1979.field12891.field12910));
      short var7 = 200;
      short var8 = 146;
      int var9 = this.method13267() - 625;
      this.method13230(this.field21142 = new Class4300(this, "login", var9, 0, var7, 40, "Login", Class1979.field12891.field12910));
      this.method13230(this.field21145 = new Class4300(this, "direct", var9 + var7 + 16, 0, var7, 40, "Direct Login", Class1979.field12891.field12910));
      this.method13230(this.field21147 = new Class4300(this, "add", var9 + var7 * 2 + 32, 0, var7, 40, "Add", Class1979.field12891.field12910));
      this.method13230(this.field21143 = new Class4300(this, "random", var9, 48, var8, 40, "Random", Class1979.field12891.field12910));
      this.method13230(this.field21144 = new Class4300(this, "remove", var9 + var8 + 16, 48, var8, 40, "Remove", Class1979.field12891.field12910));
      this.method13230(this.field21146 = new Class4300(this, "edit", var9 + var8 * 2 + 32, 48, var8, 40, "Edit", Class1979.field12891.field12910));
      this.method13230(this.field21148 = new Class4300(this, "alpha", var9 + var8 * 3 + 48, 48, var8, 40, "Alphalts", Class1979.field12891.field12910));
      Class4317 var10 = (Class4317)this.method13258();
      this.field21143
         .method13251(
            (var1x, var2x) -> {
               Account var5 = Client.getInstance()
                  .getAccountManager()
                  .method36775()
                  .get(new Random().nextInt(Client.getInstance().getAccountManager().method36775().size()));
               var10.method13399(var5);
            }
         );
      this.field21141.method13251((var0, var1x) -> Minecraft.getInstance().displayGuiScreen(new MainMenuScreen()));
      this.field21142.method13251((var1x, var2x) -> var10.method13396());
      this.field21144.method13251((var1x, var2x) -> var10.method13397());
      this.field21146.method13251((var1x, var2x) -> {
         Class4349 var5 = var10.method13406();
         if (var5 != null) {
            Client.getInstance().getGuiManager().method33482(new Class4314(var5.field21249));
         }
      });
      this.field21147.method13251((var0, var1x) -> Client.getInstance().getGuiManager().method33482(new Class4326()));
      this.field21145.method13251((var0, var1x) -> Client.getInstance().getGuiManager().method33482(new Class4311()));
   }

   @Override
   public void method13296(boolean var1) {
      this.field21144.method13296(var1);
      this.field21146.method13296(var1);
      this.field21142.method13296(var1);
   }

   public boolean method13469() {
      return this.field21144.method13295();
   }
}
