package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.util.Util;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1138 extends Class1135 {
   public KeyBinding field6199;
   public long field6200;
   private Class1295 field6201;
   private Class1206 field6202;

   public Class1138(Screen var1, GameSettings var2) {
      super(var1, var2, new TranslationTextComponent("controls.title"));
   }

   @Override
   public void method1921() {
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 155,
            18,
            150,
            20,
            new TranslationTextComponent("options.mouse_settings"),
            var1 -> this.mc.displayGuiScreen(new Class1143(this, this.field6193))
         )
      );
      this.<Class1197>method2455(AbstractOption.field25351.method17946(this.field6193, this.field4564 / 2 - 155 + 160, 18, 150));
      this.field6201 = new Class1295(this, this.mc);
      this.field4561.add(this.field6201);
      this.field6202 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 155, this.field4565 - 29, 150, 20, new TranslationTextComponent("controls.resetAll"), var1 -> {
            for (KeyBinding var7 : this.field6193.field44658) {
               var7.method8515(var7.method8514());
            }

            KeyBinding.method8508();
         })
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 155 + 160, this.field4565 - 29, 150, 20, DialogTexts.field30658, var1 -> this.mc.displayGuiScreen(this.field6192))
      );
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (this.field6199 == null) {
         return super.method1958(var1, var3, var5);
      } else {
         this.field6193.method37142(this.field6199, Class1938.field12594.method8197(var5));
         this.field6199 = null;
         KeyBinding.method8508();
         return true;
      }
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (this.field6199 == null) {
         return super.method1920(var1, var2, var3);
      } else {
         if (var1 != 256) {
            this.field6193.method37142(this.field6199, Class9798.method38637(var1, var2));
         } else {
            this.field6193.method37142(this.field6199, Class9798.field45819);
         }

         this.field6199 = null;
         this.field6200 = Util.milliTime();
         KeyBinding.method8508();
         return true;
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      this.field6201.method1923(var1, var2, var3, var4);
      method5691(var1, this.fontRenderer, this.field4560, this.field4564 / 2, 8, 16777215);
      boolean var7 = false;

      for (KeyBinding var11 : this.field6193.field44658) {
         if (!var11.method8522()) {
            var7 = true;
            break;
         }
      }

      this.field6202.field6482 = var7;
      super.method1923(var1, var2, var3, var4);
   }
}
