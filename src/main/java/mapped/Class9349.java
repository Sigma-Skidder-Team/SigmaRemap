package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class9349 {
   private static String[] field43398;
   public Class8200 field43399;
   public List<byte[]> field43400;

   public Class9349(Class8200 var1) {
      this.field43399 = var1;
      this.field43400 = new ArrayList<byte[]>();
   }

   public Class8200 method35405(byte[] var1) {
      this.field43400.add(var1);
      if (this.field43400.size() != this.field43399.field35230) {
         return null;
      } else {
         Class8200 var4 = Class8020.method27423(this.field43399, this.field43400.<byte[]>toArray(new byte[this.field43400.size()][]));
         this.method35406();
         return var4;
      }
   }

   public void method35406() {
      this.field43399 = null;
      this.field43400 = new ArrayList<byte[]>();
   }
}
