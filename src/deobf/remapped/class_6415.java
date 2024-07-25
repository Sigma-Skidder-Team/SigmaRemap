package remapped;

public class class_6415 extends class_4088 {
   private static String[] field_32762;
   private final class_233 field_32763;
   private final class_1459 field_32764;
   private int field_32761;
   private boolean field_32760;
   private boolean field_32759;

   public class_6415(int var1, class_7051 var2) {
      this(var1, var2, new class_2202(var2.field_36409));
   }

   public class_6415(int var1, class_7051 var2, class_233 var3) {
      super(class_4165.field_20262, var1);
      this.field_32763 = var3;
      this.field_32764 = new class_1459(var3);
      this.method_18885(new class_7934(this.field_32764, 0, 136, 37));
      this.method_18885(new class_7934(this.field_32764, 1, 162, 37));
      this.method_18885(new class_7603(var2.field_36409, var3, this.field_32764, 2, 220, 37));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.method_18885(new class_7934(var2, var7 + var6 * 9 + 9, 108 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.method_18885(new class_7934(var2, var8, 108 + var8 * 18, 142));
      }
   }

   public void method_29309(boolean var1) {
      this.field_32760 = var1;
   }

   @Override
   public void method_18853(class_6867 var1) {
      this.field_32764.method_6758();
      super.method_18853(var1);
   }

   public void method_29323(int var1) {
      this.field_32764.method_6757(var1);
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return this.field_32763.method_978() == var1;
   }

   public int method_29324() {
      return this.field_32763.method_973();
   }

   public int method_29320() {
      return this.field_32764.method_6754();
   }

   public void method_29317(int var1) {
      this.field_32763.method_984(var1);
   }

   public int method_29315() {
      return this.field_32761;
   }

   public void method_29318(int var1) {
      this.field_32761 = var1;
   }

   public void method_29314(boolean var1) {
      this.field_32759 = var1;
   }

   public boolean method_29319() {
      return this.field_32759;
   }

   @Override
   public boolean method_18873(class_6098 var1, class_7934 var2) {
      return false;
   }

   @Override
   public class_6098 method_18874(class_704 var1, int var2) {
      class_6098 var5 = class_6098.field_31203;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         class_6098 var7 = var6.method_35898();
         var5 = var7.method_27973();
         if (var2 != 2) {
            if (var2 != 0 && var2 != 1) {
               if (var2 >= 3 && var2 < 30) {
                  if (!this.method_18892(var7, 30, 39, false)) {
                     return class_6098.field_31203;
                  }
               } else if (var2 >= 30 && var2 < 39 && !this.method_18892(var7, 3, 30, false)) {
                  return class_6098.field_31203;
               }
            } else if (!this.method_18892(var7, 3, 39, false)) {
               return class_6098.field_31203;
            }
         } else {
            if (!this.method_18892(var7, 3, 39, true)) {
               return class_6098.field_31203;
            }

            var6.method_35888(var7, var5);
            this.method_29310();
         }

         if (!var7.method_28022()) {
            var6.method_35887();
         } else {
            var6.method_35896(class_6098.field_31203);
         }

         if (var7.method_27997() == var5.method_27997()) {
            return class_6098.field_31203;
         }

         var6.method_35892(var1, var7);
      }

      return var5;
   }

   private void method_29310() {
      if (!this.field_32763.method_972().field_33055) {
         Entity var3 = (Entity)this.field_32763;
         this.field_32763
            .method_972()
            .method_29527(var3.method_37302(), var3.method_37309(), var3.method_37156(), this.field_32763.method_976(), class_562.field_3328, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void method_18876(class_704 var1) {
      super.method_18876(var1);
      this.field_32763.method_975((class_704)null);
      if (!this.field_32763.method_972().field_33055) {
         if (!var1.method_37330() || var1 instanceof class_9359 && ((class_9359)var1).method_43252()) {
            class_6098 var4 = this.field_32764.method_31507(0);
            if (!var4.method_28022()) {
               var1.method_3153(var4, false);
            }

            var4 = this.field_32764.method_31507(1);
            if (!var4.method_28022()) {
               var1.method_3153(var4, false);
            }
         } else {
            var1.field_3853.method_32395(var1.field_41768, this.field_32764.method_31507(0));
            var1.field_3853.method_32395(var1.field_41768, this.field_32764.method_31507(1));
         }
      }
   }

   public void method_29313(int var1) {
      if (this.method_29312().size() > var1) {
         class_6098 var4 = this.field_32764.method_31498(0);
         if (!var4.method_28022()) {
            if (!this.method_18892(var4, 3, 39, true)) {
               return;
            }

            this.field_32764.method_31503(0, var4);
         }

         class_6098 var5 = this.field_32764.method_31498(1);
         if (!var5.method_28022()) {
            if (!this.method_18892(var5, 3, 39, true)) {
               return;
            }

            this.field_32764.method_31503(1, var5);
         }

         if (this.field_32764.method_31498(0).method_28022() && this.field_32764.method_31498(1).method_28022()) {
            class_6098 var6 = this.method_29312().get(var1).method_36372();
            this.method_29321(0, var6);
            class_6098 var7 = this.method_29312().get(var1).method_36377();
            this.method_29321(1, var7);
         }
      }
   }

   private void method_29321(int var1, class_6098 var2) {
      if (!var2.method_28022()) {
         for (int var5 = 3; var5 < 39; var5++) {
            class_6098 var6 = this.field_19926.get(var5).method_35898();
            if (!var6.method_28022() && this.method_29322(var2, var6)) {
               class_6098 var7 = this.field_32764.method_31498(var1);
               int var8 = !var7.method_28022() ? var7.method_27997() : 0;
               int var9 = Math.min(var2.method_28016() - var8, var6.method_27997());
               class_6098 var10 = var6.method_27973();
               int var11 = var8 + var9;
               var6.method_27970(var9);
               var10.method_28017(var11);
               this.field_32764.method_31503(var1, var10);
               if (var11 >= var2.method_28016()) {
                  break;
               }
            }
         }
      }
   }

   private boolean method_29322(class_6098 var1, class_6098 var2) {
      return var1.method_27960() == var2.method_27960() && class_6098.method_27956(var1, var2);
   }

   public void method_29316(class_2795 var1) {
      this.field_32763.method_980(var1);
   }

   public class_2795 method_29312() {
      return this.field_32763.method_974();
   }

   public boolean method_29311() {
      return this.field_32760;
   }
}
