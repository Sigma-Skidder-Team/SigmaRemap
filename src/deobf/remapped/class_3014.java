package remapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

public class class_3014 extends class_3307 {
   private final Method field_14793;
   private final Method field_14797;
   private final Method field_14794;
   private final Class<?> field_14795;
   private final Class<?> field_14796;

   public class_3014(Method var1, Method var2, Method var3, Class<?> var4, Class<?> var5) {
      this.field_14793 = var1;
      this.field_14797 = var2;
      this.field_14794 = var3;
      this.field_14795 = var4;
      this.field_14796 = var5;
   }

   @Override
   public void method_15166(SSLSocket var1, String var2, List<class_7976> var3) {
      List var6 = method_15162(var3);

      try {
         Object var7 = Proxy.newProxyInstance(class_3307.class.getClassLoader(), new Class[]{this.field_14795, this.field_14796}, new class_1241(var6));
         this.field_14793.invoke(null, var1, var7);
      } catch (IllegalAccessException | InvocationTargetException var8) {
         throw new AssertionError(var8);
      }
   }

   @Override
   public void method_15168(SSLSocket var1) {
      try {
         this.field_14794.invoke(null, var1);
      } catch (InvocationTargetException | IllegalAccessException var5) {
         throw new AssertionError();
      }
   }

   @Override
   public String method_15174(SSLSocket var1) {
      try {
         class_1241 var4 = (class_1241)Proxy.getInvocationHandler(this.field_14797.invoke(null, var1));
         if (!var4.field_6857 && var4.field_6856 == null) {
            class_3307.method_15163().method_15167(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
            return null;
         } else {
            return var4.field_6857 ? null : var4.field_6856;
         }
      } catch (IllegalAccessException | InvocationTargetException var5) {
         throw new AssertionError();
      }
   }

   public static class_3307 method_13783() {
      try {
         String var2 = "org.eclipse.jetty.alpn.ALPN";
         Class var3 = Class.forName(var2);
         Class var4 = Class.forName(var2 + "$Provider");
         Class var5 = Class.forName(var2 + "$ClientProvider");
         Class var6 = Class.forName(var2 + "$ServerProvider");
         Method var7 = var3.getMethod("put", SSLSocket.class, var4);
         Method var8 = var3.getMethod("get", SSLSocket.class);
         Method var9 = var3.getMethod("remove", SSLSocket.class);
         return new class_3014(var7, var8, var9, var5, var6);
      } catch (NoSuchMethodException | ClassNotFoundException var10) {
         return null;
      }
   }
}
