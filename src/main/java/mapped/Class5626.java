package mapped;

import java.io.IOException;
import java.io.InputStream;

public class Class5626 implements Class5627 {
   private final InputStream field24947;

   public Class5626(InputStream var1) {
      if (var1 != null) {
         this.field24947 = var1;
      } else {
         throw new NullPointerException("in");
      }
   }

   @Override
   public int method17672(byte[] var1, int var2, int var3) throws IOException {
      return this.field24947.read(var1, var2, var3);
   }

   @Override
   public boolean method17673() {
      return true;
   }

   @Override
   public boolean method17674() {
      return false;
   }

   @Override
   public long method17675() {
      return -1L;
   }

   @Override
   public long method17676(long var1) {
      return -1L;
   }

   @Override
   public long method17677() {
      return -1L;
   }
}
