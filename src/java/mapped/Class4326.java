package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.account.Account;
import com.mentalfrostbyte.jello.account.AccountManager;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4307;
import org.lwjgl.glfw.GLFW;

public class Class4326 extends Class4307 {
   public Class4282 field21116;
   public Class4282 field21117;
   public Class4300 field21118;
   public Class4300 field21119;
   public Class4300 field21120;
   public AccountManager field21121 = Client.getInstance().getAccountManager();
   private String field21122 = "§7Idle...";

   public Class4326() {
      super("Alt Manager");
      this.method13300(false);
      short var3 = 400;
      int var4 = 114;
      int var5 = (this.method13267() - var3) / 2;
      this.method13230(
         this.field21116 = new Class4282(this, "username", var5, var4, var3, 45, Class4282.field20741, "", "Username / E-Mail", ResourceRegistry.field38868)
      );
      var4 += 80;
      this.method13230(this.field21117 = new Class4282(this, "password", var5, var4, var3, 45, Class4282.field20741, "", "Password", ResourceRegistry.field38868));
      var4 += 190;
      this.method13230(this.field21118 = new Class4300(this, "login", var5, var4, var3, 40, "Login", Class1979.field12899.field12910));
      var4 += 50;
      this.method13230(this.field21119 = new Class4300(this, "back", var5, var4, var3, 40, "Back", Class1979.field12899.field12910));
      var4 += 50;
      this.method13230(this.field21120 = new Class4300(this, "import", var5, var4, var3, 40, "Import user:pass", Class1979.field12899.field12910));
      this.field21117.method13155(true);
      this.field21117.method13147("*");
      this.field21118.method13251((var1, var2) -> {
         this.field21122 = "§bLogging in...";
         new Thread(() -> {
            Account var3x = new Account(this.field21116.method13303(), this.field21117.method13303());
            if (!this.field21121.updateSelectedEmail(var3x)) {
               this.field21122 = "§cAlt failed!";
            } else {
               this.field21121.updateAccount(var3x);
               this.field21122 = "Alt added. (" + var3x.getEmail() + (!var3x.isEmailAValidEmailFormat() ? "" : " - offline name") + ")";
            }
         }).start();
      });
      this.field21119.method13251((var0, var1) -> Client.getInstance().getGuiManager().method33482(new Class4317()));
      this.field21120.method13251((var1, var2) -> {
         String var5x = "";

         try {
            var5x = GLFW.glfwGetClipboardString(Minecraft.getInstance().mainWindow.getHandle());
         } catch (Exception var7x) {
         }

         if (var5x != "" && var5x.contains(":")) {
            String[] var6x = var5x.split(":");
            if (var6x.length == 2) {
               this.field21116.method13304(var6x[0].replace("\n", ""));
               this.field21117.method13304(var6x[1].replace("\n", ""));
            }
         }
      });
   }

   @Override
   public void method13027(float var1) {
      Class3192.method11455(0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), ClassicDecryption.mainmenubackground);
      Class3192.method11426(0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), Class5628.method17688(Class1979.field12908.field12910, 0.1F));
      Class3192.method11426(0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), Class5628.method17688(Class1979.field12891.field12910, 0.95F));
      Class3192.method11440(
         ResourceRegistry.field38868, (float)(this.method13267() / 2), 38.0F, "Add Alt", Class1979.field12896.field12910, Class2218.field14492, Class2218.field14488
      );
      Class3192.method11441(
         ResourceRegistry.field38868,
         (float)(this.method13267() / 2),
         58.0F,
         this.field21122,
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
