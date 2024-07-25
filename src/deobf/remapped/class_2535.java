package remapped;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;

public final class class_2535 {
   public final class_497 field_12574;
   public final Proxy field_12573;
   public final InetSocketAddress field_12572;

   public class_2535(class_497 var1, Proxy var2, InetSocketAddress var3) {
      if (var1 != null) {
         if (var2 != null) {
            if (var3 != null) {
               this.field_12574 = var1;
               this.field_12573 = var2;
               this.field_12572 = var3;
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

   public class_497 method_11559() {
      return this.field_12574;
   }

   public Proxy method_11561() {
      return this.field_12573;
   }

   public InetSocketAddress method_11560() {
      return this.field_12572;
   }

   public boolean method_11562() {
      return this.field_12574.field_3101 != null && this.field_12573.type() == Type.HTTP;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class_2535
         && ((class_2535)var1).field_12574.equals(this.field_12574)
         && ((class_2535)var1).field_12573.equals(this.field_12573)
         && ((class_2535)var1).field_12572.equals(this.field_12572);
   }

   @Override
   public int hashCode() {
      int var3 = 17;
      var3 = 31 * var3 + this.field_12574.hashCode();
      var3 = 31 * var3 + this.field_12573.hashCode();
      return 31 * var3 + this.field_12572.hashCode();
   }

   @Override
   public String toString() {
      return "Route{" + this.field_12572 + "}";
   }
}
