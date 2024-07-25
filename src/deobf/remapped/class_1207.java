package remapped;

import com.google.common.collect.ImmutableList;

public class class_1207<T extends Entity> extends class_5272<T> {
   private static String[] field_6732;
   private final class_1549 field_6728;
   private final class_1549 field_6734;
   private final class_1549 field_6727;
   private final class_1549 field_6725;
   private final class_1549 field_6735;
   private final class_1549 field_6731;
   private final class_1549 field_6726;
   private final class_1549 field_6733;
   private final class_1549 field_6729;
   private final class_1549 field_6730;
   private final class_1549 field_6724;

   public class_1207() {
      float var3 = 0.0F;
      byte var4 = 15;
      this.field_6728 = new class_1549(this, 32, 4);
      this.field_6728.method_7049(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F);
      this.field_6728.method_7046(0.0F, 15.0F, -3.0F);
      this.field_6734 = new class_1549(this, 0, 0);
      this.field_6734.method_7049(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F);
      this.field_6734.method_7046(0.0F, 15.0F, 0.0F);
      this.field_6727 = new class_1549(this, 0, 12);
      this.field_6727.method_7049(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F, 0.0F);
      this.field_6727.method_7046(0.0F, 15.0F, 9.0F);
      this.field_6725 = new class_1549(this, 18, 0);
      this.field_6725.method_7049(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field_6725.method_7046(-4.0F, 15.0F, 2.0F);
      this.field_6735 = new class_1549(this, 18, 0);
      this.field_6735.method_7049(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field_6735.method_7046(4.0F, 15.0F, 2.0F);
      this.field_6731 = new class_1549(this, 18, 0);
      this.field_6731.method_7049(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field_6731.method_7046(-4.0F, 15.0F, 1.0F);
      this.field_6726 = new class_1549(this, 18, 0);
      this.field_6726.method_7049(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field_6726.method_7046(4.0F, 15.0F, 1.0F);
      this.field_6733 = new class_1549(this, 18, 0);
      this.field_6733.method_7049(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field_6733.method_7046(-4.0F, 15.0F, 0.0F);
      this.field_6729 = new class_1549(this, 18, 0);
      this.field_6729.method_7049(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field_6729.method_7046(4.0F, 15.0F, 0.0F);
      this.field_6730 = new class_1549(this, 18, 0);
      this.field_6730.method_7049(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field_6730.method_7046(-4.0F, 15.0F, -1.0F);
      this.field_6724 = new class_1549(this, 18, 0);
      this.field_6724.method_7049(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field_6724.method_7046(4.0F, 15.0F, -1.0F);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(
         this.field_6728,
         this.field_6734,
         this.field_6727,
         this.field_6725,
         this.field_6735,
         this.field_6731,
         this.field_6726,
         this.field_6733,
         this.field_6729,
         this.field_6730,
         this.field_6724
      );
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_6728.field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_6728.field_8191 = var6 * (float) (Math.PI / 180.0);
      float var9 = (float) (Math.PI / 4);
      this.field_6725.field_8185 = (float) (-Math.PI / 4);
      this.field_6735.field_8185 = (float) (Math.PI / 4);
      this.field_6731.field_8185 = -0.58119464F;
      this.field_6726.field_8185 = 0.58119464F;
      this.field_6733.field_8185 = -0.58119464F;
      this.field_6729.field_8185 = 0.58119464F;
      this.field_6730.field_8185 = (float) (-Math.PI / 4);
      this.field_6724.field_8185 = (float) (Math.PI / 4);
      float var10 = -0.0F;
      float var11 = (float) (Math.PI / 8);
      this.field_6725.field_8190 = (float) (Math.PI / 4);
      this.field_6735.field_8190 = (float) (-Math.PI / 4);
      this.field_6731.field_8190 = (float) (Math.PI / 8);
      this.field_6726.field_8190 = (float) (-Math.PI / 8);
      this.field_6733.field_8190 = (float) (-Math.PI / 8);
      this.field_6729.field_8190 = (float) (Math.PI / 8);
      this.field_6730.field_8190 = (float) (-Math.PI / 4);
      this.field_6724.field_8190 = (float) (Math.PI / 4);
      float var12 = -(MathHelper.cos(var2 * 0.6662F * 2.0F + 0.0F) * 0.4F) * var3;
      float var13 = -(MathHelper.cos(var2 * 0.6662F * 2.0F + (float) Math.PI) * 0.4F) * var3;
      float var14 = -(MathHelper.cos(var2 * 0.6662F * 2.0F + (float) (Math.PI / 2)) * 0.4F) * var3;
      float var15 = -(MathHelper.cos(var2 * 0.6662F * 2.0F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * var3;
      float var16 = Math.abs(MathHelper.sin(var2 * 0.6662F + 0.0F) * 0.4F) * var3;
      float var17 = Math.abs(MathHelper.sin(var2 * 0.6662F + (float) Math.PI) * 0.4F) * var3;
      float var18 = Math.abs(MathHelper.sin(var2 * 0.6662F + (float) (Math.PI / 2)) * 0.4F) * var3;
      float var19 = Math.abs(MathHelper.sin(var2 * 0.6662F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * var3;
      this.field_6725.field_8190 += var12;
      this.field_6735.field_8190 += -var12;
      this.field_6731.field_8190 += var13;
      this.field_6726.field_8190 += -var13;
      this.field_6733.field_8190 += var14;
      this.field_6729.field_8190 += -var14;
      this.field_6730.field_8190 += var15;
      this.field_6724.field_8190 += -var15;
      this.field_6725.field_8185 += var16;
      this.field_6735.field_8185 += -var16;
      this.field_6731.field_8185 += var17;
      this.field_6726.field_8185 += -var17;
      this.field_6733.field_8185 += var18;
      this.field_6729.field_8185 += -var18;
      this.field_6730.field_8185 += var19;
      this.field_6724.field_8185 += -var19;
   }
}
