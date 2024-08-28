package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.locks.ReentrantLock;

public class Class817 extends Class798 {
   private static final Logger field4445 = LogManager.getLogger();
   private static final ITextComponent field4446 = new TranslationTextComponent("mco.terms.title");
   private static final ITextComponent field4447 = new TranslationTextComponent("mco.terms.sentence.1");
   private static final ITextComponent field4448 = new StringTextComponent(" ")
      .append(new TranslationTextComponent("mco.terms.sentence.2").mergeStyle(Style.EMPTY.func_244282_c(true)));
   private final Screen field4449;
   private final Class806 field4450;
   private final Class6128 field4451;
   private boolean field4452;
   private final String field4453 = "https://aka.ms/MinecraftRealmsTerms";

   public Class817(Screen var1, Class806 var2, Class6128 var3) {
      this.field4449 = var1;
      this.field4450 = var2;
      this.field4451 = var3;
   }

   @Override
   public void method1921() {
      this.field4562.field1302.method36347(true);
      int var3 = this.field4564 / 4 - 2;
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 4, method1929(12), var3, 20, new TranslationTextComponent("mco.terms.buttons.agree"), var1 -> this.method2325())
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 4,
            method1929(12),
            var3,
            20,
            new TranslationTextComponent("mco.terms.buttons.disagree"),
            var1 -> this.field4562.displayGuiScreen(this.field4449)
         )
      );
   }

   @Override
   public void method1931() {
      this.field4562.field1302.method36347(false);
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.field4562.displayGuiScreen(this.field4449);
         return true;
      }
   }

   private void method2325() {
      Class4624 var3 = Class4624.method14543();

      try {
         var3.method14579();
         this.field4562.displayGuiScreen(new Class797(this.field4449, new Class791(this.field4450, this.field4449, this.field4451, new ReentrantLock())));
      } catch (Class2435 var5) {
         field4445.error("Couldn't agree to TOS");
      }
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (!this.field4452) {
         return super.method1958(var1, var3, var5);
      } else {
         this.field4562.field1302.method36350("https://aka.ms/MinecraftRealmsTerms");
         Util.getOSType().method8181("https://aka.ms/MinecraftRealmsTerms");
         return true;
      }
   }

   @Override
   public String method2326() {
      return super.method2326() + ". " + field4447.getString() + " " + field4448.getString();
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, field4446, this.field4564 / 2, 17, 16777215);
      this.field4568.method38805(var1, field4447, (float)(this.field4564 / 2 - 120), (float)method1929(5), 16777215);
      int var7 = this.field4568.method38821(field4447);
      int var8 = this.field4564 / 2 - 121 + var7;
      int var9 = method1929(5);
      int var10 = var8 + this.field4568.method38821(field4448) + 1;
      int var11 = var9 + 1 + 9;
      this.field4452 = var8 <= var2 && var2 <= var10 && var9 <= var3 && var3 <= var11;
      this.field4568.method38805(var1, field4448, (float)(this.field4564 / 2 - 120 + var7), (float)method1929(5), !this.field4452 ? 3368635 : 7107012);
      super.method1923(var1, var2, var3, var4);
   }
}
