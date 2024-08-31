package net.minecraft.util;

import com.mojang.serialization.Codec;

public class SoundEvent {
   private static String[] field43935;
   public static final Codec<SoundEvent> field43936 = ResourceLocation.CODEC.xmap(SoundEvent::new, var0 -> var0.field43937);
   private final ResourceLocation field43937;

   public SoundEvent(ResourceLocation var1) {
      this.field43937 = var1;
   }

   public ResourceLocation method36383() {
      return this.field43937;
   }
}
