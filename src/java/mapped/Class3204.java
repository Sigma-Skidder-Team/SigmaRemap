package mapped;

import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class Class3204 extends Class3202 {
   private static String[] field18499;

   public Class3204(AbstractBlock var1) {
      super(true, var1);
   }

   @Override
   public SoundEvent method11521(boolean var1) {
      return !var1 ? SoundEvents.field27263 : SoundEvents.field27264;
   }
}
