package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class class_5630 {
   private static String[] field_28567;
   private static class_8669<class_6325> field_28565 = method_25512(class_1893.method_8510().field_9601);
   public static class_6325 field_28568 = field_28565.method_39807(class_8606.field_44136);
   public static class_6325 field_28566 = field_28565.method_39807(class_8606.field_44089);
   public static class_6325 field_28569 = field_28565.method_39807(class_8606.field_44147);

   public static void method_25517(class_6486 var0) {
      field_28565 = method_25512(var0);
      field_28568 = field_28565.method_39807(class_8606.field_44136);
      field_28566 = field_28565.method_39807(class_8606.field_44089);
      field_28569 = field_28565.method_39807(class_8606.field_44147);
   }

   public static class_8669<class_6325> method_25512(class_6486 var0) {
      return var0 == null
         ? class_6322.method_28810().<class_6325>method_28813(class_8669.field_44359)
         : var0.method_2755().<class_6325>method_28813(class_8669.field_44359);
   }

   public static class_8669<class_6325> method_25511() {
      return field_28565;
   }

   public static class_4639 method_25510(class_6325 var0) {
      return method_25511().method_39797(var0);
   }

   public static int method_25522(class_6325 var0) {
      return method_25511().method_14041(var0);
   }

   public static int method_25521(class_4639 var0) {
      class_6325 var3 = method_25518(var0);
      return method_25511().method_14041(var3);
   }

   public static class_4859 method_25523(class_4639 var0) {
      return class_4859.method_22353(var0);
   }

   public static class_6325 method_25518(class_4639 var0) {
      return method_25511().method_39806(var0);
   }

   public static Set<class_4639> method_25515() {
      return method_25511().method_39805();
   }

   public static List<class_6325> method_25520() {
      return Lists.newArrayList(field_28565);
   }

   public static List<class_4859> method_25513() {
      return method_25514(method_25515());
   }

   public static List<class_4859> method_25514(Collection<class_4639> var0) {
      ArrayList var3 = new ArrayList();

      for (class_4639 var5 : var0) {
         class_4859 var6 = class_4859.method_22353(var5);
         if (var6 != null) {
            var3.add(var6);
         }
      }

      return var3;
   }

   public static class_6325 method_25519(class_5561 var0, class_1331 var1) {
      class_6325 var4 = field_28568;
      if (!(var0 instanceof class_1680)) {
         if (var0 instanceof class_4924) {
            var4 = ((class_4924)var0).method_22561(var1);
         }
      } else {
         var4 = ((class_1680)var0).method_7522(var1);
      }

      return var4;
   }
}
