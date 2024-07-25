package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class class_6601 extends class_4171<class_3551, class_3192<class_3551>> {
   private static final Map<class_180, Identifier> field_34040 = Util.<Map<class_180, Identifier>>method_44659(
      Maps.newEnumMap(class_180.class), var0 -> {
         var0.put(class_180.field_595, (Identifier)null);
         var0.put(class_180.field_599, new Identifier("textures/entity/horse/horse_markings_white.png"));
         var0.put(class_180.field_597, new Identifier("textures/entity/horse/horse_markings_whitefield.png"));
         var0.put(class_180.field_598, new Identifier("textures/entity/horse/horse_markings_whitedots.png"));
         var0.put(class_180.field_594, new Identifier("textures/entity/horse/horse_markings_blackdots.png"));
      }
   );

   public class_6601(class_2514<class_3551, class_3192<class_3551>> var1) {
      super(var1);
   }

   public void method_30387(
      class_7966 var1, class_2565 var2, int var3, class_3551 var4, float var5, float var6, float var7, float var8, float var9, float var10
   ) {
      Identifier var13 = field_34040.get(var4.method_16526());
      if (var13 != null && !var4.method_37109()) {
         class_7907 var14 = var2.method_11645(RenderLayer.method_16705(var13));
         this.method_19347().method_45499(var1, var14, var3, class_6353.method_29110(var4, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
