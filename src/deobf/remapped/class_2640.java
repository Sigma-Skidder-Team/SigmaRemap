package remapped;

public class class_2640 {
   private static String[] field_13011;
   private int[] field_13010 = null;
   private int field_13012 = 0;
   private int field_13013 = 0;

   public class_2640(int var1) {
      this.field_13010 = new int[var1];
   }

   public void method_11937(int var1) {
      this.field_13010[this.field_13012] = var1;
      this.field_13012++;
      if (this.field_13013 < this.field_13012) {
         this.field_13013 = this.field_13012;
      }
   }

   public void method_11938(int var1, int var2) {
      this.field_13010[var1] = var2;
      if (this.field_13013 < var1) {
         this.field_13013 = var1;
      }
   }

   public void method_11936(int var1) {
      this.field_13012 = var1;
   }

   public void method_11939(int[] var1) {
      int var4 = var1.length;

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_13010[this.field_13012] = var1[var5];
         this.field_13012++;
      }

      if (this.field_13013 < this.field_13012) {
         this.field_13013 = this.field_13012;
      }
   }

   public int method_11944(int var1) {
      return this.field_13010[var1];
   }

   public int[] method_11941() {
      return this.field_13010;
   }

   public void method_11943() {
      this.field_13012 = 0;
      this.field_13013 = 0;
   }

   public int method_11940() {
      return this.field_13013;
   }

   public int method_11935() {
      return this.field_13012;
   }
}
