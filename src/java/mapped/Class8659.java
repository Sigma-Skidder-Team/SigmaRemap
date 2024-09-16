package mapped;

import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;

import java.util.function.Function;

public class Class8659 {
   private final Class7287 field39027;
   private ResourceLocation field39028;
   public final Class9407 field39029;

   public Class8659(Class9407 var1, Class7287 var2) {
      this.field39029 = var1;
      this.field39027 = var2;
   }

   public Class8659 method31165(Block var1, Class9253 var2) {
      this.field39028 = var2.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      Class9407.method36001(this.field39029).accept(Class9407.method36000(var1, this.field39028));
      return this;
   }

   public Class8659 method31166(Function<Class7287, ResourceLocation> var1) {
      this.field39028 = (ResourceLocation)var1.apply(this.field39027);
      return this;
   }

   public Class8659 method31167(Block var1) {
      ResourceLocation var4 = Class9756.field45546.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      ResourceLocation var5 = Class9756.field45547.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      Class9407.method36001(this.field39029).accept(Class9407.method36002(var1, var4, var5));
      ResourceLocation var6 = Class9756.field45548.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      Class9407.method36003(this.field39029, var1, var6);
      return this;
   }

   public Class8659 method31168(Block var1) {
      ResourceLocation var4 = Class9756.field45556.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      ResourceLocation var5 = Class9756.field45557.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      ResourceLocation var6 = Class9756.field45558.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      Class9407.method36001(this.field39029).accept(Class9407.method36004(var1, var4, var5, var6));
      ResourceLocation var7 = Class9756.field45559.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      Class9407.method36003(this.field39029, var1, var7);
      return this;
   }

   public Class8659 method31169(Block var1) {
      ResourceLocation var4 = Class9756.field45553.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      ResourceLocation var5 = Class9756.field45554.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      Class9407.method36001(this.field39029).accept(Class9407.method36005(var1, var4, var5));
      ResourceLocation var6 = Class9756.field45555.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      Class9407.method36003(this.field39029, var1, var6);
      return this;
   }

   public Class8659 method31170(Block var1) {
      ResourceLocation var4 = Class9756.field45561.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      ResourceLocation var5 = Class9756.field45560.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      ResourceLocation var6 = Class9756.field45563.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      ResourceLocation var7 = Class9756.field45562.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      Class9407.method36001(this.field39029).accept(Class9407.method36006(var1, var4, var5, var6, var7));
      return this;
   }

   public Class8659 method31171(Block var1) {
      ResourceLocation var4 = Class9756.field45564.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      ResourceLocation var5 = Class9756.field45565.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      Class9407.method36001(this.field39029).accept(Class9407.method36007(var1, var4, var5));
      return this;
   }

   public Class8659 method31172(Block var1, Block var2) {
      ResourceLocation var5 = Class9756.field45566.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      Class9407.method36001(this.field39029).accept(Class9407.method36000(var1, var5));
      Class9407.method36001(this.field39029).accept(Class9407.method36000(var2, var5));
      Class9407.method36008(this.field39029, var1.method11581());
      Class9407.method36009(this.field39029, var2);
      return this;
   }

   public Class8659 method31173(Block var1) {
      if (this.field39028 != null) {
         ResourceLocation var4 = Class9756.field45567.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
         ResourceLocation var5 = Class9756.field45568.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
         Class9407.method36001(this.field39029).accept(Class9407.method36010(var1, var4, var5, this.field39028));
         return this;
      } else {
         throw new IllegalStateException("Full block not generated yet");
      }
   }

   public Class8659 method31174(Block var1) {
      ResourceLocation var4 = Class9756.field45571.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      ResourceLocation var5 = Class9756.field45570.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      ResourceLocation var6 = Class9756.field45572.method34805(var1, this.field39027, Class9407.method35999(this.field39029));
      Class9407.method36001(this.field39029).accept(Class9407.method36011(var1, var4, var5, var6));
      return this;
   }
}
