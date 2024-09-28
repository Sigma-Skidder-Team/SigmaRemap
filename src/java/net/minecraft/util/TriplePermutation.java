package net.minecraft.util;

import net.minecraft.util.math.vector.Matrix3f;
import net.minecraft.client.util.Util;

import java.util.Arrays;

public enum TriplePermutation {
   P123(0, 1, 2),
   P213(1, 0, 2),
   P132(0, 2, 1),
   P231(1, 2, 0),
   P312(2, 0, 1),
   P321(2, 1, 0);

   private final int[] field14653;
   private final Matrix3f field14654;
   private static final TriplePermutation[][] field14655 = Util.<TriplePermutation[][]>make(new TriplePermutation[values().length][values().length], var0 -> {
      for (TriplePermutation var6 : values()) {
         for (TriplePermutation var10 : values()) {
            int[] var11 = new int[3];

            for (int var12 = 0; var12 < 3; var12++) {
               var11[var12] = var6.field14653[var10.field14653[var12]];
            }

            TriplePermutation var13 = Arrays.<TriplePermutation>stream(values()).filter(var1 -> Arrays.equals(var1.field14653, var11)).findFirst().get();
            var0[var6.ordinal()][var10.ordinal()] = var13;
         }
      }
   });
   private static final TriplePermutation[] field14656 = new TriplePermutation[]{P123, P213, P132, P231, P312, P321};

   private TriplePermutation(int var3, int var4, int var5) {
      this.field14653 = new int[]{var3, var4, var5};
      this.field14654 = new Matrix3f();
      this.field14654.method32827(0, this.method8986(0), 1.0F);
      this.field14654.method32827(1, this.method8986(1), 1.0F);
      this.field14654.method32827(2, this.method8986(2), 1.0F);
   }

   public TriplePermutation method8985(TriplePermutation var1) {
      return field14655[this.ordinal()][var1.ordinal()];
   }

   public int method8986(int var1) {
      return this.field14653[var1];
   }

   public Matrix3f method8987() {
      return this.field14654;
   }
}
