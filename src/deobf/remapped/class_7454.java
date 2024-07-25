package remapped;

import javax.annotation.Nullable;

public class class_7454 extends class_3757 {
   private boolean field_37993;
   private boolean field_37989;
   private boolean field_37991;
   private boolean field_37994;
   private final class_8116 field_37990 = new class_6365(this);

   public class_7454() {
      super(class_133.field_381);
   }

   @Override
   public CompoundNBT method_17396(CompoundNBT var1) {
      super.method_17396(var1);
      this.field_37990.method_36938(var1);
      var1.method_25934("powered", this.method_33935());
      var1.method_25934("conditionMet", this.method_33934());
      var1.method_25934("auto", this.method_33926());
      return var1;
   }

   @Override
   public void method_17394(class_2522 var1, CompoundNBT var2) {
      super.method_17394(var1, var2);
      this.field_37990.method_36924(var2);
      this.field_37993 = var2.method_25933("powered");
      this.field_37991 = var2.method_25933("conditionMet");
      this.method_33932(var2.method_25933("auto"));
   }

   @Nullable
   @Override
   public class_5029 method_17413() {
      if (!this.method_33928()) {
         return null;
      } else {
         this.method_33933(false);
         CompoundNBT var3 = this.method_17396(new CompoundNBT());
         return new class_5029(this.field_18358, 2, var3);
      }
   }

   @Override
   public boolean method_17397() {
      return true;
   }

   public class_8116 method_33929() {
      return this.field_37990;
   }

   public void method_33924(boolean var1) {
      this.field_37993 = var1;
   }

   public boolean method_33935() {
      return this.field_37993;
   }

   public boolean method_33926() {
      return this.field_37989;
   }

   public void method_33932(boolean var1) {
      boolean var4 = this.field_37989;
      this.field_37989 = var1;
      if (!var4 && var1 && !this.field_37993 && this.field_18364 != null && this.method_33927() != class_9776.field_49629) {
         this.method_33925();
      }
   }

   public void method_33931() {
      class_9776 var3 = this.method_33927();
      if (var3 == class_9776.field_49632 && (this.field_37993 || this.field_37989) && this.field_18364 != null) {
         this.method_33925();
      }
   }

   private void method_33925() {
      class_6414 var3 = this.method_17403().method_8360();
      if (var3 instanceof class_8151) {
         this.method_33923();
         this.field_18364.method_43367().method_14011(this.field_18358, var3, 1);
      }
   }

   public boolean method_33934() {
      return this.field_37991;
   }

   public boolean method_33923() {
      this.field_37991 = true;
      if (this.method_33930()) {
         class_1331 var3 = this.field_18358
            .method_6098(this.field_18364.method_28262(this.field_18358).<Direction>method_10313(class_8151.field_41791).method_1046());
         if (!(this.field_18364.method_28262(var3).method_8360() instanceof class_8151)) {
            this.field_37991 = false;
         } else {
            class_3757 var4 = this.field_18364.method_28260(var3);
            this.field_37991 = var4 instanceof class_7454 && ((class_7454)var4).method_33929().method_36926() > 0;
         }
      }

      return this.field_37991;
   }

   public boolean method_33928() {
      return this.field_37994;
   }

   public void method_33933(boolean var1) {
      this.field_37994 = var1;
   }

   public class_9776 method_33927() {
      class_2522 var3 = this.method_17403();
      if (!var3.method_8350(class_4783.field_23730)) {
         if (!var3.method_8350(class_4783.field_23265)) {
            return !var3.method_8350(class_4783.field_23601) ? class_9776.field_49631 : class_9776.field_49629;
         } else {
            return class_9776.field_49632;
         }
      } else {
         return class_9776.field_49631;
      }
   }

   public boolean method_33930() {
      class_2522 var3 = this.field_18364.method_28262(this.method_17399());
      return !(var3.method_8360() instanceof class_8151) ? false : var3.<Boolean>method_10313(class_8151.field_41788);
   }

   @Override
   public void method_17412() {
      this.method_17400();
      super.method_17412();
   }
}
