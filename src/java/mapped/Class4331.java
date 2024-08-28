package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import net.minecraft.util.text.StringTextComponent;

public class Class4331 extends Class4305 {
   public Class4331(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method13300(false);
      Class6387 var9 = Class6387.field27961.method19415();
      var9.method19406(Class1979.field12896.field12910);
      Class4274 var10;
      this.method13230(var10 = new Class4274(this, "openKeybinds", var5 / 2 - 300, var6 - 80, 300, 38, var9, "Open Keybind Manager", ResourceRegistry.field38859));
      Class4274 var11;
      this.method13230(var11 = new Class4274(this, "openGui", var5 / 2, var6 - 80, 300, 38, var9, "Open Jello's Click GUI", ResourceRegistry.field38859));
      Class4274 var12;
      this.method13230(var12 = new Class4274(this, "credits", var5 / 2 - 100, var6 - 280, 200, 38, var9, "Credits", ResourceRegistry.JelloLightFont18));
      var10.method13251((var0, var1x) -> Class4325.method13438(new Class1144(new StringTextComponent("Keybind Manager"))));
      var11.method13251((var0, var1x) -> Class4325.method13438(new Class1145(new StringTextComponent("Click GUI"))));
      var12.method13251((var0, var1x) -> Class4325.method13438(new Class1133(new StringTextComponent("GuiCredits"))));
      Class4373 var13;
      this.method13230(var13 = new Class4373(this, "guiBlurCheckBox", var5 / 2 - 70, var6 - 220, 25, 25));
      var13.method13705(Client.getInstance().getGuiManager().method33470(), false);
      var13.method13036(var1x -> Client.getInstance().getGuiManager().method33469(var13.method13703()));
      Class4373 var14;
      this.method13230(var14 = new Class4373(this, "guiBlurIngameCheckBox", var5 / 2 + 130, var6 - 220, 25, 25));
      var14.method13705(Client.getInstance().getGuiManager().method33472(), false);
      var14.method13036(var1x -> Client.getInstance().getGuiManager().method33471(var14.method13703()));
   }

   @Override
   public void method13027(float var1) {
      this.method13463(this.field20895 + (this.method13267() - 202) / 2, this.field20896 + 10, var1);
      StringBuilder var10000 = new StringBuilder().append("You're currently using Sigma ");
      Client.getInstance();
      String var4 = var10000.append(Client.VERSION).toString();
      Class3192.method11439(
         ResourceRegistry.JelloLightFont20,
         (float)(this.field20895 + (this.method13267() - ResourceRegistry.JelloLightFont20.method23942(var4)) / 2),
         (float)(this.field20896 + 70),
         var4,
         Class5628.method17688(Class1979.field12896.field12910, 0.4F * var1)
      );
      String var5 = "Click GUI is currently bound to: "
         + Class5628.method17736(Client.getInstance().getModuleManager().method14668().method13728(Class1145.class))
         + " Key";
      Class3192.method11439(
         ResourceRegistry.JelloLightFont20,
         (float)(this.method13263() + (this.method13267() - ResourceRegistry.JelloLightFont20.method23942(var5)) / 2),
         (float)(this.method13265() + this.method13269() - 180),
         var5,
         Class5628.method17688(Class1979.field12896.field12910, 0.6F * var1)
      );
      String var6 = "Configure all your keybinds in the keybind manager!";
      Class3192.method11439(
         ResourceRegistry.JelloLightFont14,
         (float)(this.method13263() + (this.method13267() - ResourceRegistry.JelloLightFont14.method23942(var6)) / 2),
         (float)(this.method13265() + this.method13269() - 150),
         var6,
         Class5628.method17688(Class1979.field12896.field12910, 0.4F * var1)
      );
      String var7 = "GUI Blur: ";
      Class3192.method11439(
         ResourceRegistry.JelloLightFont20,
         (float)(this.method13263() + (this.method13267() - ResourceRegistry.JelloLightFont20.method23942(var7)) / 2 - 114),
         (float)(this.method13265() + this.method13269() - 221),
         var7,
         Class5628.method17688(Class1979.field12896.field12910, 0.5F * var1)
      );
      String var8 = "GPU Accelerated: ";
      Class3192.method11439(
         ResourceRegistry.JelloLightFont20,
         (float)(this.method13263() + (this.method13267() - ResourceRegistry.JelloLightFont20.method23942(var8)) / 2 + 52),
         (float)(this.method13265() + this.method13269() - 221),
         var8,
         Class5628.method17688(Class1979.field12896.field12910, 0.5F * var1)
      );
      super.method13027(var1);
   }

   private void method13463(int var1, int var2, float var3) {
      Class3192.method11439(ResourceRegistry.JelloMediumFont40, (float)var1, (float)(var2 + 1), "Jello", Class5628.method17688(Class1979.field12896.field12910, var3));
      Class3192.method11439(
         ResourceRegistry.JelloLightFont25, (float)(var1 + 95), (float)(var2 + 14), "for Sigma", Class5628.method17688(Class1979.field12896.field12910, 0.86F * var3)
      );
   }
}
