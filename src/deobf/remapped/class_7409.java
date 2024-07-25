package remapped;

import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7409 extends class_1094 {
   private static final Logger field_37817 = LogManager.getLogger();
   private static final ITextComponent field_37834 = new TranslationTextComponent("mco.configure.world.subscription.title");
   private static final ITextComponent field_37825 = new TranslationTextComponent("mco.configure.world.subscription.start");
   private static final ITextComponent field_37818 = new TranslationTextComponent("mco.configure.world.subscription.timeleft");
   private static final ITextComponent field_37832 = new TranslationTextComponent("mco.configure.world.subscription.recurring.daysleft");
   private static final ITextComponent field_37831 = new TranslationTextComponent("mco.configure.world.subscription.expired");
   private static final ITextComponent field_37821 = new TranslationTextComponent("mco.configure.world.subscription.less_than_a_day");
   private static final ITextComponent field_37826 = new TranslationTextComponent("mco.configure.world.subscription.month");
   private static final ITextComponent field_37819 = new TranslationTextComponent("mco.configure.world.subscription.months");
   private static final ITextComponent field_37827 = new TranslationTextComponent("mco.configure.world.subscription.day");
   private static final ITextComponent field_37820 = new TranslationTextComponent("mco.configure.world.subscription.days");
   private final Screen field_37823;
   private final class_7675 field_37833;
   private final Screen field_37828;
   private ITextComponent field_37830;
   private String field_37824;
   private class_8489 field_37822;

   public class_7409(Screen var1, class_7675 var2, Screen var3) {
      this.field_37823 = var1;
      this.field_37833 = var2;
      this.field_37828 = var3;
   }

   @Override
   public void method_1163() {
      this.method_33766(this.field_37833.field_39016);
      class_7567.method_34408(field_37834.getString(), field_37825.getString(), this.field_37824, field_37818.getString(), this.field_37830.getString());
      this.field_943.field_9600.method_38887(true);
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100,
            method_4819(6),
            200,
            20,
            new TranslationTextComponent("mco.configure.world.subscription.extend"),
            var1 -> {
               String var4 = "https://aka.ms/ExtendJavaRealms?subscriptionId="
                  + this.field_37833.field_39001
                  + "&profileId="
                  + this.field_943.method_8502().method_5367();
               this.field_943.field_9600.method_38891(var4);
               class_9665.method_44667().method_37581(var4);
            }
         )
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, method_4819(12), 200, 20, class_1402.field_7632, var1 -> this.field_943.method_8609(this.field_37823))
      );
      if (this.field_37833.field_39020) {
         this.<class_9521>method_1186(
            new class_9521(this.field_941 / 2 - 100, method_4819(10), 200, 20, new TranslationTextComponent("mco.configure.world.delete.button"), var1 -> {
               TranslationTextComponent var4 = new TranslationTextComponent("mco.configure.world.delete.question.line1");
               TranslationTextComponent var5 = new TranslationTextComponent("mco.configure.world.delete.question.line2");
               this.field_943.method_8609(new class_2238(this::method_33759, class_1542.field_8153, var4, var5, true));
            })
         );
      }
   }

   private void method_33759(boolean var1) {
      if (var1) {
         new class_5563(this, "Realms-delete-realm").start();
      }

      this.field_943.method_8609(this);
   }

   private void method_33766(long var1) {
      class_176 var5 = class_176.method_777();

      try {
         class_8018 var6 = var5.method_793(var1);
         this.field_37830 = this.method_33762(var6.field_41063);
         this.field_37824 = method_33761(var6.field_41061);
         this.field_37822 = var6.field_41062;
      } catch (class_3900 var7) {
         field_37817.error("Couldn't get subscription");
         this.field_943.method_8609(new class_9306(var7, this.field_37823));
      }
   }

   private static String method_33761(long var0) {
      GregorianCalendar var4 = new GregorianCalendar(TimeZone.getDefault());
      var4.setTimeInMillis(var0);
      return DateFormat.getDateTimeInstance().format(var4.getTime());
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.field_943.method_8609(this.field_37823);
         return true;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      int var7 = this.field_941 / 2 - 100;
      method_9788(var1, this.field_948, field_37834, this.field_941 / 2, 17, 16777215);
      this.field_948.method_45378(var1, field_37825, (float)var7, (float)method_4819(0), 10526880);
      this.field_948.method_45385(var1, this.field_37824, (float)var7, (float)method_4819(1), 16777215);
      if (this.field_37822 != class_8489.field_43492) {
         if (this.field_37822 == class_8489.field_43495) {
            this.field_948.method_45378(var1, field_37832, (float)var7, (float)method_4819(3), 10526880);
         }
      } else {
         this.field_948.method_45378(var1, field_37818, (float)var7, (float)method_4819(3), 10526880);
      }

      this.field_948.method_45378(var1, this.field_37830, (float)var7, (float)method_4819(4), 16777215);
      super.method_6767(var1, var2, var3, var4);
   }

   private ITextComponent method_33762(int var1) {
      if (var1 < 0 && this.field_37833.field_39020) {
         return field_37831;
      } else if (var1 > 1) {
         int var4 = var1 / 30;
         int var5 = var1 % 30;
         StringTextComponent var6 = new StringTextComponent("");
         if (var4 > 0) {
            var6.appendString(Integer.toString(var4)).appendString(" ");
            if (var4 != 1) {
               var6.append(field_37819);
            } else {
               var6.append(field_37826);
            }
         }

         if (var5 > 0) {
            if (var4 > 0) {
               var6.appendString(", ");
            }

            var6.appendString(Integer.toString(var5)).appendString(" ");
            if (var5 != 1) {
               var6.append(field_37820);
            } else {
               var6.append(field_37827);
            }
         }

         return var6;
      } else {
         return field_37821;
      }
   }
}
