package remapped;

import org.jetbrains.annotations.Nullable;

public class class_1739 {
   private final class_4106 field_8957;
   private final class_3227 field_8956;
   private final int field_8954 = 8;

   public class_1739(class_4106 var1, class_3227 var2) {
      this.field_8957 = var1;
      this.field_8956 = var2;
   }

   public void method_7755(class_1372 var1) {
      this.field_8957.method_19015(var1, new class_2383(this));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   public class_3227 method_7753(class_1121 var1) {
      switch (var1) {
         case field_6407:
            return this.field_8957.method_19008().method_28211() != null ? var1x -> this.field_8957.method_19008().method_28207(var1x) : null;
         case field_6409:
            return this.field_8957.method_19008().method_28215() != null ? var1x -> this.field_8957.method_19008().method_28210(var1x) : null;
         case field_6410:
            return this.field_8956;
         default:
            throw new IllegalArgumentException("Unknown registry type in statistics packet: " + var1);
      }
   }

   @Nullable
   public class_1121 method_7751(int var1) {
      switch (var1) {
         case 0:
            return class_1121.field_6407;
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            return class_1121.field_6409;
         case 6:
         case 7:
            return class_1121.field_6410;
         default:
            return null;
      }
   }
}
