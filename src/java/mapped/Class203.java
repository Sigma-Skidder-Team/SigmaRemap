package mapped;

public abstract class Class203 extends Class202 {
   public Class203(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean method650(long var1) {
      return var1 == Class7481.field32173;
   }

   @Override
   public void method665(long var1, int var3, boolean var4) {
      Class7481 var7 = new Class7481(var1);
      int var8 = var7.field32174;
      int var9 = var7.field32175;

      for (int var10 = -1; var10 <= 1; var10++) {
         for (int var11 = -1; var11 <= 1; var11++) {
            long var12 = Class7481.method24353(var8 + var10, var9 + var11);
            if (var12 != var1) {
               this.method674(var1, var12, var3, var4);
            }
         }
      }
   }

   @Override
   public int method651(long var1, long var3, int var5) {
      int var8 = var5;
      Class7481 var9 = new Class7481(var1);
      int var10 = var9.field32174;
      int var11 = var9.field32175;

      for (int var12 = -1; var12 <= 1; var12++) {
         for (int var13 = -1; var13 <= 1; var13++) {
            long var14 = Class7481.method24353(var10 + var12, var11 + var13);
            if (var14 == var1) {
               var14 = Class7481.field32173;
            }

            if (var14 != var3) {
               int var16 = this.method655(var14, var1, this.method652(var14));
               if (var8 > var16) {
                  var8 = var16;
               }

               if (var8 == 0) {
                  return var8;
               }
            }
         }
      }

      return var8;
   }

   @Override
   public int method655(long var1, long var3, int var5) {
      return var1 != Class7481.field32173 ? var5 + 1 : this.method679(var3);
   }

   public abstract int method679(long var1);

   public void method680(long var1, int var3, boolean var4) {
      this.method672(Class7481.field32173, var1, var3, var4);
   }
}
