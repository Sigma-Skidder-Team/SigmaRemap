package remapped;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import java.util.function.IntSupplier;

public class class_7280 implements AutoCloseable {
   private final class_4261 field_37268;
   public final class_4230 field_37270;
   public final class_4230 field_37272;
   private final List<IntSupplier> field_37273 = Lists.newArrayList();
   private final List<String> field_37271 = Lists.newArrayList();
   private final List<Integer> field_37267 = Lists.newArrayList();
   private final List<Integer> field_37275 = Lists.newArrayList();
   private class_8107 field_37269;

   public class_7280(class_7832 var1, String var2, class_4230 var3, class_4230 var4) throws IOException {
      this.field_37268 = new class_4261(var1, var2);
      this.field_37270 = var3;
      this.field_37272 = var4;
   }

   @Override
   public void close() {
      this.field_37268.close();
   }

   public void method_33270(String var1, IntSupplier var2, int var3, int var4) {
      this.field_37271.add(this.field_37271.size(), var1);
      this.field_37273.add(this.field_37273.size(), var2);
      this.field_37267.add(this.field_37267.size(), var3);
      this.field_37275.add(this.field_37275.size(), var4);
   }

   public void method_33274(class_8107 var1) {
      this.field_37269 = var1;
   }

   public void method_33273(float var1) {
      this.field_37270.method_19723();
      float var4 = (float)this.field_37272.field_20533;
      float var5 = (float)this.field_37272.field_20535;
      RenderSystem.method_16392(0, 0, (int)var4, (int)var5);
      this.field_37268.method_19847("DiffuseSampler", this.field_37270::method_19724);

      for (int var6 = 0; var6 < this.field_37273.size(); var6++) {
         this.field_37268.method_19847(this.field_37271.get(var6), this.field_37273.get(var6));
         this.field_37268
            .method_19853("AuxSize" + var6)
            .method_32386((float)this.field_37267.get(var6).intValue(), (float)this.field_37275.get(var6).intValue());
      }

      this.field_37268.method_19853("ProjMat").method_32390(this.field_37269);
      this.field_37268.method_19853("InSize").method_32386((float)this.field_37270.field_20533, (float)this.field_37270.field_20535);
      this.field_37268.method_19853("OutSize").method_32386(var4, var5);
      this.field_37268.method_19853("Time").method_32385(var1);
      MinecraftClient var10 = MinecraftClient.getInstance();
      this.field_37268.method_19853("ScreenSize").method_32386((float)var10.getMainWindow().getFramebufferWidth(), (float)var10.getMainWindow().getFramebufferHeight());
      this.field_37268.method_19852();
      this.field_37272.method_19712(MinecraftClient.IS_SYSTEM_MAC);
      this.field_37272.method_19717(false);
      RenderSystem.method_16457(519);
      class_9633 var7 = class_8042.method_36499().method_36501();
      var7.method_44471(7, class_7985.field_40903);
      var7.method_35761(0.0, 0.0, 500.0).method_35743(255, 255, 255, 255).method_35735();
      var7.method_35761((double)var4, 0.0, 500.0).method_35743(255, 255, 255, 255).method_35735();
      var7.method_35761((double)var4, (double)var5, 500.0).method_35743(255, 255, 255, 255).method_35735();
      var7.method_35761(0.0, (double)var5, 500.0).method_35743(255, 255, 255, 255).method_35735();
      var7.method_44487();
      class_138.method_554(var7);
      RenderSystem.method_16457(515);
      this.field_37268.method_19843();
      this.field_37272.method_19723();
      this.field_37270.method_19719();

      for (Object var9 : this.field_37273) {
         if (var9 instanceof class_4230) {
            ((class_4230)var9).method_19719();
         }
      }
   }

   public class_4261 method_33272() {
      return this.field_37268;
   }
}
