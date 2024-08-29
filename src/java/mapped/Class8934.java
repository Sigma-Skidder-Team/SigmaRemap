package mapped;

import net.minecraft.entity.EntityType;

public final class Class8934 implements Class8933 {
   private static String[] field40419;
   public final Class7984 field40420;
   public final Class7984 field40421;
   public final Class7984 field40422;
   public final Class7984 field40423;

   public Class8934(Class7984 var1, Class7984 var2, Class7984 var3, Class7984 var4) {
      this.field40420 = var1;
      this.field40421 = var2;
      this.field40422 = var3;
      this.field40423 = var4;
   }

   @Override
   public Class7984<Block> method32657() {
      return this.field40420;
   }

   @Override
   public Class7984<Item> method32658() {
      return this.field40421;
   }

   @Override
   public Class7984<Fluid> method32659() {
      return this.field40422;
   }

   @Override
   public Class7984<EntityType<?>> method32660() {
      return this.field40423;
   }
}
