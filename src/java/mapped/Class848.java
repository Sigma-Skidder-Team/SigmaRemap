package mapped;

import net.minecraft.util.text.StringTextComponent;

public class Class848 extends Class838 {
   private Screen field4694;
   private Class9574 field4695;
   private Class9046 field4696 = new Class9046(this, new Class7549());
   private String field4697 = null;
   private String field4698 = null;
   private boolean field4699 = false;
   public static final String field4700 = "<profile>";
   public static final String field4701 = "<empty>";
   public static final String field4702 = "*";

   public Class848(Screen var1, Class9574 var2) {
      super(new StringTextComponent(Class9088.method33883("of.options.shaderOptionsTitle")));
      this.field4694 = var1;
      this.field4695 = var2;
   }

   public Class848(Screen var1, Class9574 var2, String var3) {
      this(var1, var2);
      this.field4697 = var3;
      if (var3 != null) {
         this.field4698 = Class8981.method33144("screen." + var3, var3);
      }
   }

   @Override
   public void method1921() {
      byte var3 = 100;
      int var4 = 0;
      byte var5 = 30;
      byte var6 = 20;
      byte var7 = 120;
      byte var8 = 20;
      int var9 = Class8981.method32969(this.field4697, 2);
      Class6679[] var10 = Class8981.method32968(this.field4697);
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
               int var16 = Math.min(this.field4564 / var9, 200);
               var4 = (this.field4564 - var16 * var9) / 2;
               int var17 = var14 * var16 + 5 + var4;
               int var18 = var5 + var15 * var6;
               int var19 = var16 - 10;
               String var20 = method2592(var13, var19);
               Object var21;
               if (!Class8981.method32973(var13.method20366())) {
                  var21 = new Class1213(var3 + var12, var17, var18, var19, var8, var13, var20);
               } else {
                  var21 = new Class1214(var3 + var12, var17, var18, var19, var8, var13, var20);
               }

               ((Class1213)var21).field6482 = var13.method20379();
               this.method2455((Class1197)var21);
            }
         }
      }

      this.<Class1210>method2455(
         new Class1210(201, this.field4564 / 2 - var7 - 20, this.field4565 / 6 + 168 + 11, var7, var8, Class9088.method33883("controls.reset"))
      );
      this.<Class1210>method2455(new Class1210(200, this.field4564 / 2 + 20, this.field4565 / 6 + 168 + 11, var7, var8, Class9088.method33883("gui.done")));
   }

   public static String method2592(Class6679 var0, int var1) {
      String var4 = var0.method20385();
      if (var0 instanceof Class6681) {
         Class6681 var8 = (Class6681)var0;
         return var4 + "...";
      } else {
         Class9834 var5 = Class7944.method26860().field1294;
         int var6 = var5.method38820(": " + Class8043.method27623()) + 5;

         while (var5.method38820(var4) + var6 >= var1 && var4.length() > 0) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         String var9 = !var0.method20381() ? "" : var0.method20362(var0.method20370());
         String var7 = var0.method20361(var0.method20370());
         return var4 + ": " + var9 + var7;
      }
   }

   @Override
   public void method2563(Class1197 var1) {
      if (var1 instanceof Class1210) {
         Class1210 var4 = (Class1210)var1;
         if (var4.field6482) {
            if (var4.field6523 < 200 && var4 instanceof Class1213) {
               Class1213 var5 = (Class1213)var4;
               Class6679 var6 = var5.method5769();
               if (var6 instanceof Class6681) {
                  String var11 = var6.method20366();
                  Class848 var8 = new Class848(this, this.field4695, var11);
                  this.field4562.displayGuiScreen(var8);
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
               Class6679[] var9 = Class8981.method32980(Class8981.method32972());

               for (int var10 = 0; var10 < var9.length; var10++) {
                  Class6679 var7 = var9[var10];
                  var7.method20373();
                  this.field4699 = true;
               }

               this.method2593();
            }

            if (var4.field6523 == 200) {
               if (this.field4699) {
                  Class8981.method32975();
                  this.field4699 = false;
                  Class8981.method33033();
               }

               this.field4562.displayGuiScreen(this.field4694);
            }
         }
      }
   }

   @Override
   public void onClose() {
      if (this.field4699) {
         Class8981.method32975();
         this.field4699 = false;
         Class8981.method33033();
      }

      super.onClose();
   }

   @Override
   public void method2564(Class1197 var1) {
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
      for (Class1197 var4 : this.field4629) {
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
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      if (this.field4698 == null) {
         method5691(var1, this.field4630, this.field4560, this.field4564 / 2, 15, 16777215);
      } else {
         method5690(var1, this.field4630, this.field4698, this.field4564 / 2, 15, 16777215);
      }

      super.method1923(var1, var2, var3, var4);
      this.field4696.method33640(var1, var2, var3, this.field4629);
   }
}