package mapped;

public abstract class Class4188 extends Class4178 {
   public Class102 field20479;

   public Class4188(Class7792 var1, int var2, Class102 var3) {
      super(var1, var2);
      this.field20479 = var3;
   }

   public Class4188(Class7792 var1, Class39 var2) {
      super(var1, var2);
      this.field20479 = Class102.method293(var2.method122("MST"));
   }

   @Override
   public void method12897(Class39 var1) {
      var1.method102("MST", this.field20479.ordinal());
   }

   public Class7380 method12967() {
      switch (Class7441.field32016[this.field20479.ordinal()]) {
         case 1:
         default:
            return Class8487.field36400.method11579();
         case 2:
            return Class8487.field36405.method11579();
      }
   }

   public Class7380 method12968() {
      switch (Class7441.field32016[this.field20479.ordinal()]) {
         case 1:
         default:
            return Class8487.field36578.method11579();
         case 2:
            return Class8487.field36871.method11579();
      }
   }

   public boolean method12969(Class1665 var1, Class9764 var2, int var3, int var4, int var5, int var6) {
      for (int var9 = var3; var9 <= var4; var9++) {
         if (this.method12924(var1, var9, var5 + 1, var6, var2).method23393()) {
            return false;
         }
      }

      return true;
   }
}
