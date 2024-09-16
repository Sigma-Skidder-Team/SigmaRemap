package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class Class8507 {
   private final ResourceLocation field37202;
   private ClientWorld field37203;
   private Biome field37204;
   private static Minecraft field37205 = Minecraft.getInstance();

   private Class8507(ResourceLocation var1) {
      this.field37202 = var1;
      this.field37203 = field37205.world;
      this.method30135();
   }

   private void method30135() {
      this.field37204 = null;
      Registry var3 = Class8708.method31404(this.field37203);
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

   public static Class8507 method30138(ResourceLocation var0) {
      Class8507 var3 = new Class8507(var0);
      return var3.field37204 != null ? var3 : null;
   }
}
