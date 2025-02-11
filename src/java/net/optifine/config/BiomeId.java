package net.optifine.config;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.optifine.util.BiomeUtils;

public class BiomeId {
   private final ResourceLocation field37202;
   private ClientWorld field37203;
   private Biome field37204;
   private static Minecraft field37205 = Minecraft.getInstance();

   private BiomeId(ResourceLocation var1) {
      this.field37202 = var1;
      this.field37203 = field37205.world;
      this.method30135();
   }

   private void method30135() {
      this.field37204 = null;
      Registry var3 = BiomeUtils.getBiomeRegistry(this.field37203);
      if (var3.method9193(this.field37202)) {
         this.field37204 = (Biome)var3.getOrDefault(this.field37202);
      }
   }

   public Biome method30136() {
      if (this.field37203 != field37205.world) {
         this.field37203 = field37205.world;
         this.method30135();
      }

      return this.field37204;
   }

   public ResourceLocation method30137() {
      return this.field37202;
   }

   @Override
   public String toString() {
      return "" + this.field37202;
   }

   public static BiomeId make(ResourceLocation var0) {
      BiomeId var3 = new BiomeId(var0);
      return var3.field37204 != null ? var3 : null;
   }
}
