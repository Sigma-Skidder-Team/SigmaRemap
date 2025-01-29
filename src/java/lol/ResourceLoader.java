package lol;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

public class ResourceLoader {
   private static ArrayList field44889 = new ArrayList();

   public static void method37244(PathNormalizer var0) {
      field44889.add(var0);
   }

   public static void method37245(PathNormalizer var0) {
      field44889.remove(var0);
   }

   public static void method37246() {
      field44889.clear();
   }

   public static InputStream getResourceAsStream(String var0) {
      InputStream var3 = null;

      for (int var4 = 0; var4 < field44889.size(); var4++) {
         PathNormalizer var5 = (PathNormalizer)field44889.get(var4);
         var3 = var5.method26476(var0);
         if (var3 != null) {
            break;
         }
      }

      if (var3 != null) {
         return new BufferedInputStream(var3);
      } else {
         throw new RuntimeException("Resource not found: " + var0);
      }
   }

   public static boolean method37248(String var0) {
      Object var3 = null;

      for (int var4 = 0; var4 < field44889.size(); var4++) {
         PathNormalizer var5 = (PathNormalizer)field44889.get(var4);
         var3 = var5.method26475(var0);
         if (var3 != null) {
            return true;
         }
      }

      return false;
   }

   public static URL method37249(String var0) {
      URL var3 = null;

      for (int var4 = 0; var4 < field44889.size(); var4++) {
         PathNormalizer var5 = (PathNormalizer)field44889.get(var4);
         var3 = var5.method26475(var0);
         if (var3 != null) {
            break;
         }
      }

      if (var3 != null) {
         return var3;
      } else {
         throw new RuntimeException("Resource not found: " + var0);
      }
   }

   static {
      field44889.add(new WindowsPathNormalizer());
      field44889.add(new FileNormalizerThingy(new File(".")));
   }
}
