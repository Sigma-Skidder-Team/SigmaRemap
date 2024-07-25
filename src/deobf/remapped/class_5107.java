package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class class_5107<T extends Entity> extends class_5272<T> {
   private static String[] field_26335;
   private final class_1549[] field_26336;
   private final class_1549 field_26334 = new class_1549(this, 0, 0);
   private final ImmutableList<class_1549> field_26337;

   public class_5107() {
      this.field_26334.method_7048(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.field_26336 = new class_1549[12];

      for (int var3 = 0; var3 < this.field_26336.length; var3++) {
         this.field_26336[var3] = new class_1549(this, 0, 16);
         this.field_26336[var3].method_7048(0.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F);
      }

      Builder var4 = ImmutableList.builder();
      var4.add(this.field_26334);
      var4.addAll(Arrays.<class_1549>asList(this.field_26336));
      this.field_26337 = var4.build();
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return this.field_26337;
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = var4 * (float) Math.PI * -0.1F;

      for (int var10 = 0; var10 < 4; var10++) {
         this.field_26336[var10].field_8181 = -2.0F + MathHelper.cos(((float)(var10 * 2) + var4) * 0.25F);
         this.field_26336[var10].field_8183 = MathHelper.cos(var9) * 9.0F;
         this.field_26336[var10].field_8187 = MathHelper.sin(var9) * 9.0F;
         var9++;
      }

      var9 = (float) (Math.PI / 4) + var4 * (float) Math.PI * 0.03F;

      for (int var13 = 4; var13 < 8; var13++) {
         this.field_26336[var13].field_8181 = 2.0F + MathHelper.cos(((float)(var13 * 2) + var4) * 0.25F);
         this.field_26336[var13].field_8183 = MathHelper.cos(var9) * 7.0F;
         this.field_26336[var13].field_8187 = MathHelper.sin(var9) * 7.0F;
         var9++;
      }

      var9 = 0.47123894F + var4 * (float) Math.PI * -0.05F;

      for (int var14 = 8; var14 < 12; var14++) {
         this.field_26336[var14].field_8181 = 11.0F + MathHelper.cos(((float)var14 * 1.5F + var4) * 0.5F);
         this.field_26336[var14].field_8183 = MathHelper.cos(var9) * 5.0F;
         this.field_26336[var14].field_8187 = MathHelper.sin(var9) * 5.0F;
         var9++;
      }

      this.field_26334.field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_26334.field_8191 = var6 * (float) (Math.PI / 180.0);
   }
}
