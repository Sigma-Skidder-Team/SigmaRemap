package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class Class3746 extends Class3676<Class1042> {
   private static String[] field19885;
   private final Class8830<Class9378> field19886;
   private final float field19887;
   private final int field19888;
   private final int field19889;
   private final int field19890;

   public Class3746(Class8830<Class9378> var1, float var2, int var3, int var4, int var5) {
      super(ImmutableMap.of(Class8830.field39841, Class2217.field14486, Class8830.field39824, Class2217.field14485, var1, Class2217.field14484));
      this.field19886 = var1;
      this.field19887 = var2;
      this.field19888 = var3;
      this.field19889 = var4;
      this.field19890 = var5;
   }

   private void method12701(Class1042 var1, long var2) {
      Brain var6 = var1.getBrain();
      var1.method4699(this.field19886);
      var6.method21405(this.field19886);
      var6.method21406(Class8830.field39841, var2);
   }

   public void method12502(ServerWorld var1, Class1042 var2, long var3) {
      Brain<Class1042> var7 = var2.getBrain();
      var7.method21410(this.field19886)
         .ifPresent(
            var6 -> {
               if (this.method12704(var1, var6) || this.method12702(var1, var2)) {
                  this.method12701(var2, var3);
               } else if (!this.method12703(var2, var6)) {
                  if (!this.method12705(var1, var2, var6)) {
                     var7.method21406(Class8830.field39824, new Class8999(var6.method35579(), this.field19887, this.field19888));
                  }
               } else {
                  Vector3d var9 = null;
                  int var10 = 0;

                  for (short var11 = 1000;
                     var10 < 1000 && (var9 == null || this.method12703(var2, Class9378.method35577(var1.getDimensionKey(), new BlockPos(var9))));
                     var10++
                  ) {
                     var9 = Class8037.method27587(var2, 15, 7, Vector3d.method11330(var6.method35579()));
                  }

                  if (var10 == 1000) {
                     this.method12701(var2, var3);
                     return;
                  }

                  var7.method21406(Class8830.field39824, new Class8999(var9, this.field19887, this.field19888));
               }
            }
         );
   }

   private boolean method12702(ServerWorld var1, Class1042 var2) {
      Optional var5 = var2.getBrain().<Long>method21410(Class8830.field39841);
      return !var5.isPresent() ? false : var1.getGameTime() - (Long)var5.get() > (long)this.field19890;
   }

   private boolean method12703(Class1042 var1, Class9378 var2) {
      return var2.method35579().method8321(var1.getPosition()) > this.field19889;
   }

   private boolean method12704(ServerWorld var1, Class9378 var2) {
      return var2.method35578() != var1.getDimensionKey();
   }

   private boolean method12705(ServerWorld var1, Class1042 var2, Class9378 var3) {
      return var3.method35578() == var1.getDimensionKey() && var3.method35579().method8321(var2.getPosition()) <= this.field19888;
   }
}
