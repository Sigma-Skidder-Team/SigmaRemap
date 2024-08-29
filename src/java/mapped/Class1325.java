package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class Class1325 extends Screen {
   private static final ITextComponent field7007 = new TranslationTextComponent("advMode.setCommand");
   private static final ITextComponent field7008 = new TranslationTextComponent("advMode.command");
   private static final ITextComponent field7009 = new TranslationTextComponent("advMode.previousOutput");
   public Class1189 field7010;
   public Class1189 field7011;
   public Class1206 field7012;
   public Class1206 field7013;
   public Class1206 field7014;
   public boolean field7015;
   private Class6850 field7016;

   public Class1325() {
      super(NarratorChatListener.field29300);
   }

   @Override
   public void tick() {
      this.field7010.method5633();
   }

   public abstract Class911 method6304();

   public abstract int method6305();

   @Override
   public void method1921() {
      this.field4562.keyboardListener.method36347(true);
      this.field7012 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 4 - 150, this.field4565 / 4 + 120 + 12, 150, 20, DialogTexts.field30658, var1 -> this.method6307())
      );
      this.field7013 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 4, this.field4565 / 4 + 120 + 12, 150, 20, DialogTexts.GUI_CANCEL, var1 -> this.method1945())
      );
      this.field7014 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 150 - 20, this.method6305(), 20, 20, new StringTextComponent("O"), var1 -> {
            Class911 var4 = this.method6304();
            var4.method3570(!var4.method3571());
            this.method6306();
         })
      );
      this.field7010 = new Class1300(this, this.field4568, this.field4564 / 2 - 150, 50, 300, 20, new TranslationTextComponent("advMode.command"));
      this.field7010.method5657(32500);
      this.field7010.method5631(this::method6309);
      this.field4561.add(this.field7010);
      this.field7011 = new Class1189(
         this.field4568, this.field4564 / 2 - 150, this.method6305(), 276, 20, new TranslationTextComponent("advMode.previousOutput")
      );
      this.field7011.method5657(32500);
      this.field7011.method5666(false);
      this.field7011.method5635("-");
      this.field4561.add(this.field7011);
      this.method5536(this.field7010);
      this.field7010.method5654(true);
      this.field7016 = new Class6850(this.field4562, this, this.field7010, this.field4568, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.field7016.method20829(true);
      this.field7016.method20835();
   }

   @Override
   public void resize(Minecraft var1, int var2, int var3) {
      String var6 = this.field7010.method5636();
      this.init(var1, var2, var3);
      this.field7010.method5635(var6);
      this.field7016.method20835();
   }

   public void method6306() {
      if (!this.method6304().method3571()) {
         this.field7014.method5743(new StringTextComponent("X"));
         this.field7011.method5635("-");
      } else {
         this.field7014.method5743(new StringTextComponent("O"));
         this.field7011.method5635(this.method6304().method3559().getString());
      }
   }

   public void method6307() {
      Class911 var3 = this.method6304();
      this.method6308(var3);
      if (!var3.method3571()) {
         var3.method3569((ITextComponent)null);
      }

      this.field4562.displayGuiScreen((Screen)null);
   }

   @Override
   public void onClose() {
      this.field4562.keyboardListener.method36347(false);
   }

   public abstract void method6308(Class911 var1);

   @Override
   public void method1945() {
      this.method6304().method3570(this.field7015);
      this.field4562.displayGuiScreen((Screen)null);
   }

   private void method6309(String var1) {
      this.field7016.method20835();
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (!this.field7016.method20830(var1, var2, var3)) {
         if (!super.method1920(var1, var2, var3)) {
            if (var1 != 257 && var1 != 335) {
               return false;
            } else {
               this.method6307();
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   @Override
   public boolean method2649(double var1, double var3, double var5) {
      return !this.field7016.method20831(var5) ? super.method2649(var1, var3, var5) : true;
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      return !this.field7016.method20832(var1, var3, var5) ? super.method1958(var1, var3, var5) : true;
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, field7007, this.field4564 / 2, 20, 16777215);
      method5693(var1, this.field4568, field7008, this.field4564 / 2 - 150, 40, 10526880);
      this.field7010.method1923(var1, var2, var3, var4);
      int var7 = 75;
      if (!this.field7011.method5636().isEmpty()) {
         var7 += 46 + this.method6305() - 135;
         method5693(var1, this.field4568, field7009, this.field4564 / 2 - 150, var7 + 4, 10526880);
         this.field7011.method1923(var1, var2, var3, var4);
      }

      super.method1923(var1, var2, var3, var4);
      this.field7016.method20843(var1, var2, var3);
   }

   // $VF: synthetic method
   public static Class6850 method6313(Class1325 var0) {
      return var0.field7016;
   }
}
