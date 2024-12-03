package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.gui.screens.JelloClickGUI;
import com.mentalfrostbyte.jello.music.MusicManager;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.youtube.YoutubeType;
import com.mentalfrostbyte.jello.util.youtube.YoutubeVideoData;
import com.mentalfrostbyte.jello.unmapped.MusicPlayerVideo;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.ImageUtil;
import com.mentalfrostbyte.jello.util.TextureUtil;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import lol.ClientColors;
import lol.Texture;

import java.io.IOException;
import java.net.CookieManager;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class MusicPlayer extends Class4278 {
   private int field20845 = 250;
   private int field20846 = 40;
   private int field20847 = 64;
   private int field20848 = 94;
   private String field20849 = "Music Player";
   public static URL field20850;
   private Class4339 field20851;
   private Class4339 field20852;
   private CustomGuiScreen pngButtons;
   private MusicManager field20854 = Client.getInstance().getMusicManager();
   public static Map<String, MusicPlayerVideo> field20855 = new LinkedHashMap<String, MusicPlayerVideo>();
   public static String field20856;
   public static MusicPlayerVideo field20857;
   private ButtonPanel play;
   private ButtonPanel pause;
   private ButtonPanel forwards;
   private ButtonPanel backwards;
   private VolumeSlider volumeSlider;
   private int field20863;
   private Texture field20864;
   private CustomGuiScreen field20865;
   public SearchBoxButton searchBox;
   public Class4359 field20867;
   public static MusicPlayerVideo[] videos;
   private static CookieManager field20869 = new CookieManager();
   public static long field20870 = 0L;
   public float field20871 = 0.0F;
   public float field20872 = 0.0F;
   private Animation field20873 = new Animation(80, 150, Direction.BACKWARDS);
   public boolean field20874 = false;

   public MusicPlayer(CustomGuiScreen var1, String var2) {
      super(var1, var2, 875, 55, 800, 600, false);

      if (videos == null) {
         MusicPlayerVideo[] var4 = new MusicPlayerVideo[]{
                 new MusicPlayerVideo("Trap Nation", "UUa10nxShhzNrCE1o2ZOPztg", YoutubeType.PLAYLIST),
                 new MusicPlayerVideo("Chill Nation", "UUM9KEEuzacwVlkt9JfJad7g", YoutubeType.PLAYLIST),
                 new MusicPlayerVideo("VEVO", "PL9tY0BWXOZFu8MzzbNVtUvHs0cQ_gZ03m", YoutubeType.PLAYLIST),
                 new MusicPlayerVideo("Rap Nation", "UU8QfB1wbfrNwNFHQxfyNJsw", YoutubeType.PLAYLIST),
                 new MusicPlayerVideo("MrSuicideSheep", "UU5nc_ZtjKW1htCVZVRxlQAQ", YoutubeType.PLAYLIST),
                 new MusicPlayerVideo("Trap City", "UU65afEgL62PGFWXY7n6CUbA", YoutubeType.PLAYLIST),
                 new MusicPlayerVideo("CloudKid", "UUSa8IUd1uEjlREMa21I3ZPQ", YoutubeType.PLAYLIST),
                 new MusicPlayerVideo("NCS", "PLRBp0Fe2Gpgm_u2w2a2isHw29SugZ34cD", YoutubeType.PLAYLIST)
         };
         videos = var4;
      }

      field20870 = System.nanoTime();
      this.setWidthA(800);
      this.setHeightA(600);
      this.setXA(Math.abs(this.getXA()));
      this.setYA(Math.abs(this.getYA()));
      this.addToList(this.field20851 = new Class4339(this, "musictabs", 0, this.field20847 + 14, this.field20845, this.getHeightA() - 64 - this.field20848));
      this.addToList(
              this.pngButtons = new Class4339(
                      this, "musiccontrols", this.field20845, this.getHeightA() - this.field20848, this.getWidthA() - this.field20845, this.field20848
              )
      );
      this.addToList(this.field20865 = new CustomGuiScreen(this, "reShowView", 0, 0, 1, this.getHeightA()));
      Class4265 var5;
      this.addToList(var5 = new Class4265(this, "spectrumButton", 15, this.heightA - 140, 40, 40, this.field20854.method24313()));
      var5.method13292(true);
      var5.doThis((var1x, var2x) -> {
         this.field20854.method24312(!this.field20854.method24313());
         ((Class4265)var1x).method13099(this.field20854.method24313());
      });
      this.field20851.method13300(false);
      var5.method13300(false);
      this.pngButtons.method13300(false);
      this.field20865.method13300(false);
      ColorHelper var6 = new ColorHelper(1250067, -15329770).method19410(ClientColors.LIGHT_GREYISH_BLUE.getColor).method19414(Class2218.field14492);
      ArrayList var7 = new ArrayList();
      MusicPlayer player = this;

      int var9 = 0;
      for (MusicPlayerVideo video : videos) {
         var7.add(new Thread(() -> {
            if (!field20855.containsKey(video.id) && !video.field44779) {
               video.field44779 = true;
               video.updateVideos();

               field20855.put(video.id, video);
            }

            this.method13222(new MusicPlayerInstance(this, video, var6, player));
         }));
         var9++;
         ((Thread)var7.get(var7.size() - 1)).start();
      }

      int var15 = (this.getWidthA() - this.field20845 - 38) / 2;
      this.pngButtons
              .addToList(
                      this.play = new PNGIconButton(
                              this.pngButtons, "play", var15, 27, 38, 38, ResourceList.playPNG, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.getColor), null
                      )
              );
      this.pngButtons
              .addToList(
                      this.pause = new PNGIconButton(
                              this.pngButtons, "pause", var15, 27, 38, 38, ResourceList.pausePNG, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.getColor), null
                      )
              );
      this.pngButtons
              .addToList(
                      this.forwards = new PNGIconButton(
                              this.pngButtons, "forwards", var15 + 114, 23, 46, 46, ResourceList.forwardsPNG, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.getColor), null
                      )
              );
      this.pngButtons
              .addToList(
                      this.backwards = new PNGIconButton(
                              this.pngButtons, "backwards", var15 - 114, 23, 46, 46, ResourceList.backwardsPNG, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.getColor), null
                      )
              );
      this.pngButtons.addToList(this.volumeSlider = new VolumeSlider(this.pngButtons, "volume", this.getWidthA() - this.field20845 - 19, 14, 4, 40));
      PNGButtonChanging repeat;
      this.pngButtons.addToList(repeat = new PNGButtonChanging(this.pngButtons, "repeat", 14, 34, 27, 20, this.field20854.method24304()));
      repeat.method13036(var2x -> this.field20854.method24303(repeat.method13038()));
      this.addToList(this.field20867 = new Class4359(this, "progress", this.field20845, this.getHeightA() - 5, this.getWidthA() - this.field20845, 5));
      this.field20867.method13292(true);
      this.field20867.method13300(false);
      this.field20865.method13292(true);
      this.field20865.method13247((var1x, var2x) -> {
         this.field20874 = true;
         this.field20871 = (float)this.getXA();
         this.field20872 = (float)this.getYA();
      });
      this.pause.setEnabled(false);
      this.play.setEnabled(false);
      this.play.doThis((var1x, var2x) -> this.field20854.method24310(true));
      this.pause.doThis((var1x, var2x) -> this.field20854.method24310(false));
      this.forwards.doThis((var1x, var2x) -> this.field20854.method24316());
      this.backwards.doThis((var1x, var2x) -> this.field20854.method24315());
      this.volumeSlider.method13709(var1x -> this.field20854.method24311((int)((1.0F - this.volumeSlider.method13707()) * 100.0F)));
      this.volumeSlider.method13708(1.0F - (float)this.field20854.method24314() / 100.0F);
      this.addToList(
              this.searchBox = new SearchBoxButton(
                      this, "search", this.field20845, 0, this.getWidthA() - this.field20845, this.getHeightA() - this.field20848, "Search..."
              )
      );
      this.searchBox.setEnabled(true);
      this.searchBox.method13300(false);
   }

   private void method13189(Class4339 var1) {
      if (this.field20852 != null) {
         this.field20852.setEnabled(false);
      }

      var1.setEnabled(true);
      this.field20849 = var1.getTypedText();
      this.field20852 = var1;
      this.searchBox.setEnabled(false);
      this.field20852.field21207 = 65;
   }

   private void method13190(MusicPlayerVideo var1, YoutubeVideoData var2) {
      if (!((JelloClickGUI)this.getIcoPanel()).method13314()) {
         this.field20854.method24317(var1, var2);
         field20857 = var1;
      }
   }

   @Override
   public void method13028(int var1, int var2) {
      long var5 = System.nanoTime() - field20870;
      float var7 = Math.min(10.0F, Math.max(0.0F, (float)var5 / 1.810361E7F));
      field20870 = System.nanoTime();
      super.method13028(var1, var2);
      if (this.icoPanel instanceof JelloClickGUI) {
         if (!this.method13216()) {
            if ((this.field20909 || this.field20874) && !this.method13214() && !this.method13216()) {
               this.field20874 = true;
               int var11 = this.icoPanel.getWidthA() - 20 - this.getWidthA();
               int var13 = (this.icoPanel.getHeightA() - this.getHeightA()) / 2;
               this.field20871 = Math.max(this.field20871 - (this.field20871 - (float)var11) * 0.25F * var7, (float)var11);
               if (!(this.field20872 - (float)var13 > 0.0F)) {
                  Math.min(this.field20872 = this.field20872 - (this.field20872 - (float)var13) * 0.2F * var7, (float)var13);
               } else {
                  Math.max(this.field20872 = this.field20872 - (this.field20872 - (float)var13) * 0.2F * var7, (float)var13);
               }

               if (!(this.field20871 - (float)var11 < 0.0F)) {
                  if (this.field20871 - (float)var11 - (float)this.getWidthA() > 0.0F) {
                     this.field20871 = (float)var11;
                  }
               } else {
                  this.field20871 = (float)var11;
               }

               this.setXA((int)this.field20871);
               this.setYA((int)this.field20872);
               if (Math.abs(this.field20871 - (float)var11) < 2.0F && Math.abs(this.field20872 - (float)var13) < 2.0F) {
                  this.method13215(true);
                  this.field20874 = false;
               }
            } else if (this.getXA() + this.getWidthA() > this.icoPanel.getWidthA() || this.getXA() < 0 || this.getYA() < 0) {
               if (this.field20871 == 0.0F || this.field20872 == 0.0F) {
                  this.field20871 = (float)this.getXA();
                  this.field20872 = (float)this.getYA();
               }

               int var8 = this.icoPanel.getWidthA() - 40;
               int var9 = (this.icoPanel.getHeightA() - this.getHeightA()) / 2;
               this.field20871 = Math.min(this.field20871 - (this.field20871 - (float)var8) * 0.25F * var7, (float)var8);
               if (!(this.field20872 - (float)var9 > 0.0F)) {
                  Math.min(this.field20872 = this.field20872 - (this.field20872 - (float)var9) * 0.2F * var7, (float)var9);
               } else {
                  Math.max(this.field20872 = this.field20872 - (this.field20872 - (float)var9) * 0.2F * var7, (float)var9);
               }

               if (!(this.field20871 - (float)var8 > 0.0F)) {
                  if (this.field20871 - (float)var8 + (float)this.getWidthA() < 0.0F) {
                     this.field20871 = (float)var8;
                  }
               } else {
                  this.field20871 = (float)var8;
               }

               if (Math.abs(this.field20871 - (float)var8) < 2.0F && Math.abs(this.field20872 - (float)var9) < 2.0F) {
                  this.field20871 = (float)this.getXA();
                  this.field20872 = (float)this.getYA();
               }

               this.setXA((int)this.field20871);
               this.setYA((int)this.field20872);
               this.method13215(false);
               this.method13217(false);
            }
         } else {
            int var12 = var1 - this.field20880 - (this.icoPanel == null ? 0 : this.icoPanel.method13271());
            int var14 = 200;
            if (var12 + this.getWidthA() > this.icoPanel.getWidthA() + var14 && var1 - this.field20878 > 70) {
               int var15 = var12 - this.getXA() - var14;
               this.setXA((int)((float)this.getXA() + (float)var15 * 0.5F));
               this.field20871 = (float)this.getXA();
               this.field20872 = (float)this.getYA();
            }
         }
      }
   }

   @Override
   public void draw(float var1) {
      super.method13224();
      super.method13225();
      this.field20865.setWidthA(this.getXA() + this.getWidthA() <= this.icoPanel.getWidthA() ? 0 : 41);
      this.field20873
              .changeDirection(this.getXA() + this.getWidthA() > this.icoPanel.getWidthA() && !this.field20874 ? Direction.FORWARDS : Direction.BACKWARDS);
      var1 *= 0.5F + (1.0F - this.field20873.calcPercent()) * 0.5F;
      if (this.field20854.method24319()) {
         this.play.setEnabled(false);
         this.pause.setEnabled(true);
      } else {
         this.play.setEnabled(true);
         this.pause.setEnabled(false);
      }

      RenderUtil.drawRect(
              (float)(this.getXA() + this.field20845),
              (float)this.getYA(),
              (float)(this.getXA() + this.getWidthA()),
              (float)(this.getYA() + this.getHeightA() - this.field20848),
              MultiUtilities.applyAlpha(-14277082, var1 * 0.8F)
      );
      RenderUtil.drawRect(
              (float)this.getXA(),
              (float)this.getYA(),
              (float)(this.getXA() + this.field20845),
              (float)(this.getYA() + this.getHeightA() - this.field20848),
              MultiUtilities.applyAlpha(-16777216, var1 * 0.95F)
      );
      this.method13193(var1);
      this.method13194(var1);
      this.method13192(var1);
      float var4 = 55;
      RenderUtil.drawString(
              ResourceRegistry.JelloLightFont40,
              var4 + this.getXA(),
              (float)(this.getYA() + 20),
              "Jello",
              MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
      );
      RenderUtil.drawString(
              ResourceRegistry.JelloLightFont20,
              var4 + this.getXA() + 80,
              (float)(this.getYA() + 40),
              "music",
              MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
      );
      RenderUtil.drawRoundedRect((float)this.getXA(), (float)this.getYA(), (float)this.getWidthA(), (float)this.getHeightA(), 14.0F, var1);
      super.draw(var1);
      if (this.field20852 != null) {
         this.method13196(var1);
      }
   }

   private void method13192(float var1) {
      int var4 = (int)this.field20854.method24321();
      int var5 = this.field20854.method24327();
      RenderUtil.drawString(
              ResourceRegistry.JelloLightFont14,
              (float)(this.getXA() + this.field20845 + 14),
              (float)(this.getYA() + this.getHeightA() - 10) - 22.0F * var1,
              Class9275.method34955(var4),
              MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * var1)
      );
      RenderUtil.drawString(
              ResourceRegistry.JelloLightFont14,
              (float)(this.getXA() + this.getWidthA() - 14 - ResourceRegistry.JelloLightFont14.getStringWidth(Class9275.method34955(var5))),
              (float)(this.getYA() + this.getHeightA() - 10) - 22.0F * var1,
              Class9275.method34955(var5),
              MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * var1)
      );
   }

   private void method13193(float var1) {
      Texture var4 = this.field20854.method24326();
      Texture var5 = this.field20854.method24325();
      if (var4 != null && var5 != null) {
         RenderUtil.drawImage(
                 (float)this.getXA(),
                 (float)(this.getYA() + this.getHeightA() - this.field20848),
                 (float)this.getWidthA(),
                 (float)this.field20848,
                 var5,
                 MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * var1)
         );
         RenderUtil.drawRect(
                 (float)this.getXA(),
                 (float)(this.getYA() + this.getHeightA() - this.field20848),
                 (float)(this.getXA() + this.getWidthA()),
                 (float)(this.getYA() + this.getHeightA() - 5),
                 MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.43F * var1)
         );
         RenderUtil.drawRect(
                 (float)this.getXA(),
                 (float)(this.getYA() + this.getHeightA() - 5),
                 (float)(this.getXA() + this.field20845),
                 (float)(this.getYA() + this.getHeightA()),
                 MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.43F * var1)
         );
         RenderUtil.drawImage(
                 (float)(this.getXA() + (this.field20845 - 114) / 2),
                 (float)(this.getYA() + this.getHeightA() - 170),
                 114.0F,
                 114.0F,
                 var4,
                 MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
         );
         RenderUtil.drawRoundedRect(
                 (float)(this.getXA() + (this.field20845 - 114) / 2), (float)(this.getYA() + this.getHeightA() - 170), 114.0F, 114.0F, 14.0F, var1
         );
      } else {
         RenderUtil.drawImage(
                 (float)this.getXA(),
                 (float)(this.getYA() + this.getHeightA() - this.field20848),
                 (float)this.getWidthA(),
                 (float)this.field20848,
                 ResourceList.bgPNG,
                 MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * var1)
         );
         RenderUtil.drawRect(
                 (float)this.getXA(),
                 (float)(this.getYA() + this.getHeightA() - this.field20848),
                 (float)(this.getXA() + this.getWidthA()),
                 (float)(this.getYA() + this.getHeightA() - 5),
                 MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.43F * var1)
         );
         RenderUtil.drawRect(
                 (float)this.getXA(),
                 (float)(this.getYA() + this.getHeightA() - 5),
                 (float)(this.getXA() + this.field20845),
                 (float)(this.getYA() + this.getHeightA()),
                 MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.43F * var1)
         );
         RenderUtil.drawImage(
                 (float)(this.getXA() + (this.field20845 - 114) / 2),
                 (float)(this.getYA() + this.getHeightA() - 170),
                 114.0F,
                 114.0F,
                 ResourceList.artworkPNG,
                 MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
         );
         RenderUtil.drawRoundedRect(
                 (float)(this.getXA() + (this.field20845 - 114) / 2), (float)(this.getYA() + this.getHeightA() - 170), 114.0F, 114.0F, 14.0F, var1
         );
      }
   }

   private void method13194(float var1) {
      if (this.field20854.method24324() != null) {
         String[] var4 = this.field20854.method24324().split(" - ");
         int var5 = 30;
         if (var4.length <= 1) {
            this.method13195(var1, !var4[0].isEmpty() ? var4[0] : "Jello Music", this.field20845 - var5 * 2, 12, 0);
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

      var9 = QuadraticEasing.easeInOutQuad(var9, 0.0F, 1.0F, 1.0F);
      int var10 = ResourceRegistry.JelloLightFont14.getStringWidth(var2);
      int var11 = Math.min(var3, var10);
      int var12 = ResourceRegistry.JelloLightFont14.method23952();
      int var13 = this.getXA() + (this.field20845 - var11) / 2;
      int var14 = this.getYA() + this.getHeightA() - 50 + var4;
      int var15 = Math.max(0, var10 - var11) * 2;
      if (var10 <= var3) {
         var9 = 0.0F;
      }

      RenderUtil.method11421(var13, var14, var13 + var11, var14 + var12, true);
      RenderUtil.drawString(
              ResourceRegistry.JelloLightFont14,
              (float)var13 - (float)var10 * var9 - 50.0F * var9,
              (float)var14,
              var2,
              MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * var1 * Math.min(1.0F, Math.max(0.0F, 1.0F - var9 * 0.75F)))
      );
      if (var9 > 0.0F) {
         RenderUtil.drawString(
                 ResourceRegistry.JelloLightFont14,
                 (float)var13 - (float)var10 * var9 + (float)var10,
                 (float)var14,
                 var2,
                 MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * var1)
         );
      }

      RenderUtil.endScissor();
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
                    ImageUtil.method35037(this.getXA() + this.field20845, this.getYA(), this.getWidthA() - this.field20845, this.field20847, 10, 10)
            );
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      }

      float var4 = this.field20863 < 50 ? (float)this.field20863 / 50.0F : 1.0F;
      if (this.field20864 != null) {
         RenderUtil.method11448(
                 (float)this.field20845,
                 0.0F,
                 (float)(this.getWidthA() - this.field20845),
                 (float)this.field20847,
                 this.field20864,
                 MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var4 * var1)
         );
      }

      RenderUtil.drawRect(
              (float)this.field20845,
              0.0F,
              (float)this.getWidthA(),
              (float)this.field20847,
              MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var4 * var1 * 0.2F)
      );
      RenderUtil.drawString(
              ResourceRegistry.JelloLightFont25,
              (float)((this.getWidthA() - ResourceRegistry.JelloLightFont25.getStringWidth(this.field20849) + this.field20845) / 2),
              16.0F + (1.0F - var4) * 14.0F,
              this.field20849,
              MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var4)
      );
      RenderUtil.drawString(
              ResourceRegistry.JelloMediumFont25,
              (float)((this.getWidthA() - ResourceRegistry.JelloMediumFont25.getStringWidth(this.field20849) + this.field20845) / 2),
              16.0F + (1.0F - var4) * 14.0F,
              this.field20849,
              MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 1.0F - var4)
      );
      RenderUtil.drawImage(
              (float)this.field20845,
              (float)this.field20847,
              (float)(this.getWidthA() - this.field20845),
              20.0F,
              ResourceList.shadowBottomPNG,
              MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var4 * var1 * 0.5F)
      );
      this.field20863 = this.field20852.method13513();
   }

   // $VF: synthetic method
   public static Class4339 method13206(MusicPlayer var0) {
      return var0.field20851;
   }

   // $VF: synthetic method
   public static int method13207(MusicPlayer var0) {
      return var0.field20846;
   }

   // $VF: synthetic method
   public static int method13208(MusicPlayer var0) {
      return var0.field20845;
   }

   // $VF: synthetic method
   public static int method13209(MusicPlayer var0) {
      return var0.field20848;
   }

   // $VF: synthetic method
   public static void method13210(MusicPlayer var0, Class4339 var1) {
      var0.method13189(var1);
   }

   // $VF: synthetic method
   public static void method13211(MusicPlayer var0, MusicPlayerVideo var1, YoutubeVideoData var2) {
      var0.method13190(var1, var2);
   }
}