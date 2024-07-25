package remapped;

public class class_3286 extends class_2451 implements class_9866 {
   private static String[] field_16270;

   public class_3286(class_317 var1) {
      super(var1);
      class_6451.method_29408(this, class_8228.field_42243);
   }

   public static boolean method_15061(class_6098 var0) {
      return var0.method_28026() < var0.method_27957() - 1;
   }

   @Override
   public boolean method_11223(class_6098 var1, class_6098 var2) {
      return var2.method_27960() == class_4897.field_24795;
   }

   @Override
   public class_954<class_6098> method_11231(class_6486 var1, class_704 var2, class_2584 var3) {
      class_6098 var6 = var2.method_26617(var3);
      class_6943 var7 = class_5886.method_26896(var6);
      class_6098 var8 = var2.method_26520(var7);
      if (!var8.method_28022()) {
         return class_954.<class_6098>method_4202(var6);
      } else {
         var2.method_37349(var7, var6.method_27973());
         var6.method_28017(0);
         return class_954.<class_6098>method_4208(var6, var1.method_22567());
      }
   }
}
