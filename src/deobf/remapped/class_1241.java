package remapped;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

public class class_1241 implements InvocationHandler {
   private final List<String> field_6854;
   public boolean field_6857;
   public String field_6856;

   public class_1241(List<String> var1) {
      this.field_6854 = var1;
   }

   @Override
   public Object invoke(Object var1, Method var2, Object[] var3) throws Throwable {
      String var6 = var2.getName();
      Class var7 = var2.getReturnType();
      if (var3 == null) {
         var3 = class_8515.field_43588;
      }

      if (var6.equals("supports") && boolean.class == var7) {
         return true;
      } else if (var6.equals("unsupported") && void.class == var7) {
         this.field_6857 = true;
         return null;
      } else if (var6.equals("protocols") && ((Object[])var3).length == 0) {
         return this.field_6854;
      } else if ((var6.equals("selectProtocol") || var6.equals("select"))
         && String.class == var7
         && ((Object[])var3).length == 1
         && ((Object[])var3)[0] instanceof List) {
         List var8 = (List)((Object[])var3)[0];
         int var9 = 0;

         for (int var10 = var8.size(); var9 < var10; var9++) {
            if (this.field_6854.contains(var8.get(var9))) {
               return this.field_6856 = (String)var8.get(var9);
            }
         }

         return this.field_6856 = this.field_6854.get(0);
      } else if ((var6.equals("protocolSelected") || var6.equals("selected")) && ((Object[])var3).length == 1) {
         this.field_6856 = (String)((Object[])var3)[0];
         return null;
      } else {
         return var2.invoke(this, (Object[])var3);
      }
   }
}
