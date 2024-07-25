package remapped;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
import javax.annotation.Nullable;

public class class_5957 {
   public static class_5734 method_27227(File var0) throws IOException {
      class_5734 var5;
      try (FileInputStream var3 = new FileInputStream(var0)) {
         var5 = method_27219(var3);
      }

      return var5;
   }

   public static class_5734 method_27219(InputStream var0) throws IOException {
      class_5734 var5;
      try (DataInputStream var3 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)))) {
         var5 = method_27222(var3, class_4694.field_22844);
      }

      return var5;
   }

   public static void method_27218(class_5734 var0, File var1) throws IOException {
      try (FileOutputStream var4 = new FileOutputStream(var1)) {
         method_27217(var0, var4);
      }
   }

   public static void method_27217(class_5734 var0, OutputStream var1) throws IOException {
      try (DataOutputStream var4 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(var1)))) {
         method_27224(var0, var4);
      }
   }

   public static void method_27225(class_5734 var0, File var1) throws IOException {
      try (
         FileOutputStream var4 = new FileOutputStream(var1);
         DataOutputStream var6 = new DataOutputStream(var4);
      ) {
         method_27224(var0, var6);
      }
   }

   @Nullable
   public static class_5734 method_27223(File var0) throws IOException {
      if (!var0.exists()) {
         return null;
      } else {
         class_5734 var7;
         try (
            FileInputStream var3 = new FileInputStream(var0);
            DataInputStream var5 = new DataInputStream(var3);
         ) {
            var7 = method_27222(var5, class_4694.field_22844);
         }

         return var7;
      }
   }

   public static class_5734 method_27220(DataInput var0) throws IOException {
      return method_27222(var0, class_4694.field_22844);
   }

   public static class_5734 method_27222(DataInput var0, class_4694 var1) throws IOException {
      class_8406 var4 = method_27221(var0, 0, var1);
      if (!(var4 instanceof class_5734)) {
         throw new IOException("Root tag must be a named compound tag");
      } else {
         return (class_5734)var4;
      }
   }

   public static void method_27224(class_5734 var0, DataOutput var1) throws IOException {
      method_27226(var0, var1);
   }

   private static void method_27226(class_8406 var0, DataOutput var1) throws IOException {
      var1.writeByte(var0.method_38706());
      if (var0.method_38706() != 0) {
         var1.writeUTF("");
         var0.method_38707(var1);
      }
   }

   private static class_8406 method_27221(DataInput var0, int var1, class_4694 var2) throws IOException {
      byte var5 = var0.readByte();
      if (var5 == 0) {
         return class_8944.field_45856;
      } else {
         var0.readUTF();

         try {
            return class_81.method_172(var5).method_14890(var0, var1, var2);
         } catch (IOException var9) {
            class_159 var7 = class_159.method_643(var9, "Loading NBT data");
            class_6544 var8 = var7.method_639("NBT Tag");
            var8.method_29850("Tag type", var5);
            throw new class_3297(var7);
         }
      }
   }
}
