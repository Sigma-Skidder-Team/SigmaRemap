package remapped;

public class class_1117 extends class_6967 {
   private static String[] field_6394;
   private final class_3845 field_6393;

   public class_1117(class_3845 var1, double var2) {
      super(var1, var2, 16);
      this.field_6393 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_6393.method_17856() && class_3845.method_17871(this.field_6393).method_12170(this.field_6393.method_37245(), 9.0)
         ? super.method_16795()
         : false;
   }

   @Override
   public boolean method_16799() {
      return super.method_16799()
         && this.field_6393.method_17856()
         && class_3845.method_17871(this.field_6393).method_12170(this.field_6393.method_37245(), 9.0);
   }

   @Override
   public void method_16794() {
      super.method_16794();
      BlockPos var3 = this.field_6393.method_37075();
      if (!this.field_6393.method_37285() && this.method_31860()) {
         if (class_3845.method_17854(this.field_6393) >= 1) {
            if (class_3845.method_17854(this.field_6393) > 200) {
               World var4 = this.field_6393.world;
               var4.method_43359((class_704)null, var3, class_463.field_2325, class_562.field_3322, 0.3F, 0.9F + var4.field_33033.nextFloat() * 0.2F);
               var4.method_7513(
                  this.field_35802.method_6081(),
                  class_4783.field_23741
                     .method_29260()
                     .method_10308(class_1477.field_7918, Integer.valueOf(class_3845.method_17845(this.field_6393).nextInt(4) + 1)),
                  3
               );
               class_3845.method_17857(this.field_6393, false);
               class_3845.method_17863(this.field_6393, false);
               this.field_6393.method_24868(600);
            }
         } else {
            class_3845.method_17863(this.field_6393, true);
         }

         if (this.field_6393.method_17862()) {
            class_3845.method_17848(this.field_6393);
         }
      }
   }

   @Override
   public boolean method_31855(class_4924 var1, BlockPos var2) {
      return var1.method_22548(var2.method_6081()) ? class_1477.method_6810(var1, var2) : false;
   }
}
