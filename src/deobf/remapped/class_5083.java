package remapped;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

public final class class_5083 {
   private static final class_7463[] field_26242 = new class_7463[]{
      class_7463.field_38107,
      class_7463.field_38087,
      class_7463.field_38098,
      class_7463.field_38075,
      class_7463.field_38026,
      class_7463.field_38104,
      class_7463.field_38090,
      class_7463.field_38093,
      class_7463.field_38074,
      class_7463.field_38099,
      class_7463.field_38089,
      class_7463.field_38063,
      class_7463.field_38071,
      class_7463.field_38072,
      class_7463.field_38127
   };
   public static final class_5083 field_26244 = new class_6747(true)
      .method_30914(field_26242)
      .method_30908(class_5010.field_25918, class_5010.field_25912, class_5010.field_25917, class_5010.field_25916)
      .method_30912(true)
      .method_30906();
   public static final class_5083 field_26247 = new class_6747(field_26244).method_30908(class_5010.field_25916).method_30912(true).method_30906();
   public static final class_5083 field_26246 = new class_6747(false).method_30906();
   public final boolean field_26240;
   public final boolean field_26239;
   public final String[] field_26243;
   public final String[] field_26241;

   public class_5083(class_6747 var1) {
      this.field_26240 = var1.field_34825;
      this.field_26243 = var1.field_34829;
      this.field_26241 = var1.field_34828;
      this.field_26239 = var1.field_34826;
   }

   public boolean method_23364() {
      return this.field_26240;
   }

   @Nullable
   public List<class_7463> method_23365() {
      return this.field_26243 == null ? null : class_7463.method_33969(this.field_26243);
   }

   @Nullable
   public List<class_5010> method_23369() {
      return this.field_26241 == null ? null : class_5010.method_23058(this.field_26241);
   }

   public boolean method_23366() {
      return this.field_26239;
   }

   public void method_23363(SSLSocket var1, boolean var2) {
      class_5083 var5 = this.method_23367(var1, var2);
      if (var5.field_26241 != null) {
         var1.setEnabledProtocols(var5.field_26241);
      }

      if (var5.field_26243 != null) {
         var1.setEnabledCipherSuites(var5.field_26243);
      }
   }

   private class_5083 method_23367(SSLSocket var1, boolean var2) {
      String[] var5 = this.field_26243 == null
         ? var1.getEnabledCipherSuites()
         : class_8515.method_39207(class_7463.field_38076, var1.getEnabledCipherSuites(), this.field_26243);
      String[] var6 = this.field_26241 == null
         ? var1.getEnabledProtocols()
         : class_8515.method_39207(class_8515.field_43581, var1.getEnabledProtocols(), this.field_26241);
      String[] var7 = var1.getSupportedCipherSuites();
      int var8 = class_8515.method_39222(class_7463.field_38076, var7, "TLS_FALLBACK_SCSV");
      if (var2 && var8 != -1) {
         var5 = class_8515.method_39208(var5, var7[var8]);
      }

      return new class_6747(this).method_30913(var5).method_30907(var6).method_30906();
   }

   public boolean method_23362(SSLSocket var1) {
      if (this.field_26240) {
         return this.field_26241 != null && !class_8515.method_39196(class_8515.field_43581, this.field_26241, var1.getEnabledProtocols())
            ? false
            : this.field_26243 == null || class_8515.method_39196(class_7463.field_38076, this.field_26243, var1.getEnabledCipherSuites());
      } else {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof class_5083) {
         if (var1 != this) {
            class_5083 var4 = (class_5083)var1;
            if (this.field_26240 == var4.field_26240) {
               if (this.field_26240) {
                  if (!Arrays.equals((Object[])this.field_26243, (Object[])var4.field_26243)) {
                     return false;
                  }

                  if (!Arrays.equals((Object[])this.field_26241, (Object[])var4.field_26241)) {
                     return false;
                  }

                  if (this.field_26239 != var4.field_26239) {
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
      if (this.field_26240) {
         var3 = 31 * var3 + Arrays.hashCode((Object[])this.field_26243);
         var3 = 31 * var3 + Arrays.hashCode((Object[])this.field_26241);
         var3 = 31 * var3 + (!this.field_26239 ? 1 : 0);
      }

      return var3;
   }

   @Override
   public String toString() {
      if (this.field_26240) {
         String var3 = this.field_26243 == null ? "[all enabled]" : this.method_23365().toString();
         String var4 = this.field_26241 == null ? "[all enabled]" : this.method_23369().toString();
         return "ConnectionSpec(cipherSuites=" + var3 + ", tlsVersions=" + var4 + ", supportsTlsExtensions=" + this.field_26239 + ")";
      } else {
         return "ConnectionSpec()";
      }
   }
}
