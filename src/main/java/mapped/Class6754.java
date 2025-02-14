package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;

public abstract class Class6754<T extends Class6754<T>> {
   public HttpURLConnection field29461;
   private boolean field29462;
   public String field29463;

   public Class6754(String var1, int var2, int var3) {
      try {
         this.field29463 = var1;
         Proxy var6 = Class9094.method33921();
         if (var6 != null) {
            this.field29461 = (HttpURLConnection)new URL(var1).openConnection(var6);
         } else {
            this.field29461 = (HttpURLConnection)new URL(var1).openConnection();
         }

         this.field29461.setConnectTimeout(var2);
         this.field29461.setReadTimeout(var3);
      } catch (MalformedURLException var7) {
         throw new Class2505(var7.getMessage(), var7);
      } catch (IOException var8) {
         throw new Class2505(var8.getMessage(), var8);
      }
   }

   public void method20590(String var1, String var2) {
      method20591(this.field29461, var1, var2);
   }

   public static void method20591(HttpURLConnection var0, String var1, String var2) {
      String var5 = var0.getRequestProperty("Cookie");
      if (var5 != null) {
         var0.setRequestProperty("Cookie", var5 + ";" + var1 + "=" + var2);
      } else {
         var0.setRequestProperty("Cookie", var1 + "=" + var2);
      }
   }

   public int method20592() {
      return method20593(this.field29461);
   }

   public static int method20593(HttpURLConnection var0) {
      String var3 = var0.getHeaderField("Retry-After");

      try {
         return Integer.valueOf(var3);
      } catch (Exception var5) {
         return 5;
      }
   }

   public int method20594() {
      try {
         this.method20598();
         return this.field29461.getResponseCode();
      } catch (Exception var4) {
         throw new Class2505(var4.getMessage(), var4);
      }
   }

   public String method20595() {
      try {
         this.method20598();
         String var3 = null;
         if (this.method20594() >= 400) {
            var3 = this.method20596(this.field29461.getErrorStream());
         } else {
            var3 = this.method20596(this.field29461.getInputStream());
         }

         this.method20597();
         return var3;
      } catch (IOException var4) {
         throw new Class2505(var4.getMessage(), var4);
      }
   }

   private String method20596(InputStream var1) throws IOException {
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

   private void method20597() {
      byte[] var3 = new byte[1024];

      try {
         try {
            InputStream var4 = this.field29461.getInputStream();

            while (var4.read(var3) > 0) {
            }

            var4.close();
            return;
         } catch (Exception var10) {
         }

         try {
            InputStream var5 = this.field29461.getErrorStream();
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
         if (this.field29461 != null) {
            this.field29461.disconnect();
         }
      }
   }

   public T method20598() {
      if (!this.field29462) {
         Class6754 var3 = this.method20589();
         this.field29462 = true;
         return (T)var3;
      } else {
         return (T)this;
      }
   }

   public abstract T method20589();

   public static Class6754<?> method20599(String var0) {
      return new Class6756(var0, 5000, 60000);
   }

   public static Class6754<?> method20600(String var0, int var1, int var2) {
      return new Class6756(var0, var1, var2);
   }

   public static Class6754<?> method20601(String var0, String var1) {
      return new Class6753(var0, var1, 5000, 60000);
   }

   public static Class6754<?> method20602(String var0, String var1, int var2, int var3) {
      return new Class6753(var0, var1, var2, var3);
   }

   public static Class6754<?> method20603(String var0) {
      return new Class6755(var0, 5000, 60000);
   }

   public static Class6754<?> method20604(String var0, String var1) {
      return new Class6757(var0, var1, 5000, 60000);
   }

   public static Class6754<?> method20605(String var0, String var1, int var2, int var3) {
      return new Class6757(var0, var1, var2, var3);
   }

   public String method20606(String var1) {
      return method20607(this.field29461, var1);
   }

   public static String method20607(HttpURLConnection var0, String var1) {
      try {
         return var0.getHeaderField(var1);
      } catch (Exception var5) {
         return "";
      }
   }
}
