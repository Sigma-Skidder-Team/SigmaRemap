package remapped;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Stream;
import java.util.zip.GZIPOutputStream;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7182 extends class_1094 {
   private static final Logger field_36941 = LogManager.getLogger();
   private static final ReentrantLock field_36948 = new ReentrantLock();
   private static final String[] field_36936 = new String[]{"", ".", ". .", ". . ."};
   private static final ITextComponent field_36933 = new TranslationTextComponent("mco.upload.verifying");
   private final class_5824 field_36943;
   private final class_460 field_36929;
   private final long field_36930;
   private final int field_36938;
   private final class_1938 field_36942;
   private final RateLimiter field_36950;
   private volatile ITextComponent[] field_36949;
   private volatile ITextComponent field_36932 = new TranslationTextComponent("mco.upload.preparing");
   private volatile String field_36934;
   private volatile boolean field_36928;
   private volatile boolean field_36935;
   private volatile boolean field_36952 = true;
   private volatile boolean field_36940;
   private class_9521 field_36944;
   private class_9521 field_36931;
   private int field_36951;
   private Long field_36946;
   private Long field_36937;
   private long field_36945;
   private final Runnable field_36939;

   public class_7182(long var1, int var3, class_5824 var4, class_460 var5, Runnable var6) {
      this.field_36930 = var1;
      this.field_36938 = var3;
      this.field_36943 = var4;
      this.field_36929 = var5;
      this.field_36942 = new class_1938();
      this.field_36950 = RateLimiter.create(0.1F);
      this.field_36939 = var6;
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_36944 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, this.field_940 - 42, 200, 20, class_1402.field_7632, var1 -> this.method_32907())
      );
      this.field_36944.field_36677 = false;
      this.field_36931 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, this.field_940 - 42, 200, 20, class_1402.field_7633, var1 -> this.method_32913())
      );
      if (!this.field_36940) {
         if (this.field_36943.field_29566 != -1) {
            this.field_36943.method_26363(() -> {
               if (!this.field_36940) {
                  this.field_36940 = true;
                  this.field_943.method_8609(this);
                  this.method_32917();
               }
            });
         } else {
            this.method_32917();
         }
      }
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   private void method_32907() {
      this.field_36939.run();
   }

   private void method_32913() {
      this.field_36928 = true;
      this.field_943.method_8609(this.field_36943);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         if (!this.field_36952) {
            this.method_32907();
         } else {
            this.method_32913();
         }

         return true;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      if (!this.field_36935 && this.field_36942.field_9903 != 0L && this.field_36942.field_9903 == this.field_36942.field_9902) {
         this.field_36932 = field_36933;
         this.field_36931.field_36675 = false;
      }

      method_9788(var1, this.field_948, this.field_36932, this.field_941 / 2, 50, 16777215);
      if (this.field_36952) {
         this.method_32915(var1);
      }

      if (this.field_36942.field_9903 != 0L && !this.field_36928) {
         this.method_32914(var1);
         this.method_32911(var1);
      }

      if (this.field_36949 != null) {
         for (int var7 = 0; var7 < this.field_36949.length; var7++) {
            method_9788(var1, this.field_948, this.field_36949[var7], this.field_941 / 2, 110 + 12 * var7, 16711680);
         }
      }

      super.method_6767(var1, var2, var3, var4);
   }

   private void method_32915(class_7966 var1) {
      int var4 = this.field_948.method_45379(this.field_36932);
      this.field_948.method_45385(var1, field_36936[this.field_36951 / 10 % field_36936.length], (float)(this.field_941 / 2 + var4 / 2 + 5), 50.0F, 16777215);
   }

   private void method_32914(class_7966 var1) {
      double var4 = Math.min((double)this.field_36942.field_9903 / (double)this.field_36942.field_9902, 1.0);
      this.field_36934 = String.format(Locale.ROOT, "%.1f", var4 * 100.0);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_3542.method_16354();
      double var6 = (double)(this.field_941 / 2 - 100);
      double var8 = 0.5;
      class_8042 var10 = class_8042.method_36499();
      class_9633 var11 = var10.method_36501();
      var11.method_44471(7, class_7985.field_40903);
      var11.method_35761(var6 - 0.5, 95.5, 0.0).method_35743(217, 210, 210, 255).method_35735();
      var11.method_35761(var6 + 200.0 * var4 + 0.5, 95.5, 0.0).method_35743(217, 210, 210, 255).method_35735();
      var11.method_35761(var6 + 200.0 * var4 + 0.5, 79.5, 0.0).method_35743(217, 210, 210, 255).method_35735();
      var11.method_35761(var6 - 0.5, 79.5, 0.0).method_35743(217, 210, 210, 255).method_35735();
      var11.method_35761(var6, 95.0, 0.0).method_35743(128, 128, 128, 255).method_35735();
      var11.method_35761(var6 + 200.0 * var4, 95.0, 0.0).method_35743(128, 128, 128, 255).method_35735();
      var11.method_35761(var6 + 200.0 * var4, 80.0, 0.0).method_35743(128, 128, 128, 255).method_35735();
      var11.method_35761(var6, 80.0, 0.0).method_35743(128, 128, 128, 255).method_35735();
      var10.method_36500();
      class_3542.method_16432();
      method_9787(var1, this.field_948, this.field_36934 + " %", this.field_941 / 2, 84, 16777215);
   }

   private void method_32911(class_7966 var1) {
      if (this.field_36951 % 20 != 0) {
         this.method_32916(var1, this.field_36945);
      } else {
         if (this.field_36946 != null) {
            long var4 = class_9665.method_44650() - this.field_36937;
            if (var4 == 0L) {
               var4 = 1L;
            }

            this.field_36945 = 1000L * (this.field_36942.field_9903 - this.field_36946) / var4;
            this.method_32916(var1, this.field_36945);
         }

         this.field_36946 = this.field_36942.field_9903;
         this.field_36937 = class_9665.method_44650();
      }
   }

   private void method_32916(class_7966 var1, long var2) {
      if (var2 > 0L) {
         int var6 = this.field_948.method_45395(this.field_36934);
         String var7 = "(" + class_5616.method_25482(var2) + "/s)";
         this.field_948.method_45385(var1, var7, (float)(this.field_941 / 2 + var6 / 2 + 15), 84.0F, 16777215);
      }
   }

   @Override
   public void method_5312() {
      super.method_5312();
      this.field_36951++;
      if (this.field_36932 != null && this.field_36950.tryAcquire(1)) {
         ArrayList var3 = Lists.newArrayList();
         var3.add(this.field_36932.getString());
         if (this.field_36934 != null) {
            var3.add(this.field_36934 + "%");
         }

         if (this.field_36949 != null) {
            Stream.<ITextComponent>of(this.field_36949).<String>map(ITextComponent::getString).forEach(var3::add);
         }

         class_7567.method_34410(String.join(System.lineSeparator(), var3));
      }
   }

   private void method_32917() {
      this.field_36940 = true;
      new Thread(
            () -> {
               File var3 = null;
               class_176 var4 = class_176.method_777();
               long var5 = this.field_36930;

               try {
                  if (!field_36948.tryLock(1L, TimeUnit.SECONDS)) {
                     this.field_36932 = new TranslationTextComponent("mco.upload.close.failure");
                  } else {
                     label344: {
                        class_7219 var7 = null;

                        for (int var8 = 0; var8 < 20; var8++) {
                           try {
                              if (this.field_36928) {
                                 this.method_32906();
                              }

                              var7 = var4.method_775(var5, class_4875.method_22385(var5));
                              if (var7 != null) {
                                 break;
                              }
                           } catch (class_5954 var24) {
                              Thread.sleep((long)(var24.field_30351 * 1000));
                           }
                        }

                        if (var7 == null) {
                           this.field_36932 = new TranslationTextComponent("mco.upload.close.failure");
                        } else {
                           class_4875.method_22386(var5, var7.method_33066());
                           if (!var7.method_33061()) {
                              this.field_36932 = new TranslationTextComponent("mco.upload.close.failure");
                           } else if (this.field_36928) {
                              this.method_32906();
                           } else {
                              File var29 = new File(this.field_943.field_9575.getAbsolutePath(), "saves");
                              var3 = this.method_32910(new File(var29, this.field_36929.method_2203()));
                              if (this.field_36928) {
                                 this.method_32906();
                              } else if (this.method_32908(var3)) {
                                 this.field_36932 = new TranslationTextComponent("mco.upload.uploading", this.field_36929.method_2206());
                                 class_9384 var9 = new class_9384(
                                    var3,
                                    this.field_36930,
                                    this.field_36938,
                                    var7,
                                    this.field_943.method_8502(),
                                    class_7665.method_34674().getName(),
                                    this.field_36942
                                 );
                                 var9.method_43392(var3x -> {
                                    if (var3x.field_26899 >= 200 && var3x.field_26899 < 300) {
                                       this.field_36935 = true;
                                       this.field_36932 = new TranslationTextComponent("mco.upload.done");
                                       this.field_36944.method_32687(class_1402.field_7625);
                                       class_4875.method_22387(var5);
                                    } else if (var3x.field_26899 == 400 && var3x.field_26898 != null) {
                                       this.method_32909(new TranslationTextComponent("mco.upload.failed", var3x.field_26898));
                                    } else {
                                       this.method_32909(new TranslationTextComponent("mco.upload.failed", var3x.field_26899));
                                    }
                                 });

                                 while (!var9.method_43397()) {
                                    if (this.field_36928) {
                                       var9.method_43398();
                                       this.method_32906();
                                    }

                                    try {
                                       Thread.sleep(500L);
                                    } catch (InterruptedException var23) {
                                       field_36941.error("Failed to check Realms file upload status");
                                    }
                                 }
                              } else {
                                 long var11 = var3.length();
                                 class_5616 var13 = class_5616.method_25478(var11);
                                 class_5616 var14 = class_5616.method_25478(5368709120L);
                                 if (class_5616.method_25479(var11, var13).equals(class_5616.method_25479(5368709120L, var14))
                                    && var13 != class_5616.field_28520) {
                                    class_5616 var15 = class_5616.values()[var13.ordinal() - 1];
                                    this.method_32909(
                                       new TranslationTextComponent("mco.upload.size.failure.line1", this.field_36929.method_2206()),
                                       new TranslationTextComponent(
                                          "mco.upload.size.failure.line2", class_5616.method_25479(var11, var15), class_5616.method_25479(5368709120L, var15)
                                       )
                                    );
                                 } else {
                                    this.method_32909(
                                       new TranslationTextComponent("mco.upload.size.failure.line1", this.field_36929.method_2206()),
                                       new TranslationTextComponent(
                                          "mco.upload.size.failure.line2", class_5616.method_25479(var11, var13), class_5616.method_25479(5368709120L, var14)
                                       )
                                    );
                                 }
                              }
                           }
                        }
                     }
                  }
               } catch (IOException var25) {
                  this.method_32909(new TranslationTextComponent("mco.upload.failed", var25.getMessage()));
               } catch (class_3900 var26) {
                  this.method_32909(new TranslationTextComponent("mco.upload.failed", var26.toString()));
               } catch (InterruptedException var27) {
                  field_36941.error("Could not acquire upload lock");
               } finally {
                  this.field_36935 = true;
                  if (field_36948.isHeldByCurrentThread()) {
                     field_36948.unlock();
                     this.field_36952 = false;
                     this.field_36944.field_36677 = true;
                     this.field_36931.field_36677 = false;
                     if (var3 != null) {
                        field_36941.debug("Deleting file " + var3.getAbsolutePath());
                        var3.delete();
                     }
                  }

                  return;
               }
            }
         )
         .start();
   }

   private void method_32909(ITextComponent... var1) {
      this.field_36949 = var1;
   }

   private void method_32906() {
      this.field_36932 = new TranslationTextComponent("mco.upload.cancelled");
      field_36941.debug("Upload was cancelled");
   }

   private boolean method_32908(File var1) {
      return var1.length() < 5368709120L;
   }

   private File method_32910(File var1) throws IOException {
      TarArchiveOutputStream var4 = null;

      File var6;
      try {
         File var5 = File.createTempFile("realms-upload-file", ".tar.gz");
         var4 = new TarArchiveOutputStream(new GZIPOutputStream(new FileOutputStream(var5)));
         var4.setLongFileMode(3);
         this.method_32912(var4, var1.getAbsolutePath(), "world", true);
         var4.finish();
         var6 = var5;
      } finally {
         if (var4 != null) {
            var4.close();
         }
      }

      return var6;
   }

   private void method_32912(TarArchiveOutputStream var1, String var2, String var3, boolean var4) throws IOException {
      if (!this.field_36928) {
         File var7 = new File(var2);
         String var8 = !var4 ? var3 + var7.getName() : var3;
         TarArchiveEntry var9 = new TarArchiveEntry(var7, var8);
         var1.putArchiveEntry(var9);
         if (!var7.isFile()) {
            var1.closeArchiveEntry();
            File[] var10 = var7.listFiles();
            if (var10 != null) {
               for (File var14 : var10) {
                  this.method_32912(var1, var14.getAbsolutePath(), var8 + "/", false);
               }
            }
         } else {
            IOUtils.copy(new FileInputStream(var7), var1);
            var1.closeArchiveEntry();
         }
      }
   }
}
