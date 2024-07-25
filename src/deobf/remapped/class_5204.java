package remapped;

public class class_5204 implements class_5041 {
   private static final int field_26750 = 7110;
   private static final int field_26748 = 7173;
   private static final int field_26749 = 6854;
   private static final int field_26746 = 7109;

   @Override
   public int method_23214(class_1455 var1, class_5531 var2) {
      class_4081 var5 = var1.<class_4081>method_6746(class_4081.class);
      class_9371 var6 = new class_9371(
         (int)this.method_23880(var2.<class_5287>method_25123("x")),
         (short)((int)this.method_23880(var2.<class_5287>method_25123("y"))),
         (int)this.method_23880(var2.<class_5287>method_25123("z"))
      );
      if (var5.method_18811(var6)) {
         int var7 = var5.method_18809(var6).method_36355();
         class_5287 var8 = var2.<class_5287>method_25123("Base");
         int var9 = 0;
         if (var8 != null) {
            var9 = ((Number)var2.<class_5287>method_25123("Base").method_24129()).intValue();
         }

         if (var7 >= 6854 && var7 <= 7109) {
            var7 += (15 - var9) * 16;
         } else if (var7 >= 7110 && var7 <= 7173) {
            var7 += (15 - var9) * 4;
         } else {
            class_3446.method_15886().method_34617().warning("Why does this block have the banner block entity? :(" + var2);
         }

         if (var2.method_25123("Patterns") instanceof class_913) {
            for (class_5287 var11 : (class_913)var2.method_25123("Patterns")) {
               if (var11 instanceof class_5531) {
                  class_5287 var12 = ((class_5531)var11).<class_5287>method_25123("Color");
                  if (var12 instanceof class_5232) {
                     ((class_5232)var12).method_23972(15 - (Integer)var12.method_24129());
                  }
               }
            }
         }

         class_5287 var13 = var2.<class_5287>method_25123("CustomName");
         if (var13 instanceof class_887) {
            ((class_887)var13).method_3808(class_68.method_69(((class_887)var13).method_3809()));
         }

         return var7;
      } else {
         class_3446.method_15886().method_34617().warning("Received an banner color update packet, but there is no banner! O_o " + var2);
         return -1;
      }
   }

   private long method_23880(class_5287 var1) {
      return ((Integer)var1.method_24129()).longValue();
   }
}
