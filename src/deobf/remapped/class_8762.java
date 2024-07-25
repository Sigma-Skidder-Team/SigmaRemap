package remapped;

import java.util.Random;

public class class_8762 implements class_4904 {
   private static String[] field_44863;
   private final class_6098 field_44858;
   private final int field_44864;
   private final int field_44862;
   private final int field_44861;
   private final int field_44859;
   private final float field_44860;

   public class_8762(class_6414 var1, int var2, int var3, int var4, int var5) {
      this(new class_6098(var1), var2, var3, var4, var5);
   }

   public class_8762(class_2451 var1, int var2, int var3, int var4) {
      this(new class_6098(var1), var2, var3, 12, var4);
   }

   public class_8762(class_2451 var1, int var2, int var3, int var4, int var5) {
      this(new class_6098(var1), var2, var3, var4, var5);
   }

   public class_8762(class_6098 var1, int var2, int var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, 0.05F);
   }

   public class_8762(class_6098 var1, int var2, int var3, int var4, int var5, float var6) {
      this.field_44858 = var1;
      this.field_44864 = var2;
      this.field_44862 = var3;
      this.field_44861 = var4;
      this.field_44859 = var5;
      this.field_44860 = var6;
   }

   @Override
   public class_8014 method_22451(Entity var1, Random var2) {
      return new class_8014(
         new class_6098(class_4897.field_24997, this.field_44864),
         new class_6098(this.field_44858.method_27960(), this.field_44862),
         this.field_44861,
         this.field_44859,
         this.field_44860
      );
   }
}
