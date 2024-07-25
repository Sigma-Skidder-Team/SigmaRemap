package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Random;

public class class_1898<T extends Entity> extends class_5272<T> {
   private static String[] field_9694;
   private final class_1549[] field_9695 = new class_1549[9];
   private final ImmutableList<class_1549> field_9696;

   public class_1898() {
      Builder var3 = ImmutableList.builder();
      class_1549 var4 = new class_1549(this, 0, 0);
      var4.method_7048(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F);
      var4.field_8181 = 17.6F;
      var3.add(var4);
      Random var5 = new Random(1660L);

      for (int var6 = 0; var6 < this.field_9695.length; var6++) {
         this.field_9695[var6] = new class_1549(this, 0, 0);
         float var7 = (((float)(var6 % 3) - (float)(var6 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float var8 = ((float)(var6 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int var9 = var5.nextInt(7) + 8;
         this.field_9695[var6].method_7048(-1.0F, 0.0F, -1.0F, 2.0F, (float)var9, 2.0F);
         this.field_9695[var6].field_8183 = var7;
         this.field_9695[var6].field_8187 = var8;
         this.field_9695[var6].field_8181 = 24.6F;
         var3.add(this.field_9695[var6]);
      }

      this.field_9696 = var3.build();
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var9 = 0; var9 < this.field_9695.length; var9++) {
         this.field_9695[var9].field_8191 = 0.2F * MathHelper.sin(var4 * 0.3F + (float)var9) + 0.4F;
      }
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return this.field_9696;
   }
}
