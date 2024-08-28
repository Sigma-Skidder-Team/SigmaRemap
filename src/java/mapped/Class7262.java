package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;

public class Class7262 implements Class7261 {
   private static String[] field31150;
   public int field31151;
   public int field31152;

   public Class7262(int var1) {
      this(var1, 0);
   }

   public Class7262(int var1, int var2) {
      this.field31151 = var1;
      this.field31152 = var2;
   }

   private Class4305 method22797(Class4305[] var1) {
      Class4305 var4 = var1[0];

      for (Class4305 var8 : var1) {
         if (var8.method13269() > var4.method13269()) {
            var4 = var8;
         }
      }

      return var4;
   }

   @Override
   public void method22796(Class4305 var1) {
      if (var1.method13241().size() > 0) {
         int var4 = 0;

         while (var4 < var1.method13241().size()) {
            Class4305 var5 = var1.method13241().get(var4);
            if (var4 > 0 && var4 % this.field31151 == 0) {
               Class4305[] var6 = new Class4305[this.field31151];

               for (int var7 = 0; var7 < this.field31151; var7++) {
                  var6[var7] = var1.method13241().get(var4 - this.field31151 + var7);
               }

               Class4305 var9 = this.method22797(var6);
               var5.method13261((var2, var3) -> var2.method13266(var9.method13265() + var2.method13269() + this.field31152));
            }

            Class4305[] var8 = new Class4305[this.field31151];
            var8[0] = var5;

            for (int var10 = 1; var10 < this.field31151; var10++) {
               var8[var10] = var1.method13241().get(var4 + var10);
               this.method22797(var8).method13261((var1x, var2) -> var1x.method13266(var5.method13265() + var5.method13269() / 2));
            }

            var4 += this.field31151;
         }
      }
   }
}
