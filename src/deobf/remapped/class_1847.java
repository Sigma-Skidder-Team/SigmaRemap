package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class class_1847 extends class_5920<class_7666> {
   private static String[] field_9375;
   private Set<class_2451> field_9376 = ImmutableSet.of();

   public class_1847() {
      super(ImmutableMap.of(class_6044.field_30861, class_561.field_3320, class_6044.field_30901, class_561.field_3320));
   }

   public boolean method_8168(class_6331 var1, class_7666 var2) {
      return class_1225.method_5450(var2.method_26525(), class_6044.field_30861, class_6629.field_34276);
   }

   public boolean method_8167(class_6331 var1, class_7666 var2, long var3) {
      return this.method_8168(var1, var2);
   }

   public void method_8164(class_6331 var1, class_7666 var2, long var3) {
      class_7666 var7 = (class_7666)var2.method_26525().<class_5834>method_5138(class_6044.field_30861).get();
      class_1225.method_5443(var2, var7, 0.5F);
      this.field_9376 = method_8169(var2, var7);
   }

   public void method_8163(class_6331 var1, class_7666 var2, long var3) {
      class_7666 var7 = (class_7666)var2.method_26525().<class_5834>method_5138(class_6044.field_30861).get();
      if (!(var2.method_37275(var7) > 5.0)) {
         class_1225.method_5443(var2, var7, 0.5F);
         var2.method_34717(var1, var7, var3);
         if (var2.method_34695() && (var2.method_15891().method_13910() == class_4466.field_21783 || var7.method_34696())) {
            method_8166(var2, class_7666.field_38968.keySet(), var7);
         }

         if (var7.method_15891().method_13910() == class_4466.field_21783
            && var2.method_2017().method_31504(class_4897.field_24813) > class_4897.field_24813.method_11245() / 2) {
            method_8166(var2, ImmutableSet.of(class_4897.field_24813), var7);
         }

         if (!this.field_9376.isEmpty() && var2.method_2017().method_31496(this.field_9376)) {
            method_8166(var2, this.field_9376, var7);
         }
      }
   }

   public void method_8165(class_6331 var1, class_7666 var2, long var3) {
      var2.method_26525().method_5127(class_6044.field_30861);
   }

   private static Set<class_2451> method_8169(class_7666 var0, class_7666 var1) {
      ImmutableSet var4 = var1.method_15891().method_13910().method_20726();
      ImmutableSet var5 = var0.method_15891().method_13910().method_20726();
      return var4.stream().filter(var1x -> !var5.contains(var1x)).collect(Collectors.<class_2451>toSet());
   }

   private static void method_8166(class_7666 var0, Set<class_2451> var1, class_5834 var2) {
      class_4657 var5 = var0.method_2017();
      class_6098 var6 = class_6098.field_31203;

      for (int var7 = 0; var7 < var5.method_31505(); var7++) {
         class_6098 var8 = var5.method_31498(var7);
         if (!var8.method_28022()) {
            class_2451 var9 = var8.method_27960();
            if (var1.contains(var9)) {
               int var10;
               if (var8.method_27997() <= var8.method_28016() / 2) {
                  if (var8.method_27997() <= 24) {
                     continue;
                  }

                  var10 = var8.method_27997() - 24;
               } else {
                  var10 = var8.method_27997() / 2;
               }

               var8.method_27970(var10);
               var6 = new class_6098(var9, var10);
               break;
            }
         }
      }

      if (!var6.method_28022()) {
         class_1225.method_5439(var0, var6, var2.method_37245());
      }
   }
}
