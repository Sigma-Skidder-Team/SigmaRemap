package remapped;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum class_7507 implements class_5598 {
   field_38322(0, 0),
   field_38323(0, 90),
   field_38320(0, 180),
   field_38338(0, 270),
   field_38336(90, 0),
   field_38319(90, 90),
   field_38324(90, 180),
   field_38321(90, 270),
   field_38339(180, 0),
   field_38337(180, 90),
   field_38328(180, 180),
   field_38335(180, 270),
   field_38329(270, 0),
   field_38334(270, 90),
   field_38333(270, 180),
   field_38330(270, 270);

   private static final Map<Integer, class_7507> field_38327 = Arrays.<class_7507>stream(values())
      .collect(Collectors.toMap(var0 -> var0.field_38325, var0 -> (class_7507)var0));
   private final class_1221 field_38326;
   private final class_8336 field_38331;
   private final int field_38325;

   private static int method_34223(int var0, int var1) {
      return var0 * 360 + var1;
   }

   private class_7507(int var3, int var4) {
      this.field_38325 = method_34223(var3, var4);
      Quaternion var7 = new Quaternion(new class_2426(0.0F, 1.0F, 0.0F), (float)(-var4), true);
      var7.method_24658(new Quaternion(new class_2426(1.0F, 0.0F, 0.0F), (float)(-var3), true));
      class_8336 var8 = class_8336.field_42691;

      for (byte var9 = 0; var9 < var4; var9 += 90) {
         var8 = var8.method_38395(class_8336.field_42710);
      }

      for (byte var10 = 0; var10 < var3; var10 += 90) {
         var8 = var8.method_38395(class_8336.field_42693);
      }

      this.field_38326 = new class_1221((class_2426)null, var7, (class_2426)null, (Quaternion)null);
      this.field_38331 = var8;
   }

   @Override
   public class_1221 method_25403() {
      return this.field_38326;
   }

   public static class_7507 method_34222(int var0, int var1) {
      return field_38327.get(method_34223(class_9299.method_42788(var0, 360), class_9299.method_42788(var1, 360)));
   }
}
