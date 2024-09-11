package mapped;

import com.google.common.collect.Queues;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.util.Util;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Deque;

public class ToastGui extends AbstractGui {
   private final Minecraft field6688;
   private final Class9765<?>[] field6689 = new Class9765[5];
   private final Deque<Class7601> field6690 = Queues.newArrayDeque();

   public ToastGui(Minecraft var1) {
      this.field6688 = var1;
   }

   public void func_238541_a_(MatrixStack var1) {
      if (!this.field6688.gameSettings.hideGUI) {
         for (int var4 = 0; var4 < this.field6689.length; var4++) {
            Class9765<?> var5 = this.field6689[var4];
            if (var5 != null && var5.method38405(this.field6688.getMainWindow().getScaledWidth(), var4, var1)) {
               this.field6689[var4] = null;
            }

            if (this.field6689[var4] == null && !this.field6690.isEmpty()) {
               this.field6689[var4] = new Class9765(this.field6690.removeFirst());
            }
         }
      }
   }

   @Nullable
   public <T extends Class7601> T method5912(Class<? extends T> var1, Object var2) {
      for (Class9765 var8 : this.field6689) {
         if (var8 != null && var1.isAssignableFrom(var8.method38403().getClass()) && var8.method38403().method24897().equals(var2)) {
            return (T)var8.method38403();
         }
      }

      for (Class7601 var10 : this.field6690) {
         if (var1.isAssignableFrom(var10.getClass()) && var10.method24897().equals(var2)) {
            return (T)var10;
         }
      }

      return null;
   }

   public void method5913() {
      Arrays.fill(this.field6689, null);
      this.field6690.clear();
   }

   public void method5914(Class7601 var1) {
      this.field6690.add(var1);
   }

   public Minecraft method5915() {
      return this.field6688;
   }

   // $VF: synthetic method
   public static Minecraft method5916(ToastGui var0) {
      return var0.field6688;
   }

   public class Class9765<T extends Class7601> {
      private final T field45685;
      private long field45686;
      private long field45687;
      private Class2139 field45688;

      public Class9765(T var1) {
         this.field45686 = -1L;
         this.field45687 = -1L;
         this.field45688 = Class2139.field14003;
         this.field45685 = var1;
      }

      public T method38403() {
         return this.field45685;
      }

      private float method38404(long var1) {
         float var5 = MathHelper.clamp((float)(var1 - this.field45686) / 600.0F, 0.0F, 1.0F);
         var5 *= var5;
         return this.field45688 != Class2139.field14004 ? var5 : 1.0F - var5;
      }

      public boolean method38405(int var1, int var2, MatrixStack var3) {
         long var6 = Util.milliTime();
         if (this.field45686 == -1L) {
            this.field45686 = var6;
            this.field45688.method8832(method5916(ToastGui.this).getSoundHandler());
         }

         if (this.field45688 == Class2139.field14003 && var6 - this.field45686 <= 600L) {
            this.field45687 = var6;
         }

         RenderSystem.pushMatrix();
         RenderSystem.translatef(
            (float)var1 - (float)this.field45685.method24898() * this.method38404(var6), (float)(var2 * this.field45685.method24899()), (float)(800 + var2)
         );
         Class2139 var8 = this.field45685.method24894(var3, ToastGui.this, var6 - this.field45687);
         RenderSystem.popMatrix();
         if (var8 != this.field45688) {
            this.field45686 = var6 - (long)((int)((1.0F - this.method38404(var6)) * 600.0F));
            this.field45688 = var8;
            this.field45688.method8832(method5916(ToastGui.this).getSoundHandler());
         }

         return this.field45688 == Class2139.field14004 && var6 - this.field45686 > 600L;
      }
   }
}
