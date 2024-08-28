package mapped;

import java.io.IOException;

public class Class6445 extends Class6443 {
   private static String[] field28316;
   private int field28317;
   private boolean field28318;
   private boolean field28319;
   private String field28320;
   private int field28321;
   private int field28322;
   private int field28323;
   private int field28324;
   private int field28325;

   @Override
   public void method19555(Class8827 var1) throws IOException {
      int var4 = (int)var1.method31863(2);
      this.field28317 = var4 >> 6 & 1023;
      this.field28318 = (var4 >> 5 & 1) == 1;
      this.field28319 = (var4 >> 4 & 1) == 1;
      if (!this.field28318) {
         this.field28321 = var1.method31861();
         this.field28322 = var1.method31861();
         this.field28323 = var1.method31861();
         this.field28324 = var1.method31861();
         this.field28325 = var1.method31861();
      } else {
         this.field28320 = var1.method31865(this.field28305 - 2);
      }

      this.method19561(var1);
   }

   public int method19571() {
      return this.field28317;
   }

   public boolean method19572() {
      return this.field28319;
   }

   public boolean method19573() {
      return this.field28318;
   }

   public String method19574() {
      return this.field28320;
   }

   public boolean method19575() {
      return !this.field28318;
   }

   public int method19576() {
      return this.field28321;
   }

   public int method19577() {
      return this.field28322;
   }

   public int method19578() {
      return this.field28323;
   }

   public int method19579() {
      return this.field28324;
   }

   public int method19580() {
      return this.field28325;
   }
}
