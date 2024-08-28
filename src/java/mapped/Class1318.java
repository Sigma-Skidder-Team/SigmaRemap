package mapped;

import com.google.common.collect.Lists;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.List;
import java.util.Optional;

public class Class1318 extends Screen {
   private static final ResourceLocation field6962 = new ResourceLocation("textures/gui/container/gamemode_switcher.png");
   private static final int field6963 = Class2150.values().length * 30 - 5;
   private static final ITextComponent field6964 = new TranslationTextComponent(
      "debug.gamemodes.select_next", new TranslationTextComponent("debug.gamemodes.press_f4").mergeStyle(TextFormatting.AQUA)
   );
   private final Optional<Class2150> field6965;
   private Optional<Class2150> field6966 = Optional.<Class2150>empty();
   private int field6967;
   private int field6968;
   private boolean field6969;
   private final List<Class1198> field6970 = Lists.newArrayList();

   public Class1318() {
      super(Class6688.field29300);
      this.field6965 = Class2150.method8860(this.method6256());
   }

   private Class1894 method6256() {
      Class1894 var3 = Minecraft.getInstance().field1337.method23157();
      Class1894 var4 = Minecraft.getInstance().field1337.method23156();
      if (var4 == Class1894.field11101) {
         if (var3 != Class1894.field11103) {
            var4 = Class1894.field11103;
         } else {
            var4 = Class1894.field11102;
         }
      }

      return var4;
   }

   @Override
   public void method1921() {
      super.method1921();
      this.field6966 = !this.field6965.isPresent() ? Class2150.method8860(this.field4562.field1337.method23157()) : this.field6965;

      for (int var3 = 0; var3 < Class2150.field14059.length; var3++) {
         Class2150 var4 = Class2150.field14059[var3];
         this.field6970.add(new Class1198(this, var4, this.field4564 / 2 - field6963 / 2 + var3 * 30, this.field4565 / 2 - 30));
      }
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      if (!this.method6259()) {
         var1.method35294();
         RenderSystem.enableBlend();
         this.field4562.getTextureManager().bindTexture(field6962);
         int var7 = this.field4564 / 2 - 62;
         int var8 = this.field4565 / 2 - 30 - 27;
         method5699(var1, var7, var8, 0.0F, 0.0F, 125, 75, 128, 128);
         var1.method35295();
         super.method1923(var1, var2, var3, var4);
         this.field6966.ifPresent(var2x -> method5691(var1, this.field4568, Class2150.method8863(var2x), this.field4564 / 2, this.field4565 / 2 - 30 - 20, -1));
         method5691(var1, this.field4568, field6964, this.field4564 / 2, this.field4565 / 2 + 5, 16777215);
         if (!this.field6969) {
            this.field6967 = var2;
            this.field6968 = var3;
            this.field6969 = true;
         }

         boolean var9 = this.field6967 == var2 && this.field6968 == var3;

         for (Class1198 var11 : this.field6970) {
            var11.method1923(var1, var2, var3, var4);
            this.field6966.ifPresent(var1x -> var11.method5748(var1x == Class1198.method5751(var11)));
            if (!var9 && var11.method5737()) {
               this.field6966 = Optional.<Class2150>of(Class1198.method5751(var11));
            }
         }
      }
   }

   private void method6257() {
      method6258(this.field4562, this.field6966);
   }

   private static void method6258(Minecraft var0, Optional<Class2150> var1) {
      if (var0.field1337 != null && var0.field1339 != null && var1.isPresent()) {
         Optional var4 = Class2150.method8860(var0.field1337.method23157());
         Class2150 var5 = (Class2150)var1.get();
         if (var4.isPresent() && var0.field1339.method3424(2) && var5 != var4.get()) {
            var0.field1339.method5389(Class2150.method8861(var5));
         }
      }
   }

   private boolean method6259() {
      if (Class9798.method38639(this.field4562.method1580().method8039(), 292)) {
         return false;
      } else {
         this.method6257();
         this.field4562.displayGuiScreen((Screen)null);
         return true;
      }
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 == 293 && this.field6966.isPresent()) {
         this.field6969 = false;
         this.field6966 = Class2150.method8862(this.field6966.get());
         return true;
      } else {
         return super.method1920(var1, var2, var3);
      }
   }

   @Override
   public boolean method2472() {
      return false;
   }

   // $VF: synthetic method
   public static ResourceLocation method6262() {
      return field6962;
   }
}
