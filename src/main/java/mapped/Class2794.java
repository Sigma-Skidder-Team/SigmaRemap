package mapped;

import net.minecraft.entity.monster.ZombieEntity;

public class Class2794<T extends ZombieEntity> extends Class2795<T> {
   private static String[] field17429;

   public Class2794(float var1, boolean var2) {
      this(var1, 0.0F, 64, !var2 ? 64 : 32);
   }

   public Class2794(float var1, float var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   public boolean method11000(T var1) {
      return var1.method4307();
   }
}
