package remapped;

import java.awt.image.BufferedImage;

public class class_482 extends class_446 {
   public class_7309 field_2988 = null;
   private BufferedImage field_2990;
   private class_8343 field_2994;
   private class_1581 field_2992;
   private boolean field_2989 = false;
   private class_2440 field_2986 = new class_2440(114, 114, class_4043.field_19618);
   private float field_2985 = 0.0F;
   public class_2440 field_2995 = new class_2440(300, 300, class_4043.field_19618);
   private int field_2987 = 0;
   private int field_2991 = 0;
   private int field_2996 = class_314.method_1442(class_1255.field_6918.field_6917, class_1255.field_6929.field_6917, 20.0F);

   public class_482(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_7309 var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_2988 = var7;
      this.method_32148(this.field_2992 = new class_1581(this, "loading", var5 - 50, 35, 30, 30));
      this.field_2992.method_32119(false);
   }

   public void method_2281(boolean var1) {
      this.method_2282(var1, false);
   }

   public void method_2282(boolean var1, boolean var2) {
      this.field_2986.method_11119(!var1 ? class_4043.field_19618 : class_4043.field_19620);
      if (var2) {
         this.field_2986.method_11122(1.0F);
      }
   }

   public boolean method_2276() {
      return this.field_2986.method_11128() == class_4043.field_19620;
   }

   @Override
   public void method_32178(float var1) {
      this.method_32130();
      this.field_2996 = class_314.method_1442(class_1255.field_6918.field_6917, class_1255.field_6929.field_6917, 2.0F);
      int var4 = ((class_2612)this.field_36283.method_32167()).method_11853();
      int var5 = Math.max(0, this.field_36261 - var4);
      int var6 = Math.max(0, this.field_36257 + Math.min(100, this.field_36261 - var4 - var5));
      float var7 = (float)Math.min(50, var6) / 50.0F;
      int var8 = this.method_32167().method_32167().method_32137() + this.method_32167().method_32167().method_32093();
      int var9 = 0;
      var5 += var4;
      if (var5 - var4 <= var8) {
         if (var7 != 0.0F) {
            FontManager.method_120(
               this.field_36270,
               var5,
               this.field_36278,
               Math.max(20, var6),
               class_314.method_1444(!this.method_32185() ? class_1255.field_6918.field_6917 : this.field_2996, var7)
            );
            FontManager.method_150(this.field_36270, var5, this.field_36270 + this.field_36278 + 20, var5 + var6, true);
            if (this.field_2988 != null) {
               this.method_2275();
               this.method_2278();
               this.method_2277(var7);
               if (this.field_2986.method_11123() > 0.0F && var6 > 55) {
                  FontManager.method_99(
                     (float)(this.field_36270 + this.method_32109()),
                     (float)var5 + (float)(26 * var6) / 100.0F,
                     18.0F * this.field_2986.method_11123() * (float)var6 / 100.0F,
                     (float)(47 * var6) / 100.0F,
                     NotificationIcons.altselect,
                     !this.method_32185() ? class_1255.field_6918.field_6917 : this.field_2996
                  );
               }

               super.method_32178(var1 * var7);
               FontManager.method_141();
            }
         }
      } else {
         var9++;
      }
   }

   public void method_2275() {
      FontManager.method_102(
         (float)(this.field_36270 + 13), (float)(this.field_36261 + 13), 75.0F, 75.0F, this.field_2988.method_33340(), class_1255.field_6918.field_6917, true
      );
      FontManager.method_147((float)(this.field_36270 + 13), (float)(this.field_36261 + 13), 75.0F, 75.0F, 20.0F, 1.0F);
      FontManager.method_99(
         (float)(this.field_36270 + 1),
         (float)this.field_36261,
         100.0F,
         100.0F,
         NotificationIcons.altcercle,
         !this.method_32185() ? class_1255.field_6918.field_6917 : this.field_2996
      );
   }

   public void method_2278() {
      if (this.field_2988.method_33338()) {
         FontManager.method_87(
            class_5320.field_27141,
            (float)(this.field_36270 + 110),
            (float)(this.field_36261 + 18),
            this.field_2988.method_33344(),
            class_1255.field_6929.field_6917
         );
         FontManager.method_87(
            class_5320.field_27138,
            (float)(this.field_36270 + 110),
            (float)(this.field_36261 + 50),
            "Username: " + this.field_2988.method_33344(),
            class_1255.field_6920.field_6917
         );
         FontManager.method_87(
            class_5320.field_27138, (float)(this.field_36270 + 110), (float)(this.field_36261 + 65), "Offline account", class_1255.field_6920.field_6917
         );
      } else {
         FontManager.method_87(
            class_5320.field_27141,
            (float)(this.field_36270 + 110),
            (float)(this.field_36261 + 18),
            this.field_2988.method_33321(),
            class_1255.field_6929.field_6917
         );
         FontManager.method_87(
            class_5320.field_27138,
            (float)(this.field_36270 + 110),
            (float)(this.field_36261 + 50),
            "Email: " + this.field_2988.method_33344(),
            class_1255.field_6920.field_6917
         );
         FontManager.method_87(
            class_5320.field_27138,
            (float)(this.field_36270 + 110),
            (float)(this.field_36261 + 65),
            "Password: " + this.field_2988.method_33341().replaceAll(".", Character.toString('·')),
            class_1255.field_6920.field_6917
         );
      }
   }

   public void method_2277(float var1) {
      this.field_2985 = this.field_2985 + (this.field_2989 ? 0.33333334F : -0.33333334F);
      this.field_2985 = Math.min(1.0F, Math.max(0.0F, this.field_2985));
      this.field_2987 = Math.max(0, this.field_2987 - 1);
      float var4 = this.field_2987 <= 20 ? 20.0F : -20.0F;
      float var5 = (float)this.field_2987 >= var4 && (float)this.field_2987 <= (float)this.field_2991 - var4 ? 1.0F : (float)this.field_2987 % var4 / var4;
      FontManager.method_99(
         (float)(this.field_36270 + this.field_36278 - 45),
         (float)(this.field_36261 + 42),
         17.0F,
         17.0F,
         NotificationIcons.alterrors,
         class_314.method_1444(class_1255.field_6918.field_6917, var5 * var1)
      );
      FontManager.method_99(
         (float)(this.field_36270 + this.field_36278 - 45),
         (float)(this.field_36261 + 45),
         17.0F,
         13.0F,
         NotificationIcons.altactive,
         class_314.method_1444(class_1255.field_6918.field_6917, this.field_2985 * var1)
      );
   }

   public void method_2283(boolean var1) {
      this.field_2989 = var1;
   }

   public void method_2280(int var1) {
      this.field_2987 = var1;
      this.field_2991 = var1;
   }

   public void method_2279(boolean var1) {
      this.field_2992.method_32119(var1);
   }
}
