package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Class806 extends Class798 {
   private static final Logger field4224 = LogManager.getLogger();
   private static final ResourceLocation field4225 = new ResourceLocation("realms", "textures/gui/realms/on_icon.png");
   private static final ResourceLocation field4226 = new ResourceLocation("realms", "textures/gui/realms/off_icon.png");
   private static final ResourceLocation field4227 = new ResourceLocation("realms", "textures/gui/realms/expired_icon.png");
   private static final ResourceLocation field4228 = new ResourceLocation("realms", "textures/gui/realms/expires_soon_icon.png");
   private static final ResourceLocation field4229 = new ResourceLocation("realms", "textures/gui/realms/leave_icon.png");
   private static final ResourceLocation field4230 = new ResourceLocation("realms", "textures/gui/realms/invitation_icons.png");
   private static final ResourceLocation field4231 = new ResourceLocation("realms", "textures/gui/realms/invite_icon.png");
   private static final ResourceLocation field4232 = new ResourceLocation("realms", "textures/gui/realms/world_icon.png");
   private static final ResourceLocation field4233 = new ResourceLocation("realms", "textures/gui/title/realms.png");
   private static final ResourceLocation field4234 = new ResourceLocation("realms", "textures/gui/realms/configure_icon.png");
   private static final ResourceLocation field4235 = new ResourceLocation("realms", "textures/gui/realms/questionmark.png");
   private static final ResourceLocation field4236 = new ResourceLocation("realms", "textures/gui/realms/news_icon.png");
   private static final ResourceLocation field4237 = new ResourceLocation("realms", "textures/gui/realms/popup.png");
   private static final ResourceLocation field4238 = new ResourceLocation("realms", "textures/gui/realms/darken.png");
   private static final ResourceLocation field4239 = new ResourceLocation("realms", "textures/gui/realms/cross_icon.png");
   private static final ResourceLocation field4240 = new ResourceLocation("realms", "textures/gui/realms/trial_icon.png");
   private static final ResourceLocation field4241 = new ResourceLocation("minecraft", "textures/gui/widgets.png");
   private static final ITextComponent field4242 = new TranslationTextComponent("mco.invites.nopending");
   private static final ITextComponent field4243 = new TranslationTextComponent("mco.invites.pending");
   private static final List<ITextComponent> field4244 = ImmutableList.of(
      new TranslationTextComponent("mco.trial.message.line1"), new TranslationTextComponent("mco.trial.message.line2")
   );
   private static final ITextComponent field4245 = new TranslationTextComponent("mco.selectServer.uninitialized");
   private static final ITextComponent field4246 = new TranslationTextComponent("mco.selectServer.expiredList");
   private static final ITextComponent field4247 = new TranslationTextComponent("mco.selectServer.expiredRenew");
   private static final ITextComponent field4248 = new TranslationTextComponent("mco.selectServer.expiredTrial");
   private static final ITextComponent field4249 = new TranslationTextComponent("mco.selectServer.expiredSubscribe");
   private static final ITextComponent field4250 = new TranslationTextComponent("mco.selectServer.minigame").appendString(" ");
   private static final ITextComponent field4251 = new TranslationTextComponent("mco.selectServer.popup");
   private static final ITextComponent field4252 = new TranslationTextComponent("mco.selectServer.expired");
   private static final ITextComponent field4253 = new TranslationTextComponent("mco.selectServer.expires.soon");
   private static final ITextComponent field4254 = new TranslationTextComponent("mco.selectServer.expires.day");
   private static final ITextComponent field4255 = new TranslationTextComponent("mco.selectServer.open");
   private static final ITextComponent field4256 = new TranslationTextComponent("mco.selectServer.closed");
   private static final ITextComponent field4257 = new TranslationTextComponent("mco.selectServer.leave");
   private static final ITextComponent field4258 = new TranslationTextComponent("mco.selectServer.configure");
   private static final ITextComponent field4259 = new TranslationTextComponent("mco.selectServer.info");
   private static final ITextComponent field4260 = new TranslationTextComponent("mco.news");
   private static List<ResourceLocation> field4261 = ImmutableList.of();
   private static final Class9408 field4262 = new Class9408();
   private static boolean field4263;
   private static int field4264 = -1;
   private static volatile boolean field4265;
   private static volatile boolean field4266;
   private static volatile boolean field4267;
   public static Screen field4268;
   private static boolean field4269;
   private final RateLimiter field4270;
   private boolean field4271;
   private final Screen field4272;
   private volatile Class1287 field4273;
   private long field4274 = -1L;
   private Class1206 field4275;
   private Class1206 field4276;
   private Class1206 field4277;
   private Class1206 field4278;
   private Class1206 field4279;
   private List<ITextComponent> field4280;
   private List<Class6128> field4281 = Lists.newArrayList();
   private volatile int field4282;
   private int field4283;
   private boolean field4284;
   private boolean field4285;
   private boolean field4286;
   private volatile boolean field4287;
   private volatile boolean field4288;
   private volatile boolean field4289;
   private volatile boolean field4290;
   private volatile String field4291;
   private int field4292;
   private int field4293;
   private boolean field4294;
   private List<Class9370> field4295;
   private int field4296;
   private ReentrantLock field4297 = new ReentrantLock();
   private Class5991 field4298 = Class5991.field26162;
   private Class1982 field4299;
   private Class1206 field4300;
   private Class1206 field4301;
   private Class1206 field4302;
   private Class1206 field4303;
   private Class1206 field4304;
   private Class1206 field4305;

   public Class806(Screen var1) {
      this.field4272 = var1;
      this.field4270 = RateLimiter.create(0.016666668F);
   }

   private boolean method2011() {
      if (!method2013() || !this.field4284) {
         return false;
      } else if (this.field4287 && !this.field4288) {
         return true;
      } else {
         for (Class6128 var4 : this.field4281) {
            if (var4.field27449.equals(this.field4562.getSession().getPlayerID())) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method2012() {
      if (!method2013() || !this.field4284) {
         return false;
      } else if (this.field4285) {
         return true;
      } else {
         return this.field4287 && !this.field4288 && this.field4281.isEmpty() ? true : this.field4281.isEmpty();
      }
   }

   @Override
   public void method1921() {
      this.field4295 = Lists.newArrayList(
         new Class9370[]{
            new Class9370(new char[]{'3', '2', '1', '4', '5', '6'}, () -> field4263 = !field4263),
            new Class9370(new char[]{'9', '8', '7', '1', '2', '3'}, () -> {
               if (Class4624.field22142 != Class2174.field14272) {
                  this.method2027();
               } else {
                  this.method2029();
               }
            }),
            new Class9370(new char[]{'9', '8', '7', '4', '5', '6'}, () -> {
               if (Class4624.field22142 != Class2174.field14273) {
                  this.method2028();
               } else {
                  this.method2029();
               }
            })
         }
      );
      if (field4268 == null) {
         this.field4297 = new ReentrantLock();
         if (field4267 && !method2013()) {
            this.method2026();
         }

         this.method2024();
         this.method2025();
         if (!this.field4271) {
            this.field4562.setConnectedToRealms(false);
         }

         this.field4562.keyboardListener.method36347(true);
         if (method2013()) {
            field4262.method36019();
         }

         this.field4289 = false;
         if (method2013() && this.field4284) {
            this.method2014();
         }

         this.field4273 = new Class1287(this);
         if (field4264 != -1) {
            this.field4273.method6045((double)field4264);
         }

         this.<Class1287>method2456(this.field4273);
         this.method5537(this.field4273);
         this.field4298 = Class5991.method18584(this.field4568, field4251, 100);
      } else {
         this.field4562.displayGuiScreen(field4268);
      }
   }

   private static boolean method2013() {
      return field4266 && field4265;
   }

   public void method2014() {
      this.field4279 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 202,
            this.field4565 - 32,
            90,
            20,
            new TranslationTextComponent("mco.selectServer.leave"),
            var1 -> this.method2032(this.method2034(this.field4274))
         )
      );
      this.field4278 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 190,
            this.field4565 - 32,
            90,
            20,
            new TranslationTextComponent("mco.selectServer.configure"),
            var1 -> this.method2031(this.method2034(this.field4274))
         )
      );
      this.field4275 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 93, this.field4565 - 32, 90, 20, new TranslationTextComponent("mco.selectServer.play"), var1 -> {
            Class6128 var4 = this.method2034(this.field4274);
            if (var4 != null) {
               this.method2046(var4, this);
            }
         })
      );
      this.field4276 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 + 4, this.field4565 - 32, 90, 20, DialogTexts.field30663, var1 -> {
         if (!this.field4286) {
            this.field4562.displayGuiScreen(this.field4272);
         }
      }));
      this.field4277 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 100, this.field4565 - 32, 90, 20, new TranslationTextComponent("mco.selectServer.expiredRenew"), var1 -> this.method2023()
         )
      );
      this.field4301 = this.<Class1206>method2455(new Class1220(this));
      this.field4302 = this.<Class1206>method2455(new Class1224(this));
      this.field4300 = this.<Class1206>method2455(new Class1240(this));
      this.field4305 = this.<Class1206>method2455(new Class1222(this));
      this.field4303 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 52, this.method2043() + 137 - 20, 98, 20, new TranslationTextComponent("mco.selectServer.trial"), var1 -> {
            if (this.field4287 && !this.field4288) {
               Util.getOSType().method8181("https://aka.ms/startjavarealmstrial");
               this.field4562.displayGuiScreen(this.field4272);
            }
         })
      );
      this.field4304 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 52,
            this.method2043() + 160 - 20,
            98,
            20,
            new TranslationTextComponent("mco.selectServer.buy"),
            var0 -> Util.getOSType().method8181("https://aka.ms/BuyJavaRealms")
         )
      );
      Class6128 var3 = this.method2034(this.field4274);
      this.method2015(var3);
   }

   private void method2015(Class6128 var1) {
      this.field4275.field6482 = this.method2017(var1) && !this.method2012();
      this.field4277.field6483 = this.method2018(var1);
      this.field4278.field6483 = this.method2019(var1);
      this.field4279.field6483 = this.method2020(var1);
      boolean var4 = this.method2012() && this.field4287 && !this.field4288;
      this.field4303.field6483 = var4;
      this.field4303.field6482 = var4;
      this.field4304.field6483 = this.method2012();
      this.field4305.field6483 = this.method2012() && this.field4285;
      this.field4277.field6482 = !this.method2012();
      this.field4278.field6482 = !this.method2012();
      this.field4279.field6482 = !this.method2012();
      this.field4302.field6482 = true;
      this.field4301.field6482 = true;
      this.field4276.field6482 = true;
      this.field4300.field6482 = !this.method2012();
   }

   private boolean method2016() {
      return (!this.method2012() || this.field4285) && method2013() && this.field4284;
   }

   private boolean method2017(Class6128 var1) {
      return var1 != null && !var1.field27452 && var1.field27447 == Class2261.field14707;
   }

   private boolean method2018(Class6128 var1) {
      return var1 != null && var1.field27452 && this.method2047(var1);
   }

   private boolean method2019(Class6128 var1) {
      return var1 != null && this.method2047(var1);
   }

   private boolean method2020(Class6128 var1) {
      return var1 != null && !this.method2047(var1);
   }

   @Override
   public void tick() {
      super.tick();
      this.field4286 = false;
      this.field4283++;
      this.field4296--;
      if (this.field4296 < 0) {
         this.field4296 = 0;
      }

      if (method2013()) {
         field4262.method36015();
         if (field4262.method36017(Class2310.field15834)) {
            List<Class6128> var3 = field4262.method36020();
            this.field4273.method6111();
            boolean var4 = !this.field4284;
            if (var4) {
               this.field4284 = true;
            }

            if (var3 != null) {
               boolean var5 = false;

               for (Class6128 var7 : var3) {
                  if (this.method2048(var7)) {
                     var5 = true;
                  }
               }

               this.field4281 = var3;
               if (this.method2011()) {
                  this.field4273.method6112(new Class1163(this, null));
               }

               for (Class6128 var14 : this.field4281) {
                  this.field4273.method6030(new Class1162(this, var14));
               }

               if (!field4269 && var5) {
                  field4269 = true;
                  this.method2021();
               }
            }

            if (var4) {
               this.method2014();
            }
         }

         if (field4262.method36017(Class2310.field15835)) {
            this.field4282 = field4262.method36021();
            if (this.field4282 > 0 && this.field4270.tryAcquire(1)) {
               Class9229.method34711(I18n.format("mco.configure.world.invite.narration", this.field4282));
            }
         }

         if (field4262.method36017(Class2310.field15836) && !this.field4288) {
            boolean var8 = field4262.method36022();
            if (var8 != this.field4287 && this.method2012()) {
               this.field4287 = var8;
               this.field4289 = false;
            } else {
               this.field4287 = var8;
            }
         }

         if (field4262.method36017(Class2310.field15837)) {
            Class6119 var9 = field4262.method36023();

            for (Class6124 var11 : var9.field27400) {
               for (Class6128 var15 : this.field4281) {
                  if (var15.field27443 == var11.field27419) {
                     var15.method18911(var11);
                     break;
                  }
               }
            }
         }

         if (field4262.method36017(Class2310.field15838)) {
            this.field4290 = field4262.method36024();
            this.field4291 = field4262.method36025();
         }

         field4262.method36018();
         if (this.method2012()) {
            this.field4293++;
         }

         if (this.field4300 != null) {
            this.field4300.field6483 = this.method2016();
         }
      }
   }

   private void method2021() {
      new Thread(() -> {
         List var3 = Class8458.method29753();
         Class4624 var4 = Class4624.method14543();
         Class6116 var5 = new Class6116();
         var5.field27390 = var3;
         var5.field27391 = this.method2022();

         try {
            var4.method14581(var5);
         } catch (Throwable var7) {
            field4224.warn("Could not send ping result to Realms: ", var7);
         }
      }).start();
   }

   private List<Long> method2022() {
      ArrayList var3 = Lists.newArrayList();

      for (Class6128 var5 : this.field4281) {
         if (this.method2048(var5)) {
            var3.add(var5.field27443);
         }
      }

      return var3;
   }

   @Override
   public void onClose() {
      this.field4562.keyboardListener.method36347(false);
      this.method2030();
   }

   private void method2023() {
      Class6128 var3 = this.method2034(this.field4274);
      if (var3 != null) {
         String var4 = "https://aka.ms/ExtendJavaRealms?subscriptionId="
            + var3.field27444
            + "&profileId="
            + this.field4562.getSession().getPlayerID()
            + "&ref="
            + (!var3.field27453 ? "expiredRealm" : "expiredTrial");
         this.field4562.keyboardListener.method36350(var4);
         Util.getOSType().method8181(var4);
      }
   }

   private void method2024() {
      if (!field4267) {
         field4267 = true;
         new Class375(this, "MCO Compatability Checker #1").start();
      }
   }

   private void method2025() {
   }

   private void method2026() {
      new Class380(this, "MCO Compatability Checker #1").start();
   }

   private void method2027() {
      if (Class4624.field22142 != Class2174.field14272) {
         new Class387(this, "MCO Stage Availability Checker #1").start();
      }
   }

   private void method2028() {
      if (Class4624.field22142 != Class2174.field14273) {
         new Class364(this, "MCO Local Availability Checker #1").start();
      }
   }

   private void method2029() {
      Class4624.method14545();
      field4262.method36019();
   }

   private void method2030() {
      field4262.method36026();
   }

   private void method2031(Class6128 var1) {
      if (this.field4562.getSession().getPlayerID().equals(var1.field27449) || field4263) {
         this.method2033();
         this.field4562.displayGuiScreen(new Class815(this, var1.field27443));
      }
   }

   private void method2032(Class6128 var1) {
      if (var1 != null && !this.field4562.getSession().getPlayerID().equals(var1.field27449)) {
         this.method2033();
         TranslationTextComponent var4 = new TranslationTextComponent("mco.configure.world.leave.question.line1");
         TranslationTextComponent var5 = new TranslationTextComponent("mco.configure.world.leave.question.line2");
         this.field4562.displayGuiScreen(new Class808(this::method2035, Class2134.field13980, var4, var5, true));
      }
   }

   private void method2033() {
      field4264 = (int)this.field4273.method6044();
   }

   @Nullable
   private Class6128 method2034(long var1) {
      for (Class6128 var6 : this.field4281) {
         if (var6.field27443 == var1) {
            return var6;
         }
      }

      return null;
   }

   private void method2035(boolean var1) {
      if (var1) {
         new Class363(this, "Realms-leave-server").start();
      }

      this.field4562.displayGuiScreen(this);
   }

   private void method2036(Class6128 var1) {
      field4262.method36030(var1);
      this.field4281.remove(var1);
      this.field4273.method2468().removeIf(var1x -> var1x instanceof Class1162 && Class1162.method5562((Class1162)var1x).field27443 == this.field4274);
      this.field4273.method6024((Class1161)null);
      this.method2015((Class6128)null);
      this.field4274 = -1L;
      this.field4275.field6482 = false;
   }

   public void method2037() {
      this.field4274 = -1L;
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.field4295.forEach(Class9370::method35543);
         this.method2038();
         return true;
      }
   }

   private void method2038() {
      if (this.method2012() && this.field4285) {
         this.field4285 = false;
      } else {
         this.field4562.displayGuiScreen(this.field4272);
      }
   }

   @Override
   public boolean method1932(char var1, int var2) {
      this.field4295.forEach(var1x -> var1x.method35542(var1));
      return true;
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.field4299 = Class1982.field12939;
      this.field4280 = null;
      this.method2469(var1);
      this.field4273.method1923(var1, var2, var3, var4);
      this.method2039(var1, this.field4564 / 2 - 50, 7);
      if (Class4624.field22142 == Class2174.field14272) {
         this.method2059(var1);
      }

      if (Class4624.field22142 == Class2174.field14273) {
         this.method2058(var1);
      }

      if (!this.method2012()) {
         if (this.field4289) {
            this.method2015((Class6128)null);
            if (!this.field4561.contains(this.field4273)) {
               this.field4561.add(this.field4273);
            }

            Class6128 var7 = this.method2034(this.field4274);
            this.field4275.field6482 = this.method2017(var7);
         }

         this.field4289 = false;
      } else {
         this.method2041(var1, var2, var3);
      }

      super.method1923(var1, var2, var3, var4);
      if (this.field4280 != null) {
         this.method2055(var1, this.field4280, var2, var3);
      }

      if (this.field4287 && !this.field4288 && this.method2012()) {
         this.field4562.getTextureManager().bindTexture(field4240);
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         byte var10 = 8;
         byte var8 = 8;
         byte var9 = 0;
         if ((Util.milliTime() / 800L & 1L) == 1L) {
            var9 = 8;
         }

         Class1193.method5699(
            var1,
            this.field4303.field6477 + this.field4303.method5740() - 8 - 4,
            this.field4303.field6478 + this.field4303.method5728() / 2 - 4,
            0.0F,
            (float)var9,
            8,
            8,
            8,
            16
         );
      }
   }

   private void method2039(MatrixStack var1, int var2, int var3) {
      this.field4562.getTextureManager().bindTexture(field4233);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.pushMatrix();
      RenderSystem.scalef(0.5F, 0.5F, 0.5F);
      Class1193.method5699(var1, var2 * 2, var3 * 2 - 5, 0.0F, 0.0F, 200, 50, 200, 50);
      RenderSystem.popMatrix();
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (this.method2040(var1, var3) && this.field4285) {
         this.field4285 = false;
         this.field4286 = true;
         return true;
      } else {
         return super.method1958(var1, var3, var5);
      }
   }

   private boolean method2040(double var1, double var3) {
      int var7 = this.method2042();
      int var8 = this.method2043();
      return var1 < (double)(var7 - 5) || var1 > (double)(var7 + 315) || var3 < (double)(var8 - 5) || var3 > (double)(var8 + 171);
   }

   private void method2041(MatrixStack var1, int var2, int var3) {
      int var6 = this.method2042();
      int var7 = this.method2043();
      if (!this.field4289) {
         this.field4292 = 0;
         this.field4293 = 0;
         this.field4294 = true;
         this.method2015((Class6128)null);
         if (this.field4561.contains(this.field4273)) {
            Class1287 var8 = this.field4273;
            if (!this.field4561.remove(var8)) {
               field4224.error("Unable to remove widget: " + var8);
            }
         }

         Class9229.method34711(field4251.getString());
      }

      if (this.field4284) {
         this.field4289 = true;
      }

      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 0.7F);
      RenderSystem.enableBlend();
      this.field4562.getTextureManager().bindTexture(field4238);
      boolean var10 = false;
      byte var9 = 32;
      Class1193.method5699(var1, 0, 32, 0.0F, 0.0F, this.field4564, this.field4565 - 40 - 32, 310, 166);
      RenderSystem.disableBlend();
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.field4562.getTextureManager().bindTexture(field4237);
      Class1193.method5699(var1, var6, var7, 0.0F, 0.0F, 310, 166, 310, 166);
      if (!field4261.isEmpty()) {
         this.field4562.getTextureManager().bindTexture(field4261.get(this.field4292));
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         Class1193.method5699(var1, var6 + 7, var7 + 7, 0.0F, 0.0F, 195, 152, 195, 152);
         if (this.field4293 % 95 >= 5) {
            this.field4294 = false;
         } else if (!this.field4294) {
            this.field4292 = (this.field4292 + 1) % field4261.size();
            this.field4294 = true;
         }
      }

      this.field4298.method18591(var1, this.field4564 / 2 + 52, var7 + 7, 10, 5000268);
   }

   private int method2042() {
      return (this.field4564 - 310) / 2;
   }

   private int method2043() {
      return this.field4565 / 2 - 80;
   }

   private void method2044(MatrixStack var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7) {
      int var10 = this.field4282;
      boolean var11 = this.method2045((double)var2, (double)var3);
      boolean var12 = var7 && var6;
      if (var12) {
         float var13 = 0.25F + (1.0F + MathHelper.sin((float)this.field4283 * 0.5F)) * 0.25F;
         int var14 = 0xFF000000 | (int)(var13 * 64.0F) << 16 | (int)(var13 * 64.0F) << 8 | (int)(var13 * 64.0F) << 0;
         this.method5688(var1, var4 - 2, var5 - 2, var4 + 18, var5 + 18, var14, var14);
         var14 = 0xFF000000 | (int)(var13 * 255.0F) << 16 | (int)(var13 * 255.0F) << 8 | (int)(var13 * 255.0F) << 0;
         this.method5688(var1, var4 - 2, var5 - 2, var4 + 18, var5 - 1, var14, var14);
         this.method5688(var1, var4 - 2, var5 - 2, var4 - 1, var5 + 18, var14, var14);
         this.method5688(var1, var4 + 17, var5 - 2, var4 + 18, var5 + 18, var14, var14);
         this.method5688(var1, var4 - 2, var5 + 17, var4 + 18, var5 + 18, var14, var14);
      }

      this.field4562.getTextureManager().bindTexture(field4231);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      boolean var20 = var7 && var6;
      float var22 = !var20 ? 0.0F : 16.0F;
      Class1193.method5699(var1, var4, var5 - 6, var22, 0.0F, 15, 25, 31, 25);
      boolean var15 = var7 && var10 != 0;
      if (var15) {
         int var16 = (Math.min(var10, 6) - 1) * 8;
         int var17 = (int)(
            Math.max(0.0F, Math.max(MathHelper.sin((float)(10 + this.field4283) * 0.57F), MathHelper.cos((float)this.field4283 * 0.35F))) * -6.0F
         );
         this.field4562.getTextureManager().bindTexture(field4230);
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         float var18 = !var11 ? 0.0F : 8.0F;
         Class1193.method5699(var1, var4 + 4, var5 + 4 + var17, (float)var16, var18, 8, 8, 48, 16);
      }

      int var23 = var2 + 12;
      boolean var24 = var7 && var11;
      if (var24) {
         ITextComponent var25 = var10 != 0 ? field4243 : field4242;
         int var19 = this.field4568.method38821(var25);
         this.method5688(var1, var23 - 3, var3 - 3, var23 + var19 + 3, var3 + 8 + 3, -1073741824, -1073741824);
         this.field4568.method38803(var1, var25, (float)var23, (float)var3, -1);
      }
   }

   private boolean method2045(double var1, double var3) {
      int var7 = this.field4564 / 2 + 50;
      int var8 = this.field4564 / 2 + 66;
      byte var9 = 11;
      byte var10 = 23;
      if (this.field4282 != 0) {
         var7 -= 3;
         var8 += 3;
         var9 -= 5;
         var10 += 5;
      }

      return (double)var7 <= var1 && var1 <= (double)var8 && (double)var9 <= var3 && var3 <= (double)var10;
   }

   public void method2046(Class6128 var1, Screen var2) {
      if (var1 != null) {
         try {
            if (!this.field4297.tryLock(1L, TimeUnit.SECONDS)) {
               return;
            }

            if (this.field4297.getHoldCount() > 1) {
               return;
            }
         } catch (InterruptedException var6) {
            return;
         }

         this.field4271 = true;
         this.field4562.displayGuiScreen(new Class797(var2, new Class791(this, var2, var1, this.field4297)));
      }
   }

   private boolean method2047(Class6128 var1) {
      return var1.field27449 != null && var1.field27449.equals(this.field4562.getSession().getPlayerID());
   }

   private boolean method2048(Class6128 var1) {
      return this.method2047(var1) && !var1.field27452;
   }

   private void method2049(MatrixStack var1, int var2, int var3, int var4, int var5) {
      this.field4562.getTextureManager().bindTexture(field4227);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      Class1193.method5699(var1, var2, var3, 0.0F, 0.0F, 10, 28, 10, 28);
      if (var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 27 && var5 < this.field4565 - 40 && var5 > 32 && !this.method2012()) {
         this.method2062(field4252);
      }
   }

   private void method2050(MatrixStack var1, int var2, int var3, int var4, int var5, int var6) {
      this.field4562.getTextureManager().bindTexture(field4228);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.field4283 % 20 >= 10) {
         Class1193.method5699(var1, var2, var3, 10.0F, 0.0F, 10, 28, 20, 28);
      } else {
         Class1193.method5699(var1, var2, var3, 0.0F, 0.0F, 10, 28, 20, 28);
      }

      if (var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 27 && var5 < this.field4565 - 40 && var5 > 32 && !this.method2012()) {
         if (var6 > 0) {
            if (var6 != 1) {
               this.method2062(new TranslationTextComponent("mco.selectServer.expires.days", var6));
            } else {
               this.method2062(field4254);
            }
         } else {
            this.method2062(field4253);
         }
      }
   }

   private void method2051(MatrixStack var1, int var2, int var3, int var4, int var5) {
      this.field4562.getTextureManager().bindTexture(field4225);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      Class1193.method5699(var1, var2, var3, 0.0F, 0.0F, 10, 28, 10, 28);
      if (var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 27 && var5 < this.field4565 - 40 && var5 > 32 && !this.method2012()) {
         this.method2062(field4255);
      }
   }

   private void method2052(MatrixStack var1, int var2, int var3, int var4, int var5) {
      this.field4562.getTextureManager().bindTexture(field4226);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      Class1193.method5699(var1, var2, var3, 0.0F, 0.0F, 10, 28, 10, 28);
      if (var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 27 && var5 < this.field4565 - 40 && var5 > 32 && !this.method2012()) {
         this.method2062(field4256);
      }
   }

   private void method2053(MatrixStack var1, int var2, int var3, int var4, int var5) {
      boolean var8 = false;
      if (var4 >= var2 && var4 <= var2 + 28 && var5 >= var3 && var5 <= var3 + 28 && var5 < this.field4565 - 40 && var5 > 32 && !this.method2012()) {
         var8 = true;
      }

      this.field4562.getTextureManager().bindTexture(field4229);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      float var9 = !var8 ? 0.0F : 28.0F;
      Class1193.method5699(var1, var2, var3, var9, 0.0F, 28, 28, 56, 28);
      if (var8) {
         this.method2062(field4257);
         this.field4299 = Class1982.field12941;
      }
   }

   private void method2054(MatrixStack var1, int var2, int var3, int var4, int var5) {
      boolean var8 = false;
      if (var4 >= var2 && var4 <= var2 + 28 && var5 >= var3 && var5 <= var3 + 28 && var5 < this.field4565 - 40 && var5 > 32 && !this.method2012()) {
         var8 = true;
      }

      this.field4562.getTextureManager().bindTexture(field4234);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      float var9 = !var8 ? 0.0F : 28.0F;
      Class1193.method5699(var1, var2, var3, var9, 0.0F, 28, 28, 56, 28);
      if (var8) {
         this.method2062(field4258);
         this.field4299 = Class1982.field12942;
      }
   }

   public void method2055(MatrixStack var1, List<ITextComponent> var2, int var3, int var4) {
      if (!var2.isEmpty()) {
         byte var7 = 0;
         int var8 = 0;

         for (ITextComponent var10 : var2) {
            int var11 = this.field4568.method38821(var10);
            if (var11 > var8) {
               var8 = var11;
            }
         }

         int var14 = var3 - var8 - 5;
         int var15 = var4;
         if (var14 < 0) {
            var14 = var3 + 12;
         }

         for (ITextComponent var12 : var2) {
            int var13 = var15 - (var7 != 0 ? 0 : 3) + var7;
            this.method5688(var1, var14 - 3, var13, var14 + var8 + 3, var15 + 8 + 3 + var7, -1073741824, -1073741824);
            this.field4568.method38803(var1, var12, (float)var14, (float)(var15 + var7), 16777215);
            var7 += 10;
         }
      }
   }

   private void method2056(MatrixStack var1, int var2, int var3, int var4, int var5, boolean var6) {
      boolean var9 = false;
      if (var2 >= var4 && var2 <= var4 + 20 && var3 >= var5 && var3 <= var5 + 20) {
         var9 = true;
      }

      this.field4562.getTextureManager().bindTexture(field4235);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      float var10 = !var6 ? 0.0F : 20.0F;
      Class1193.method5699(var1, var4, var5, var10, 0.0F, 20, 20, 40, 20);
      if (var9) {
         this.method2062(field4259);
      }
   }

   private void method2057(MatrixStack var1, int var2, int var3, boolean var4, int var5, int var6, boolean var7, boolean var8) {
      boolean var11 = false;
      if (var2 >= var5 && var2 <= var5 + 20 && var3 >= var6 && var3 <= var6 + 20) {
         var11 = true;
      }

      this.field4562.getTextureManager().bindTexture(field4236);
      if (!var8) {
         RenderSystem.method27889(0.5F, 0.5F, 0.5F, 1.0F);
      } else {
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      }

      boolean var12 = var8 && var7;
      float var13 = !var12 ? 0.0F : 20.0F;
      Class1193.method5699(var1, var5, var6, var13, 0.0F, 20, 20, 40, 20);
      if (var11 && var8) {
         this.method2062(field4260);
      }

      if (var4 && var8) {
         int var14 = !var11
            ? (int)(
               Math.max(0.0F, Math.max(MathHelper.sin((float)(10 + this.field4283) * 0.57F), MathHelper.cos((float)this.field4283 * 0.35F)))
                  * -6.0F
            )
            : 0;
         this.field4562.getTextureManager().bindTexture(field4230);
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         Class1193.method5699(var1, var5 + 10, var6 + 2 + var14, 40.0F, 0.0F, 8, 8, 48, 16);
      }
   }

   private void method2058(MatrixStack var1) {
      String var4 = "LOCAL!";
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.pushMatrix();
      RenderSystem.translatef((float)(this.field4564 / 2 - 25), 20.0F, 0.0F);
      RenderSystem.method27883(-20.0F, 0.0F, 0.0F, 1.0F);
      RenderSystem.scalef(1.5F, 1.5F, 1.5F);
      this.field4568.method38801(var1, "LOCAL!", 0.0F, 0.0F, 8388479);
      RenderSystem.popMatrix();
   }

   private void method2059(MatrixStack var1) {
      String var4 = "STAGE!";
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.pushMatrix();
      RenderSystem.translatef((float)(this.field4564 / 2 - 25), 20.0F, 0.0F);
      RenderSystem.method27883(-20.0F, 0.0F, 0.0F, 1.0F);
      RenderSystem.scalef(1.5F, 1.5F, 1.5F);
      this.field4568.method38801(var1, "STAGE!", 0.0F, 0.0F, -256);
      RenderSystem.popMatrix();
   }

   public Class806 method2060() {
      Class806 var3 = new Class806(this.field4272);
      var3.init(this.field4562, this.field4564, this.field4565);
      return var3;
   }

   public static void method2061(IResourceManager var0) {
      Collection<ResourceLocation> var3 = var0.method583("textures/gui/images", var0x -> var0x.endsWith(".png"));
      field4261 = var3.stream().filter(var0x -> var0x.getNamespace().equals("realms")).collect(ImmutableList.toImmutableList());
   }

   private void method2062(ITextComponent... var1) {
      this.field4280 = Arrays.<ITextComponent>asList(var1);
   }

   private void method2063(Class1206 var1) {
      this.field4562.displayGuiScreen(new Class823(this.field4272));
   }

   // $VF: synthetic method
   public static Screen method2079(Class806 var0) {
      return var0.field4272;
   }

   // $VF: synthetic method
   public static Minecraft method2080(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Minecraft method2081(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static void method2082(Class806 var0) {
      var0.method2026();
   }

   // $VF: synthetic method
   public static boolean method2083(boolean var0) {
      field4267 = var0;
      return var0;
   }

   // $VF: synthetic method
   public static Logger method2084() {
      return field4224;
   }

   // $VF: synthetic method
   public static Minecraft method2085(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Minecraft method2086(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Minecraft method2087(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Minecraft method2088(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Minecraft method2089(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Minecraft method2090(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static boolean method2091(boolean var0) {
      field4265 = var0;
      return var0;
   }

   // $VF: synthetic method
   public static Minecraft method2092(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static boolean method2093(boolean var0) {
      field4266 = var0;
      return var0;
   }

   // $VF: synthetic method
   public static Minecraft method2094(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Minecraft method2095(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Minecraft method2096(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Class9408 method2097() {
      return field4262;
   }

   // $VF: synthetic method
   public static long method2098(Class806 var0) {
      return var0.field4274;
   }

   // $VF: synthetic method
   public static Class6128 method2099(Class806 var0, long var1) {
      return var0.method2034(var1);
   }

   // $VF: synthetic method
   public static Minecraft method2100(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Minecraft method2101(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Minecraft method2102(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static void method2103(Class806 var0, Class6128 var1) {
      var0.method2036(var1);
   }

   // $VF: synthetic method
   public static int method2104(Class806 var0) {
      return var0.method2042();
   }

   // $VF: synthetic method
   public static int method2105(Class806 var0) {
      return var0.method2043();
   }

   // $VF: synthetic method
   public static ResourceLocation method2106() {
      return field4239;
   }

   // $VF: synthetic method
   public static Minecraft method2107(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static void method2108(Class806 var0, ITextComponent[] var1) {
      var0.method2062(var1);
   }

   // $VF: synthetic method
   public static void method2109(Class806 var0) {
      var0.method2038();
   }

   // $VF: synthetic method
   public static void method2110(Class806 var0, MatrixStack var1, int var2, int var3, int var4, int var5, boolean var6) {
      var0.method2056(var1, var2, var3, var4, var5, var6);
   }

   // $VF: synthetic method
   public static boolean method2111(Class806 var0, boolean var1) {
      return var0.field4285 = var1;
   }

   // $VF: synthetic method
   public static boolean method2112(Class806 var0) {
      return var0.field4285;
   }

   // $VF: synthetic method
   public static boolean method2113(Class806 var0) {
      return var0.field4290;
   }

   // $VF: synthetic method
   public static void method2114(Class806 var0, MatrixStack var1, int var2, int var3, boolean var4, int var5, int var6, boolean var7, boolean var8) {
      var0.method2057(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   // $VF: synthetic method
   public static String method2115(Class806 var0) {
      return var0.field4291;
   }

   // $VF: synthetic method
   public static boolean method2116(Class806 var0, boolean var1) {
      return var0.field4290 = var1;
   }

   // $VF: synthetic method
   public static int method2117(Class806 var0) {
      return var0.field4282;
   }

   // $VF: synthetic method
   public static void method2118(Class806 var0, MatrixStack var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7) {
      var0.method2044(var1, var2, var3, var4, var5, var6, var7);
   }

   // $VF: synthetic method
   public static void method2119(Class806 var0, Class1206 var1) {
      var0.method2063(var1);
   }

   // $VF: synthetic method
   public static long method2120(Class806 var0, long var1) {
      return var0.field4274 = var1;
   }

   // $VF: synthetic method
   public static Minecraft method2121(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static ResourceLocation method2122() {
      return field4232;
   }

   // $VF: synthetic method
   public static Minecraft method2123(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static int method2124(Class806 var0) {
      return var0.field4283;
   }

   // $VF: synthetic method
   public static FontRenderer method2125(Class806 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static ITextComponent method2126() {
      return field4245;
   }

   // $VF: synthetic method
   public static void method2127(Class806 var0, MatrixStack var1, int var2, int var3, int var4, int var5) {
      var0.method2049(var1, var2, var3, var4, var5);
   }

   // $VF: synthetic method
   public static void method2128(Class806 var0, MatrixStack var1, int var2, int var3, int var4, int var5) {
      var0.method2052(var1, var2, var3, var4, var5);
   }

   // $VF: synthetic method
   public static boolean method2129(Class806 var0, Class6128 var1) {
      return var0.method2047(var1);
   }

   // $VF: synthetic method
   public static void method2130(Class806 var0, MatrixStack var1, int var2, int var3, int var4, int var5, int var6) {
      var0.method2050(var1, var2, var3, var4, var5, var6);
   }

   // $VF: synthetic method
   public static void method2131(Class806 var0, MatrixStack var1, int var2, int var3, int var4, int var5) {
      var0.method2051(var1, var2, var3, var4, var5);
   }

   // $VF: synthetic method
   public static boolean method2132() {
      return field4263;
   }

   // $VF: synthetic method
   public static void method2133(Class806 var0, MatrixStack var1, int var2, int var3, int var4, int var5) {
      var0.method2053(var1, var2, var3, var4, var5);
   }

   // $VF: synthetic method
   public static void method2134(Class806 var0, MatrixStack var1, int var2, int var3, int var4, int var5) {
      var0.method2054(var1, var2, var3, var4, var5);
   }

   // $VF: synthetic method
   public static FontRenderer method2135(Class806 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static FontRenderer method2136(Class806 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static FontRenderer method2137(Class806 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static ResourceLocation method2138() {
      return field4241;
   }

   // $VF: synthetic method
   public static Minecraft method2139(Class806 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static ITextComponent method2140() {
      return field4248;
   }

   // $VF: synthetic method
   public static ITextComponent method2141() {
      return field4249;
   }

   // $VF: synthetic method
   public static ITextComponent method2142() {
      return field4246;
   }

   // $VF: synthetic method
   public static ITextComponent method2143() {
      return field4247;
   }

   // $VF: synthetic method
   public static FontRenderer method2144(Class806 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static FontRenderer method2145(Class806 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static Class1982 method2146(Class806 var0, Class1982 var1) {
      return var0.field4299 = var1;
   }

   // $VF: synthetic method
   public static FontRenderer method2147(Class806 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static FontRenderer method2148(Class806 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static ITextComponent method2149() {
      return field4250;
   }

   // $VF: synthetic method
   public static FontRenderer method2150(Class806 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static FontRenderer method2151(Class806 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static FontRenderer method2152(Class806 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static FontRenderer method2153(Class806 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static FontRenderer method2154(Class806 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static FontRenderer method2155(Class806 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static Class1287 method2156(Class806 var0) {
      return var0.field4273;
   }

   // $VF: synthetic method
   public static int method2157(Class806 var0, int var1) {
      return var0.field4296 = var1;
   }

   // $VF: synthetic method
   public static int method2158(Class806 var0) {
      return var0.field4296;
   }

   // $VF: synthetic method
   public static List method2159(Class806 var0) {
      return var0.field4281;
   }

   // $VF: synthetic method
   public static void method2160(Class806 var0, Class6128 var1) {
      var0.method2015(var1);
   }

   // $VF: synthetic method
   public static Class1206 method2161(Class806 var0) {
      return var0.field4275;
   }

   // $VF: synthetic method
   public static Class1982 method2162(Class806 var0) {
      return var0.field4299;
   }

   // $VF: synthetic method
   public static void method2163(Class806 var0, Class6128 var1) {
      var0.method2031(var1);
   }

   // $VF: synthetic method
   public static void method2164(Class806 var0, Class6128 var1) {
      var0.method2032(var1);
   }

   // $VF: synthetic method
   public static void method2165(Class806 var0) {
      var0.method2023();
   }

   // $VF: synthetic method
   public static List<ITextComponent> method2166() {
      return field4244;
   }

   // $VF: synthetic method
   public static FontRenderer method2167(Class806 var0) {
      return var0.field4568;
   }
}
