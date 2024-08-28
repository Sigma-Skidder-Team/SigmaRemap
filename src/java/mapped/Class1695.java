package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class1695 implements AutoCloseable {
   private final Class7529 field9231;
   private final Class291 field9232;
   private final Class4520 field9233;
   public final Class194 field9234;

   public Class1695(Class194 var1, Class7529 var2) {
      this.field9234 = var1;
      this.field9231 = var2;
      this.field9232 = new Class291(128, 128, true);
      ResourceLocation var5 = Class194.method598(var1).method1077("map/" + var2.method24608(), this.field9232);
      this.field9233 = Class4520.method14339(var5);
   }

   private void method7290() {
      for (int var3 = 0; var3 < 128; var3++) {
         for (int var4 = 0; var4 < 128; var4++) {
            int var5 = var4 + var3 * 128;
            int var6 = this.field9231.field32322[var5] & 255;
            if (var6 / 4 != 0) {
               this.field9232.method1141().method7890(var4, var3, Class7210.field30946[var6 / 4].method22640(var6 & 3));
            } else {
               this.field9232.method1141().method7890(var4, var3, 0);
            }
         }
      }

      this.field9232.method1140();
   }

   private void method7291(MatrixStack var1, Class7733 var2, boolean var3, int var4) {
      boolean var7 = false;
      boolean var8 = false;
      float var9 = 0.0F;
      Class9367 var10 = var1.method35296().method32361();
      Class5422 var11 = var2.method25597(this.field9233);
      var11.method17040(var10, 0.0F, 128.0F, -0.01F).method17026(255, 255, 255, 255).method17027(0.0F, 1.0F).method17034(var4).method17031();
      var11.method17040(var10, 128.0F, 128.0F, -0.01F).method17026(255, 255, 255, 255).method17027(1.0F, 1.0F).method17034(var4).method17031();
      var11.method17040(var10, 128.0F, 0.0F, -0.01F).method17026(255, 255, 255, 255).method17027(1.0F, 0.0F).method17034(var4).method17031();
      var11.method17040(var10, 0.0F, 0.0F, -0.01F).method17026(255, 255, 255, 255).method17027(0.0F, 0.0F).method17034(var4).method17031();
      int var12 = 0;

      for (Class7982 var14 : this.field9231.field32327.values()) {
         if (!var3 || var14.method27130()) {
            var1.method35294();
            var1.method35291((double)(0.0F + (float)var14.method27127() / 2.0F + 64.0F), (double)(0.0F + (float)var14.method27128() / 2.0F + 64.0F), -0.02F);
            var1.method35293(Class7680.field32902.method25286((float)(var14.method27129() * 360) / 16.0F));
            var1.method35292(4.0F, 4.0F, 3.0F);
            var1.method35291(-0.125, 0.125, 0.0);
            byte var15 = var14.method27125();
            float var16 = (float)(var15 % 16 + 0) / 16.0F;
            float var17 = (float)(var15 / 16 + 0) / 16.0F;
            float var18 = (float)(var15 % 16 + 1) / 16.0F;
            float var19 = (float)(var15 / 16 + 1) / 16.0F;
            Class9367 var20 = var1.method35296().method32361();
            float var21 = -0.001F;
            Class5422 var22 = var2.method25597(Class194.method599());
            var22.method17040(var20, -1.0F, 1.0F, (float)var12 * -0.001F)
               .method17026(255, 255, 255, 255)
               .method17027(var16, var17)
               .method17034(var4)
               .method17031();
            var22.method17040(var20, 1.0F, 1.0F, (float)var12 * -0.001F)
               .method17026(255, 255, 255, 255)
               .method17027(var18, var17)
               .method17034(var4)
               .method17031();
            var22.method17040(var20, 1.0F, -1.0F, (float)var12 * -0.001F)
               .method17026(255, 255, 255, 255)
               .method17027(var18, var19)
               .method17034(var4)
               .method17031();
            var22.method17040(var20, -1.0F, -1.0F, (float)var12 * -0.001F)
               .method17026(255, 255, 255, 255)
               .method17027(var16, var19)
               .method17034(var4)
               .method17031();
            var1.method35295();
            if (var14.method27131() != null) {
               Class9834 var23 = Minecraft.getInstance().field1294;
               ITextComponent var24 = var14.method27131();
               float var25 = (float)var23.method38821(var24);
               float var26 = MathHelper.method37777(25.0F / var25, 0.0F, 0.6666667F);
               var1.method35294();
               var1.method35291(
                  (double)(0.0F + (float)var14.method27127() / 2.0F + 64.0F - var25 * var26 / 2.0F),
                  (double)(0.0F + (float)var14.method27128() / 2.0F + 64.0F + 4.0F),
                  -0.025F
               );
               var1.method35292(var26, var26, 1.0F);
               var1.method35291(0.0, 0.0, -0.1F);
               var23.method38812(var24, 0.0F, 0.0F, -1, false, var1.method35296().method32361(), var2, false, Integer.MIN_VALUE, var4);
               var1.method35295();
            }

            var12++;
         }
      }
   }

   @Override
   public void close() {
      this.field9232.close();
   }

   // $VF: synthetic method
   public static void method7292(Class1695 var0) {
      var0.method7290();
   }

   // $VF: synthetic method
   public static void method7293(Class1695 var0, MatrixStack var1, Class7733 var2, boolean var3, int var4) {
      var0.method7291(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static Class7529 method7294(Class1695 var0) {
      return var0.field9231;
   }
}
