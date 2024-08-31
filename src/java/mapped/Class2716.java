package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.function.Predicate;

public class Class2716<T extends LivingEntity> extends Class2709<T> {
   private static String[] field17187;
   private final Class1013 field17205;

   public Class2716(Class1013 var1, Class<T> var2, boolean var3, Predicate<LivingEntity> var4) {
      super(var1, var2, 10, var3, false, var4);
      this.field17205 = var1;
   }

   @Override
   public boolean method10803() {
      return !this.field17205.method4393() && super.method10803();
   }

   @Override
   public boolean method10806() {
      return this.field17191 == null ? super.method10806() : this.field17191.method30210(this.field17153, this.field17190);
   }
}
