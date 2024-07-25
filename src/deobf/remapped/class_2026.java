package remapped;

import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.FloatControl.Type;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.lwjgl.opengl.GL11;

public class class_2026 {
   private static MinecraftClient field_10270 = MinecraftClient.getInstance();
   private boolean field_10295 = false;
   private class_8896 field_10298;
   private int field_10285 = 50;
   private long field_10283 = -1L;
   private Thread field_10278 = new Thread();
   public BufferedImage field_10273;
   public String field_10291 = "";
   private class_8343 field_10271;
   private BufferedImage field_10274;
   private class_8343 field_10292;
   private boolean field_10290 = false;
   private boolean field_10277;
   private transient volatile Thread field_10287 = null;
   private int field_10294;
   private long field_10281 = 0L;
   private int field_10284;
   private class_7144 field_10275;
   private boolean field_10279 = true;
   private class_6512 field_10282 = class_6512.field_33117;
   public List<double[]> field_10297 = new ArrayList<double[]>();
   private boolean field_10272 = false;
   public ArrayList<Double> field_10293 = new ArrayList<Double>();
   public SourceDataLine field_10288;
   private static final float field_10289 = 32768.0F;
   private double field_10276;
   private boolean field_10296 = false;
   private double field_10286 = 0.0;

   public void method_9478() {
      SigmaMainClass.getInstance().method_3302().method_7908(this);
      this.method_9507();
      if (!this.method_9468()) {
         this.method_9477();
      }

      this.field_10272 = false;
   }

   public void method_9488() {
      JSONObjectImpl var3 = new JSONObjectImpl();
      var3.method_5818("volume", this.field_10285);
      var3.method_5823("spectrum", this.field_10279);
      var3.method_5818("repeat", this.field_10282.field_33115);
      SigmaMainClass.getInstance().method_3304().method_5820("music", var3);
   }

   private void method_9507() {
      if (SigmaMainClass.getInstance().method_3304().method_5850("music")) {
         JSONObjectImpl var3 = SigmaMainClass.getInstance().method_3304().method_5848("music");
         if (var3 != null) {
            if (var3.method_5850("volume")) {
               this.field_10285 = Math.max(0, Math.min(100, var3.method_5813("volume")));
            }

            if (var3.method_5850("spectrum")) {
               this.field_10279 = var3.method_5826("spectrum");
            }

            if (var3.method_5850("repeat")) {
               this.field_10282 = class_6512.method_29668(var3.method_5813("repeat"));
            }
         }
      }
   }

   @EventListen
   private void method_9493(class_3278 var1) {
      if (SigmaMainClass.getInstance().method_3312() == class_6015.field_30645) {
         if (this.field_10295 && this.field_10297.size() != 0) {
            double[] var4 = this.field_10297.get(0);
            if (this.field_10293.isEmpty()) {
               for (int var5 = 0; var5 < var4.length; var5++) {
                  if (this.field_10293.size() < 1024) {
                     this.field_10293.add(var4[var5]);
                  }
               }
            }

            float var10 = 60.0F / (float) MinecraftClient.method_8501();

            for (int var6 = 0; var6 < var4.length; var6++) {
               double var7 = this.field_10293.get(var6) - var4[var6];
               boolean var9 = !(this.field_10293.get(var6) < Double.MAX_VALUE);
               this.field_10293.set(var6, Math.min(2.256E7, Math.max(0.0, this.field_10293.get(var6) - var7 * (double)Math.min(0.335F * var10, 1.0F))));
               if (var9) {
                  this.field_10293.set(var6, 0.0);
               }
            }

            if (this.field_10293.isEmpty()) {
               return;
            }
         }
      }
   }

   @EventListen
   private void method_9494(class_7285 var1) {
      if (this.field_10295 && this.field_10297.size() != 0 && this.field_10279) {
         this.method_9469();
      }
   }

   private void method_9469() {
      if (this.field_10297.size() != 0) {
         if (this.field_10271 != null) {
            if (this.field_10293.size() != 0) {
               float var3 = 114.0F;
               float var4 = (float)Math.ceil((double)((float)field_10270.window.method_43166() / var3));

               for (int var5 = 0; (float)var5 < var3; var5++) {
                  float var6 = 1.0F - (float)(var5 + 1) / var3;
                  float var7 = (float)field_10270.window.method_43163() / 1080.0F;
                  float var8 = ((float)(Math.sqrt(this.field_10293.get(var5)) / 12.0) - 5.0F) * var7;
                  class_73.method_103(
                     (float)var5 * var4,
                     (float)field_10270.window.method_43163() - var8,
                     var4,
                     var8,
                     class_314.method_1444(class_1255.field_6920.field_6917, 0.2F * var6)
                  );
               }

               class_73.method_107();

               for (int var13 = 0; (float)var13 < var3; var13++) {
                  float var14 = (float)field_10270.window.method_43163() / 1080.0F;
                  float var15 = ((float)(Math.sqrt(this.field_10293.get(var13)) / 12.0) - 5.0F) * var14;
                  class_73.method_103((float)var13 * var4, (float)field_10270.window.method_43163() - var15, var4, var15, class_1255.field_6918.field_6917);
               }

               class_73.method_85(class_3118.field_15505);
               if (this.field_10271 != null && this.field_10292 != null) {
                  class_73.method_97(
                     0.0F, 0.0F, (float)field_10270.window.method_43166(), (float)field_10270.window.method_43163(), this.field_10292, 0.4F
                  );
               }

               class_73.method_145();
               double var9 = 0.0;
               short var16 = 4750;

               for (int var17 = 0; var17 < 3; var17++) {
                  var9 = Math.max(var9, Math.sqrt(this.field_10293.get(var17)) - 1000.0);
               }

               float var18 = 1.0F + (float)Math.round((float)(var9 / (double)(var16 - 1000)) * 0.14F * 75.0F) / 75.0F;
               GL11.glPushMatrix();
               GL11.glTranslated(60.0, (double)(field_10270.window.method_43163() - 55), 0.0);
               GL11.glScalef(var18, var18, 0.0F);
               GL11.glTranslated(-60.0, (double)(-(field_10270.window.method_43163() - 55)), 0.0);
               class_73.method_96(10.0F, (float)(field_10270.window.method_43163() - 110), 100.0F, 100.0F, this.field_10271);
               class_73.method_128(10.0F, (float)(field_10270.window.method_43163() - 110), 100.0F, 100.0F, 14.0F, 0.3F);
               GL11.glPopMatrix();
               String[] var11 = this.field_10291.split(" - ");
               byte var12 = 30;
               if (var11.length <= 1) {
                  class_73.method_87(
                     class_5320.field_27146,
                     130.0F,
                     (float)(field_10270.window.method_43163() - 70),
                     var11[0],
                     class_314.method_1444(class_1255.field_6929.field_6917, 0.5F)
                  );
                  class_73.method_87(
                     class_5320.field_27139,
                     130.0F,
                     (float)(field_10270.window.method_43163() - 70),
                     var11[0],
                     class_314.method_1444(class_1255.field_6918.field_6917, 0.7F)
                  );
               } else {
                  class_73.method_87(
                     class_5320.field_27149,
                     130.0F,
                     (float)(field_10270.window.method_43163() - 81),
                     var11[0],
                     class_314.method_1444(class_1255.field_6929.field_6917, 0.4F)
                  );
                  class_73.method_87(
                     class_5320.field_27146,
                     130.0F,
                     (float)(field_10270.window.method_43163() - 56),
                     var11[1],
                     class_314.method_1444(class_1255.field_6929.field_6917, 0.5F)
                  );
                  class_73.method_87(
                     class_5320.field_27139,
                     130.0F,
                     (float)(field_10270.window.method_43163() - 56),
                     var11[1],
                     class_314.method_1444(class_1255.field_6918.field_6917, 0.7F)
                  );
                  class_73.method_87(
                     class_5320.field_27161,
                     130.0F,
                     (float)(field_10270.window.method_43163() - 81),
                     var11[0],
                     class_314.method_1444(class_1255.field_6918.field_6917, 0.6F)
                  );
               }
            }
         }
      }
   }

   @EventListen
   private void method_9502(class_5596 var1) {
      if (!this.field_10295) {
         this.field_10297.clear();
         this.field_10293.clear();
      }

      try {
         if (this.field_10290 && this.field_10274 != null && this.field_10273 != null && this.field_10275 == null && !field_10270.method_8564()) {
            if (this.field_10292 != null) {
               this.field_10292.method_38413();
            }

            if (this.field_10271 != null) {
               this.field_10271.method_38413();
            }

            this.field_10292 = class_6568.method_30015("picture", this.field_10274);
            this.field_10271 = class_6568.method_30015("picture", this.field_10273);
            SigmaMainClass.getInstance().method_3335().method_27841(new class_8235("Now Playing", this.field_10291, 7000, this.field_10271));
            this.field_10290 = false;
         }
      } catch (IOException var5) {
         var5.printStackTrace();
      }

      if (!this.field_10290) {
         this.method_9471(this.field_10275);
      }
   }

   public class_7144 method_9495() {
      byte var3 = 0;
      return var3 >= this.field_10298.field_45627.size() ? null : this.field_10298.field_45627.get(var3);
   }

   private void method_9471(class_7144 var1) {
      if (this.field_10275 != null) {
         this.field_10297.clear();
         new Thread(() -> this.method_9485(this.field_10275)).start();
      }
   }

   private void method_9481() {
      this.field_10297.clear();
      if (this.field_10298 != null) {
         while (this.field_10287 != null && this.field_10287.isAlive()) {
            this.field_10287.interrupt();
         }

         this.field_10287 = new Thread(
            () -> {
               Object var3 = null;
               if (this.field_10284 < 0 || this.field_10284 >= this.field_10298.field_45627.size()) {
                  this.field_10284 = 0;
               }

               for (int var4 = this.field_10284; var4 < this.field_10298.field_45627.size(); var4++) {
                  URL var5 = class_7763.method_35220(this.field_10298.field_45627.get(var4).field_36800);
                  SigmaMainClass.method_3306().method_12865(var5.toString());
                  this.field_10294 = var4;
                  this.field_10275 = this.field_10298.field_45627.get(var4);
                  this.field_10297.clear();

                  while (!this.field_10295) {
                     try {
                        Thread.sleep(300L);
                     } catch (InterruptedException var23) {
                     }

                     double[] var6 = new double[0];
                     this.field_10297.clear();
                     if (Thread.interrupted()) {
                        if (this.field_10288 != null) {
                           this.field_10288.close();
                        }

                        return;
                     }
                  }

                  try {
                     URL var28 = this.method_9482(var5);
                     SigmaMainClass.method_3306().method_12865(var28 == null ? "No stream" : var28.toString());
                     if (var28 != null) {
                        URLConnection var7 = var28.openConnection();
                        var7.setConnectTimeout(14000);
                        var7.setReadTimeout(14000);
                        var7.setUseCaches(true);
                        var7.setDoOutput(true);
                        var7.setRequestProperty("Connection", "Keep-Alive");
                        InputStream var8 = var7.getInputStream();
                        class_1204 var9 = new class_1204(var8, new class_6767(this));
                        class_4791 var10 = new class_4791(var9);
                        class_5111 var11 = var10.method_22093();
                        List var12 = var11.method_23445();
                        if (var12.isEmpty()) {
                           SigmaMainClass.method_3306().method_12865("No content");
                        }

                        class_5043 var13 = (class_5043)var11.method_23445().get(1);
                        AudioFormat var14 = new AudioFormat((float)var13.method_23221(), var13.method_23222(), var13.method_23218(), true, true);
                        this.field_10288 = AudioSystem.getSourceDataLine(var14);
                        this.field_10288.open();
                        this.field_10288.start();
                        this.field_10283 = (long)var11.method_23440();
                        if (this.field_10283 > 1300L) {
                           var9.close();
                           SigmaMainClass.getInstance().method_3335().method_27841(new class_8235("Now Playing", "Music is too long."));
                        }

                        class_8405 var15 = new class_8405(var13.method_8200());
                        class_3885 var16 = new class_3885();

                        while (var13.method_8219()) {
                           while (!this.field_10295) {
                              Thread.sleep(300L);
                              double[] var17 = new double[0];
                              this.field_10297.clear();
                              if (Thread.interrupted()) {
                                 this.field_10288.close();
                                 return;
                              }
                           }

                           class_7553 var18 = var13.method_8199();
                           var15.method_38703(var18.method_34368(), var16);
                           var3 = var16.method_17971();
                           this.field_10288.write((byte[])var3, 0, ((Object[])var3).length);
                           float[] var29 = method_9476(var16.method_17971(), var14);
                           class_8416 var19 = new class_8416(var29.length);
                           float[][] var20 = var19.method_13692(var29);
                           float[] var21 = var20[0];
                           float[] var22 = var20[1];
                           this.field_10297.add(method_9472(var21, var22));
                           if (this.field_10297.size() > 18) {
                              this.field_10297.remove(0);
                           }

                           this.method_9490(this.field_10288, this.field_10285);
                           if (!Thread.interrupted()) {
                              this.field_10281 = Math.round(var13.method_8218());
                              this.field_10286 = var13.method_8212();
                              if (this.field_10296) {
                                 var13.method_8211(this.field_10276);
                                 this.field_10281 = (long)this.field_10276;
                                 this.field_10296 = false;
                              }
                           }

                           if (!var13.method_8219()
                              && (
                                 this.field_10282 == class_6512.field_33116
                                    || this.field_10282 == class_6512.field_33117 && this.field_10298.field_45627.size() == 1
                              )) {
                              var13.method_8211(0.0);
                              this.field_10281 = 0L;
                           }

                           if (Thread.interrupted()) {
                              this.field_10288.close();
                              return;
                           }
                        }

                        this.field_10288.close();
                        var9.close();
                     } else {
                        Thread.sleep(1000L);
                     }
                  } catch (IOException var24) {
                     if (var24.getMessage() != null && var24.getMessage().contains("403")) {
                        System.out.println("installing");
                        this.method_9504();
                     }
                  } catch (LineUnavailableException var25) {
                     var25.printStackTrace();
                  } catch (InterruptedException var26) {
                     var26.printStackTrace();
                     break;
                  }

                  if (this.field_10282 == class_6512.field_33116) {
                     var4--;
                  } else if (this.field_10282 == class_6512.field_33117 && var4 == this.field_10298.field_45627.size() - 1) {
                     var4 = -1;
                  } else if (this.field_10282 == class_6512.field_33112) {
                     return;
                  }

                  if (var4 < -1 || var4 >= this.field_10298.field_45627.size()) {
                     var4 = 0;
                  }
               }
            }
         );
         this.field_10287.start();
      }
   }

   public void method_9475(class_6512 var1) {
      this.field_10282 = var1;
      this.method_9488();
   }

   public class_6512 method_9501() {
      return this.field_10282;
   }

   private static float[] method_9476(byte[] var0, AudioFormat var1) {
      float[] var4 = new float[var0.length / var1.getFrameSize()];

      for (int var5 = 0; var5 < var0.length; var5 += var1.getFrameSize()) {
         int var6 = !var1.isBigEndian() ? method_9505(var0, var5, var1.getFrameSize()) : method_9467(var0, var5, var1.getFrameSize());
         var4[var5 / var1.getFrameSize()] = (float)var6 / 32768.0F;
      }

      return var4;
   }

   private static double[] method_9472(float[] var0, float[] var1) {
      double[] var4 = new double[var0.length / 2];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = Math.sqrt((double)(var0[var5] * var0[var5] + var1[var5] * var1[var5]));
      }

      return var4;
   }

   private static int method_9505(byte[] var0, int var1, int var2) {
      int var5 = 0;

      for (int var6 = 0; var6 < var2; var6++) {
         int var7 = var0[var1 + var6] & 255;
         var5 += var7 << 8 * var6;
      }

      return var5;
   }

   private static int method_9467(byte[] var0, int var1, int var2) {
      int var5 = 0;

      for (int var6 = 0; var6 < var2; var6++) {
         int var7 = var0[var1 + var6] & 255;
         var5 += var7 << 8 * (var2 - var6 - 1);
      }

      return var5;
   }

   public void method_9485(class_7144 var1) {
      try {
         this.field_10290 = true;
         BufferedImage var4 = ImageIO.read(new URL(var1.field_36801));
         this.field_10274 = class_7849.method_35510(var4, 15);
         this.field_10274 = this.field_10274
            .getSubimage(0, (int)((float)this.field_10274.getHeight() * 0.75F), this.field_10274.getWidth(), (int)((float)this.field_10274.getHeight() * 0.2F));
         this.field_10291 = var1.field_36798;
         if (var4.getHeight() != var4.getWidth()) {
            if (this.field_10291.contains("[NCS Release]")) {
               this.field_10273 = var4.getSubimage(1, 3, 170, 170);
            } else {
               this.field_10273 = var4.getSubimage(70, 0, 180, 180);
            }
         } else {
            this.field_10273 = var4;
         }

         this.field_10275 = null;
      } catch (IOException | NumberFormatException var5) {
         var5.printStackTrace();
      }
   }

   public void method_9496(boolean var1) {
      if (!var1 && this.field_10288 != null) {
         this.field_10288.flush();
      }

      this.field_10295 = var1;
   }

   public void method_9509(int var1) {
      this.field_10285 = var1;
      this.method_9488();
   }

   public void method_9480(boolean var1) {
      this.field_10279 = var1;
      this.method_9488();
   }

   public boolean method_9498() {
      return this.field_10279;
   }

   public int method_9503() {
      return this.field_10285;
   }

   public void method_9473() {
      if (this.field_10298 != null) {
         this.field_10284 = this.field_10294 - 1;
         this.field_10281 = 0L;
         this.field_10286 = 0.0;
         this.method_9481();
      }
   }

   public void method_9474() {
      if (this.field_10298 != null) {
         this.field_10284 = this.field_10294 + 1;
         this.field_10281 = 0L;
         this.field_10286 = 0.0;
         this.method_9481();
      }
   }

   public void method_9489(class_8896 var1, class_7144 var2) {
      if (var1 == null) {
         var1 = new class_8896("temp", "temp", class_9023.field_46153);
         var1.field_45627.add(var2);
      }

      this.field_10298 = var1;
      this.field_10295 = true;
      this.field_10281 = 0L;
      this.field_10286 = 0.0;

      for (int var5 = 0; var5 < var1.field_45627.size(); var5++) {
         if (var1.field_45627.get(var5) == var2) {
            this.field_10284 = var5;
         }
      }

      this.method_9481();
   }

   public boolean method_9497() {
      return true;
   }

   public boolean method_9486() {
      return this.field_10295;
   }

   public URL method_9470() {
      return null;
   }

   public long method_9466() {
      return this.field_10281;
   }

   public double method_9484() {
      return this.field_10286;
   }

   public URL method_9482(URL var1) {
      String var4 = var1.toString();
      String var5 = System.getProperty("user.home");
      class_4199 var6 = new class_4199(var4, var5);
      var6.method_19543("g");
      var6.method_19545("no-check-certificate", " ");
      var6.method_19545("rm-cache-dir", " ");
      var6.method_19544("retries", 10);
      var6.method_19544("f", 18);

      try {
         class_9685.method_44777(this.method_9491());
         class_5171 var7 = class_9685.method_44781(var6);
         String var8 = var7.method_23699();
         return new URL(var8);
      } catch (class_4231 var9) {
         if (var9.getMessage() != null
            && var9.getMessage().contains("ERROR: This video contains content from")
            && var9.getMessage().contains("who has blocked it in your country on copyright grounds")) {
            SigmaMainClass.getInstance().method_3335().method_27841(new class_8235("Now Playing", "Not available in your region."));
         } else {
            var9.printStackTrace();
            this.method_9504();
         }
      } catch (MalformedURLException var10) {
         class_314.method_1443("URL E " + var10.toString());
         var10.printStackTrace();
      }

      return null;
   }

   public String method_9487() {
      return this.field_10291;
   }

   public class_8343 method_9506() {
      return this.field_10292;
   }

   public class_8343 method_9500() {
      return this.field_10271;
   }

   public int method_9483() {
      return (int)this.field_10283;
   }

   private void method_9490(SourceDataLine var1, int var2) {
      try {
         FloatControl var5 = (FloatControl)var1.getControl(Type.MASTER_GAIN);
         BooleanControl var6 = (BooleanControl)var1.getControl(javax.sound.sampled.BooleanControl.Type.MUTE);
         if (var2 == 0) {
            var6.setValue(true);
         } else {
            var6.setValue(false);
            var5.setValue((float)(Math.log((double)var2 / 100.0) / Math.log(10.0) * 20.0));
         }
      } catch (Exception var7) {
      }
   }

   public void method_9479(double var1) {
      this.field_10276 = var1;
      this.field_10281 = (long)this.field_10276;
      this.field_10296 = true;
   }

   public boolean method_9468() {
      File var3 = new File(SigmaMainClass.getInstance().method_3334() + "/music/youtube-dl");
      if (Util.getOperatingSystem() == OperatingSystem.WINDOWS) {
         var3 = new File(SigmaMainClass.getInstance().method_3334() + "/music/youtube-dl.exe");
      }

      return var3.exists();
   }

   public void method_9477() {
      SigmaMainClass.getInstance().method_3326().method_12865("Updating dependencies threaded");
      new Thread(() -> this.method_9504()).start();
   }

   public void method_9504() {
      if (!this.field_10272) {
         File var3 = new File(SigmaMainClass.getInstance().method_3334() + "/music/");
         var3.mkdirs();
         SigmaMainClass.getInstance().method_3326().method_12865("Updating dependencies");
         if (Util.getOperatingSystem() == OperatingSystem.WINDOWS) {
            try {
               File var4 = new File(SigmaMainClass.getInstance().method_3334() + "/music/youtube-dl.exe");
               CloseableHttpClient var5 = HttpClients.createDefault();
               CloseableHttpResponse var6 = var5.execute(new HttpGet("https://youtube-dl.org/downloads/latest/youtube-dl.exe"));
               Throwable var7 = null;

               try {
                  HttpEntity var8 = var6.getEntity();
                  if (var8 != null) {
                     try (FileOutputStream var9 = new FileOutputStream(var4)) {
                        var8.writeTo(var9);
                     }
                  }
               } catch (Throwable var97) {
                  var7 = var97;
                  throw var97;
               } finally {
                  if (var6 != null) {
                     if (var7 != null) {
                        try {
                           var6.close();
                        } catch (Throwable var88) {
                           var7.addSuppressed(var88);
                        }
                     } else {
                        var6.close();
                     }
                  }
               }
            } catch (IOException var99) {
               var99.printStackTrace();
            }
         } else {
            try {
               File var100 = new File(SigmaMainClass.getInstance().method_3334() + "/music/youtube-dl");
               CloseableHttpClient var101 = HttpClients.createDefault();
               CloseableHttpResponse var102 = var101.execute(new HttpGet("http://youtube-dl.org/downloads/latest/youtube-dl"));
               Throwable var103 = null;

               try {
                  HttpEntity var104 = var102.getEntity();
                  if (var104 != null) {
                     try (FileOutputStream var105 = new FileOutputStream(var100)) {
                        var104.writeTo(var105);
                     }
                  }
               } catch (Throwable var93) {
                  var103 = var93;
                  throw var93;
               } finally {
                  if (var102 != null) {
                     if (var103 != null) {
                        try {
                           var102.close();
                        } catch (Throwable var86) {
                           var103.addSuppressed(var86);
                        }
                     } else {
                        var102.close();
                     }
                  }
               }
            } catch (IOException var95) {
               var95.printStackTrace();
            }
         }

         System.out.println("done");
         this.field_10272 = true;
      }
   }

   public String method_9491() {
      String var3 = SigmaMainClass.getInstance().method_3334().getAbsolutePath() + "/music/youtube-dl";
      if (Util.getOperatingSystem() != OperatingSystem.WINDOWS) {
         File var4 = new File(var3);
         var4.setExecutable(true);
      } else {
         var3 = var3 + ".exe";
      }

      return var3;
   }

   public boolean method_9492() {
      if (Util.getOperatingSystem() == OperatingSystem.WINDOWS) {
         return true;
      } else {
         File var3 = new File("/usr/local/bin/python");
         if (var3.exists()) {
            Process var4 = null;

            try {
               var4 = new ProcessBuilder("/usr/local/bin/python", "-V").start();
               InputStream var5 = var4.getErrorStream();
               InputStreamReader var6 = new InputStreamReader(var5);
               BufferedReader var7 = new BufferedReader(var6);

               String var8;
               try {
                  while ((var8 = var7.readLine()) != null) {
                     if (var8.contains("2.7.17")) {
                        return true;
                     }
                  }
               } catch (IOException var10) {
               }
            } catch (IOException var11) {
            }
         }

         return false;
      }
   }

   public boolean method_9499() {
      if (Util.getOperatingSystem() != OperatingSystem.WINDOWS) {
         return true;
      } else {
         boolean var3 = false;

         try {
            var3 = Advapi32Util.registryGetIntValue(
                  WinReg.HKEY_LOCAL_MACHINE, "SOFTWARE\\WOW6432Node\\Microsoft\\VisualStudio\\10.0\\VC\\VCRedist\\x86", "Installed"
               )
               == 1;
         } catch (RuntimeException var5) {
         }

         try {
            var3 = var3
               || Advapi32Util.registryGetIntValue(WinReg.HKEY_LOCAL_MACHINE, "SOFTWARE\\Microsoft\\VisualStudio\\10.0\\VC\\VCRedist\\x86", "Installed") == 1;
         } catch (RuntimeException var6) {
         }

         return var3;
      }
   }
}
