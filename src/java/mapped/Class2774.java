package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2774<T extends LivingEntity> extends Class2770<T> {
   private static String[] field17348;
   private final Class1098 field17364;

   public Class2774(Class1098 var1, Class<T> var2, float var3, double var4, double var6) {
      super(var1, var2, var3, var4, var6, Class8088.field34761::test);
      this.field17364 = var1;
   }

   @Override
   public boolean method10803() {
      return !this.field17364.method4393() && super.method10803();
   }

   @Override
   public boolean method10806() {
      return !this.field17364.method4393() && super.method10806();
   }
}
