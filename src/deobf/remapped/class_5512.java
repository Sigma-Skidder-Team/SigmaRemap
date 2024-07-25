package remapped;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class class_5512 {
   private static byte[] field_28068;

   public static int method_24984() {
      return field_28068.length;
   }

   public static byte[] method_24982() {
      return field_28068;
   }

   public static void method_24983() throws IOException {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();

      try (DataOutputStream var3 = new DataOutputStream(new GZIPOutputStream(var2))) {
         var3.writeByte(10);
         var3.writeUTF("");

         for (int var5 = 0; var5 < 300; var5++) {
            method_24986(var3, 0);
         }

         var3.writeByte(0);
      }

      field_28068 = var2.toByteArray();
   }

   private static void method_24986(DataOutputStream var0, int var1) throws IOException {
      if (var1 <= 4) {
         var0.writeByte(9);
         var0.writeUTF("");
         var0.writeByte(9);
         var0.writeInt(10);

         for (int var4 = 1; var4 < 10; var4++) {
            method_24986(var0, var1 + 1);
         }
      }
   }
}
