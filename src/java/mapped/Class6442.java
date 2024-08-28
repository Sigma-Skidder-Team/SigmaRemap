package mapped;

import java.io.IOException;

public class Class6442 extends Class6443 {
   private static String[] field28292;
   private int field28293;
   private boolean field28294;
   private String field28295;

   @Override
   public void method19555(Class8827 var1) throws IOException {
      int var4 = (int)var1.method31863(2);
      this.field28293 = var4 >> 6 & 1023;
      this.field28294 = (var4 >> 5 & 1) == 1;
      if (this.field28294) {
         this.field28295 = var1.method31865(this.field28305 - 2);
      }

      this.method19561(var1);
   }

   public int method19556() {
      return this.field28293;
   }

   public boolean method19557() {
      return this.field28294;
   }

   public String method19558() {
      return this.field28295;
   }
}
