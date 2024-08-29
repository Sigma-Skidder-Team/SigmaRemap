package mapped;

public class Class9727 {
   private int field45428 = -1;
   private int[] field45429 = null;

   public Class9727(int var1) {
      this.field45428 = var1;
   }

   public Class9727(int var1, int var2) {
      this.field45428 = var1;
      if (var2 >= 0) {
         this.field45429 = new int[]{var2};
      }
   }

   public Class9727(int var1, int[] var2) {
      this.field45428 = var1;
      this.field45429 = var2;
   }

   public int method38103() {
      return this.field45428;
   }

   public int[] method38104() {
      return this.field45429;
   }

   public boolean method38105(BlockState var1) {
      return var1.method23490() == this.field45428 ? Class7542.method24660(var1.method23491(), this.field45429) : false;
   }

   public boolean method38106(int var1, int var2) {
      return var1 == this.field45428 ? Class7542.method24660(var2, this.field45429) : false;
   }

   public void method38107(int var1) {
      if (this.field45429 != null && var1 >= 0) {
         for (int var4 = 0; var4 < this.field45429.length; var4++) {
            if (this.field45429[var4] == var1) {
               return;
            }
         }

         this.field45429 = Class7944.method26965(this.field45429, var1);
      }
   }

   public void method38108(int[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         int var5 = var1[var4];
         this.method38107(var5);
      }
   }

   @Override
   public String toString() {
      return "" + this.field45428 + ":" + Class7944.method26856(this.field45429);
   }
}
