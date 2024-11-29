package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.StringTextComponent;
import net.optifine.Config;
import net.optifine.shaders.Shaders;

public class Class848 extends Class838 {
   private Screen field4694;
   private GameSettings field4695;
   private Class9046 field4696 = new Class9046(this, new Class7549());
   private String field4697 = null;
   private String field4698 = null;
   private boolean field4699 = false;
   public static final String field4700 = "<profile>";
   public static final String field4701 = "<empty>";
   public static final String field4702 = "*";

   public Class848(Screen var1, GameSettings var2) {
      super(new StringTextComponent(I18n.format("of.options.shaderOptionsTitle")));
      this.field4694 = var1;
      this.field4695 = var2;
   }

   public Class848(Screen var1, GameSettings var2, String var3) {
      this(var1, var2);
      this.field4697 = var3;
      if (var3 != null) {
         this.field4698 = Shaders.method33144("screen." + var3, var3);
      }
   }

   @Override
   public void init() {
      int var3 = 100;
      int var5 = 30;
      int var6 = 20;
      int var7 = 120;
      int var8 = 20;
      int var9 = Shaders.method32969(this.field4697, 2);
      Class6679[] var10 = Shaders.method32968(this.field4697);
      if (var10 != null) {
         int var11 = MathHelper.method37774((double)var10.length / 9.0);
         if (var9 < var11) {
            var9 = var11;
         }

         for (int var12 = 0; var12 < var10.length; var12++) {
            Class6679 var13 = var10[var12];
            if (var13 != null && var13.method20382()) {
               int var14 = var12 % var9;
               int var15 = var12 / var9;
               int var16 = Math.min(this.width / var9, 200);
               int var4 = (this.width - var16 * var9) / 2;
               int var17 = var14 * var16 + 5 + var4;
               int var18 = var5 + var15 * var6;
               int var19 = var16 - 10;
               String var20 = method2592(var13, var19);
               Object var21;
               if (! Shaders.method32973(var13.method20366())) {
                  var21 = new Class1213(var3 + var12, var17, var18, var19, var8, var13, var20);
               } else {
                  var21 = new Class1214(var3 + var12, var17, var18, var19, var8, var13, var20);
               }

               ((Class1213)var21).active = var13.method20379();
               this.addButton((Widget)var21);
            }
         }
      }

      this.<Class1210>addButton(
         new Class1210(201, this.width / 2 - var7 - 20, this.height / 6 + 168 + 11, var7, var8, I18n.format("controls.reset"))
      );
      this.<Class1210>addButton(new Class1210(200, this.width / 2 + 20, this.height / 6 + 168 + 11, var7, var8, I18n.format("gui.done")));
   }

   public static String method2592(Class6679 var0, int var1) {
      String var4 = var0.method20385();
      if (var0 instanceof Class6681) {
         Class6681 var8 = (Class6681)var0;
         return var4 + "...";
      } else {
         FontRenderer var5 = Config.method26860().fontRenderer;
         int var6 = var5.getStringWidth(": " + Class8043.method27623()) + 5;

         while (var5.getStringWidth(var4) + var6 >= var1 && var4.length() > 0) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         String var9 = !var0.method20381() ? "" : var0.method20362(var0.method20370());
         String var7 = var0.method20361(var0.method20370());
         return var4 + ": " + var9 + var7;
      }
   }

   @Override
   public void method2563(Widget var1) {
      if (var1 instanceof Class1210) {
         Class1210 var4 = (Class1210)var1;
         if (var4.active) {
            if (var4.field6523 < 200 && var4 instanceof Class1213) {
               Class1213 var5 = (Class1213)var4;
               Class6679 var6 = var5.method5769();
               if (var6 instanceof Class6681) {
                  String var11 = var6.method20366();
                  Class848 var8 = new Class848(this, this.field4695, var11);
                  this.mc.displayGuiScreen(var8);
                  return;
               }

               if (!method2476()) {
                  if (var5.method5771()) {
                     var6.method20374();
                  }
               } else {
                  var6.method20373();
               }

               this.method2593();
               this.field4699 = true;
            }

            if (var4.field6523 == 201) {
               Class6679[] var9 = Shaders.method32980(Shaders.method32972());

               for (int var10 = 0; var10 < var9.length; var10++) {
                  Class6679 var7 = var9[var10];
                  var7.method20373();
                  this.field4699 = true;
               }

               this.method2593();
            }

            if (var4.field6523 == 200) {
               if (this.field4699) {
                  Shaders.method32975();
                  this.field4699 = false;
                  Shaders.method33033();
               }

               this.mc.displayGuiScreen(this.field4694);
            }
         }
      }
   }

   @Override
   public void onClose() {
      if (this.field4699) {
         Shaders.method32975();
         this.field4699 = false;
         Shaders.method33033();
      }

      super.onClose();
   }

   @Override
   public void method2564(Widget var1) {
      if (var1 instanceof Class1213) {
         Class1213 var4 = (Class1213)var1;
         Class6679 var5 = var4.method5769();
         if (!method2476()) {
            if (var4.method5771()) {
               var5.method20375();
            }
         } else {
            var5.method20373();
         }

         this.method2593();
         this.field4699 = true;
      }
   }

   private void method2593() {
      for (Widget var4 : this.field4629) {
         if (var4 instanceof Class1213) {
            Class1213 var5 = (Class1213)var4;
            Class6679 var6 = var5.method5769();
            if (var6 instanceof Class6684) {
               Class6684 var7 = (Class6684)var6;
               var7.method20393();
            }

            var5.method5766(method2592(var6, var5.method5740()));
            var5.method5770();
         }
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      if (this.field4698 == null) {
         drawCenteredString(var1, this.field4630, this.title, this.width / 2, 15, 16777215);
      } else {
         drawCenteredString(var1, this.field4630, this.field4698, this.width / 2, 15, 16777215);
      }

      super.render(var1, var2, var3, var4);
      this.field4696.method33640(var1, var2, var3, this.field4629);
   }
}
