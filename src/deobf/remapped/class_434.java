package remapped;

import net.minecraft.util.text.StringTextComponent;

public class class_434 extends class_7038 {
   public class_434(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method_32105(false);
      class_590 var9 = class_590.field_3421.method_2763();
      var9.method_2772(class_1255.field_6918.field_6917);
      class_8223 var10;
      this.method_32148(var10 = new class_8223(this, "openKeybinds", var5 / 2 - 300, var6 - 80, 300, 38, var9, "Open Keybind Manager", class_5320.field_27150));
      class_8223 var11;
      this.method_32148(var11 = new class_8223(this, "openGui", var5 / 2, var6 - 80, 300, 38, var9, "Open Jello's Click GUI", class_5320.field_27150));
      class_8223 var12;
      this.method_32148(var12 = new class_8223(this, "credits", var5 / 2 - 100, var6 - 280, 200, 38, var9, "Credits", class_5320.field_27139));
      var10.method_32100((var0, var1x) -> JelloOptionsMenu.method_7362(new KeybindManagerScreen(new StringTextComponent("Keybind Manager"))));
      var11.method_32100((var0, var1x) -> JelloOptionsMenu.method_7362(new ClassicClickGUI(new StringTextComponent("Click GUI"))));
      var12.method_32100((var0, var1x) -> JelloOptionsMenu.method_7362(new CreditsAndLicensingScreen(new StringTextComponent("GuiCredits"))));
      class_7688 var13;
      this.method_32148(var13 = new class_7688(this, "guiBlurCheckBox", var5 / 2 - 70, var6 - 220, 25, 25));
      var13.method_34833(SigmaMainClass.getInstance().getGUIManager().method_31000(), false);
      var13.method_8236(var1x -> SigmaMainClass.getInstance().getGUIManager().method_30996(var13.method_34834()));
      class_7688 var14;
      this.method_32148(var14 = new class_7688(this, "guiBlurIngameCheckBox", var5 / 2 + 130, var6 - 220, 25, 25));
      var14.method_34833(SigmaMainClass.getInstance().getGUIManager().method_30987(), false);
      var14.method_8236(var1x -> SigmaMainClass.getInstance().getGUIManager().method_30981(var14.method_34834()));
   }

   @Override
   public void method_32178(float var1) {
      this.method_2128(this.field_36270 + (this.method_32109() - 202) / 2, this.field_36261 + 10, var1);
      StringBuilder var10000 = new StringBuilder().append("You're currently using Sigma ");
      SigmaMainClass.getInstance();
      String var4 = var10000.append(SigmaMainClass.clientVersion).toString();
      FontManager.method_87(
         class_5320.field_27152,
         (float)(this.field_36270 + (this.method_32109() - class_5320.field_27152.method_18547(var4)) / 2),
         (float)(this.field_36261 + 70),
         var4,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.4F * var1)
      );
      String var5 = "Click GUI is currently bound to: "
         + class_314.method_1451(SigmaMainClass.getInstance().getModuleManager().getJelloTouch().method_380(ClassicClickGUI.class))
         + " Key";
      FontManager.method_87(
         class_5320.field_27152,
         (float)(this.method_32132() + (this.method_32109() - class_5320.field_27152.method_18547(var5)) / 2),
         (float)(this.method_32173() + this.method_32137() - 180),
         var5,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.6F * var1)
      );
      String var6 = "Configure all your keybinds in the keybind manager!";
      FontManager.method_87(
         class_5320.field_27138,
         (float)(this.method_32132() + (this.method_32109() - class_5320.field_27138.method_18547(var6)) / 2),
         (float)(this.method_32173() + this.method_32137() - 150),
         var6,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.4F * var1)
      );
      String var7 = "GUI Blur: ";
      FontManager.method_87(
         class_5320.field_27152,
         (float)(this.method_32132() + (this.method_32109() - class_5320.field_27152.method_18547(var7)) / 2 - 114),
         (float)(this.method_32173() + this.method_32137() - 221),
         var7,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.5F * var1)
      );
      String var8 = "GPU Accelerated: ";
      FontManager.method_87(
         class_5320.field_27152,
         (float)(this.method_32132() + (this.method_32109() - class_5320.field_27152.method_18547(var8)) / 2 + 52),
         (float)(this.method_32173() + this.method_32137() - 221),
         var8,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.5F * var1)
      );
      super.method_32178(var1);
   }

   private void method_2128(int var1, int var2, float var3) {
      FontManager.method_87(class_5320.field_27147, (float)var1, (float)(var2 + 1), "Jello", class_314.method_1444(class_1255.field_6918.field_6917, var3));
      FontManager.method_87(
         class_5320.field_27141, (float)(var1 + 95), (float)(var2 + 14), "for Sigma", class_314.method_1444(class_1255.field_6918.field_6917, 0.86F * var3)
      );
   }
}
