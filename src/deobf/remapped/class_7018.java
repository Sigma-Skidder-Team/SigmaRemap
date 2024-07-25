package remapped;

import java.util.function.Predicate;

public class class_7018<T extends class_5886> extends class_3599 {
   private static String[] field_35968;
   private final T field_35971;
   private final ItemStack field_35970;
   private final Predicate<? super T> field_35969;
   private final class_8461 field_35972;

   public class_7018(T var1, ItemStack var2, class_8461 var3, Predicate<? super T> var4) {
      this.field_35971 = (T)var1;
      this.field_35970 = var2;
      this.field_35972 = var3;
      this.field_35969 = var4;
   }

   @Override
   public boolean method_16795() {
      return this.field_35969.test(this.field_35971);
   }

   @Override
   public boolean method_16799() {
      return this.field_35971.method_26554();
   }

   @Override
   public void method_16796() {
      this.field_35971.method_37349(class_6943.field_35707, this.field_35970.method_27973());
      this.field_35971.method_26462(Hand.MAIN_HAND);
   }

   @Override
   public void method_16793() {
      this.field_35971.method_37349(class_6943.field_35707, ItemStack.EMPTY);
      if (this.field_35972 != null) {
         this.field_35971.method_37155(this.field_35972, 1.0F, this.field_35971.method_26594().nextFloat() * 0.2F + 0.9F);
      }
   }
}
