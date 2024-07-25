package remapped;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class MiniMapModule extends Module {
   public ByteBuffer field_25730 = null;
   public BufferedImage field_25742 = null;
   private int field_25739 = 95;
   private int field_25741;
   private static float field_25738 = 64.0F;
   private int field_25733 = 150;
   private int field_25740 = 150;
   private int field_25731 = 10;
   private int field_25732 = 260;
   private int field_25728 = 1;
   private class_1331 field_25727;
   private int field_25729 = 10;
   public List<class_4601> field_25735 = new ArrayList<class_4601>();
   private double field_25736;
   private double field_25734;

   public MiniMapModule() {
      super(Category.GUI, "MiniMap", "Shows a mini map");
      this.method_42011(false);
   }

   @EventListen
   public void method_22834(class_717 var1) {
      this.field_25735.clear();
   }

   @Override
   public void onDisable() {
      this.field_25735.clear();
   }

   @EventListen
   private void method_22829(class_5596 var1) {
      if (this.method_42015() && client.thePlayer != null && client.field_9601 != null) {
         this.field_25741++;
         if ((double)field_25738 < client.thePlayer.method_37309() && client.thePlayer.field_41726) {
            field_25738 += 0.5F;
         }

         if ((double)field_25738 > client.thePlayer.method_37309() && client.thePlayer.field_41726) {
            field_25738 -= 0.5F;
         }

         if (this.field_25741 >= 1) {
            ArrayList var4 = new ArrayList();

            for (int var5 = -this.field_25729 / 2; var5 < this.field_25729 / 2; var5++) {
               for (int var6 = -this.field_25729 / 2; var6 < this.field_25729 / 2; var6++) {
                  var4.add(client.field_9601.method_29554(client.thePlayer.field_41742 + var5, client.thePlayer.field_41714 + var6));
               }
            }

            Iterator var11 = this.field_25735.iterator();

            while (var11.hasNext()) {
               class_4601 var12 = (class_4601)var11.next();
               int var7 = var12.field_22373.method_27352().method_9549(new class_2034(client.thePlayer.field_41742, client.thePlayer.field_41714));
               if (var7 > 7) {
                  var11.remove();
               }
            }

            for (class_2654 var15 : var4) {
               if (var15 == null) {
                  return;
               }

               boolean var8 = false;

               for (class_4601 var10 : this.field_25735) {
                  if (var10.method_21320(var15)) {
                     var8 = true;
                     break;
                  }
               }

               if (!var8) {
                  this.field_25735.add(new class_4601(var15));
                  break;
               }
            }

            for (class_4601 var16 : this.field_25735) {
               var16.method_21318();
            }

            this.field_25736 = (client.thePlayer.method_37302() - (double)(client.thePlayer.field_41742 * 16)) / 16.0;
            this.field_25734 = (client.thePlayer.method_37156() - (double)(client.thePlayer.field_41714 * 16)) / 16.0;
            this.field_25730 = this.method_22831(this.field_25739);
            this.field_25727 = client.thePlayer.method_37075();
            this.field_25741 = 0;
         }
      }
   }

   @EventListen
   @class_315
   private void method_22828(class_3278 var1) throws IOException {
      if (this.method_42015() && client.thePlayer != null && client.field_9601 != null) {
         if (this.field_25730 != null) {
            if (!MinecraftClient.getInstance().gameOptions.field_45470) {
               if (!MinecraftClient.getInstance().gameOptions.hideGUI) {
                  ByteBuffer var4 = this.field_25730;
                  this.field_25732 = var1.method_14966();
                  if (var4 != null) {
                     String var5 = "^";
                     class_3384 var6 = class_5320.field_27161;
                     float var7 = 1.5F;
                     class_73.method_103((float)this.field_25731, (float)this.field_25732, (float)this.field_25740, (float)this.field_25733, -7687425);
                     GL11.glPushMatrix();
                     float var8 = (float)(this.field_25740 / this.field_25729);
                     float var9 = (float)((double)(var8 * var7) * this.field_25734);
                     float var10 = (float)((double)(-var8 * var7) * this.field_25736);
                     GL11.glTranslatef((float)(this.field_25731 + this.field_25740 / 2), (float)(this.field_25732 + this.field_25733 / 2), 0.0F);
                     GL11.glRotatef(90.0F - client.thePlayer.field_41701, 0.0F, 0.0F, 1.0F);
                     GL11.glTranslatef((float)(-this.field_25740 / 2), (float)(-this.field_25733 / 2), 0.0F);
                     float var11 = (float)this.field_25740 * var7;
                     float var12 = (float)this.field_25733 * var7;
                     class_73.method_149(this.field_25731, this.field_25732, this.field_25731 + this.field_25740, this.field_25732 + this.field_25733);
                     class_73.method_96(0.0F, 0.0F, 0.0F, 0.0F, NotificationIcons.field_11044);
                     float var13 = -var11 / 2.0F + (float)(this.field_25740 / 2) + var9;
                     float var14 = -var12 / 2.0F + (float)(this.field_25733 / 2) + var10;
                     class_73.method_96(0.0F, 0.0F, 0.0F, 0.0F, NotificationIcons.field_11030);
                     class_73.method_138(
                        var13,
                        var14,
                        var11,
                        var12,
                        var4,
                        class_1255.field_6918.field_6917,
                        0.0F,
                        0.0F,
                        (float)(this.field_25729 * 16),
                        (float)(this.field_25729 * 16),
                        true,
                        false
                     );
                     class_73.method_141();
                     GL11.glPopMatrix();
                     GL11.glPushMatrix();
                     int var15 = (int)class_8865.method_40787()[0];
                     GL11.glTranslatef((float)(this.field_25731 + this.field_25740 / 2 + 1), (float)(this.field_25732 + this.field_25733 / 2 + 3), 0.0F);
                     GL11.glRotatef((float)(270 + var15) - client.thePlayer.field_41701, 0.0F, 0.0F, 1.0F);
                     GL11.glTranslatef((float)(-(this.field_25731 + this.field_25740 / 2 + 1)), (float)(-(this.field_25732 + this.field_25733 / 2)), 0.0F);
                     class_73.method_87(
                        var6, (float)(this.field_25731 + this.field_25740 / 2 - 4), (float)(this.field_25732 + this.field_25733 / 2 - 8), var5, 1879048192
                     );
                     GL11.glPopMatrix();
                     GL11.glPushMatrix();
                     GL11.glTranslatef((float)(this.field_25731 + this.field_25740 / 2 + 1), (float)(this.field_25732 + this.field_25733 / 2), 0.0F);
                     GL11.glRotatef((float)(270 + var15) - client.thePlayer.field_41701, 0.0F, 0.0F, 1.0F);
                     GL11.glTranslatef((float)(-(this.field_25731 + this.field_25740 / 2 + 1)), (float)(-(this.field_25732 + this.field_25733 / 2)), 0.0F);
                     class_73.method_87(
                        var6,
                        (float)(this.field_25731 + this.field_25740 / 2 - 4),
                        (float)(this.field_25732 + this.field_25733 / 2 - 8),
                        var5,
                        class_1255.field_6918.field_6917
                     );
                     GL11.glPopMatrix();
                     class_73.method_147((float)this.field_25731, (float)this.field_25732, (float)this.field_25740, (float)this.field_25733, 23.0F, 0.75F);
                     class_73.method_128((float)this.field_25731, (float)this.field_25732, (float)this.field_25740, (float)this.field_25733, 8.0F, 0.7F);
                  }

                  var1.method_14968(this.field_25733 + 10);
               }
            }
         }
      }
   }

   public ByteBuffer method_22831(int var1) {
      ArrayList var4 = new ArrayList();

      for (int var5 = -this.field_25729 / 2; var5 < this.field_25729 / 2; var5++) {
         for (int var6 = -this.field_25729 / 2; var6 < this.field_25729 / 2; var6++) {
            var4.add(client.field_9601.method_29554(client.thePlayer.field_41742 + var5, client.thePlayer.field_41714 + var6));
         }
      }

      ByteBuffer var16 = BufferUtils.createByteBuffer(this.field_25729 * 16 * this.field_25729 * 16 * 3);
      int var17 = 0;
      int var7 = var16.position();

      for (class_2654 var9 : var4) {
         ByteBuffer var10 = BufferUtils.createByteBuffer(768);
         method_22830(var10);
         class_4601 var11 = null;

         for (class_4601 var13 : this.field_25735) {
            if (var13.method_21320(var9)) {
               var11 = var13;
               break;
            }
         }

         if (var11 != null && var11.field_22374 != null) {
            var10 = var11.field_22374;
         }

         int var18 = var16.position();
         int var19 = var16.position();

         for (int var14 = 0; var14 < 16; var14++) {
            for (int var15 = 0; var15 < 16; var15++) {
               var16.put(var10.get());
               var16.put(var10.get());
               var16.put(var10.get());
            }

            var18 += 16 * this.field_25729 * 3;
            if (var18 < var16.limit()) {
               ((Buffer)var16).position(var18);
            }
         }

         var7 += 48;
         if (var19 + 48 < var16.limit()) {
            ((Buffer)var16).position(var19 + 48);
         }

         if (var17 != var7 / (48 * this.field_25729)) {
            var17 = var7 / (48 * this.field_25729);
            if (256 * this.field_25729 * 3 * var17 < var16.limit()) {
               ((Buffer)var16).position(256 * this.field_25729 * 3 * var17);
            }
         }

         ((Buffer)var10).position(0);
      }

      ((Buffer)var16).position(16 * this.field_25729 * 16 * this.field_25729 * 3);
      ((Buffer)var16).flip();
      return var16;
   }

   public static ByteBuffer method_22830(ByteBuffer var0) {
      int var3 = -7687425;

      for (int var4 = 0; var4 < 16; var4++) {
         for (int var5 = 0; var5 < 16; var5++) {
            var0.put((byte)(var3 >> 16 & 0xFF));
            var0.put((byte)(var3 >> 8 & 0xFF));
            var0.put((byte)(var3 & 0xFF));
         }
      }

      ((Buffer)var0).flip();
      return var0;
   }
}
