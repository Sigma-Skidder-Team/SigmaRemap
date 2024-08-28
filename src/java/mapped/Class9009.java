package mapped;

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

public final class Class9009 {
   private final Class6165 field41205;
   private final Class8743 field41206;
   private Proxy field41207;
   private InetSocketAddress field41208;
   private List<Proxy> field41209 = Collections.<Proxy>emptyList();
   private int field41210;
   private List<InetSocketAddress> field41211 = Collections.<InetSocketAddress>emptyList();
   private int field41212;
   private final List<Class7723> field41213 = new ArrayList<Class7723>();

   public Class9009(Class6165 var1, Class8743 var2) {
      this.field41205 = var1;
      this.field41206 = var2;
      this.method33287(var1.method19049(), var1.method19056());
   }

   public boolean method33284() {
      return this.method33292() || this.method33288() || this.method33294();
   }

   public Class7723 method33285() throws IOException {
      if (!this.method33292()) {
         if (!this.method33288()) {
            if (this.method33294()) {
               return this.method33295();
            }

            throw new NoSuchElementException();
         }

         this.field41207 = this.method33289();
      }

      this.field41208 = this.method33293();
      Class7723 var3 = new Class7723(this.field41205, this.field41207, this.field41208);
      if (!this.field41206.method31546(var3)) {
         return var3;
      } else {
         this.field41213.add(var3);
         return this.method33285();
      }
   }

   public void method33286(Class7723 var1, IOException var2) {
      if (var1.method25540().type() != Type.DIRECT && this.field41205.method19055() != null) {
         this.field41205.method19055().connectFailed(this.field41205.method19049().method22935(), var1.method25540().address(), var2);
      }

      this.field41206.method31544(var1);
   }

   private void method33287(Class7284 var1, Proxy var2) {
      if (var2 == null) {
         List var5 = this.field41205.method19055().select(var1.method22935());
         this.field41209 = var5 != null && !var5.isEmpty() ? Class9474.<Proxy>method36540(var5) : Class9474.<Proxy>method36541(Proxy.NO_PROXY);
      } else {
         this.field41209 = Collections.<Proxy>singletonList(var2);
      }

      this.field41210 = 0;
   }

   private boolean method33288() {
      return this.field41210 < this.field41209.size();
   }

   private Proxy method33289() throws IOException {
      if (this.method33288()) {
         Proxy var3 = this.field41209.get(this.field41210++);
         this.method33290(var3);
         return var3;
      } else {
         throw new SocketException("No route to " + this.field41205.method19049().method22942() + "; exhausted proxy configurations: " + this.field41209);
      }
   }

   private void method33290(Proxy var1) throws IOException {
      this.field41211 = new ArrayList<InetSocketAddress>();
      String var4;
      int var5;
      if (var1.type() != Type.DIRECT && var1.type() != Type.SOCKS) {
         SocketAddress var6 = var1.address();
         if (!(var6 instanceof InetSocketAddress)) {
            throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + var6.getClass());
         }

         InetSocketAddress var7 = (InetSocketAddress)var6;
         var4 = method33291(var7);
         var5 = var7.getPort();
      } else {
         var4 = this.field41205.method19049().method22942();
         var5 = this.field41205.method19049().method22943();
      }

      if (var5 >= 1 && var5 <= 65535) {
         if (var1.type() != Type.SOCKS) {
            List var10 = this.field41205.method19050().method21719(var4);
            if (var10.isEmpty()) {
               throw new UnknownHostException(this.field41205.method19050() + " returned no addresses for " + var4);
            }

            int var11 = 0;

            for (int var8 = var10.size(); var11 < var8; var11++) {
               InetAddress var9 = (InetAddress)var10.get(var11);
               this.field41211.add(new InetSocketAddress(var9, var5));
            }
         } else {
            this.field41211.add(InetSocketAddress.createUnresolved(var4, var5));
         }

         this.field41212 = 0;
      } else {
         throw new SocketException("No route to " + var4 + ":" + var5 + "; port is out of range");
      }
   }

   public static String method33291(InetSocketAddress var0) {
      InetAddress var3 = var0.getAddress();
      return var3 != null ? var3.getHostAddress() : var0.getHostName();
   }

   private boolean method33292() {
      return this.field41212 < this.field41211.size();
   }

   private InetSocketAddress method33293() throws IOException {
      if (this.method33292()) {
         return this.field41211.get(this.field41212++);
      } else {
         throw new SocketException("No route to " + this.field41205.method19049().method22942() + "; exhausted inet socket addresses: " + this.field41211);
      }
   }

   private boolean method33294() {
      return !this.field41213.isEmpty();
   }

   private Class7723 method33295() {
      return this.field41213.remove(0);
   }
}
