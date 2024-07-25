package remapped;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.lang3.StringUtils;

public class class_3710 {
   private final class_7667 field_18198;
   private final String field_18201;
   private final int field_18199;
   private int field_18202;

   private class_3710(class_7667 var1, int var2, String var3) {
      this.field_18198 = var1;
      this.field_18199 = var2;
      this.field_18201 = var3;
   }

   public void method_17228(class_2072 var1) {
      RenderSystem.method_16431(RenderSystem::method_16366);
      this.field_18202++;
      GlStateManager.method_8739(var1.method_9672(), this.field_18199);
   }

   public void method_17227() {
      RenderSystem.method_16431(RenderSystem::method_16366);
      this.field_18202--;
      if (this.field_18202 <= 0) {
         GlStateManager.method_8766(this.field_18199);
         this.field_18198.method_34733().remove(this.field_18201);
      }
   }

   public String method_17229() {
      return this.field_18201;
   }

   public static class_3710 method_17225(class_7667 var0, String var1, InputStream var2, String var3) throws IOException {
      RenderSystem.method_16431(RenderSystem::method_16366);
      String var6 = class_4970.method_22845(var2);
      if (var6 != null) {
         int var7 = GlStateManager.method_8931(class_7667.method_34736(var0));
         GlStateManager.method_8845(var7, var6);
         GlStateManager.method_8888(var7);
         if (GlStateManager.method_8866(var7, 35713) != 0) {
            class_3710 var9 = new class_3710(var0, var7, var1);
            var0.method_34733().put(var1, var9);
            return var9;
         } else {
            String var8 = StringUtils.trim(GlStateManager.method_8889(var7, 32768));
            throw new IOException("Couldn't compile " + var0.method_34734() + " program (" + var3 + ", " + var1 + ") : " + var8);
         }
      } else {
         throw new IOException("Could not load program " + var0.method_34734());
      }
   }
}
