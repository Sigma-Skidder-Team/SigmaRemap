package remapped;

import com.google.common.base.Joiner;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class class_5125 implements class_8591 {
   public File field_26452;
   public ZipFile field_26450;
   public String field_26449;

   public class_5125(String var1, File var2) {
      this.field_26452 = var2;
      this.field_26450 = null;
      this.field_26449 = "";
   }

   @Override
   public void method_39508() {
      if (this.field_26450 != null) {
         try {
            this.field_26450.close();
         } catch (Exception var4) {
         }

         this.field_26450 = null;
      }
   }

   @Override
   public InputStream method_39505(String var1) {
      try {
         if (this.field_26450 == null) {
            this.field_26450 = new ZipFile(this.field_26452);
            this.field_26449 = this.method_23515(this.field_26450);
         }

         String var4 = class_8251.method_37832(var1, "/");
         if (var4.contains("..")) {
            var4 = this.method_23513(var4);
         }

         ZipEntry var5 = this.field_26450.getEntry(this.field_26449 + var4);
         return var5 == null ? null : this.field_26450.getInputStream(var5);
      } catch (Exception var6) {
         return null;
      }
   }

   private String method_23513(String var1) {
      ArrayDeque var4 = new ArrayDeque();
      String[] var5 = Config.method_14302(var1, "/");

      for (int var6 = 0; var6 < var5.length; var6++) {
         String var7 = var5[var6];
         if (!var7.equals("..")) {
            var4.add(var7);
         } else {
            if (var4.isEmpty()) {
               return "";
            }

            var4.removeLast();
         }
      }

      return Joiner.on('/').join(var4);
   }

   private String method_23515(ZipFile var1) {
      ZipEntry var4 = var1.getEntry("shaders/");
      if (var4 != null && var4.isDirectory()) {
         return "";
      } else {
         Pattern var5 = Pattern.compile("([^/]+/)shaders/");
         Enumeration var6 = var1.entries();

         while (var6.hasMoreElements()) {
            ZipEntry var7 = (ZipEntry)var6.nextElement();
            String var8 = var7.getName();
            Matcher var9 = var5.matcher(var8);
            if (var9.matches()) {
               String var10 = var9.group(1);
               if (var10 != null) {
                  if (!var10.equals("shaders/")) {
                     return var10;
                  }

                  return "";
               }
            }
         }

         return "";
      }
   }

   @Override
   public boolean method_39506(String var1) {
      try {
         if (this.field_26450 == null) {
            this.field_26450 = new ZipFile(this.field_26452);
            this.field_26449 = this.method_23515(this.field_26450);
         }

         String var4 = class_8251.method_37832(var1, "/");
         ZipEntry var5 = this.field_26450.getEntry(this.field_26449 + var4);
         return var5 != null;
      } catch (IOException var6) {
         return false;
      }
   }

   @Override
   public String method_39507() {
      return this.field_26452.getName();
   }
}
