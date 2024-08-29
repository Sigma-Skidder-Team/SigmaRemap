package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.network.Account;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import net.minecraft.client.Minecraft;

public class Class4365 extends Class4247 {
   public float field21334 = 0.0F;
   private final int field21335 = 10;
   private final int field21336 = 60;
   public int field21337;
   public int field21338;
   public int field21339;
   public int field21340;
   private Account account;

   public Class4365(Class4305 var1, String var2, int var3, int var4, int var5, int var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, Class6387.field27961, var7, false);
      this.field20913 = ResourceRegistry.JelloLightFont20;
   }

   @Override
   public void method13028(int var1, int var2) {
      this.field21337 = var1;
      this.field21338 = var2;
   }

   @Override
   public void method13027(float var1) {
      this.account = Client.getInstance().getNetworkManager().account;
      String var4 = "Log in";
      Texture var5 = ResourcesDecrypter.accountPNG;
      if (this.account != null) {
         var4 = this.account.username;
      }

      this.method13268(this.field20913.method23942(var4) + 50 + 60);
      this.method13264(Minecraft.getInstance().mainWindow.method8043() - this.field20897 - 20);
      boolean var6 = this.field21337 >= this.field20895 && this.field21338 <= this.field20896 + this.method13269();
      this.field21334 = Math.max(0.0F, Math.min(1.0F, this.field21334 + (!var6 ? -0.1F : 0.1F)));
      RenderUtil.method11463(
         (float)this.field20895, (float)this.field20896, (float)this.method13267(), (float)this.method13269(), 20.0F, this.field21334 * 0.2F * var1
      );
      RenderUtil.method11426(
         (float)this.field20895,
         (float)this.field20896,
         (float)(this.field20895 + this.method13267()),
         (float)(this.field20896 + this.method13269()),
         Class5628.method17688(ClientColors.DULL_GREEN.getColor, (0.2F * this.field21334 + (!this.method13212() ? 0.0F : 0.2F)) * var1)
      );
      float var7 = (float)(this.field20895 + this.field20897 - 60 - 10);
      float var8 = (float)(this.field20896 + 10);
      RenderUtil.method11449(
         (float)(this.field20895 + this.field20897 - 60 - 10),
         (float)(this.field20896 + 10),
         60.0F,
         60.0F,
         var5,
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, (0.5F + 0.5F * this.field21334) * var1)
      );
      RenderUtil.method11439(
         this.field20913,
         (float)(this.field20895 + this.field20897 - 90 - this.field20913.method23942(var4)),
         (float)(this.field20896 + 27),
         var4,
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, (0.5F + 0.5F * this.field21334) * var1)
      );
      super.method13027(var1);
   }
}
