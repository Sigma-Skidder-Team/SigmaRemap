package remapped;

import java.net.MalformedURLException;
import java.net.URL;

public class class_3778 extends class_2596 {
   public static class_2440 field_18445 = new class_2440(300, 200, class_4043.field_19618);
   public static float field_18442;
   public static float field_18444;

   public class_3778() {
      super("Switch");
      this.method_32105(false);
      short var3 = 537;
      short var4 = 264;
      byte var5 = 93;
      byte var6 = 61;
      int var7 = (this.method_32109() - var3) / 2;
      int var8 = (this.method_32137() - var5) / 2 + 14;
      class_4643 var9 = null;
      class_4643 var10 = null;
      class_4643 var11 = null;
      this.method_32148(var9 = new class_4643(this, "pb", var7, var8, var3, var5, class_2209.field_11048));
      this.method_32148(var11 = new class_4643(this, "pb2", var7, var5 + var8 + 9, var4, var6, class_2209.field_11003));
      this.method_32148(var10 = new class_4643(this, "pb3", var7 + var4 + 9, var5 + var8 + 9, var4, var6, class_2209.field_11035));
      var9.method_32100((var0, var1) -> {
         SigmaMainClass.method_3328().method_3327(class_6015.field_30642);
         MinecraftClient.getInstance().method_8609(new class_1876());
      });
      var10.method_32100((var0, var1) -> {
         SigmaMainClass.method_3328().method_3327(class_6015.field_30645);
         MinecraftClient.getInstance().method_8609(new class_1876());
      });
      var11.method_32100((var0, var1) -> {
         SigmaMainClass.method_3328().method_3327(class_6015.field_30644);
         MinecraftClient.getInstance().method_8609(new class_1876());
      });
      class_7038 var12 = new class_7038(this, "socialbtns", (this.method_32109() - 174) / 2, this.method_32137() - 70, 174, 34);
      class_3304 var13;
      var12.method_32148(var13 = new class_3304(var12, "youtube", 0, 0, 65, 34, class_2209.field_11031));
      class_3304 var14;
      var12.method_32148(var14 = new class_3304(var12, "reddit", 85, 0, 36, 34, class_2209.field_11043));
      class_3304 var15;
      var12.method_32148(var15 = new class_3304(var12, "guilded", 142, 0, 32, 34, class_2209.field_10994));
      var13.method_32100((var0, var1) -> {
         try {
            Util.getOperatingSystem().method_37577(new URL("http://jelloconnect.sigmaclient.info/urls/youtube.php"));
         } catch (MalformedURLException var5x) {
         }
      });
      var14.method_32100((var0, var1) -> {
         try {
            Util.getOperatingSystem().method_37577(new URL("http://jelloconnect.sigmaclient.info/urls/reddit.php"));
         } catch (MalformedURLException var5x) {
         }
      });
      var15.method_32100((var0, var1) -> {
         try {
            Util.getOperatingSystem().method_37577(new URL("http://jelloconnect.sigmaclient.info/urls/guilded.php"));
         } catch (MalformedURLException var5x) {
         }
      });
      this.method_32148(var12);
   }

   @Override
   public void method_32145(int var1, int var2) {
      float var5 = (float)var1 - field_18442;
      float var6 = (float)var2 - field_18444;
      field_18442 += var5 * 0.09F;
      field_18444 += var6 * 0.09F;
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      if (class_6340.field_32369 != null) {
         field_18445.method_11119(class_4043.field_19620);
         byte var4 = 40;
         float var5 = -field_18442 / (float) MinecraftClient.getInstance().window.method_43166();
         float var6 = -field_18444 / (float) MinecraftClient.getInstance().window.method_43163();
         class_73.method_96(
            (float)var4 * var5,
            (float)var4 * var6,
            (float)(MinecraftClient.getInstance().window.method_43166() + var4),
            (float)(MinecraftClient.getInstance().window.method_43163() + var4),
            class_6340.field_32369
         );
         float var7 = class_5181.method_23766(field_18445.method_11123(), 0.16, 0.71, 0.0, 0.99);
         int var8 = (MinecraftClient.getInstance().window.method_43166() - 455) / 2;
         int var9 = (int)((float)((MinecraftClient.getInstance().window.method_43163() - 78) / 2 - 14) - 116.0F * var7);
         class_73.method_103(
            0.0F,
            0.0F,
            (float) MinecraftClient.getInstance().window.method_43166(),
            (float) MinecraftClient.getInstance().window.method_43163(),
            class_314.method_1444(class_1255.field_6929.field_6917, 0.3F)
         );
         super.method_32178(var1);
         class_73.method_99(
            0.0F,
            0.0F,
            (float) MinecraftClient.getInstance().window.method_43166(),
            (float) MinecraftClient.getInstance().window.method_43163(),
            class_6340.field_32371,
            class_314.method_1444(class_1255.field_6918.field_6917, 1.0F - field_18445.method_11123())
         );
         class_73.method_103(
            0.0F,
            0.0F,
            (float) MinecraftClient.getInstance().window.method_43166(),
            (float) MinecraftClient.getInstance().window.method_43163(),
            class_314.method_1444(0, 0.75F * (1.0F - field_18445.method_11123()))
         );
         class_73.method_96((float)var8, (float)var9, 455.0F, 78.0F, class_6340.field_32372);
      }
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 256) {
         MinecraftClient.getInstance().method_8609(new class_1876());
      }
   }
}
