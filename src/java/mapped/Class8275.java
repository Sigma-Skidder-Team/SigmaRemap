package mapped;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Class8275 {
   public static Class72 method28910(String var0) throws IOException {
      return method28911(new File(var0));
   }

   public static Class72 method28911(File var0) throws IOException {
      return method28913(var0, true, false);
   }

   public static Class72 method28912(String var0, boolean var1, boolean var2) throws IOException {
      return method28913(new File(var0), var1, var2);
   }

   public static Class72 method28913(File var0, boolean var1, boolean var2) throws IOException {
      Object var5 = new FileInputStream(var0);
      if (var1) {
         var5 = new GZIPInputStream((InputStream)var5);
      }

      Class61 var6 = method28919((InputStream)var5, var2);
      if (var6 instanceof Class72) {
         return (Class72)var6;
      } else {
         throw new IOException("Root tag is not a CompoundTag!");
      }
   }

   public static void method28914(Class72 var0, String var1) throws IOException {
      method28915(var0, new File(var1));
   }

   public static void method28915(Class72 var0, File var1) throws IOException {
      method28917(var0, var1, true, false);
   }

   public static void method28916(Class72 var0, String var1, boolean var2, boolean var3) throws IOException {
      method28917(var0, new File(var1), var2, var3);
   }

   public static void method28917(Class72 var0, File var1, boolean var2, boolean var3) throws IOException {
      if (!var1.exists()) {
         if (var1.getParentFile() != null && !var1.getParentFile().exists()) {
            var1.getParentFile().mkdirs();
         }

         var1.createNewFile();
      }

      OutputStream var6 = new FileOutputStream(var1);
      if (var2) {
         var6 = new GZIPOutputStream((OutputStream)var6);
      }

      method28922((OutputStream)var6, var0, var3);
      var6.close();
   }

   public static Class61 method28918(InputStream var0) throws IOException {
      return method28919(var0, false);
   }

   public static Class61 method28919(InputStream var0, boolean var1) throws IOException {
      return method28920((DataInput)(!var1 ? new DataInputStream(var0) : new Class1781(var0)));
   }

   public static Class61 method28920(DataInput var0) throws IOException {
      int var3 = var0.readUnsignedByte();
      if (var3 == 0) {
         return null;
      } else {
         String var4 = var0.readUTF();

         Class61 var5;
         try {
            var5 = Class9509.method36726(var3, var4);
         } catch (Class2434 var7) {
            throw new IOException("Failed to create tag.", var7);
         }

         var5.method203(var0);
         return var5;
      }
   }

   public static void method28921(OutputStream var0, Class61 var1) throws IOException {
      method28922(var0, var1, false);
   }

   public static void method28922(OutputStream var0, Class61 var1, boolean var2) throws IOException {
      method28923((DataOutput)(!var2 ? new DataOutputStream(var0) : new Class1758(var0)), var1);
   }

   public static void method28923(DataOutput var0, Class61 var1) throws IOException {
      var0.writeByte(Class9509.method36725((Class<? extends Class61>)var1.getClass()));
      var0.writeUTF(var1.method206());
      var1.method204(var0);
   }
}
