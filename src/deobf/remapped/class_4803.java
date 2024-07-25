package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class class_4803 extends class_5272<BoatEntity> {
   private static String[] field_24000;
   private final class_1549[] field_23999 = new class_1549[2];
   private final class_1549 field_23998;
   private final ImmutableList<class_1549> field_23997;

   public class_4803() {
      class_1549[] var3 = new class_1549[]{
         new class_1549(this, 0, 0).method_7033(128, 64),
         new class_1549(this, 0, 19).method_7033(128, 64),
         new class_1549(this, 0, 27).method_7033(128, 64),
         new class_1549(this, 0, 35).method_7033(128, 64),
         new class_1549(this, 0, 43).method_7033(128, 64)
      };
      byte var4 = 32;
      byte var5 = 6;
      byte var6 = 20;
      byte var7 = 4;
      byte var8 = 28;
      var3[0].method_7049(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F);
      var3[0].method_7046(0.0F, 3.0F, 1.0F);
      var3[1].method_7049(-13.0F, -7.0F, -1.0F, 18.0F, 6.0F, 2.0F, 0.0F);
      var3[1].method_7046(-15.0F, 4.0F, 4.0F);
      var3[2].method_7049(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F, 0.0F);
      var3[2].method_7046(15.0F, 4.0F, 0.0F);
      var3[3].method_7049(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F);
      var3[3].method_7046(0.0F, 4.0F, -9.0F);
      var3[4].method_7049(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F);
      var3[4].method_7046(0.0F, 4.0F, 9.0F);
      var3[0].field_8191 = (float) (Math.PI / 2);
      var3[1].field_8190 = (float) (Math.PI * 3.0 / 2.0);
      var3[2].field_8190 = (float) (Math.PI / 2);
      var3[3].field_8190 = (float) Math.PI;
      this.field_23999[0] = this.method_22134(true);
      this.field_23999[0].method_7046(3.0F, -5.0F, 9.0F);
      this.field_23999[1] = this.method_22134(false);
      this.field_23999[1].method_7046(3.0F, -5.0F, -9.0F);
      this.field_23999[1].field_8190 = (float) Math.PI;
      this.field_23999[0].field_8185 = (float) (Math.PI / 16);
      this.field_23999[1].field_8185 = (float) (Math.PI / 16);
      this.field_23998 = new class_1549(this, 0, 0).method_7033(128, 64);
      this.field_23998.method_7049(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F);
      this.field_23998.method_7046(0.0F, -3.0F, 1.0F);
      this.field_23998.field_8191 = (float) (Math.PI / 2);
      Builder var9 = ImmutableList.builder();
      var9.addAll(Arrays.<class_1549>asList(var3));
      var9.addAll(Arrays.<class_1549>asList(this.field_23999));
      this.field_23997 = var9.build();
   }

   public void method_22131(BoatEntity var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_22132(var1, 0, var2);
      this.method_22132(var1, 1, var2);
   }

   public ImmutableList<class_1549> method_22133() {
      return this.field_23997;
   }

   public class_1549 method_22130() {
      return this.field_23998;
   }

   public class_1549 method_22134(boolean var1) {
      class_1549 var4 = new class_1549(this, 62, !var1 ? 20 : 0).method_7033(128, 64);
      byte var5 = 20;
      byte var6 = 7;
      byte var7 = 6;
      float var8 = -5.0F;
      var4.method_7048(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F);
      var4.method_7048(!var1 ? 0.001F : -1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F);
      return var4;
   }

   public void method_22132(BoatEntity var1, int var2, float var3) {
      float var6 = var1.method_42108(var2, var3);
      class_1549 var7 = this.field_23999[var2];
      var7.field_8191 = (float) MathHelper.clampedLerp(
         (float) (-Math.PI / 3), (float) (-Math.PI / 12), (double)((MathHelper.sin(-var6) + 1.0F) / 2.0F)
      );
      var7.field_8190 = (float) MathHelper.clampedLerp(
         (float) (-Math.PI / 4), (float) (Math.PI / 4), (double)((MathHelper.sin(-var6 + 1.0F) + 1.0F) / 2.0F)
      );
      if (var2 == 1) {
         var7.field_8190 = (float) Math.PI - var7.field_8190;
      }
   }
}
