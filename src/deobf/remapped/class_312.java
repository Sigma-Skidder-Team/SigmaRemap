package remapped;

import java.io.IOException;
import java.io.InputStream;

public class class_312 implements class_2260 {
   private final InputStream field_1149;

   public class_312(InputStream var1) {
      if (var1 != null) {
         this.field_1149 = var1;
      } else {
         throw new NullPointerException("in");
      }
   }

   @Override
   public int method_10382(byte[] var1, int var2, int var3) throws IOException {
      return this.field_1149.read(var1, var2, var3);
   }

   @Override
   public boolean method_10383() {
      return true;
   }

   @Override
   public boolean method_10384() {
      return false;
   }

   @Override
   public long method_10385() {
      return -1L;
   }

   @Override
   public long method_10380(long var1) {
      return -1L;
   }

   @Override
   public long method_10381() {
      return -1L;
   }
}
