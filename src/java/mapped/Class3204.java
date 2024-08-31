package mapped;

import net.minecraft.util.SoundEvent;

public class Class3204 extends Class3202 {
   private static String[] field18499;

   public Class3204(AbstractBlock var1) {
      super(true, var1);
   }

   @Override
   public SoundEvent method11521(boolean var1) {
      return !var1 ? Sounds.field27263 : Sounds.field27264;
   }
}
