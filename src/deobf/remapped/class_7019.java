package remapped;

import com.google.common.collect.ImmutableList;

public class class_7019<T extends MobEntity & class_9479> extends class_1498<T> {
   private static String[] field_35980;
   private final class_1549 field_35982;
   private final class_1549 field_35977;
   private final class_1549 field_35975;
   private final class_1549 field_35978;
   private final class_1549 field_35981;
   private final class_1549 field_35976;
   private final class_1549 field_35974;
   private final class_1549 field_35973;
   private final class_1549 field_35979;

   public class_7019() {
      super(true, 8.0F, 6.0F, 1.9F, 2.0F, 24.0F);
      this.field_49928 = 128;
      this.field_49927 = 64;
      this.field_35978 = new class_1549(this);
      this.field_35978.method_7046(0.0F, 7.0F, 0.0F);
      this.field_35978.method_7037(1, 1).method_7048(-8.0F, -7.0F, -13.0F, 16.0F, 14.0F, 26.0F);
      this.field_35979 = new class_1549(this);
      this.field_35979.method_7046(0.0F, -14.0F, -5.0F);
      this.field_35979.method_7037(90, 33).method_7049(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, 0.001F);
      this.field_35978.method_7043(this.field_35979);
      this.field_35982 = new class_1549(this);
      this.field_35982.method_7046(0.0F, 2.0F, -12.0F);
      this.field_35982.method_7037(61, 1).method_7048(-7.0F, -3.0F, -19.0F, 14.0F, 6.0F, 19.0F);
      this.field_35977 = new class_1549(this);
      this.field_35977.method_7046(-6.0F, -2.0F, -3.0F);
      this.field_35977.method_7037(1, 1).method_7048(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F);
      this.field_35977.field_8185 = (float) (-Math.PI * 2.0 / 9.0);
      this.field_35982.method_7043(this.field_35977);
      this.field_35975 = new class_1549(this);
      this.field_35975.method_7046(6.0F, -2.0F, -3.0F);
      this.field_35975.method_7037(1, 6).method_7048(0.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F);
      this.field_35975.field_8185 = (float) (Math.PI * 2.0 / 9.0);
      this.field_35982.method_7043(this.field_35975);
      class_1549 var3 = new class_1549(this);
      var3.method_7046(-7.0F, 2.0F, -12.0F);
      var3.method_7037(10, 13).method_7048(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F);
      this.field_35982.method_7043(var3);
      class_1549 var4 = new class_1549(this);
      var4.method_7046(7.0F, 2.0F, -12.0F);
      var4.method_7037(1, 13).method_7048(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F);
      this.field_35982.method_7043(var4);
      this.field_35982.field_8191 = 0.87266463F;
      byte var5 = 14;
      byte var6 = 11;
      this.field_35981 = new class_1549(this);
      this.field_35981.method_7046(-4.0F, 10.0F, -8.5F);
      this.field_35981.method_7037(66, 42).method_7048(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F);
      this.field_35976 = new class_1549(this);
      this.field_35976.method_7046(4.0F, 10.0F, -8.5F);
      this.field_35976.method_7037(41, 42).method_7048(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F);
      this.field_35974 = new class_1549(this);
      this.field_35974.method_7046(-5.0F, 13.0F, 10.0F);
      this.field_35974.method_7037(21, 45).method_7048(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F);
      this.field_35973 = new class_1549(this);
      this.field_35973.method_7046(5.0F, 13.0F, 10.0F);
      this.field_35973.method_7037(0, 45).method_7048(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F);
   }

   @Override
   public Iterable<class_1549> method_6903() {
      return ImmutableList.of(this.field_35982);
   }

   @Override
   public Iterable<class_1549> method_6902() {
      return ImmutableList.of(this.field_35978, this.field_35981, this.field_35976, this.field_35974, this.field_35973);
   }

   public void method_32034(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_35977.field_8185 = (float) (-Math.PI * 2.0 / 9.0) - var3 * MathHelper.sin(var2);
      this.field_35975.field_8185 = (float) (Math.PI * 2.0 / 9.0) + var3 * MathHelper.sin(var2);
      this.field_35982.field_8190 = var5 * (float) (Math.PI / 180.0);
      int var9 = ((class_9479)var1).method_43795();
      float var10 = 1.0F - (float) MathHelper.abs(10 - 2 * var9) / 10.0F;
      this.field_35982.field_8191 = MathHelper.method_42795(var10, 0.87266463F, (float) (-Math.PI / 9));
      if (!var1.method_26449()) {
         this.field_35982.field_8181 = 2.0F;
         this.field_35979.field_8187 = -7.0F;
      } else {
         this.field_35982.field_8181 = MathHelper.method_42795(var10, 2.0F, 5.0F);
         this.field_35979.field_8187 = -3.0F;
      }

      float var11 = 1.2F;
      this.field_35981.field_8191 = MathHelper.cos(var2) * 1.2F * var3;
      this.field_35976.field_8191 = MathHelper.cos(var2 + (float) Math.PI) * 1.2F * var3;
      this.field_35974.field_8191 = this.field_35976.field_8191;
      this.field_35973.field_8191 = this.field_35981.field_8191;
   }
}
