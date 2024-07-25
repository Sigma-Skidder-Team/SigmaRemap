package remapped;

import org.jetbrains.annotations.Nullable;

public abstract class class_2526<T1, T2> implements class_1450<T1> {
   private final class_8039<T1> field_12525;
   private final class_8039<T2> field_12524;

   public class_2526(class_8039<T1> var1, class_8039<T2> var2) {
      this.field_12525 = var1;
      this.field_12524 = var2;
   }

   public class_2526(class_8039<T2> var1) {
      this(null, var1);
   }

   public abstract T2 method_11518(class_5051 var1, T1 var2) throws Exception;

   @Override
   public void method_6684(class_5051 var1, T1 var2) throws Exception {
      try {
         var1.method_23236(this.field_12524, this.method_11518(var1, (T1)var2));
      } catch (class_9699 var6) {
         var6.method_44826(this.getClass());
         throw var6;
      }
   }

   @Nullable
   public class_8039<T1> method_11519() {
      return this.field_12525;
   }

   public class_8039<T2> method_11516() {
      return this.field_12524;
   }
}
