package remapped;

import com.google.common.collect.ImmutableList;

public class class_1085<T extends Entity> extends class_5272<T> {
   private static String[] field_5994;
   private final class_1549 field_5991;
   private final class_1549 field_6004;
   private final class_1549 field_6001;
   private final class_1549 field_5999;
   private final class_1549 field_6002;
   private final class_1549 field_5992;
   private final class_1549 field_5997;
   private final class_1549 field_6003;
   private final class_1549 field_5993;
   private final class_1549 field_6000;
   private final class_1549 field_5995;
   private final class_1549 field_5998;
   private final class_1549 field_5996;

   public class_1085() {
      this.field_49928 = 32;
      this.field_49927 = 32;
      byte var3 = 22;
      this.field_5991 = new class_1549(this, 0, 0);
      this.field_5991.method_7048(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.field_5991.method_7046(0.0F, 22.0F, 0.0F);
      this.field_6004 = new class_1549(this, 24, 0);
      this.field_6004.method_7048(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F);
      this.field_6004.method_7046(-4.0F, 15.0F, -2.0F);
      this.field_6001 = new class_1549(this, 24, 3);
      this.field_6001.method_7048(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F);
      this.field_6001.method_7046(4.0F, 15.0F, -2.0F);
      this.field_5999 = new class_1549(this, 15, 17);
      this.field_5999.method_7048(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.field_5999.method_7046(0.0F, 14.0F, -4.0F);
      this.field_5999.field_8191 = (float) (Math.PI / 4);
      this.field_6002 = new class_1549(this, 14, 16);
      this.field_6002.method_7048(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 1.0F);
      this.field_6002.method_7046(0.0F, 14.0F, 0.0F);
      this.field_5992 = new class_1549(this, 23, 18);
      this.field_5992.method_7048(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.field_5992.method_7046(0.0F, 14.0F, 4.0F);
      this.field_5992.field_8191 = (float) (-Math.PI / 4);
      this.field_5997 = new class_1549(this, 5, 17);
      this.field_5997.method_7048(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.field_5997.method_7046(-4.0F, 22.0F, -4.0F);
      this.field_5997.field_8190 = (float) (-Math.PI / 4);
      this.field_6003 = new class_1549(this, 1, 17);
      this.field_6003.method_7048(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.field_6003.method_7046(4.0F, 22.0F, -4.0F);
      this.field_6003.field_8190 = (float) (Math.PI / 4);
      this.field_5993 = new class_1549(this, 15, 20);
      this.field_5993.method_7048(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.field_5993.method_7046(0.0F, 22.0F, -4.0F);
      this.field_5993.field_8191 = (float) (-Math.PI / 4);
      this.field_5995 = new class_1549(this, 15, 20);
      this.field_5995.method_7048(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.field_5995.method_7046(0.0F, 22.0F, 0.0F);
      this.field_6000 = new class_1549(this, 15, 20);
      this.field_6000.method_7048(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.field_6000.method_7046(0.0F, 22.0F, 4.0F);
      this.field_6000.field_8191 = (float) (Math.PI / 4);
      this.field_5998 = new class_1549(this, 9, 17);
      this.field_5998.method_7048(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.field_5998.method_7046(-4.0F, 22.0F, 4.0F);
      this.field_5998.field_8190 = (float) (Math.PI / 4);
      this.field_5996 = new class_1549(this, 9, 17);
      this.field_5996.method_7048(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.field_5996.method_7046(4.0F, 22.0F, 4.0F);
      this.field_5996.field_8190 = (float) (-Math.PI / 4);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(
         this.field_5991,
         this.field_6004,
         this.field_6001,
         this.field_5999,
         this.field_6002,
         this.field_5992,
         this.field_5997,
         this.field_6003,
         this.field_5993,
         this.field_5995,
         this.field_6000,
         this.field_5998,
         new class_1549[]{this.field_5996}
      );
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_6004.field_8185 = -0.2F + 0.4F * class_9299.method_42818(var4 * 0.2F);
      this.field_6001.field_8185 = 0.2F - 0.4F * class_9299.method_42818(var4 * 0.2F);
   }
}
