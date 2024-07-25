package remapped;

public class class_7183 implements Runnable {
   private static String[] field_36956;

   public class_7183(class_3803 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_36957 = var1;
      this.field_36953 = var2;
      this.field_36955 = var3;
      this.field_36958 = var4;
      this.field_36954 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_36953; var3 < this.field_36955; var3++) {
         for (int var4 = 0; var4 < class_3803.method_17681(this.field_36957); var4++) {
            class_3803.method_17704(this.field_36957).method_17790(this.field_36958[var3][var4], this.field_36954);
         }
      }
   }
}
