package remapped;

public class class_7698 extends class_3599 {
   private static String[] field_39077;
   private final class_3845 field_39078;
   private final double field_39080;
   private boolean field_39079;
   private int field_39081;

   public class_7698(class_3845 var1, double var2) {
      this.field_39078 = var1;
      this.field_39080 = var2;
   }

   @Override
   public boolean method_16795() {
      if (!this.field_39078.method_26449()) {
         if (!this.field_39078.method_17856()) {
            return this.field_39078.method_26594().nextInt(700) == 0
               ? !class_3845.method_17871(this.field_39078).method_12170(this.field_39078.method_37245(), 64.0)
               : false;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      class_3845.method_17851(this.field_39078, true);
      this.field_39079 = false;
      this.field_39081 = 0;
   }

   @Override
   public void method_16793() {
      class_3845.method_17851(this.field_39078, false);
   }

   @Override
   public boolean method_16799() {
      return !class_3845.method_17871(this.field_39078).method_12170(this.field_39078.method_37245(), 7.0) && !this.field_39079 && this.field_39081 <= 600;
   }

   @Override
   public void method_16794() {
      BlockPos var3 = class_3845.method_17871(this.field_39078);
      boolean var4 = var3.method_12170(this.field_39078.method_37245(), 16.0);
      if (var4) {
         this.field_39081++;
      }

      if (this.field_39078.method_26927().method_5591()) {
         class_1343 var5 = class_1343.method_6200(var3);
         class_1343 var6 = class_3425.method_15841(this.field_39078, 16, 3, var5, (float) (Math.PI / 10));
         if (var6 == null) {
            var6 = class_3425.method_15837(this.field_39078, 8, 7, var5);
         }

         if (var6 != null && !var4 && !this.field_39078.world.method_28262(new BlockPos(var6)).method_8350(class_4783.field_23900)) {
            var6 = class_3425.method_15837(this.field_39078, 16, 5, var5);
         }

         if (var6 == null) {
            this.field_39079 = true;
            return;
         }

         this.field_39078.method_26927().method_5595(var6.field_7336, var6.field_7333, var6.field_7334, this.field_39080);
      }
   }
}
