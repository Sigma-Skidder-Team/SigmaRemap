package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;

public class class_2931 {
   public static int method_13423(class_4382 var0, ItemStack var1) {
      if (!var1.method_28022()) {
         Identifier var4 = class_8669.field_44445.method_39797(var0);
         class_3416 var5 = var1.method_27983();

         for (int var6 = 0; var6 < var5.size(); var6++) {
            class_5734 var7 = var5.method_15764(var6);
            Identifier var8 = Identifier.method_21455(var7.method_25965("id"));
            if (var8 != null && var8.equals(var4)) {
               return class_9299.method_42829(var7.method_25947("lvl"), 0, 255);
            }
         }

         return 0;
      } else {
         return 0;
      }
   }

   public static Map<class_4382, Integer> method_13402(ItemStack var0) {
      class_3416 var3 = var0.method_27960() != class_4897.field_24879 ? var0.method_27983() : class_7597.method_34501(var0);
      return method_13409(var3);
   }

   public static Map<class_4382, Integer> method_13409(class_3416 var0) {
      LinkedHashMap var3 = Maps.newLinkedHashMap();

      for (int var4 = 0; var4 < var0.size(); var4++) {
         class_5734 var5 = var0.method_15764(var4);
         class_8669.field_44445.method_39794(Identifier.method_21455(var5.method_25965("id"))).ifPresent(var2 -> {
            Integer var5x = var3.put(var2, var5.method_25947("lvl"));
         });
      }

      return var3;
   }

   public static void method_13398(Map<class_4382, Integer> var0, ItemStack var1) {
      class_3416 var4 = new class_3416();

      for (Entry var6 : var0.entrySet()) {
         class_4382 var7 = (class_4382)var6.getKey();
         if (var7 != null) {
            int var8 = (Integer)var6.getValue();
            class_5734 var9 = new class_5734();
            var9.method_25941("id", String.valueOf(class_8669.field_44445.method_39797(var7)));
            var9.method_25958("lvl", (short)var8);
            var4.add(var9);
            if (var1.method_27960() == class_4897.field_24879) {
               class_7597.method_34503(var1, new class_9693(var7, var8));
            }
         }
      }

      if (!var4.isEmpty()) {
         if (var1.method_27960() != class_4897.field_24879) {
            var1.method_27954("Enchantments", var4);
         }
      } else {
         var1.method_27976("Enchantments");
      }
   }

   private static void method_13422(class_4800 var0, ItemStack var1) {
      if (!var1.method_28022()) {
         class_3416 var4 = var1.method_27983();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            String var6 = var4.method_15764(var5).method_25965("id");
            int var7 = var4.method_15764(var5).method_25947("lvl");
            class_8669.field_44445.method_39794(Identifier.method_21455(var6)).ifPresent(var2 -> var0.method_22120(var2, var7));
         }
      }
   }

   private static void method_13416(class_4800 var0, Iterable<ItemStack> var1) {
      for (ItemStack var5 : var1) {
         method_13422(var0, var5);
      }
   }

   public static int method_13427(Iterable<ItemStack> var0, class_6199 var1) {
      MutableInt var4 = new MutableInt();
      method_13416((var2, var3) -> var4.add(var2.method_20438(var3, var1)), var0);
      return var4.intValue();
   }

   public static float method_13425(ItemStack var0, class_2780 var1) {
      MutableFloat var4 = new MutableFloat();
      method_13422((var2, var3) -> var4.add(var2.method_20419(var3, var1)), var0);
      return var4.floatValue();
   }

   public static float method_13405(class_5834 var0) {
      int var3 = method_13399(class_3668.field_17858, var0);
      return var3 <= 0 ? 0.0F : class_6317.method_28789(var3);
   }

   public static void method_13429(class_5834 var0, Entity var1) {
      class_4800 var4 = (var2, var3) -> var2.method_20427(var0, var1, var3);
      if (var0 != null) {
         method_13416(var4, var0.method_37342());
      }

      if (var1 instanceof class_704) {
         method_13422(var4, var0.method_26446());
      }
   }

   public static void method_13406(class_5834 var0, Entity var1) {
      class_4800 var4 = (var2, var3) -> var2.method_20421(var0, var1, var3);
      if (var0 != null) {
         method_13416(var4, var0.method_37342());
      }

      if (var0 instanceof class_704) {
         method_13422(var4, var0.method_26446());
      }
   }

   public static int method_13399(class_4382 var0, class_5834 var1) {
      Collection var4 = var0.method_20420(var1).values();
      if (var4 != null) {
         int var5 = 0;

         for (ItemStack var7 : var4) {
            int var8 = method_13423(var0, var7);
            if (var8 > var5) {
               var5 = var8;
            }
         }

         return var5;
      } else {
         return 0;
      }
   }

   public static int method_13433(class_5834 var0) {
      return method_13399(class_3668.field_17851, var0);
   }

   public static int method_13410(class_5834 var0) {
      return method_13399(class_3668.field_17868, var0);
   }

   public static int method_13430(class_5834 var0) {
      return method_13399(class_3668.field_17865, var0);
   }

   public static int method_13417(class_5834 var0) {
      return method_13399(class_3668.field_17869, var0);
   }

   public static int method_13414(class_5834 var0) {
      return method_13399(class_3668.field_17879, var0);
   }

   public static int method_13400(ItemStack var0) {
      return method_13423(class_3668.field_17877, var0);
   }

   public static int method_13401(ItemStack var0) {
      return method_13423(class_3668.field_17852, var0);
   }

   public static int method_13397(class_5834 var0) {
      return method_13399(class_3668.field_17873, var0);
   }

   public static boolean method_13403(class_5834 var0) {
      return method_13399(class_3668.field_17847, var0) > 0;
   }

   public static boolean method_13407(class_5834 var0) {
      return method_13399(class_3668.field_17848, var0) > 0;
   }

   public static boolean method_13411(class_5834 var0) {
      return method_13399(class_3668.field_17849, var0) > 0;
   }

   public static boolean method_13421(ItemStack var0) {
      return method_13423(class_3668.field_17856, var0) > 0;
   }

   public static boolean method_13408(ItemStack var0) {
      return method_13423(class_3668.field_17854, var0) > 0;
   }

   public static int method_13431(ItemStack var0) {
      return method_13423(class_3668.field_17863, var0);
   }

   public static int method_13415(ItemStack var0) {
      return method_13423(class_3668.field_17866, var0);
   }

   public static boolean method_13424(ItemStack var0) {
      return method_13423(class_3668.field_17862, var0) > 0;
   }

   @Nullable
   public static Entry<class_6943, ItemStack> method_13412(class_4382 var0, class_5834 var1) {
      return method_13413(var0, var1, var0x -> true);
   }

   @Nullable
   public static Entry<class_6943, ItemStack> method_13413(class_4382 var0, class_5834 var1, Predicate<ItemStack> var2) {
      Map var5 = var0.method_20420(var1);
      if (!var5.isEmpty()) {
         ArrayList var6 = Lists.newArrayList();

         for (Entry var8 : var5.entrySet()) {
            ItemStack var9 = (ItemStack)var8.getValue();
            if (!var9.method_28022() && method_13423(var0, var9) > 0 && var2.test(var9)) {
               var6.add(var8);
            }
         }

         return !var6.isEmpty() ? (Entry)var6.get(var1.method_26594().nextInt(var6.size())) : null;
      } else {
         return null;
      }
   }

   public static int method_13432(Random var0, int var1, int var2, ItemStack var3) {
      class_2451 var6 = var3.method_27960();
      int var7 = var6.method_11213();
      if (var7 > 0) {
         if (var2 > 15) {
            var2 = 15;
         }

         int var8 = var0.nextInt(8) + 1 + (var2 >> 1) + var0.nextInt(var2 + 1);
         if (var1 != 0) {
            return var1 != 1 ? Math.max(var8, var2 * 2) : var8 * 2 / 3 + 1;
         } else {
            return Math.max(var8 / 3, 1);
         }
      } else {
         return 0;
      }
   }

   public static ItemStack method_13426(Random var0, ItemStack var1, int var2, boolean var3) {
      List var6 = method_13420(var0, var1, var2, var3);
      boolean var7 = var1.method_27960() == class_4897.field_24551;
      if (var7) {
         var1 = new ItemStack(class_4897.field_24879);
      }

      for (class_9693 var9 : var6) {
         if (!var7) {
            var1.method_28031(var9.field_49312, var9.field_49313);
         } else {
            class_7597.method_34503(var1, var9);
         }
      }

      return var1;
   }

   public static List<class_9693> method_13420(Random var0, ItemStack var1, int var2, boolean var3) {
      ArrayList var6 = Lists.newArrayList();
      class_2451 var7 = var1.method_27960();
      int var8 = var7.method_11213();
      if (var8 <= 0) {
         return var6;
      } else {
         var2 = var2 + 1 + var0.nextInt(var8 / 4 + 1) + var0.nextInt(var8 / 4 + 1);
         float var9 = (var0.nextFloat() + var0.nextFloat() - 1.0F) * 0.15F;
         var2 = class_9299.method_42829(Math.round((float)var2 + (float)var2 * var9), 1, Integer.MAX_VALUE);
         List var10 = method_13404(var2, var1, var3);
         if (!var10.isEmpty()) {
            var6.add(class_6242.<class_1047>method_28510(var0, var10));

            while (var0.nextInt(50) <= var2) {
               method_13418(var10, Util.<class_9693>method_44651(var6));
               if (var10.isEmpty()) {
                  break;
               }

               var6.add(class_6242.<class_1047>method_28510(var0, var10));
               var2 /= 2;
            }
         }

         return var6;
      }
   }

   public static void method_13418(List<class_9693> var0, class_9693 var1) {
      Iterator var4 = var0.iterator();

      while (var4.hasNext()) {
         if (!var1.field_49312.method_20422(((class_9693)var4.next()).field_49312)) {
            var4.remove();
         }
      }
   }

   public static boolean method_13428(Collection<class_4382> var0, class_4382 var1) {
      for (class_4382 var5 : var0) {
         if (!var5.method_20422(var1)) {
            return false;
         }
      }

      return true;
   }

   public static List<class_9693> method_13404(int var0, ItemStack var1, boolean var2) {
      ArrayList var5 = Lists.newArrayList();
      class_2451 var6 = var1.method_27960();
      boolean var7 = var1.method_27960() == class_4897.field_24551;

      for (class_4382 var9 : class_8669.field_44445) {
         if ((!var9.method_20429() || var2) && var9.method_20434() && (var9.field_21496.method_40057(var6) || var7)) {
            for (int var10 = var9.method_20417(); var10 > var9.method_20425() - 1; var10--) {
               if (var0 >= var9.method_20433(var10) && var0 <= var9.method_20437(var10)) {
                  var5.add(new class_9693(var9, var10));
                  break;
               }
            }
         }
      }

      return var5;
   }
}
