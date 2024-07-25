package remapped;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class class_497 {
   public final class_1672 field_3102;
   public final class_7251 field_3103;
   public final SocketFactory field_3106;
   public final class_8631 field_3098;
   public final List<class_7976> field_3107;
   public final List<class_5083> field_3105;
   public final ProxySelector field_3108;
   public final Proxy field_3104;
   public final SSLSocketFactory field_3101;
   public final HostnameVerifier field_3099;
   public final class_4446 field_3100;

   public class_497(
      String var1,
      int var2,
      class_7251 var3,
      SocketFactory var4,
      SSLSocketFactory var5,
      HostnameVerifier var6,
      class_4446 var7,
      class_8631 var8,
      Proxy var9,
      List<class_7976> var10,
      List<class_5083> var11,
      ProxySelector var12
   ) {
      this.field_3102 = new class_2023().method_9419(var5 == null ? "http" : "https").method_9428(var1).method_9426(var2).method_9397();
      if (var3 != null) {
         this.field_3103 = var3;
         if (var4 != null) {
            this.field_3106 = var4;
            if (var8 != null) {
               this.field_3098 = var8;
               if (var10 != null) {
                  this.field_3107 = class_8515.<class_7976>method_39210(var10);
                  if (var11 != null) {
                     this.field_3105 = class_8515.<class_5083>method_39210(var11);
                     if (var12 != null) {
                        this.field_3108 = var12;
                        this.field_3104 = var9;
                        this.field_3101 = var5;
                        this.field_3099 = var6;
                        this.field_3100 = var7;
                     } else {
                        throw new NullPointerException("proxySelector == null");
                     }
                  } else {
                     throw new NullPointerException("connectionSpecs == null");
                  }
               } else {
                  throw new NullPointerException("protocols == null");
               }
            } else {
               throw new NullPointerException("proxyAuthenticator == null");
            }
         } else {
            throw new NullPointerException("socketFactory == null");
         }
      } else {
         throw new NullPointerException("dns == null");
      }
   }

   public class_1672 method_2484() {
      return this.field_3102;
   }

   public class_7251 method_2481() {
      return this.field_3103;
   }

   public SocketFactory method_2479() {
      return this.field_3106;
   }

   public class_8631 method_2475() {
      return this.field_3098;
   }

   public List<class_7976> method_2482() {
      return this.field_3107;
   }

   public List<class_5083> method_2483() {
      return this.field_3105;
   }

   public ProxySelector method_2485() {
      return this.field_3108;
   }

   @Nullable
   public Proxy method_2476() {
      return this.field_3104;
   }

   @Nullable
   public SSLSocketFactory method_2474() {
      return this.field_3101;
   }

   @Nullable
   public HostnameVerifier method_2480() {
      return this.field_3099;
   }

   @Nullable
   public class_4446 method_2473() {
      return this.field_3100;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class_497 && this.field_3102.equals(((class_497)var1).field_3102) && this.method_2478((class_497)var1);
   }

   @Override
   public int hashCode() {
      int var3 = 17;
      var3 = 31 * var3 + this.field_3102.hashCode();
      var3 = 31 * var3 + this.field_3103.hashCode();
      var3 = 31 * var3 + this.field_3098.hashCode();
      var3 = 31 * var3 + this.field_3107.hashCode();
      var3 = 31 * var3 + this.field_3105.hashCode();
      var3 = 31 * var3 + this.field_3108.hashCode();
      var3 = 31 * var3 + (this.field_3104 == null ? 0 : this.field_3104.hashCode());
      var3 = 31 * var3 + (this.field_3101 == null ? 0 : this.field_3101.hashCode());
      var3 = 31 * var3 + (this.field_3099 == null ? 0 : this.field_3099.hashCode());
      return 31 * var3 + (this.field_3100 == null ? 0 : this.field_3100.hashCode());
   }

   public boolean method_2478(class_497 var1) {
      return this.field_3103.equals(var1.field_3103)
         && this.field_3098.equals(var1.field_3098)
         && this.field_3107.equals(var1.field_3107)
         && this.field_3105.equals(var1.field_3105)
         && this.field_3108.equals(var1.field_3108)
         && class_8515.method_39214(this.field_3104, var1.field_3104)
         && class_8515.method_39214(this.field_3101, var1.field_3101)
         && class_8515.method_39214(this.field_3099, var1.field_3099)
         && class_8515.method_39214(this.field_3100, var1.field_3100)
         && this.method_2484().method_7472() == var1.method_2484().method_7472();
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder().append("Address{").append(this.field_3102.method_7449()).append(":").append(this.field_3102.method_7472());
      if (this.field_3104 == null) {
         var3.append(", proxySelector=").append(this.field_3108);
      } else {
         var3.append(", proxy=").append(this.field_3104);
      }

      var3.append("}");
      return var3.toString();
   }
}
