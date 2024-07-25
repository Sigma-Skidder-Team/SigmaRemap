package remapped;

public class class_7166 extends class_2451 {
   private static String[] field_36877;

   public class_7166(class_317 var1) {
      super(var1);
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      World var4 = var1.method_21862();
      class_1331 var5 = var1.method_21858();
      class_2522 var6 = var4.method_28262(var5);
      if (!var6.method_8350(class_4783.field_23491) || var6.<Boolean>method_10313(class_7863.field_40260)) {
         return class_6910.field_35521;
      } else if (var4.field_33055) {
         return class_6910.field_35520;
      } else {
         class_2522 var7 = var6.method_10308(class_7863.field_40260, Boolean.valueOf(true));
         class_6414.method_29277(var6, var7, var4, var5);
         var4.method_7513(var5, var7, 2);
         var4.method_29523(var5, class_4783.field_23491);
         var1.method_21867().method_27970(1);
         var4.method_43364(1503, var5, 0);
         class_6953 var8 = class_7863.method_35600().method_44981(var4, var5);
         if (var8 != null) {
            class_1331 var9 = var8.method_31798().method_6104(-3, 0, -3);

            for (int var10 = 0; var10 < 3; var10++) {
               for (int var11 = 0; var11 < 3; var11++) {
                  var4.method_7513(var9.method_6104(var10, 0, var11), class_4783.field_23258.method_29260(), 2);
               }
            }

            var4.method_29589(1038, var9.method_6104(1, 0, 1), 0);
         }

         return class_6910.field_35518;
      }
   }

   @Override
   public class_954<class_6098> method_11231(World var1, class_704 var2, class_2584 var3) {
      class_6098 var6 = var2.method_26617(var3);
      class_9529 var7 = method_11238(var1, var2, class_9583.field_48747);
      if (var7.method_33990() == class_1430.field_7717 && var1.method_28262(var7.method_43955()).method_8350(class_4783.field_23491)) {
         return class_954.<class_6098>method_4207(var6);
      } else {
         var2.method_26462(var3);
         if (var1 instanceof class_6331) {
            class_1331 var8 = ((class_6331)var1)
               .method_28945()
               .method_10189()
               .method_29820((class_6331)var1, class_5390.field_27511, var2.method_37075(), 100, false);
            if (var8 != null) {
               class_7483 var9 = new class_7483(var1, var2.method_37302(), var2.method_37080(0.5), var2.method_37156());
               var9.method_34038(var6);
               var9.method_34037(var8);
               var1.method_7509(var9);
               if (var2 instanceof class_9359) {
                  class_8807.field_45080.method_23185((class_9359)var2, var8);
               }

               var1.method_29528(
                  (class_704)null,
                  var2.method_37302(),
                  var2.method_37309(),
                  var2.method_37156(),
                  class_463.field_1994,
                  class_562.field_3328,
                  0.5F,
                  0.4F / (field_12172.nextFloat() * 0.4F + 0.8F)
               );
               var1.method_43365((class_704)null, 1003, var2.method_37075(), 0);
               if (!var2.field_3876.field_4944) {
                  var6.method_27970(1);
               }

               var2.method_3211(class_6234.field_31907.method_43790(this));
               var2.method_26488(var3, true);
               return class_954.<class_6098>method_4205(var6);
            }
         }

         return class_954.<class_6098>method_4206(var6);
      }
   }
}
