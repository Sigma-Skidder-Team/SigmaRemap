package mapped;

import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class Class8912 {
   private static String[] field40335;
   private Class8841 field40336 = Class8841.field39940;
   private Class8841 field40337 = Class8841.field39940;
   private Class8841 field40338 = Class8841.field39940;
   private RegistryKey<Biome> field40339;
   private Structure<?> field40340;
   private RegistryKey<World> field40341;
   private Boolean field40342;
   private Class7231 field40343 = Class7231.field31074;
   private Class9449 field40344 = Class9449.field43899;
   private Class8463 field40345 = Class8463.field36278;

   public static Class8912 method32576() {
      return new Class8912();
   }

   public Class8912 method32577(RegistryKey<Biome> var1) {
      this.field40339 = var1;
      return this;
   }

   public Class8912 method32578(Class9449 var1) {
      this.field40344 = var1;
      return this;
   }

   public Class8912 method32579(Boolean var1) {
      this.field40342 = var1;
      return this;
   }

   public Class8576 method32580() {
      return new Class8576(
         this.field40336,
         this.field40337,
         this.field40338,
         this.field40339,
         this.field40340,
         this.field40341,
         this.field40342,
         this.field40343,
         this.field40344,
         this.field40345
      );
   }
}
