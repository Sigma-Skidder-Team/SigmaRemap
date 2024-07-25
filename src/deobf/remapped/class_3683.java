package remapped;

public class class_3683 extends class_3954<class_6946> {
   public static final class_4639 field_18059 = new class_4639("textures/atlas/blocks.png");
   public static final class_4639 field_18048 = new class_4639("item/empty_armor_slot_helmet");
   public static final class_4639 field_18058 = new class_4639("item/empty_armor_slot_chestplate");
   public static final class_4639 field_18050 = new class_4639("item/empty_armor_slot_leggings");
   public static final class_4639 field_18053 = new class_4639("item/empty_armor_slot_boots");
   public static final class_4639 field_18055 = new class_4639("item/empty_armor_slot_shield");
   private static final class_4639[] field_18057 = new class_4639[]{field_18053, field_18050, field_18058, field_18048};
   private static final class_6943[] field_18054 = new class_6943[]{
      class_6943.field_35704, class_6943.field_35708, class_6943.field_35698, class_6943.field_35700
   };
   private final class_6946 field_18049 = new class_6946(this, 2, 2);
   private final class_7143 field_18056 = new class_7143();
   public final boolean field_18052;
   private final class_704 field_18051;

   public class_3683(class_7051 var1, boolean var2, class_704 var3) {
      super((class_4165<?>)null, 0);
      this.field_18052 = var2;
      this.field_18051 = var3;
      this.method_18885(new class_8725(var1.field_36409, this.field_18049, this.field_18056, 0, 154, 28));

      for (int var6 = 0; var6 < 2; var6++) {
         for (int var7 = 0; var7 < 2; var7++) {
            this.method_18885(new class_7934(this.field_18049, var7 + var6 * 2, 98 + var7 * 18, 18 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 4; var8++) {
         class_6943 var11 = field_18054[var8];
         this.method_18885(new class_1327(this, var1, 39 - var8, 8, 8 + var8 * 18, var11));
      }

      for (int var9 = 0; var9 < 3; var9++) {
         for (int var12 = 0; var12 < 9; var12++) {
            this.method_18885(new class_7934(var1, var12 + (var9 + 1) * 9, 8 + var12 * 18, 84 + var9 * 18));
         }
      }

      for (int var10 = 0; var10 < 9; var10++) {
         this.method_18885(new class_7934(var1, var10, 8 + var10 * 18, 142));
      }

      this.method_18885(new class_6301(this, var1, 40, 77, 62));
   }

   @Override
   public void method_18269(class_534 var1) {
      this.field_18049.method_18279(var1);
   }

   @Override
   public void method_18270() {
      this.field_18056.method_24975();
      this.field_18049.method_24975();
   }

   @Override
   public boolean method_18267(class_8932<? super class_6946> var1) {
      return var1.method_41052(this.field_18049, this.field_18051.field_41768);
   }

   @Override
   public void method_18853(class_6867 var1) {
      class_1722.method_7714(this.field_19925, this.field_18051.field_41768, this.field_18051, this.field_18049, this.field_18056);
   }

   @Override
   public void method_18876(class_704 var1) {
      super.method_18876(var1);
      this.field_18056.method_24975();
      if (!var1.field_41768.field_33055) {
         this.method_18887(var1, var1.field_41768, this.field_18049);
      }
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return true;
   }

   @Override
   public class_6098 method_18874(class_704 var1, int var2) {
      class_6098 var5 = class_6098.field_31203;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         class_6098 var7 = var6.method_35898();
         var5 = var7.method_27973();
         class_6943 var8 = class_5886.method_26896(var5);
         if (var2 != 0) {
            if (var2 >= 1 && var2 < 5) {
               if (!this.method_18892(var7, 9, 45, false)) {
                  return class_6098.field_31203;
               }
            } else if (var2 >= 5 && var2 < 9) {
               if (!this.method_18892(var7, 9, 45, false)) {
                  return class_6098.field_31203;
               }
            } else if (var8.method_31772() == class_7268.field_37219 && !this.field_19926.get(8 - var8.method_31767()).method_35884()) {
               int var9 = 8 - var8.method_31767();
               if (!this.method_18892(var7, var9, var9 + 1, false)) {
                  return class_6098.field_31203;
               }
            } else if (var8 == class_6943.field_35701 && !this.field_19926.get(45).method_35884()) {
               if (!this.method_18892(var7, 45, 46, false)) {
                  return class_6098.field_31203;
               }
            } else if (var2 >= 9 && var2 < 36) {
               if (!this.method_18892(var7, 36, 45, false)) {
                  return class_6098.field_31203;
               }
            } else if (var2 >= 36 && var2 < 45) {
               if (!this.method_18892(var7, 9, 36, false)) {
                  return class_6098.field_31203;
               }
            } else if (!this.method_18892(var7, 9, 45, false)) {
               return class_6098.field_31203;
            }
         } else {
            if (!this.method_18892(var7, 9, 45, true)) {
               return class_6098.field_31203;
            }

            var6.method_35888(var7, var5);
         }

         if (!var7.method_28022()) {
            var6.method_35887();
         } else {
            var6.method_35896(class_6098.field_31203);
         }

         if (var7.method_27997() == var5.method_27997()) {
            return class_6098.field_31203;
         }

         class_6098 var10 = var6.method_35892(var1, var7);
         if (var2 == 0) {
            var1.method_3153(var10, false);
         }
      }

      return var5;
   }

   @Override
   public boolean method_18873(class_6098 var1, class_7934 var2) {
      return var2.field_40591 != this.field_18056 && super.method_18873(var1, var2);
   }

   @Override
   public int method_18262() {
      return 0;
   }

   @Override
   public int method_18268() {
      return this.field_18049.method_31781();
   }

   @Override
   public int method_18266() {
      return this.field_18049.method_31782();
   }

   @Override
   public int method_18265() {
      return 5;
   }

   public class_6946 method_17103() {
      return this.field_18049;
   }

   @Override
   public class_4269 method_18263() {
      return class_4269.field_20684;
   }
}
