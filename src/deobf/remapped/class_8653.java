package remapped;

public class class_8653 implements class_5041 {
   private static final int field_44319 = 5447;
   private static final int field_44320 = 5566;

   @Override
   public int method_23214(class_1455 var1, class_5531 var2) {
      class_4081 var5 = var1.<class_4081>method_6746(class_4081.class);
      class_9371 var6 = new class_9371(
         (int)this.method_39671(var2.<class_5287>method_25123("x")),
         (short)((int)this.method_39671(var2.<class_5287>method_25123("y"))),
         (int)this.method_39671(var2.<class_5287>method_25123("z"))
      );
      if (var5.method_18811(var6)) {
         int var7 = var5.method_18809(var6).method_36355();
         if (var7 >= 5447 && var7 <= 5566) {
            class_5287 var8 = var2.<class_5287>method_25123("SkullType");
            if (var8 != null) {
               var7 += ((Number)var2.<class_5287>method_25123("SkullType").method_24129()).intValue() * 20;
            }

            if (var2.method_25125("Rot")) {
               var7 += ((Number)var2.<class_5287>method_25123("Rot").method_24129()).intValue();
            }

            return var7;
         } else {
            class_3446.method_15886().method_34617().warning("Why does this block have the skull block entity? " + var2);
            return -1;
         }
      } else {
         class_3446.method_15886().method_34617().warning("Received an head update packet, but there is no head! O_o " + var2);
         return -1;
      }
   }

   private long method_39671(class_5287 var1) {
      return ((Integer)var1.method_24129()).longValue();
   }
}
