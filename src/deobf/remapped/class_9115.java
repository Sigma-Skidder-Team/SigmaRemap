package remapped;

import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_9115 {
   private static String[] field_46661;
   private final class_4924 field_46658;
   private final BlockPos field_46662;
   private final boolean field_46659;
   private class_2522 field_46663;
   private class_3757 field_46660;
   private boolean field_46657;

   public class_9115(class_4924 var1, BlockPos var2, boolean var3) {
      this.field_46658 = var1;
      this.field_46662 = var2.method_6072();
      this.field_46659 = var3;
   }

   public class_2522 method_41968() {
      if (this.field_46663 == null && (this.field_46659 || this.field_46658.isBlockLoaded(this.field_46662))) {
         this.field_46663 = this.field_46658.method_28262(this.field_46662);
      }

      return this.field_46663;
   }

   @Nullable
   public class_3757 method_41967() {
      if (this.field_46660 == null && !this.field_46657) {
         this.field_46660 = this.field_46658.method_28260(this.field_46662);
         this.field_46657 = true;
      }

      return this.field_46660;
   }

   public class_4924 method_41969() {
      return this.field_46658;
   }

   public BlockPos method_41966() {
      return this.field_46662;
   }

   public static Predicate<class_9115> method_41965(Predicate<class_2522> var0) {
      return var1 -> var1 != null && var0.test(var1.method_41968());
   }
}
