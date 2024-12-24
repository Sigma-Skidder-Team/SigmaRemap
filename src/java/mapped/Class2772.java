package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2772<T extends LivingEntity> extends Class2770<T> {
   private static String[] field17348;
   private final RabbitEntity field17361;

   public Class2772(RabbitEntity var1, Class<T> var2, float var3, double var4, double var6) {
      super(var1, var2, var3, var4, var6);
      this.field17361 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field17361.method5114() != 99 && super.method10803();
   }
}
