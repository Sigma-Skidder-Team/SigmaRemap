package remapped;

import net.minecraft.util.text.StringTextComponent;

public class class_708 extends class_4232 {
   private Screen field_3892;
   private class_8881 field_3894;
   private class_6809 field_3886 = new class_6809(this, new class_8927());
   private String field_3887 = null;
   private String field_3890 = null;
   private boolean field_3893 = false;
   public static final String field_3891 = "<profile>";
   public static final String field_3889 = "<empty>";
   public static final String field_3895 = "*";

   public class_708(Screen var1, class_8881 var2) {
      super(new StringTextComponent(class_6956.method_31803("of.options.shaderOptionsTitle")));
      this.field_3892 = var1;
      this.field_3894 = var2;
   }

   public class_708(Screen var1, class_8881 var2, String var3) {
      this(var1, var2);
      this.field_3887 = var3;
      if (var3 != null) {
         this.field_3890 = class_6588.method_30244("screen." + var3, var3);
      }
   }

   @Override
   public void method_1163() {
      byte var3 = 100;
      int var4 = 0;
      byte var5 = 30;
      byte var6 = 20;
      byte var7 = 120;
      byte var8 = 20;
      int var9 = class_6588.method_30147(this.field_3887, 2);
      class_6843[] var10 = class_6588.method_30314(this.field_3887);
      if (var10 != null) {
         int var11 = class_9299.method_42815((double)var10.length / 9.0);
         if (var9 < var11) {
            var9 = var11;
         }

         for (int var12 = 0; var12 < var10.length; var12++) {
            class_6843 var13 = var10[var12];
            if (var13 != null && var13.method_31394()) {
               int var14 = var12 % var9;
               int var15 = var12 / var9;
               int var16 = Math.min(this.field_941 / var9, 200);
               var4 = (this.field_941 - var16 * var9) / 2;
               int var17 = var14 * var16 + 5 + var4;
               int var18 = var5 + var15 * var6;
               int var19 = var16 - 10;
               String var20 = method_3265(var13, var19);
               Object var21;
               if (!class_6588.method_30237(var13.method_31405())) {
                  var21 = new class_1188(var3 + var12, var17, var18, var19, var8, var13, var20);
               } else {
                  var21 = new class_808(var3 + var12, var17, var18, var19, var8, var13, var20);
               }

               ((class_1188)var21).field_36675 = var13.method_31389();
               this.method_1186((class_7114)var21);
            }
         }
      }

      this.<class_5932>method_1186(
         new class_5932(201, this.field_941 / 2 - var7 - 20, this.field_940 / 6 + 168 + 11, var7, var8, class_6956.method_31803("controls.reset"))
      );
      this.<class_5932>method_1186(new class_5932(200, this.field_941 / 2 + 20, this.field_940 / 6 + 168 + 11, var7, var8, class_6956.method_31803("gui.done")));
   }

   public static String method_3265(class_6843 var0, int var1) {
      String var4 = var0.method_31378();
      if (var0 instanceof class_2838) {
         class_2838 var8 = (class_2838)var0;
         return var4 + "...";
      } else {
         TextRenderer var5 = class_3111.method_14327().textRenderer;
         int var6 = var5.method_45395(": " + class_3458.method_15902()) + 5;

         while (var5.method_45395(var4) + var6 >= var1 && var4.length() > 0) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         String var9 = !var0.method_31396() ? "" : var0.method_31381(var0.method_31403());
         String var7 = var0.method_31395(var0.method_31403());
         return var4 + ": " + var9 + var7;
      }
   }

   @Override
   public void method_19728(class_7114 var1) {
      if (var1 instanceof class_5932) {
         class_5932 var4 = (class_5932)var1;
         if (var4.field_36675) {
            if (var4.field_30159 < 200 && var4 instanceof class_1188) {
               class_1188 var5 = (class_1188)var4;
               class_6843 var6 = var5.method_5243();
               if (var6 instanceof class_2838) {
                  String var11 = var6.method_31405();
                  class_708 var8 = new class_708(this, this.field_3894, var11);
                  this.field_943.method_8609(var8);
                  return;
               }

               if (!method_1190()) {
                  if (var5.method_5244()) {
                     var6.method_31385();
                  }
               } else {
                  var6.method_31401();
               }

               this.method_3264();
               this.field_3893 = true;
            }

            if (var4.field_30159 == 201) {
               class_6843[] var9 = class_6588.method_30225(class_6588.method_30313());

               for (int var10 = 0; var10 < var9.length; var10++) {
                  class_6843 var7 = var9[var10];
                  var7.method_31401();
                  this.field_3893 = true;
               }

               this.method_3264();
            }

            if (var4.field_30159 == 200) {
               if (this.field_3893) {
                  class_6588.method_30153();
                  this.field_3893 = false;
                  class_6588.method_30259();
               }

               this.field_943.method_8609(this.field_3892);
            }
         }
      }
   }

   @Override
   public void method_1162() {
      if (this.field_3893) {
         class_6588.method_30153();
         this.field_3893 = false;
         class_6588.method_30259();
      }

      super.method_1162();
   }

   @Override
   public void method_19729(class_7114 var1) {
      if (var1 instanceof class_1188) {
         class_1188 var4 = (class_1188)var1;
         class_6843 var5 = var4.method_5243();
         if (!method_1190()) {
            if (var4.method_5244()) {
               var5.method_31406();
            }
         } else {
            var5.method_31401();
         }

         this.method_3264();
         this.field_3893 = true;
      }
   }

   private void method_3264() {
      for (class_7114 var4 : this.field_20540) {
         if (var4 instanceof class_1188) {
            class_1188 var5 = (class_1188)var4;
            class_6843 var6 = var5.method_5243();
            if (var6 instanceof class_4058) {
               class_4058 var7 = (class_4058)var6;
               var7.method_18720();
            }

            var5.method_27121(method_3265(var6, var5.method_32699()));
            var5.method_5245();
         }
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      if (this.field_3890 == null) {
         method_9788(var1, this.field_20538, this.field_947, this.field_941 / 2, 15, 16777215);
      } else {
         method_9787(var1, this.field_20538, this.field_3890, this.field_941 / 2, 15, 16777215);
      }

      super.method_6767(var1, var2, var3, var4);
      this.field_3886.method_31255(var1, var2, var3, this.field_20540);
   }
}
