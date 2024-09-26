package mapped;

public class Class9475 {
   private static String[] field44032;
   private Class6636 field44033;
   private Class field44034;
   private int field44035;
   private Class6633[] field44036;

   public Class9475(Class6636 var1, Class var2, int var3) {
      this.field44033 = var1;
      this.field44034 = var2;
      if (var1.method20245() && var2 != null) {
         this.field44036 = new Class6633[var3];

         for (int var6 = 0; var6 < this.field44036.length; var6++) {
            this.field44036[var6] = new Class6633(var1, var2, var6);
         }
      }
   }

   public Class6636 method36561() {
      return this.field44033;
   }

   public Class method36562() {
      return this.field44034;
   }

   public int method36563() {
      return this.field44035;
   }

   public Class6633 method36564(int var1) {
      return var1 >= 0 && var1 < this.field44036.length ? this.field44036[var1] : null;
   }

   public Object method36565(Object var1, int var2) {
      return Reflector.method35075(var1, this, var2);
   }

   public void method36566(Object var1, int var2, Object var3) {
      Reflector.method35081(var1, this, var2, var3);
   }

   public boolean method36567() {
      if (this.field44036 == null) {
         return false;
      } else {
         for (int var3 = 0; var3 < this.field44036.length; var3++) {
            Class6633 var4 = this.field44036[var3];
            if (!var4.method20238()) {
               return false;
            }
         }

         return true;
      }
   }
}
