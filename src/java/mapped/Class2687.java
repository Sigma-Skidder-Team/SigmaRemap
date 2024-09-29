package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

import javax.annotation.Nullable;
import java.util.EnumSet;

public class Class2687 extends Class2595 {
   private static String[] field17111;
   public final Class1017 field17112;

   public Class2687(Class1017 var1) {
      this.field17112 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      return Class1017.method4495(this.field17112).method21664() && Class1017.method4496(this.field17112).nextInt(10) == 0;
   }

   @Override
   public boolean method10806() {
      return Class1017.method4497(this.field17112).method21665();
   }

   @Override
   public void method10804() {
      Vector3d var3 = this.method10905();
      if (var3 != null) {
         Class1017.method4499(this.field17112).method21656(Class1017.method4498(this.field17112).method21651(new BlockPos(var3), 1), 1.0);
      }
   }

   @Nullable
   private Vector3d method10905() {
      Vector3d var3;
      if (Class1017.method4478(this.field17112) && !Class1017.method4458(this.field17112, Class1017.method4453(this.field17112), 22)) {
         Vector3d var4 = Vector3d.method11328(Class1017.method4453(this.field17112));
         var3 = var4.subtract(this.field17112.getPositionVec()).method11333();
      } else {
         var3 = this.field17112.getLook(0.0F);
      }

      byte var6 = 8;
      Vector3d var5 = Class8037.method27585(this.field17112, 8, 7, var3, (float) (Math.PI / 2), 2, 1);
      return var5 == null ? Class8037.method27582(this.field17112, 8, 4, -2, var3, (float) (Math.PI / 2)) : var5;
   }
}
