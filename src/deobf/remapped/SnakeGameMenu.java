package remapped;

public class SnakeGameMenu extends class_2596 {
   public MinecraftClient field_46319 = MinecraftClient.getInstance();
   public Timer field_46314 = new Timer();
   public class_2040 field_46317;
   public class_2440 field_46318;
   public int field_46313;
   public int field_46316 = 14;

   public SnakeGameMenu() {
      super("SnakeGameScreen");
      this.method_32105(false);
      this.field_46314.method_14776();
      this.field_46318 = new class_2440(200, 0);
      class_314.method_1403();
      byte var3 = 48;
      byte var4 = 27;
      byte var5 = 14;
      int var6 = var3 * var5;
      int var7 = var4 * var5;
      this.method_32148(this.field_46317 = new class_2040(this, "snake", (this.field_36278 - var6) / 2, (this.method_32137() - var7) / 2 + 30, var3, 27, var5));
   }

   @Override
   public void method_32178(float var1) {
      var1 = this.field_46318.method_11123();
      float var4 = class_9556.method_44073(var1, 0.0F, 1.0F, 1.0F);
      this.method_32111(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      float var5 = 0.25F * var1;
      FontManager.method_94(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)(this.field_36270 + this.field_36278),
         (float)(this.field_36261 + this.field_36257),
         class_314.method_1444(class_1255.field_6929.field_6917, var5)
      );
      super.method_32190();
      FontManager.method_128(
         (float)this.field_46317.method_32132(),
         (float)this.field_46317.method_32173(),
         (float)this.field_46317.method_32109(),
         (float)this.field_46317.method_32137(),
         40.0F,
         var1
      );
      FontManager.method_108(
         (float)(this.field_46317.method_32132() - 20),
         (float)(this.field_46317.method_32173() - 20),
         (float)(this.field_46317.method_32109() + 40),
         (float)(this.field_46317.method_32137() + 40),
         14.0F,
         class_1255.field_6918.field_6917
      );
      super.method_32178(var1);
      int var6 = (this.field_36278 - this.field_46317.method_32109()) / 2;
      int var7 = (this.field_36257 - this.field_46317.method_32137()) / 2;
      FontManager.method_87(class_5320.field_27147, (float)var6, (float)(var7 - 60), "Snake", class_1255.field_6918.field_6917);
      this.field_46313 = Math.max(this.field_46317.method_9558(), this.field_46313);
      String var8 = "Max: " + this.field_46313 + "   |   Score: " + this.field_46317.method_9558();
      FontManager.method_87(
         class_5320.field_27152,
         (float)(var6 + this.field_46317.method_32109() - class_5320.field_27152.method_18547(var8)),
         (float)(var7 - 50),
         var8,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.8F)
      );
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 256) {
         class_314.method_1430();
         MinecraftClient.getInstance().method_8609(null);
      }
   }
}
