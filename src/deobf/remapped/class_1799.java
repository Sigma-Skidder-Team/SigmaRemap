package remapped;

import javax.annotation.Nullable;

public class class_1799 extends class_7429 {
   private static String[] field_9169;
   private class_8031 field_9170;

   public class_1799(class_6629<? extends class_1799> var1, World var2) {
      super(var1, var2);
      this.field_29915 = 10;
   }

   @Override
   public void method_26851() {
      super.method_26851();
      this.field_29916.method_3485(0, new class_787(this));
      this.field_29916.method_3485(1, new class_1273(this, null));
      this.field_29916.method_3485(2, new class_6837<class_704>(this, class_704.class, 8.0F, 0.6, 1.0));
      this.field_29916.method_3485(4, new class_8801(this, null));
      this.field_29916.method_3485(5, new class_532(this, null));
      this.field_29916.method_3485(6, new class_3096(this));
      this.field_29916.method_3485(8, new class_8285(this, 0.6));
      this.field_29916.method_3485(9, new class_4407(this, class_704.class, 3.0F, 1.0F));
      this.field_29916.method_3485(10, new class_4407(this, class_5886.class, 8.0F));
      this.field_29908.method_3485(1, new class_8420(this, class_4040.class).method_38757());
      this.field_29908.method_3485(2, new class_4138<class_704>(this, class_704.class, true).method_4209(300));
      this.field_29908.method_3485(3, new class_4138<class_405>(this, class_405.class, false).method_4209(300));
      this.field_29908.method_3485(3, new class_4138<class_8127>(this, class_8127.class, false));
   }

   public static class_1313 method_8001() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37465, 0.5)
         .method_5984(class_7331.field_37471, 12.0)
         .method_5984(class_7331.field_37468, 24.0);
   }

   @Override
   public void method_37329() {
      super.method_37329();
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
   }

   @Override
   public class_8461 method_18591() {
      return class_463.field_2550;
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
   }

   @Override
   public void method_26919() {
      super.method_26919();
   }

   @Override
   public boolean method_37344(Entity var1) {
      if (var1 != null) {
         if (var1 == this) {
            return true;
         } else if (!super.method_37344(var1)) {
            if (var1 instanceof class_2519) {
               return this.method_37344(((class_2519)var1).method_11454());
            } else {
               return var1 instanceof class_5834 && ((class_5834)var1).method_26550() == class_2780.field_13576
                  ? this.method_37095() == null && var1.method_37095() == null
                  : false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2299;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2871;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2336;
   }

   private void method_8000(class_8031 var1) {
      this.field_9170 = var1;
   }

   @Nullable
   private class_8031 method_8004() {
      return this.field_9170;
   }

   @Override
   public class_8461 method_33826() {
      return class_463.field_1973;
   }

   @Override
   public void method_18602(int var1, boolean var2) {
   }
}
