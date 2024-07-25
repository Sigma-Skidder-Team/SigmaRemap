package remapped;

import org.lwjgl.opengl.GL11;

public class class_1964 extends Module {
   private int field_9984;
   private class_2440 field_9983 = new class_2440(1500, 1500, class_4043.field_19618);

   public class_1964() {
      super(class_5664.field_28708, "Cords", "Displays coordinates");
   }

   @class_9148
   private void method_9061(class_5596 var1) {
      if (this.method_42015()) {
         if (class_314.method_1448() > this.field_9984 && field_46692.field_9632.field_41697 % 3 == 0) {
            this.field_9984++;
         }

         if (class_314.method_1448() < this.field_9984 && field_46692.field_9632.field_41697 % 3 == 0) {
            this.field_9984--;
         }

         boolean var4 = class_8865.method_40772() || field_46692.field_9632.field_29654 || field_46692.field_9632.method_37252();
         if (!var4) {
            if (this.field_9983.method_11123() == 1.0F && this.field_9983.method_11128() == class_4043.field_19620) {
               this.field_9983.method_11119(class_4043.field_19618);
            }
         } else {
            this.field_9983.method_11119(class_4043.field_19620);
         }
      }
   }

   @class_9148
   @class_4249
   private void method_9062(class_3278 var1) {
      if (this.method_42015()) {
         if (field_46692.field_9632 != null) {
            if (!MinecraftClient.getInstance().field_9577.field_45470) {
               if (!MinecraftClient.getInstance().field_9577.field_45567) {
                  float var4 = Math.min(1.0F, 0.6F + this.field_9983.method_11123() * 4.0F);
                  String var5 = field_46692.field_9632.method_37075().method_12173()
                     + " "
                     + field_46692.field_9632.method_37075().method_12165()
                     + " "
                     + field_46692.field_9632.method_37075().method_12185();
                  byte var6 = 85;
                  int var7 = var1.method_14966();
                  short var8 = 150;
                  float var9 = (float)class_5320.field_27139.method_18547(var5);
                  float var10 = Math.min(1.0F, (float)var8 / var9);
                  if (this.field_9983.method_11128() != class_4043.field_19620) {
                     var10 *= 0.9F + class_9681.method_44757(Math.min(1.0F, this.field_9983.method_11123() * 8.0F), 0.0F, 1.0F, 1.0F) * 0.1F;
                  } else {
                     var10 *= 0.9F + class_9556.method_44073(Math.min(1.0F, this.field_9983.method_11123() * 7.0F), 0.0F, 1.0F, 1.0F) * 0.1F;
                  }

                  GL11.glPushMatrix();
                  GL11.glTranslatef((float)var6, (float)(var7 + 10), 0.0F);
                  GL11.glScalef(var10, var10, 1.0F);
                  GL11.glTranslatef((float)(-var6), (float)(-var7 - 10), 0.0F);
                  class_73.method_88(
                     class_5320.field_27146,
                     (float)var6,
                     (float)var7,
                     var5,
                     class_314.method_1444(-16777216, 0.5F * var4),
                     class_6206.field_31726,
                     class_6206.field_31724
                  );
                  class_73.method_88(
                     class_5320.field_27139,
                     (float)var6,
                     (float)var7,
                     var5,
                     class_314.method_1444(class_1255.field_6918.field_6917, 0.8F * var4),
                     class_6206.field_31726,
                     class_6206.field_31724
                  );
                  GL11.glPopMatrix();
               }
            }
         }
      }
   }
}
