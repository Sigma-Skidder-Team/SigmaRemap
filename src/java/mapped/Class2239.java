package mapped;

import java.util.Arrays;

public enum Class2239 {
   field14647(0, 1, 2),
   field14648(1, 0, 2),
   field14649(0, 2, 1),
   field14650(1, 2, 0),
   field14651(2, 0, 1),
   field14652(2, 1, 0);

   private final int[] field14653;
   private final Class8967 field14654;
   private static final Class2239[][] field14655 = Util.<Class2239[][]>method38508(new Class2239[values().length][values().length], var0 -> {
      for (Class2239 var6 : values()) {
         for (Class2239 var10 : values()) {
            int[] var11 = new int[3];

            for (int var12 = 0; var12 < 3; var12++) {
               var11[var12] = var6.field14653[var10.field14653[var12]];
            }

            Class2239 var13 = Arrays.<Class2239>stream(values()).filter(var1 -> Arrays.equals(var1.field14653, var11)).findFirst().get();
            var0[var6.ordinal()][var10.ordinal()] = var13;
         }
      }
   });
   private static final Class2239[] field14656 = new Class2239[]{field14647, field14648, field14649, field14650, field14651, field14652};

   private Class2239(int var3, int var4, int var5) {
      this.field14653 = new int[]{var3, var4, var5};
      this.field14654 = new Class8967();
      this.field14654.method32827(0, this.method8986(0), 1.0F);
      this.field14654.method32827(1, this.method8986(1), 1.0F);
      this.field14654.method32827(2, this.method8986(2), 1.0F);
   }

   public Class2239 method8985(Class2239 var1) {
      return field14655[this.ordinal()][var1.ordinal()];
   }

   public int method8986(int var1) {
      return this.field14653[var1];
   }

   public Class8967 method8987() {
      return this.field14654;
   }
}
