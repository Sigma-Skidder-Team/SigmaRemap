package remapped;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class class_1365 extends class_2255<class_1578> {
   private static String[] field_7420;
   private final class_1549 field_7422;
   private final class_1549 field_7421;
   private final class_1549[] field_7419 = new class_1549[4];

   public class_1365(class_3569 var1) {
      super(var1);
      this.field_7422 = new class_1549(64, 64, 0, 0);
      this.field_7422.method_7049(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F, 0.0F);
      this.field_7421 = new class_1549(64, 64, 0, 22);
      this.field_7421.method_7049(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F, 0.0F);
      this.field_7419[0] = new class_1549(64, 64, 50, 0);
      this.field_7419[1] = new class_1549(64, 64, 50, 6);
      this.field_7419[2] = new class_1549(64, 64, 50, 12);
      this.field_7419[3] = new class_1549(64, 64, 50, 18);
      this.field_7419[0].method_7048(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F);
      this.field_7419[1].method_7048(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F);
      this.field_7419[2].method_7048(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F);
      this.field_7419[3].method_7048(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F);
      this.field_7419[0].field_8191 = (float) (Math.PI / 2);
      this.field_7419[1].field_8191 = (float) (Math.PI / 2);
      this.field_7419[2].field_8191 = (float) (Math.PI / 2);
      this.field_7419[3].field_8191 = (float) (Math.PI / 2);
      this.field_7419[0].field_8185 = 0.0F;
      this.field_7419[1].field_8185 = (float) (Math.PI / 2);
      this.field_7419[2].field_8185 = (float) (Math.PI * 3.0 / 2.0);
      this.field_7419[3].field_8185 = (float) Math.PI;
   }

   public void method_6278(class_1578 var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      class_2843 var9 = class_5276.field_26956[var1.method_7117().method_41794()];
      World var10 = var1.method_17402();
      if (var10 == null) {
         this.method_6279(var3, var4, true, Direction.field_800, var9, var5, var6, false);
         this.method_6279(var3, var4, false, Direction.field_800, var9, var5, var6, true);
      } else {
         class_2522 var11 = var1.method_17403();
         class_7892 var12 = class_7951.<class_1578>method_35989(
            class_133.field_374,
            class_3633::method_16926,
            class_3633::method_16931,
            class_6942.field_35692,
            var11,
            var10,
            var1.method_17399(),
            (var0, var1x) -> false
         );
         int var13 = var12.<Int2IntFunction>method_35688(new class_491()).get(var5);
         this.method_6279(
            var3,
            var4,
            var11.<class_7095>method_10313(class_3633.field_17729) == class_7095.field_36603,
            var11.<Direction>method_10313(class_3633.field_1543),
            var9,
            var13,
            var6,
            false
         );
      }
   }

   private void method_6279(class_7966 var1, class_2565 var2, boolean var3, Direction var4, class_2843 var5, int var6, int var7, boolean var8) {
      this.field_7422.field_8200 = var3;
      this.field_7421.field_8200 = !var3;
      this.field_7419[0].field_8200 = !var3;
      this.field_7419[1].field_8200 = var3;
      this.field_7419[2].field_8200 = !var3;
      this.field_7419[3].field_8200 = var3;
      var1.method_36063();
      var1.method_36065(0.0, 0.5625, !var8 ? 0.0 : -1.0);
      var1.method_36060(class_2426.field_12080.method_11074(90.0F));
      var1.method_36065(0.5, 0.5, 0.5);
      var1.method_36060(class_2426.field_12076.method_11074(180.0F + var4.method_1028()));
      var1.method_36065(-0.5, -0.5, -0.5);
      class_7907 var11 = var5.method_12943(var2, RenderLayer::method_16734);
      this.field_7422.method_7060(var1, var11, var6, var7);
      this.field_7421.method_7060(var1, var11, var6, var7);
      this.field_7419[0].method_7060(var1, var11, var6, var7);
      this.field_7419[1].method_7060(var1, var11, var6, var7);
      this.field_7419[2].method_7060(var1, var11, var6, var7);
      this.field_7419[3].method_7060(var1, var11, var6, var7);
      var1.method_36064();
   }
}
