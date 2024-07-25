package remapped;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class class_4398 extends class_1174 {
   private final Map<class_7794<Integer, Integer>, Map<class_9371, class_5531>> field_21527 = new ConcurrentHashMap<class_7794<Integer, Integer>, Map<class_9371, class_5531>>();
   private boolean field_21526 = false;

   public class_4398(class_1455 var1) {
      super(var1);
   }

   public void method_20479(int var1, int var2) {
      class_7794 var5 = new class_7794<Integer, Integer>(var1, var2);
      this.field_21527.remove(var5);
   }

   public void method_20476(class_9371 var1, class_5531 var2) {
      class_7794 var5 = this.method_20478(var1);
      if (!this.field_21527.containsKey(var5)) {
         this.field_21527.put(var5, new ConcurrentHashMap<class_9371, class_5531>());
      }

      Map var6 = this.field_21527.get(var5);
      if (!var6.containsKey(var1) || !((class_5531)var6.get(var1)).equals(var2)) {
         var6.put(var1, var2);
      }
   }

   private class_7794<Integer, Integer> method_20478(class_9371 var1) {
      int var4 = Math.floorDiv(var1.method_43340(), 16);
      int var5 = Math.floorDiv(var1.method_43343(), 16);
      return new class_7794<Integer, Integer>(var4, var5);
   }

   public Optional<class_5531> method_20477(class_9371 var1) {
      class_7794 var4 = this.method_20478(var1);
      Map var5 = this.field_21527.get(var4);
      if (var5 != null) {
         class_5531 var6 = (class_5531)var5.get(var1);
         if (var6 != null) {
            var6 = var6.clone();
            var6.<class_1456>method_25122(new class_1456("powered", (byte)0));
            var6.<class_1456>method_25122(new class_1456("auto", (byte)0));
            var6.<class_1456>method_25122(new class_1456("conditionMet", (byte)0));
            return Optional.<class_5531>of(var6);
         } else {
            return Optional.<class_5531>empty();
         }
      } else {
         return Optional.<class_5531>empty();
      }
   }

   public void method_20475() {
      this.field_21527.clear();
   }

   public boolean method_20474() {
      return this.field_21526;
   }

   public void method_20480(boolean var1) {
      this.field_21526 = var1;
   }
}
