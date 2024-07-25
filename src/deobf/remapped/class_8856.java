package remapped;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

public abstract class class_8856 implements Closeable {
   private Reader field_45276;

   @Nullable
   public abstract class_1972 method_40738();

   public abstract long method_40730();

   public final InputStream method_40736() {
      return this.method_40735().method_36574();
   }

   public abstract class_8067 method_40735();

   public final byte[] method_40734() throws IOException {
      long var3 = this.method_40730();
      if (var3 > 2147483647L) {
         throw new IOException("Cannot buffer entire body for content length: " + var3);
      } else {
         class_8067 var5 = this.method_40735();

         byte[] var6;
         try {
            var6 = var5.method_36599();
         } finally {
            class_8515.method_39200(var5);
         }

         if (var3 != -1L && var3 != (long)var6.length) {
            throw new IOException("Content-Length (" + var3 + ") and stream length (" + var6.length + ") disagree");
         } else {
            return var6;
         }
      }
   }

   public final Reader method_40739() {
      Reader var3 = this.field_45276;
      return var3 == null ? (this.field_45276 = new class_8521(this.method_40735(), this.method_40741())) : var3;
   }

   public final String method_40737() throws IOException {
      class_8067 var3 = this.method_40735();

      String var5;
      try {
         Charset var4 = class_8515.method_39217(var3, this.method_40741());
         var5 = var3.method_36598(var4);
      } finally {
         class_8515.method_39200(var3);
      }

      return var5;
   }

   private Charset method_40741() {
      class_1972 var3 = this.method_40738();
      return var3 == null ? class_8515.field_43592 : var3.method_9073(class_8515.field_43592);
   }

   @Override
   public void close() {
      class_8515.method_39200(this.method_40735());
   }

   public static class_8856 method_40732(class_1972 var0, String var1) {
      Charset var4 = class_8515.field_43592;
      if (var0 != null) {
         var4 = var0.method_9072();
         if (var4 == null) {
            var4 = class_8515.field_43592;
            var0 = class_1972.method_9069(var0 + "; charset=utf-8");
         }
      }

      class_7059 var5 = new class_7059().method_32497(var1, var4);
      return method_40731(var0, var5.method_32468(), var5);
   }

   public static class_8856 method_40733(class_1972 var0, byte[] var1) {
      class_7059 var4 = new class_7059().method_32488(var1);
      return method_40731(var0, (long)var1.length, var4);
   }

   public static class_8856 method_40731(class_1972 var0, long var1, class_8067 var3) {
      if (var3 != null) {
         return new class_8337(var0, var1, var3);
      } else {
         throw new NullPointerException("source == null");
      }
   }
}
