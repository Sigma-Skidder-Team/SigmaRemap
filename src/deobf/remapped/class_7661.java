package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class class_7661<T extends Entity> extends class_5272<T> {
   private static String[] field_38929;
   private final class_1549[] field_38932;
   private final class_1549[] field_38927;
   private final ImmutableList<class_1549> field_38933;
   private final float[] field_38930 = new float[7];
   private static final int[][] field_38931 = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
   private static final int[][] field_38928 = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

   public class_7661() {
      this.field_38932 = new class_1549[7];
      float var3 = -3.5F;

      for (int var4 = 0; var4 < this.field_38932.length; var4++) {
         this.field_38932[var4] = new class_1549(this, field_38928[var4][0], field_38928[var4][1]);
         this.field_38932[var4]
            .method_7048(
               (float)field_38931[var4][0] * -0.5F,
               0.0F,
               (float)field_38931[var4][2] * -0.5F,
               (float)field_38931[var4][0],
               (float)field_38931[var4][1],
               (float)field_38931[var4][2]
            );
         this.field_38932[var4].method_7046(0.0F, (float)(24 - field_38931[var4][1]), var3);
         this.field_38930[var4] = var3;
         if (var4 < this.field_38932.length - 1) {
            var3 += (float)(field_38931[var4][2] + field_38931[var4 + 1][2]) * 0.5F;
         }
      }

      this.field_38927 = new class_1549[3];
      this.field_38927[0] = new class_1549(this, 20, 0);
      this.field_38927[0].method_7048(-5.0F, 0.0F, (float)field_38931[2][2] * -0.5F, 10.0F, 8.0F, (float)field_38931[2][2]);
      this.field_38927[0].method_7046(0.0F, 16.0F, this.field_38930[2]);
      this.field_38927[1] = new class_1549(this, 20, 11);
      this.field_38927[1].method_7048(-3.0F, 0.0F, (float)field_38931[4][2] * -0.5F, 6.0F, 4.0F, (float)field_38931[4][2]);
      this.field_38927[1].method_7046(0.0F, 20.0F, this.field_38930[4]);
      this.field_38927[2] = new class_1549(this, 20, 18);
      this.field_38927[2].method_7048(-3.0F, 0.0F, (float)field_38931[4][2] * -0.5F, 6.0F, 5.0F, (float)field_38931[1][2]);
      this.field_38927[2].method_7046(0.0F, 19.0F, this.field_38930[1]);
      Builder var5 = ImmutableList.builder();
      var5.addAll(Arrays.<class_1549>asList(this.field_38932));
      var5.addAll(Arrays.<class_1549>asList(this.field_38927));
      this.field_38933 = var5.build();
   }

   public ImmutableList<class_1549> method_34672() {
      return this.field_38933;
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var9 = 0; var9 < this.field_38932.length; var9++) {
         this.field_38932[var9].field_8190 = MathHelper.cos(var4 * 0.9F + (float)var9 * 0.15F * (float) Math.PI)
            * (float) Math.PI
            * 0.05F
            * (float)(1 + Math.abs(var9 - 2));
         this.field_38932[var9].field_8183 = MathHelper.sin(var4 * 0.9F + (float)var9 * 0.15F * (float) Math.PI)
            * (float) Math.PI
            * 0.2F
            * (float)Math.abs(var9 - 2);
      }

      this.field_38927[0].field_8190 = this.field_38932[2].field_8190;
      this.field_38927[1].field_8190 = this.field_38932[4].field_8190;
      this.field_38927[1].field_8183 = this.field_38932[4].field_8183;
      this.field_38927[2].field_8190 = this.field_38932[1].field_8190;
      this.field_38927[2].field_8183 = this.field_38932[1].field_8183;
   }
}
