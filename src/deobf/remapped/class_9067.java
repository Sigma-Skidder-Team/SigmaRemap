package remapped;

import com.google.common.collect.ImmutableList;

public class class_9067<T extends Entity> extends class_1498<T> {
   public final class_1549 field_46393;
   public final class_1549 field_46399;
   public final class_1549 field_46392;
   public final class_1549 field_46398;
   public final class_1549 field_46391;
   public final class_1549 field_46394;
   public final class_1549 field_46396;
   public final class_1549 field_46390;
   public int field_46397 = 1;

   public class_9067(float var1) {
      super(true, 10.0F, 4.0F);
      this.field_46396 = new class_1549(this);
      this.field_46396.method_7054("main", -2.5F, -2.0F, -3.0F, 5, 4, 5, var1, 0, 0);
      this.field_46396.method_7054("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2, var1, 0, 24);
      this.field_46396.method_7054("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2, var1, 0, 10);
      this.field_46396.method_7054("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2, var1, 6, 10);
      this.field_46396.method_7046(0.0F, 15.0F, -9.0F);
      this.field_46390 = new class_1549(this, 20, 0);
      this.field_46390.method_7049(-2.0F, 3.0F, -8.0F, 4.0F, 16.0F, 6.0F, var1);
      this.field_46390.method_7046(0.0F, 12.0F, -10.0F);
      this.field_46391 = new class_1549(this, 0, 15);
      this.field_46391.method_7049(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, var1);
      this.field_46391.field_8191 = 0.9F;
      this.field_46391.method_7046(0.0F, 15.0F, 8.0F);
      this.field_46394 = new class_1549(this, 4, 15);
      this.field_46394.method_7049(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, var1);
      this.field_46394.method_7046(0.0F, 20.0F, 14.0F);
      this.field_46393 = new class_1549(this, 8, 13);
      this.field_46393.method_7049(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, var1);
      this.field_46393.method_7046(1.1F, 18.0F, 5.0F);
      this.field_46399 = new class_1549(this, 8, 13);
      this.field_46399.method_7049(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, var1);
      this.field_46399.method_7046(-1.1F, 18.0F, 5.0F);
      this.field_46392 = new class_1549(this, 40, 0);
      this.field_46392.method_7049(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, var1);
      this.field_46392.method_7046(1.2F, 14.1F, -5.0F);
      this.field_46398 = new class_1549(this, 40, 0);
      this.field_46398.method_7049(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, var1);
      this.field_46398.method_7046(-1.2F, 14.1F, -5.0F);
   }

   @Override
   public Iterable<class_1549> method_6903() {
      return ImmutableList.of(this.field_46396);
   }

   @Override
   public Iterable<class_1549> method_6902() {
      return ImmutableList.of(this.field_46390, this.field_46393, this.field_46399, this.field_46392, this.field_46398, this.field_46391, this.field_46394);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_46396.field_8191 = var6 * (float) (Math.PI / 180.0);
      this.field_46396.field_8190 = var5 * (float) (Math.PI / 180.0);
      if (this.field_46397 != 3) {
         this.field_46390.field_8191 = (float) (Math.PI / 2);
         if (this.field_46397 != 2) {
            this.field_46393.field_8191 = class_9299.method_42840(var2 * 0.6662F) * var3;
            this.field_46399.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI) * var3;
            this.field_46392.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI) * var3;
            this.field_46398.field_8191 = class_9299.method_42840(var2 * 0.6662F) * var3;
            if (this.field_46397 != 1) {
               this.field_46394.field_8191 = 1.7278761F + 0.47123894F * class_9299.method_42840(var2) * var3;
            } else {
               this.field_46394.field_8191 = 1.7278761F + (float) (Math.PI / 4) * class_9299.method_42840(var2) * var3;
            }
         } else {
            this.field_46393.field_8191 = class_9299.method_42840(var2 * 0.6662F) * var3;
            this.field_46399.field_8191 = class_9299.method_42840(var2 * 0.6662F + 0.3F) * var3;
            this.field_46392.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI + 0.3F) * var3;
            this.field_46398.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI) * var3;
            this.field_46394.field_8191 = 1.7278761F + (float) (Math.PI / 10) * class_9299.method_42840(var2) * var3;
         }
      }
   }

   @Override
   public void method_29702(T var1, float var2, float var3, float var4) {
      this.field_46390.field_8181 = 12.0F;
      this.field_46390.field_8187 = -10.0F;
      this.field_46396.field_8181 = 15.0F;
      this.field_46396.field_8187 = -9.0F;
      this.field_46391.field_8181 = 15.0F;
      this.field_46391.field_8187 = 8.0F;
      this.field_46394.field_8181 = 20.0F;
      this.field_46394.field_8187 = 14.0F;
      this.field_46392.field_8181 = 14.1F;
      this.field_46392.field_8187 = -5.0F;
      this.field_46398.field_8181 = 14.1F;
      this.field_46398.field_8187 = -5.0F;
      this.field_46393.field_8181 = 18.0F;
      this.field_46393.field_8187 = 5.0F;
      this.field_46399.field_8181 = 18.0F;
      this.field_46399.field_8187 = 5.0F;
      this.field_46391.field_8191 = 0.9F;
      if (!var1.method_37382()) {
         if (!var1.method_37321()) {
            this.field_46397 = 1;
         } else {
            this.field_46394.field_8181 = this.field_46391.field_8181;
            this.field_46394.field_8187 += 2.0F;
            this.field_46391.field_8191 = (float) (Math.PI / 2);
            this.field_46394.field_8191 = (float) (Math.PI / 2);
            this.field_46397 = 2;
         }
      } else {
         this.field_46390.field_8181++;
         this.field_46396.field_8181 += 2.0F;
         this.field_46391.field_8181++;
         this.field_46394.field_8181 += -4.0F;
         this.field_46394.field_8187 += 2.0F;
         this.field_46391.field_8191 = (float) (Math.PI / 2);
         this.field_46394.field_8191 = (float) (Math.PI / 2);
         this.field_46397 = 0;
      }
   }
}
