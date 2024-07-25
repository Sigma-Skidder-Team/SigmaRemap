package remapped;

import com.google.common.collect.ImmutableList;

public class class_472<T extends class_8145> extends class_1498<T> {
   private static String[] field_2951;
   private final class_1549 field_2947;
   private final class_1549 field_2952;
   private final class_1549 field_2944;
   private final class_1549 field_2950;
   private final class_1549 field_2948;
   private final class_1549 field_2946;
   private final class_1549 field_2949;
   private final class_1549 field_2945;

   public class_472() {
      byte var3 = 16;
      this.field_2947 = new class_1549(this, 0, 0);
      this.field_2947.method_7049(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F, 0.0F);
      this.field_2947.method_7046(0.0F, 15.0F, -4.0F);
      this.field_2949 = new class_1549(this, 14, 0);
      this.field_2949.method_7049(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F);
      this.field_2949.method_7046(0.0F, 15.0F, -4.0F);
      this.field_2945 = new class_1549(this, 14, 4);
      this.field_2945.method_7049(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F);
      this.field_2945.method_7046(0.0F, 15.0F, -4.0F);
      this.field_2952 = new class_1549(this, 0, 9);
      this.field_2952.method_7049(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F);
      this.field_2952.method_7046(0.0F, 16.0F, 0.0F);
      this.field_2944 = new class_1549(this, 26, 0);
      this.field_2944.method_7048(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      this.field_2944.method_7046(-2.0F, 19.0F, 1.0F);
      this.field_2950 = new class_1549(this, 26, 0);
      this.field_2950.method_7048(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      this.field_2950.method_7046(1.0F, 19.0F, 1.0F);
      this.field_2948 = new class_1549(this, 24, 13);
      this.field_2948.method_7048(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F);
      this.field_2948.method_7046(-4.0F, 13.0F, 0.0F);
      this.field_2946 = new class_1549(this, 24, 13);
      this.field_2946.method_7048(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F);
      this.field_2946.method_7046(4.0F, 13.0F, 0.0F);
   }

   @Override
   public Iterable<class_1549> method_6903() {
      return ImmutableList.of(this.field_2947, this.field_2949, this.field_2945);
   }

   @Override
   public Iterable<class_1549> method_6902() {
      return ImmutableList.of(this.field_2952, this.field_2944, this.field_2950, this.field_2948, this.field_2946);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_2947.field_8191 = var6 * (float) (Math.PI / 180.0);
      this.field_2947.field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_2949.field_8191 = this.field_2947.field_8191;
      this.field_2949.field_8190 = this.field_2947.field_8190;
      this.field_2945.field_8191 = this.field_2947.field_8191;
      this.field_2945.field_8190 = this.field_2947.field_8190;
      this.field_2952.field_8191 = (float) (Math.PI / 2);
      this.field_2944.field_8191 = class_9299.method_42840(var2 * 0.6662F) * 1.4F * var3;
      this.field_2950.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field_2948.field_8185 = var4;
      this.field_2946.field_8185 = -var4;
   }
}
