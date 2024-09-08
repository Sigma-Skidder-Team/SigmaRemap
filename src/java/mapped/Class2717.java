package mapped;

import net.minecraft.entity.passive.WolfEntity;

public class Class2717 extends Class2709<WolfEntity> {
   private static String[] field17187;

   public Class2717(Class1064 var1) {
      super(var1, WolfEntity.class, 16, false, true, var0 -> !((WolfEntity)var0).method4393());
   }

   @Override
   public double method10914() {
      return super.method10914() * 0.25;
   }
}
