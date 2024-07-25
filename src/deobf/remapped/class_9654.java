package remapped;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class class_9654 {
   public static String[] method_44542(String var0, String var1) {
      return method_44546(new String[]{var0}, new String[]{var1});
   }

   public static String[] method_44546(String[] var0, String[] var1) {
      LinkedHashSet var4 = new LinkedHashSet();
      class_8169[] var5 = class_3111.method_14347();

      for (int var6 = 0; var6 < var5.length; var6++) {
         class_8169 var7 = var5[var6];
         String[] var8 = method_44545(var7, var0, var1, (String[])null);
         var4.addAll(Arrays.asList(var8));
      }

      return var4.<String>toArray(new String[var4.size()]);
   }

   public static String[] method_44543(class_8169 var0, String var1, String var2, String[] var3) {
      return method_44545(var0, new String[]{var1}, new String[]{var2}, var3);
   }

   public static String[] method_44544(class_8169 var0, String[] var1, String[] var2) {
      return method_44545(var0, var1, var2, (String[])null);
   }

   public static String[] method_44545(class_8169 var0, String[] var1, String[] var2, String[] var3) {
      if (!(var0 instanceof class_599)) {
         if (var0 instanceof class_2127) {
            class_8169 var6 = (class_8169)class_7860.method_35557(var0, class_7860.field_39842);
            if (var6 == null) {
               class_3111.method_14317("LegacyResourcePackWrapper base resource pack not found: " + var0);
               return new String[0];
            }

            var0 = var6;
         }

         if (var0 instanceof class_3300) {
            class_8169 var8 = (class_8169)class_7860.method_35557(var0, class_7860.field_40046);
            if (var8 == null) {
               class_3111.method_14317("LegacyResourcePackWrapperV4 base resource pack not found: " + var0);
               return new String[0];
            }

            var0 = var8;
         }

         if (var0 instanceof class_3736) {
            class_3736 var9 = (class_3736)var0;
            File var7 = var9.field_18260;
            if (var7 != null) {
               if (!var7.isDirectory()) {
                  if (!var7.isFile()) {
                     class_3111.method_14317("Unknown resource pack file: " + var7);
                     return new String[0];
                  } else {
                     return method_44539(var7, var1, var2);
                  }
               } else {
                  return method_44538(var7, "", var1, var2);
               }
            } else {
               return new String[0];
            }
         } else {
            class_3111.method_14317("Unknown resource pack type: " + var0);
            return new String[0];
         }
      } else {
         return method_44537(var0, var3);
      }
   }

   private static String[] method_44537(class_8169 var0, String[] var1) {
      if (var1 != null) {
         ArrayList var4 = new ArrayList();

         for (int var5 = 0; var5 < var1.length; var5++) {
            String var6 = var1[var5];
            if (method_44535(var6)) {
               Identifier var7 = new Identifier(var6);
               if (var0.method_37467(class_3168.field_15844, var7)) {
                  var4.add(var6);
               }
            } else {
               class_3111.method_14317("Skipping non-lowercase path: " + var6);
            }
         }

         return var4.<String>toArray(new String[var4.size()]);
      } else {
         return new String[0];
      }
   }

   private static String[] method_44538(File var0, String var1, String[] var2, String[] var3) {
      ArrayList var6 = new ArrayList();
      String var7 = "assets/minecraft/";
      File[] var8 = var0.listFiles();
      if (var8 == null) {
         return new String[0];
      } else {
         for (int var9 = 0; var9 < var8.length; var9++) {
            File var10 = var8[var9];
            if (!var10.isFile()) {
               if (var10.isDirectory()) {
                  String var16 = var1 + var10.getName() + "/";
                  String[] var12 = method_44538(var10, var16, var2, var3);

                  for (int var13 = 0; var13 < var12.length; var13++) {
                     String var14 = var12[var13];
                     var6.add(var14);
                  }
               }
            } else {
               String var11 = var1 + var10.getName();
               if (var11.startsWith(var7)) {
                  var11 = var11.substring(var7.length());
                  if (class_8251.method_37803(var11, var2) && class_8251.method_37815(var11, var3)) {
                     if (method_44535(var11)) {
                        var6.add(var11);
                     } else {
                        class_3111.method_14317("Skipping non-lowercase path: " + var11);
                     }
                  }
               }
            }
         }

         return var6.<String>toArray(new String[var6.size()]);
      }
   }

   private static String[] method_44539(File var0, String[] var1, String[] var2) {
      ArrayList var5 = new ArrayList();
      String var6 = "assets/minecraft/";

      try {
         ZipFile var7 = new ZipFile(var0);
         Enumeration var8 = var7.entries();

         while (var8.hasMoreElements()) {
            ZipEntry var9 = (ZipEntry)var8.nextElement();
            String var10 = var9.getName();
            if (var10.startsWith(var6)) {
               var10 = var10.substring(var6.length());
               if (class_8251.method_37803(var10, var1) && class_8251.method_37815(var10, var2)) {
                  if (!method_44535(var10)) {
                     class_3111.method_14317("Skipping non-lowercase path: " + var10);
                  } else {
                     var5.add(var10);
                  }
               }
            }
         }

         var7.close();
         return var5.<String>toArray(new String[var5.size()]);
      } catch (IOException var11) {
         var11.printStackTrace();
         return new String[0];
      }
   }

   private static boolean method_44535(String var0) {
      return var0.equals(var0.toLowerCase(Locale.ROOT));
   }

   public static Properties method_44541(String var0, String var1) {
      Identifier var4 = new Identifier(var0);

      try {
         InputStream var5 = class_3111.method_14374(var4);
         if (var5 == null) {
            return null;
         } else {
            class_8407 var6 = new class_8407();
            var6.load(var5);
            var5.close();
            class_3111.method_14277("" + var1 + ": Loading " + var0);
            return var6;
         }
      } catch (FileNotFoundException var7) {
         return null;
      } catch (IOException var8) {
         class_3111.method_14317("" + var1 + ": Error reading " + var0);
         return null;
      }
   }

   public static Properties method_44540(InputStream var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         try {
            class_8407 var4 = new class_8407();
            var4.load(var0);
            var0.close();
            return var4;
         } catch (FileNotFoundException var5) {
            return null;
         } catch (IOException var6) {
            return null;
         }
      }
   }
}
