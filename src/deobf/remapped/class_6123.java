package remapped;

import io.netty.buffer.ByteBuf;
import java.lang.reflect.Array;

public class class_6123<T> extends class_8039<T[]> {
   private final class_8039<T> field_31315;

   public class_6123(class_8039<T> var1) {
      super(var1.method_36494() + " Array", (Class<? super T[]>)method_28142(var1.method_36493()));
      this.field_31315 = var1;
   }

   public static Class<?> method_28142(Class<?> var0) {
      return Array.newInstance(var0, 0).getClass();
   }

   public T[] method_28143(ByteBuf var1) throws Exception {
      int var4 = class_8039.field_41157.method_15647(var1);
      Object[] var5 = (Object[])Array.newInstance(this.field_31315.method_36493(), var4);

      for (int var6 = 0; var6 < var4; var6++) {
         var5[var6] = this.field_31315.method_9912(var1);
      }

      return (T[])var5;
   }

   public void method_28141(ByteBuf var1, T[] var2) throws Exception {
      class_8039.field_41157.method_15644(var1, var2.length);

      for (Object var8 : var2) {
         this.field_31315.method_33275(var1, (T)var8);
      }
   }
}
