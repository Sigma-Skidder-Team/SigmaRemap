package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class Class3718 extends Class3676<Class1046> {
   private static String[] field19799;
   private final float field19800;
   private final int field19801;
   private final int field19802;

   public Class3718(float var1) {
      this(var1, 10, 7);
   }

   public Class3718(float var1, int var2, int var3) {
      super(ImmutableMap.of(Class8830.field39824, Class2217.field14485));
      this.field19800 = var1;
      this.field19801 = var2;
      this.field19802 = var3;
   }

   public void method12502(ServerWorld var1, Class1046 var2, long var3) {
      Optional<Vector3d> var7 = Optional.<Vector3d>ofNullable(Class8037.method27583(var2, this.field19801, this.field19802));
      var2.getBrain().method21408(Class8830.field39824, var7.map(var1x -> new Class8999(var1x, this.field19800, 0)));
   }
}
