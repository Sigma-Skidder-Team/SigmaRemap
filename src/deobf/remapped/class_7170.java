package remapped;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map.Entry;

public class class_7170 extends class_446 {
   public class_8343 field_36888;
   public class_8343 field_36895;
   public class_8343 field_36893;
   public class_8343 field_36891;
   public class_8343 field_36886;
   public TreeMap<Long, Double> field_36892 = new TreeMap<Long, Double>();
   public float field_36887 = 0.5F;
   public float field_36894 = 0.0F;
   public long field_36889 = System.currentTimeMillis();

   public class_7170(class_7038 var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, 700, 512, false);
      this.field_36888 = NotificationIcons.method_10231("com/mentalfrostbyte/gui/resources/games/bg.png");
      this.field_36895 = NotificationIcons.method_10231("com/mentalfrostbyte/gui/resources/games/fg.png");
      this.field_36893 = NotificationIcons.method_10231("com/mentalfrostbyte/gui/resources/games/pipe.png");
      this.field_36891 = NotificationIcons.method_10231("com/mentalfrostbyte/gui/resources/games/pipe2.png");
      this.field_36886 = NotificationIcons.method_10231("com/mentalfrostbyte/gui/resources/games/bird.png");
   }

   private void method_32871() {
   }

   private void method_32872() {
      short var3 = 2200;
      byte var4 = 2;
      if (this.field_36892.isEmpty()) {
         this.field_36892.put(System.currentTimeMillis() + (long)(var3 * 2), 0.25 + Math.random() * 0.5);
      }

      for (long var5 = this.field_36892.lastKey(); var5 < System.currentTimeMillis() + (long)(var3 * var4); var5 = this.field_36892.lastKey()) {
         this.field_36892.put(var5 + (long)var3, 0.25 + Math.random() * 0.5);
      }

      Iterator var7 = this.field_36892.entrySet().iterator();

      while (var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         if ((Long)var8.getKey() < System.currentTimeMillis() - (long)(var3 * 2)) {
            var7.remove();
         }
      }
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 32) {
         this.field_36894 = 0.045F;
      }
   }

   @Override
   public void method_32178(float var1) {
      this.method_32872();
      class_73.method_151(this);

      for (int var4 = 0; var4 < 3; var4++) {
         class_73.method_96((float)(this.field_36270 + 288 * var4), (float)this.field_36261, 288.0F, 512.0F, this.field_36888);
      }

      float var16 = 60.0F / (float) MinecraftClient.method_8501();
      float var5 = 0.026F * var16;
      this.field_36887 = Math.max(Math.min(1.0F, this.field_36887 + this.field_36894 - var5), 0.0F);
      this.field_36894 = Math.max(-var5, this.field_36894 * 0.965F);
      byte var6 = 100;
      short var7 = 2200;
      int var8 = this.field_36257 - 112;

      for (Entry var10 : this.field_36892.entrySet()) {
         int var11 = (int)((Long)var10.getKey() - System.currentTimeMillis());
         float var12 = (float)var11 / 12.0F;
         float var13 = (float)var7 / 12.0F;
         class_73.method_99(
            (float)this.field_36270 + var13 + var12,
            (float)(this.field_36261 - 320 + (int)((double)var8 * (Double)var10.getValue()) - var6 / 2),
            52.0F,
            320.0F,
            this.field_36893,
            class_1255.field_6918.field_6917
         );
         class_73.method_99(
            (float)this.field_36270 + var13 + var12,
            (float)(this.field_36261 + (int)((double)var8 * (Double)var10.getValue()) + var6 / 2),
            52.0F,
            320.0F,
            this.field_36891,
            class_1255.field_6918.field_6917
         );
         if (var12 > -52.0F && var12 < 0.0F) {
            float var14 = (float)(var6 - 24) / (float)var8;
            boolean var15 = (double)this.field_36887 < (Double)var10.getValue() - (double)(var14 / 2.0F)
               || (double)this.field_36887 > (Double)var10.getValue() + (double)(var14 / 2.0F);
            if (var15) {
            }
         }
      }

      short var17 = 3400;
      float var18 = (float)(System.currentTimeMillis() % (long)var17) / (float)var17;

      for (int var19 = 0; var19 < 4; var19++) {
         class_73.method_96((float)(this.field_36270 + 288 * var19) - 288.0F * var18, (float)(this.field_36261 + var8), 288.0F, 112.0F, this.field_36895);
      }

      class_73.method_124(
         (float)this.field_36270 + (float)var7 / 12.0F,
         (float)this.field_36261 + (float)var8 * (1.0F - this.field_36887),
         10.0F,
         class_1255.field_6928.field_6917
      );
      class_73.method_141();
      this.field_36889 = System.currentTimeMillis();
      super.method_32178(var1);
   }
}
