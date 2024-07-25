package remapped;

import java.util.ArrayList;
import java.util.Collections;
import org.lwjgl.opengl.GL11;

public class class_9289 extends class_2596 {
   public final class_446 field_47380;
   public final class_446 field_47381;
   private int field_47387 = 0;
   private int field_47384 = 0;
   private boolean field_47378 = true;
   private class_7400 field_47388;
   private class_2440 field_47376 = new class_2440(325, 325);
   private class_2440 field_47379 = new class_2440(800, 800);
   private class_4879 field_47382;
   private class_1633 field_47389;
   private float field_47386;
   private float field_47385;
   private static long field_47377 = System.nanoTime();

   private int method_42759(int var1) {
      byte var4 = 122;
      short var5 = 140;
      byte var6 = 4;
      byte var7 = -6;
      int var8 = 122 * var6 + var6 * var7;
      if (var1 < var6) {
         return this.method_32109() / 2 - var8 / 2 + var1 * 122 + var1 * var7;
      } else {
         var1 -= var6;
         var6 = 3;
         var7 = 6;
         var8 = 122 * var6 + var6 * var7;
         return this.method_32109() / 2 - var8 / 2 + var1 * 122 + var1 * var7;
      }
   }

   private int method_42760() {
      return this.method_32137() / 2 - 100;
   }

   public class_9289() {
      super("Main Screen");
      this.method_32105(false);
      this.field_47376 = new class_2440(175, 325);
      this.field_47376.method_11119(class_4043.field_19620);
      this.field_47379.method_11119(class_4043.field_19618);
      boolean var3 = false;
      boolean var4 = false;
      byte var5 = 2;
      byte var6 = 2;
      byte var7 = 114;
      short var8 = 140;
      class_3384 var9 = class_3054.field_14994;
      boolean var10 = false;
      String var11 = "© Sigma Prod";
      StringBuilder var10000 = new StringBuilder().append("Sigma ");
      SigmaMainClass.method_3328();
      String var12 = var10000.append(SigmaMainClass.field_3957).append(" for Minecraft 1.8 to ").append(class_3347.field_16514.method_2045()).toString();
      this.method_32148(this.field_47382 = new class_4879(this, "particles"));
      short var13 = 480;
      short var14 = 480;
      this.method_32148(this.field_47389 = new class_1633(this, "group", (this.method_32109() - var13) / 2, this.method_32137() / 2 - 230, var13, var14));
      this.method_32148(
         this.field_47381 = new class_1552(
            this, "Copyright", 10, 8, var9.method_18547(var11), 140, new class_590(class_1255.field_6918.field_6917), var11, class_5320.field_27139
         )
      );
      class_590 var15 = new class_590(class_314.method_1444(class_1255.field_6918.field_6917, 0.5F));
      var15.method_2765(class_314.method_1444(class_1255.field_6918.field_6917, 0.5F));
      ArrayList var16 = new ArrayList();
      var16.add("LeakedPvP");
      var16.add("Omikron");
      Collections.shuffle(var16);
      String var17 = "by " + (String)var16.get(0) + ", " + (String)var16.get(1);
      this.method_32148(new class_1552(this, "names", 130, 9, var9.method_18547(var11), 140, var15, var17, class_3054.field_14989));
      this.method_32148(
         this.field_47380 = new class_1552(
            this,
            "Version",
            this.method_32109() - var9.method_18547(var12) - 9,
            this.method_32137() - 31,
            114,
            140,
            new class_590(class_1255.field_6918.field_6917),
            var12,
            var9
         )
      );
      this.method_32148(new class_1552(this, "Hello", 10, this.method_32137() - 55, 114, 140, new class_590(class_1255.field_6918.field_6917), "Hello,", var9));
      this.method_32148(
         new class_1552(
            this, "Latest", 10, this.method_32137() - 31, 114, 140, new class_590(class_1255.field_6918.field_6917), "You are using the latest version", var9
         )
      );
      this.field_47386 = (float)(this.method_32109() / 2);
      this.field_47385 = (float)(this.method_32137() / 2);
   }

   public void method_42761(class_266 var1) {
      MinecraftClient.method_8510().method_8609(var1);
      this.method_42758();
   }

   public void method_42762(class_2596 var1) {
      SigmaMainClass.method_3328().method_3299().method_30990(var1);
      this.method_42758();
   }

   public void method_42758() {
   }

   @Override
   public void method_32145(int var1, int var2) {
      float var5 = (float)var1 - this.field_47386;
      float var6 = (float)var2 - this.field_47385;
      this.field_47386 += var5 * 0.055F;
      this.field_47385 += var6 * 0.055F;
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      int var4 = Math.round((1.0F - class_9681.method_44756(this.field_47376.method_11123(), 0.0F, 1.0F, 1.0F)) * 5.0F);
      this.method_32124(var4);
      this.method_32130();
      GL11.glPushMatrix();
      GL11.glTranslated(
         (double)((int)((float)(-this.method_32109() / 200) + this.field_47386 / 200.0F)),
         (double)((int)((float)(-this.method_32137() / 100) + this.field_47385 / 100.0F) - var4),
         0.0
      );
      class_73.method_96(-10.0F, -10.0F, (float)(this.method_32109() + 20), (float)(this.method_32137() + 20), class_3054.field_15004);
      GL11.glPopMatrix();
      this.field_47389
         .method_32138(
            (int)((float)(-this.method_32109() / 40) + this.field_47386 / 40.0F), (int)((float)(-this.method_32137() / 40) + this.field_47385 / 40.0F) + var4
         );
      this.field_47382
         .method_32138(
            (int)((float)(-this.method_32109() / 12) + this.field_47386 / 12.0F), (int)((float)(-this.method_32137() / 12) + this.field_47385 / 12.0F)
         );
      super.method_32178(var1);
   }
}
