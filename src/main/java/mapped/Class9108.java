package mapped;

public class Class9108 {
   private static String[] field41838;
   public int field41839;
   public int field41840;

   public Class9108(int var1, int var2) {
      this.field41839 = var1;
      this.field41840 = var2;
   }

   public int method33961() {
      return this.field41839;
   }

   public Class9108 method33962(Class9108 var1) {
      return new Class9108(this.field41839 + var1.field41839, this.field41840 + var1.field41840);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Class9108 var4 = (Class9108)var1;
         return this.field41839 == var4.field41839 && this.field41840 == var4.field41840;
      } else {
         return false;
      }
   }
}
