package mapped;

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

public class Class9772 {
   public static String[] method38436(String var0, String var1) {
      return method38437(new String[]{var0}, new String[]{var1});
   }

   public static String[] method38437(String[] var0, String[] var1) {
      LinkedHashSet<String> var4 = new LinkedHashSet();
      IResourcePack[] var5 = Class7944.method26869();

      for (int var6 = 0; var6 < var5.length; var6++) {
         IResourcePack var7 = var5[var6];
         String[] var8 = method38440(var7, var0, var1, (String[])null);
         var4.addAll(Arrays.asList(var8));
      }

      return var4.toArray(new String[var4.size()]);
   }

   public static String[] method38438(IResourcePack var0, String var1, String var2, String[] var3) {
      return method38440(var0, new String[]{var1}, new String[]{var2}, var3);
   }

   public static String[] method38439(IResourcePack var0, String[] var1, String[] var2) {
      return method38440(var0, var1, var2, (String[])null);
   }

   public static String[] method38440(IResourcePack var0, String[] var1, String[] var2, String[] var3) {
      if (!(var0 instanceof Class306)) {
         if (var0 instanceof LegacyResourcePackWrapper) {
            IResourcePack var6 = (IResourcePack)Class9299.method35072(var0, Class9299.field43015);
            if (var6 == null) {
               Class7944.method26811("LegacyResourcePackWrapper base resource pack not found: " + var0);
               return new String[0];
            }

            var0 = var6;
         }

         if (var0 instanceof LegacyResourcePackWrapperV4) {
            IResourcePack var8 = (IResourcePack)Class9299.method35072(var0, Class9299.field43017);
            if (var8 == null) {
               Class7944.method26811("LegacyResourcePackWrapperV4 base resource pack not found: " + var0);
               return new String[0];
            }

            var0 = var8;
         }

         if (var0 instanceof Class308) {
            Class308 var9 = (Class308)var0;
            File var7 = var9.field1197;
            if (var7 != null) {
               if (!var7.isDirectory()) {
                  if (!var7.isFile()) {
                     Class7944.method26811("Unknown resource pack file: " + var7);
                     return new String[0];
                  } else {
                     return method38443(var7, var1, var2);
                  }
               } else {
                  return method38442(var7, "", var1, var2);
               }
            } else {
               return new String[0];
            }
         } else {
            Class7944.method26811("Unknown resource pack type: " + var0);
            return new String[0];
         }
      } else {
         return method38441(var0, var3);
      }
   }

   private static String[] method38441(IResourcePack var0, String[] var1) {
      if (var1 != null) {
         ArrayList<String> var4 = new ArrayList();

         for (int var5 = 0; var5 < var1.length; var5++) {
            String var6 = var1[var5];
            if (method38444(var6)) {
               ResourceLocation var7 = new ResourceLocation(var6);
               if (var0.method1225(ResourcePackType.CLIENT_RESOURCES, var7)) {
                  var4.add(var6);
               }
            } else {
               Class7944.method26811("Skipping non-lowercase path: " + var6);
            }
         }

         return var4.toArray(new String[var4.size()]);
      } else {
         return new String[0];
      }
   }

   private static String[] method38442(File var0, String var1, String[] var2, String[] var3) {
      ArrayList<String> var6 = new ArrayList();
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
                  String[] var12 = method38442(var10, var16, var2, var3);

                  for (int var13 = 0; var13 < var12.length; var13++) {
                     String var14 = var12[var13];
                     var6.add(var14);
                  }
               }
            } else {
               String var11 = var1 + var10.getName();
               if (var11.startsWith(var7)) {
                  var11 = var11.substring(var7.length());
                  if (Class9402.method35760(var11, var2) && Class9402.method35761(var11, var3)) {
                     if (method38444(var11)) {
                        var6.add(var11);
                     } else {
                        Class7944.method26811("Skipping non-lowercase path: " + var11);
                     }
                  }
               }
            }
         }

         return var6.toArray(new String[var6.size()]);
      }
   }

   private static String[] method38443(File var0, String[] var1, String[] var2) {
      ArrayList<String> var5 = new ArrayList();
      String var6 = "assets/minecraft/";

      try {
         ZipFile var7 = new ZipFile(var0);
         Enumeration var8 = var7.entries();

         while (var8.hasMoreElements()) {
            ZipEntry var9 = (ZipEntry)var8.nextElement();
            String var10 = var9.getName();
            if (var10.startsWith(var6)) {
               var10 = var10.substring(var6.length());
               if (Class9402.method35760(var10, var1) && Class9402.method35761(var10, var2)) {
                  if (!method38444(var10)) {
                     Class7944.method26811("Skipping non-lowercase path: " + var10);
                  } else {
                     var5.add(var10);
                  }
               }
            }
         }

         var7.close();
         return var5.toArray(new String[var5.size()]);
      } catch (IOException var11) {
         var11.printStackTrace();
         return new String[0];
      }
   }

   private static boolean method38444(String var0) {
      return var0.equals(var0.toLowerCase(Locale.ROOT));
   }

   public static Properties method38445(String var0, String var1) {
      ResourceLocation var4 = new ResourceLocation(var0);

      try {
         InputStream var5 = Class7944.method26863(var4);
         if (var5 == null) {
            return null;
         } else {
            Class20 var6 = new Class20();
            var6.load(var5);
            var5.close();
            Class7944.method26810("" + var1 + ": Loading " + var0);
            return var6;
         }
      } catch (FileNotFoundException var7) {
         return null;
      } catch (IOException var8) {
         Class7944.method26811("" + var1 + ": Error reading " + var0);
         return null;
      }
   }

   public static Properties method38446(InputStream var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         try {
            Class20 var4 = new Class20();
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
