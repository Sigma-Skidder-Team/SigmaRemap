package mapped;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

public final class Class8574 {
   private static final Class9204[] field38545 = new Class9204[]{
      Class9204.field42372,
      Class9204.field42376,
      Class9204.field42373,
      Class9204.field42377,
      Class9204.field42383,
      Class9204.field42382,
      Class9204.field42347,
      Class9204.field42357,
      Class9204.field42348,
      Class9204.field42358,
      Class9204.field42329,
      Class9204.field42330,
      Class9204.field42301,
      Class9204.field42305,
      Class9204.field42279
   };
   public static final Class8574 field38546 = new Class9031(true)
      .method33441(field38545)
      .method33444(Class2034.field13205, Class2034.field13206, Class2034.field13207, Class2034.field13208)
      .method33446(true)
      .method33447();
   public static final Class8574 field38547 = new Class9031(field38546).method33444(Class2034.field13208).method33446(true).method33447();
   public static final Class8574 field38548 = new Class9031(false).method33447();
   public final boolean field38549;
   public final boolean field38550;
   public final String[] field38551;
   public final String[] field38552;

   public Class8574(Class9031 var1) {
      this.field38549 = var1.field41324;
      this.field38551 = var1.field41325;
      this.field38552 = var1.field41326;
      this.field38550 = var1.field41327;
   }

   public boolean method30638() {
      return this.field38549;
   }

   @Nullable
   public List<Class9204> method30639() {
      return this.field38551 == null ? null : Class9204.method34492(this.field38551);
   }

   @Nullable
   public List<Class2034> method30640() {
      return this.field38552 == null ? null : Class2034.method8677(this.field38552);
   }

   public boolean method30641() {
      return this.field38550;
   }

   public void method30642(SSLSocket var1, boolean var2) {
      Class8574 var5 = this.method30643(var1, var2);
      if (var5.field38552 != null) {
         var1.setEnabledProtocols(var5.field38552);
      }

      if (var5.field38551 != null) {
         var1.setEnabledCipherSuites(var5.field38551);
      }
   }

   private Class8574 method30643(SSLSocket var1, boolean var2) {
      String[] var5 = this.field38551 == null
         ? var1.getEnabledCipherSuites()
         : Class9474.method36543(Class9204.field42270, var1.getEnabledCipherSuites(), this.field38551);
      String[] var6 = this.field38552 == null
         ? var1.getEnabledProtocols()
         : Class9474.method36543(Class9474.field44030, var1.getEnabledProtocols(), this.field38552);
      String[] var7 = var1.getSupportedCipherSuites();
      int var8 = Class9474.method36548(Class9204.field42270, var7, "TLS_FALLBACK_SCSV");
      if (var2 && var8 != -1) {
         var5 = Class9474.method36549(var5, var7[var8]);
      }

      return new Class9031(this).method33442(var5).method33445(var6).method33447();
   }

   public boolean method30644(SSLSocket var1) {
      if (this.field38549) {
         return this.field38552 != null && !Class9474.method36544(Class9474.field44030, this.field38552, var1.getEnabledProtocols())
            ? false
            : this.field38551 == null || Class9474.method36544(Class9204.field42270, this.field38551, var1.getEnabledCipherSuites());
      } else {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof Class8574) {
         if (var1 != this) {
            Class8574 var4 = (Class8574)var1;
            if (this.field38549 == var4.field38549) {
               if (this.field38549) {
                  if (!Arrays.equals((Object[])this.field38551, (Object[])var4.field38551)) {
                     return false;
                  }

                  if (!Arrays.equals((Object[])this.field38552, (Object[])var4.field38552)) {
                     return false;
                  }

                  if (this.field38550 != var4.field38550) {
                     return false;
                  }
               }

               return true;
            } else {
               return false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var3 = 17;
      if (this.field38549) {
         var3 = 31 * var3 + Arrays.hashCode((Object[])this.field38551);
         var3 = 31 * var3 + Arrays.hashCode((Object[])this.field38552);
         var3 = 31 * var3 + (!this.field38550 ? 1 : 0);
      }

      return var3;
   }

   @Override
   public String toString() {
      if (this.field38549) {
         String var3 = this.field38551 == null ? "[all enabled]" : this.method30639().toString();
         String var4 = this.field38552 == null ? "[all enabled]" : this.method30640().toString();
         return "ConnectionSpec(cipherSuites=" + var3 + ", tlsVersions=" + var4 + ", supportsTlsExtensions=" + this.field38550 + ")";
      } else {
         return "ConnectionSpec()";
      }
   }
}
