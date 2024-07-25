package remapped;

import java.util.Arrays;

public class class_1921<T extends Entity> extends class_5272<T> {
   private static String[] field_9841;
   private final class_1549[] field_9842 = new class_1549[6];

   public class_1921() {
      this.field_9842[0] = new class_1549(this, 0, 10);
      this.field_9842[1] = new class_1549(this, 0, 0);
      this.field_9842[2] = new class_1549(this, 0, 0);
      this.field_9842[3] = new class_1549(this, 0, 0);
      this.field_9842[4] = new class_1549(this, 0, 0);
      this.field_9842[5] = new class_1549(this, 44, 10);
      byte var3 = 20;
      byte var4 = 8;
      byte var5 = 16;
      byte var6 = 4;
      this.field_9842[0].method_7049(-10.0F, -8.0F, -1.0F, 20.0F, 16.0F, 2.0F, 0.0F);
      this.field_9842[0].method_7046(0.0F, 4.0F, 0.0F);
      this.field_9842[5].method_7049(-9.0F, -7.0F, -1.0F, 18.0F, 14.0F, 1.0F, 0.0F);
      this.field_9842[5].method_7046(0.0F, 4.0F, 0.0F);
      this.field_9842[1].method_7049(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.field_9842[1].method_7046(-9.0F, 4.0F, 0.0F);
      this.field_9842[2].method_7049(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.field_9842[2].method_7046(9.0F, 4.0F, 0.0F);
      this.field_9842[3].method_7049(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.field_9842[3].method_7046(0.0F, 4.0F, -7.0F);
      this.field_9842[4].method_7049(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.field_9842[4].method_7046(0.0F, 4.0F, 7.0F);
      this.field_9842[0].field_8191 = (float) (Math.PI / 2);
      this.field_9842[1].field_8190 = (float) (Math.PI * 3.0 / 2.0);
      this.field_9842[2].field_8190 = (float) (Math.PI / 2);
      this.field_9842[3].field_8190 = (float) Math.PI;
      this.field_9842[5].field_8191 = (float) (-Math.PI / 2);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_9842[5].field_8181 = 4.0F - var4;
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return Arrays.<class_1549>asList(this.field_9842);
   }
}
