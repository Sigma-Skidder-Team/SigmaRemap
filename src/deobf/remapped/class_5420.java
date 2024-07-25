package remapped;

public class class_5420 extends class_2255<class_9317> {
   public static final class_2843 field_27614 = new class_2843(class_8359.field_42824, new Identifier("entity/bell/bell_body"));
   private final class_1549 field_27615 = new class_1549(32, 32, 0, 0);

   public class_5420(class_3569 var1) {
      super(var1);
      this.field_27615.method_7048(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F);
      this.field_27615.method_7046(8.0F, 12.0F, 8.0F);
      class_1549 var4 = new class_1549(32, 32, 0, 13);
      var4.method_7048(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F);
      var4.method_7046(-8.0F, -12.0F, -8.0F);
      this.field_27615.method_7043(var4);
   }

   public void method_24642(class_9317 var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      float var9 = (float)var1.field_47581 + var2;
      float var10 = 0.0F;
      float var11 = 0.0F;
      if (var1.field_47584) {
         float var12 = MathHelper.sin(var9 / (float) Math.PI) / (4.0F + var9 / 3.0F);
         if (var1.field_47577 != Direction.field_818) {
            if (var1.field_47577 != Direction.field_800) {
               if (var1.field_47577 != Direction.field_804) {
                  if (var1.field_47577 == Direction.field_809) {
                     var11 = var12;
                  }
               } else {
                  var11 = -var12;
               }
            } else {
               var10 = var12;
            }
         } else {
            var10 = -var12;
         }
      }

      this.field_27615.field_8191 = var10;
      this.field_27615.field_8185 = var11;
      class_7907 var13 = field_27614.method_12943(var4, RenderLayer::method_16734);
      this.field_27615.method_7060(var3, var13, var5, var6);
   }
}
