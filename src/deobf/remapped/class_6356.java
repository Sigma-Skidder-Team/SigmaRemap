package remapped;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map.Entry;

public class class_6356 extends class_2596 {
   private static MinecraftClient field_32510 = MinecraftClient.getInstance();
   private static float field_32506;
   private float field_32514;
   private class_7903 field_32509;
   private class_2612 field_32507;
   private class_1767 field_32512;
   private int field_32511 = 20;
   private int field_32513 = 642;
   private int field_32508 = 410;
   private int field_32503 = 55;
   private int field_32505 = 200;
   public boolean field_32516 = true;
   private class_8343 field_32504;

   public class_6356() {
      super("JelloChat");
      this.method_32148(
         this.field_32509 = new class_7903(
            this, "input", this.field_32511, this.method_32137() - this.field_32503 - this.field_32511, this.field_32513, this.field_32503
         )
      );
      this.method_32148(
         this.field_32507 = new class_2612(
            this,
            "navbar",
            this.field_32511,
            this.method_32137() - this.field_32503 - this.field_32511 * 2 - this.field_32508 + 80,
            this.field_32505,
            this.field_32508 - 90
         )
      );
      this.method_32148(
         this.field_32512 = new class_1767(
            this,
            "chatView",
            this.field_32511 + this.field_32505,
            this.method_32137() - this.field_32503 - this.field_32511 * 2 - this.field_32508,
            this.field_32513 - this.field_32505,
            this.field_32508
         )
      );
      byte var3 = 55;
      System.out.println("loading");

      for (Entry var5 : SigmaMainClass.getInstance().method_3332().field_25933.method_20859().entrySet()) {
         System.out.println("added " + ((class_4567)var5.getValue()).field_22260);
         this.field_32507
            .method_32148(
               new class_9729(
                  this.field_32507,
                  ((class_4567)var5.getValue()).field_22257 + "_" + this.field_32507.method_32134().size(),
                  0,
                  0,
                  this.field_32507.method_32109(),
                  var3,
                  ((class_4567)var5.getValue()).field_22258,
                  ((class_4567)var5.getValue()).field_22259
               )
            );
      }
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      this.method_32105(false);
      this.field_32513 = 642;
      this.field_32509.method_32142(this.field_32513);
   }

   @Override
   public int method_11773() {
      return 60;
   }

   public void method_29128(String var1) {
      this.field_32512.method_7900(var1);
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 256) {
         field_32510.method_8609(null);
      }
   }

   @Override
   public void method_32178(float var1) {
      byte var4 = 50;
      byte var5 = 10;
      this.field_32514 = Math.min(1.0F, this.field_32514 + 0.1F);
      float var6 = class_9556.method_44073(this.field_32514, 0.0F, 1.0F, 1.0F);
      this.field_32509.method_32124(this.field_32503 + this.field_32511 - (int)(var6 * (float)(this.field_32503 + this.field_32511)));
      this.method_32124((int)((1.0F - this.field_32514) * 10.0F));
      this.method_32130();
      int var7 = this.field_32511;
      int var8 = this.method_32137() - this.field_32503 - this.field_32511 * 2 - 410;
      int var9 = this.field_32513;
      int var10 = this.field_32508;

      try {
         if (this.field_32516) {
            BufferedImage var11 = class_7849.method_35508(var7, var8, 200, var10, 10, 14, 0, true);
            this.field_32504 = class_6568.method_30015("blur", class_7849.method_35501(var11, 0.0F, 1.1F, 1.3F));
         }
      } catch (IOException var12) {
         var12.printStackTrace();
      }

      this.field_32516 = !this.field_32516;
      var1 = class_9681.method_44754(this.field_32514, 0.0F, 1.0F, 1.0F);
      class_73.method_128((float)(var7 + 5), (float)(var8 + 5), (float)(this.field_32505 - 10), (float)(var10 - 10), 25.0F, var1 * 0.4F);
      class_73.method_86((float)var7, (float)var8, (float)var9, (float)var10, 10.0F);
      if (this.field_32504 != null) {
         class_73.method_99(
            (float)var7, (float)var8, (float)this.field_32505, (float)var10, this.field_32504, class_314.method_1444(class_1255.field_6918.field_6917, var1)
         );
      }

      class_73.method_94(
         (float)var7, (float)var8, (float)(var7 + this.field_32505), (float)(var8 + 80), class_314.method_1444(class_1255.field_6929.field_6917, 0.14F)
      );
      class_73.method_145();
      class_73.method_149(var7 + this.field_32505, var8 - this.field_32511, var7 + var9 + this.field_32511, var8 + var10 + this.field_32511);
      class_73.method_120(var7, var8, var9, var10, class_314.method_1444(class_1255.field_6918.field_6917, var1));
      class_73.method_141();
      class_73.method_149(var7 - this.field_32511, var8 - this.field_32511, var7 + this.field_32505, var8 + var10 + this.field_32511);
      class_73.method_120(var7, var8, var9, var10, class_314.method_1444(-2236963, var1 * 0.75F));
      class_73.method_94(
         (float)(var7 + this.field_32505 - 1),
         (float)var8,
         (float)(var7 + this.field_32505),
         (float)(var8 + var10),
         class_314.method_1444(class_1255.field_6929.field_6917, 0.05F)
      );
      class_73.method_141();
      super.method_32178(var1);
   }
}
