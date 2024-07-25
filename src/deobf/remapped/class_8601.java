package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;

public class class_8601 extends class_3956 {
   private static String[] field_44045;
   public static final class_6720 field_44047 = class_6023.field_30732;
   private static final Map<class_6163, List<class_6709>> field_44046 = new WeakHashMap<class_6163, List<class_6709>>();

   public class_8601(class_3073 var1) {
      super(var1, class_5727.field_28937);
      this.method_29284(this.field_32751.method_36446().method_10308(field_44047, Boolean.valueOf(true)));
   }

   @Override
   public void method_10760(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      for (Direction var11 : Direction.values()) {
         var2.method_29563(var3.method_6098(var11), this);
      }
   }

   @Override
   public void method_10761(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var5) {
         for (Direction var11 : Direction.values()) {
            var2.method_29563(var3.method_6098(var11), this);
         }
      }
   }

   @Override
   public int method_10766(class_2522 var1, class_6163 var2, class_1331 var3, Direction var4) {
      return var1.<Boolean>method_10313(field_44047) && Direction.field_817 != var4 ? 15 : 0;
   }

   public boolean method_39536(World var1, class_1331 var2, class_2522 var3) {
      return var1.method_29588(var2.method_6100(), Direction.field_802);
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      boolean var7 = this.method_39536(var2, var3, var1);
      List var8 = field_44046.get(var2);

      while (var8 != null && !var8.isEmpty() && var2.method_29546() - class_6709.method_30769((class_6709)var8.get(0)) > 60L) {
         var8.remove(0);
      }

      if (!var1.<Boolean>method_10313(field_44047)) {
         if (!var7 && !method_39535(var2, var3, false)) {
            var2.method_7513(var3, var1.method_10308(field_44047, Boolean.valueOf(true)), 3);
         }
      } else if (var7) {
         var2.method_7513(var3, var1.method_10308(field_44047, Boolean.valueOf(false)), 3);
         if (method_39535(var2, var3, true)) {
            var2.method_43364(1502, var3, 0);
            var2.method_28968().method_14011(var3, var2.method_28262(var3).method_8360(), 160);
         }
      }
   }

   @Override
   public void method_10801(class_2522 var1, World var2, class_1331 var3, class_6414 var4, class_1331 var5, boolean var6) {
      if (var1.<Boolean>method_10313(field_44047) == this.method_39536(var2, var3, var1) && !var2.method_43367().method_14010(var3, this)) {
         var2.method_43367().method_14011(var3, this, 2);
      }
   }

   @Override
   public int method_10778(class_2522 var1, class_6163 var2, class_1331 var3, Direction var4) {
      return var4 != Direction.field_802 ? 0 : var1.method_8327(var2, var3, var4);
   }

   @Override
   public boolean method_10771(class_2522 var1) {
      return true;
   }

   @Override
   public void method_29280(class_2522 var1, World var2, class_1331 var3, Random var4) {
      if (var1.<Boolean>method_10313(field_44047)) {
         double var7 = (double)var3.method_12173() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         double var9 = (double)var3.method_12165() + 0.7 + (var4.nextDouble() - 0.5) * 0.2;
         double var11 = (double)var3.method_12185() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         var2.method_43361(this.field_19181, var7, var9, var11, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_44047);
   }

   private static boolean method_39535(World var0, class_1331 var1, boolean var2) {
      List var5 = field_44046.computeIfAbsent(var0, var0x -> Lists.newArrayList());
      if (var2) {
         var5.add(new class_6709(var1.method_6072(), var0.method_29546()));
      }

      int var6 = 0;

      for (int var7 = 0; var7 < var5.size(); var7++) {
         class_6709 var8 = (class_6709)var5.get(var7);
         if (class_6709.method_30768(var8).equals(var1)) {
            if (++var6 >= 8) {
               return true;
            }
         }
      }

      return false;
   }
}
