package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.ArrayList;
import java.util.Set;

public class Class7891 extends Class7882<Class1042> {
   private static String[] field33842;

   public Class7891() {
      super(40);
   }

   public void method26425(ServerWorld var1, Class1042 var2) {
      RegistryKey var5 = var1.getDimensionKey();
      BlockPos var6 = var2.getPosition();
      ArrayList var7 = Lists.newArrayList();
      byte var8 = 4;

      for (int var9 = -4; var9 <= 4; var9++) {
         for (int var10 = -2; var10 <= 2; var10++) {
            for (int var11 = -4; var11 <= 4; var11++) {
               BlockPos var12 = var6.method8336(var9, var10, var11);
               if (var2.method4674().method26571().method29459().contains(var1.getBlockState(var12).getBlock())) {
                  var7.add(Class9378.method35577(var5, var12));
               }
            }
         }
      }

      Brain var13 = var2.getBrain();
      if (var7.isEmpty()) {
         var13.method21405(Class8830.field39817);
      } else {
         var13.method21406(Class8830.field39817, var7);
      }
   }

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(Class8830.field39817);
   }
}
