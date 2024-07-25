package remapped;

import java.awt.Rectangle;
import java.util.ArrayList;
import org.lwjgl.opengl.GL11;

public class class_5702 extends class_2596 {
   private int field_28854 = 0;
   private int field_28853 = 0;
   private boolean field_28855 = true;
   private float field_28865 = 0.0F;
   private float field_28859 = 0.0F;
   private class_8343 field_28857;
   private class_943 field_28863;
   private class_7988 field_28862;
   private class_9618 field_28856;
   private class_8223 field_28860;
   private boolean field_28864 = false;
   private class_2440 field_28858 = new class_2440(250, 250, class_4043.field_19618);

   public class_5702() {
      super("Credits");
      this.method_32105(false);
      this.field_28857 = class_2209.method_10229("com/mentalfrostbyte/gui/resources/" + class_2209.method_10230(), 0.075F, 8);
      this.method_32148(
         this.field_28863 = new class_943(
            this,
            "login",
            (this.field_36278 - class_943.field_4815) / 2,
            (this.field_36257 - class_943.field_4813) / 2,
            class_943.field_4815,
            class_943.field_4813
         )
      );
      this.method_32148(
         this.field_28862 = new class_7988(
            this,
            "register",
            (this.field_36278 - class_7988.field_40927) / 2,
            (this.field_36257 - class_7988.field_40931) / 2,
            class_7988.field_40927,
            class_7988.field_40931
         )
      );
      this.method_25786();
      this.method_32148(
         this.field_28860 = new class_8223(
            this,
            "continue",
            this.field_36278 / 2 - 120,
            this.field_36257 / 2 + 120,
            240,
            60,
            new class_590(class_314.method_1444(class_1255.field_6918.field_6917, 0.5F)),
            "Continue",
            class_5320.field_27141
         )
      );
      this.field_28860.method_32104(false);
      this.field_28863.method_8236(var1 -> {
         this.field_28864 = true;
         this.field_28860.method_32104(true);
      });
      this.field_28860.method_32100((var0, var1) -> MinecraftClient.method_8510().method_8609(new class_1876()));
   }

   public void method_25788() {
      this.field_28863.method_32104(false);
      this.field_28862.method_32104(true);
   }

   public void method_25786() {
      this.field_28863.method_32104(true);
      this.field_28862.method_32104(false);
   }

   public void method_25789(String var1, String var2) {
      if (this.field_28856 == null) {
         this.method_32102(() -> {
            ArrayList var5 = new ArrayList();
            var5.add(new class_8888(class_2880.field_14100, var1, 45));
            String[] var6 = class_314.method_1393(var2, 240, class_5320.field_27152);

            for (int var7 = 0; var7 < var6.length; var7++) {
               var5.add(new class_8888(class_2880.field_14098, var6[var7], var7 != var6.length - 1 ? 14 : 35));
            }

            var5.add(new class_8888(class_2880.field_14103, "Ok", 55));
            this.method_32150(this.field_28856 = new class_9618(this, "modal", true, "", var5.<class_8888>toArray(new class_8888[0])));
            this.field_28856.method_44409(var1xx -> new Thread(() -> {
                  try {
                     Thread.sleep(114L);
                     this.method_32102(() -> {
                        this.method_32179(this.field_28856);
                        this.field_28856 = null;
                     });
                  } catch (InterruptedException var4) {
                     var4.printStackTrace();
                  }
               }).start());
            this.field_28856.method_44406(true);
         });
      }
   }

   @Override
   public void method_32178(float var1) {
      class_2209.field_11026.method_38419();
      this.field_28865 = Math.max(0.0F, Math.min(this.field_28865 + 0.075F, 1.0F));
      if (this.field_28864) {
         this.field_28858.method_11119(class_4043.field_19620);
      }

      this.method_25787();
      float var4 = (float)Math.sin((double)class_9681.method_44756(this.field_28865, 0.0F, 1.0F, 1.0F) * Math.PI / 2.0);
      if (this.field_28864) {
         var4 = 1.0F
            - (float)Math.sin((Math.PI / 2) + (double)class_9681.method_44754(1.0F - this.field_28858.method_11123(), 0.0F, 1.0F, 1.0F) * (Math.PI / 2)) * 0.2F;
      }

      this.field_28863.method_32133(var4);
      this.field_28863.method_32146(var4);
      this.field_28862.method_32133(var4);
      this.field_28862.method_32146(var4);
      Rectangle var5 = class_73.method_123(class_73.method_84(this.field_28863), this.field_28863.method_32191(), this.field_28863.method_32152());
      if (this.field_28862.method_32126()) {
         var5 = class_73.method_123(class_73.method_84(this.field_28862), this.field_28862.method_32191(), this.field_28862.method_32152());
      }

      if ((double)var4 > 0.1) {
         class_73.method_115(
            (int)((double)this.field_36278 - var5.getWidth()) / 2,
            (int)((double)this.field_36257 - var5.getHeight()) / 2,
            (int)var5.getWidth(),
            (int)var5.getHeight(),
            class_314.method_1444(class_1255.field_6918.field_6917, 1.0F - this.field_28858.method_11123())
         );
      }

      if (this.field_28864 && this.field_28858.method_11123() == 1.0F) {
         this.field_28863.method_32104(false);
      }

      if (this.field_28864) {
         String var6 = SigmaMainClass.method_3328().method_3332().method_23081().field_19615;
         String var7 = "Welcome back";
         byte var8 = 100;
         byte var9 = 10;
         int var10 = var8 + Math.max(class_5320.field_27147.method_18547(var7), class_5320.field_27140.method_18547(var6)) + var9 * 10;
         int var11 = (this.field_36278 - var10) / 2;
         int var12 = (this.field_36257 - var8 * 2) / 2;
         class_73.method_94(
            0.0F,
            0.0F,
            (float)this.field_36278,
            (float)this.field_36257,
            class_314.method_1444(class_1255.field_6929.field_6917, 0.45F * this.field_28858.method_11123())
         );
         class_73.method_97(
            (float)(var11 + 20), (float)(var12 + 40), (float)(var8 + 30), (float)(var8 + 30), class_2209.field_11049, this.field_28858.method_11123()
         );
         short var13 = 165;
         byte var14 = 54;
         class_73.method_87(class_5320.field_27147, (float)(var11 + var13), (float)(var12 + var14), var7, class_1255.field_6918.field_6917);
         class_73.method_87(class_5320.field_27140, (float)(var11 + var13), (float)(var12 + var14 + 45), var6, class_1255.field_6918.field_6917);
      }

      GL11.glPushMatrix();
      this.field_28860.method_32178(this.field_28858.method_11123());
      GL11.glPopMatrix();
      super.method_32178(1.0F - this.field_28858.method_11123());
   }

   private void method_25787() {
      this.field_28859 = Math.max(0.0F, Math.min(this.field_28859 + 0.01F, 1.0F));
      int var3 = this.method_32189() * -1;
      float var4 = (float)this.method_32129() / (float)this.method_32109() * -114.0F;
      if (this.field_28855) {
         this.field_28854 = (int)var4;
         this.field_28853 = var3;
         this.field_28855 = false;
      }

      float var5 = var4 - (float)this.field_28854;
      float var6 = (float)(var3 - this.field_28853);
      float var7 = (float)Math.sin((double)class_9681.method_44756(this.field_28859, 0.0F, 1.0F, 1.0F) * Math.PI / 2.0);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)this.field_36278 / 2.0F, (float)this.field_36278 / 2.0F, 0.0F);
      GL11.glScalef(1.0F + var7 * 0.2F, 1.0F + var7 * 0.2F, 0.0F);
      GL11.glTranslatef((float)(-this.field_36278) / 2.0F, (float)(-this.field_36278) / 2.0F, 0.0F);
      class_73.method_153(
         (float)this.field_28853,
         (float)this.field_28854,
         (float)(this.method_32109() * 2),
         (float)(this.method_32137() + 114),
         this.field_28857,
         class_314.method_1444(class_1255.field_6918.field_6917, this.field_28865)
      );
      GL11.glPopMatrix();
      float var8 = 0.5F;
      if (var4 != (float)this.field_28854) {
         this.field_28854 = (int)((float)this.field_28854 + var5 * var8);
      }

      if (var3 != this.field_28853) {
         this.field_28853 = (int)((float)this.field_28853 + var6 * var8);
      }
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 256) {
         MinecraftClient.method_8510().method_8609(new class_1876());
      }
   }
}
