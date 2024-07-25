package remapped;

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

public class class_4129 {
   public static class_5531 method_19177(String var0) throws IOException {
      return method_19175(new File(var0));
   }

   public static class_5531 method_19175(File var0) throws IOException {
      return method_19176(var0, true, false);
   }

   public static class_5531 method_19178(String var0, boolean var1, boolean var2) throws IOException {
      return method_19176(new File(var0), var1, var2);
   }

   public static class_5531 method_19176(File var0, boolean var1, boolean var2) throws IOException {
      Object var5 = new FileInputStream(var0);
      if (var1) {
         var5 = new GZIPInputStream((InputStream)var5);
      }

      class_5287 var6 = method_19188((InputStream)var5, var2);
      if (var6 instanceof class_5531) {
         return (class_5531)var6;
      } else {
         throw new IOException("Root tag is not a CompoundTag!");
      }
   }

   public static void method_19184(class_5531 var0, String var1) throws IOException {
      method_19182(var0, new File(var1));
   }

   public static void method_19182(class_5531 var0, File var1) throws IOException {
      method_19183(var0, var1, true, false);
   }

   public static void method_19185(class_5531 var0, String var1, boolean var2, boolean var3) throws IOException {
      method_19183(var0, new File(var1), var2, var3);
   }

   public static void method_19183(class_5531 var0, File var1, boolean var2, boolean var3) throws IOException {
      if (!var1.exists()) {
         if (var1.getParentFile() != null && !var1.getParentFile().exists()) {
            var1.getParentFile().mkdirs();
         }

         var1.createNewFile();
      }

      Object var6 = new FileOutputStream(var1);
      if (var2) {
         var6 = new GZIPOutputStream((OutputStream)var6);
      }

      method_19181((OutputStream)var6, var0, var3);
      var6.close();
   }

   public static class_5287 method_19187(InputStream var0) throws IOException {
      return method_19188(var0, false);
   }

   public static class_5287 method_19188(InputStream var0, boolean var1) throws IOException {
      return method_19186((DataInput)(!var1 ? new DataInputStream(var0) : new class_8727(var0)));
   }

   public static class_5287 method_19186(DataInput var0) throws IOException {
      int var3 = var0.readUnsignedByte();
      if (var3 == 0) {
         return null;
      } else {
         String var4 = var0.readUTF();

         class_5287 var5;
         try {
            var5 = class_8657.method_39693(var3, var4);
         } catch (class_4954 var7) {
            throw new IOException("Failed to create tag.", var7);
         }

         var5.method_24130(var0);
         return var5;
      }
   }

   public static void method_19180(OutputStream var0, class_5287 var1) throws IOException {
      method_19181(var0, var1, false);
   }

   public static void method_19181(OutputStream var0, class_5287 var1, boolean var2) throws IOException {
      method_19179((DataOutput)(!var2 ? new DataOutputStream(var0) : new class_7282(var0)), var1);
   }

   public static void method_19179(DataOutput var0, class_5287 var1) throws IOException {
      var0.writeByte(class_8657.method_39694((Class<? extends class_5287>)var1.getClass()));
      var0.writeUTF(var1.method_24126());
      var1.method_24127(var0);
   }
}
