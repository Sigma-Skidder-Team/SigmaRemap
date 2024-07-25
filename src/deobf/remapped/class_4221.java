package remapped;

import java.awt.Color;
import java.util.TreeMap;
import java.util.Map.Entry;
import org.lwjgl.opengl.GL11;

public class class_4221 extends class_9128 {
   private TreeMap<class_9128, class_2440> field_20487 = new TreeMap<class_9128, class_2440>();
   private class_3384 field_20484;
   private class_3384 field_20488;
   private class_2440 field_20486;

   public class_4221() {
      super(class_5664.field_28709, "ActiveMods", "Shows active mods");
      this.method_42010(new class_2826("Outline", "Outline", 0, "All", "Left", "Right", "None"));
      this.method_42010(new class_2826("Animation", "Animation", 0, "Smooth", "Slide", "Both", "None"));
      this.method_42010(new class_8563("Sound", "Toggle sound", true));
   }

   @Override
   public void method_42012() {
      this.method_19661();
      this.method_19657();
   }

   private void method_19657() {
      this.field_20486 = new class_2440(2000, 2000, class_4043.field_19620);
   }

   private void method_19661() {
      this.field_20487.clear();
      this.field_20484 = class_3054.field_14998;
      this.field_20488 = class_3054.field_14990;
      this.field_20487 = new TreeMap<class_9128, class_2440>(new class_3896(this));
   }

   @class_9148
   private void method_19656(class_3278 var1) {
      if (this.method_42015() && field_46692.field_9632 != null) {
         String var4 = this.method_42016("Animation");
         String var5 = this.method_42016("Outline");
         this.method_19659();
         if (this.field_20486.method_11123() == 1.0F) {
            this.field_20486.method_11122(0.0F);
         }

         int var6 = -2;
         int var7 = class_1893.method_8510().field_9602.method_43166() - 2;
         byte var8 = -2;
         int var9 = new Color(0, 192, 255, 255).getRGB();
         int var10 = new Color(0, 192, 255, 255).getRGB();
         int var11 = -7;
         float var12 = this.field_20486.method_11123();

         for (Entry var14 : this.field_20487.entrySet()) {
            class_2440 var15 = (class_2440)var14.getValue();
            class_9128 var16 = (class_9128)var14.getKey();
            if (var16.method_42015() || var15.method_11123() != 1.0F && !var4.equalsIgnoreCase("None")) {
               boolean var17 = true;
               boolean var18 = true;
               var9 = Color.HSBtoRGB(var12, 1.0F, 1.0F);
               var10 = Color.HSBtoRGB(var12, 1.0F, 1.0F);
               int var19 = this.method_19660(var16);
               int var20 = this.field_20484.method_18548(var16.method_41987()) + var8;
               float var21 = 1.0F - class_9681.method_44756(var15.method_11123(), 0.0F, 1.0F, 1.0F);
               if (var4.equalsIgnoreCase("Smooth") || var4.equalsIgnoreCase("Both")) {
                  var20 = (int)((float)var20 * var21);
               }

               class_3542.method_16438();
               if (var5.equalsIgnoreCase("Right")) {
                  GL11.glTranslated(-3.0, 0.0, 0.0);
               }

               class_73.method_94((float)(var7 - var19 - 3), (float)(var6 + 1), (float)(var7 + 2), (float)(var6 + var20 + 1), new Color(0, 0, 0, 150).getRGB());
               if (!var5.equalsIgnoreCase("None")) {
                  if (!var5.equalsIgnoreCase("All")) {
                     if (!var5.equalsIgnoreCase("Left")) {
                        if (var5.equalsIgnoreCase("Right")) {
                           class_73.method_94((float)(var7 + 2), (float)(var6 + 1), (float)(var7 + 7), (float)(var6 + 1 + var20), var10);
                        }
                     } else {
                        class_73.method_94((float)(var7 - var19 - 6), (float)(var6 + 1), (float)(var7 - var19 - 3), (float)(var6 + 1 + var20), var10);
                     }
                  } else {
                     class_73.method_94((float)(var7 - var19 - 5), (float)(var6 + 1), (float)(var7 - var19 - 3), (float)(var6 + 1 + var20), var10);
                     class_73.method_94((float)(var7 - var19 - 3), (float)(var6 + 1), (float)(var7 - var11 - 5), (float)(var6 + 3), var10);
                  }
               }

               class_3542.method_16473();
               class_3542.method_16488();
               if (var4.equalsIgnoreCase("Slide") || var4.equalsIgnoreCase("Both")) {
                  GL11.glTranslated((double)((float)var19 * class_9681.method_44756(var15.method_11123(), 0.0F, 1.0F, 1.0F)), 0.0, 0.0);
               }

               class_73.method_148(
                  (float)(var7 - var19 - 3),
                  (float)(var6 + 1),
                  (float)var7,
                  (float)(var6 + var20) - class_9681.method_44756(var15.method_11123(), 0.0F, 1.0F, 1.0F)
               );
               this.field_20484.method_18545((float)(var7 - var19), (float)var6, var16.method_41987(), new class_8709(var9));
               this.field_20488
                  .method_18545(
                     (float)(var7 - this.field_20488.method_18547(this.method_19655(var16))),
                     (float)var6 + 1.6F,
                     this.method_19655(var16),
                     new class_8709(160, 160, 160)
                  );
               class_73.method_141();
               class_3542.method_16448();
               var6 += var20;
               class_3542.method_16489();
               var11 = var19;
               var12 = (float)((double)var12 + 0.0196078431372549);
               if (var12 > 1.0F) {
                  var12 = 0.0F;
               }
            }
         }

         if (var5.equalsIgnoreCase("All") && var11 > 0) {
            class_73.method_94((float)(var7 - var11 - 5), (float)(var6 + 1), (float)(var7 + 2), (float)(var6 + 3), var10);
         }
      }
   }

   private void method_19659() {
      if (this.field_20487.isEmpty()) {
         this.field_20487.clear();

         for (class_9128 var4 : class_727.method_3328().method_3298().method_843().values()) {
            if (var4 != this && var4.method_41998() != class_5664.field_28708) {
               class_2440 var5 = new class_2440(200, 200, !var4.method_42015() ? class_4043.field_19620 : class_4043.field_19618);
               var5.method_11122(!var4.method_42015() ? 1.0F : 0.0F);
               this.field_20487.put(var4, var5);
               class_5004 var6 = var4.method_41996().get("Type");
               if (var6 == null) {
                  var6 = var4.method_41996().get("Mode");
                  if (var6 != null) {
                     var6.method_23029(var1 -> this.method_19661());
                  }
               } else {
                  var6.method_23029(var1 -> this.method_19661());
               }
            }
         }
      }

      for (Entry var8 : this.field_20487.entrySet()) {
         class_9128 var9 = (class_9128)var8.getKey();
         class_2440 var11 = (class_2440)var8.getValue();
         var11.method_11119(!var9.method_42015() ? class_4043.field_19620 : class_4043.field_19618);
      }
   }

   private String method_19655(class_9128 var1) {
      String var4 = "";
      if (var1.method_42016("Type") == null) {
         if (var1.method_42016("Mode") != null) {
            var4 = var4 + " " + var1.method_42016("Mode");
         }
      } else {
         var4 = var4 + " " + var1.method_42016("Type");
      }

      return var4;
   }

   private int method_19660(class_9128 var1) {
      String var4 = var1.method_41987();
      String var5 = this.method_19655(var1);
      return this.field_20484.method_18547(var4) + this.field_20488.method_18547(var5);
   }
}
