package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class Class3726 extends Class3676<Class1046> {
   private static String[] field19819;
   private final Class8830<Class9378> field19820;
   private long field19821;
   private final int field19822;
   private float field19823;

   public Class3726(Class8830<Class9378> var1, float var2, int var3) {
      super(ImmutableMap.of(Class8830.field39824, Class2217.field14486, var1, Class2217.field14484));
      this.field19820 = var1;
      this.field19823 = var2;
      this.field19822 = var3;
   }

   public boolean method12508(ServerWorld var1, Class1046 var2) {
      Optional<Class9378> var5 = var2.method2992().<Class9378>method21410(this.field19820);
      return var5.isPresent()
         && var1.getDimensionKey() == ((Class9378)var5.get()).method35578()
         && ((Class9378)var5.get()).method35579().method8317(var2.getPositionVec(), (double)this.field19822);
   }

   public void method12502(ServerWorld var1, Class1046 var2, long var3) {
      if (var3 > this.field19821) {
         Optional<Vector3d> var7 = Optional.<Vector3d>ofNullable(Class8037.method27583(var2, 8, 6));
         var2.method2992().method21408(Class8830.field39824, var7.map(var1x -> new Class8999(var1x, this.field19823, 1)));
         this.field19821 = var3 + 180L;
      }
   }
}
