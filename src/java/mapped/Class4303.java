package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.music.MusicManager;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class9133;
import com.mentalfrostbyte.jello.unmapped.Class9578;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.ImageUtil;
import com.mentalfrostbyte.jello.util.TextureUtil;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

import java.io.IOException;
import java.net.CookieManager;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class4303 extends Class4278 {
   private int field20845 = 250;
   private int field20846 = 40;
   private int field20847 = 64;
   private int field20848 = 94;
   private String field20849 = "Music Player";
   public static URL field20850;
   private Class4339 field20851;
   private Class4339 field20852;
   private Class4305 field20853;
   private MusicManager field20854 = Client.getInstance().getMusicManager();
   public static Map<String, Class9578> field20855 = new LinkedHashMap<String, Class9578>();
   public static String field20856;
   public static Class9578 field20857;
   private Class4240 field20858;
   private Class4240 field20859;
   private Class4240 field20860;
   private Class4240 field20861;
   private Class4374 field20862;
   private int field20863;
   private Texture field20864;
   private Class4305 field20865;
   public Class4301 field20866;
   public Class4359 field20867;
   public static Class9578[] field20868;
   private static CookieManager field20869 = new CookieManager();
   public static long field20870 = 0L;
   public float field20871 = 0.0F;
   public float field20872 = 0.0F;
   private Animation field20873 = new Animation(80, 150, Direction.BACKWARDS);
   public boolean field20874 = false;

   public Class4303(Class4305 var1, String var2) {
      super(var1, var2, 875, 55, 800, 600, false);
      field20870 = System.nanoTime();
      this.method13268(800);
      this.method13270(600);
      this.method13264(Math.abs(this.method13263()));
      this.method13266(Math.abs(this.method13265()));
      this.method13230(this.field20851 = new Class4339(this, "musictabs", 0, this.field20847 + 14, this.field20845, this.method13269() - 64 - this.field20848));
      this.method13230(
         this.field20853 = new Class4339(
            this, "musiccontrols", this.field20845, this.method13269() - this.field20848, this.method13267() - this.field20845, this.field20848
         )
      );
      this.method13230(this.field20865 = new Class4305(this, "reShowView", 0, 0, 1, this.method13269()));
      Class4265 var5;
      this.method13230(var5 = new Class4265(this, "spectrumButton", 15, this.field20898 - 140, 40, 40, this.field20854.method24313()));
      var5.method13292(true);
      var5.method13251((var1x, var2x) -> {
         this.field20854.method24312(!this.field20854.method24313());
         ((Class4265)var1x).method13099(this.field20854.method24313());
      });
      this.field20851.method13300(false);
      var5.method13300(false);
      this.field20853.method13300(false);
      this.field20865.method13300(false);
      Class6387 var6 = new Class6387(1250067, -15329770).method19410(ClientColors.LIGHT_GREYISH_BLUE.getColor).method19414(Class2218.field14492);
      ArrayList var7 = new ArrayList();
      Class4303 var8 = this;
      int var9 = 0;

      for (Class9578 var13 : field20868) {
         var7.add(new Thread(() -> {
            if (!field20855.containsKey(var13.field44776) && !var13.field44779) {
               var13.field44779 = true;
               var13.method37195();

               for (int var6x = 0; var13.field44778.size() == 0 && var6x < 4; var6x++) {
                  try {
                     Thread.sleep(4000L);
                  } catch (InterruptedException var8x) {
                  }

                  var13.method37195();
               }

               field20855.put(var13.field44776, var13);
            }

            this.method13222(new Class511(this, var13, var6, var8));
         }));
         var9++;
         ((Thread)var7.get(var7.size() - 1)).start();
      }

      int var15 = (this.method13267() - this.field20845 - 38) / 2;
      this.field20853
         .method13230(
            this.field20858 = new Class4235(
               this.field20853, "play", var15, 27, 38, 38, ResourcesDecrypter.playPNG, new Class6387(ClientColors.LIGHT_GREYISH_BLUE.getColor), null
            )
         );
      this.field20853
         .method13230(
            this.field20859 = new Class4235(
               this.field20853, "pause", var15, 27, 38, 38, ResourcesDecrypter.pausePNG, new Class6387(ClientColors.LIGHT_GREYISH_BLUE.getColor), null
            )
         );
      this.field20853
         .method13230(
            this.field20860 = new Class4235(
               this.field20853, "forwards", var15 + 114, 23, 46, 46, ResourcesDecrypter.forwardsPNG, new Class6387(ClientColors.LIGHT_GREYISH_BLUE.getColor), null
            )
         );
      this.field20853
         .method13230(
            this.field20861 = new Class4235(
               this.field20853, "backwards", var15 - 114, 23, 46, 46, ResourcesDecrypter.backwardsPNG, new Class6387(ClientColors.LIGHT_GREYISH_BLUE.getColor), null
            )
         );
      this.field20853.method13230(this.field20862 = new Class4374(this.field20853, "volume", this.method13267() - this.field20845 - 19, 14, 4, 40));
      Class4249 var16;
      this.field20853.method13230(var16 = new Class4249(this.field20853, "repeat", 14, 34, 27, 20, this.field20854.method24304()));
      var16.method13036(var2x -> this.field20854.method24303(var16.method13038()));
      this.method13230(this.field20867 = new Class4359(this, "progress", this.field20845, this.method13269() - 5, this.method13267() - this.field20845, 5));
      this.field20867.method13292(true);
      this.field20867.method13300(false);
      this.field20865.method13292(true);
      this.field20865.method13247((var1x, var2x) -> {
         this.field20874 = true;
         this.field20871 = (float)this.method13263();
         this.field20872 = (float)this.method13265();
      });
      this.field20859.method13288(false);
      this.field20858.method13288(false);
      this.field20858.method13251((var1x, var2x) -> this.field20854.method24310(true));
      this.field20859.method13251((var1x, var2x) -> this.field20854.method24310(false));
      this.field20860.method13251((var1x, var2x) -> this.field20854.method24316());
      this.field20861.method13251((var1x, var2x) -> this.field20854.method24315());
      this.field20862.method13709(var1x -> this.field20854.method24311((int)((1.0F - this.field20862.method13707()) * 100.0F)));
      this.field20862.method13708(1.0F - (float)this.field20854.method24314() / 100.0F);
      this.method13230(
         this.field20866 = new Class4301(
            this, "search", this.field20845, 0, this.method13267() - this.field20845, this.method13269() - this.field20848, "Search..."
         )
      );
      this.field20866.method13288(true);
      this.field20866.method13300(false);
   }

   private void method13189(Class4339 var1) {
      if (this.field20852 != null) {
         this.field20852.method13288(false);
      }

      var1.method13288(true);
      this.field20849 = var1.method13303();
      this.field20852 = var1;
      this.field20866.method13288(false);
      this.field20852.field21207 = 65;
   }

   private void method13190(Class9578 var1, Class9133 var2) {
      if (!((Class4308)this.method13258()).method13314()) {
         this.field20854.method24317(var1, var2);
         field20857 = var1;
      }
   }

   private void method13191(Class9133 var1) {
      field20856 = var1.field41971;
      field20856 = field20856.replaceAll("\\(.*\\)", "");
      field20856 = field20856.replaceAll("\\[.*\\]", "");
   }

   @Override
   public void method13028(int var1, int var2) {
      long var5 = System.nanoTime() - field20870;
      float var7 = Math.min(10.0F, Math.max(0.0F, (float)var5 / 1.810361E7F));
      field20870 = System.nanoTime();
      super.method13028(var1, var2);
      if (this.field20892 instanceof Class4308) {
         if (!this.method13216()) {
            if ((this.field20909 || this.field20874) && !this.method13214() && !this.method13216()) {
               this.field20874 = true;
               int var11 = this.field20892.method13267() - 20 - this.method13267();
               int var13 = (this.field20892.method13269() - this.method13269()) / 2;
               float var10 = this.field20871 - (float)var11;
               this.field20871 = Math.max(this.field20871 - (this.field20871 - (float)var11) * 0.25F * var7, (float)var11);
               if (!(this.field20872 - (float)var13 > 0.0F)) {
                  Math.min(this.field20872 = this.field20872 - (this.field20872 - (float)var13) * 0.2F * var7, (float)var13);
               } else {
                  Math.max(this.field20872 = this.field20872 - (this.field20872 - (float)var13) * 0.2F * var7, (float)var13);
               }

               if (!(this.field20871 - (float)var11 < 0.0F)) {
                  if (this.field20871 - (float)var11 - (float)this.method13267() > 0.0F) {
                     this.field20871 = (float)var11;
                  }
               } else {
                  this.field20871 = (float)var11;
               }

               this.method13264((int)this.field20871);
               this.method13266((int)this.field20872);
               if (Math.abs(this.field20871 - (float)var11) < 2.0F && Math.abs(this.field20872 - (float)var13) < 2.0F) {
                  this.method13215(true);
                  this.field20874 = false;
               }
            } else if (this.method13263() + this.method13267() > this.field20892.method13267() || this.method13263() < 0 || this.method13265() < 0) {
               if (this.field20871 == 0.0F || this.field20872 == 0.0F) {
                  this.field20871 = (float)this.method13263();
                  this.field20872 = (float)this.method13265();
               }

               int var8 = this.field20892.method13267() - 40;
               int var9 = (this.field20892.method13269() - this.method13269()) / 2;
               this.field20871 = Math.min(this.field20871 - (this.field20871 - (float)var8) * 0.25F * var7, (float)var8);
               if (!(this.field20872 - (float)var9 > 0.0F)) {
                  Math.min(this.field20872 = this.field20872 - (this.field20872 - (float)var9) * 0.2F * var7, (float)var9);
               } else {
                  Math.max(this.field20872 = this.field20872 - (this.field20872 - (float)var9) * 0.2F * var7, (float)var9);
               }

               if (!(this.field20871 - (float)var8 > 0.0F)) {
                  if (this.field20871 - (float)var8 + (float)this.method13267() < 0.0F) {
                     this.field20871 = (float)var8;
                  }
               } else {
                  this.field20871 = (float)var8;
               }

               if (Math.abs(this.field20871 - (float)var8) < 2.0F && Math.abs(this.field20872 - (float)var9) < 2.0F) {
                  this.field20871 = (float)this.method13263();
                  this.field20872 = (float)this.method13265();
               }

               this.method13264((int)this.field20871);
               this.method13266((int)this.field20872);
               this.method13215(false);
               this.method13217(false);
            }
         } else {
            int var12 = var1 - this.field20880 - (this.field20892 == null ? 0 : this.field20892.method13271());
            short var14 = 200;
            if (var12 + this.method13267() > this.field20892.method13267() + var14 && var1 - this.field20878 > 70) {
               int var15 = var12 - this.method13263() - var14;
               this.method13264((int)((float)this.method13263() + (float)var15 * 0.5F));
               this.field20871 = (float)this.method13263();
               this.field20872 = (float)this.method13265();
            }
         }
      }
   }

   @Override
   public void method13027(float var1) {
      super.method13224();
      super.method13225();
      this.field20865.method13268(this.method13263() + this.method13267() <= this.field20892.method13267() ? 0 : 41);
      this.field20873
         .changeDirection(this.method13263() + this.method13267() > this.field20892.method13267() && !this.field20874 ? Direction.FORWARDS : Direction.BACKWARDS);
      var1 *= 0.5F + (1.0F - this.field20873.calcPercent()) * 0.5F;
      if (this.field20854.method24319()) {
         this.field20858.method13288(false);
         this.field20859.method13288(true);
      } else {
         this.field20858.method13288(true);
         this.field20859.method13288(false);
      }

      Class3192.method11426(
         (float)(this.method13263() + this.field20845),
         (float)this.method13265(),
         (float)(this.method13263() + this.method13267()),
         (float)(this.method13265() + this.method13269() - this.field20848),
         Class5628.method17688(-14277082, var1 * 0.8F)
      );
      Class3192.method11426(
         (float)this.method13263(),
         (float)this.method13265(),
         (float)(this.method13263() + this.field20845),
         (float)(this.method13265() + this.method13269() - this.field20848),
         Class5628.method17688(-16777216, var1 * 0.95F)
      );
      this.method13193(var1);
      this.method13194(var1);
      this.method13192(var1);
      byte var4 = 55;
      Class3192.method11439(
         ResourceRegistry.JelloLightFont40,
         (float)(var4 + this.method13263()),
         (float)(this.method13265() + 20),
         "Jello",
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
      );
      Class3192.method11439(
         ResourceRegistry.JelloLightFont20,
         (float)(var4 + this.method13263() + 80),
         (float)(this.method13265() + 40),
         "music",
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
      );
      Class3192.method11463((float)this.method13263(), (float)this.method13265(), (float)this.method13267(), (float)this.method13269(), 14.0F, var1);
      super.method13027(var1);
      if (this.field20852 != null) {
         this.method13196(var1);
      }
   }

   private void method13192(float var1) {
      int var4 = (int)this.field20854.method24321();
      int var5 = this.field20854.method24327();
      Class3192.method11439(
         ResourceRegistry.JelloLightFont14,
         (float)(this.method13263() + this.field20845 + 14),
         (float)(this.method13265() + this.method13269() - 10) - 22.0F * var1,
         Class9275.method34955(var4),
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * var1)
      );
      Class3192.method11439(
         ResourceRegistry.JelloLightFont14,
         (float)(this.method13263() + this.method13267() - 14 - ResourceRegistry.JelloLightFont14.method23942(Class9275.method34955(var5))),
         (float)(this.method13265() + this.method13269() - 10) - 22.0F * var1,
         Class9275.method34955(var5),
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * var1)
      );
   }

   private void method13193(float var1) {
      Texture var4 = this.field20854.method24326();
      Texture var5 = this.field20854.method24325();
      if (var4 != null && var5 != null) {
         Class3192.method11449(
            (float)this.method13263(),
            (float)(this.method13265() + this.method13269() - this.field20848),
            (float)this.method13267(),
            (float)this.field20848,
            var5,
            Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * var1)
         );
         Class3192.method11426(
            (float)this.method13263(),
            (float)(this.method13265() + this.method13269() - this.field20848),
            (float)(this.method13263() + this.method13267()),
            (float)(this.method13265() + this.method13269() - 5),
            Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.43F * var1)
         );
         Class3192.method11426(
            (float)this.method13263(),
            (float)(this.method13265() + this.method13269() - 5),
            (float)(this.method13263() + this.field20845),
            (float)(this.method13265() + this.method13269()),
            Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.43F * var1)
         );
         Class3192.method11449(
            (float)(this.method13263() + (this.field20845 - 114) / 2),
            (float)(this.method13265() + this.method13269() - 170),
            114.0F,
            114.0F,
            var4,
            Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
         );
         Class3192.method11463(
            (float)(this.method13263() + (this.field20845 - 114) / 2), (float)(this.method13265() + this.method13269() - 170), 114.0F, 114.0F, 14.0F, var1
         );
      } else {
         Class3192.method11449(
            (float)this.method13263(),
            (float)(this.method13265() + this.method13269() - this.field20848),
            (float)this.method13267(),
            (float)this.field20848,
            ResourcesDecrypter.bgPNG,
            Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * var1)
         );
         Class3192.method11426(
            (float)this.method13263(),
            (float)(this.method13265() + this.method13269() - this.field20848),
            (float)(this.method13263() + this.method13267()),
            (float)(this.method13265() + this.method13269() - 5),
            Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.43F * var1)
         );
         Class3192.method11426(
            (float)this.method13263(),
            (float)(this.method13265() + this.method13269() - 5),
            (float)(this.method13263() + this.field20845),
            (float)(this.method13265() + this.method13269()),
            Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.43F * var1)
         );
         Class3192.method11449(
            (float)(this.method13263() + (this.field20845 - 114) / 2),
            (float)(this.method13265() + this.method13269() - 170),
            114.0F,
            114.0F,
            ResourcesDecrypter.artworkPNG,
            Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
         );
         Class3192.method11463(
            (float)(this.method13263() + (this.field20845 - 114) / 2), (float)(this.method13265() + this.method13269() - 170), 114.0F, 114.0F, 14.0F, var1
         );
      }
   }

   private void method13194(float var1) {
      if (this.field20854.method24324() != null) {
         String[] var4 = this.field20854.method24324().split(" - ");
         byte var5 = 30;
         if (var4.length <= 1) {
            this.method13195(var1, var4[0].length() != 0 ? var4[0] : "Jello Music", this.field20845 - var5 * 2, 12, 0);
         } else {
            this.method13195(var1, var4[1], this.field20845 - var5 * 2, 0, 0);
            this.method13195(var1, var4[0], this.field20845 - var5 * 2, 20, -1000);
         }
      }
   }

   private void method13195(float var1, String var2, int var3, int var4, int var5) {
      Date var8 = new Date();
      float var9 = (float)((var8.getTime() + (long)var5) % 8500L) / 8500.0F;
      if (!(var9 < 0.4F)) {
         var9 -= 0.4F;
         var9 = (float)((double)var9 * 1.6666666666666667);
      } else {
         var9 = 0.0F;
      }

      var9 = Class9782.method38558(var9, 0.0F, 1.0F, 1.0F);
      int var10 = ResourceRegistry.JelloLightFont14.method23942(var2);
      int var11 = Math.min(var3, var10);
      int var12 = ResourceRegistry.JelloLightFont14.method23952();
      int var13 = this.method13263() + (this.field20845 - var11) / 2;
      int var14 = this.method13265() + this.method13269() - 50 + var4;
      int var15 = Math.max(0, var10 - var11) * 2;
      if (var10 <= var3) {
         var9 = 0.0F;
      }

      Class3192.method11421(var13, var14, var13 + var11, var14 + var12, true);
      Class3192.method11439(
         ResourceRegistry.JelloLightFont14,
         (float)var13 - (float)var10 * var9 - 50.0F * var9,
         (float)var14,
         var2,
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * var1 * Math.min(1.0F, Math.max(0.0F, 1.0F - var9 * 0.75F)))
      );
      if (var9 > 0.0F) {
         Class3192.method11439(
            ResourceRegistry.JelloLightFont14,
            (float)var13 - (float)var10 * var9 + (float)var10,
            (float)var14,
            var2,
            Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * var1)
         );
      }

      Class3192.method11422();
   }

   private void method13196(float var1) {
      this.field20852.method13292(false);
      if (this.field20863 != this.field20852.method13513()) {
         try {
            if (this.field20864 != null) {
               this.field20864.release();
            }

            this.field20864 = TextureUtil.method32933(
               "blur",
               ImageUtil.method35037(this.method13263() + this.field20845, this.method13265(), this.method13267() - this.field20845, this.field20847, 10, 10)
            );
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      }

      float var4 = this.field20863 < 50 ? (float)this.field20863 / 50.0F : 1.0F;
      if (this.field20864 != null) {
         Class3192.method11448(
            (float)this.field20845,
            0.0F,
            (float)(this.method13267() - this.field20845),
            (float)this.field20847,
            this.field20864,
            Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var4 * var1)
         );
      }

      Class3192.method11426(
         (float)this.field20845,
         0.0F,
         (float)this.method13267(),
         (float)this.field20847,
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var4 * var1 * 0.2F)
      );
      Class3192.method11439(
         ResourceRegistry.JelloLightFont25,
         (float)((this.method13267() - ResourceRegistry.JelloLightFont25.method23942(this.field20849) + this.field20845) / 2),
         16.0F + (1.0F - var4) * 14.0F,
         this.field20849,
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var4)
      );
      Class3192.method11439(
         ResourceRegistry.JelloMediumFont25,
         (float)((this.method13267() - ResourceRegistry.JelloMediumFont25.method23942(this.field20849) + this.field20845) / 2),
         16.0F + (1.0F - var4) * 14.0F,
         this.field20849,
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, 1.0F - var4)
      );
      Class3192.method11449(
         (float)this.field20845,
         (float)this.field20847,
         (float)(this.method13267() - this.field20845),
         20.0F,
         ResourcesDecrypter.shadowBottomPNG,
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var4 * var1 * 0.5F)
      );
      this.field20863 = this.field20852.method13513();
   }

   // $VF: synthetic method
   public static Class4339 method13206(Class4303 var0) {
      return var0.field20851;
   }

   // $VF: synthetic method
   public static int method13207(Class4303 var0) {
      return var0.field20846;
   }

   // $VF: synthetic method
   public static int method13208(Class4303 var0) {
      return var0.field20845;
   }

   // $VF: synthetic method
   public static int method13209(Class4303 var0) {
      return var0.field20848;
   }

   // $VF: synthetic method
   public static void method13210(Class4303 var0, Class4339 var1) {
      var0.method13189(var1);
   }

   // $VF: synthetic method
   public static void method13211(Class4303 var0, Class9578 var1, Class9133 var2) {
      var0.method13190(var1, var2);
   }

   static {
      Class9578[] var4 = new Class9578[]{
         new Class9578("Trap Nation", "UUa10nxShhzNrCE1o2ZOPztg", Class2125.field13868),
         new Class9578("Chill Nation", "UUM9KEEuzacwVlkt9JfJad7g", Class2125.field13868),
         new Class9578("VEVO", "PL9tY0BWXOZFu8MzzbNVtUvHs0cQ_gZ03m", Class2125.field13868),
         new Class9578("Rap Nation", "UU8QfB1wbfrNwNFHQxfyNJsw", Class2125.field13868),
         new Class9578("MrSuicideSheep", "UU5nc_ZtjKW1htCVZVRxlQAQ", Class2125.field13868),
         new Class9578("Trap City", "UU65afEgL62PGFWXY7n6CUbA", Class2125.field13868),
         new Class9578("CloudKid", "UUSa8IUd1uEjlREMa21I3ZPQ", Class2125.field13868),
         new Class9578("NCS", "UU_aEa8K-EOJ3D6gOs7HcyNg", Class2125.field13868)
      };
      field20868 = var4;
   }
}
