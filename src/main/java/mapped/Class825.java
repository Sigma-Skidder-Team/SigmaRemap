package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.realmsclient.client.RealmsClient;
import com.mojang.realmsclient.dto.RealmsServer;
import com.mojang.realmsclient.exception.RealmsServiceException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.Util;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Class825 extends RealmsScreen {
   private static final Logger field4541 = LogManager.getLogger();
   private static final ITextComponent field4542 = new TranslationTextComponent("mco.configure.world.subscription.title");
   private static final ITextComponent field4543 = new TranslationTextComponent("mco.configure.world.subscription.start");
   private static final ITextComponent field4544 = new TranslationTextComponent("mco.configure.world.subscription.timeleft");
   private static final ITextComponent field4545 = new TranslationTextComponent("mco.configure.world.subscription.recurring.daysleft");
   private static final ITextComponent field4546 = new TranslationTextComponent("mco.configure.world.subscription.expired");
   private static final ITextComponent field4547 = new TranslationTextComponent("mco.configure.world.subscription.less_than_a_day");
   private static final ITextComponent field4548 = new TranslationTextComponent("mco.configure.world.subscription.month");
   private static final ITextComponent field4549 = new TranslationTextComponent("mco.configure.world.subscription.months");
   private static final ITextComponent field4550 = new TranslationTextComponent("mco.configure.world.subscription.day");
   private static final ITextComponent field4551 = new TranslationTextComponent("mco.configure.world.subscription.days");
   private final Screen field4552;
   private final RealmsServer field4553;
   private final Screen field4554;
   private ITextComponent field4555;
   private String field4556;
   private Class2144 field4557;

   public Class825(Screen var1, RealmsServer var2, Screen var3) {
      this.field4552 = var1;
      this.field4553 = var2;
      this.field4554 = var3;
   }

   @Override
   public void init() {
      this.method2442(this.field4553.field27443);
      Class9229.method34713(field4542.getString(), field4543.getString(), this.field4556, field4544.getString(), this.field4555.getString());
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.<Button>addButton(
         new Button(
            this.width / 2 - 100,
            method1929(6),
            200,
            20,
            new TranslationTextComponent("mco.configure.world.subscription.extend"),
            var1 -> {
               String var4 = "https://aka.ms/ExtendJavaRealms?subscriptionId="
                  + this.field4553.field27444
                  + "&profileId="
                  + this.mc.getSession().getPlayerID();
               this.mc.keyboardListener.method36350(var4);
               Util.getOSType().openLink(var4);
            }
         )
      );
      this.<Button>addButton(
         new Button(this.width / 2 - 100, method1929(12), 200, 20, DialogTexts.field30663, var1 -> this.mc.displayGuiScreen(this.field4552))
      );
      if (this.field4553.field27452) {
         this.<Button>addButton(
            new Button(this.width / 2 - 100, method1929(10), 200, 20, new TranslationTextComponent("mco.configure.world.delete.button"), var1 -> {
               TranslationTextComponent var4 = new TranslationTextComponent("mco.configure.world.delete.question.line1");
               TranslationTextComponent var5 = new TranslationTextComponent("mco.configure.world.delete.question.line2");
               this.mc.displayGuiScreen(new Class808(this::method2441, Class2134.field13979, var4, var5, true));
            })
         );
      }
   }

   private void method2441(boolean var1) {
      if (var1) {
         new Class378(this, "Realms-delete-realm").start();
      }

      this.mc.displayGuiScreen(this);
   }

   private void method2442(long var1) {
      RealmsClient var5 = RealmsClient.method14543();

      try {
         Class6121 var6 = var5.method14571(var1);
         this.field4555 = this.method2444(var6.field27407);
         this.field4556 = method2443(var6.field27406);
         this.field4557 = var6.field27408;
      } catch (RealmsServiceException var7) {
         field4541.error("Couldn't get subscription");
         this.mc.displayGuiScreen(new Class821(var7, this.field4552));
      }
   }

   private static String method2443(long var0) {
      GregorianCalendar var4 = new GregorianCalendar(TimeZone.getDefault());
      var4.setTimeInMillis(var0);
      return DateFormat.getDateTimeInstance().format(var4.getTime());
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.keyPressed(var1, var2, var3);
      } else {
         this.mc.displayGuiScreen(this.field4552);
         return true;
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      int var7 = this.width / 2 - 100;
      drawCenteredString(var1, this.font, field4542, this.width / 2, 17, 16777215);
      this.font.func_243248_b(var1, field4543, (float)var7, (float)method1929(0), 10526880);
      this.font.method38801(var1, this.field4556, (float)var7, (float)method1929(1), 16777215);
      if (this.field4557 != Class2144.field14031) {
         if (this.field4557 == Class2144.field14032) {
            this.font.func_243248_b(var1, field4545, (float)var7, (float)method1929(3), 10526880);
         }
      } else {
         this.font.func_243248_b(var1, field4544, (float)var7, (float)method1929(3), 10526880);
      }

      this.font.func_243248_b(var1, this.field4555, (float)var7, (float)method1929(4), 16777215);
      super.render(var1, var2, var3, var4);
   }

   private ITextComponent method2444(int var1) {
      if (var1 < 0 && this.field4553.field27452) {
         return field4546;
      } else if (var1 > 1) {
         int var4 = var1 / 30;
         int var5 = var1 % 30;
         StringTextComponent var6 = new StringTextComponent("");
         if (var4 > 0) {
            var6.appendString(Integer.toString(var4)).appendString(" ");
            if (var4 != 1) {
               var6.append(field4549);
            } else {
               var6.append(field4548);
            }
         }

         if (var5 > 0) {
            if (var4 > 0) {
               var6.appendString(", ");
            }

            var6.appendString(Integer.toString(var5)).appendString(" ");
            if (var5 != 1) {
               var6.append(field4551);
            } else {
               var6.append(field4550);
            }
         }

         return var6;
      } else {
         return field4547;
      }
   }

   // $VF: synthetic method
   public static RealmsServer method2448(Class825 var0) {
      return var0.field4553;
   }

   // $VF: synthetic method
   public static Logger method2449() {
      return field4541;
   }

   // $VF: synthetic method
   public static Minecraft method2450(Class825 var0) {
      return var0.mc;
   }

   // $VF: synthetic method
   public static Screen method2451(Class825 var0) {
      return var0.field4554;
   }

   // $VF: synthetic method
   public static Minecraft method2452(Class825 var0) {
      return var0.mc;
   }
}
