package remapped;

import java.util.List;

public class class_3096 extends class_3558 {
   private static String[] field_15407;
   private final class_4931 field_15408;

   public class_3096(class_1799 var1) {
      super(var1);
      this.field_15406 = var1;
      this.field_15408 = new class_4931().method_22607(16.0).method_22603().method_22606(var0 -> ((class_8031)var0).method_36474() == class_9077.field_46487);
   }

   @Override
   public boolean method_16795() {
      if (this.field_15406.method_17809() == null) {
         if (!this.field_15406.method_33825()) {
            if (this.field_15406.field_41697 >= this.field_17437) {
               if (this.field_15406.field_41768.method_29537().method_1285(class_291.field_1047)) {
                  List var3 = this.field_15406
                     .field_41768
                     .<class_8031>method_25863(
                        class_8031.class, this.field_15408, this.field_15406, this.field_15406.method_37241().method_18899(16.0, 4.0, 16.0)
                     );
                  if (!var3.isEmpty()) {
                     class_1799.method_7999(this.field_15406, (class_8031)var3.get(class_1799.method_8007(this.field_15406).nextInt(var3.size())));
                     return true;
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      return class_1799.method_8006(this.field_15406) != null && this.field_17439 > 0;
   }

   @Override
   public void method_16793() {
      super.method_16793();
      class_1799.method_7999(this.field_15406, (class_8031)null);
   }

   @Override
   public void method_16543() {
      class_8031 var3 = class_1799.method_8006(this.field_15406);
      if (var3 != null && var3.isAlive()) {
         var3.method_36471(class_9077.field_46494);
      }
   }

   @Override
   public int method_16542() {
      return 40;
   }

   @Override
   public int method_16545() {
      return 60;
   }

   @Override
   public int method_16541() {
      return 140;
   }

   @Override
   public class_8461 method_16540() {
      return class_463.field_2200;
   }

   @Override
   public class_248 method_16544() {
      return class_248.field_881;
   }
}
