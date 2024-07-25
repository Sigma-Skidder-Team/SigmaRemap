package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class class_3340 extends class_5920<class_7666> {
   private static String[] field_16483;
   private static final Map<class_4466, Identifier> field_16484 = Util.<Map<class_4466, Identifier>>method_44659(Maps.newHashMap(), var0 -> {
      var0.put(class_4466.field_21780, class_5931.field_30102);
      var0.put(class_4466.field_21779, class_5931.field_30138);
      var0.put(class_4466.field_21765, class_5931.field_30143);
      var0.put(class_4466.field_21773, class_5931.field_30136);
      var0.put(class_4466.field_21783, class_5931.field_30110);
      var0.put(class_4466.field_21776, class_5931.field_30101);
      var0.put(class_4466.field_21764, class_5931.field_30095);
      var0.put(class_4466.field_21774, class_5931.field_30083);
      var0.put(class_4466.field_21778, class_5931.field_30122);
      var0.put(class_4466.field_21768, class_5931.field_30108);
      var0.put(class_4466.field_21782, class_5931.field_30148);
      var0.put(class_4466.field_21777, class_5931.field_30155);
      var0.put(class_4466.field_21767, class_5931.field_30079);
   });
   private int field_16486 = 600;
   private boolean field_16485;
   private long field_16482;

   public class_3340(int var1) {
      super(
         ImmutableMap.of(
            class_6044.field_30889,
            class_561.field_3319,
            class_6044.field_30874,
            class_561.field_3319,
            class_6044.field_30861,
            class_561.field_3319,
            class_6044.field_30870,
            class_561.field_3320
         ),
         var1
      );
   }

   public boolean method_15335(class_6331 var1, class_7666 var2) {
      if (this.method_15331(var2)) {
         if (this.field_16486 <= 0) {
            return true;
         } else {
            this.field_16486--;
            return false;
         }
      } else {
         return false;
      }
   }

   public void method_15329(class_6331 var1, class_7666 var2, long var3) {
      this.field_16485 = false;
      this.field_16482 = var3;
      class_704 var7 = this.method_15326(var2).get();
      var2.method_26525().method_5105(class_6044.field_30861, var7);
      class_1225.method_5444(var2, var7);
   }

   public boolean method_15333(class_6331 var1, class_7666 var2, long var3) {
      return this.method_15331(var2) && !this.field_16485;
   }

   public void method_15328(class_6331 var1, class_7666 var2, long var3) {
      class_704 var7 = this.method_15326(var2).get();
      class_1225.method_5444(var2, var7);
      if (!this.method_15336(var2, var7)) {
         class_1225.method_5445(var2, var7, 0.5F, 5);
      } else if (var3 - this.field_16482 > 20L) {
         this.method_15325(var2, var7);
         this.field_16485 = true;
      }
   }

   public void method_15330(class_6331 var1, class_7666 var2, long var3) {
      this.field_16486 = method_15332(var1);
      var2.method_26525().method_5127(class_6044.field_30861);
      var2.method_26525().method_5127(class_6044.field_30889);
      var2.method_26525().method_5127(class_6044.field_30874);
   }

   private void method_15325(class_7666 var1, class_5834 var2) {
      for (class_6098 var6 : this.method_15327(var1)) {
         class_1225.method_5439(var1, var6, var2.method_37245());
      }
   }

   private List<class_6098> method_15327(class_7666 var1) {
      if (!var1.method_26449()) {
         class_4466 var4 = var1.method_15891().method_13910();
         if (!field_16484.containsKey(var4)) {
            return ImmutableList.of(new class_6098(class_4897.field_24621));
         } else {
            class_1758 var5 = var1.field_41768.method_29522().method_1722().method_4604(field_16484.get(var4));
            class_8480 var6 = new class_8480((class_6331)var1.field_41768)
               .method_39065(class_8712.field_44671, var1.method_37245())
               .method_39065(class_8712.field_44676, var1)
               .method_39068(var1.method_26594());
            return var5.method_7862(var6.method_39064(class_4933.field_25575));
         }
      } else {
         return ImmutableList.of(new class_6098(class_4897.field_25233));
      }
   }

   private boolean method_15331(class_7666 var1) {
      return this.method_15326(var1).isPresent();
   }

   private Optional<class_704> method_15326(class_7666 var1) {
      return var1.method_26525().<class_704>method_5138(class_6044.field_30870).filter(this::method_15334);
   }

   private boolean method_15334(class_704 var1) {
      return var1.method_26480(Effects.field_19741);
   }

   private boolean method_15336(class_7666 var1, class_704 var2) {
      class_1331 var5 = var2.method_37075();
      class_1331 var6 = var1.method_37075();
      return var6.method_12171(var5, 5.0);
   }

   private static int method_15332(class_6331 var0) {
      return 600 + var0.field_33033.nextInt(6001);
   }
}
