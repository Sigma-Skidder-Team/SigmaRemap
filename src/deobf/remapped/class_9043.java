package remapped;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9043 extends class_1094 {
   private static final Logger field_46269 = LogManager.getLogger();
   private static final ReentrantLock field_46279 = new ReentrantLock();
   private final Screen field_46277;
   private final class_8105 field_46280;
   private final ITextComponent field_46282;
   private final RateLimiter field_46283;
   private class_9521 field_46271;
   private final String field_46292;
   private final class_1432 field_46272;
   private volatile ITextComponent field_46273;
   private volatile ITextComponent field_46285 = new TranslationTextComponent("mco.download.preparing");
   private volatile String field_46290;
   private volatile boolean field_46291;
   private volatile boolean field_46278 = true;
   private volatile boolean field_46293;
   private volatile boolean field_46274;
   private Long field_46275;
   private Long field_46286;
   private long field_46276;
   private int field_46270;
   private static final String[] field_46288 = new String[]{"", ".", ". .", ". . ."};
   private int field_46289;
   private boolean field_46284;
   private final BooleanConsumer field_46281;

   public class_9043(Screen var1, class_8105 var2, String var3, BooleanConsumer var4) {
      this.field_46281 = var4;
      this.field_46277 = var1;
      this.field_46292 = var3;
      this.field_46280 = var2;
      this.field_46272 = new class_1432(this);
      this.field_46282 = new TranslationTextComponent("mco.download.title");
      this.field_46283 = RateLimiter.create(0.1F);
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_46271 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 100, this.field_940 - 42, 200, 20, class_1402.field_7633, var1 -> {
         this.field_46291 = true;
         this.method_41516();
      }));
      this.method_41511();
   }

   private void method_41511() {
      if (!this.field_46293) {
         if (!this.field_46284 && this.method_41513(this.field_46280.field_41509) >= 5368709120L) {
            TranslationTextComponent var3 = new TranslationTextComponent("mco.download.confirmation.line1", class_5616.method_25482(5368709120L));
            TranslationTextComponent var4 = new TranslationTextComponent("mco.download.confirmation.line2");
            this.field_943.method_8609(new class_2238(var1 -> {
               this.field_46284 = true;
               this.field_943.method_8609(this);
               this.method_41514();
            }, class_1542.field_8153, var3, var4, false));
         } else {
            this.method_41514();
         }
      }
   }

   private long method_41513(String var1) {
      class_8531 var4 = new class_8531();
      return var4.method_39262(var1);
   }

   @Override
   public void method_5312() {
      super.method_5312();
      this.field_46270++;
      if (this.field_46285 != null && this.field_46283.tryAcquire(1)) {
         ArrayList var3 = Lists.newArrayList();
         var3.add(this.field_46282);
         var3.add(this.field_46285);
         if (this.field_46290 != null) {
            var3.add(new StringTextComponent(this.field_46290 + "%"));
            var3.add(new StringTextComponent(class_5616.method_25482(this.field_46276) + "/s"));
         }

         if (this.field_46273 != null) {
            var3.add(this.field_46273);
         }

         String var4 = var3.stream().<CharSequence>map(ITextComponent::getString).collect(Collectors.joining("\n"));
         class_7567.method_34410(var4);
      }
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.field_46291 = true;
         this.method_41516();
         return true;
      }
   }

   private void method_41516() {
      if (this.field_46293 && this.field_46281 != null && this.field_46273 == null) {
         this.field_46281.accept(true);
      }

      this.field_943.method_8609(this.field_46277);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_46282, this.field_941 / 2, 20, 16777215);
      method_9788(var1, this.field_948, this.field_46285, this.field_941 / 2, 50, 16777215);
      if (this.field_46278) {
         this.method_41517(var1);
      }

      if (this.field_46272.field_7734 != 0L && !this.field_46291) {
         this.method_41515(var1);
         this.method_41512(var1);
      }

      if (this.field_46273 != null) {
         method_9788(var1, this.field_948, this.field_46273, this.field_941 / 2, 110, 16711680);
      }

      super.method_6767(var1, var2, var3, var4);
   }

   private void method_41517(class_7966 var1) {
      int var4 = this.field_948.method_45379(this.field_46285);
      if (this.field_46270 % 10 == 0) {
         this.field_46289++;
      }

      this.field_948.method_45385(var1, field_46288[this.field_46289 % field_46288.length], (float)(this.field_941 / 2 + var4 / 2 + 5), 50.0F, 16777215);
   }

   private void method_41515(class_7966 var1) {
      double var4 = Math.min((double)this.field_46272.field_7734 / (double)this.field_46272.field_7732, 1.0);
      this.field_46290 = String.format(Locale.ROOT, "%.1f", var4 * 100.0);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_3542.method_16354();
      class_8042 var6 = class_8042.method_36499();
      class_9633 var7 = var6.method_36501();
      var7.method_44471(7, class_7985.field_40903);
      double var8 = (double)(this.field_941 / 2 - 100);
      double var10 = 0.5;
      var7.method_35761(var8 - 0.5, 95.5, 0.0).method_35743(217, 210, 210, 255).method_35735();
      var7.method_35761(var8 + 200.0 * var4 + 0.5, 95.5, 0.0).method_35743(217, 210, 210, 255).method_35735();
      var7.method_35761(var8 + 200.0 * var4 + 0.5, 79.5, 0.0).method_35743(217, 210, 210, 255).method_35735();
      var7.method_35761(var8 - 0.5, 79.5, 0.0).method_35743(217, 210, 210, 255).method_35735();
      var7.method_35761(var8, 95.0, 0.0).method_35743(128, 128, 128, 255).method_35735();
      var7.method_35761(var8 + 200.0 * var4, 95.0, 0.0).method_35743(128, 128, 128, 255).method_35735();
      var7.method_35761(var8 + 200.0 * var4, 80.0, 0.0).method_35743(128, 128, 128, 255).method_35735();
      var7.method_35761(var8, 80.0, 0.0).method_35743(128, 128, 128, 255).method_35735();
      var6.method_36500();
      class_3542.method_16432();
      method_9787(var1, this.field_948, this.field_46290 + " %", this.field_941 / 2, 84, 16777215);
   }

   private void method_41512(class_7966 var1) {
      if (this.field_46270 % 20 != 0) {
         this.method_41518(var1, this.field_46276);
      } else {
         if (this.field_46275 != null) {
            long var4 = Util.getMeasuringTimeMs() - this.field_46286;
            if (var4 == 0L) {
               var4 = 1L;
            }

            this.field_46276 = 1000L * (this.field_46272.field_7734 - this.field_46275) / var4;
            this.method_41518(var1, this.field_46276);
         }

         this.field_46275 = this.field_46272.field_7734;
         this.field_46286 = Util.getMeasuringTimeMs();
      }
   }

   private void method_41518(class_7966 var1, long var2) {
      if (var2 > 0L) {
         int var6 = this.field_948.method_45395(this.field_46290);
         String var7 = "(" + class_5616.method_25482(var2) + "/s)";
         this.field_948.method_45385(var1, var7, (float)(this.field_941 / 2 + var6 / 2 + 15), 84.0F, 16777215);
      }
   }

   private void method_41514() {
      new Thread(() -> {
         try {
            if (!field_46279.tryLock(1L, TimeUnit.SECONDS)) {
               this.field_46285 = new TranslationTextComponent("mco.download.failed");
            } else if (this.field_46291) {
               this.method_41510();
            } else {
               this.field_46285 = new TranslationTextComponent("mco.download.downloading", this.field_46292);
               class_8531 var3 = new class_8531();
               var3.method_39262(this.field_46280.field_41509);
               var3.method_39272(this.field_46280, this.field_46292, this.field_46272, this.field_943.method_8591());

               while (!var3.method_39274()) {
                  if (var3.method_39267()) {
                     var3.method_39278();
                     this.field_46273 = new TranslationTextComponent("mco.download.failed");
                     this.field_46271.method_32687(class_1402.field_7625);
                     return;
                  }

                  if (var3.method_39265()) {
                     if (!this.field_46274) {
                        this.field_46285 = new TranslationTextComponent("mco.download.extracting");
                     }

                     this.field_46274 = true;
                  }

                  if (this.field_46291) {
                     var3.method_39278();
                     this.method_41510();
                     return;
                  }

                  try {
                     Thread.sleep(500L);
                  } catch (InterruptedException var10) {
                     field_46269.error("Failed to check Realms backup download status");
                  }
               }

               this.field_46293 = true;
               this.field_46285 = new TranslationTextComponent("mco.download.done");
               this.field_46271.method_32687(class_1402.field_7625);
            }
         } catch (InterruptedException var11) {
            field_46269.error("Could not acquire upload lock");
         } catch (Exception var12) {
            this.field_46273 = new TranslationTextComponent("mco.download.failed");
            var12.printStackTrace();
         } finally {
            if (!field_46279.isHeldByCurrentThread()) {
               return;
            } else {
               field_46279.unlock();
               this.field_46278 = false;
               this.field_46293 = true;
            }
         }
      }).start();
   }

   private void method_41510() {
      this.field_46285 = new TranslationTextComponent("mco.download.cancelled");
   }
}
