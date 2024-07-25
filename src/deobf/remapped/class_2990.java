package remapped;

import java.util.List;

public class class_2990 extends class_3622 {
   private List<String> field_14698;
   private int field_14702;
   public int field_14700;
   public int field_14701;

   public class_2990(List<String> var1, int var2) {
      super(var2);
      this.field_14698 = var1;
      this.method_13687();
   }

   public void method_13685(int var1, String var2) {
      if (var1 < this.field_14698.size()) {
         this.field_14698.set(var1, var2);
      }
   }

   public void method_13684(List<String> var1) {
      this.field_14698 = var1;
      if (this.field_14700 < 0) {
         this.field_14700 = 0;
      }

      if (this.field_14700 > this.field_14698.size() - 1) {
         this.field_14700 = this.field_14698.size() - 1;
      }

      this.method_13687();
   }

   private void method_13687() {
      this.field_14702 = 0;

      for (String var4 : this.field_14698) {
         this.field_14702 = Math.max(this.field_14702, this.field_17671.method_18547(var4));
      }
   }

   @Override
   public void method_16870(float var1) {
      class_73.method_103(
         (float)this.method_16873(),
         (float)this.method_16871(),
         (float)this.method_16874(),
         (float)this.method_16875(),
         class_314.method_1444(class_1255.field_6929.field_6917, var1 * 0.6F)
      );
      this.field_14701 = this.field_14701 + this.method_13689();
      int var4 = this.method_16873() + 4;
      int var5 = this.method_16871() + this.field_14701 + 4;
      int var6 = this.method_16874() - 8;
      byte var7 = 25;
      int var8 = -15781024;
      int var9 = -15626304;
      class_73.method_82(var4, var5, var4 + var6, var5 + var7, var8, var9, var9, var8);
      byte var10 = 6;

      for (String var12 : this.field_14698) {
         int var13 = class_1255.field_6918.field_6917;
         if (var12.startsWith("§7")) {
            var12 = var12.substring("§7".length());
            var13 = class_1255.field_6920.field_6917;
         }

         class_73.method_87(
            this.field_17671,
            (float)(7 + this.method_16873()),
            (float)(this.method_16871() + var10),
            var12,
            class_314.method_1444(var13, Math.min(1.0F, var1 * 1.7F))
         );
         var10 += 25;
      }
   }

   @Override
   public int method_16874() {
      return Math.max(super.method_16874(), this.field_14702 + 14);
   }

   @Override
   public int method_16875() {
      return this.field_14698.size() * 25 + 8;
   }

   public void method_13688() {
      this.field_14700--;
      if (this.field_14700 < 0) {
         this.field_14700 = this.field_14698.size() - 1;
      }
   }

   public void method_13686() {
      this.field_14700++;
      if (this.field_14700 > this.field_14698.size() - 1) {
         this.field_14700 = 0;
      }
   }

   public boolean method_13683() {
      return this.field_17669.method_11123() == 1.0F;
   }

   public int method_13689() {
      float var3 = (float)(this.field_14700 * 25);
      float var4 = Math.abs(var3 - (float)this.field_14701);
      boolean var5 = var3 - (float)this.field_14701 != var4;
      float var6 = 60.0F / (float)class_1893.method_8501();
      float var7 = Math.min(var4 * 0.8F, var4 * 0.3F * var6);
      if (var5) {
         var7 *= -1.0F;
      }

      if (var7 > 0.0F && var7 < 1.0F) {
         var7 = 1.0F;
      }

      if (var7 < 0.0F && var7 > -1.0F) {
         var7 = -1.0F;
      }

      return Math.round(var7);
   }
}
