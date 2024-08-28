package mapped;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import java.util.function.IntSupplier;

public class Class1706 implements AutoCloseable {
   private final Class1808 field9293;
   public final Framebuffer field9294;
   public final Framebuffer field9295;
   private final List<IntSupplier> field9296 = Lists.newArrayList();
   private final List<String> field9297 = Lists.newArrayList();
   private final List<Integer> field9298 = Lists.newArrayList();
   private final List<Integer> field9299 = Lists.newArrayList();
   private Class9367 field9300;

   public Class1706(Class191 var1, String var2, Framebuffer var3, Framebuffer var4) throws IOException {
      this.field9293 = new Class1808(var1, var2);
      this.field9294 = var3;
      this.field9295 = var4;
   }

   @Override
   public void close() {
      this.field9293.close();
   }

   public void method7407(String var1, IntSupplier var2, int var3, int var4) {
      this.field9297.add(this.field9297.size(), var1);
      this.field9296.add(this.field9296.size(), var2);
      this.field9298.add(this.field9298.size(), var3);
      this.field9299.add(this.field9299.size(), var4);
   }

   public void method7408(Class9367 var1) {
      this.field9300 = var1;
   }

   public void method7409(float var1) {
      this.field9294.method29114();
      float var4 = (float)this.field9295.field35730;
      float var5 = (float)this.field9295.field35731;
      RenderSystem.method27869(0, 0, (int)var4, (int)var5);
      this.field9293.method7940("DiffuseSampler", this.field9294::method29120);

      for (int var6 = 0; var6 < this.field9296.size(); var6++) {
         this.field9293.method7940(this.field9297.get(var6), this.field9296.get(var6));
         this.field9293.method7937("AuxSize" + var6).method7438((float)this.field9298.get(var6).intValue(), (float)this.field9299.get(var6).intValue());
      }

      this.field9293.method7937("ProjMat").method7444(this.field9300);
      this.field9293.method7937("InSize").method7438((float)this.field9294.field35730, (float)this.field9294.field35731);
      this.field9293.method7937("OutSize").method7438(var4, var5);
      this.field9293.method7937("Time").method7437(var1);
      Minecraft var10 = Minecraft.getInstance();
      this.field9293.method7937("ScreenSize").method7438((float)var10.method1580().method8041(), (float)var10.method1580().method8042());
      this.field9293.method7934();
      this.field9295.method29119(Minecraft.field1272);
      this.field9295.method29112(false);
      RenderSystem.depthFunc(519);
      Class5425 var7 = Class9352.method35409().method35411();
      var7.method17063(7, Class9337.field43342);
      var7.method17025(0.0, 0.0, 500.0).method17026(255, 255, 255, 255).method17031();
      var7.method17025((double)var4, 0.0, 500.0).method17026(255, 255, 255, 255).method17031();
      var7.method17025((double)var4, (double)var5, 500.0).method17026(255, 255, 255, 255).method17031();
      var7.method17025(0.0, (double)var5, 500.0).method17026(255, 255, 255, 255).method17031();
      var7.method17065();
      Class4395.method13895(var7);
      RenderSystem.depthFunc(515);
      this.field9293.method7933();
      this.field9295.method29114();
      this.field9294.method29111();

      for (Object var9 : this.field9296) {
         if (var9 instanceof Framebuffer) {
            ((Framebuffer)var9).method29111();
         }
      }
   }

   public Class1808 method7410() {
      return this.field9293;
   }
}
