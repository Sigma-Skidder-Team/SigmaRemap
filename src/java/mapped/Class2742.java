package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class Class2742 extends Class2736 {
   private static String[] field17269;

   public Class2742(CreatureEntity var1, double var2, boolean var4) {
      super(var1, var2, 10, var4);
   }

   @Override
   public boolean method10803() {
      ServerWorld var3 = (ServerWorld)this.field17258.world;
      BlockPos var4 = this.field17258.getPosition();
      return !var3.method6952(var4) ? super.method10803() : false;
   }

   @Nullable
   @Override
   public Vector3d method10943() {
      ServerWorld var3 = (ServerWorld)this.field17258.world;
      BlockPos var4 = this.field17258.getPosition();
      SectionPos var5 = SectionPos.method8390(var4);
      SectionPos var6 = Class6983.method21579(var3, var5, 2);
      return var6 == var5 ? null : Class8037.method27587(this.field17258, 10, 7, Vector3d.method11330(var6.method8422()));
   }
}
