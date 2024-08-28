package mapped;

import com.google.common.primitives.Doubles;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Class2009 implements Comparable<Class2009> {
   public final double field13075;
   public final AtomicBoolean field13076;
   public Map<BlockPos, Class7180> field13077;
   public final Class8066 field13078;

   public Class2009(Class8066 var1, double var2) {
      this(var1, (Class7481)null, var2);
   }

   public Class2009(Class8066 var1, Class7481 var2, double var3) {
      this.field13078 = var1;
      this.field13076 = new AtomicBoolean(false);
      this.field13075 = var3;
      if (var2 != null) {
         this.field13077 = Class8264.method28829(Minecraft.getInstance().world, var2);
      } else {
         this.field13077 = Collections.<BlockPos, Class7180>emptyMap();
      }
   }

   public abstract CompletableFuture<Class2046> method8527(Class7828 var1);

   public abstract void method8528();

   public int compareTo(Class2009 var1) {
      return Doubles.compare(this.field13075, var1.field13075);
   }

   public Class7180 method8529(BlockPos var1) {
      return this.field13077.getOrDefault(var1, Class7181.field30863);
   }
}
