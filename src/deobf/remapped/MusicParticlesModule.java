package remapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MusicParticlesModule extends PremiumModule {
   public long field_12812 = 0L;
   private List<class_385> field_12813 = new ArrayList<class_385>();

   public MusicParticlesModule() {
      super("MusicParticles", "Shows nice particles when music is playing", Category.GUI);
      this.method_42011(false);
   }

   @EventListen
   private void method_11764(class_3278 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         if (SigmaMainClass.getInstance().method_3300().method_9486() && SigmaMainClass.getInstance().method_3300().field_10297.size() != 0) {
            long var4 = System.nanoTime() - this.field_12812;
            float var6 = Math.min(10.0F, Math.max(0.0F, (float)var4 / 1.810361E7F));
            double var7 = 0.0;
            short var9 = 4750;
            if (SigmaMainClass.getInstance().method_3300().field_10293.size() == 0) {
               return;
            }

            for (int var10 = 0; var10 < 3; var10++) {
               var7 = Math.max(var7, Math.sqrt(SigmaMainClass.getInstance().method_3300().field_10293.get(var10)) - 1000.0);
            }

            float var14 = 0.7F + (float)(var7 / (double)(var9 - 1000)) * 8.14F;
            var14 *= var6;
            int var11 = 0;

            while (this.field_12813.size() < 40) {
               this.method_11767();
               if ((float)(var11++) > var14) {
                  break;
               }
            }

            this.method_11766(var14);

            for (class_385 var13 : this.field_12813) {
               var13.method_1877();
            }
         }

         this.field_12812 = System.nanoTime();
      }
   }

   @Override
   public void onEnable() {
      this.field_12812 = System.nanoTime();
   }

   private void method_11767() {
      this.field_12813.add(new class_385());
   }

   private void method_11766(float var1) {
      Iterator var4 = this.field_12813.iterator();

      while (var4.hasNext()) {
         class_385 var5 = (class_385)var4.next();
         var5.method_1876(var1);
         if (var5.method_1878()) {
            var4.remove();
         }
      }
   }
}
