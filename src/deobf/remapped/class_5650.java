package remapped;

import java.util.EnumSet;
import javax.annotation.Nullable;

public class class_5650 extends class_3599 {
   private static String[] field_28662;

   public class_5650(class_8829 var1) {
      this.field_28663 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   @Override
   public boolean method_16795() {
      return class_8829.method_40587(this.field_28663).method_5591() && class_8829.method_40622(this.field_28663).nextInt(10) == 0;
   }

   @Override
   public boolean method_16799() {
      return class_8829.method_40562(this.field_28663).method_5608();
   }

   @Override
   public void method_16796() {
      Vector3d var3 = this.method_25566();
      if (var3 != null) {
         class_8829.method_40547(this.field_28663).method_5607(class_8829.method_40572(this.field_28663).method_5615(new BlockPos(var3), 1), 1.0);
      }
   }

   @Nullable
   private Vector3d method_25566() {
      Vector3d var3;
      if (class_8829.method_40604(this.field_28663) && !class_8829.method_40573(this.field_28663, class_8829.method_40569(this.field_28663), 22)) {
         Vector3d var4 = Vector3d.method_6216(class_8829.method_40569(this.field_28663));
         var3 = var4.method_6194(this.field_28663.method_37245()).method_6213();
      } else {
         var3 = this.field_28663.method_37307(0.0F);
      }

      byte var6 = 8;
      Vector3d var5 = class_3425.method_15842(this.field_28663, 8, 7, var3, (float) (Math.PI / 2), 2, 1);
      return var5 == null ? class_3425.method_15843(this.field_28663, 8, 4, -2, var3, (float) (Math.PI / 2)) : var5;
   }
}
