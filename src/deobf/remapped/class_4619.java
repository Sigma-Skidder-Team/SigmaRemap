package remapped;

public class class_4619 extends class_884 implements class_7734 {
   private static String[] field_22497;

   @Override
   public void method_3800() {
      if (this.field_4548 != 3) {
         if (this.field_4548 != 1) {
            for (int var3 = 0; var3 < this.field_4553; var3++) {
               this.field_4551[var3] = new class_8327(var3);
            }
         } else {
            int var4;
            for (var4 = 0; var4 < this.field_4547.method_8690(); var4++) {
               this.field_4551[var4] = new class_8327(var4);
            }

            while (var4 < this.field_4553) {
               this.field_4551[var4] = new class_205(var4);
               var4++;
            }
         }
      } else {
         for (int var5 = 0; var5 < this.field_4553; var5++) {
            this.field_4551[var5] = new class_2308(var5);
         }
      }
   }

   @Override
   public void method_3803() {
      for (int var3 = 0; var3 < this.field_4553; var3++) {
         ((class_2308)this.field_4551[var3]).method_10613(this.field_4550, this.field_4554);
      }
   }
}
