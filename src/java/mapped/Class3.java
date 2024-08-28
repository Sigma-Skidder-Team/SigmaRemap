package mapped;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

public class Class3 implements InvocationHandler {
   private final List<String> field3;
   public boolean field4;
   public String field5;

   public Class3(List<String> var1) {
      this.field3 = var1;
   }

   @Override
   public Object invoke(Object var1, Method var2, Object[] var3) throws Throwable {
      String var6 = var2.getName();
      Class var7 = var2.getReturnType();
      if (var3 == null) {
         var3 = Class9474.field44016;
      }

      if (var6.equals("supports") && boolean.class == var7) {
         return true;
      } else if (var6.equals("unsupported") && void.class == var7) {
         this.field4 = true;
         return null;
      } else if (var6.equals("protocols") && ((Object[])var3).length == 0) {
         return this.field3;
      } else if ((var6.equals("selectProtocol") || var6.equals("select"))
         && String.class == var7
         && ((Object[])var3).length == 1
         && ((Object[])var3)[0] instanceof List) {
         List var8 = (List)((Object[])var3)[0];
         int var9 = 0;

         for (int var10 = var8.size(); var9 < var10; var9++) {
            if (this.field3.contains(var8.get(var9))) {
               return this.field5 = (String)var8.get(var9);
            }
         }

         return this.field5 = this.field3.get(0);
      } else if ((var6.equals("protocolSelected") || var6.equals("selected")) && ((Object[])var3).length == 1) {
         this.field5 = (String)((Object[])var3)[0];
         return null;
      } else {
         return var2.invoke(this, (Object[])var3);
      }
   }
}
