package mapped;

import javax.annotation.Nullable;

public class Class298 extends Class290 {
   private static String[] field1152;
   private final ResourceLocation field1153;
   private final RenderType field1154;
   private final RenderType field1155;
   private final boolean field1156;
   private final Class8459 field1157;

   public Class298(ResourceLocation var1, boolean var2) {
      this.field1153 = var1;
      this.field1156 = var2;
      this.field1157 = new Class8459(0, 0, 256, 256);
      Class8535.method30369(!var2 ? Class2083.field13568 : Class2083.field13564, this.getGlTextureId(), 256, 256);
      this.field1154 = RenderType.method14339(var1);
      this.field1155 = RenderType.method14340(var1);
   }

   @Override
   public void method1090(IResourceManager var1) {
   }

   @Override
   public void close() {
      this.method1132();
   }

   @Nullable
   public Class8978 method1175(Class2051 var1) {
      if (var1.method8692() == this.field1156) {
         Class8459 var4 = this.field1157.method29754(var1);
         if (var4 == null) {
            return null;
         } else {
            this.method1133();
            var1.method8691(Class8459.method29755(var4), Class8459.method29756(var4));
            float var5 = 256.0F;
            float var6 = 256.0F;
            float var7 = 0.01F;
            return new Class8978(
               this.field1154,
               this.field1155,
               ((float)Class8459.method29755(var4) + 0.01F) / 256.0F,
               ((float)Class8459.method29755(var4) - 0.01F + (float)var1.method8687()) / 256.0F,
               ((float)Class8459.method29756(var4) + 0.01F) / 256.0F,
               ((float)Class8459.method29756(var4) - 0.01F + (float)var1.method8688()) / 256.0F,
               var1.method8694(),
               var1.method8695(),
               var1.method8696(),
               var1.method8697()
            );
         }
      } else {
         return null;
      }
   }

   public ResourceLocation method1176() {
      return this.field1153;
   }
}
