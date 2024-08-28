package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class Class3700 extends Class3676<Class1046> {
   private static String[] field19750;
   private final Class8830<Class9378> field19751;
   private final int field19752;
   private final int field19753;
   private final float field19754;
   private long field19755;

   public Class3700(Class8830<Class9378> var1, float var2, int var3, int var4) {
      super(ImmutableMap.of(Class8830.field39824, Class2217.field14486, var1, Class2217.field14484));
      this.field19751 = var1;
      this.field19754 = var2;
      this.field19752 = var3;
      this.field19753 = var4;
   }

   public boolean method12508(ServerWorld var1, Class1046 var2) {
      Optional var5 = var2.method2992().<Class9378>method21410(this.field19751);
      return var5.isPresent()
         && var1.method6813() == ((Class9378)var5.get()).method35578()
         && ((Class9378)var5.get()).method35579().method8317(var2.getPositionVec(), (double)this.field19753);
   }

   public void method12502(ServerWorld var1, Class1046 var2, long var3) {
      if (var3 > this.field19755) {
         Class6947<?> var7 = var2.method2992();
         Optional<Class9378> var8 = var7.method21410(this.field19751);
         var8.ifPresent(var2x -> var7.method21406(Class8830.field39824, new Class8999(var2x.method35579(), this.field19754, this.field19752)));
         this.field19755 = var3 + 80L;
      }
   }
}
