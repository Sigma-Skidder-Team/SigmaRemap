package remapped;

import java.util.Arrays;

public class class_7974<T extends class_8145> extends class_5272<T> {
   private static String[] field_40834;
   private static final int[][] field_40832 = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
   private static final int[][] field_40835 = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
   private static final int field_40833 = field_40832.length;
   private final class_1549[] field_40831 = new class_1549[field_40833];

   public class_7974() {
      float var3 = -3.5F;

      for (int var4 = 0; var4 < this.field_40831.length; var4++) {
         this.field_40831[var4] = new class_1549(this, field_40835[var4][0], field_40835[var4][1]);
         this.field_40831[var4]
            .method_7048(
               (float)field_40832[var4][0] * -0.5F,
               0.0F,
               (float)field_40832[var4][2] * -0.5F,
               (float)field_40832[var4][0],
               (float)field_40832[var4][1],
               (float)field_40832[var4][2]
            );
         this.field_40831[var4].method_7046(0.0F, (float)(24 - field_40832[var4][1]), var3);
         if (var4 < this.field_40831.length - 1) {
            var3 += (float)(field_40832[var4][2] + field_40832[var4 + 1][2]) * 0.5F;
         }
      }
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return Arrays.<class_1549>asList(this.field_40831);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var9 = 0; var9 < this.field_40831.length; var9++) {
         this.field_40831[var9].field_8190 = class_9299.method_42840(var4 * 0.9F + (float)var9 * 0.15F * (float) Math.PI)
            * (float) Math.PI
            * 0.01F
            * (float)(1 + Math.abs(var9 - 2));
         this.field_40831[var9].field_8183 = class_9299.method_42818(var4 * 0.9F + (float)var9 * 0.15F * (float) Math.PI)
            * (float) Math.PI
            * 0.1F
            * (float)Math.abs(var9 - 2);
      }
   }
}
