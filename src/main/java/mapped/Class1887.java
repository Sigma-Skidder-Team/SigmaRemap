package mapped;

public class Class1887 implements Class1884 {
   private Class2133 field11047;
   private Class1878[] field11048;
   private int field11049 = -1;

   public Class1887(Class2133 var1, Class1878[] var2) {
      this.field11047 = var1;
      this.field11048 = var2;
   }

   @Override
   public float method8142() {
      Class1878[] var3 = this.field11048;
      switch (Class9072.field41517[this.field11047.ordinal()]) {
         case 1:
            Class1878 var4 = var3[0];
            if (!(var4 instanceof Class1888)) {
               float var5 = method8145(var3, 0);
               float var6 = var3.length > 1 ? method8145(var3, 1) : 1.0F;
               float var7 = var3.length > 2 ? method8145(var3, 2) : var6;
               if (this.field11049 < 0) {
                  this.field11049 = Class9717.method38076();
               }

               return Class9717.method38075(this.field11049, var5, var6, var7);
            }
         default:
            return this.field11047.method8823(this.field11048);
      }
   }

   private static float method8145(Class1878[] var0, int var1) {
      Class1884 var4 = (Class1884)var0[var1];
      return var4.method8142();
   }

   @Override
   public String toString() {
      return "" + this.field11047 + "()";
   }
}
