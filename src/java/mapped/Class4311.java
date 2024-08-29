package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.account.Account;
import com.mentalfrostbyte.jello.account.AccountManager;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4307;
import org.lwjgl.glfw.GLFW;

public class Class4311 extends Class4307 {
   public Class4282 field20985;
   public Class4282 field20986;
   public Class4300 field20987;
   public Class4300 field20988;
   public Class4300 field20989;
   public AccountManager field20990 = Client.getInstance().getAccountManager();
   private String field20991 = "§7Idle...";

   public Class4311() {
      super("Alt Manager");
      this.method13300(false);
      short var3 = 400;
      int var4 = 114;
      int var5 = (this.method13267() - var3) / 2;
      this.method13230(
         this.field20985 = new Class4282(this, "username", var5, var4, var3, 45, Class4282.field20741, "", "Username / E-Mail", ResourceRegistry.field38868)
      );
      var4 += 80;
      this.method13230(this.field20986 = new Class4282(this, "password", var5, var4, var3, 45, Class4282.field20741, "", "Password", ResourceRegistry.field38868));
      var4 += 190;
      this.method13230(this.field20987 = new Class4300(this, "login", var5, var4, var3, 40, "Login", ClientColors.MID_GREY.getColor));
      var4 += 50;
      this.method13230(this.field20988 = new Class4300(this, "back", var5, var4, var3, 40, "Back", ClientColors.MID_GREY.getColor));
      var4 += 50;
      this.method13230(this.field20989 = new Class4300(this, "import", var5, var4, var3, 40, "Import user:pass", ClientColors.MID_GREY.getColor));
      this.field20986.method13155(true);
      this.field20986.method13147("*");
      this.field20987.method13251((var1, var2) -> {
         this.field20991 = "§bLogging in...";
         new Thread(() -> {
            Account var3x = new Account(this.field20985.method13303(), this.field20986.method13303());
            if (!this.field20990.login(var3x)) {
               this.field20991 = "§cLogin failed!";
            } else {
               this.field20991 = "Logged in. (" + var3x.getEmail() + (!var3x.isEmailAValidEmailFormat() ? "" : " - offline name") + ")";
            }
         }).start();
      });
      this.field20988.method13251((var0, var1) -> Client.getInstance().getGuiManager().method33482(new Class4317()));
      this.field20989.method13251((var1, var2) -> {
         String var5x = "";

         try {
            var5x = GLFW.glfwGetClipboardString(Minecraft.getInstance().mainWindow.getHandle());
         } catch (Exception var7x) {
         }

         if (var5x != "" && var5x.contains(":")) {
            String[] var6x = var5x.split(":");
            if (var6x.length == 2) {
               this.field20985.method13304(var6x[0].replace("\n", ""));
               this.field20986.method13304(var6x[1].replace("\n", ""));
            }
         }
      });
   }

   @Override
   public void method13027(float var1) {
      RenderUtil.method11455(0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), ClassicDecryption.mainmenubackground);
      RenderUtil.method11426(0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), Class5628.method17688(ClientColors.PALE_RED.getColor, 0.1F));
      RenderUtil.method11426(0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.95F));
      RenderUtil.method11440(
         ResourceRegistry.field38868, (float)(this.method13267() / 2), 38.0F, "Add Login", ClientColors.LIGHT_GREYISH_BLUE.getColor, Class2218.field14492, Class2218.field14488
      );
      RenderUtil.method11441(
         ResourceRegistry.field38868,
         (float)(this.method13267() / 2),
         58.0F,
         this.field20991,
         ClientColors.LIGHT_GREYISH_BLUE.getColor,
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
