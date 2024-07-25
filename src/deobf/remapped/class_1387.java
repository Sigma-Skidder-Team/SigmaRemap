package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class class_1387 {
   private static final List<class_7119<class_6004>> field_7568 = Lists.newArrayList();
   private static final List<class_7119<class_2451>> field_7569 = Lists.newArrayList();
   private static final List<class_8137> field_7572 = Lists.newArrayList();
   private static final Predicate<class_6098> field_7571 = var0 -> {
      for (class_8137 var4 : field_7572) {
         if (var4.test(var0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean method_6428(class_6098 var0) {
      return method_6420(var0) || method_6423(var0);
   }

   public static boolean method_6420(class_6098 var0) {
      int var3 = 0;

      for (int var4 = field_7569.size(); var3 < var4; var3++) {
         if (class_7119.method_32719(field_7569.get(var3)).test(var0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean method_6423(class_6098 var0) {
      int var3 = 0;

      for (int var4 = field_7568.size(); var3 < var4; var3++) {
         if (class_7119.method_32719(field_7568.get(var3)).test(var0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean method_6419(class_6004 var0) {
      int var3 = 0;

      for (int var4 = field_7568.size(); var3 < var4; var3++) {
         if (class_7119.method_32718(field_7568.get(var3)) == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean method_6426(class_6098 var0, class_6098 var1) {
      return !field_7571.test(var0) ? false : method_6427(var0, var1) || method_6424(var0, var1);
   }

   public static boolean method_6427(class_6098 var0, class_6098 var1) {
      class_2451 var4 = var0.method_27960();
      int var5 = 0;

      for (int var6 = field_7569.size(); var5 < var6; var5++) {
         class_7119 var7 = field_7569.get(var5);
         if (class_7119.method_32720(var7) == var4 && class_7119.method_32719(var7).test(var1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean method_6424(class_6098 var0, class_6098 var1) {
      class_6004 var4 = class_9541.method_43990(var0);
      int var5 = 0;

      for (int var6 = field_7568.size(); var5 < var6; var5++) {
         class_7119 var7 = field_7568.get(var5);
         if (class_7119.method_32720(var7) == var4 && class_7119.method_32719(var7).test(var1)) {
            return true;
         }
      }

      return false;
   }

   public static class_6098 method_6422(class_6098 var0, class_6098 var1) {
      if (!var1.method_28022()) {
         class_6004 var4 = class_9541.method_43990(var1);
         class_2451 var5 = var1.method_27960();
         int var6 = 0;

         for (int var7 = field_7569.size(); var6 < var7; var6++) {
            class_7119 var8 = field_7569.get(var6);
            if (class_7119.method_32720(var8) == var5 && class_7119.method_32719(var8).test(var0)) {
               return class_9541.method_43999(new class_6098((class_8525)class_7119.method_32718(var8)), var4);
            }
         }

         var6 = 0;

         for (int var10 = field_7568.size(); var6 < var10; var6++) {
            class_7119 var11 = field_7568.get(var6);
            if (class_7119.method_32720(var11) == var4 && class_7119.method_32719(var11).test(var0)) {
               return class_9541.method_43999(new class_6098(var5), (class_6004)class_7119.method_32718(var11));
            }
         }
      }

      return var1;
   }

   public static void method_6425() {
      method_6421(class_4897.field_25157);
      method_6421(class_4897.field_25226);
      method_6421(class_4897.field_24444);
      method_6418(class_4897.field_25157, class_4897.field_24581, class_4897.field_25226);
      method_6418(class_4897.field_25226, class_4897.field_25220, class_4897.field_24444);
      method_6417(class_3697.field_18108, class_4897.field_24459, class_3697.field_18146);
      method_6417(class_3697.field_18108, class_4897.field_24831, class_3697.field_18146);
      method_6417(class_3697.field_18108, class_4897.field_24730, class_3697.field_18146);
      method_6417(class_3697.field_18108, class_4897.field_24348, class_3697.field_18146);
      method_6417(class_3697.field_18108, class_4897.field_24764, class_3697.field_18146);
      method_6417(class_3697.field_18108, class_4897.field_24344, class_3697.field_18146);
      method_6417(class_3697.field_18108, class_4897.field_24675, class_3697.field_18146);
      method_6417(class_3697.field_18108, class_4897.field_24777, class_3697.field_18110);
      method_6417(class_3697.field_18108, class_4897.field_24791, class_3697.field_18146);
      method_6417(class_3697.field_18108, class_4897.field_24573, class_3697.field_18140);
      method_6417(class_3697.field_18140, class_4897.field_25070, class_3697.field_18141);
      method_6417(class_3697.field_18141, class_4897.field_24791, class_3697.field_18133);
      method_6417(class_3697.field_18141, class_4897.field_25130, class_3697.field_18126);
      method_6417(class_3697.field_18133, class_4897.field_25130, class_3697.field_18119);
      method_6417(class_3697.field_18126, class_4897.field_24791, class_3697.field_18119);
      method_6417(class_3697.field_18140, class_4897.field_24675, class_3697.field_18121);
      method_6417(class_3697.field_18121, class_4897.field_24791, class_3697.field_18128);
      method_6417(class_3697.field_18140, class_4897.field_24730, class_3697.field_18122);
      method_6417(class_3697.field_18122, class_4897.field_24791, class_3697.field_18150);
      method_6417(class_3697.field_18122, class_4897.field_24777, class_3697.field_18124);
      method_6417(class_3697.field_18122, class_4897.field_25130, class_3697.field_18113);
      method_6417(class_3697.field_18150, class_4897.field_25130, class_3697.field_18131);
      method_6417(class_3697.field_18113, class_4897.field_24791, class_3697.field_18131);
      method_6417(class_3697.field_18113, class_4897.field_24777, class_3697.field_18137);
      method_6417(class_3697.field_18140, class_4897.field_25139, class_3697.field_18147);
      method_6417(class_3697.field_18147, class_4897.field_24791, class_3697.field_18132);
      method_6417(class_3697.field_18147, class_4897.field_24777, class_3697.field_18109);
      method_6417(class_3697.field_18143, class_4897.field_25130, class_3697.field_18113);
      method_6417(class_3697.field_18130, class_4897.field_25130, class_3697.field_18131);
      method_6417(class_3697.field_18140, class_4897.field_24344, class_3697.field_18143);
      method_6417(class_3697.field_18143, class_4897.field_24791, class_3697.field_18130);
      method_6417(class_3697.field_18143, class_4897.field_24777, class_3697.field_18151);
      method_6417(class_3697.field_18140, class_4897.field_24728, class_3697.field_18136);
      method_6417(class_3697.field_18136, class_4897.field_24791, class_3697.field_18139);
      method_6417(class_3697.field_18140, class_4897.field_24459, class_3697.field_18117);
      method_6417(class_3697.field_18117, class_4897.field_24777, class_3697.field_18115);
      method_6417(class_3697.field_18117, class_4897.field_25130, class_3697.field_18138);
      method_6417(class_3697.field_18115, class_4897.field_25130, class_3697.field_18120);
      method_6417(class_3697.field_18138, class_4897.field_24777, class_3697.field_18120);
      method_6417(class_3697.field_18125, class_4897.field_25130, class_3697.field_18138);
      method_6417(class_3697.field_18142, class_4897.field_25130, class_3697.field_18138);
      method_6417(class_3697.field_18114, class_4897.field_25130, class_3697.field_18120);
      method_6417(class_3697.field_18140, class_4897.field_24764, class_3697.field_18125);
      method_6417(class_3697.field_18125, class_4897.field_24791, class_3697.field_18142);
      method_6417(class_3697.field_18125, class_4897.field_24777, class_3697.field_18114);
      method_6417(class_3697.field_18140, class_4897.field_24831, class_3697.field_18129);
      method_6417(class_3697.field_18129, class_4897.field_24791, class_3697.field_18111);
      method_6417(class_3697.field_18129, class_4897.field_24777, class_3697.field_18116);
      method_6417(class_3697.field_18140, class_4897.field_24348, class_3697.field_18144);
      method_6417(class_3697.field_18144, class_4897.field_24791, class_3697.field_18145);
      method_6417(class_3697.field_18144, class_4897.field_24777, class_3697.field_18118);
      method_6417(class_3697.field_18108, class_4897.field_25130, class_3697.field_18112);
      method_6417(class_3697.field_18112, class_4897.field_24791, class_3697.field_18135);
      method_6417(class_3697.field_18140, class_4897.field_24795, class_3697.field_18149);
      method_6417(class_3697.field_18149, class_4897.field_24791, class_3697.field_18127);
   }

   private static void method_6418(class_2451 var0, class_2451 var1, class_2451 var2) {
      if (var0 instanceof class_5518) {
         if (var2 instanceof class_5518) {
            field_7569.add(new class_7119<class_2451>(var0, class_8137.method_37019(var1), var2));
         } else {
            throw new IllegalArgumentException("Expected a potion, got: " + class_8669.field_44382.method_39797(var2));
         }
      } else {
         throw new IllegalArgumentException("Expected a potion, got: " + class_8669.field_44382.method_39797(var0));
      }
   }

   private static void method_6421(class_2451 var0) {
      if (var0 instanceof class_5518) {
         field_7572.add(class_8137.method_37019(var0));
      } else {
         throw new IllegalArgumentException("Expected a potion, got: " + class_8669.field_44382.method_39797(var0));
      }
   }

   private static void method_6417(class_6004 var0, class_2451 var1, class_6004 var2) {
      field_7568.add(new class_7119<class_6004>(var0, class_8137.method_37019(var1), var2));
   }
}
