package remapped;

import java.util.Arrays;

public enum class_8929 {
   field_45769(0, 1, 2),
   field_45764(1, 0, 2),
   field_45766(0, 2, 1),
   field_45767(1, 2, 0),
   field_45768(2, 0, 1),
   field_45770(2, 1, 0);

   private final int[] field_45772;
   private final class_6555 field_45765;
   private static final class_8929[][] field_45774 = class_9665.<class_8929[][]>method_44659(new class_8929[values().length][values().length], var0 -> {
      for (class_8929 var6 : values()) {
         for (class_8929 var10 : values()) {
            int[] var11 = new int[3];

            for (int var12 = 0; var12 < 3; var12++) {
               var11[var12] = var6.field_45772[var10.field_45772[var12]];
            }

            class_8929 var13 = Arrays.<class_8929>stream(values()).filter(var1 -> Arrays.equals(var1.field_45772, var11)).findFirst().get();
            var0[var6.ordinal()][var10.ordinal()] = var13;
         }
      }
   });

   private class_8929(int var3, int var4, int var5) {
      this.field_45772 = new int[]{var3, var4, var5};
      this.field_45765 = new class_6555();
      this.field_45765.method_29885(0, this.method_41038(0), 1.0F);
      this.field_45765.method_29885(1, this.method_41038(1), 1.0F);
      this.field_45765.method_29885(2, this.method_41038(2), 1.0F);
   }

   public class_8929 method_41039(class_8929 var1) {
      return field_45774[this.ordinal()][var1.ordinal()];
   }

   public int method_41038(int var1) {
      return this.field_45772[var1];
   }

   public class_6555 method_41037() {
      return this.field_45765;
   }
}
