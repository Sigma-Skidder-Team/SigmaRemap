package mapped;

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

public final class Class8401 {
   private Class8401() {
   }

   @NotNull
   public static Class72 method29498(Path var0) throws IOException {
      return method29499(Files.newInputStream(var0));
   }

   @NotNull
   public static Class72 method29499(InputStream var0) throws IOException {
      Class72 var5;
      try (DataInputStream var3 = new DataInputStream(var0)) {
         var5 = method29502(var3);
      }

      return var5;
   }

   @NotNull
   public static Class72 method29500(Path var0) throws IOException {
      return method29501(Files.newInputStream(var0));
   }

   @NotNull
   public static Class72 method29501(InputStream var0) throws IOException {
      Class72 var5;
      try (DataInputStream var3 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)))) {
         var5 = method29502(var3);
      }

      return var5;
   }

   @NotNull
   public static Class72 method29502(DataInput var0) throws IOException {
      byte var3 = var0.readByte();
      if (var3 == Class9509.method36725(Class72.class)) {
         var0.skipBytes(var0.readUnsignedShort());
         Class72 var4 = new Class72("");
         var4.method203(var0);
         return var4;
      } else {
         throw new IOException(String.format("Expected root tag to be a CompoundTag, was %s", var3));
      }
   }

   public static void method29503(Class72 var0, Path var1) throws IOException {
      method29504(var0, Files.newOutputStream(var1));
   }

   public static void method29504(Class72 var0, OutputStream var1) throws IOException {
      try (DataOutputStream var4 = new DataOutputStream(var1)) {
         method29507(var0, var4);
      }
   }

   public static void method29505(Class72 var0, Path var1) throws IOException {
      method29506(var0, Files.newOutputStream(var1));
   }

   public static void method29506(Class72 var0, OutputStream var1) throws IOException {
      try (DataOutputStream var4 = new DataOutputStream(new GZIPOutputStream(var1))) {
         method29507(var0, var4);
      }
   }

   public static void method29507(Class72 var0, DataOutput var1) throws IOException {
      var1.writeByte(Class9509.method36725(Class72.class));
      var1.writeUTF("");
      var0.method204(var1);
   }

   @NotNull
   public static Class72 method29508(String var0) throws IOException {
      try {
         Class9311 var3 = new Class9311(var0);
         Class9544 var4 = new Class9544(var3);
         Class72 var5 = var4.method36928();
         if (var3.method35184().method35181()) {
            throw new IOException("Document had trailing content after first CompoundTag");
         } else {
            return var5;
         }
      } catch (Class2459 var6) {
         throw new IOException(var6);
      }
   }

   @NotNull
   public static String method29509(Class72 var0) throws IOException {
      StringBuilder var3 = new StringBuilder();

      try (Class1693 var4 = new Class1693(var3)) {
         var4.method7271(var0);
      }

      return var3.toString();
   }
}
