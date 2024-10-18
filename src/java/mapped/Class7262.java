package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;

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

   private CustomGuiScreen method22797(CustomGuiScreen[] var1) {
      CustomGuiScreen var4 = var1[0];

      for (CustomGuiScreen var8 : var1) {
         if (var8.getHeightA() > var4.getHeightA()) {
            var4 = var8;
         }
      }

      return var4;
   }

   @Override
   public void method22796(CustomGuiScreen var1) {
      if (var1.method13241().size() > 0) {
         int var4 = 0;

         while (var4 < var1.method13241().size()) {
            CustomGuiScreen var5 = var1.method13241().get(var4);
            if (var4 > 0 && var4 % this.field31151 == 0) {
               CustomGuiScreen[] var6 = new CustomGuiScreen[this.field31151];

               for (int var7 = 0; var7 < this.field31151; var7++) {
                  var6[var7] = var1.method13241().get(var4 - this.field31151 + var7);
               }

               CustomGuiScreen var9 = this.method22797(var6);
               var5.setSize((var2, var3) -> var2.setYA(var9.getYA() + var2.getHeightA() + this.field31152));
            }

            CustomGuiScreen[] var8 = new CustomGuiScreen[this.field31151];
            var8[0] = var5;

            for (int var10 = 1; var10 < this.field31151; var10++) {
               var8[var10] = var1.method13241().get(var4 + var10);
               this.method22797(var8).setSize((var1x, var2) -> var1x.setYA(var5.getYA() + var5.getHeightA() / 2));
            }

            var4 += this.field31151;
         }
      }
   }
}
