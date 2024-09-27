package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.IngameGui;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.optifine.Config;
import org.lwjgl.opengl.GL11;

public class Class8578 {
   private static Minecraft field38570;
   private static GameSettings field38571;
   private static IProfiler field38572;
   public static boolean field38573 = false;
   public static Class8639 field38574 = new Class8639();
   public static Class8639 field38575 = new Class8639();
   public static Class8639 field38576 = new Class8639();
   public static Class8639 field38577 = new Class8639();
   public static Class8639 field38578 = new Class8639();
   public static Class8639 field38579 = new Class8639();
   public static Class8639 field38580 = new Class8639();
   private static long[] field38581 = new long[512];
   private static long[] field38582 = new long[512];
   private static long[] field38583 = new long[512];
   private static long[] field38584 = new long[512];
   private static long[] field38585 = new long[512];
   private static long[] field38586 = new long[512];
   private static long[] field38587 = new long[512];
   private static long[] field38588 = new long[512];
   private static boolean[] field38589 = new boolean[512];
   private static int field38590 = 0;
   private static long field38591 = -1L;
   private static long field38592 = 0L;

   public static void method30656() {
      if (field38570 == null) {
         field38570 = Minecraft.getInstance();
         field38571 = field38570.gameSettings;
         field38572 = field38570.getProfiler();
      }

      if (field38571.showDebugInfo && (field38571.field44697 || field38571.field44666)) {
         field38573 = true;
         long var2 = System.nanoTime();
         if (field38591 != -1L) {
            int var4 = field38590 & field38581.length - 1;
            field38590++;
            boolean var5 = Class8777.method31654();
            field38581[var4] = var2 - field38591 - field38592;
            field38582[var4] = field38574.field38891;
            field38583[var4] = field38575.field38891;
            field38584[var4] = field38576.field38891;
            field38585[var4] = field38577.field38891;
            field38586[var4] = field38578.field38891;
            field38587[var4] = field38579.field38891;
            field38588[var4] = field38580.field38891;
            field38589[var4] = var5;
            Class8639.method31037(field38574);
            Class8639.method31037(field38575);
            Class8639.method31037(field38578);
            Class8639.method31037(field38577);
            Class8639.method31037(field38576);
            Class8639.method31037(field38579);
            Class8639.method31037(field38580);
            field38591 = System.nanoTime();
         } else {
            field38591 = var2;
         }
      } else {
         field38573 = false;
         field38591 = -1L;
      }
   }

   public static void method30657(MatrixStack var0, int var1) {
      if (field38571 != null && (field38571.field44697 || field38571.field44666)) {
         long var4 = System.nanoTime();
         GlStateManager.method23883(256);
         GlStateManager.matrixMode(5889);
         GlStateManager.method23832();
         int var6 = field38570.getMainWindow().getFramebufferWidth();
         int var7 = field38570.getMainWindow().getFramebufferHeight();
         GlStateManager.enableColorMaterial();
         GlStateManager.loadIdentity();
         GlStateManager.ortho(0.0, (double)var6, (double)var7, 0.0, 1000.0, 3000.0);
         GlStateManager.matrixMode(5888);
         GlStateManager.method23832();
         GlStateManager.loadIdentity();
         GlStateManager.translatef(0.0F, 0.0F, -2000.0F);
         GL11.glLineWidth(1.0F);
         GlStateManager.method23805();
         Tessellator var8 = Tessellator.getInstance();
         BufferBuilder var9 = var8.getBuffer();
         var9.begin(1, DefaultVertexFormats.POSITION_COLOR);

         for (int var10 = 0; var10 < field38581.length; var10++) {
            int var11 = (var10 - field38590 & field38581.length - 1) * 100 / field38581.length;
            var11 += 155;
            float var12 = (float)var7;
            long var20 = 0L;
            if (!field38589[var10]) {
               method30658(var10, field38581[var10], var11, var11, var11, var12, var9);
               var12 -= (float)method30658(var10, field38588[var10], var11 / 2, var11 / 2, var11 / 2, var12, var9);
               var12 -= (float)method30658(var10, field38587[var10], 0, var11, 0, var12, var9);
               var12 -= (float)method30658(var10, field38586[var10], var11, var11, 0, var12, var9);
               var12 -= (float)method30658(var10, field38585[var10], var11, 0, 0, var12, var9);
               var12 -= (float)method30658(var10, field38584[var10], var11, 0, var11, var12, var9);
               var12 -= (float)method30658(var10, field38583[var10], 0, 0, var11, var12, var9);
               float var15 = var12 - (float)method30658(var10, field38582[var10], 0, var11, var11, var12, var9);
            } else {
               method30658(var10, field38581[var10], var11, var11 / 2, 0, var12, var9);
            }
         }

         method30659(0, field38581.length, 33333333L, 196, 196, 196, (float)var7, var9);
         method30659(0, field38581.length, 16666666L, 196, 196, 196, (float)var7, var9);
         var8.draw();
         GlStateManager.enableTexture();
         int var22 = var7 - 80;
         int var24 = var7 - 160;
         field38570.fontRenderer.method38801(var0, "30", 2.0F, (float)(var24 + 1), -8947849);
         field38570.fontRenderer.method38801(var0, "30", 1.0F, (float)var24, -3881788);
         field38570.fontRenderer.method38801(var0, "60", 2.0F, (float)(var22 + 1), -8947849);
         field38570.fontRenderer.method38801(var0, "60", 1.0F, (float)var22, -3881788);
         GlStateManager.matrixMode(5889);
         GlStateManager.method23833();
         GlStateManager.matrixMode(5888);
         GlStateManager.method23833();
         GlStateManager.enableTexture();
         float var31 = 1.0F - (float)((double)(System.currentTimeMillis() - Class8777.method31652()) / 1000.0);
         var31 = Config.method26832(var31, 0.0F, 1.0F);
         int var13 = (int)(170.0F + var31 * 85.0F);
         int var14 = (int)(100.0F + var31 * 55.0F);
         int var33 = (int)(10.0F + var31 * 10.0F);
         int var16 = var13 << 16 | var14 << 8 | var33;
         int var17 = 512 / var1 + 2;
         int var18 = var7 / var1 - 8;
         IngameGui var19 = field38570.ingameGUI;
         IngameGui.method5686(var0, var17 - 1, var18 - 1, var17 + 50, var18 + 10, -1605349296);
         field38570.fontRenderer.method38801(var0, " " + Class8777.method31655() + " MB/s", (float)var17, (float)var18, var16);
         field38592 = System.nanoTime() - var4;
      }
   }

   private static long method30658(int var0, long var1, int var3, int var4, int var5, float var6, BufferBuilder var7) {
      long var10 = var1 / 200000L;
      if (var10 >= 3L) {
         var7.pos((double)((float)var0 + 0.5F), (double)(var6 - (float)var10 + 0.5F), 0.0).color(var3, var4, var5, 255).endVertex();
         var7.pos((double)((float)var0 + 0.5F), (double)(var6 + 0.5F), 0.0).color(var3, var4, var5, 255).endVertex();
         return var10;
      } else {
         return 0L;
      }
   }

   private static long method30659(int var0, int var1, long var2, int var4, int var5, int var6, float var7, BufferBuilder var8) {
      long var11 = var2 / 200000L;
      if (var11 >= 3L) {
         var8.pos((double)((float)var0 + 0.5F), (double)(var7 - (float)var11 + 0.5F), 0.0).color(var4, var5, var6, 255).endVertex();
         var8.pos((double)((float)var1 + 0.5F), (double)(var7 - (float)var11 + 0.5F), 0.0).color(var4, var5, var6, 255).endVertex();
         return var11;
      } else {
         return 0L;
      }
   }

   public static boolean method30660() {
      return field38573;
   }
}
