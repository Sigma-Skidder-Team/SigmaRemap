package mapped;

import net.minecraft.client.Minecraft;

public class Class6628 implements Class6627 {
   private int field29153 = -1;
   private ResourceLocation field29154;
   private int field29155 = 0;
   private Class290 field29156;
   public static final int field29157 = 0;
   public static final int field29158 = 1;
   public static final int field29159 = 2;

   public Class6628(int var1, ResourceLocation var2, int var3) {
      this.field29153 = var1;
      this.field29154 = var2;
      this.field29155 = var3;
   }

   public Class290 method20210() {
      if (this.field29156 == null) {
         TextureManager var3 = Minecraft.getInstance().getTextureManager();
         this.field29156 = var3.getTexture(this.field29154);
         if (this.field29156 == null) {
            this.field29156 = new Class293(this.field29154);
            var3.method1073(this.field29154, this.field29156);
            this.field29156 = var3.getTexture(this.field29154);
         }
      }

      return this.field29156;
   }

   @Override
   public int method20207() {
      Class290 var3 = this.method20210();
      if (this.field29155 != 0 && var3 instanceof Class290) {
         Class9732 var4 = var3.field1128;
         if (var4 != null) {
            if (this.field29155 == 1) {
               return var4.field45440;
            }

            if (this.field29155 == 2) {
               return var4.field45441;
            }
         }
      }

      return var3.getGlTextureId();
   }

   @Override
   public int method20208() {
      return this.field29153;
   }

   @Override
   public void method20203() {
   }

   @Override
   public String toString() {
      return "textureUnit: "
         + this.field29153
         + ", location: "
         + this.field29154
         + ", glTextureId: "
         + (this.field29156 == null ? "" : this.field29156.getGlTextureId());
   }
}
