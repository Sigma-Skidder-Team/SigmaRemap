package remapped;

import java.io.BufferedInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.jetbrains.annotations.NotNull;

public final class class_4483 {
   private class_4483() {
   }

   @NotNull
   public static class_5531 method_20825(Path var0) throws IOException {
      return method_20819(Files.newInputStream(var0));
   }

   @NotNull
   public static class_5531 method_20819(InputStream var0) throws IOException {
      class_5531 var5;
      try (DataInputStream var3 = new DataInputStream(var0)) {
         var5 = method_20827(var3);
      }

      return var5;
   }

   @NotNull
   public static class_5531 method_20823(Path var0) throws IOException {
      return method_20818(Files.newInputStream(var0));
   }

   @NotNull
   public static class_5531 method_20818(InputStream var0) throws IOException {
      class_5531 var5;
      try (DataInputStream var3 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)))) {
         var5 = method_20827(var3);
      }

      return var5;
   }

   @NotNull
   public static class_5531 method_20827(DataInput var0) throws IOException {
      byte var3 = var0.readByte();
      if (var3 == class_8657.method_39694(class_5531.class)) {
         var0.skipBytes(var0.readUnsignedShort());
         class_5531 var4 = new class_5531("");
         var4.method_24130(var0);
         return var4;
      } else {
         throw new IOException(String.format("Expected root tag to be a CompoundTag, was %s", var3));
      }
   }

   public static void method_20816(class_5531 var0, Path var1) throws IOException {
      method_20824(var0, Files.newOutputStream(var1));
   }

   public static void method_20824(class_5531 var0, OutputStream var1) throws IOException {
      try (DataOutputStream var4 = new DataOutputStream(var1)) {
         method_20820(var0, var4);
      }
   }

   public static void method_20817(class_5531 var0, Path var1) throws IOException {
      method_20821(var0, Files.newOutputStream(var1));
   }

   public static void method_20821(class_5531 var0, OutputStream var1) throws IOException {
      try (DataOutputStream var4 = new DataOutputStream(new GZIPOutputStream(var1))) {
         method_20820(var0, var4);
      }
   }

   public static void method_20820(class_5531 var0, DataOutput var1) throws IOException {
      var1.writeByte(class_8657.method_39694(class_5531.class));
      var1.writeUTF("");
      var0.method_24127(var1);
   }

   @NotNull
   public static class_5531 method_20826(String var0) throws IOException {
      try {
         class_7910 var3 = new class_7910(var0);
         class_8794 var4 = new class_8794(var3);
         class_5531 var5 = var4.method_40395();
         if (var3.method_35783().method_35782()) {
            throw new IOException("Document had trailing content after first CompoundTag");
         } else {
            return var5;
         }
      } catch (class_5381 var6) {
         throw new IOException(var6);
      }
   }

   @NotNull
   public static String method_20815(class_5531 var0) throws IOException {
      StringBuilder var3 = new StringBuilder();

      try (class_103 var4 = new class_103(var3)) {
         var4.method_302(var0);
      }

      return var3.toString();
   }
}
