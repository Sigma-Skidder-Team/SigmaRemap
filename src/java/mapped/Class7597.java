package mapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

public class Class7597 extends Class7596 {
   private final Method field32614;
   private final Method field32615;
   private final Method field32616;
   private final Class<?> field32617;
   private final Class<?> field32618;

   public Class7597(Method var1, Method var2, Method var3, Class<?> var4, Class<?> var5) {
      this.field32614 = var1;
      this.field32615 = var2;
      this.field32616 = var3;
      this.field32617 = var4;
      this.field32618 = var5;
   }

   @Override
   public void method24871(SSLSocket var1, String var2, List<Class2201> var3) {
      List var6 = method24882(var3);

      try {
         Object var7 = Proxy.newProxyInstance(Class7596.class.getClassLoader(), new Class[]{this.field32617, this.field32618}, new Class3(var6));
         this.field32614.invoke(null, var1, var7);
      } catch (IllegalAccessException | InvocationTargetException var8) {
         throw new AssertionError(var8);
      }
   }

   @Override
   public void method24881(SSLSocket var1) {
      try {
         this.field32616.invoke(null, var1);
      } catch (InvocationTargetException | IllegalAccessException var5) {
         throw new AssertionError();
      }
   }

   @Override
   public String method24872(SSLSocket var1) {
      try {
         Class3 var4 = (Class3)Proxy.getInvocationHandler(this.field32615.invoke(null, var1));
         if (!var4.field4 && var4.field5 == null) {
            Class7596.method24879().method24873(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
            return null;
         } else {
            return var4.field4 ? null : var4.field5;
         }
      } catch (IllegalAccessException | InvocationTargetException var5) {
         throw new AssertionError();
      }
   }

   public static Class7596 method24886() {
      try {
         String var2 = "org.eclipse.jetty.alpn.ALPN";
         Class var3 = Class.forName(var2);
         Class var4 = Class.forName(var2 + "$Provider");
         Class var5 = Class.forName(var2 + "$ClientProvider");
         Class var6 = Class.forName(var2 + "$ServerProvider");
         Method var7 = var3.getMethod("put", SSLSocket.class, var4);
         Method var8 = var3.getMethod("get", SSLSocket.class);
         Method var9 = var3.getMethod("remove", SSLSocket.class);
         return new Class7597(var7, var8, var9, var5, var6);
      } catch (NoSuchMethodException | ClassNotFoundException var10) {
         return null;
      }
   }
}
