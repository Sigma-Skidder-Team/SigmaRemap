package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class class_8197 extends class_9873 {
   private static String[] field_41950;
   private final class_1549 field_41954 = new class_1549(64, 32, 0, 0).method_7048(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F);
   private final class_1549 field_41956 = new class_1549(64, 32, 16, 0).method_7048(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F);
   private final class_1549 field_41952;
   private final class_1549 field_41949;
   private final class_1549 field_41955;
   private final class_1549 field_41951;
   private final class_1549 field_41953 = new class_1549(64, 32, 12, 0).method_7048(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F);
   private final List<class_1549> field_41948;

   public class_8197() {
      super(RenderLayer::method_16734);
      this.field_41952 = new class_1549(64, 32, 0, 10).method_7048(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F);
      this.field_41949 = new class_1549(64, 32, 12, 10).method_7048(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F);
      this.field_41955 = new class_1549(64, 32, 24, 10).method_7048(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      this.field_41951 = new class_1549(64, 32, 24, 10).method_7048(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      this.field_41948 = ImmutableList.of(
         this.field_41954, this.field_41956, this.field_41953, this.field_41952, this.field_41949, this.field_41955, this.field_41951
      );
      this.field_41954.method_7046(0.0F, 0.0F, -1.0F);
      this.field_41956.method_7046(0.0F, 0.0F, 1.0F);
      this.field_41953.field_8190 = (float) (Math.PI / 2);
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.method_37552(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void method_37552(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field_41948.forEach(var8x -> var8x.method_7061(var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public void method_37551(float var1, float var2, float var3, float var4) {
      float var7 = (class_9299.method_42818(var1 * 0.02F) * 0.1F + 1.25F) * var4;
      this.field_41954.field_8190 = (float) Math.PI + var7;
      this.field_41956.field_8190 = -var7;
      this.field_41952.field_8190 = var7;
      this.field_41949.field_8190 = -var7;
      this.field_41955.field_8190 = var7 - var7 * 2.0F * var2;
      this.field_41951.field_8190 = var7 - var7 * 2.0F * var3;
      this.field_41952.field_8183 = class_9299.method_42818(var7);
      this.field_41949.field_8183 = class_9299.method_42818(var7);
      this.field_41955.field_8183 = class_9299.method_42818(var7);
      this.field_41951.field_8183 = class_9299.method_42818(var7);
   }
}
