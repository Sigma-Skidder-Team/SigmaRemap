package remapped;

import java.io.IOException;
import javax.annotation.Nullable;

public abstract class class_3232 implements class_5002, AutoCloseable {
   @Nullable
   public class_2654 method_14820(int var1, int var2, boolean var3) {
      return (class_2654)this.method_14819(var1, var2, class_7335.field_37514, var3);
   }

   @Nullable
   public class_2654 method_14822(int var1, int var2) {
      return this.method_14820(var1, var2, false);
   }

   @Nullable
   @Override
   public class_6163 method_23025(int var1, int var2) {
      return this.method_14819(var1, var2, class_7335.field_37504, false);
   }

   public boolean method_14816(int var1, int var2) {
      return this.method_14819(var1, var2, class_7335.field_37514, false) != null;
   }

   @Nullable
   public abstract class_5990 method_14819(int var1, int var2, class_7335 var3, boolean var4);

   public abstract String method_14814();

   @Override
   public void close() throws IOException {
   }

   public abstract class_4663 method_14813();

   public void method_14821(boolean var1, boolean var2) {
   }

   public void method_14817(class_2034 var1, boolean var2) {
   }

   public boolean method_14824(Entity var1) {
      return true;
   }

   public boolean method_14823(class_2034 var1) {
      return true;
   }

   public boolean method_14815(BlockPos var1) {
      return true;
   }
}
