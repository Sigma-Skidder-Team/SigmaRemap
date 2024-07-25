package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;

public abstract class class_8894<T extends class_8894<T>> {
   public HttpURLConnection field_45622;
   private boolean field_45624;
   public String field_45623;

   public class_8894(String var1, int var2, int var3) {
      try {
         this.field_45623 = var1;
         Proxy var6 = class_6982.method_31936();
         if (var6 != null) {
            this.field_45622 = (HttpURLConnection)new URL(var1).openConnection(var6);
         } else {
            this.field_45622 = (HttpURLConnection)new URL(var1).openConnection();
         }

         this.field_45622.setConnectTimeout(var2);
         this.field_45622.setReadTimeout(var3);
      } catch (MalformedURLException var7) {
         throw new class_8647(var7.getMessage(), var7);
      } catch (IOException var8) {
         throw new class_8647(var8.getMessage(), var8);
      }
   }

   public void method_40937(String var1, String var2) {
      method_40941(this.field_45622, var1, var2);
   }

   public static void method_40941(HttpURLConnection var0, String var1, String var2) {
      String var5 = var0.getRequestProperty("Cookie");
      if (var5 != null) {
         var0.setRequestProperty("Cookie", var5 + ";" + var1 + "=" + var2);
      } else {
         var0.setRequestProperty("Cookie", var1 + "=" + var2);
      }
   }

   public int method_40935() {
      return method_40932(this.field_45622);
   }

   public static int method_40932(HttpURLConnection var0) {
      String var3 = var0.getHeaderField("Retry-After");

      try {
         return Integer.valueOf(var3);
      } catch (Exception var5) {
         return 5;
      }
   }

   public int method_40944() {
      try {
         this.method_40929();
         return this.field_45622.getResponseCode();
      } catch (Exception var4) {
         throw new class_8647(var4.getMessage(), var4);
      }
   }

   public String method_40946() {
      try {
         this.method_40929();
         String var3 = null;
         if (this.method_40944() >= 400) {
            var3 = this.method_40938(this.field_45622.getErrorStream());
         } else {
            var3 = this.method_40938(this.field_45622.getInputStream());
         }

         this.method_40945();
         return var3;
      } catch (IOException var4) {
         throw new class_8647(var4.getMessage(), var4);
      }
   }

   private String method_40938(InputStream var1) throws IOException {
      if (var1 == null) {
         return "";
      } else {
         InputStreamReader var4 = new InputStreamReader(var1, "UTF-8");
         StringBuilder var5 = new StringBuilder();

         for (int var6 = var4.read(); var6 != -1; var6 = var4.read()) {
            var5.append((char)var6);
         }

         return var5.toString();
      }
   }

   private void method_40945() {
      byte[] var3 = new byte[1024];

      try {
         try {
            InputStream var4 = this.field_45622.getInputStream();

            while (var4.read(var3) > 0) {
            }

            var4.close();
            return;
         } catch (Exception var10) {
         }

         try {
            InputStream var5 = this.field_45622.getErrorStream();
            if (var5 == null) {
               return;
            }

            while (var5.read(var3) > 0) {
            }

            var5.close();
         } catch (IOException var11) {
            return;
         }
      } finally {
         if (this.field_45622 != null) {
            this.field_45622.disconnect();
         }
      }
   }

   public T method_40929() {
      if (!this.field_45624) {
         class_8894 var3 = this.method_40936();
         this.field_45624 = true;
         return (T)var3;
      } else {
         return (T)this;
      }
   }

   public abstract T method_40936();

   public static class_8894<?> method_40943(String var0) {
      return new class_3453(var0, 5000, 60000);
   }

   public static class_8894<?> method_40933(String var0, int var1, int var2) {
      return new class_3453(var0, var1, var2);
   }

   public static class_8894<?> method_40930(String var0, String var1) {
      return new class_924(var0, var1, 5000, 60000);
   }

   public static class_8894<?> method_40942(String var0, String var1, int var2, int var3) {
      return new class_924(var0, var1, var2, var3);
   }

   public static class_8894<?> method_40934(String var0) {
      return new class_7926(var0, 5000, 60000);
   }

   public static class_8894<?> method_40931(String var0, String var1) {
      return new class_5304(var0, var1, 5000, 60000);
   }

   public static class_8894<?> method_40940(String var0, String var1, int var2, int var3) {
      return new class_5304(var0, var1, var2, var3);
   }

   public String method_40939(String var1) {
      return method_40948(this.field_45622, var1);
   }

   public static String method_40948(HttpURLConnection var0, String var1) {
      try {
         return var0.getHeaderField(var1);
      } catch (Exception var5) {
         return "";
      }
   }
}
