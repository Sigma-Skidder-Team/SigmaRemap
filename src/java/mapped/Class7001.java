package mapped;

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

public final class Class7001 {
   public static final Logger field30279 = Logger.getLogger(Class7001.class.getName());

   private Class7001() {
   }

   public static Class1735 method21696(Class1737 var0) {
      return new Class1736(var0);
   }

   public static Class1733 method21697(Sink var0) {
      return new Class1755(var0);
   }

   public static Sink method21698(OutputStream var0) {
      return method21699(var0, new Class4916());
   }

   private static Sink method21699(OutputStream var0, Class4916 var1) {
      if (var0 != null) {
         if (var1 != null) {
            return new Class1732(var1, var0);
         } else {
            throw new IllegalArgumentException("timeout == null");
         }
      } else {
         throw new IllegalArgumentException("out == null");
      }
   }

   public static Sink method21700(Socket var0) throws IOException {
      if (var0 != null) {
         Class4918 var3 = method21710(var0);
         Sink var4 = method21699(var0.getOutputStream(), var3);
         return var3.method15225(var4);
      } else {
         throw new IllegalArgumentException("socket == null");
      }
   }

   public static Class1737 method21701(InputStream var0) {
      return method21702(var0, new Class4916());
   }

   private static Class1737 method21702(InputStream var0, Class4916 var1) {
      if (var0 != null) {
         if (var1 != null) {
            return new Class1747(var1, var0);
         } else {
            throw new IllegalArgumentException("timeout == null");
         }
      } else {
         throw new IllegalArgumentException("in == null");
      }
   }

   public static Class1737 method21703(File var0) throws FileNotFoundException {
      if (var0 != null) {
         return method21701(new FileInputStream(var0));
      } else {
         throw new IllegalArgumentException("file == null");
      }
   }

 //  @IgnoreJRERequirement
   public static Class1737 method21704(Path var0, OpenOption... var1) throws IOException {
      if (var0 != null) {
         return method21701(Files.newInputStream(var0, var1));
      } else {
         throw new IllegalArgumentException("path == null");
      }
   }

   public static Sink method21705(File var0) throws FileNotFoundException {
      if (var0 != null) {
         return method21698(new FileOutputStream(var0));
      } else {
         throw new IllegalArgumentException("file == null");
      }
   }

   public static Sink method21706(File var0) throws FileNotFoundException {
      if (var0 != null) {
         return method21698(new FileOutputStream(var0, true));
      } else {
         throw new IllegalArgumentException("file == null");
      }
   }

  // @IgnoreJRERequirement
   public static Sink method21707(Path var0, OpenOption... var1) throws IOException {
      if (var0 != null) {
         return method21698(Files.newOutputStream(var0, var1));
      } else {
         throw new IllegalArgumentException("path == null");
      }
   }

   public static Sink method21708() {
      return new Class1731();
   }

   public static Class1737 method21709(Socket var0) throws IOException {
      if (var0 != null) {
         Class4918 var3 = method21710(var0);
         Class1737 var4 = method21702(var0.getInputStream(), var3);
         return var3.method15226(var4);
      } else {
         throw new IllegalArgumentException("socket == null");
      }
   }

   private static Class4918 method21710(Socket var0) {
      return new Class4920(var0);
   }

   public static boolean method21711(AssertionError var0) {
      return var0.getCause() != null && var0.getMessage() != null && var0.getMessage().contains("getsockname failed");
   }
}
