package remapped;

import javax.annotation.Nullable;

public final class class_4795 implements class_6163 {
   private static String[] field_23974;
   private final class_2522[] field_23975;

   public class_4795(class_2522[] var1) {
      this.field_23975 = var1;
   }

   @Nullable
   @Override
   public class_3757 method_28260(BlockPos var1) {
      return null;
   }

   @Override
   public class_2522 method_28262(BlockPos var1) {
      int var4 = var1.method_12165();
      return var4 >= 0 && var4 < this.field_23975.length ? this.field_23975[var4] : class_4783.field_23184.method_29260();
   }

   @Override
   public class_4774 method_28258(BlockPos var1) {
      return this.method_28262(var1).method_8364();
   }
}
