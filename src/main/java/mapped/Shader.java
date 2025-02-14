package mapped;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.Framebuffer;

import java.io.IOException;
import java.util.List;
import java.util.function.IntSupplier;

public class Shader implements AutoCloseable {
   private final ShaderInstance manager;
   public final Framebuffer frameBuffer2;
   public final Framebuffer frameBuffer;
   private final List<IntSupplier> field9296 = Lists.newArrayList();
   private final List<String> field9297 = Lists.newArrayList();
   private final List<Integer> field9298 = Lists.newArrayList();
   private final List<Integer> field9299 = Lists.newArrayList();
   private Matrix4f field9300;

   public Shader(IResourceManager var1, String var2, Framebuffer var3, Framebuffer var4) throws IOException {
      this.manager = new ShaderInstance(var1, var2);
      this.frameBuffer2 = var3;
      this.frameBuffer = var4;
   }

   @Override
   public void close() {
      this.manager.close();
   }

   public void method7407(String var1, IntSupplier var2, int var3, int var4) {
      this.field9297.add(this.field9297.size(), var1);
      this.field9296.add(this.field9296.size(), var2);
      this.field9298.add(this.field9298.size(), var3);
      this.field9299.add(this.field9299.size(), var4);
   }

   public void method7408(Matrix4f var1) {
      this.field9300 = var1;
   }

   public void method7409(float var1) {
      this.frameBuffer2.unbindFramebuffer();
      float var4 = (float)this.frameBuffer.framebufferTextureWidth;
      float var5 = (float)this.frameBuffer.framebufferTextureHeight;
      RenderSystem.viewport(0, 0, (int)var4, (int)var5);
      this.manager.method7940("DiffuseSampler", this.frameBuffer2::getFramebufferTexture);

      for (int var6 = 0; var6 < this.field9296.size(); var6++) {
         this.manager.method7940(this.field9297.get(var6), this.field9296.get(var6));
         this.manager.getShaderUniform("AuxSize" + var6).set((float)this.field9298.get(var6).intValue(), (float)this.field9299.get(var6).intValue());
      }

      this.manager.getShaderUniform("ProjMat").set(this.field9300);
      this.manager.getShaderUniform("InSize").set((float)this.frameBuffer2.framebufferTextureWidth, (float)this.frameBuffer2.framebufferTextureHeight);
      this.manager.getShaderUniform("OutSize").set(var4, var5);
      this.manager.getShaderUniform("Time").set(var1);
      Minecraft mc = Minecraft.getInstance();
      this.manager.getShaderUniform("ScreenSize").set((float)mc.getMainWindow().getFramebufferWidth(), (float)mc.getMainWindow().getFramebufferHeight());
      this.manager.method7934();
      this.frameBuffer.framebufferClear(Minecraft.IS_RUNNING_ON_MAC);
      this.frameBuffer.bindFramebuffer(false);
      RenderSystem.depthFunc(519);
      BufferBuilder var7 = Tessellator.getInstance().getBuffer();
      var7.begin(7, DefaultVertexFormats.POSITION_COLOR);
      var7.pos(0.0, 0.0, 500.0).color(255, 255, 255, 255).endVertex();
      var7.pos((double)var4, 0.0, 500.0).color(255, 255, 255, 255).endVertex();
      var7.pos((double)var4, (double)var5, 500.0).color(255, 255, 255, 255).endVertex();
      var7.pos(0.0, (double)var5, 500.0).color(255, 255, 255, 255).endVertex();
      var7.finishDrawing();
      WorldVertexBufferUploader.draw(var7);
      RenderSystem.depthFunc(515);
      this.manager.method7933();
      this.frameBuffer.unbindFramebuffer();
      this.frameBuffer2.unbindFramebufferTexture();

      for (Object var9 : this.field9296) {
         if (var9 instanceof Framebuffer) {
            ((Framebuffer)var9).unbindFramebufferTexture();
         }
      }
   }

   public ShaderInstance getShaderManager() {
      return this.manager;
   }
}
