package remapped;

import java.lang.reflect.Method;

public final class class_9361 {
   private final Method field_47816;
   private final Method field_47813;
   private final Method field_47815;

   public class_9361(Method var1, Method var2, Method var3) {
      this.field_47816 = var1;
      this.field_47813 = var2;
      this.field_47815 = var3;
   }

   public Object method_43295(String var1) {
      if (this.field_47816 != null) {
         try {
            Object var4 = this.field_47816.invoke(null);
            this.field_47813.invoke(var4, var1);
            return var4;
         } catch (Exception var5) {
         }
      }

      return null;
   }

   public boolean method_43293(Object var1) {
      boolean var4 = false;
      if (var1 != null) {
         try {
            this.field_47815.invoke(var1);
            var4 = true;
         } catch (Exception var6) {
         }
      }

      return var4;
   }

   public static class_9361 method_43294() {
      Method var3;
      Method var4;
      Method var5;
      try {
         Class var2 = Class.forName("dalvik.system.CloseGuard");
         var3 = var2.getMethod("get");
         var4 = var2.getMethod("open", String.class);
         var5 = var2.getMethod("warnIfOpen");
      } catch (Exception var6) {
         var3 = null;
         var4 = null;
         var5 = null;
      }

      return new class_9361(var3, var4, var5);
   }
}
