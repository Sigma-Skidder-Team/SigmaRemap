package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class class_4217<T extends class_8145> extends class_5272<T> {
   private static String[] field_20479;
   private final class_1549 field_20477;
   private final class_1549[] field_20476 = new class_1549[8];
   private final ImmutableList<class_1549> field_20478;

   public class_4217() {
      byte var3 = -16;
      this.field_20477 = new class_1549(this, 0, 0);
      this.field_20477.method_7048(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F);
      this.field_20477.field_8181 += 8.0F;

      for (int var4 = 0; var4 < this.field_20476.length; var4++) {
         this.field_20476[var4] = new class_1549(this, 48, 0);
         double var5 = (double)var4 * Math.PI * 2.0 / (double)this.field_20476.length;
         float var7 = (float)Math.cos(var5) * 5.0F;
         float var8 = (float)Math.sin(var5) * 5.0F;
         this.field_20476[var4].method_7048(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);
         this.field_20476[var4].field_8183 = var7;
         this.field_20476[var4].field_8187 = var8;
         this.field_20476[var4].field_8181 = 15.0F;
         var5 = (double)var4 * Math.PI * -2.0 / (double)this.field_20476.length + (Math.PI / 2);
         this.field_20476[var4].field_8190 = (float)var5;
      }

      Builder var9 = ImmutableList.builder();
      var9.add(this.field_20477);
      var9.addAll(Arrays.<class_1549>asList(this.field_20476));
      this.field_20478 = var9.build();
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      for (class_1549 var12 : this.field_20476) {
         var12.field_8191 = var4;
      }
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return this.field_20478;
   }
}
