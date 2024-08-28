package mapped;

import java.util.Arrays;

public class Class2807<T extends Entity> extends Class2803<T> {
   private static String[] field17472;
   private static final int[][] field17473 = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
   private static final int[][] field17474 = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
   private static final int field17475 = field17473.length;
   private final Class7219[] field17476 = new Class7219[field17475];

   public Class2807() {
      float var3 = -3.5F;

      for (int var4 = 0; var4 < this.field17476.length; var4++) {
         this.field17476[var4] = new Class7219(this, field17474[var4][0], field17474[var4][1]);
         this.field17476[var4]
            .method22673(
               (float)field17473[var4][0] * -0.5F,
               0.0F,
               (float)field17473[var4][2] * -0.5F,
               (float)field17473[var4][0],
               (float)field17473[var4][1],
               (float)field17473[var4][2]
            );
         this.field17476[var4].method22679(0.0F, (float)(24 - field17473[var4][1]), var3);
         if (var4 < this.field17476.length - 1) {
            var3 += (float)(field17473[var4][2] + field17473[var4 + 1][2]) * 0.5F;
         }
      }
   }

   @Override
   public Iterable<Class7219> method11015() {
      return Arrays.<Class7219>asList(this.field17476);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var9 = 0; var9 < this.field17476.length; var9++) {
         this.field17476[var9].field31036 = MathHelper.method37764(var4 * 0.9F + (float)var9 * 0.15F * (float) Math.PI)
            * (float) Math.PI
            * 0.01F
            * (float)(1 + Math.abs(var9 - 2));
         this.field17476[var9].field31032 = MathHelper.method37763(var4 * 0.9F + (float)var9 * 0.15F * (float) Math.PI)
            * (float) Math.PI
            * 0.1F
            * (float)Math.abs(var9 - 2);
      }
   }
}
