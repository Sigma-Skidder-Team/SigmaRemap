package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.util.text.ITextComponent;

public class Class7224 implements Class7222 {
   private static String[] field31055;
   private final Class8218 field31056;
   private final ResourceLocation field31057;
   private final List<Class6589> field31058;
   public final Class7227 field31059;

   public Class7224(Class7227 var1, Class8218 var2) {
      this.field31059 = var1;
      this.field31056 = var2;
      this.field31058 = Lists.newArrayList();

      for (String var6 : var2.method28575()) {
         Class6589 var7 = Minecraft.getInstance().getClientPlayNetHandler().method15793(var6);
         if (var7 != null) {
            this.field31058.add(var7);
         }
      }

      if (!this.field31058.isEmpty()) {
         String var8 = this.field31058.get(new Random().nextInt(this.field31058.size())).method19966().getName();
         this.field31057 = AbstractClientPlayerEntity.method5376(var8);
         AbstractClientPlayerEntity.method5375(this.field31057, var8);
      } else {
         this.field31057 = Class7209.method22636();
      }
   }

   @Override
   public void method22697(Class8036 var1) {
      var1.method27574(new Class7225(this.field31058));
   }

   @Override
   public ITextComponent method22698() {
      return this.field31056.method28568();
   }

   @Override
   public void method22699(MatrixStack var1, float var2, int var3) {
      Integer var6 = this.field31056.method28591().getColor();
      if (var6 != null) {
         float var7 = (float)(var6 >> 16 & 0xFF) / 255.0F;
         float var8 = (float)(var6 >> 8 & 0xFF) / 255.0F;
         float var9 = (float)(var6 & 0xFF) / 255.0F;
         Class1193.method5686(var1, 1, 1, 15, 15, MathHelper.method37805(var7 * var2, var8 * var2, var9 * var2) | var3 << 24);
      }

      Minecraft.getInstance().getTextureManager().bindTexture(this.field31057);
      RenderSystem.method27889(var2, var2, var2, (float)var3 / 255.0F);
      Class1193.method5698(var1, 2, 2, 12, 12, 8.0F, 8.0F, 8, 8, 64, 64);
      Class1193.method5698(var1, 2, 2, 12, 12, 40.0F, 8.0F, 8, 8, 64, 64);
   }

   @Override
   public boolean method22700() {
      return !this.field31058.isEmpty();
   }
}
