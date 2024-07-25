package remapped;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.Proxy.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public final class class_6678 {
   private final class_497 field_34518;
   private final class_5740 field_34522;
   private Proxy field_34514;
   private InetSocketAddress field_34519;
   private List<Proxy> field_34521 = Collections.<Proxy>emptyList();
   private int field_34515;
   private List<InetSocketAddress> field_34520 = Collections.<InetSocketAddress>emptyList();
   private int field_34516;
   private final List<class_2535> field_34513 = new ArrayList<class_2535>();

   public class_6678(class_497 var1, class_5740 var2) {
      this.field_34518 = var1;
      this.field_34522 = var2;
      this.method_30635(var1.method_2484(), var1.method_2476());
   }

   public boolean method_30642() {
      return this.method_30632() || this.method_30644() || this.method_30634();
   }

   public class_2535 method_30639() throws IOException {
      if (!this.method_30632()) {
         if (!this.method_30644()) {
            if (this.method_30634()) {
               return this.method_30641();
            }

            throw new NoSuchElementException();
         }

         this.field_34514 = this.method_30643();
      }

      this.field_34519 = this.method_30637();
      class_2535 var3 = new class_2535(this.field_34518, this.field_34514, this.field_34519);
      if (!this.field_34522.method_25985(var3)) {
         return var3;
      } else {
         this.field_34513.add(var3);
         return this.method_30639();
      }
   }

   public void method_30638(class_2535 var1, IOException var2) {
      if (var1.method_11561().type() != Type.DIRECT && this.field_34518.method_2485() != null) {
         this.field_34518.method_2485().connectFailed(this.field_34518.method_2484().method_7478(), var1.method_11561().address(), var2);
      }

      this.field_34522.method_25986(var1);
   }

   private void method_30635(class_1672 var1, Proxy var2) {
      if (var2 == null) {
         List var5 = this.field_34518.method_2485().select(var1.method_7478());
         this.field_34521 = var5 != null && !var5.isEmpty() ? class_8515.<Proxy>method_39210(var5) : class_8515.<Proxy>method_39211(Proxy.NO_PROXY);
      } else {
         this.field_34521 = Collections.<Proxy>singletonList(var2);
      }

      this.field_34515 = 0;
   }

   private boolean method_30644() {
      return this.field_34515 < this.field_34521.size();
   }

   private Proxy method_30643() throws IOException {
      if (this.method_30644()) {
         Proxy var3 = this.field_34521.get(this.field_34515++);
         this.method_30640(var3);
         return var3;
      } else {
         throw new SocketException("No route to " + this.field_34518.method_2484().method_7449() + "; exhausted proxy configurations: " + this.field_34521);
      }
   }

   private void method_30640(Proxy var1) throws IOException {
      this.field_34520 = new ArrayList<InetSocketAddress>();
      String var4;
      int var5;
      if (var1.type() != Type.DIRECT && var1.type() != Type.SOCKS) {
         SocketAddress var6 = var1.address();
         if (!(var6 instanceof InetSocketAddress)) {
            throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + var6.getClass());
         }

         InetSocketAddress var7 = (InetSocketAddress)var6;
         var4 = method_30633(var7);
         var5 = var7.getPort();
      } else {
         var4 = this.field_34518.method_2484().method_7449();
         var5 = this.field_34518.method_2484().method_7472();
      }

      if (var5 >= 1 && var5 <= 65535) {
         if (var1.type() != Type.SOCKS) {
            List var10 = this.field_34518.method_2481().method_33145(var4);
            if (var10.isEmpty()) {
               throw new UnknownHostException(this.field_34518.method_2481() + " returned no addresses for " + var4);
            }

            int var11 = 0;

            for (int var8 = var10.size(); var11 < var8; var11++) {
               InetAddress var9 = (InetAddress)var10.get(var11);
               this.field_34520.add(new InetSocketAddress(var9, var5));
            }
         } else {
            this.field_34520.add(InetSocketAddress.createUnresolved(var4, var5));
         }

         this.field_34516 = 0;
      } else {
         throw new SocketException("No route to " + var4 + ":" + var5 + "; port is out of range");
      }
   }

   public static String method_30633(InetSocketAddress var0) {
      InetAddress var3 = var0.getAddress();
      return var3 != null ? var3.getHostAddress() : var0.getHostName();
   }

   private boolean method_30632() {
      return this.field_34516 < this.field_34520.size();
   }

   private InetSocketAddress method_30637() throws IOException {
      if (this.method_30632()) {
         return this.field_34520.get(this.field_34516++);
      } else {
         throw new SocketException("No route to " + this.field_34518.method_2484().method_7449() + "; exhausted inet socket addresses: " + this.field_34520);
      }
   }

   private boolean method_30634() {
      return !this.field_34513.isEmpty();
   }

   private class_2535 method_30641() {
      return this.field_34513.remove(0);
   }
}
