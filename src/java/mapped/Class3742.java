package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Optional;

public class Class3742 extends Class3676<Class1042> {
   private static String[] field19869;
   private final Class8830<List<Class9378>> field19870;
   private final Class8830<Class9378> field19871;
   private final float field19872;
   private final int field19873;
   private final int field19874;
   private long field19875;
   private Class9378 field19876;

   public Class3742(Class8830<List<Class9378>> var1, float var2, int var3, int var4, Class8830<Class9378> var5) {
      super(ImmutableMap.of(Class8830.field39824, Class2217.field14486, var1, Class2217.field14484, var5, Class2217.field14484));
      this.field19870 = var1;
      this.field19872 = var2;
      this.field19873 = var3;
      this.field19874 = var4;
      this.field19871 = var5;
   }

   public boolean method12508(ServerWorld var1, Class1042 var2) {
      Optional var5 = var2.method2992().<List<Class9378>>method21410(this.field19870);
      Optional var6 = var2.method2992().<Class9378>method21410(this.field19871);
      if (var5.isPresent() && var6.isPresent()) {
         List var7 = (List)var5.get();
         if (!var7.isEmpty()) {
            this.field19876 = (Class9378)var7.get(var1.method6814().nextInt(var7.size()));
            return this.field19876 != null
               && var1.getDimensionKey() == this.field19876.method35578()
               && ((Class9378)var6.get()).method35579().method8317(var2.getPositionVec(), (double)this.field19874);
         }
      }

      return false;
   }

   public void method12502(ServerWorld var1, Class1042 var2, long var3) {
      if (var3 > this.field19875 && this.field19876 != null) {
         var2.method2992().method21406(Class8830.field39824, new Class8999(this.field19876.method35579(), this.field19872, this.field19873));
         this.field19875 = var3 + 100L;
      }
   }
}
