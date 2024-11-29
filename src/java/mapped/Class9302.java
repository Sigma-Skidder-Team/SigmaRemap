package mapped;

import java.io.IOException;

public class Class9302 extends Class9301 {
   private String field43177;
   private String field43178;
   private long field43179;
   private long field43180;
   private long[] field43181;

   @Override
   public void method35101(DataStreamReader var1) throws IOException {
      this.field43177 = var1.method31866(100, "UTF-8");
      this.field43178 = var1.method31866(100, "UTF-8");
      this.field43179 = var1.readBits(8);
      this.field43180 = var1.readBits(8);
      int var4 = var1.readInt();
      this.field43181 = new long[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field43181[var5] = var1.readBits(4);
      }
   }

   public String method35102() {
      return this.field43177;
   }

   public String method35103() {
      return this.field43178;
   }

   public long method35104() {
      return this.field43179;
   }

   public long method35105() {
      return this.field43180;
   }

   public long[] method35106() {
      return this.field43181;
   }
}
