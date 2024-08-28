package mapped;

import java.io.IOException;

public class Class6444 extends Class6443 {
   private static String[] field28308;
   private int field28309;
   private int field28310;
   private int field28311;
   private boolean field28312;
   private boolean field28313;
   private boolean field28314;
   private String field28315;

   @Override
   public void method19555(Class8827 var1) throws IOException {
      this.field28309 = (int)var1.method31863(2);
      int var4 = var1.method31861();
      this.field28312 = (var4 >> 7 & 1) == 1;
      this.field28313 = (var4 >> 6 & 1) == 1;
      this.field28310 = var4 & 31;
      if (!this.field28312) {
         this.field28311 = -1;
      } else {
         this.field28311 = (int)var1.method31863(2);
      }

      if (this.field28313) {
         int var5 = var1.method31861();
         this.field28315 = var1.method31865(var5);
      }

      this.method19561(var1);
   }

   public int method19565() {
      return this.field28309;
   }

   public boolean method19566() {
      return this.field28312;
   }

   public int method19567() {
      return this.field28311;
   }

   public boolean method19568() {
      return this.field28313;
   }

   public String method19569() {
      return this.field28315;
   }

   public int method19570() {
      return this.field28310;
   }
}
