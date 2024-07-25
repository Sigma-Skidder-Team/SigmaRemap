package remapped;

import java.util.function.Predicate;

public class class_9344 extends class_4138<class_704> {
   private static String[] field_47692;
   private final class_912 field_47688;
   private class_704 field_47693;
   private int field_47687;
   private int field_47689;
   private final class_4931 field_47691;
   private final class_4931 field_47690 = new class_4931().method_22602();

   public class_9344(class_912 var1, Predicate<class_5834> var2) {
      super(var1, class_704.class, 10, false, false, var2);
      this.field_47688 = var1;
      this.field_47691 = new class_4931().method_22607(this.method_4211()).method_22606(var1x -> class_912.method_3906(var1, (class_704)var1x));
   }

   @Override
   public boolean method_16795() {
      this.field_47693 = this.field_47688.field_41768.method_25859(this.field_47691, this.field_47688);
      return this.field_47693 != null;
   }

   @Override
   public void method_16796() {
      this.field_47687 = 5;
      this.field_47689 = 0;
      this.field_47688.method_3904();
   }

   @Override
   public void method_16793() {
      this.field_47693 = null;
      super.method_16793();
   }

   @Override
   public boolean method_16799() {
      if (this.field_47693 != null) {
         if (class_912.method_3906(this.field_47688, this.field_47693)) {
            this.field_47688.method_26914(this.field_47693, 10.0F, 10.0F);
            return true;
         } else {
            return false;
         }
      } else {
         return this.field_20146 != null && this.field_47690.method_22604(this.field_47688, this.field_20146) ? true : super.method_16799();
      }
   }

   @Override
   public void method_16794() {
      if (this.field_47688.method_17809() == null) {
         super.method_19214((class_5834)null);
      }

      if (this.field_47693 == null) {
         if (this.field_20146 != null && !this.field_47688.method_37070()) {
            if (!class_912.method_3906(this.field_47688, (class_704)this.field_20146)) {
               if (this.field_20146.method_37275(this.field_47688) > 256.0
                  && this.field_47689++ >= 30
                  && class_912.method_3908(this.field_47688, this.field_20146)) {
                  this.field_47689 = 0;
               }
            } else {
               if (this.field_20146.method_37275(this.field_47688) < 16.0) {
                  this.field_47688.method_3914();
               }

               this.field_47689 = 0;
            }
         }

         super.method_16794();
      } else if (--this.field_47687 <= 0) {
         this.field_20146 = this.field_47693;
         this.field_47693 = null;
         super.method_16796();
      }
   }
}
