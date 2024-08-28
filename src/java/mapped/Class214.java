package mapped;

import com.google.gson.JsonSyntaxException;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4414;
import com.mentalfrostbyte.jello.event.impl.Class4422;
import com.mentalfrostbyte.jello.event.impl.Class4427;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Class214 implements Class215, AutoCloseable {
   private static final ResourceLocation field800 = new ResourceLocation("textures/misc/nausea.png");
   private static final Logger field801 = LogManager.getLogger();
   private final Minecraft field802;
   private final Class191 field803;
   private final Random field804 = new Random();
   private float field805;
   public final Class9641 field806;
   private final Class194 field807;
   private final Class7911 field808;
   private int field809;
   private float field810;
   private float field811;
   private float field812;
   private float field813;
   public boolean field814 = true;
   private boolean field815 = true;
   private long field816;
   private long field817 = Util.method38487();
   public final Class1699 field818;
   private final Class213 field819 = new Class213();
   private boolean field820;
   private float field821 = 1.0F;
   private float field822;
   private float field823;
   private ItemStack field824;
   private int field825;
   private float field826;
   private float field827;
   public Class1647 field828;
   public static final ResourceLocation[] field829 = new ResourceLocation[]{
      new ResourceLocation("shaders/post/notch.json"),
      new ResourceLocation("shaders/post/fxaa.json"),
      new ResourceLocation("shaders/post/art.json"),
      new ResourceLocation("shaders/post/bumpy.json"),
      new ResourceLocation("shaders/post/blobs2.json"),
      new ResourceLocation("shaders/post/pencil.json"),
      new ResourceLocation("shaders/post/color_convolve.json"),
      new ResourceLocation("shaders/post/deconverge.json"),
      new ResourceLocation("shaders/post/flip.json"),
      new ResourceLocation("shaders/post/invert.json"),
      new ResourceLocation("shaders/post/ntsc.json"),
      new ResourceLocation("shaders/post/outline.json"),
      new ResourceLocation("shaders/post/phosphor.json"),
      new ResourceLocation("shaders/post/scan_pincushion.json"),
      new ResourceLocation("shaders/post/sobel.json"),
      new ResourceLocation("shaders/post/bits.json"),
      new ResourceLocation("shaders/post/desaturate.json"),
      new ResourceLocation("shaders/post/green.json"),
      new ResourceLocation("shaders/post/blur.json"),
      new ResourceLocation("shaders/post/wobble.json"),
      new ResourceLocation("shaders/post/blobs.json"),
      new ResourceLocation("shaders/post/antialias.json"),
      new ResourceLocation("shaders/post/creeper.json"),
      new ResourceLocation("shaders/post/spider.json")
   };
   public static final int field830 = field829.length;
   public int field831 = field830;
   private boolean field832;
   private final Class9624 field833 = new Class9624();
   private boolean field834 = false;
   private Class1655 field835 = null;
   private float field836 = 128.0F;
   private long field837 = 0L;
   private int field838 = 0;
   private int field839 = 0;
   private int field840 = 0;
   private float field841 = 0.0F;
   private float field842 = 0.0F;
   private Class1647[] field843 = new Class1647[10];
   private boolean field844 = false;

   public Class214(Minecraft var1, Class191 var2, Class7911 var3) {
      this.field802 = var1;
      this.field803 = var2;
      this.field806 = var1.method1556();
      this.field807 = new Class194(var1.getTextureManager());
      this.field818 = new Class1699(this, var1);
      this.field808 = var3;
      this.field828 = null;
   }

   @Override
   public void close() {
      this.field818.close();
      this.field807.close();
      this.field819.close();
      this.method733();
   }

   public void method733() {
      if (this.field828 != null) {
         this.field828.close();
      }

      this.field828 = null;
      this.field831 = field830;
   }

   public void method734() {
      this.field832 = !this.field832;
   }

   public void method735(Entity var1) {
      if (this.field828 != null) {
         this.field828.close();
      }

      this.field828 = null;
      if (!(var1 instanceof Class1081)) {
         if (!(var1 instanceof Class1101)) {
            if (!(var1 instanceof Class1010)) {
               if (Class9299.field42880.method20214()) {
                  Class9299.method35062(Class9299.field42880, var1, this);
               }
            } else {
               this.method736(new ResourceLocation("shaders/post/invert.json"));
            }
         } else {
            this.method736(new ResourceLocation("shaders/post/spider.json"));
         }
      } else {
         this.method736(new ResourceLocation("shaders/post/creeper.json"));
      }
   }

   public void method736(ResourceLocation var1) {
      if (Class8157.method28309()) {
         if (this.field828 != null) {
            this.field828.close();
         }

         try {
            this.field828 = new Class1647(this.field802.getTextureManager(), this.field803, this.field802.method1464(), var1);
            this.field828.method6525(this.field802.method1580().method8041(), this.field802.method1580().method8042());
            this.field832 = true;
         } catch (IOException var5) {
            field801.warn("Failed to load shader: {}", var1, var5);
            this.field831 = field830;
            this.field832 = false;
         } catch (JsonSyntaxException var6) {
            field801.warn("Failed to parse shader: {}", var1, var6);
            this.field831 = field830;
            this.field832 = false;
         }
      }
   }

   @Override
   public void method737(Class191 var1) {
      if (this.field828 != null) {
         this.field828.close();
      }

      this.field828 = null;
      if (this.field831 != field830) {
         this.method736(field829[this.field831]);
      } else {
         this.method735(this.field802.method1550());
      }
   }

   public void method738() {
      this.method742();
      this.field818.method7315();
      if (this.field802.method1550() == null) {
         this.field802.method1551(this.field802.field1339);
      }

      this.field833.method37498();
      this.field809++;
      this.field806.method37592();
      this.field802.field1287.method856(this.field833);
      this.field813 = this.field812;
      if (!this.field802.field1298.method5995().method5958()) {
         if (this.field812 > 0.0F) {
            this.field812 -= 0.0125F;
         }
      } else {
         this.field812 += 0.05F;
         if (this.field812 > 1.0F) {
            this.field812 = 1.0F;
         }
      }

      if (this.field825 > 0) {
         this.field825--;
         if (this.field825 == 0) {
            this.field824 = null;
         }
      }
   }

   @Nullable
   public Class1647 method739() {
      return this.field828;
   }

   public void method740(int var1, int var2) {
      if (this.field828 != null) {
         this.field828.method6525(var1, var2);
      }

      this.field802.field1287.method870(var1, var2);
   }

   public void method741(float var1) {
      Entity var4 = this.field802.method1550();
      if (var4 != null && this.field802.field1338 != null) {
         this.field802.method1574().method22503("pick");
         this.field802.field1345 = null;
         double var5 = (double)this.field802.field1337.method23135();
         this.field802.field1346 = var4.method3289(var5, var1, false);
         Vector3d var7 = var4.method3286(var1);
         boolean var8 = false;
         byte var9 = 3;
         double var10 = var5;
         if (!this.field802.field1337.method23153()) {
            if (var5 > 3.0) {
               var8 = true;
            }

            var5 = var5;
         } else {
            var10 = 6.0;
            var5 = var10;
         }

         var10 *= var10;
         if (this.field802.field1346 != null) {
            var10 = this.field802.field1346.method31419().method11342(var7);
         }

         Vector3d var12 = var4.method3281(1.0F);
         Vector3d var13 = var7.method11339(var12.field18048 * var5, var12.field18049 * var5, var12.field18050 * var5);
         float var14 = 1.0F;
         Class6488 var15 = var4.method3389().method19661(var12.method11344(var5)).method19663(1.0, 1.0, 1.0);
         Class8709 var16 = Class9456.method36386(var4, var7, var13, var15, var0 -> !var0.method2800() && var0.method3139(), var10);
         if (var16 != null) {
            Entity var17 = var16.method31416();
            Vector3d var18 = var16.method31419();
            double var19 = var7.method11342(var18);
            if (var8 && var19 > 9.0) {
               this.field802.field1346 = Class8711.method31420(
                  var18, Direction.method553(var12.field18048, var12.field18049, var12.field18050), new BlockPos(var18)
               );
            } else if (var19 < var10 || this.field802.field1346 == null) {
               this.field802.field1346 = var16;
               if (var17 instanceof Class880 || var17 instanceof Class997) {
                  this.field802.field1345 = var17;
               }
            }
         }

         this.field802.method1574().method22505();
      }
   }

   private void method742() {
      float var3 = 1.0F;
      if (this.field802.method1550() instanceof AbstractClientPlayerEntity) {
         AbstractClientPlayerEntity var4 = (AbstractClientPlayerEntity)this.field802.method1550();
         var3 = var4.method5378();
      }

      this.field811 = this.field810;
      this.field810 = this.field810 + (var3 - this.field810) * 0.5F;
      if (this.field810 > 1.5F) {
         this.field810 = 1.5F;
      }

      if (this.field810 < 0.1F) {
         this.field810 = 0.1F;
      }
   }

   private double method743(Class9624 var1, float var2, boolean var3) {
      if (!this.field820) {
         double var6 = 70.0;
         if (var3) {
            var6 = this.field802.field1299.field44669;
            if (Class7944.method26940()) {
               var6 *= (double) MathHelper.method37821(var2, this.field811, this.field810);
            }
         }

         boolean var8 = false;
         if (this.field802.field1355 == null) {
            var8 = this.field802.field1299.field44762.method8509();
         }

         if (!var8) {
            if (Class7944.field34162) {
               Class7944.field34162 = false;
               this.field802.field1299.field44668 = Class7944.field34163;
               this.field802.field1287.method922();
            }
         } else {
            if (!Class7944.field34162) {
               Class7944.field34162 = true;
               Class7944.field34163 = this.field802.field1299.field44668;
               this.field802.field1299.field44668 = true;
               this.field802.field1287.method922();
            }

            if (Class7944.field34162) {
               var6 /= 4.0;
            }
         }

         if (var1.method37509() instanceof Class880 && ((Class880)var1.method37509()).method3044()) {
            float var9 = Math.min((float)((Class880)var1.method37509()).field4955 + var2, 20.0F);
            var6 /= (double)((1.0F - 500.0F / (var9 + 500.0F)) * 2.0F + 1.0F);
         }

         Class7379 var10 = var1.method37512();
         if (!var10.method23474()) {
            var6 = var6 * 60.0 / 70.0;
         }

         return !Class9299.field42877.method20214() ? var6 : Class9299.method35060(Class9299.field42877, this, var1, var2, var6);
      } else {
         return 90.0;
      }
   }

   private void method744(Class9332 var1, float var2) {
      if (this.field802.method1550() instanceof Class880) {
         Class880 var5 = (Class880)this.field802.method1550();
         float var6 = (float)var5.field4952 - var2;
         if (var5.method3044()) {
            float var7 = Math.min((float)var5.field4955 + var2, 20.0F);
            var1.method35293(Class7680.field32902.method25286(40.0F - 8000.0F / (var7 + 200.0F)));
         }

         if (var6 < 0.0F) {
            return;
         }

         var6 /= (float)var5.field4953;
         var6 = MathHelper.method37763(var6 * var6 * var6 * var6 * (float) Math.PI);
         float var10 = var5.field4954;
         var1.method35293(Class7680.field32900.method25286(-var10));
         var1.method35293(Class7680.field32902.method25286(-var6 * 14.0F));
         var1.method35293(Class7680.field32900.method25286(var10));
      }
   }

   private void method745(Class9332 var1, float var2) {
      if (this.field802.method1550() instanceof PlayerEntity) {
         PlayerEntity var5 = (PlayerEntity)this.field802.method1550();
         float var6 = var5.field5043 - var5.field5042;
         float var7 = -(var5.field5043 + var6 * var2);
         float var8 = MathHelper.method37821(var2, var5.field4908, var5.field4909);
         var1.method35291(
            (double)(MathHelper.method37763(var7 * (float) Math.PI) * var8 * 0.5F),
            (double)(-Math.abs(MathHelper.method37764(var7 * (float) Math.PI) * var8)),
            0.0
         );
         var1.method35293(Class7680.field32902.method25286(MathHelper.method37763(var7 * (float) Math.PI) * var8 * 3.0F));
         var1.method35293(Class7680.field32898.method25286(Math.abs(MathHelper.method37764(var7 * (float) Math.PI - 0.2F) * var8) * 5.0F));
      }
   }

   private void method746(Class9332 var1, Class9624 var2, float var3) {
      this.method747(var1, var2, var3, true, true, false);
   }

   public void method747(Class9332 var1, Class9624 var2, float var3, boolean var4, boolean var5, boolean var6) {
      if (!this.field820) {
         Class8981.method33160(true);
         this.method748(this.method749(var2, var3, false));
         Class8892 var9 = var1.method35296();
         var9.method32361().method35503();
         var9.method32362().method32824();
         boolean var10 = false;
         if (var4) {
            var1.method35294();
            this.method744(var1, var3);
            if (this.field802.field1299.field44627) {
               this.method745(var1, var3);
            }

            var10 = this.field802.method1550() instanceof Class880 && ((Class880)this.field802.method1550()).isSleeping();
            if (this.field802.field1299.method37173().method8246()
               && !var10
               && !this.field802.field1299.field44662
               && this.field802.field1337.method23157() != Class1894.field11105) {
               this.field818.method7317();
               if (!Class7944.method26921()) {
                  this.field806
                     .method37590(
                        var3, var1, this.field808.method26536(), this.field802.field1339, this.field802.method1554().method32208(this.field802.field1339, var3)
                     );
               } else {
                  Class5463.method17156(
                     this.field806,
                     var3,
                     var1,
                     this.field808.method26536(),
                     this.field802.field1339,
                     this.field802.method1554().method32208(this.field802.field1339, var3),
                     var6
                  );
               }

               this.field818.method7316();
            }

            var1.method35295();
         }

         Class8981.method33160(false);
         if (!var5) {
            return;
         }

         this.field818.method7316();
         Class4427 var11 = new Class4427();
         Client.getInstance().getEventManager().call(var11);
         if (this.field802.field1299.method37173().method8246() && !var10 && !var11.isCancelled()) {
            Class6061.method18789(this.field802, var1);
            this.method744(var1, var3);
         }

         if (this.field802.field1299.field44627) {
            this.method745(var1, var3);
         }
      }
   }

   public void method748(Class9367 var1) {
      RenderSystem.method27878(5889);
      RenderSystem.method27879();
      RenderSystem.method27888(var1);
      RenderSystem.method27878(5888);
   }

   public Class9367 method749(Class9624 var1, float var2, boolean var3) {
      Class9332 var6 = new Class9332();
      var6.method35296().method32361().method35503();
      if (Class7944.method26921() && Class8981.method33161()) {
         Class8981.method33104(var6);
      }

      this.field836 = this.field805 * 2.0F;
      if (this.field836 < 173.0F) {
         this.field836 = 173.0F;
      }

      if (this.field821 != 1.0F) {
         var6.method35291((double)this.field822, (double)(-this.field823), 0.0);
         var6.method35292(this.field821, this.field821, 1.0F);
      }

      var6.method35296()
         .method32361()
         .method35508(
            Class9367.method35511(
               this.method743(var1, var2, var3),
               (float)this.field802.method1580().method8041() / (float)this.field802.method1580().method8042(),
               0.05F,
               this.field836
            )
         );
      return var6.method35296().method32361();
   }

   public static float method750(Class880 var0, float var1) {
      int var4 = var0.method3034(Class8254.field35482).method8628();
      return var4 <= 200 ? 0.7F + MathHelper.method37763(((float)var4 - var1) * (float) Math.PI * 0.2F) * 0.3F : 1.0F;
   }

   public void method751(float var1, long var2, boolean var4) {
      this.method758();
      if (!this.field802.method1568() && this.field802.field1299.field44589 && (!this.field802.field1299.field44625 || !this.field802.field1301.method36737())) {
         if (Util.method38487() - this.field817 > 500L) {
            this.field802.method1489(false);
         }
      } else {
         this.field817 = Util.method38487();
      }

      if (!this.field802.field1354) {
         int var7 = (int)(
            this.field802.field1301.method36738() * (double)this.field802.method1580().method8045() / (double)this.field802.method1580().method8043()
         );
         int var8 = (int)(
            this.field802.field1301.method36739() * (double)this.field802.method1580().method8046() / (double)this.field802.method1580().method8044()
         );
         if (var4 && this.field802.field1338 != null && !Class7944.method26988()) {
            this.field802.method1574().method22503("level");
            Client.getInstance().getEventManager().call(new Class4422(var1, var2));
            this.method754(var1, var2, new Class9332());
            if (this.field802.method1530() && this.field816 < Util.method38487() - 1000L) {
               this.field816 = Util.method38487();
               if (!this.field802.method1531().method1305()) {
                  this.method752();
               }
            }

            this.field802.field1287.method860();
            if (this.field828 != null && this.field832) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.method27817();
               RenderSystem.method27861();
               RenderSystem.method27878(5890);
               RenderSystem.pushMatrix();
               RenderSystem.method27879();
               this.field828.method6526(var1);
               RenderSystem.popMatrix();
               RenderSystem.method27861();
            }

            this.field802.method1464().method29112(true);
         } else {
            RenderSystem.method27869(0, 0, this.field802.method1580().method8041(), this.field802.method1580().method8042());
         }

         Class1815 var9 = this.field802.method1580();
         RenderSystem.method27877(256, Minecraft.field1272);
         RenderSystem.method27878(5889);
         RenderSystem.method27879();
         RenderSystem.method27882(0.0, (double)var9.method8041() / var9.method8049(), (double)var9.method8042() / var9.method8049(), 0.0, 1000.0, 3000.0);
         RenderSystem.method27878(5888);
         RenderSystem.method27879();
         RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
         Class7516.method24503();
         Class9332 var10 = new Class9332();
         if (this.field818.method7328()) {
            this.field818.method7327(false);
         }

         if (var4 && this.field802.field1338 != null) {
            this.field802.method1574().method22506("gui");
            if (this.field802.field1339 != null) {
               float var11 = MathHelper.method37821(var1, this.field802.field1339.field6142, this.field802.field1339.field6141);
               if (var11 > 0.0F && this.field802.field1339.method3033(Class8254.field35475) && this.field802.field1299.field44670 < 1.0F) {
                  this.method765(var11 * (1.0F - this.field802.field1299.field44670));
               }
            }

            if (!this.field802.field1299.field44662 || this.field802.field1355 != null) {
               RenderSystem.method27939();
               this.method764(this.field802.method1580().method8045(), this.field802.method1580().method8046(), var1);
               ResourcesDecrypter.gingerbreadIconPNG.bind();
               this.field802.field1298.method5961(var10, var1);
               if (this.field802.field1299.field44699 && !this.field802.field1299.field44664) {
                  Class7944.method26954(var10);
               }

               if (this.field802.field1299.field44664) {
                  Class8578.method30657(var10, (int)this.field802.method1580().method8049());
               }

               RenderSystem.method27877(256, Minecraft.field1272);
            }

            this.field802.method1574().method22505();
         }

         RenderSystem.pushMatrix();
         Client.getInstance().method19928();
         RenderSystem.popMatrix();
         if (this.field844 != (this.field802.field1356 != null)) {
            if (this.field802.field1356 != null) {
               Class1192.method5677(this.field802);
               if (this.field802.field1356 instanceof Class1192) {
                  Class1192 var16 = (Class1192)this.field802.field1356;
                  var16.method5679();
               }
            }

            this.field844 = this.field802.field1356 != null;
         }

         if (this.field802.field1356 != null) {
            try {
               this.field802.field1356.method1923(var10, var7, var8, this.field802.method1563());
            } catch (Throwable var15) {
               Class4526 var12 = Class4526.method14413(var15, "Rendering overlay");
               Class8965 var13 = var12.method14410("Overlay render details");
               var13.method32806("Overlay name", () -> this.field802.field1356.getClass().getCanonicalName());
               throw new Class2506(var12);
            }
         } else if (this.field802.field1355 != null && Client.getInstance().getGuiManager().method33480() == null) {
            try {
               if (Class9299.field42867.method20214()) {
                  Class9299.method35055(Class9299.field42867, this.field802.field1355, var10, var7, var8, this.field802.method1563());
               } else {
                  this.field802.field1355.method1923(var10, var7, var8, this.field802.method1563());
                  Client.getInstance().getEventManager().call(new Class4414());
               }
            } catch (Throwable var14) {
               Class4526 var17 = Class4526.method14413(var14, "Rendering screen");
               Class8965 var18 = var17.method14410("Screen render details");
               var18.method32806("Screen name", () -> this.field802.field1355.getClass().getCanonicalName());
               var18.method32806(
                  "Mouse location",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%f, %f)",
                        var7,
                        var8,
                        this.field802.field1301.method36738(),
                        this.field802.field1301.method36739()
                     )
               );
               var18.method32806(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.field802.method1580().method8045(),
                        this.field802.method1580().method8046(),
                        this.field802.method1580().method8041(),
                        this.field802.method1580().method8042(),
                        this.field802.method1580().method8049()
                     )
               );
               throw new Class2506(var17);
            }
         }

         this.field818.method7327(true);
      }

      this.method759();
      this.method757();
      Class8777.method31650();
      Class8578.method30656();
      if (this.field802.field1299.field44698) {
         this.field802.field1299.field44665 = true;
      }
   }

   private void method752() {
      if (this.field802.field1287.method872() > 10 && this.field802.field1287.method921() && !this.field802.method1531().method1305()) {
         Class1806 var3 = Class8683.method31254(this.field802.method1580().method8041(), this.field802.method1580().method8042(), this.field802.method1464());
         Util.method38493().execute(() -> {
            int var4 = var3.method7886();
            int var5 = var3.method7887();
            int var6 = 0;
            int var7 = 0;
            if (var4 > var5) {
               var6 = (var4 - var5) / 2;
               var4 = var5;
            } else {
               var7 = (var5 - var4) / 2;
               var5 = var4;
            }

            try (Class1806 var8 = new Class1806(64, 64, false)) {
               var3.method7907(var6, var7, var4, var5, var8);
               var8.method7898(this.field802.method1531().method1306());
            } catch (IOException var29) {
               field801.warn("Couldn't save auto screenshot", var29);
            } finally {
               var3.close();
            }
         });
      }
   }

   private boolean method753() {
      if (!this.field815) {
         return false;
      } else {
         Entity var3 = this.field802.method1550();
         boolean var4 = var3 instanceof PlayerEntity && !this.field802.field1299.field44662;
         if (var4 && !((PlayerEntity)var3).field4919.field29610) {
            ItemStack var5 = ((Class880)var3).method3090();
            Class8710 var6 = this.field802.field1346;
            if (var6 != null && var6.method31417() == Class2100.field13690) {
               BlockPos var7 = ((Class8711)var6).method31423();
               Class7380 var8 = this.field802.field1338.method6738(var7);
               if (this.field802.field1337.method23157() != Class1894.field11105) {
                  Class9632 var9 = new Class9632(this.field802.field1338, var7, false);
                  var4 = !var5.method32105()
                     && (var5.method32175(this.field802.field1338.method6817(), var9) || var5.method32176(this.field802.field1338.method6817(), var9));
               } else {
                  var4 = var8.method23445(this.field802.field1338, var7) != null;
               }
            }
         }

         return var4;
      }
   }

   public void method754(float var1, long var2, Class9332 var4) {
      this.field818.method7318(var1);
      if (this.field802.method1550() == null) {
         this.field802.method1551(this.field802.field1339);
      }

      this.method741(var1);
      if (Class7944.method26921()) {
         Class8981.method33041(this.field802, this.field833, var1, var2);
      }

      this.field802.method1574().method22503("center");
      boolean var7 = Class7944.method26921();
      if (var7) {
         Class8981.method33044(var1, var2);
      }

      boolean var8 = this.method753();
      this.field802.method1574().method22506("camera");
      Class9624 var9 = this.field833;
      this.field805 = (float)(this.field802.field1299.field44574 * 16);
      if (Class7944.method26804()) {
         this.field805 *= 0.95F;
      }

      if (Class7944.method26805()) {
         this.field805 *= 0.83F;
      }

      Class9332 var10 = new Class9332();
      var10.method35296().method32361().method35508(this.method749(var9, var1, true));
      Class9332 var11 = var10;
      if (Class8981.method33170()) {
         var10 = var4;
      }

      this.method744(var10, var1);
      if (this.field802.field1299.field44627) {
         this.method745(var10, var1);
      }

      float var12 = MathHelper.method37821(var1, this.field802.field1339.field6142, this.field802.field1339.field6141)
         * this.field802.field1299.field44670
         * this.field802.field1299.field44670;
      if (var12 > 0.0F) {
         int var13 = !this.field802.field1339.method3033(Class8254.field35475) ? 20 : 7;
         float var14 = 5.0F / (var12 * var12 + 5.0F) - var12 * 0.04F;
         var14 *= var14;
         Class7680 var15 = new Class7680(0.0F, MathHelper.field45205 / 2.0F, MathHelper.field45205 / 2.0F);
         var10.method35293(var15.method25286(((float)this.field809 + var1) * (float)var13));
         var10.method35292(1.0F / var14, 1.0F, 1.0F);
         float var16 = -((float)this.field809 + var1) * (float)var13;
         var10.method35293(var15.method25286(var16));
      }

      if (Class8981.method33170()) {
         var10 = var11;
      }

      Class9367 var18 = var10.method35296().method32361();
      this.method748(var18);
      var9.method37497(
         this.field802.field1338,
         (Entity)(this.field802.method1550() != null ? this.field802.method1550() : this.field802.field1339),
         !this.field802.field1299.method37173().method8246(),
         this.field802.field1299.method37173().method8247(),
         var1
      );
      if (Class9299.field42881.method20214()) {
         Object var20 = Class9299.field42881.method20217(this, var9, var1);
         float var21 = Class9299.method35067(var20, Class9299.field42796);
         float var22 = Class9299.method35067(var20, Class9299.field42797);
         float var17 = Class9299.method35067(var20, Class9299.field42798);
         var9.method37514(var21, var22);
         var4.method35293(Class7680.field32902.method25286(var17));
      }

      var4.method35293(Class7680.field32898.method25286(var9.method37506()));
      var4.method35293(Class7680.field32900.method25286(var9.method37507() + 180.0F));
      this.field802.field1287.method877(var4, var1, var2, var8, var9, this, this.field818, var18);
      if (Class9299.field42865.method20214()) {
         this.field802.method1574().method22506("forge_render_last");
         Class9299.method35055(Class9299.field42865, this.field802.field1287, var4, var1, var18, var2);
      }

      this.field802.method1574().method22506("hand");
      RenderSystem.pushMatrix();
      RenderSystem.method27888(var4.method35296().method32361());
      Client.getInstance().method19929();
      RenderSystem.popMatrix();
      if (this.field814 && !Class8981.field40609) {
         if (var7) {
            Class5463.method17155(this, var4, var9, var1);
            Class8981.method33061();
         }

         RenderSystem.method27877(256, Minecraft.field1272);
         if (!var7) {
            this.method746(var4, var9, var1);
         } else {
            Class5463.method17157(this, var4, var9, var1);
         }
      }

      if (var7) {
         Class8981.method33067();
      }

      this.field802.method1574().method22505();
   }

   public void method755() {
      this.field824 = null;
      this.field807.method596();
      this.field833.method37518();
   }

   public Class194 method756() {
      return this.field807;
   }

   private void method757() {
      this.field840 = 0;
      if (!Class7944.method26938() || !Class7944.method26937()) {
         this.field837 = 0L;
         this.field838 = 0;
      } else if (this.field802.method1529()) {
         Class1644 var3 = this.field802.method1531();
         if (var3 != null) {
            boolean var4 = this.field802.method1544();
            if (!var4 && !(this.field802.field1355 instanceof Class1312)) {
               if (this.field839 > 0) {
                  Class8578.field38580.method31034();
                  Class7944.method26885((long)this.field839);
                  Class8578.field38580.method31035();
                  this.field840 = this.field839;
               }

               long var5 = System.nanoTime() / 1000000L;
               if (this.field837 != 0L && this.field838 != 0) {
                  long var7 = var5 - this.field837;
                  if (var7 < 0L) {
                     this.field837 = var5;
                     var7 = 0L;
                  }

                  if (var7 >= 50L) {
                     this.field837 = var5;
                     int var9 = var3.method1375();
                     int var10 = var9 - this.field838;
                     if (var10 < 0) {
                        this.field838 = var9;
                        var10 = 0;
                     }

                     if (var10 < 1 && this.field839 < 100) {
                        this.field839 += 2;
                     }

                     if (var10 > 1 && this.field839 > 0) {
                        this.field839--;
                     }

                     this.field838 = var9;
                  }
               } else {
                  this.field837 = var5;
                  this.field838 = var3.method1375();
                  this.field842 = 1.0F;
                  this.field841 = 50.0F;
               }
            } else {
               if (this.field802.field1355 instanceof Class1312) {
                  Class7944.method26885(20L);
               }

               this.field837 = 0L;
               this.field838 = 0;
            }
         }
      }
   }

   private void method758() {
      Class7944.method26990();
      Class9084.method33876();
      if (!this.field834) {
         Class9787.method38575();
         if (Class7944.method26959() == 64 && Class7944.method26960() == 32) {
            Class7944.method26962(true);
         }

         this.field834 = true;
      }

      Class1656 var3 = this.field802.field1338;
      if (var3 != null) {
         if (Class7944.method26929() != null) {
            String var4 = "HD_U".replace("HD_U", "HD Ultra").replace("L", "Light");
            String var5 = var4 + " " + Class7944.method26929();
            StringTextComponent var6 = new StringTextComponent(Class9088.method33883("of.message.newVersion", "§n" + var5 + "§r"));
            var6.setStyle(Style.EMPTY.setClickEvent(new ClickEvent(ClickEvent$Action.OPEN_URL, "https://optifine.net/downloads")));
            this.field802.field1298.method5989().method5930(var6);
            Class7944.method26930((String)null);
         }

         if (Class7944.method26961()) {
            Class7944.method26962(false);
            StringTextComponent var7 = new StringTextComponent(Class9088.method33883("of.message.java64Bit"));
            this.field802.field1298.method5989().method5930(var7);
         }
      }

      if (this.field802.field1355 instanceof Class849) {
         this.method760((Class849)this.field802.field1355);
      }

      if (this.field835 != var3) {
         Class9387.method35632(this.field835, var3);
         Class7944.method26795();
         this.field837 = 0L;
         this.field838 = 0;
         this.field835 = var3;
      }

      if (!this.method761(Class8981.field40878)) {
         Class8981.field40878 = 0;
      }

      if (this.field802.field1355 != null && this.field802.field1355.getClass() == Class1331.class) {
         this.field802.displayGuiScreen(new Class1333((Class1331)this.field802.field1355));
      }
   }

   private void method759() {
      if (this.field802.field1338 != null && Class7944.method26981() && Class4379.method13743("CheckGlErrorFrameFinish", 10000L)) {
         int var3 = Class7414.method23859();
         if (var3 != 0 && Class9084.method33877(var3)) {
            String var4 = Class7944.method26985(var3);
            StringTextComponent var5 = new StringTextComponent(Class9088.method33883("of.message.openglError", var3, var4));
            this.field802.field1298.method5989().method5930(var5);
         }
      }
   }

   private void method760(Class849 var1) {
      try {
         String var4 = null;
         Calendar var5 = Calendar.getInstance();
         var5.setTime(new Date());
         int var6 = var5.get(5);
         int var7 = var5.get(2) + 1;
         if (var6 == 8 && var7 == 4) {
            var4 = "Happy birthday, OptiFine!";
         }

         if (var6 == 14 && var7 == 8) {
            var4 = "Happy birthday, sp614x!";
         }

         if (var4 == null) {
            return;
         }

         Class9299.method35082(var1, Class9299.field43011, var4);
      } catch (Throwable var8) {
      }
   }

   public boolean method761(int var1) {
      if (Class8157.method28309()) {
         if (this.field828 != null && this.field828 != this.field843[2] && this.field828 != this.field843[4]) {
            return true;
         } else if (var1 != 2 && var1 != 4) {
            if (this.field828 != null) {
               this.field828.close();
               this.field828 = null;
               return true;
            } else {
               return true;
            }
         } else if (this.field828 != null && this.field828 == this.field843[var1]) {
            return true;
         } else if (this.field802.field1338 != null) {
            this.method736(new ResourceLocation("shaders/post/fxaa_of_" + var1 + "x.json"));
            this.field843[var1] = this.field828;
            return this.field832;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public Class1991 method762() {
      return Class1990.field12992;
   }

   public void method763(ItemStack var1) {
      this.field824 = var1;
      this.field825 = 40;
      this.field826 = this.field804.nextFloat() * 2.0F - 1.0F;
      this.field827 = this.field804.nextFloat() * 2.0F - 1.0F;
   }

   public void method764(int var1, int var2, float var3) {
      if (this.field824 != null && this.field825 > 0) {
         int var6 = 40 - this.field825;
         float var7 = ((float)var6 + var3) / 40.0F;
         float var8 = var7 * var7;
         float var9 = var7 * var8;
         float var10 = 10.25F * var9 * var8 - 24.95F * var8 * var8 + 25.5F * var9 - 13.8F * var8 + 4.0F * var7;
         float var11 = var10 * (float) Math.PI;
         float var12 = this.field826 * (float)(var1 / 4);
         float var13 = this.field827 * (float)(var2 / 4);
         RenderSystem.disableAlphaTest();
         RenderSystem.pushMatrix();
         RenderSystem.method27814();
         RenderSystem.enableDepthTest();
         RenderSystem.method27850();
         Class9332 var14 = new Class9332();
         var14.method35294();
         var14.method35291(
            (double)((float)(var1 / 2) + var12 * MathHelper.method37771(MathHelper.method37763(var11 * 2.0F))),
            (double)((float)(var2 / 2) + var13 * MathHelper.method37771(MathHelper.method37763(var11 * 2.0F))),
            -50.0
         );
         float var15 = 50.0F + 175.0F * MathHelper.method37763(var11);
         var14.method35292(var15, -var15, var15);
         var14.method35293(Class7680.field32900.method25286(900.0F * MathHelper.method37771(MathHelper.method37763(var11))));
         var14.method35293(Class7680.field32898.method25286(6.0F * MathHelper.method37764(var7 * 8.0F)));
         var14.method35293(Class7680.field32902.method25286(6.0F * MathHelper.method37764(var7 * 8.0F)));
         Class7735 var16 = this.field808.method26536();
         this.field802.method1555().method789(this.field824, Class2327.field15932, 15728880, Class213.field798, var14, var16);
         var14.method35295();
         var16.method25602();
         RenderSystem.method27816();
         RenderSystem.popMatrix();
         RenderSystem.method27849();
         RenderSystem.disableDepthTest();
      }
   }

   private void method765(float var1) {
      int var4 = this.field802.method1580().method8045();
      int var5 = this.field802.method1580().method8046();
      double var6 = MathHelper.method37822((double)var1, 2.0, 1.0);
      float var8 = 0.2F * var1;
      float var9 = 0.4F * var1;
      float var10 = 0.2F * var1;
      double var11 = (double)var4 * var6;
      double var13 = (double)var5 * var6;
      double var15 = ((double)var4 - var11) / 2.0;
      double var17 = ((double)var5 - var13) / 2.0;
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      RenderSystem.method27836(Class2339.field15990, Class1981.field12927, Class2339.field15990, Class1981.field12927);
      RenderSystem.method27889(var8, var9, var10, 1.0F);
      this.field802.getTextureManager().bindTexture(field800);
      Class9352 var19 = Class9352.method35409();
      Class5425 var20 = var19.method35411();
      var20.method17063(7, Class9337.field43344);
      var20.method17025(var15, var17 + var13, -90.0).method17027(0.0F, 1.0F).method17031();
      var20.method17025(var15 + var11, var17 + var13, -90.0).method17027(1.0F, 1.0F).method17031();
      var20.method17025(var15 + var11, var17, -90.0).method17027(1.0F, 0.0F).method17031();
      var20.method17025(var15, var17, -90.0).method17027(0.0F, 0.0F).method17031();
      var19.method35410();
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.method27938();
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
   }

   public float method766(float var1) {
      return MathHelper.method37821(var1, this.field813, this.field812);
   }

   public float method767() {
      return this.field805;
   }

   public Class9624 method768() {
      return this.field833;
   }

   public Class1699 method769() {
      return this.field818;
   }

   public Class213 method770() {
      return this.field819;
   }
}
