package remapped;

import com.google.common.primitives.Doubles;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class class_4117 implements Comparable<class_4117> {
   public final double field_20072;
   public final AtomicBoolean field_20070;
   public Map<class_1331, class_1488> field_20071;

   public class_4117(class_3511 var1, double var2) {
      this(var1, (class_2034)null, var2);
   }

   public class_4117(class_3511 var1, class_2034 var2, double var3) {
      this.field_20073 = var1;
      this.field_20070 = new AtomicBoolean(false);
      this.field_20072 = var3;
      if (var2 != null) {
         this.field_20071 = class_4093.method_18931(MinecraftClient.method_8510().field_9601, var2);
      } else {
         this.field_20071 = Collections.<class_1331, class_1488>emptyMap();
      }
   }

   public abstract CompletableFuture<class_8490> method_19129(class_2848 var1);

   public abstract void method_19131();

   public int compareTo(class_4117 var1) {
      return Doubles.compare(this.field_20072, var1.field_20072);
   }

   public class_1488 method_19132(class_1331 var1) {
      return this.field_20071.getOrDefault(var1, class_6652.field_34420);
   }
}
