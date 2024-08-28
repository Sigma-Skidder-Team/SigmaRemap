package mapped;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Class8679 {
   private static byte[] field39149;

   public static int method31220() {
      return field39149.length;
   }

   public static byte[] method31221() {
      return field39149;
   }

   public static void method31222() throws IOException {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();

      try (DataOutputStream var3 = new DataOutputStream(new GZIPOutputStream(var2))) {
         var3.writeByte(10);
         var3.writeUTF("");

         for (int var5 = 0; var5 < 300; var5++) {
            method31223(var3, 0);
         }

         var3.writeByte(0);
      }

      field39149 = var2.toByteArray();
   }

   private static void method31223(DataOutputStream var0, int var1) throws IOException {
      if (var1 <= 4) {
         var0.writeByte(9);
         var0.writeUTF("");
         var0.writeByte(9);
         var0.writeInt(10);

         for (int var4 = 1; var4 < 10; var4++) {
            method31223(var0, var1 + 1);
         }
      }
   }
}
