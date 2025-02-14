package mapped;

import java.lang.reflect.Method;

public final class Class9692 {
   private final Method field45310;
   private final Method field45311;
   private final Method field45312;

   public Class9692(Method var1, Method var2, Method var3) {
      this.field45310 = var1;
      this.field45311 = var2;
      this.field45312 = var3;
   }

   public Object method37944(String var1) {
      if (this.field45310 != null) {
         try {
            Object var4 = this.field45310.invoke(null);
            this.field45311.invoke(var4, var1);
            return var4;
         } catch (Exception var5) {
         }
      }

      return null;
   }

   public boolean method37945(Object var1) {
      boolean var4 = false;
      if (var1 != null) {
         try {
            this.field45312.invoke(var1);
            var4 = true;
         } catch (Exception var6) {
         }
      }

      return var4;
   }

   public static Class9692 method37946() {
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

      return new Class9692(var3, var4, var5);
   }
}
