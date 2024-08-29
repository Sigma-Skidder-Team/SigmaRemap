package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Class825 extends Class798 {
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
   private final Class6128 field4553;
   private final Screen field4554;
   private ITextComponent field4555;
   private String field4556;
   private Class2144 field4557;

   public Class825(Screen var1, Class6128 var2, Screen var3) {
      this.field4552 = var1;
      this.field4553 = var2;
      this.field4554 = var3;
   }

   @Override
   public void method1921() {
      this.method2442(this.field4553.field27443);
      Class9229.method34713(field4542.getString(), field4543.getString(), this.field4556, field4544.getString(), this.field4555.getString());
      this.field4562.keyboardListener.method36347(true);
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 100,
            method1929(6),
            200,
            20,
            new TranslationTextComponent("mco.configure.world.subscription.extend"),
            var1 -> {
               String var4 = "https://aka.ms/ExtendJavaRealms?subscriptionId="
                  + this.field4553.field27444
                  + "&profileId="
                  + this.field4562.getSession().getPlayerID();
               this.field4562.keyboardListener.method36350(var4);
               Util.getOSType().method8181(var4);
            }
         )
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 100, method1929(12), 200, 20, DialogTexts.field30663, var1 -> this.field4562.displayGuiScreen(this.field4552))
      );
      if (this.field4553.field27452) {
         this.<Class1206>method2455(
            new Class1206(this.field4564 / 2 - 100, method1929(10), 200, 20, new TranslationTextComponent("mco.configure.world.delete.button"), var1 -> {
               TranslationTextComponent var4 = new TranslationTextComponent("mco.configure.world.delete.question.line1");
               TranslationTextComponent var5 = new TranslationTextComponent("mco.configure.world.delete.question.line2");
               this.field4562.displayGuiScreen(new Class808(this::method2441, Class2134.field13979, var4, var5, true));
            })
         );
      }
   }

   private void method2441(boolean var1) {
      if (var1) {
         new Class378(this, "Realms-delete-realm").start();
      }

      this.field4562.displayGuiScreen(this);
   }

   private void method2442(long var1) {
      Class4624 var5 = Class4624.method14543();

      try {
         Class6121 var6 = var5.method14571(var1);
         this.field4555 = this.method2444(var6.field27407);
         this.field4556 = method2443(var6.field27406);
         this.field4557 = var6.field27408;
      } catch (Class2435 var7) {
         field4541.error("Couldn't get subscription");
         this.field4562.displayGuiScreen(new Class821(var7, this.field4552));
      }
   }

   private static String method2443(long var0) {
      GregorianCalendar var4 = new GregorianCalendar(TimeZone.getDefault());
      var4.setTimeInMillis(var0);
      return DateFormat.getDateTimeInstance().format(var4.getTime());
   }

   @Override
   public void onClose() {
      this.field4562.keyboardListener.method36347(false);
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.field4562.displayGuiScreen(this.field4552);
         return true;
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      int var7 = this.field4564 / 2 - 100;
      method5691(var1, this.field4568, field4542, this.field4564 / 2, 17, 16777215);
      this.field4568.method38805(var1, field4543, (float)var7, (float)method1929(0), 10526880);
      this.field4568.method38801(var1, this.field4556, (float)var7, (float)method1929(1), 16777215);
      if (this.field4557 != Class2144.field14031) {
         if (this.field4557 == Class2144.field14032) {
            this.field4568.method38805(var1, field4545, (float)var7, (float)method1929(3), 10526880);
         }
      } else {
         this.field4568.method38805(var1, field4544, (float)var7, (float)method1929(3), 10526880);
      }

      this.field4568.method38805(var1, this.field4555, (float)var7, (float)method1929(4), 16777215);
      super.method1923(var1, var2, var3, var4);
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
   public static Class6128 method2448(Class825 var0) {
      return var0.field4553;
   }

   // $VF: synthetic method
   public static Logger method2449() {
      return field4541;
   }

   // $VF: synthetic method
   public static Minecraft method2450(Class825 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Screen method2451(Class825 var0) {
      return var0.field4554;
   }

   // $VF: synthetic method
   public static Minecraft method2452(Class825 var0) {
      return var0.field4562;
   }
}
