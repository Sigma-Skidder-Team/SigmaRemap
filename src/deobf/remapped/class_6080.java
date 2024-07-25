package remapped;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class_6080 {
   private static String[] field_31112;
   public MinecraftClient field_31116 = MinecraftClient.getInstance();
   private List<class_8235> field_31118 = new ArrayList<class_8235>();
   private int field_31111 = 20;
   private int field_31115 = 1;
   private int field_31114 = 200;
   private int field_31110 = 340;
   private int field_31121 = 64;
   private int field_31117 = 10;
   private int field_31113 = 10;
   private int field_31119 = 10;
   private class_3384 field_31120 = class_5320.field_27138;
   private class_3384 field_31122 = class_5320.field_27152;

   public void method_27841(class_8235 var1) {
      for (class_8235 var5 : this.field_31118) {
         if (var5.equals(var1)) {
            var5.field_42297.method_14777(Math.min(var5.field_42297.method_14772(), (long)(this.field_31114 + 1)));
            var5.field_42299 = var1.field_42299;
            var5.field_42291++;
            var5.field_42301 = var1.field_42301;
            return;
         }
      }

      this.field_31118.add(var1);
   }

   public float method_27838(class_8235 var1) {
      float var4 = (float)Math.min(var1.field_42297.method_14772(), (long)var1.field_42296);
      if (!(var4 < (float)this.field_31114 * 1.4F)) {
         return !(var4 > (float)var1.field_42296 - (float)this.field_31114)
            ? 1.0F
            : class_9681.method_44757(((float)var1.field_42296 - var4) / (float)this.field_31114, 0.0F, 1.0F, 1.0F);
      } else {
         return class_9681.method_44756(var4 / ((float)this.field_31114 * 1.4F), 0.0F, 1.0F, 1.0F);
      }
   }

   public float method_27837(int var1) {
      float var4 = 0.0F;

      for (int var5 = 0; var5 < var1; var5++) {
         var4 += this.method_27838(this.field_31118.get(var5));
      }

      return var4 / (float)var1;
   }

   @EventListen
   private void method_27845(class_3278 var1) {
      if (!MinecraftClient.getInstance().field_9577.field_45567) {
         this.field_31115 = Math.max(Math.round((float)(6 - MinecraftClient.method_8501() / 10)), 1);

         for (int var4 = 0; var4 < this.field_31118.size(); var4++) {
            class_8235 var5 = this.field_31118.get(var4);
            float var6 = this.method_27838(var5);
            int var7 = MinecraftClient.getInstance().window.method_43166() - this.field_31113 - (int)((float)this.field_31110 * var6 * var6);
            int var8 = this.field_31116.window.method_43163()
               - this.field_31121
               - this.field_31117
               - var4 * (int)((float)this.field_31121 * this.method_27837(var4) + (float)this.field_31119 * this.method_27837(var4));
            float var9 = Math.min(1.0F, var6);
            int var10 = new Color(0.14F, 0.14F, 0.14F, var9 * 0.93F).getRGB();
            int var11 = new Color(0.0F, 0.0F, 0.0F, Math.min(var6 * 0.075F, 1.0F)).getRGB();
            int var12 = new Color(1.0F, 1.0F, 1.0F, var9).getRGB();
            class_73.method_128((float)var7, (float)var8, (float)this.field_31110, (float)this.field_31121, 10.0F, var9);
            class_73.method_94((float)var7, (float)var8, (float)(var7 + this.field_31110), (float)(var8 + this.field_31121), var10);
            class_73.method_94((float)var7, (float)var8, (float)(var7 + this.field_31110), (float)(var8 + 1), var11);
            class_73.method_94((float)var7, (float)(var8 + this.field_31121 - 1), (float)(var7 + this.field_31110), (float)(var8 + this.field_31121), var11);
            class_73.method_94((float)var7, (float)(var8 + 1), (float)(var7 + 1), (float)(var8 + this.field_31121 - 1), var11);
            class_73.method_94(
               (float)(var7 + this.field_31110 - 1), (float)(var8 + 1), (float)(var7 + this.field_31110), (float)(var8 + this.field_31121 - 1), var11
            );
            class_73.method_149(var7, var8, var7 + this.field_31110 - this.field_31119, var8 + this.field_31121);
            class_73.method_87(
               this.field_31122, (float)(var7 + this.field_31121 + this.field_31119 - 2), (float)(var8 + this.field_31119), var5.field_42295, var12
            );
            class_73.method_87(
               this.field_31120,
               (float)(var7 + this.field_31121 + this.field_31119 - 2),
               (float)(var8 + this.field_31119 + this.field_31122.method_18548(var5.field_42295)),
               var5.field_42299,
               var12
            );
            class_73.method_141();
            class_73.method_96(
               (float)(var7 + this.field_31119 / 2),
               (float)(var8 + this.field_31119 / 2),
               (float)(this.field_31121 - this.field_31119),
               (float)(this.field_31121 - this.field_31119),
               var5.field_42301
            );
         }
      }
   }

   @EventListen
   private void method_27840(class_5596 var1) {
      Iterator var4 = this.field_31118.iterator();

      while (var4.hasNext()) {
         class_8235 var5 = (class_8235)var4.next();
         if (var5.field_42297.method_14772() > (long)var5.field_42296) {
            var4.remove();
         }
      }
   }

   @EventListen
   private void method_27844(class_3368 var1) {
      if (this.field_31116.field_9632 == null) {
         ;
      }
   }

   private void method_27839() {
      for (int var3 = 0; var3 < this.field_31118.size(); var3++) {
         class_8235 var4 = this.field_31118.get(var3);
         float var5 = this.method_27838(var4);
         int var6 = MinecraftClient.getInstance().window.method_43166() - this.field_31113 - (int)((float)this.field_31110 * var5 * var5);
         int var7 = this.field_31116.window.method_43163()
            - this.field_31121
            - this.field_31117
            - var3 * (int)((float)this.field_31121 * this.method_27837(var3) + (float)this.field_31119 * this.method_27837(var3));

         for (int var8 = 0; var8 < 3; var8++) {
            var4.field_42293[var8] = class_73.method_114(var6 + this.field_31110 / 3 * var8, var7, var4.field_42293[var8]);
            var4.field_42292[var8] = class_73.method_114(var6 + this.field_31110 / 3 * var8, var7 + this.field_31121, var4.field_42292[var8]);
         }
      }
   }

   public void method_27843() {
      SigmaMainClass.getInstance().method_3302().method_7908(this);
   }
}
