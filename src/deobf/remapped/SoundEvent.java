package remapped;

import com.mojang.serialization.Codec;

public class SoundEvent {
   private static String[] field_43259;
   public static final Codec<SoundEvent> field_43261 = Identifier.field_22655.xmap(SoundEvent::new, var0 -> var0.field_43260);
   private final Identifier field_43260;

   public SoundEvent(Identifier var1) {
      this.field_43260 = var1;
   }

   public Identifier method_38928() {
      return this.field_43260;
   }
}
