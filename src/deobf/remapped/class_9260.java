package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_9260 extends class_5920<class_7666> {
   private static String[] field_47253;
   private long field_47252;

   public class_9260() {
      super(ImmutableMap.of(class_6044.field_30883, class_561.field_3320, class_6044.field_30874, class_561.field_3319));
   }

   public boolean method_42666(class_6331 var1, class_7666 var2) {
      if (var1.method_29546() - this.field_47252 >= 300L) {
         if (var1.field_33033.nextInt(2) != 0) {
            return false;
         } else {
            this.field_47252 = var1.method_29546();
            class_8150 var5 = var2.method_26525().<class_8150>method_5138(class_6044.field_30883).get();
            return var5.method_37408() == var1.method_29545() && var5.method_37409().method_12170(var2.method_37245(), 1.73);
         }
      } else {
         return false;
      }
   }

   public void method_42663(class_6331 var1, class_7666 var2, long var3) {
      class_1150 var7 = var2.method_26525();
      var7.method_5105(class_6044.field_30881, var3);
      var7.<class_8150>method_5138(class_6044.field_30883).ifPresent(var1x -> var7.method_5105(class_6044.field_30874, new class_2933(var1x.method_37409())));
      var2.method_34724();
      this.method_42665(var1, var2);
      if (var2.method_34715()) {
         var2.method_34723();
      }
   }

   public void method_42665(class_6331 var1, class_7666 var2) {
   }

   public boolean method_42664(class_6331 var1, class_7666 var2, long var3) {
      Optional var7 = var2.method_26525().<class_8150>method_5138(class_6044.field_30883);
      if (!var7.isPresent()) {
         return false;
      } else {
         class_8150 var8 = (class_8150)var7.get();
         return var8.method_37408() == var1.method_29545() && var8.method_37409().method_12170(var2.method_37245(), 1.73);
      }
   }
}
