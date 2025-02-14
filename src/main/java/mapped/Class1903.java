package mapped;

import net.minecraft.util.ResourceLocation;

import java.util.Objects;

public class Class1903 implements Class1902 {
   private final ResourceLocation field11180;
   private final Class6979 field11181;
   private final boolean field11182;
   private final int field11183;

   public Class1903(ResourceLocation var1, Class6979 var2, boolean var3, int var4) {
      this.field11180 = var1;
      this.field11181 = var2;
      this.field11182 = var3;
      this.field11183 = var4;
   }

   public ResourceLocation method8171() {
      return this.field11180;
   }

   @Override
   public Class6979 method8166() {
      return this.field11181;
   }

   @Override
   public boolean method8170() {
      return this.field11182;
   }

   public int method8172() {
      return this.field11183;
   }

   @Override
   public String toString() {
      return "Variant{modelLocation=" + this.field11180 + ", rotation=" + this.field11181 + ", uvLock=" + this.field11182 + ", weight=" + this.field11183 + '}';
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof Class1903)) {
            return false;
         } else {
            Class1903 var4 = (Class1903)var1;
            return this.field11180.equals(var4.field11180)
               && Objects.equals(this.field11181, var4.field11181)
               && this.field11182 == var4.field11182
               && this.field11183 == var4.field11183;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field11180.hashCode();
      var3 = 31 * var3 + this.field11181.hashCode();
      var3 = 31 * var3 + Boolean.valueOf(this.field11182).hashCode();
      return 31 * var3 + this.field11183;
   }
}
