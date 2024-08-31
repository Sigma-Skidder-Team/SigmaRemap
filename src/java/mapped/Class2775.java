package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2775<T extends LivingEntity> extends Class2770<T> {
   private static String[] field17348;
   private final Class1090 field17365;

   public Class2775(Class1090 var1, Class<T> var2, float var3, double var4, double var6) {
      super(var1, var2, var3, var4, var6, Class8088.field34761::test);
      this.field17365 = var1;
   }

   @Override
   public boolean method10803() {
      return !Class1090.method5079(this.field17365) && super.method10803();
   }

   @Override
   public boolean method10806() {
      return !Class1090.method5079(this.field17365) && super.method10806();
   }
}
