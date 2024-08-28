package mapped;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public final class Class1797 implements Closeable {
   public final Class8223 field9682;
   public final Class2201 field9683;
   public final int field9684;
   public final String field9685;
   public final Class6027 field9686;
   public final Class9371 field9687;
   public final Class1793 field9688;
   public final Class1797 field9689;
   public final Class1797 field9690;
   public final Class1797 field9691;
   public final long field9692;
   public final long field9693;
   private volatile Class7319 field9694;

   public Class1797(Class9279 var1) {
      this.field9682 = var1.field42684;
      this.field9683 = var1.field42685;
      this.field9684 = var1.field42686;
      this.field9685 = var1.field42687;
      this.field9686 = var1.field42688;
      this.field9687 = var1.field42689.method34442();
      this.field9688 = var1.field42690;
      this.field9689 = var1.field42691;
      this.field9690 = var1.field42692;
      this.field9691 = var1.field42693;
      this.field9692 = var1.field42694;
      this.field9693 = var1.field42695;
   }

   public Class8223 method7844() {
      return this.field9682;
   }

   public Class2201 method7845() {
      return this.field9683;
   }

   public int method7846() {
      return this.field9684;
   }

   public boolean method7847() {
      return this.field9684 >= 200 && this.field9684 < 300;
   }

   public String method7848() {
      return this.field9685;
   }

   public Class6027 method7849() {
      return this.field9686;
   }

   public List<String> method7850(String var1) {
      return this.field9687.values(var1);
   }

   @Nullable
   public String method7851(String var1) {
      return this.method7852(var1, null);
   }

   @Nullable
   public String method7852(String var1, String var2) {
      String var5 = this.field9687.method35544(var1);
      return var5 == null ? var2 : var5;
   }

   public Class9371 method7853() {
      return this.field9687;
   }

   public Class1793 method7854(long var1) throws IOException {
      Class1735 var5 = this.field9688.method7836();
      var5.method7585(var1);
      Class1734 var6 = var5.method7559().clone();
      Class1734 var7;
      if (var6.method7582() <= var1) {
         var7 = var6;
      } else {
         var7 = new Class1734();
         var7.method7540(var6, var1);
         var6.method7626();
      }

      return Class1793.method7843(this.field9688.method7833(), var7.method7582(), var7);
   }

   @Nullable
   public Class1793 method7855() {
      return this.field9688;
   }

   public Class9279 method7856() {
      return new Class9279(this);
   }

   public boolean method7857() {
      switch (this.field9684) {
         case 300:
         case 301:
         case 302:
         case 303:
         case 307:
         case 308:
            return true;
         case 304:
         case 305:
         case 306:
         default:
            return false;
      }
   }

   @Nullable
   public Class1797 method7858() {
      return this.field9689;
   }

   @Nullable
   public Class1797 method7859() {
      return this.field9690;
   }

   @Nullable
   public Class1797 method7860() {
      return this.field9691;
   }

   public List<Class9824> method7861() {
      String var3;
      if (this.field9684 != 401) {
         if (this.field9684 != 407) {
            return Collections.<Class9824>emptyList();
         }

         var3 = "Proxy-Authenticate";
      } else {
         var3 = "WWW-Authenticate";
      }

      return Class8394.method29451(this.method7853(), var3);
   }

   public Class7319 method7862() {
      Class7319 var3 = this.field9694;
      return var3 == null ? (this.field9694 = Class7319.method23206(this.field9687)) : var3;
   }

   public long method7863() {
      return this.field9692;
   }

   public long method7864() {
      return this.field9693;
   }

   @Override
   public void close() {
      this.field9688.close();
   }

   @Override
   public String toString() {
      return "Response{protocol=" + this.field9683 + ", code=" + this.field9684 + ", message=" + this.field9685 + ", url=" + this.field9682.method28612() + '}';
   }
}
