package remapped;

public class class_205 extends class_2308 {
   private static String[] field_688;
   public int field_690;
   public float field_686;
   public float field_687;
   public float field_689;

   public class_205(int var1) {
      super(var1);
   }

   @Override
   public void method_20555(class_8212 var1, class_1915 var2, class_4546 var3) {
      super.method_20555(var1, var2, var3);
   }

   @Override
   public void method_10613(class_8212 var1, class_4546 var2) {
      if (this.field_11535 != 0) {
         this.field_11549 = var1.method_37602(2);
         this.field_690 = var1.method_37602(2);
         if (var2 != null) {
            var2.method_21089(this.field_11549, 2);
            var2.method_21089(this.field_690, 2);
         }
      }
   }

   @Override
   public void method_20558(class_8212 var1, class_1915 var2) {
      if (this.field_11535 != 0) {
         super.method_20558(var1, var2);
         switch (this.field_690) {
            case 0:
               this.field_686 = field_21609[var1.method_37602(6)];
               this.field_687 = field_21609[var1.method_37602(6)];
               this.field_689 = field_21609[var1.method_37602(6)];
               break;
            case 1:
               this.field_686 = this.field_687 = field_21609[var1.method_37602(6)];
               this.field_689 = field_21609[var1.method_37602(6)];
               break;
            case 2:
               this.field_686 = this.field_687 = this.field_689 = field_21609[var1.method_37602(6)];
               break;
            case 3:
               this.field_686 = field_21609[var1.method_37602(6)];
               this.field_687 = this.field_689 = field_21609[var1.method_37602(6)];
         }
      }
   }

   @Override
   public boolean method_20556(class_8212 var1) {
      return super.method_20556(var1);
   }

   @Override
   public boolean method_20554(int var1, class_2948 var2, class_2948 var3) {
      if (this.field_11535 != 0) {
         float var6 = this.field_11528[this.field_11546];
         if (this.field_11533[0] == null) {
            var6 = (var6 + this.field_11525[0]) * this.field_11543[0];
         }

         if (var1 != 0) {
            if (var1 != 1) {
               if (this.field_11513 > 4) {
                  if (this.field_11513 > 8) {
                     var6 *= this.field_689;
                  } else {
                     var6 *= this.field_687;
                  }
               } else {
                  var6 *= this.field_686;
               }

               var2.method_13496(var6, this.field_11545);
            } else {
               if (this.field_11513 > 4) {
                  if (this.field_11513 > 8) {
                     var6 *= this.field_11527;
                  } else {
                     var6 *= this.field_11532;
                  }
               } else {
                  var6 *= this.field_11516;
               }

               var2.method_13496(var6, this.field_11545);
            }
         } else {
            float var11;
            if (this.field_11513 > 4) {
               if (this.field_11513 > 8) {
                  var6 *= this.field_11527;
                  var11 = var6 * this.field_689;
               } else {
                  var6 *= this.field_11532;
                  var11 = var6 * this.field_687;
               }
            } else {
               var6 *= this.field_11516;
               var11 = var6 * this.field_686;
            }

            var2.method_13496(var6, this.field_11545);
            var3.method_13496(var11, this.field_11545);
         }
      }

      return ++this.field_11546 == 3;
   }
}
