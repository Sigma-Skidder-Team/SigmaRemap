package remapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Logger;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public final class class_1259 {
   public static final Logger field_6941 = Logger.getLogger(class_1259.class.getName());

   private class_1259() {
   }

   public static class_8067 method_5671(class_5322 var0) {
      return new class_7085(var0);
   }

   public static class_3947 method_5670(class_4131 var0) {
      return new class_6628(var0);
   }

   public static class_4131 method_5660(OutputStream var0) {
      return method_5661(var0, new class_245());
   }

   private static class_4131 method_5661(OutputStream var0, class_245 var1) {
      if (var0 != null) {
         if (var1 != null) {
            return new class_8977(var1, var0);
         } else {
            throw new IllegalArgumentException("timeout == null");
         }
      } else {
         throw new IllegalArgumentException("out == null");
      }
   }

   public static class_4131 method_5662(Socket var0) throws IOException {
      if (var0 != null) {
         class_1353 var3 = method_5657(var0);
         class_4131 var4 = method_5661(var0.getOutputStream(), var3);
         return var3.method_6252(var4);
      } else {
         throw new IllegalArgumentException("socket == null");
      }
   }

   public static class_5322 method_5666(InputStream var0) {
      return method_5667(var0, new class_245());
   }

   private static class_5322 method_5667(InputStream var0, class_245 var1) {
      if (var0 != null) {
         if (var1 != null) {
            return new class_3737(var1, var0);
         } else {
            throw new IllegalArgumentException("timeout == null");
         }
      } else {
         throw new IllegalArgumentException("in == null");
      }
   }

   public static class_5322 method_5665(File var0) throws FileNotFoundException {
      if (var0 != null) {
         return method_5666(new FileInputStream(var0));
      } else {
         throw new IllegalArgumentException("file == null");
      }
   }

   @IgnoreJRERequirement
   public static class_5322 method_5669(Path var0, OpenOption... var1) throws IOException {
      if (var0 != null) {
         return method_5666(Files.newInputStream(var0, var1));
      } else {
         throw new IllegalArgumentException("path == null");
      }
   }

   public static class_4131 method_5659(File var0) throws FileNotFoundException {
      if (var0 != null) {
         return method_5660(new FileOutputStream(var0));
      } else {
         throw new IllegalArgumentException("file == null");
      }
   }

   public static class_4131 method_5672(File var0) throws FileNotFoundException {
      if (var0 != null) {
         return method_5660(new FileOutputStream(var0, true));
      } else {
         throw new IllegalArgumentException("file == null");
      }
   }

   @IgnoreJRERequirement
   public static class_4131 method_5663(Path var0, OpenOption... var1) throws IOException {
      if (var0 != null) {
         return method_5660(Files.newOutputStream(var0, var1));
      } else {
         throw new IllegalArgumentException("path == null");
      }
   }

   public static class_4131 method_5656() {
      return new class_1770();
   }

   public static class_5322 method_5668(Socket var0) throws IOException {
      if (var0 != null) {
         class_1353 var3 = method_5657(var0);
         class_5322 var4 = method_5667(var0.getInputStream(), var3);
         return var3.method_6247(var4);
      } else {
         throw new IllegalArgumentException("socket == null");
      }
   }

   private static class_1353 method_5657(Socket var0) {
      return new class_9611(var0);
   }

   public static boolean method_5664(AssertionError var0) {
      return var0.getCause() != null && var0.getMessage() != null && var0.getMessage().contains("getsockname failed");
   }
}
