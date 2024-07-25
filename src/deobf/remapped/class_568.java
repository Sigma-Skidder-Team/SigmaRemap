package remapped;

public class class_568 implements class_5041 {
   @Override
   public int method_23214(class_1455 var1, class_5531 var2) {
      class_4081 var5 = var1.<class_4081>method_6746(class_4081.class);
      class_9371 var6 = new class_9371(
         (int)this.method_2701(var2.<class_5287>method_25123("x")),
         (short)((int)this.method_2701(var2.<class_5287>method_25123("y"))),
         (int)this.method_2701(var2.<class_5287>method_25123("z"))
      );
      if (var5.method_18811(var6)) {
         int var7 = var5.method_18809(var6).method_36355() - 972 + 748;
         class_5287 var8 = var2.<class_5287>method_25123("color");
         if (var8 != null) {
            var7 += ((Number)var8.method_24129()).intValue() * 16;
         }

         return var7;
      } else {
         class_3446.method_15886().method_34617().warning("Received an bed color update packet, but there is no bed! O_o " + var2);
         return -1;
      }
   }

   private long method_2701(class_5287 var1) {
      return ((Integer)var1.method_24129()).longValue();
   }
}
