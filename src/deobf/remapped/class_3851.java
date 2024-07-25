package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class class_3851 extends class_8108 {
   private static String[] field_18789;
   private final class_1549 field_18787;
   private final class_1549 field_18788;
   private final class_1549 field_18785;
   private final class_1549 field_18786;

   public class_3851() {
      this(0.0F);
   }

   public class_3851(float var1) {
      super(var1, 64, 64);
      this.field_11696 = new class_1549(this, 0, 0);
      this.field_11696.method_7049(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1);
      this.field_11696.method_7046(0.0F, 0.0F, 0.0F);
      this.field_11704 = new class_1549(this, 0, 26);
      this.field_11704.method_7049(-6.0F, 0.0F, -1.5F, 12.0F, 3.0F, 3.0F, var1);
      this.field_11704.method_7046(0.0F, 0.0F, 0.0F);
      this.field_11705 = new class_1549(this, 24, 0);
      this.field_11705.method_7049(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
      this.field_11705.method_7046(-5.0F, 2.0F, 0.0F);
      this.field_11701 = new class_1549(this, 32, 16);
      this.field_11701.field_8197 = true;
      this.field_11701.method_7049(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
      this.field_11701.method_7046(5.0F, 2.0F, 0.0F);
      this.field_11706 = new class_1549(this, 8, 0);
      this.field_11706.method_7049(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, var1);
      this.field_11706.method_7046(-1.9F, 12.0F, 0.0F);
      this.field_11703 = new class_1549(this, 40, 16);
      this.field_11703.field_8197 = true;
      this.field_11703.method_7049(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, var1);
      this.field_11703.method_7046(1.9F, 12.0F, 0.0F);
      this.field_18787 = new class_1549(this, 16, 0);
      this.field_18787.method_7049(-3.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1);
      this.field_18787.method_7046(0.0F, 0.0F, 0.0F);
      this.field_18787.field_8200 = true;
      this.field_18788 = new class_1549(this, 48, 16);
      this.field_18788.method_7049(1.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1);
      this.field_18788.method_7046(0.0F, 0.0F, 0.0F);
      this.field_18785 = new class_1549(this, 0, 48);
      this.field_18785.method_7049(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F, var1);
      this.field_18785.method_7046(0.0F, 0.0F, 0.0F);
      this.field_18786 = new class_1549(this, 0, 32);
      this.field_18786.method_7049(-6.0F, 11.0F, -6.0F, 12.0F, 1.0F, 12.0F, var1);
      this.field_18786.method_7046(0.0F, 12.0F, 0.0F);
      this.field_11695.field_8200 = false;
   }

   public void method_17876(class_9399 var1, float var2, float var3, float var4) {
      this.field_18786.field_8191 = 0.0F;
      this.field_18786.field_8190 = (float) (Math.PI / 180.0) * -class_9299.method_42837(var4, var1.prevRotationYaw, var1.rotationYaw);
      this.field_18786.field_8185 = 0.0F;
   }

   @Override
   public void method_36833(class_9399 var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_36833(var1, var2, var3, var4, var5, var6);
      this.field_11701.field_8200 = var1.method_43499();
      this.field_11705.field_8200 = var1.method_43499();
      this.field_18786.field_8200 = !var1.method_43495();
      this.field_11703.method_7046(1.9F, 12.0F, 0.0F);
      this.field_11706.method_7046(-1.9F, 12.0F, 0.0F);
      this.field_18787.field_8191 = (float) (Math.PI / 180.0) * var1.method_43517().method_6280();
      this.field_18787.field_8190 = (float) (Math.PI / 180.0) * var1.method_43517().method_6284();
      this.field_18787.field_8185 = (float) (Math.PI / 180.0) * var1.method_43517().method_6281();
      this.field_18788.field_8191 = (float) (Math.PI / 180.0) * var1.method_43517().method_6280();
      this.field_18788.field_8190 = (float) (Math.PI / 180.0) * var1.method_43517().method_6284();
      this.field_18788.field_8185 = (float) (Math.PI / 180.0) * var1.method_43517().method_6281();
      this.field_18785.field_8191 = (float) (Math.PI / 180.0) * var1.method_43517().method_6280();
      this.field_18785.field_8190 = (float) (Math.PI / 180.0) * var1.method_43517().method_6284();
      this.field_18785.field_8185 = (float) (Math.PI / 180.0) * var1.method_43517().method_6281();
   }

   @Override
   public Iterable<class_1549> method_6902() {
      return Iterables.concat(super.method_6902(), ImmutableList.of(this.field_18787, this.field_18788, this.field_18785, this.field_18786));
   }

   @Override
   public void method_7948(class_1736 var1, class_7966 var2) {
      class_1549 var5 = this.method_10746(var1);
      boolean var6 = var5.field_8200;
      var5.field_8200 = true;
      super.method_7948(var1, var2);
      var5.field_8200 = var6;
   }
}
