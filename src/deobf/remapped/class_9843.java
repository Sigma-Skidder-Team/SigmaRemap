package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_9843 implements class_4904 {
   private static String[] field_49835;
   public final class_1425 field_49837;
   public final int field_49836;
   public final int field_49838;
   private final float field_49834;

   public class_9843(class_1425 var1, int var2, int var3) {
      this.field_49837 = var1;
      this.field_49836 = var2;
      this.field_49838 = var3;
      this.field_49834 = 0.05F;
   }

   @Nullable
   @Override
   public class_8014 method_22451(class_8145 var1, Random var2) {
      class_6098 var5 = new class_6098(class_4897.field_24846, 1);
      class_4699.method_21671(var5, this.field_49837, this.field_49836);
      return new class_8014(new class_6098(class_4897.field_24997, 1), var5, 12, this.field_49838, this.field_49834);
   }
}
