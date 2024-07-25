package remapped;

import com.google.common.collect.ImmutableList;

public class class_2574 extends class_5272<class_337> {
   private static String[] field_12741;
   private static final float[] field_12737 = new float[]{1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F};
   private static final float[] field_12735 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F};
   private static final float[] field_12739 = new float[]{0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F};
   private static final float[] field_12742 = new float[]{0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F};
   private static final float[] field_12743 = new float[]{-8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F};
   private static final float[] field_12744 = new float[]{8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F};
   private final class_1549 field_12736;
   private final class_1549 field_12738;
   private final class_1549[] field_12734;
   private final class_1549[] field_12740;

   public class_2574() {
      this.field_49928 = 64;
      this.field_49927 = 64;
      this.field_12734 = new class_1549[12];
      this.field_12736 = new class_1549(this);
      this.field_12736.method_7037(0, 0).method_7048(-6.0F, 10.0F, -8.0F, 12.0F, 12.0F, 16.0F);
      this.field_12736.method_7037(0, 28).method_7048(-8.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F);
      this.field_12736.method_7037(0, 28).method_7052(6.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F, true);
      this.field_12736.method_7037(16, 40).method_7048(-6.0F, 8.0F, -6.0F, 12.0F, 2.0F, 12.0F);
      this.field_12736.method_7037(16, 40).method_7048(-6.0F, 22.0F, -6.0F, 12.0F, 2.0F, 12.0F);

      for (int var3 = 0; var3 < this.field_12734.length; var3++) {
         this.field_12734[var3] = new class_1549(this, 0, 0);
         this.field_12734[var3].method_7048(-1.0F, -4.5F, -1.0F, 2.0F, 9.0F, 2.0F);
         this.field_12736.method_7043(this.field_12734[var3]);
      }

      this.field_12738 = new class_1549(this, 8, 0);
      this.field_12738.method_7048(-1.0F, 15.0F, 0.0F, 2.0F, 2.0F, 1.0F);
      this.field_12736.method_7043(this.field_12738);
      this.field_12740 = new class_1549[3];
      this.field_12740[0] = new class_1549(this, 40, 0);
      this.field_12740[0].method_7048(-2.0F, 14.0F, 7.0F, 4.0F, 4.0F, 8.0F);
      this.field_12740[1] = new class_1549(this, 0, 54);
      this.field_12740[1].method_7048(0.0F, 14.0F, 0.0F, 3.0F, 3.0F, 7.0F);
      this.field_12740[2] = new class_1549(this);
      this.field_12740[2].method_7037(41, 32).method_7048(0.0F, 14.0F, 0.0F, 2.0F, 2.0F, 6.0F);
      this.field_12740[2].method_7037(25, 19).method_7048(1.0F, 10.5F, 3.0F, 1.0F, 9.0F, 9.0F);
      this.field_12736.method_7043(this.field_12740[0]);
      this.field_12740[0].method_7043(this.field_12740[1]);
      this.field_12740[1].method_7043(this.field_12740[2]);
      this.method_11699(0.0F, 0.0F);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_12736);
   }

   public void method_11698(class_337 var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = var4 - (float)var1.field_41697;
      this.field_12736.field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_12736.field_8191 = var6 * (float) (Math.PI / 180.0);
      float var10 = (1.0F - var1.method_1549(var9)) * 0.55F;
      this.method_11699(var4, var10);
      this.field_12738.field_8187 = -8.25F;
      Object var11 = MinecraftClient.getInstance().getRenderViewEntity();
      if (var1.method_1555()) {
         var11 = var1.method_1552();
      }

      if (var11 != null) {
         class_1343 var12 = ((Entity)var11).method_37335(0.0F);
         class_1343 var13 = var1.method_37335(0.0F);
         double var14 = var12.field_7333 - var13.field_7333;
         if (!(var14 > 0.0)) {
            this.field_12738.field_8181 = 1.0F;
         } else {
            this.field_12738.field_8181 = 0.0F;
         }

         class_1343 var16 = var1.method_37307(0.0F);
         var16 = new class_1343(var16.field_7336, 0.0, var16.field_7334);
         class_1343 var17 = new class_1343(var13.field_7336 - var12.field_7336, 0.0, var13.field_7334 - var12.field_7334)
            .method_6213()
            .method_6192((float) (Math.PI / 2));
         double var18 = var16.method_6206(var17);
         this.field_12738.field_8183 = class_9299.method_42843((float)Math.abs(var18)) * 2.0F * (float)Math.signum(var18);
      }

      this.field_12738.field_8200 = true;
      float var20 = var1.method_1547(var9);
      this.field_12740[0].field_8190 = class_9299.method_42818(var20) * (float) Math.PI * 0.05F;
      this.field_12740[1].field_8190 = class_9299.method_42818(var20) * (float) Math.PI * 0.1F;
      this.field_12740[1].field_8183 = -1.5F;
      this.field_12740[1].field_8181 = 0.5F;
      this.field_12740[1].field_8187 = 14.0F;
      this.field_12740[2].field_8190 = class_9299.method_42818(var20) * (float) Math.PI * 0.15F;
      this.field_12740[2].field_8183 = 0.5F;
      this.field_12740[2].field_8181 = 0.5F;
      this.field_12740[2].field_8187 = 6.0F;
   }

   private void method_11699(float var1, float var2) {
      for (int var5 = 0; var5 < 12; var5++) {
         this.field_12734[var5].field_8191 = (float) Math.PI * field_12737[var5];
         this.field_12734[var5].field_8190 = (float) Math.PI * field_12735[var5];
         this.field_12734[var5].field_8185 = (float) Math.PI * field_12739[var5];
         this.field_12734[var5].field_8183 = field_12742[var5] * (1.0F + class_9299.method_42840(var1 * 1.5F + (float)var5) * 0.01F - var2);
         this.field_12734[var5].field_8181 = 16.0F + field_12743[var5] * (1.0F + class_9299.method_42840(var1 * 1.5F + (float)var5) * 0.01F - var2);
         this.field_12734[var5].field_8187 = field_12744[var5] * (1.0F + class_9299.method_42840(var1 * 1.5F + (float)var5) * 0.01F - var2);
      }
   }
}
