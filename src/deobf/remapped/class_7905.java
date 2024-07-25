package remapped;

import java.util.EnumSet;
import java.util.Random;

public class class_7905 extends class_8285 {
   private static String[] field_40422;
   private Direction field_40421;
   private boolean field_40423;

   public class_7905(class_6174 var1) {
      super(var1, 1.0, 10);
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564));
   }

   @Override
   public boolean method_16795() {
      if (this.field_42465.method_17809() == null) {
         if (this.field_42465.method_26927().method_5591()) {
            Random var3 = this.field_42465.method_26594();
            if (this.field_42465.world.method_29537().method_1285(class_291.field_1047) && var3.nextInt(10) == 0) {
               this.field_40421 = Direction.method_1039(var3);
               BlockPos var4 = new BlockPos(this.field_42465.method_37302(), this.field_42465.method_37309() + 0.5, this.field_42465.method_37156())
                  .method_6098(this.field_40421);
               class_2522 var5 = this.field_42465.world.method_28262(var4);
               if (class_6598.method_30380(var5)) {
                  this.field_40423 = true;
                  return true;
               }
            }

            this.field_40423 = false;
            return super.method_16795();
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      return !this.field_40423 ? super.method_16799() : false;
   }

   @Override
   public void method_16796() {
      if (this.field_40423) {
         World var3 = this.field_42465.world;
         BlockPos var4 = new BlockPos(this.field_42465.method_37302(), this.field_42465.method_37309() + 0.5, this.field_42465.method_37156())
            .method_6098(this.field_40421);
         class_2522 var5 = var3.method_28262(var4);
         if (class_6598.method_30380(var5)) {
            var3.method_7513(var4, class_6598.method_30378(var5.method_8360()), 3);
            this.field_42465.method_26909();
            this.field_42465.method_37204();
         }
      } else {
         super.method_16796();
      }
   }
}
