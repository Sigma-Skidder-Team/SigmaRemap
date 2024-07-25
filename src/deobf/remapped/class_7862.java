package remapped;

public class class_7862 extends class_1859 {
   private static String[] field_40256;
   private int field_40257;
   private int field_40255;
   public boolean field_40254 = false;

   public class_7862(class_7038 var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_40257 = var7;
      this.field_40255 = var8;
   }

   public void method_35597(int var1) {
      this.field_40257 = var1;
   }

   @Override
   public void method_32145(int var1, int var2) {
      int var5 = this.method_32189() - this.method_32155();
      if (this.field_40254) {
         this.method_35598((int)((float)var5 / (float)this.method_32109() * 255.0F));
      }

      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      class_73.method_103((float)this.field_36270, (float)this.field_36261, (float)this.field_36278, (float)this.field_36257, this.field_40257);
      super.method_32178(var1);
   }

   @Override
   public boolean method_29508(int var1, int var2, int var3) {
      this.field_40254 = true;
      return super.method_29508(var1, var2, var3);
   }

   @Override
   public void method_29505(int var1, int var2, int var3) {
      this.field_40254 = false;
   }

   public float method_35596() {
      return (float)this.field_40255;
   }

   public void method_35598(int var1) {
      this.method_35599(var1, true);
   }

   public void method_35599(int var1, boolean var2) {
      var1 = Math.min(Math.max(var1, 0), 255);
      int var5 = this.field_40255;
      this.field_40255 = var1;
      if (var2 && var5 != var1) {
         this.method_8235();
      }
   }
}
