package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3d;

public class Class8502 {
   private static String[] field37181;
   private final Vector3d field37182;
   private final Entity field37183;
   private final Class2062 field37184;

   public Class8502(Entity var1, Class2062 var2) {
      this.field37183 = var1;
      this.field37184 = var2;
      this.field37182 = var2.method8711(var1);
   }

   public Class8502(Vector3d var1) {
      this.field37183 = null;
      this.field37182 = var1;
      this.field37184 = null;
   }

   public void method30092(Class6619 var1, Entity var2) {
      if (this.field37183 == null) {
         var2.method2787(var1.method20178(), this.field37182);
      } else if (!(var2 instanceof ServerPlayerEntity)) {
         var2.method2787(var1.method20178(), this.field37182);
      } else {
         ((ServerPlayerEntity)var2).method2788(var1.method20178(), this.field37183, this.field37184);
      }
   }
}
