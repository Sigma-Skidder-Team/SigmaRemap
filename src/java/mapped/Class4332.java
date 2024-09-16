package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.account.Account;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import net.minecraft.client.Minecraft;

import java.util.Random;

public class Class4332 extends IconPanel {
   public Class4300 field21140;
   public Class4300 field21141;
   public Class4300 field21142;
   public Class4300 field21143;
   public Class4300 field21144;
   public Class4300 field21145;
   public Class4300 field21146;
   public Class4300 field21147;
   public Class4300 field21148;

   public Class4332(IconPanel var1, String var2, int var3, int var4) {
      super(var1, var2, var3, var4, 760, 87);
      this.addToList(this.field21140 = new Class4300(this, "reload", 0, 0, 120, 40, "Reload", ClientColors.DEEP_TEAL.getColor));
      this.addToList(this.field21141 = new Class4300(this, "back", 0, 48, 120, 40, "Back", ClientColors.DEEP_TEAL.getColor));
      short var7 = 200;
      short var8 = 146;
      int var9 = this.method13267() - 625;
      this.addToList(this.field21142 = new Class4300(this, "login", var9, 0, var7, 40, "Login", ClientColors.DEEP_TEAL.getColor));
      this.addToList(this.field21145 = new Class4300(this, "direct", var9 + var7 + 16, 0, var7, 40, "Direct Login", ClientColors.DEEP_TEAL.getColor));
      this.addToList(this.field21147 = new Class4300(this, "add", var9 + var7 * 2 + 32, 0, var7, 40, "Add", ClientColors.DEEP_TEAL.getColor));
      this.addToList(this.field21143 = new Class4300(this, "random", var9, 48, var8, 40, "Random", ClientColors.DEEP_TEAL.getColor));
      this.addToList(this.field21144 = new Class4300(this, "remove", var9 + var8 + 16, 48, var8, 40, "Remove", ClientColors.DEEP_TEAL.getColor));
      this.addToList(this.field21146 = new Class4300(this, "edit", var9 + var8 * 2 + 32, 48, var8, 40, "Edit", ClientColors.DEEP_TEAL.getColor));
      this.addToList(this.field21148 = new Class4300(this, "alpha", var9 + var8 * 3 + 48, 48, var8, 40, "Alphalts", ClientColors.DEEP_TEAL.getColor));
      SigmaClassicAltManager var10 = (SigmaClassicAltManager)this.method13258();
      this.field21143
         .doThis(
            (var1x, var2x) -> {
               Account var5 = Client.getInstance()
                  .getAccountManager()
                  .getAccounts()
                  .get(new Random().nextInt(Client.getInstance().getAccountManager().getAccounts().size()));
               var10.method13399(var5);
            }
         );
      this.field21141.doThis((var0, var1x) -> Minecraft.getInstance().displayGuiScreen(new VanillaMainMenuScreen()));
      this.field21142.doThis((var1x, var2x) -> var10.method13396());
      this.field21144.doThis((var1x, var2x) -> var10.method13397());
      this.field21146.doThis((var1x, var2x) -> {
         Class4349 var5 = var10.method13406();
         if (var5 != null) {
            Client.getInstance().getGuiManager().method33482(new Class4314(var5.field21249));
         }
      });
      this.field21147.doThis((var0, var1x) -> Client.getInstance().getGuiManager().method33482(new Class4326()));
      this.field21145.doThis((var0, var1x) -> Client.getInstance().getGuiManager().method33482(new Class4311()));
   }

   @Override
   public void method13296(boolean var1) {
      this.field21144.method13296(var1);
      this.field21146.method13296(var1);
      this.field21142.method13296(var1);
   }

   public boolean method13469() {
      return this.field21144.isHovered();
   }
}
