package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;

import java.util.function.Function;

public class Class3690<T> extends Class3676<Class1046> {
   private static String[] field19713;
   private final Class8830<T> field19714;
   private final float field19715;
   private final int field19716;
   private final Function<T, Vector3d> field19717;

   public Class3690(Class8830<T> var1, float var2, int var3, boolean var4, Function<T, Vector3d> var5) {
      super(ImmutableMap.of(Class8830.field39824, !var4 ? Class2217.field14485 : Class2217.field14486, var1, Class2217.field14484));
      this.field19714 = var1;
      this.field19715 = var2;
      this.field19716 = var3;
      this.field19717 = var5;
   }

   public static Class3690<BlockPos> method12538(Class8830<BlockPos> var0, float var1, int var2, boolean var3) {
      return new Class3690<>(var0, var1, var2, var3, Vector3d::method11330);
   }

   public static Class3690<? extends Entity> method12539(Class8830<? extends Entity> var0, float var1, int var2, boolean var3) {
      return new Class3690<>(var0, var1, var2, var3, Entity::getPositionVec);
   }

   public boolean method12508(ServerWorld var1, Class1046 var2) {
      return !this.method12541(var2) ? var2.getPositionVec().method11340(this.method12540(var2), (double)this.field19716) : false;
   }

   private Vector3d method12540(Class1046 var1) {
      return this.field19717.apply(var1.getBrain().<T>method21410(this.field19714).get());
   }

   private boolean method12541(Class1046 var1) {
      if (var1.getBrain().method21404(Class8830.field39824)) {
         Class8999 var4 = var1.getBrain().<Class8999>method21410(Class8830.field39824).get();
         if (var4.method33252() == this.field19715) {
            Vector3d var5 = var4.method33251().method26356().subtract(var1.getPositionVec());
            Vector3d var6 = this.method12540(var1).subtract(var1.getPositionVec());
            return var5.dotProduct(var6) < 0.0;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void method12502(ServerWorld var1, Class1046 var2, long var3) {
      method12542(var2, this.method12540(var2), this.field19715);
   }

   private static void method12542(Class1046 var0, Vector3d var1, float var2) {
      for (int var5 = 0; var5 < 10; var5++) {
         Vector3d var6 = Class8037.method27591(var0, 16, 7, var1);
         if (var6 != null) {
            var0.getBrain().method21406(Class8830.field39824, new Class8999(var6, var2, 0));
            return;
         }
      }
   }
}
