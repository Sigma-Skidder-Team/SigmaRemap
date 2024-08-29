package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.util.Locale;

public class Class803 extends Class798 {
   private final Screen field4191;
   private final Class6122 field4192;
   private Class1278 field4193;

   public Class803(Screen var1, Class6122 var2) {
      this.field4191 = var1;
      this.field4192 = var2;
   }

   @Override
   public void tick() {
   }

   @Override
   public void method1921() {
      this.mc.keyboardListener.method36347(true);
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 100, this.field4565 / 4 + 120 + 24, 200, 20, DialogTexts.field30663, var1 -> this.mc.displayGuiScreen(this.field4191)
         )
      );
      this.field4193 = new Class1278(this, this.mc);
      this.<Class1278>method2456(this.field4193);
      this.method5537(this.field4193);
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.method36347(false);
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.mc.displayGuiScreen(this.field4191);
         return true;
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5690(var1, this.fontRenderer, "Changes from last backup", this.field4564 / 2, 10, 16777215);
      this.field4193.method1923(var1, var2, var3, var4);
      super.method1923(var1, var2, var3, var4);
   }

   private ITextComponent method1949(String var1, String var2) {
      String var5 = var1.toLowerCase(Locale.ROOT);
      if (var5.contains("game") && var5.contains("mode")) {
         return this.method1951(var2);
      } else {
         return (ITextComponent)(var5.contains("game") && var5.contains("difficulty") ? this.method1950(var2) : new StringTextComponent(var2));
      }
   }

   private ITextComponent method1950(String var1) {
      try {
         return Class1343.field7132[Integer.parseInt(var1)];
      } catch (Exception var5) {
         return new StringTextComponent("UNKNOWN");
      }
   }

   private ITextComponent method1951(String var1) {
      try {
         return Class1343.field7133[Integer.parseInt(var1)];
      } catch (Exception var5) {
         return new StringTextComponent("UNKNOWN");
      }
   }

   // $VF: synthetic method
   public static Minecraft method1953(Class803 var0) {
      return var0.mc;
   }

   // $VF: synthetic method
   public static ITextComponent method1954(Class803 var0, String var1, String var2) {
      return var0.method1949(var1, var2);
   }

   // $VF: synthetic method
   public static Class6122 method1955(Class803 var0) {
      return var0.field4192;
   }
}
