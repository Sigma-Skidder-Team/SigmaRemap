package mapped;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

public abstract class Class1793 implements Closeable {
   private Reader field9670;

   @Nullable
   public abstract Class7450 method7833();

   public abstract long method7834();

   public final InputStream method7835() {
      return this.method7836().method7586();
   }

   public abstract Class1735 method7836();

   public final byte[] method7837() throws IOException {
      long var3 = this.method7834();
      if (var3 > 2147483647L) {
         throw new IOException("Cannot buffer entire body for content length: " + var3);
      } else {
         Class1735 var5 = this.method7836();

         byte[] var6;
         try {
            var6 = var5.method7621();
         } finally {
            Class9474.method36535(var5);
         }

         if (var3 != -1L && var3 != (long)var6.length) {
            throw new IOException("Content-Length (" + var3 + ") and stream length (" + var6.length + ") disagree");
         } else {
            return var6;
         }
      }
   }

   public final Reader method7838() {
      Reader var3 = this.field9670;
      return var3 == null ? (this.field9670 = new Class1801(this.method7836(), this.method7840())) : var3;
   }

   public final String method7839() throws IOException {
      Class1735 var3 = this.method7836();

      String var5;
      try {
         Charset var4 = Class9474.method36560(var3, this.method7840());
         var5 = var3.method7614(var4);
      } finally {
         Class9474.method36535(var3);
      }

      return var5;
   }

   private Charset method7840() {
      Class7450 var3 = this.method7833();
      return var3 == null ? Class9474.field44024 : var3.method24086(Class9474.field44024);
   }

   @Override
   public void close() {
      Class9474.method36535(this.method7836());
   }

   public static Class1793 method7841(Class7450 var0, String var1) {
      Charset var4 = Class9474.field44024;
      if (var0 != null) {
         var4 = var0.method24085();
         if (var4 == null) {
            var4 = Class9474.field44024;
            var0 = Class7450.method24082(var0 + "; charset=utf-8");
         }
      }

      Class1734 var5 = new Class1734().method7569(var1, var4);
      return method7843(var0, var5.method7582(), var5);
   }

   public static Class1793 method7842(Class7450 var0, byte[] var1) {
      Class1734 var4 = new Class1734().method7630(var1);
      return method7843(var0, (long)var1.length, var4);
   }

   public static Class1793 method7843(Class7450 var0, long var1, Class1735 var3) {
      if (var3 != null) {
         return new Class1794(var0, var1, var3);
      } else {
         throw new NullPointerException("source == null");
      }
   }
}
