package remapped;

import org.lwjgl.opengl.GL11;

public class JelloOptionsMenu extends class_2596 {
   private int field_8541 = 0;
   private int field_8539 = 0;
   private boolean field_8536 = true;
   public static class_2440 field_8537 = new class_2440(300, 200);
   private class_8343 field_8540;
   private class_434 field_8534;
   public static Screen field_8538 = null;

   public JelloOptionsMenu() {
      super("options");
      this.method_32105(false);
      int var3 = Math.max((int)((float)this.field_36257 * 0.8F), 420);
      int var4 = (int)((float)this.field_36278 * 0.8F);
      this.method_32148(
         this.field_8534 = new class_434(
            this,
            "centerBlock",
            this.method_32109() - var4,
            this.method_32137() - var3,
            var4 - (this.method_32109() - var4),
            var3 - (this.method_32137() - var3)
         )
      );
      field_8537 = new class_2440(300, 100);
   }

   @Override
   public void method_32145(int var1, int var2) {
      if (field_8537.method_11128() == class_4043.field_19618 && field_8537.method_11123() == 0.0F && field_8538 != null) {
         MinecraftClient.getInstance().method_8609(field_8538);
      }

      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      float var4 = 1.3F - class_9556.method_44073(field_8537.method_11123(), 0.0F, 1.0F, 1.0F) * 0.3F;
      float var5 = 1.0F;
      if (field_8537.method_11128() == class_4043.field_19618) {
         var4 = 0.7F + class_9681.method_44756(field_8537.method_11123(), 0.0F, 1.0F, 1.0F) * 0.3F;
         var5 = field_8537.method_11123();
      }

      int var6 = class_314.method_1442(-1072689136, class_314.method_1444(class_1255.field_6929.field_6917, 0.1F), var5);
      int var7 = class_314.method_1442(-804253680, class_314.method_1444(class_1255.field_6929.field_6917, 0.1F), var5);
      FontManager.method_81(0, 0, this.method_32109(), this.method_32137(), var6, var7);
      this.method_32111(var4, var4);
      this.method_32190();
      super.method_32178(field_8537.method_11123());
   }

   private void method_7363(float var1) {
      int var4 = this.method_32189() * -1;
      float var5 = (float)this.method_32129() / (float)this.method_32109() * -114.0F;
      if (this.field_8536) {
         this.field_8541 = (int)var5;
         this.field_8539 = var4;
         this.field_8536 = false;
      }

      float var6 = var5 - (float)this.field_8541;
      float var7 = (float)(var4 - this.field_8539);
      GL11.glPushMatrix();
      FontManager.method_153(
         (float)this.field_8539,
         (float)this.field_8541,
         (float)(this.method_32109() * 2),
         (float)(this.method_32137() + 114),
         this.field_8540,
         class_314.method_1444(class_1255.field_6918.field_6917, var1)
      );
      GL11.glPopMatrix();
      float var8 = 0.5F;
      if (var5 != (float)this.field_8541) {
         this.field_8541 = (int)((float)this.field_8541 + var6 * var8);
      }

      if (var4 != this.field_8539) {
         this.field_8539 = (int)((float)this.field_8539 + var7 * var8);
      }
   }

   public static void method_7362(Screen var0) {
      field_8538 = var0;
      field_8537.method_11119(class_4043.field_19618);
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 256) {
         MinecraftClient.getInstance().method_8609(null);
      }
   }
}
