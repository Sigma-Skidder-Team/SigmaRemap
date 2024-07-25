package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7039 extends class_1094 {
   private static final Logger field_36287 = LogManager.getLogger();
   private static final class_4639 field_36328 = new class_4639(field_36292[23], "textures/gui/realms/on_icon.png");
   private static final class_4639 field_36318 = new class_4639(field_36292[23], "textures/gui/realms/off_icon.png");
   private static final class_4639 field_36369 = new class_4639(field_36292[23], "textures/gui/realms/expired_icon.png");
   private static final class_4639 field_36309 = new class_4639(field_36292[23], "textures/gui/realms/expires_soon_icon.png");
   private static final class_4639 field_36306 = new class_4639(field_36292[23], "textures/gui/realms/leave_icon.png");
   private static final class_4639 field_36317 = new class_4639(field_36292[23], "textures/gui/realms/invitation_icons.png");
   private static final class_4639 field_36299 = new class_4639(field_36292[23], "textures/gui/realms/invite_icon.png");
   private static final class_4639 field_36313 = new class_4639(field_36292[23], "textures/gui/realms/world_icon.png");
   private static final class_4639 field_36331 = new class_4639(field_36292[23], "textures/gui/title/realms.png");
   private static final class_4639 field_36343 = new class_4639(field_36292[23], "textures/gui/realms/configure_icon.png");
   private static final class_4639 field_36316 = new class_4639(field_36292[23], "textures/gui/realms/questionmark.png");
   private static final class_4639 field_36367 = new class_4639(field_36292[23], "textures/gui/realms/news_icon.png");
   private static final class_4639 field_36353 = new class_4639(field_36292[23], "textures/gui/realms/popup.png");
   private static final class_4639 field_36288 = new class_4639(field_36292[23], "textures/gui/realms/darken.png");
   private static final class_4639 field_36334 = new class_4639(field_36292[23], "textures/gui/realms/cross_icon.png");
   private static final class_4639 field_36352 = new class_4639(field_36292[23], "textures/gui/realms/trial_icon.png");
   private static final class_4639 field_36350 = new class_4639("minecraft", "textures/gui/widgets.png");
   private static final ITextComponent field_36333 = new TranslationTextComponent("mco.invites.nopending");
   private static final ITextComponent field_36344 = new TranslationTextComponent("mco.invites.pending");
   private static final List<ITextComponent> field_36323 = ImmutableList.of(
      new TranslationTextComponent("mco.trial.message.line1"), new TranslationTextComponent("mco.trial.message.line2")
   );
   private static final ITextComponent field_36307 = new TranslationTextComponent("mco.selectServer.uninitialized");
   private static final ITextComponent field_36357 = new TranslationTextComponent("mco.selectServer.expiredList");
   private static final ITextComponent field_36362 = new TranslationTextComponent(field_36292[3]);
   private static final ITextComponent field_36336 = new TranslationTextComponent("mco.selectServer.expiredTrial");
   private static final ITextComponent field_36360 = new TranslationTextComponent("mco.selectServer.expiredSubscribe");
   private static final ITextComponent field_36293 = new TranslationTextComponent("mco.selectServer.minigame").appendString(" ");
   private static final ITextComponent field_36329 = new TranslationTextComponent("mco.selectServer.popup");
   private static final ITextComponent field_36349 = new TranslationTextComponent("mco.selectServer.expired");
   private static final ITextComponent field_36315 = new TranslationTextComponent("mco.selectServer.expires.soon");
   private static final ITextComponent field_36296 = new TranslationTextComponent("mco.selectServer.expires.day");
   private static final ITextComponent field_36348 = new TranslationTextComponent("mco.selectServer.open");
   private static final ITextComponent field_36321 = new TranslationTextComponent("mco.selectServer.closed");
   private static final ITextComponent field_36298 = new TranslationTextComponent(field_36292[0]);
   private static final ITextComponent field_36341 = new TranslationTextComponent(field_36292[1]);
   private static final ITextComponent field_36339 = new TranslationTextComponent("mco.selectServer.info");
   private static final ITextComponent field_36368 = new TranslationTextComponent("mco.news");
   private static List<class_4639> field_36363 = ImmutableList.of();
   private static final class_8264 field_36302 = new class_8264();
   private static boolean field_36345;
   private static int field_36356 = -1;
   private static volatile boolean field_36290;
   private static volatile boolean field_36297;
   private static volatile boolean field_36351;
   public static Screen field_36337;
   private static boolean field_36366;
   private final RateLimiter field_36355;
   private boolean field_36347;
   private final Screen field_36314;
   private volatile class_2311 field_36346;
   private long field_36310 = -1L;
   private class_9521 field_36294;
   private class_9521 field_36354;
   private class_9521 field_36365;
   private class_9521 field_36327;
   private class_9521 field_36359;
   private List<ITextComponent> field_36312;
   private List<class_7675> field_36361 = Lists.newArrayList();
   private volatile int field_36304;
   private int field_36364;
   private boolean field_36332;
   private boolean field_36330;
   private boolean field_36342;
   private volatile boolean field_36291;
   private volatile boolean field_36301;
   private volatile boolean field_36308;
   private volatile boolean field_36320;
   private volatile String field_36338;
   private int field_36289;
   private int field_36324;
   private boolean field_36340;
   private List<class_8117> field_36326;
   private int field_36311;
   private ReentrantLock field_36300 = new ReentrantLock();
   private class_416 field_36295 = class_416.field_1766;
   private class_270 field_36322;
   private class_9521 field_36335;
   private class_9521 field_36358;
   private class_9521 field_36305;
   private class_9521 field_36325;
   private class_9521 field_36319;
   private class_9521 field_36303;

   public class_7039(Screen var1) {
      this.field_36314 = var1;
      this.field_36355 = RateLimiter.create(0.016666668F);
   }

   private boolean method_32334() {
      if (!method_32256() || !this.field_36332) {
         return false;
      } else if (this.field_36291 && !this.field_36301) {
         return true;
      } else {
         for (class_7675 var4 : this.field_36361) {
            if (var4.field_39014.equals(this.field_943.method_8502().method_5367())) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method_32211() {
      if (!method_32256() || !this.field_36332) {
         return false;
      } else if (this.field_36330) {
         return true;
      } else {
         return this.field_36291 && !this.field_36301 && this.field_36361.isEmpty() ? true : this.field_36361.isEmpty();
      }
   }

   @Override
   public void method_1163() {
      this.field_36326 = Lists.newArrayList(
         new class_8117[]{
            new class_8117(new char[]{'3', '2', '1', '4', '5', '6'}, () -> field_36345 = !field_36345),
            new class_8117(new char[]{'9', '8', '7', '1', '2', '3'}, () -> {
               if (class_176.field_588 != class_4494.field_21972) {
                  this.method_32251();
               } else {
                  this.method_32302();
               }
            }),
            new class_8117(new char[]{'9', '8', '7', '4', '5', '6'}, () -> {
               if (class_176.field_588 != class_4494.field_21974) {
                  this.method_32277();
               } else {
                  this.method_32302();
               }
            })
         }
      );
      if (field_36337 == null) {
         this.field_36300 = new ReentrantLock();
         if (field_36351 && !method_32256()) {
            this.method_32230();
         }

         this.method_32219();
         this.method_32218();
         if (!this.field_36347) {
            this.field_943.method_8509(false);
         }

         this.field_943.field_9600.method_38887(true);
         if (method_32256()) {
            field_36302.method_38094();
         }

         this.field_36308 = false;
         if (method_32256() && this.field_36332) {
            this.method_32326();
         }

         this.field_36346 = new class_2311(this);
         if (field_36356 != -1) {
            this.field_36346.method_36222((double)field_36356);
         }

         this.<class_2311>method_1159(this.field_36346);
         this.method_41184(this.field_36346);
         this.field_36295 = class_416.method_2075(this.field_948, field_36329, 100);
      } else {
         this.field_943.method_8609(field_36337);
      }
   }

   private static boolean method_32256() {
      return field_36297 && field_36290;
   }

   public void method_32326() {
      this.field_36359 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 202,
            this.field_940 - 32,
            90,
            20,
            new TranslationTextComponent("mco.selectServer.leave"),
            var1 -> this.method_32292(this.method_32331(this.field_36310))
         )
      );
      this.field_36327 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 190,
            this.field_940 - 32,
            90,
            20,
            new TranslationTextComponent("mco.selectServer.configure"),
            var1 -> this.method_32273(this.method_32331(this.field_36310))
         )
      );
      this.field_36294 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 93, this.field_940 - 32, 90, 20, new TranslationTextComponent("mco.selectServer.play"), var1 -> {
            class_7675 var4 = this.method_32331(this.field_36310);
            if (var4 != null) {
               this.method_32260(var4, this);
            }
         })
      );
      this.field_36354 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 + 4, this.field_940 - 32, 90, 20, class_1402.field_7632, var1 -> {
         if (!this.field_36342) {
            this.field_943.method_8609(this.field_36314);
         }
      }));
      this.field_36365 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 + 100, this.field_940 - 32, 90, 20, new TranslationTextComponent("mco.selectServer.expiredRenew"), var1 -> this.method_32347()
         )
      );
      this.field_36358 = this.<class_9521>method_1186(new class_988(this));
      this.field_36305 = this.<class_9521>method_1186(new class_1495(this));
      this.field_36335 = this.<class_9521>method_1186(new class_1435(this));
      this.field_36303 = this.<class_9521>method_1186(new class_8004(this));
      this.field_36325 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 52, this.method_32244() + 137 - 20, 98, 20, new TranslationTextComponent("mco.selectServer.trial"), var1 -> {
            if (this.field_36291 && !this.field_36301) {
               class_9665.method_44667().method_37581("https://aka.ms/startjavarealmstrial");
               this.field_943.method_8609(this.field_36314);
            }
         })
      );
      this.field_36319 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 + 52,
            this.method_32244() + 160 - 20,
            98,
            20,
            new TranslationTextComponent("mco.selectServer.buy"),
            var0 -> class_9665.method_44667().method_37581("https://aka.ms/BuyJavaRealms")
         )
      );
      class_7675 var3 = this.method_32331(this.field_36310);
      this.method_32238(var3);
   }

   private void method_32238(class_7675 var1) {
      this.field_36294.field_36675 = this.method_32259(var1) && !this.method_32211();
      this.field_36365.field_36677 = this.method_32257(var1);
      this.field_36327.field_36677 = this.method_32327(var1);
      this.field_36359.field_36677 = this.method_32296(var1);
      boolean var4 = this.method_32211() && this.field_36291 && !this.field_36301;
      this.field_36325.field_36677 = var4;
      this.field_36325.field_36675 = var4;
      this.field_36319.field_36677 = this.method_32211();
      this.field_36303.field_36677 = this.method_32211() && this.field_36330;
      this.field_36365.field_36675 = !this.method_32211();
      this.field_36327.field_36675 = !this.method_32211();
      this.field_36359.field_36675 = !this.method_32211();
      this.field_36305.field_36675 = true;
      this.field_36358.field_36675 = true;
      this.field_36354.field_36675 = true;
      this.field_36335.field_36675 = !this.method_32211();
   }

   private boolean method_32224() {
      return (!this.method_32211() || this.field_36330) && method_32256() && this.field_36332;
   }

   private boolean method_32259(class_7675 var1) {
      return var1 != null && !var1.field_39020 && var1.field_39004 == class_6804.field_35061;
   }

   private boolean method_32257(class_7675 var1) {
      return var1 != null && var1.field_39020 && this.method_32315(var1);
   }

   private boolean method_32327(class_7675 var1) {
      return var1 != null && this.method_32315(var1);
   }

   private boolean method_32296(class_7675 var1) {
      return var1 != null && !this.method_32315(var1);
   }

   @Override
   public void method_5312() {
      super.method_5312();
      this.field_36342 = false;
      this.field_36364++;
      this.field_36311--;
      if (this.field_36311 < 0) {
         this.field_36311 = 0;
      }

      if (method_32256()) {
         field_36302.method_38110();
         if (field_36302.method_38103(class_2845.field_13948)) {
            List var3 = field_36302.method_38098();
            this.field_36346.method_33486();
            boolean var4 = !this.field_36332;
            if (var4) {
               this.field_36332 = true;
            }

            if (var3 != null) {
               boolean var5 = false;

               for (class_7675 var7 : var3) {
                  if (this.method_32340(var7)) {
                     var5 = true;
                  }
               }

               this.field_36361 = var3;
               if (this.method_32334()) {
                  this.field_36346.method_10630(new class_9780(this, null));
               }

               for (class_7675 var14 : this.field_36361) {
                  this.field_36346.method_33483(new class_9183(this, var14));
               }

               if (!field_36366 && var5) {
                  field_36366 = true;
                  this.method_32294();
               }
            }

            if (var4) {
               this.method_32326();
            }
         }

         if (field_36302.method_38103(class_2845.field_13950)) {
            this.field_36304 = field_36302.method_38101();
            if (this.field_36304 > 0 && this.field_36355.tryAcquire(1)) {
               class_7567.method_34410(class_6956.method_31803("mco.configure.world.invite.narration", this.field_36304));
            }
         }

         if (field_36302.method_38103(class_2845.field_13952) && !this.field_36301) {
            boolean var8 = field_36302.method_38089();
            if (var8 != this.field_36291 && this.method_32211()) {
               this.field_36291 = var8;
               this.field_36308 = false;
            } else {
               this.field_36291 = var8;
            }
         }

         if (field_36302.method_38103(class_2845.field_13947)) {
            class_8793 var9 = field_36302.method_38109();

            for (class_8434 var11 : var9.field_44989) {
               for (class_7675 var15 : this.field_36361) {
                  if (var15.field_39016 == var11.field_43161) {
                     var15.method_34782(var11);
                     break;
                  }
               }
            }
         }

         if (field_36302.method_38103(class_2845.field_13949)) {
            this.field_36320 = field_36302.method_38105();
            this.field_36338 = field_36302.method_38099();
         }

         field_36302.method_38084();
         if (this.method_32211()) {
            this.field_36324++;
         }

         if (this.field_36335 != null) {
            this.field_36335.field_36677 = this.method_32224();
         }
      }
   }

   private void method_32294() {
      new Thread(() -> {
         List var3 = class_4669.method_21603();
         class_176 var4 = class_176.method_777();
         class_9292 var5 = new class_9292();
         var5.field_47398 = var3;
         var5.field_47399 = this.method_32258();

         try {
            var4.method_787(var5);
         } catch (Throwable var7) {
            field_36287.warn("Could not send ping result to Realms: ", var7);
         }
      }).start();
   }

   private List<Long> method_32258() {
      ArrayList var3 = Lists.newArrayList();

      for (class_7675 var5 : this.field_36361) {
         if (this.method_32340(var5)) {
            var3.add(var5.field_39016);
         }
      }

      return var3;
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
      this.method_32266();
   }

   private void method_32347() {
      class_7675 var3 = this.method_32331(this.field_36310);
      if (var3 != null) {
         String var4 = "https://aka.ms/ExtendJavaRealms?subscriptionId="
            + var3.field_39001
            + "&profileId="
            + this.field_943.method_8502().method_5367()
            + "&ref="
            + (!var3.field_39005 ? "expiredRealm" : "expiredTrial");
         this.field_943.field_9600.method_38891(var4);
         class_9665.method_44667().method_37581(var4);
      }
   }

   private void method_32219() {
      if (!field_36351) {
         field_36351 = true;
         new class_1245(this, "MCO Compatability Checker #1").start();
      }
   }

   private void method_32218() {
   }

   private void method_32230() {
      new class_1271(this, "MCO Compatability Checker #1").start();
   }

   private void method_32251() {
      if (class_176.field_588 != class_4494.field_21972) {
         new class_6739(this, "MCO Stage Availability Checker #1").start();
      }
   }

   private void method_32277() {
      if (class_176.field_588 != class_4494.field_21974) {
         new class_1413(this, "MCO Local Availability Checker #1").start();
      }
   }

   private void method_32302() {
      class_176.method_781();
      field_36302.method_38094();
   }

   private void method_32266() {
      field_36302.method_38107();
   }

   private void method_32273(class_7675 var1) {
      if (this.field_943.method_8502().method_5367().equals(var1.field_39014) || field_36345) {
         this.method_32299();
         this.field_943.method_8609(new class_2866(this, var1.field_39016));
      }
   }

   private void method_32292(class_7675 var1) {
      if (var1 != null && !this.field_943.method_8502().method_5367().equals(var1.field_39014)) {
         this.method_32299();
         TranslationTextComponent var4 = new TranslationTextComponent("mco.configure.world.leave.question.line1");
         TranslationTextComponent var5 = new TranslationTextComponent("mco.configure.world.leave.question.line2");
         this.field_943.method_8609(new class_2238(this::method_32210, class_1542.field_8150, var4, var5, true));
      }
   }

   private void method_32299() {
      field_36356 = (int)this.field_36346.method_36228();
   }

   @Nullable
   private class_7675 method_32331(long var1) {
      for (class_7675 var6 : this.field_36361) {
         if (var6.field_39016 == var1) {
            return var6;
         }
      }

      return null;
   }

   private void method_32210(boolean var1) {
      if (var1) {
         new class_2859(this, "Realms-leave-server").start();
      }

      this.field_943.method_8609(this);
   }

   private void method_32333(class_7675 var1) {
      field_36302.method_38108(var1);
      this.field_36361.remove(var1);
      this.field_36346
         .method_41183()
         .removeIf(var1x -> var1x instanceof class_9183 && class_9183.method_42324((class_9183)var1x).field_39016 == this.field_36310);
      this.field_36346.method_10629((class_7651)null);
      this.method_32238((class_7675)null);
      this.field_36310 = -1L;
      this.field_36294.field_36675 = false;
   }

   public void method_32314() {
      this.field_36310 = -1L;
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.field_36326.forEach(class_8117::method_36939);
         this.method_32317();
         return true;
      }
   }

   private void method_32317() {
      if (this.method_32211() && this.field_36330) {
         this.field_36330 = false;
      } else {
         this.field_943.method_8609(this.field_36314);
      }
   }

   @Override
   public boolean method_26938(char var1, int var2) {
      this.field_36326.forEach(var1x -> var1x.method_36940(var1));
      return true;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.field_36322 = class_270.field_972;
      this.field_36312 = null;
      this.method_1183(var1);
      this.field_36346.method_6767(var1, var2, var3, var4);
      this.method_32262(var1, this.field_941 / 2 - 50, 7);
      if (class_176.field_588 == class_4494.field_21972) {
         this.method_32310(var1);
      }

      if (class_176.field_588 == class_4494.field_21974) {
         this.method_32338(var1);
      }

      if (!this.method_32211()) {
         if (this.field_36308) {
            this.method_32238((class_7675)null);
            if (!this.field_942.contains(this.field_36346)) {
               this.field_942.add(this.field_36346);
            }

            class_7675 var7 = this.method_32331(this.field_36310);
            this.field_36294.field_36675 = this.method_32259(var7);
         }

         this.field_36308 = false;
      } else {
         this.method_32321(var1, var2, var3);
      }

      super.method_6767(var1, var2, var3, var4);
      if (this.field_36312 != null) {
         this.method_32249(var1, this.field_36312, var2, var3);
      }

      if (this.field_36291 && !this.field_36301 && this.method_32211()) {
         this.field_943.method_8577().method_35674(field_36352);
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         byte var10 = 8;
         byte var8 = 8;
         byte var9 = 0;
         if ((class_9665.method_44650() / 800L & 1L) == 1L) {
            var9 = 8;
         }

         class_2089.method_9778(
            var1,
            this.field_36325.field_36670 + this.field_36325.method_32699() - 8 - 4,
            this.field_36325.field_36674 + this.field_36325.method_32695() / 2 - 4,
            0.0F,
            (float)var9,
            8,
            8,
            8,
            16
         );
      }
   }

   private void method_32262(class_7966 var1, int var2, int var3) {
      this.field_943.method_8577().method_35674(field_36331);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_3542.method_16438();
      class_3542.method_16403(0.5F, 0.5F, 0.5F);
      class_2089.method_9778(var1, var2 * 2, var3 * 2 - 5, 0.0F, 0.0F, 200, 50, 200, 50);
      class_3542.method_16489();
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (this.method_32274(var1, var3) && this.field_36330) {
         this.field_36330 = false;
         this.field_36342 = true;
         return true;
      } else {
         return super.method_26940(var1, var3, var5);
      }
   }

   private boolean method_32274(double var1, double var3) {
      int var7 = this.method_32290();
      int var8 = this.method_32244();
      return var1 < (double)(var7 - 5) || var1 > (double)(var7 + 315) || var3 < (double)(var8 - 5) || var3 > (double)(var8 + 171);
   }

   private void method_32321(class_7966 var1, int var2, int var3) {
      int var6 = this.method_32290();
      int var7 = this.method_32244();
      if (!this.field_36308) {
         this.field_36289 = 0;
         this.field_36324 = 0;
         this.field_36340 = true;
         this.method_32238((class_7675)null);
         if (this.field_942.contains(this.field_36346)) {
            class_2311 var8 = this.field_36346;
            if (!this.field_942.remove(var8)) {
               field_36287.error("Unable to remove widget: " + var8);
            }
         }

         class_7567.method_34410(field_36329.getString());
      }

      if (this.field_36332) {
         this.field_36308 = true;
      }

      class_3542.method_16480(1.0F, 1.0F, 1.0F, 0.7F);
      class_3542.method_16488();
      this.field_943.method_8577().method_35674(field_36288);
      boolean var10 = false;
      byte var9 = 32;
      class_2089.method_9778(var1, 0, 32, 0.0F, 0.0F, this.field_941, this.field_940 - 40 - 32, 310, 166);
      class_3542.method_16448();
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.method_8577().method_35674(field_36353);
      class_2089.method_9778(var1, var6, var7, 0.0F, 0.0F, 310, 166, 310, 166);
      if (!field_36363.isEmpty()) {
         this.field_943.method_8577().method_35674(field_36363.get(this.field_36289));
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_2089.method_9778(var1, var6 + 7, var7 + 7, 0.0F, 0.0F, 195, 152, 195, 152);
         if (this.field_36324 % 95 >= 5) {
            this.field_36340 = false;
         } else if (!this.field_36340) {
            this.field_36289 = (this.field_36289 + 1) % field_36363.size();
            this.field_36340 = true;
         }
      }

      this.field_36295.method_2068(var1, this.field_941 / 2 + 52, var7 + 7, 10, 5000268);
   }

   private int method_32290() {
      return (this.field_941 - 310) / 2;
   }

   private int method_32244() {
      return this.field_940 / 2 - 80;
   }

   private void method_32240(class_7966 var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7) {
      int var10 = this.field_36304;
      boolean var11 = this.method_32272((double)var2, (double)var3);
      boolean var12 = var7 && var6;
      if (var12) {
         float var13 = 0.25F + (1.0F + class_9299.method_42818((float)this.field_36364 * 0.5F)) * 0.25F;
         int var14 = 0xFF000000 | (int)(var13 * 64.0F) << 16 | (int)(var13 * 64.0F) << 8 | (int)(var13 * 64.0F) << 0;
         this.method_9772(var1, var4 - 2, var5 - 2, var4 + 18, var5 + 18, var14, var14);
         var14 = 0xFF000000 | (int)(var13 * 255.0F) << 16 | (int)(var13 * 255.0F) << 8 | (int)(var13 * 255.0F) << 0;
         this.method_9772(var1, var4 - 2, var5 - 2, var4 + 18, var5 - 1, var14, var14);
         this.method_9772(var1, var4 - 2, var5 - 2, var4 - 1, var5 + 18, var14, var14);
         this.method_9772(var1, var4 + 17, var5 - 2, var4 + 18, var5 + 18, var14, var14);
         this.method_9772(var1, var4 - 2, var5 + 17, var4 + 18, var5 + 18, var14, var14);
      }

      this.field_943.method_8577().method_35674(field_36299);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      boolean var20 = var7 && var6;
      float var22 = !var20 ? 0.0F : 16.0F;
      class_2089.method_9778(var1, var4, var5 - 6, var22, 0.0F, 15, 25, 31, 25);
      boolean var15 = var7 && var10 != 0;
      if (var15) {
         int var16 = (Math.min(var10, 6) - 1) * 8;
         int var17 = (int)(
            Math.max(0.0F, Math.max(class_9299.method_42818((float)(10 + this.field_36364) * 0.57F), class_9299.method_42840((float)this.field_36364 * 0.35F)))
               * -6.0F
         );
         this.field_943.method_8577().method_35674(field_36317);
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         float var18 = !var11 ? 0.0F : 8.0F;
         class_2089.method_9778(var1, var4 + 4, var5 + 4 + var17, (float)var16, var18, 8, 8, 48, 16);
      }

      int var23 = var2 + 12;
      boolean var24 = var7 && var11;
      if (var24) {
         ITextComponent var25 = var10 != 0 ? field_36344 : field_36333;
         int var19 = this.field_948.method_45379(var25);
         this.method_9772(var1, var23 - 3, var3 - 3, var23 + var19 + 3, var3 + 8 + 3, -1073741824, -1073741824);
         this.field_948.method_45392(var1, var25, (float)var23, (float)var3, -1);
      }
   }

   private boolean method_32272(double var1, double var3) {
      int var7 = this.field_941 / 2 + 50;
      int var8 = this.field_941 / 2 + 66;
      byte var9 = 11;
      byte var10 = 23;
      if (this.field_36304 != 0) {
         var7 -= 3;
         var8 += 3;
         var9 -= 5;
         var10 += 5;
      }

      return (double)var7 <= var1 && var1 <= (double)var8 && (double)var9 <= var3 && var3 <= (double)var10;
   }

   public void method_32260(class_7675 var1, Screen var2) {
      if (var1 != null) {
         try {
            if (!this.field_36300.tryLock(1L, TimeUnit.SECONDS)) {
               return;
            }

            if (this.field_36300.getHoldCount() > 1) {
               return;
            }
         } catch (InterruptedException var6) {
            return;
         }

         this.field_36347 = true;
         this.field_943.method_8609(new class_1065(var2, new class_3226(this, var2, var1, this.field_36300)));
      }
   }

   private boolean method_32315(class_7675 var1) {
      return var1.field_39014 != null && var1.field_39014.equals(this.field_943.method_8502().method_5367());
   }

   private boolean method_32340(class_7675 var1) {
      return this.method_32315(var1) && !var1.field_39020;
   }

   private void method_32283(class_7966 var1, int var2, int var3, int var4, int var5) {
      this.field_943.method_8577().method_35674(field_36369);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_2089.method_9778(var1, var2, var3, 0.0F, 0.0F, 10, 28, 10, 28);
      if (var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 27 && var5 < this.field_940 - 40 && var5 > 32 && !this.method_32211()) {
         this.method_32253(field_36349);
      }
   }

   private void method_32232(class_7966 var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_943.method_8577().method_35674(field_36309);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.field_36364 % 20 >= 10) {
         class_2089.method_9778(var1, var2, var3, 10.0F, 0.0F, 10, 28, 20, 28);
      } else {
         class_2089.method_9778(var1, var2, var3, 0.0F, 0.0F, 10, 28, 20, 28);
      }

      if (var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 27 && var5 < this.field_940 - 40 && var5 > 32 && !this.method_32211()) {
         if (var6 > 0) {
            if (var6 != 1) {
               this.method_32253(new TranslationTextComponent("mco.selectServer.expires.days", var6));
            } else {
               this.method_32253(field_36296);
            }
         } else {
            this.method_32253(field_36315);
         }
      }
   }

   private void method_32323(class_7966 var1, int var2, int var3, int var4, int var5) {
      this.field_943.method_8577().method_35674(field_36328);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_2089.method_9778(var1, var2, var3, 0.0F, 0.0F, 10, 28, 10, 28);
      if (var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 27 && var5 < this.field_940 - 40 && var5 > 32 && !this.method_32211()) {
         this.method_32253(field_36348);
      }
   }

   private void method_32213(class_7966 var1, int var2, int var3, int var4, int var5) {
      this.field_943.method_8577().method_35674(field_36318);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_2089.method_9778(var1, var2, var3, 0.0F, 0.0F, 10, 28, 10, 28);
      if (var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 27 && var5 < this.field_940 - 40 && var5 > 32 && !this.method_32211()) {
         this.method_32253(field_36321);
      }
   }

   private void method_32267(class_7966 var1, int var2, int var3, int var4, int var5) {
      boolean var8 = false;
      if (var4 >= var2 && var4 <= var2 + 28 && var5 >= var3 && var5 <= var3 + 28 && var5 < this.field_940 - 40 && var5 > 32 && !this.method_32211()) {
         var8 = true;
      }

      this.field_943.method_8577().method_35674(field_36306);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      float var9 = !var8 ? 0.0F : 28.0F;
      class_2089.method_9778(var1, var2, var3, var9, 0.0F, 28, 28, 56, 28);
      if (var8) {
         this.method_32253(field_36298);
         this.field_36322 = class_270.field_969;
      }
   }

   private void method_32255(class_7966 var1, int var2, int var3, int var4, int var5) {
      boolean var8 = false;
      if (var4 >= var2 && var4 <= var2 + 28 && var5 >= var3 && var5 <= var3 + 28 && var5 < this.field_940 - 40 && var5 > 32 && !this.method_32211()) {
         var8 = true;
      }

      this.field_943.method_8577().method_35674(field_36343);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      float var9 = !var8 ? 0.0F : 28.0F;
      class_2089.method_9778(var1, var2, var3, var9, 0.0F, 28, 28, 56, 28);
      if (var8) {
         this.method_32253(field_36341);
         this.field_36322 = class_270.field_970;
      }
   }

   public void method_32249(class_7966 var1, List<ITextComponent> var2, int var3, int var4) {
      if (!var2.isEmpty()) {
         byte var7 = 0;
         int var8 = 0;

         for (ITextComponent var10 : var2) {
            int var11 = this.field_948.method_45379(var10);
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
            this.method_9772(var1, var14 - 3, var13, var14 + var8 + 3, var15 + 8 + 3 + var7, -1073741824, -1073741824);
            this.field_948.method_45392(var1, var12, (float)var14, (float)(var15 + var7), 16777215);
            var7 += 10;
         }
      }
   }

   private void method_32227(class_7966 var1, int var2, int var3, int var4, int var5, boolean var6) {
      boolean var9 = false;
      if (var2 >= var4 && var2 <= var4 + 20 && var3 >= var5 && var3 <= var5 + 20) {
         var9 = true;
      }

      this.field_943.method_8577().method_35674(field_36316);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      float var10 = !var6 ? 0.0F : 20.0F;
      class_2089.method_9778(var1, var4, var5, var10, 0.0F, 20, 20, 40, 20);
      if (var9) {
         this.method_32253(field_36339);
      }
   }

   private void method_32269(class_7966 var1, int var2, int var3, boolean var4, int var5, int var6, boolean var7, boolean var8) {
      boolean var11 = false;
      if (var2 >= var5 && var2 <= var5 + 20 && var3 >= var6 && var3 <= var6 + 20) {
         var11 = true;
      }

      this.field_943.method_8577().method_35674(field_36367);
      if (!var8) {
         class_3542.method_16480(0.5F, 0.5F, 0.5F, 1.0F);
      } else {
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      }

      boolean var12 = var8 && var7;
      float var13 = !var12 ? 0.0F : 20.0F;
      class_2089.method_9778(var1, var5, var6, var13, 0.0F, 20, 20, 40, 20);
      if (var11 && var8) {
         this.method_32253(field_36368);
      }

      if (var4 && var8) {
         int var14 = !var11
            ? (int)(
               Math.max(
                     0.0F, Math.max(class_9299.method_42818((float)(10 + this.field_36364) * 0.57F), class_9299.method_42840((float)this.field_36364 * 0.35F))
                  )
                  * -6.0F
            )
            : 0;
         this.field_943.method_8577().method_35674(field_36317);
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_2089.method_9778(var1, var5 + 10, var6 + 2 + var14, 40.0F, 0.0F, 8, 8, 48, 16);
      }
   }

   private void method_32338(class_7966 var1) {
      String var4 = "LOCAL!";
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_3542.method_16438();
      class_3542.method_16413((float)(this.field_941 / 2 - 25), 20.0F, 0.0F);
      class_3542.method_16410(-20.0F, 0.0F, 0.0F, 1.0F);
      class_3542.method_16403(1.5F, 1.5F, 1.5F);
      this.field_948.method_45385(var1, "LOCAL!", 0.0F, 0.0F, 8388479);
      class_3542.method_16489();
   }

   private void method_32310(class_7966 var1) {
      String var4 = "STAGE!";
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_3542.method_16438();
      class_3542.method_16413((float)(this.field_941 / 2 - 25), 20.0F, 0.0F);
      class_3542.method_16410(-20.0F, 0.0F, 0.0F, 1.0F);
      class_3542.method_16403(1.5F, 1.5F, 1.5F);
      this.field_948.method_45385(var1, "STAGE!", 0.0F, 0.0F, -256);
      class_3542.method_16489();
   }

   public class_7039 method_32264() {
      class_7039 var3 = new class_7039(this.field_36314);
      var3.method_1164(this.field_943, this.field_941, this.field_940);
      return var3;
   }

   public static void method_32337(class_7832 var0) {
      Collection var3 = var0.method_35460("textures/gui/images", var0x -> var0x.endsWith(".png"));
      field_36363 = var3.stream().filter(var0x -> var0x.method_21461().equals("realms")).collect(ImmutableList.toImmutableList());
   }

   private void method_32253(ITextComponent... var1) {
      this.field_36312 = Arrays.<ITextComponent>asList(var1);
   }

   private void method_32339(class_9521 var1) {
      this.field_943.method_8609(new class_4502(this.field_36314));
   }
}
