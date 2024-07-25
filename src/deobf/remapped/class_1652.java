package remapped;

import com.google.common.collect.ImmutableList;

public class class_1652<T extends Entity> extends class_5272<T> {
   private static String[] field_8582;
   private final class_1549 field_8579;
   private final class_1549 field_8584;
   private final class_1549 field_8581;
   private final class_1549 field_8589;
   private final class_1549 field_8580;
   private final class_1549 field_8585;
   private final class_1549 field_8590;
   private final class_1549 field_8587;
   private final class_1549 field_8588;
   private final class_1549 field_8586;
   private final class_1549 field_8583;

   public class_1652() {
      this.field_49928 = 32;
      this.field_49927 = 32;
      byte var3 = 22;
      this.field_8579 = new class_1549(this, 12, 22);
      this.field_8579.method_7048(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F);
      this.field_8579.method_7046(0.0F, 22.0F, 0.0F);
      this.field_8584 = new class_1549(this, 24, 0);
      this.field_8584.method_7048(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.field_8584.method_7046(-2.5F, 17.0F, -1.5F);
      this.field_8581 = new class_1549(this, 24, 3);
      this.field_8581.method_7048(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.field_8581.method_7046(2.5F, 17.0F, -1.5F);
      this.field_8589 = new class_1549(this, 15, 16);
      this.field_8589.method_7048(-2.5F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F);
      this.field_8589.method_7046(0.0F, 17.0F, -2.5F);
      this.field_8589.field_8191 = (float) (Math.PI / 4);
      this.field_8580 = new class_1549(this, 10, 16);
      this.field_8580.method_7048(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F);
      this.field_8580.method_7046(0.0F, 17.0F, 2.5F);
      this.field_8580.field_8191 = (float) (-Math.PI / 4);
      this.field_8585 = new class_1549(this, 8, 16);
      this.field_8585.method_7048(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.field_8585.method_7046(-2.5F, 22.0F, -2.5F);
      this.field_8585.field_8190 = (float) (-Math.PI / 4);
      this.field_8590 = new class_1549(this, 8, 16);
      this.field_8590.method_7048(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.field_8590.method_7046(-2.5F, 22.0F, 2.5F);
      this.field_8590.field_8190 = (float) (Math.PI / 4);
      this.field_8587 = new class_1549(this, 4, 16);
      this.field_8587.method_7048(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.field_8587.method_7046(2.5F, 22.0F, 2.5F);
      this.field_8587.field_8190 = (float) (-Math.PI / 4);
      this.field_8588 = new class_1549(this, 0, 16);
      this.field_8588.method_7048(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.field_8588.method_7046(2.5F, 22.0F, -2.5F);
      this.field_8588.field_8190 = (float) (Math.PI / 4);
      this.field_8586 = new class_1549(this, 8, 22);
      this.field_8586.method_7048(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.field_8586.method_7046(0.5F, 22.0F, 2.5F);
      this.field_8586.field_8191 = (float) (Math.PI / 4);
      this.field_8583 = new class_1549(this, 17, 21);
      this.field_8583.method_7048(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F);
      this.field_8583.method_7046(0.0F, 22.0F, -2.5F);
      this.field_8583.field_8191 = (float) (-Math.PI / 4);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(
         this.field_8579,
         this.field_8584,
         this.field_8581,
         this.field_8589,
         this.field_8580,
         this.field_8585,
         this.field_8590,
         this.field_8587,
         this.field_8588,
         this.field_8586,
         this.field_8583
      );
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_8584.field_8185 = -0.2F + 0.4F * class_9299.method_42818(var4 * 0.2F);
      this.field_8581.field_8185 = 0.2F - 0.4F * class_9299.method_42818(var4 * 0.2F);
   }
}
