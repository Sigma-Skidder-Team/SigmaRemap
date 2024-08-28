package mapped;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class Class6045 extends Class6037 {
   private final Map<Class9284<Integer, Integer>, Map<Class9695, Class72>> field26263 = new ConcurrentHashMap<Class9284<Integer, Integer>, Map<Class9695, Class72>>();
   private boolean field26264 = false;

   public Class6045(Class7161 var1) {
      super(var1);
   }

   public void method18722(int var1, int var2) {
      Class9284 var5 = new Class9284<Integer, Integer>(var1, var2);
      this.field26263.remove(var5);
   }

   public void method18723(Class9695 var1, Class72 var2) {
      Class9284 var5 = this.method18724(var1);
      if (!this.field26263.containsKey(var5)) {
         this.field26263.put(var5, new ConcurrentHashMap<Class9695, Class72>());
      }

      Map var6 = this.field26263.get(var5);
      if (!var6.containsKey(var1) || !((Class72)var6.get(var1)).equals(var2)) {
         var6.put(var1, var2);
      }
   }

   private Class9284<Integer, Integer> method18724(Class9695 var1) {
      int var4 = Math.floorDiv(var1.method37962(), 16);
      int var5 = Math.floorDiv(var1.method37964(), 16);
      return new Class9284<Integer, Integer>(var4, var5);
   }

   public Optional<Class72> method18725(Class9695 var1) {
      Class9284 var4 = this.method18724(var1);
      Map var5 = this.field26263.get(var4);
      if (var5 != null) {
         Class72 var6 = (Class72)var5.get(var1);
         if (var6 != null) {
            var6 = var6.clone();
            var6.<Class69>method236(new Class69("powered", (byte)0));
            var6.<Class69>method236(new Class69("auto", (byte)0));
            var6.<Class69>method236(new Class69("conditionMet", (byte)0));
            return Optional.<Class72>of(var6);
         } else {
            return Optional.<Class72>empty();
         }
      } else {
         return Optional.<Class72>empty();
      }
   }

   public void method18726() {
      this.field26263.clear();
   }

   public boolean method18727() {
      return this.field26264;
   }

   public void method18728(boolean var1) {
      this.field26264 = var1;
   }
}
