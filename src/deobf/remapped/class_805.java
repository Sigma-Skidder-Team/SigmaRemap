package remapped;

public class class_805 extends class_6967 {
   private static String[] field_4298;
   private final class_7272 field_4300;
   private boolean field_4299;
   private boolean field_4301;

   public class_805(class_7272 var1) {
      super(var1, 0.7F, 16);
      this.field_4300 = var1;
   }

   @Override
   public boolean method_16795() {
      if (this.field_35805 <= 0) {
         if (!this.field_4300.world.method_29537().method_1285(class_291.field_1047)) {
            return false;
         }

         this.field_4301 = false;
         this.field_4299 = class_7272.method_33229(this.field_4300);
         this.field_4299 = true;
      }

      return super.method_16795();
   }

   @Override
   public boolean method_16799() {
      return this.field_4301 && super.method_16799();
   }

   @Override
   public void method_16794() {
      super.method_16794();
      this.field_4300
         .method_26865()
         .method_17231(
            (double)this.field_35802.method_12173() + 0.5,
            (double)(this.field_35802.method_12165() + 1),
            (double)this.field_35802.method_12185() + 0.5,
            10.0F,
            (float)this.field_4300.method_26862()
         );
      if (this.method_31860()) {
         World var3 = this.field_4300.world;
         BlockPos var4 = this.field_35802.method_6081();
         class_2522 var5 = var3.method_28262(var4);
         class_6414 var6 = var5.method_8360();
         if (this.field_4301 && var6 instanceof class_9463) {
            Integer var7 = var5.<Integer>method_10313(class_9463.field_43779);
            if (var7 != 0) {
               var3.method_7513(var4, var5.method_10308(class_9463.field_43779, Integer.valueOf(var7 - 1)), 2);
               var3.method_43364(2001, var4, class_6414.method_29285(var5));
            } else {
               var3.method_7513(var4, class_4783.field_23184.method_29260(), 2);
               var3.method_7511(var4, true, this.field_4300);
            }

            class_7272.method_33237(this.field_4300, 40);
         }

         this.field_4301 = false;
         this.field_35805 = 10;
      }
   }

   @Override
   public boolean method_31855(class_4924 var1, BlockPos var2) {
      class_6414 var5 = var1.method_28262(var2).method_8360();
      if (var5 == class_4783.field_23421 && this.field_4299 && !this.field_4301) {
         var2 = var2.method_6081();
         class_2522 var6 = var1.method_28262(var2);
         var5 = var6.method_8360();
         if (var5 instanceof class_9463 && ((class_9463)var5).method_39383(var6)) {
            this.field_4301 = true;
            return true;
         }
      }

      return false;
   }
}
