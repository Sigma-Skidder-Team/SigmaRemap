package mapped;

import java.util.Objects;
import java.util.function.Function;

public class Class7826 {
   private final ResourceLocation field33603;
   private final ResourceLocation field33604;
   private Class4520 field33605;

   public Class7826(ResourceLocation var1, ResourceLocation var2) {
      this.field33603 = var1;
      this.field33604 = var2;
   }

   public ResourceLocation method26196() {
      return this.field33603;
   }

   public ResourceLocation method26197() {
      return this.field33604;
   }

   public Class1713 method26198() {
      Class1713 var3 = Minecraft.getInstance().method1542(this.method26196()).apply(this.method26197());
      if (Class8564.method30588()) {
         var3 = Class8564.method30592(var3);
      }

      return var3;
   }

   public Class4520 method26199(Function<ResourceLocation, Class4520> var1) {
      if (this.field33605 == null) {
         this.field33605 = (Class4520)var1.apply(this.field33603);
      }

      return this.field33605;
   }

   public Class5422 method26200(Class7733 var1, Function<ResourceLocation, Class4520> var2) {
      Class1713 var5 = this.method26198();
      Class4520 var6 = this.method26199(var2);
      if (var5.field9353 && var6.method14364()) {
         var6 = Class4520.method14310(this.field33603);
      }

      return var5.method7474(var1.method25597(var6));
   }

   public Class5422 method26201(Class7733 var1, Function<ResourceLocation, Class4520> var2, boolean var3) {
      return this.method26198().method7474(Class216.method786(var1, this.method26199(var2), true, var3));
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Class7826 var4 = (Class7826)var1;
         return this.field33603.equals(var4.field33603) && this.field33604.equals(var4.field33604);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field33603, this.field33604);
   }

   @Override
   public String toString() {
      return "Material{atlasLocation=" + this.field33603 + ", texture=" + this.field33604 + '}';
   }
}
