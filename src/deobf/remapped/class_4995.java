package remapped;

import com.google.common.collect.ImmutableList;

public class class_4995<T extends Entity> extends class_5272<T> {
   private static String[] field_25851;
   private final class_1549 field_25850;
   private final class_1549 field_25853;
   private final class_1549 field_25852;

   public class_4995() {
      this.field_49928 = 64;
      this.field_49927 = 64;
      float var3 = 18.0F;
      float var4 = -8.0F;
      this.field_25850 = new class_1549(this, 22, 0);
      this.field_25850.method_7048(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F);
      this.field_25850.method_7046(0.0F, 22.0F, -5.0F);
      class_1549 var5 = new class_1549(this, 51, 0);
      var5.method_7048(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F);
      var5.field_8191 = (float) (Math.PI / 3);
      this.field_25850.method_7043(var5);
      class_1549 var6 = new class_1549(this, 48, 20);
      var6.field_8197 = true;
      var6.method_7048(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F);
      var6.method_7046(2.0F, -2.0F, 4.0F);
      var6.field_8191 = (float) (Math.PI / 3);
      var6.field_8185 = (float) (Math.PI * 2.0 / 3.0);
      this.field_25850.method_7043(var6);
      class_1549 var7 = new class_1549(this, 48, 20);
      var7.method_7048(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F);
      var7.method_7046(-2.0F, -2.0F, 4.0F);
      var7.field_8191 = (float) (Math.PI / 3);
      var7.field_8185 = (float) (-Math.PI * 2.0 / 3.0);
      this.field_25850.method_7043(var7);
      this.field_25853 = new class_1549(this, 0, 19);
      this.field_25853.method_7048(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 11.0F);
      this.field_25853.method_7046(0.0F, -2.5F, 11.0F);
      this.field_25853.field_8191 = -0.10471976F;
      this.field_25850.method_7043(this.field_25853);
      this.field_25852 = new class_1549(this, 19, 20);
      this.field_25852.method_7048(-5.0F, -0.5F, 0.0F, 10.0F, 1.0F, 6.0F);
      this.field_25852.method_7046(0.0F, 0.0F, 9.0F);
      this.field_25852.field_8191 = 0.0F;
      this.field_25853.method_7043(this.field_25852);
      class_1549 var8 = new class_1549(this, 0, 0);
      var8.method_7048(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F);
      var8.method_7046(0.0F, -4.0F, -3.0F);
      class_1549 var9 = new class_1549(this, 0, 13);
      var9.method_7048(-1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F);
      var8.method_7043(var9);
      this.field_25850.method_7043(var8);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_25850);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_25850.field_8191 = var6 * (float) (Math.PI / 180.0);
      this.field_25850.field_8190 = var5 * (float) (Math.PI / 180.0);
      if (Entity.method_37266(var1.method_37098()) > 1.0E-7) {
         this.field_25850.field_8191 = this.field_25850.field_8191 + -0.05F + -0.05F * MathHelper.cos(var4 * 0.3F);
         this.field_25853.field_8191 = -0.1F * MathHelper.cos(var4 * 0.3F);
         this.field_25852.field_8191 = -0.2F * MathHelper.cos(var4 * 0.3F);
      }
   }
}
