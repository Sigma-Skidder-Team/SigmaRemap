package remapped;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

public class class_4182 {
   private static String[] field_20354;
   private Object field_20358;
   private Class<?> field_20360;
   private Method field_20356;
   private class_5698 field_20355;
   private MethodHandle field_20357;
   private class_863 field_20353;
   private boolean field_20359;

   public class_4182(Object var1, Class<?> var2, Method var3, class_863 var4) {
      this.field_20358 = var1;
      this.field_20360 = var2;
      this.field_20356 = var3;
      this.field_20355 = class_5779.method_26142(var3);

      try {
         this.field_20357 = MethodHandles.lookup().unreflect(var3);
      } catch (IllegalAccessException var8) {
         var8.printStackTrace();
      }

      this.field_20353 = var4;
      this.field_20359 = var1.getClass().getSuperclass() == NCPPhase.class.getSuperclass();
   }

   public Object method_19459() {
      return this.field_20358;
   }

   public MethodHandle method_19458() {
      return this.field_20357;
   }

   public class_5698 method_19456() {
      return this.field_20355;
   }

   public Method method_19457() {
      return this.field_20356;
   }

   public class_863 method_19455() {
      return this.field_20353;
   }

   public boolean method_19454() {
      return this.field_20359;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_4182)) {
         return false;
      } else {
         class_4182 var4 = (class_4182)var1;
         return this.field_20358 == var4.field_20358 && this.field_20356 == var4.field_20356 && this.field_20353 == var4.field_20353;
      }
   }
}
