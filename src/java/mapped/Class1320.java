package mapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1320 extends Screen {
   private static final ITextComponent field6972 = new TranslationTextComponent("addServer.enterIp");
   private Class1206 field6973;
   private final ServerData field6974;
   private Class1189 field6975;
   private final BooleanConsumer field6976;
   private final Screen field6977;

   public Class1320(Screen var1, BooleanConsumer var2, ServerData var3) {
      super(new TranslationTextComponent("selectServer.direct"));
      this.field6977 = var1;
      this.field6974 = var3;
      this.field6976 = var2;
   }

   @Override
   public void tick() {
      this.field6975.method5633();
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (this.method5533() == this.field6975 && (var1 == 257 || var1 == 335)) {
         this.method6263();
         return true;
      } else {
         return super.method1920(var1, var2, var3);
      }
   }

   @Override
   public void method1921() {
      this.mc.keyboardListener.method36347(true);
      this.field6973 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 100, this.field4565 / 4 + 96 + 12, 200, 20, new TranslationTextComponent("selectServer.select"), var1 -> this.method6263()
         )
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 100, this.field4565 / 4 + 120 + 12, 200, 20, DialogTexts.GUI_CANCEL, var1 -> this.field6976.accept(false))
      );
      this.field6975 = new Class1189(this.fontRenderer, this.field4564 / 2 - 100, 116, 200, 20, new TranslationTextComponent("addServer.enterIp"));
      this.field6975.method5657(128);
      this.field6975.method5654(true);
      this.field6975.method5635(this.mc.gameSettings.field44667);
      this.field6975.method5631(var1 -> this.method6264());
      this.field4561.add(this.field6975);
      this.method5536(this.field6975);
      this.method6264();
   }

   @Override
   public void resize(Minecraft var1, int var2, int var3) {
      String var6 = this.field6975.method5636();
      this.init(var1, var2, var3);
      this.field6975.method5635(var6);
   }

   private void method6263() {
      this.field6974.field33189 = this.field6975.method5636();
      this.field6976.accept(true);
   }

   @Override
   public void method1945() {
      this.mc.displayGuiScreen(this.field6977);
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.method36347(false);
      this.mc.gameSettings.field44667 = this.field6975.method5636();
      this.mc.gameSettings.saveOptions();
   }

   private void method6264() {
      String var3 = this.field6975.method5636();
      this.field6973.field6482 = !var3.isEmpty() && var3.split(":").length > 0 && var3.indexOf(32) == -1;
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.fontRenderer, this.field4560, this.field4564 / 2, 20, 16777215);
      method5693(var1, this.fontRenderer, field6972, this.field4564 / 2 - 100, 100, 10526880);
      this.field6975.method1923(var1, var2, var3, var4);
      super.method1923(var1, var2, var3, var4);
   }
}
