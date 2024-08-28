package mapped;

import java.io.IOException;

public class Class6446 extends Class6443 {
   private static String[] field28326;
   private int field28327;
   private int field28328;
   private int field28329;
   private boolean field28330;
   private long field28331;
   private long field28332;

   @Override
   public void method19555(Class8827 var1) throws IOException {
      this.field28327 = var1.method31861();
      int var4 = var1.method31861();
      this.field28328 = var4 >> 2 & 63;
      this.field28330 = (var4 >> 1 & 1) == 1;
      this.field28329 = (int)var1.method31863(3);
      this.field28331 = var1.method31863(4);
      this.field28332 = var1.method31863(4);
      this.method19561(var1);
   }

   public int method19581() {
      return this.field28327;
   }

   public int method19582() {
      return this.field28328;
   }

   public boolean method19583() {
      return this.field28330;
   }

   public int method19584() {
      return this.field28329;
   }

   public long method19585() {
      return this.field28331;
   }

   public long method19586() {
      return this.field28332;
   }
}
