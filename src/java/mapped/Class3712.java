package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class Class3712 extends Class3676<Class1046> {
   private static String[] field19778;
   private final float field19779;
   private final int field19780;
   private final int field19781;

   public Class3712(float var1) {
      this(var1, 10, 7);
   }

   public Class3712(float var1, int var2, int var3) {
      super(ImmutableMap.of(Class8830.field39824, Class2217.field14485));
      this.field19779 = var1;
      this.field19780 = var2;
      this.field19781 = var3;
   }

   public void method12502(ServerWorld var1, Class1046 var2, long var3) {
      BlockPos var7 = var2.method3432();
      if (!var1.method6952(var7)) {
         Class2002 var8 = Class2002.method8390(var7);
         Class2002 var9 = Class6983.method21579(var1, var8, 2);
         if (var9 == var8) {
            this.method12594(var2);
         } else {
            this.method12593(var2, var9);
         }
      } else {
         this.method12594(var2);
      }
   }

   private void method12593(Class1046 var1, Class2002 var2) {
      Optional<Vector3d> var5 = Optional.<Vector3d>ofNullable(Class8037.method27587(var1, this.field19780, this.field19781, Vector3d.method11330(var2.method8422())));
      var1.method2992().method21408(Class8830.field39824, var5.map(var1x -> new Class8999(var1x, this.field19779, 0)));
   }

   private void method12594(Class1046 var1) {
      Optional<Vector3d> var4 = Optional.<Vector3d>ofNullable(Class8037.method27583(var1, this.field19780, this.field19781));
      var1.method2992().method21408(Class8830.field39824, var4.map(var1x -> new Class8999(var1x, this.field19779, 0)));
   }
}
