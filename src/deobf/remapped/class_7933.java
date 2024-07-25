package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class class_7933 extends class_8346 implements class_372, class_9031, class_3957, class_3745 {
   private static final int[] field_40585 = new int[]{0};
   private static final int[] field_40583 = new int[]{2, 1};
   private static final int[] field_40578 = new int[]{1};
   public class_2831<class_6098> field_40579 = class_2831.<class_6098>method_12872(3, class_6098.field_31203);
   private int field_40584;
   private int field_40587;
   private int field_40582;
   private int field_40577;
   public final class_6844 field_40580 = new class_7306(this);
   private final Object2IntOpenHashMap<class_4639> field_40586 = new Object2IntOpenHashMap();
   public final class_1510<? extends class_3151> field_40581;

   public class_7933(class_133<?> var1, class_1510<? extends class_3151> var2) {
      super(var1);
      this.field_40581 = var2;
   }

   public static Map<class_2451, Integer> method_35878() {
      LinkedHashMap var2 = Maps.newLinkedHashMap();
      method_35877(var2, class_4897.field_24938, 20000);
      method_35877(var2, class_4783.field_23580, 16000);
      method_35877(var2, class_4897.field_25294, 2400);
      method_35877(var2, class_4897.field_24917, 1600);
      method_35877(var2, class_4897.field_24862, 1600);
      method_35864(var2, class_391.field_1638, 300);
      method_35864(var2, class_391.field_1605, 300);
      method_35864(var2, class_391.field_1630, 300);
      method_35864(var2, class_391.field_1596, 150);
      method_35864(var2, class_391.field_1617, 300);
      method_35864(var2, class_391.field_1645, 300);
      method_35877(var2, class_4783.field_23778, 300);
      method_35877(var2, class_4783.field_23703, 300);
      method_35877(var2, class_4783.field_23792, 300);
      method_35877(var2, class_4783.field_23694, 300);
      method_35877(var2, class_4783.field_23499, 300);
      method_35877(var2, class_4783.field_23915, 300);
      method_35877(var2, class_4783.field_23753, 300);
      method_35877(var2, class_4783.field_23391, 300);
      method_35877(var2, class_4783.field_23322, 300);
      method_35877(var2, class_4783.field_23234, 300);
      method_35877(var2, class_4783.field_23697, 300);
      method_35877(var2, class_4783.field_23618, 300);
      method_35877(var2, class_4783.field_23472, 300);
      method_35877(var2, class_4783.field_23313, 300);
      method_35877(var2, class_4783.field_23566, 300);
      method_35877(var2, class_4783.field_23312, 300);
      method_35877(var2, class_4783.field_23471, 300);
      method_35877(var2, class_4783.field_23739, 300);
      method_35877(var2, class_4783.field_23794, 300);
      method_35877(var2, class_4783.field_23220, 300);
      method_35864(var2, class_391.field_1604, 300);
      method_35877(var2, class_4897.field_25206, 300);
      method_35877(var2, class_4897.field_24505, 300);
      method_35877(var2, class_4783.field_23748, 300);
      method_35864(var2, class_391.field_1640, 200);
      method_35877(var2, class_4897.field_24809, 200);
      method_35877(var2, class_4897.field_25211, 200);
      method_35877(var2, class_4897.field_24438, 200);
      method_35877(var2, class_4897.field_25168, 200);
      method_35877(var2, class_4897.field_24595, 200);
      method_35864(var2, class_391.field_1600, 200);
      method_35864(var2, class_391.field_1634, 1200);
      method_35864(var2, class_391.field_1597, 100);
      method_35864(var2, class_391.field_1609, 100);
      method_35877(var2, class_4897.field_24413, 100);
      method_35864(var2, class_391.field_1631, 100);
      method_35877(var2, class_4897.field_24454, 100);
      method_35864(var2, class_391.field_1619, 67);
      method_35877(var2, class_4783.field_23848, 4001);
      method_35877(var2, class_4897.field_25030, 300);
      method_35877(var2, class_4783.field_23886, 50);
      method_35877(var2, class_4783.field_23254, 100);
      method_35877(var2, class_4783.field_23348, 400);
      method_35877(var2, class_4783.field_23853, 300);
      method_35877(var2, class_4783.field_23641, 300);
      method_35877(var2, class_4783.field_23431, 300);
      method_35877(var2, class_4783.field_23280, 300);
      method_35877(var2, class_4783.field_23646, 300);
      method_35877(var2, class_4783.field_23274, 300);
      return var2;
   }

   private static boolean method_35876(class_2451 var0) {
      return class_391.field_1639.method_10609(var0);
   }

   private static void method_35864(Map<class_2451, Integer> var0, class_2307<class_2451> var1, int var2) {
      for (class_2451 var6 : var1.method_10608()) {
         if (!method_35876(var6)) {
            var0.put(var6, var2);
         }
      }
   }

   private static void method_35877(Map<class_2451, Integer> var0, class_8525 var1, int var2) {
      class_2451 var5 = var1.method_10803();
      if (!method_35876(var5)) {
         var0.put(var5, var2);
      } else if (class_7665.field_38958) {
         throw (IllegalStateException) Util.method_44658(
            new IllegalStateException(
               "A developer tried to explicitly make fire resistant item "
                  + var5.method_11249((class_6098)null).getString()
                  + " a furnace fuel. That will not work!"
            )
         );
      }
   }

   private boolean method_35865() {
      return this.field_40584 > 0;
   }

   @Override
   public void method_17394(class_2522 var1, class_5734 var2) {
      super.method_17394(var1, var2);
      this.field_40579 = class_2831.<class_6098>method_12872(this.method_31505(), class_6098.field_31203);
      class_3037.method_13882(var2, this.field_40579);
      this.field_40584 = var2.method_25956("BurnTime");
      this.field_40582 = var2.method_25956("CookTime");
      this.field_40577 = var2.method_25956("CookTimeTotal");
      this.field_40587 = this.method_35874(this.field_40579.get(1));
      class_5734 var5 = var2.method_25937("RecipesUsed");

      for (String var7 : var5.method_25952()) {
         this.field_40586.put(new class_4639(var7), var5.method_25947(var7));
      }
   }

   @Override
   public class_5734 method_17396(class_5734 var1) {
      super.method_17396(var1);
      var1.method_25958("BurnTime", (short)this.field_40584);
      var1.method_25958("CookTime", (short)this.field_40582);
      var1.method_25958("CookTimeTotal", (short)this.field_40577);
      class_3037.method_13878(var1, this.field_40579);
      class_5734 var4 = new class_5734();
      this.field_40586.forEach((var1x, var2) -> var4.method_25931(var1x.toString(), var2));
      var1.method_25946("RecipesUsed", var4);
      return var1;
   }

   @Override
   public void method_17353() {
      boolean var3 = this.method_35865();
      boolean var4 = false;
      if (this.method_35865()) {
         this.field_40584--;
      }

      if (!this.field_18364.field_33055) {
         class_6098 var5 = this.field_40579.get(1);
         if (this.method_35865() || !var5.method_28022() && !this.field_40579.get(0).method_28022()) {
            class_8932 var6 = this.field_18364.method_29549().method_23138(this.field_40581, this, this.field_18364).orElse(null);
            if (!this.method_35865() && this.method_35867(var6)) {
               this.field_40584 = this.method_35874(var5);
               this.field_40587 = this.field_40584;
               if (this.method_35865()) {
                  var4 = true;
                  if (!var5.method_28022()) {
                     class_2451 var7 = var5.method_27960();
                     var5.method_27970(1);
                     if (var5.method_28022()) {
                        class_2451 var8 = var7.method_11241();
                        this.field_40579.set(1, var8 != null ? new class_6098(var8) : class_6098.field_31203);
                     }
                  }
               }
            }

            if (this.method_35865() && this.method_35867(var6)) {
               this.field_40582++;
               if (this.field_40582 == this.field_40577) {
                  this.field_40582 = 0;
                  this.field_40577 = this.method_35863();
                  this.method_35883(var6);
                  var4 = true;
               }
            } else {
               this.field_40582 = 0;
            }
         } else if (!this.method_35865() && this.field_40582 > 0) {
            this.field_40582 = class_9299.method_42829(this.field_40582 - 2, 0, this.field_40577);
         }

         if (var3 != this.method_35865()) {
            var4 = true;
            this.field_18364
               .method_7513(
                  this.field_18358,
                  this.field_18364.method_28262(this.field_18358).method_10308(class_3793.field_18522, Boolean.valueOf(this.method_35865())),
                  3
               );
         }
      }

      if (var4) {
         this.method_17407();
      }
   }

   public boolean method_35867(class_8932<?> var1) {
      if (!this.field_40579.get(0).method_28022() && var1 != null) {
         class_6098 var4 = var1.method_41044();
         if (!var4.method_28022()) {
            class_6098 var5 = this.field_40579.get(2);
            if (var5.method_28022()) {
               return true;
            } else if (var5.method_27991(var4)) {
               return var5.method_27997() < this.method_31506() && var5.method_27997() < var5.method_28016() ? true : var5.method_27997() < var4.method_28016();
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void method_35883(class_8932<?> var1) {
      if (var1 != null && this.method_35867(var1)) {
         class_6098 var4 = this.field_40579.get(0);
         class_6098 var5 = var1.method_41044();
         class_6098 var6 = this.field_40579.get(2);
         if (!var6.method_28022()) {
            if (var6.method_27960() == var5.method_27960()) {
               var6.method_28030(1);
            }
         } else {
            this.field_40579.set(2, var5.method_27973());
         }

         if (!this.field_18364.field_33055) {
            this.method_41427(var1);
         }

         if (var4.method_27960() == class_4783.field_23172.method_10803()
            && !this.field_40579.get(1).method_28022()
            && this.field_40579.get(1).method_27960() == class_4897.field_24548) {
            this.field_40579.set(1, new class_6098(class_4897.field_24999));
         }

         var4.method_27970(1);
      }
   }

   public int method_35874(class_6098 var1) {
      if (!var1.method_28022()) {
         class_2451 var4 = var1.method_27960();
         return method_35878().getOrDefault(var4, 0);
      } else {
         return 0;
      }
   }

   public int method_35863() {
      return this.field_18364.method_29549().method_23138(this.field_40581, this, this.field_18364).<Integer>map(class_3151::method_14546).orElse(200);
   }

   public static boolean method_35873(class_6098 var0) {
      return method_35878().containsKey(var0.method_27960());
   }

   @Override
   public int[] method_1832(class_240 var1) {
      if (var1 != class_240.field_802) {
         return var1 != class_240.field_817 ? field_40578 : field_40585;
      } else {
         return field_40583;
      }
   }

   @Override
   public boolean method_1834(int var1, class_6098 var2, class_240 var3) {
      return this.method_31500(var1, var2);
   }

   @Override
   public boolean method_1833(int var1, class_6098 var2, class_240 var3) {
      if (var3 == class_240.field_802 && var1 == 1) {
         class_2451 var6 = var2.method_27960();
         if (var6 != class_4897.field_24999 && var6 != class_4897.field_24548) {
            return false;
         }
      }

      return true;
   }

   @Override
   public int method_31505() {
      return this.field_40579.size();
   }

   @Override
   public boolean method_31495() {
      for (class_6098 var4 : this.field_40579) {
         if (!var4.method_28022()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public class_6098 method_31498(int var1) {
      return this.field_40579.get(var1);
   }

   @Override
   public class_6098 method_31497(int var1, int var2) {
      return class_3037.method_13881(this.field_40579, var1, var2);
   }

   @Override
   public class_6098 method_31507(int var1) {
      return class_3037.method_13880(this.field_40579, var1);
   }

   @Override
   public void method_31503(int var1, class_6098 var2) {
      class_6098 var5 = this.field_40579.get(var1);
      boolean var6 = !var2.method_28022() && var2.method_27991(var5) && class_6098.method_27956(var2, var5);
      this.field_40579.set(var1, var2);
      if (var2.method_27997() > this.method_31506()) {
         var2.method_28017(this.method_31506());
      }

      if (var1 == 0 && !var6) {
         this.field_40577 = this.method_35863();
         this.field_40582 = 0;
         this.method_17407();
      }
   }

   @Override
   public boolean method_31502(class_704 var1) {
      return this.field_18364.method_28260(this.field_18358) == this
         ? var1.method_37273(
               (double)this.field_18358.method_12173() + 0.5, (double)this.field_18358.method_12165() + 0.5, (double)this.field_18358.method_12185() + 0.5
            )
            <= 64.0
         : false;
   }

   @Override
   public boolean method_31500(int var1, class_6098 var2) {
      if (var1 != 2) {
         if (var1 != 1) {
            return true;
         } else {
            class_6098 var5 = this.field_40579.get(1);
            return method_35873(var2) || var2.method_27960() == class_4897.field_24548 && var5.method_27960() != class_4897.field_24548;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_24975() {
      this.field_40579.clear();
   }

   @Override
   public void method_41427(class_8932<?> var1) {
      if (var1 != null) {
         class_4639 var4 = var1.method_41050();
         this.field_40586.addTo(var4, 1);
      }
   }

   @Nullable
   @Override
   public class_8932<?> method_41426() {
      return null;
   }

   @Override
   public void method_41424(class_704 var1) {
   }

   public void method_35869(class_704 var1) {
      List var4 = this.method_35879(var1.field_41768, var1.method_37245());
      var1.method_3223(var4);
      this.field_40586.clear();
   }

   public List<class_8932<?>> method_35879(class_6486 var1, class_1343 var2) {
      ArrayList var5 = Lists.newArrayList();
      ObjectIterator var6 = this.field_40586.object2IntEntrySet().iterator();

      while (var6.hasNext()) {
         Entry var7 = (Entry)var6.next();
         var1.method_29549().method_23139((class_4639)var7.getKey()).ifPresent(var4 -> {
            var5.add(var4);
            method_35868(var1, var2, var7.getIntValue(), ((class_3151)var4).method_14548());
         });
      }

      return var5;
   }

   private static void method_35868(class_6486 var0, class_1343 var1, int var2, float var3) {
      int var6 = class_9299.method_42848((float)var2 * var3);
      float var7 = class_9299.method_42823((float)var2 * var3);
      if (var7 != 0.0F && Math.random() < (double)var7) {
         var6++;
      }

      while (var6 > 0) {
         int var8 = class_5614.method_25476(var6);
         var6 -= var8;
         var0.method_7509(new class_5614(var0, var1.field_7336, var1.field_7333, var1.field_7334, var8));
      }
   }

   @Override
   public void method_18279(class_534 var1) {
      for (class_6098 var5 : this.field_40579) {
         var1.method_2598(var5);
      }
   }
}
