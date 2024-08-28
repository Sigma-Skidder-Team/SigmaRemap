package mapped;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;

public final class Class7723 {
   public final Class6165 field33157;
   public final Proxy field33158;
   public final InetSocketAddress field33159;

   public Class7723(Class6165 var1, Proxy var2, InetSocketAddress var3) {
      if (var1 != null) {
         if (var2 != null) {
            if (var3 != null) {
               this.field33157 = var1;
               this.field33158 = var2;
               this.field33159 = var3;
            } else {
               throw new NullPointerException("inetSocketAddress == null");
            }
         } else {
            throw new NullPointerException("proxy == null");
         }
      } else {
         throw new NullPointerException("address == null");
      }
   }

   public Class6165 method25539() {
      return this.field33157;
   }

   public Proxy method25540() {
      return this.field33158;
   }

   public InetSocketAddress method25541() {
      return this.field33159;
   }

   public boolean method25542() {
      return this.field33157.field27588 != null && this.field33158.type() == Type.HTTP;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Class7723
         && ((Class7723)var1).field33157.equals(this.field33157)
         && ((Class7723)var1).field33158.equals(this.field33158)
         && ((Class7723)var1).field33159.equals(this.field33159);
   }

   @Override
   public int hashCode() {
      int var3 = 17;
      var3 = 31 * var3 + this.field33157.hashCode();
      var3 = 31 * var3 + this.field33158.hashCode();
      return 31 * var3 + this.field33159.hashCode();
   }

   @Override
   public String toString() {
      return "Route{" + this.field33159 + "}";
   }
}
