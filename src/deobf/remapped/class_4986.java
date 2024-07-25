package remapped;

import javax.annotation.Nullable;

public class class_4986 {
   private static String[] field_25822;
   public final PlayerEntity field_25824;
   private boolean field_25821;
   private int field_25825;
   private int field_25818;
   private int field_25816;
   private int field_25823;
   private int field_25817;
   public int field_25819;

   public class_4986(class_2134 var1, PlayerEntity var2) {
      this.field_25820 = var1;
      this.field_25821 = true;
      this.field_25816 = 127;
      this.field_25823 = 127;
      this.field_25824 = var2;
   }

   @Nullable
   public Packet<?> method_22949(ItemStack var1) {
      if (!this.field_25821) {
         return this.field_25817++ % 5 != 0
            ? null
            : new class_1053(
               class_2143.method_10009(var1),
               this.field_25820.field_10678,
               this.field_25820.field_10681,
               this.field_25820.field_10686,
               this.field_25820.field_10683.values(),
               this.field_25820.field_10691,
               0,
               0,
               0,
               0
            );
      } else {
         this.field_25821 = false;
         return new class_1053(
            class_2143.method_10009(var1),
            this.field_25820.field_10678,
            this.field_25820.field_10681,
            this.field_25820.field_10686,
            this.field_25820.field_10683.values(),
            this.field_25820.field_10691,
            this.field_25825,
            this.field_25818,
            this.field_25816 + 1 - this.field_25825,
            this.field_25823 + 1 - this.field_25818
         );
      }
   }

   public void method_22948(int var1, int var2) {
      if (!this.field_25821) {
         this.field_25821 = true;
         this.field_25825 = var1;
         this.field_25818 = var2;
         this.field_25816 = var1;
         this.field_25823 = var2;
      } else {
         this.field_25825 = Math.min(this.field_25825, var1);
         this.field_25818 = Math.min(this.field_25818, var2);
         this.field_25816 = Math.max(this.field_25816, var1);
         this.field_25823 = Math.max(this.field_25823, var2);
      }
   }
}
