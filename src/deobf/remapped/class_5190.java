package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_5190 {
   public class_1893 field_26705 = class_1893.method_8510();

   @class_9148
   private void method_23849(class_139 var1) {
      if (this.field_26705.method_8530() != null) {
         if (var1.method_557() instanceof class_5182) {
            class_5182 var4 = (class_5182)var1.method_557();
            ArrayList var5 = new ArrayList<String>(
               Arrays.asList(
                  "You are permanently banned from MinemenClub. ",
                  "Your connection to the server leu-practice has been prevented due to you being associated to a blacklisted player.",
                  "You are blacklisted from MinemenClub. "
               )
            );
            if (!var4.method_23768().getSiblings().isEmpty()
               && var5.contains(var4.method_23768().getString())
               && var4.method_23768().getSiblings().get(0).getStyle().getColor().toString().equalsIgnoreCase("red")) {
               class_7309 var6 = SigmaMainClass.method_3328().method_3303().method_39912();
               if (var6 != null) {
                  class_5933 var7 = new class_5933(this.field_26705.method_8530().field_12675, new Date(Long.MAX_VALUE));
                  var6.method_33331(var7);
                  SigmaMainClass.method_3328().method_3303().method_39911(var6);
                  SigmaMainClass.method_3328().method_3303().method_39909();
               }
            }
         }

         if (!(var1.method_557() instanceof class_2261)) {
            if (!(var1.method_557() instanceof class_7957)) {
               if (var1.method_557() instanceof class_1490) {
                  long var11 = System.currentTimeMillis();
                  if (this.field_26705.method_8530() == null) {
                     return;
                  }

                  class_5933 var15 = new class_5933(this.field_26705.method_8530().field_12675, new Date(var11));
                  class_7309 var16 = SigmaMainClass.method_3328().method_3303().method_39912();
                  if (var16 != null) {
                     var16.method_33331(var15);
                     SigmaMainClass.method_3328().method_3303().method_39911(var16);
                     SigmaMainClass.method_3328().method_3303().method_39909();
                  }
               }
            } else {
               class_7957 var13 = (class_7957)var1.method_557();
               long var8 = this.method_23846(var13.method_35999().getString());
               if (var8 == 0L) {
                  return;
               }

               class_5933 var17 = new class_5933(this.field_26705.method_8530().field_12675, new Date(var8));
               class_7309 var10 = SigmaMainClass.method_3328().method_3303().method_39912();
               if (var10 != null) {
                  var10.method_33331(var17);
                  SigmaMainClass.method_3328().method_3303().method_39911(var10);
                  SigmaMainClass.method_3328().method_3303().method_39909();
               }
            }
         } else {
            class_2261 var14 = (class_2261)var1.method_557();
            long var19 = this.method_23846(var14.method_10386().getString());
            if (var19 == 0L) {
               return;
            }

            class_5933 var18 = new class_5933(this.field_26705.method_8530().field_12675, new Date(var19));
            class_7309 var20 = SigmaMainClass.method_3328().method_3303().method_39912();
            if (var20 != null) {
               var20.method_33331(var18);
               SigmaMainClass.method_3328().method_3303().method_39911(var20);
               SigmaMainClass.method_3328().method_3303().method_39909();
            }
         }
      }
   }

   private long method_23846(String var1) {
      var1 = var1.toLowerCase();
      if (var1.contains("security") && var1.contains("alert")) {
         return 9223372036854775806L;
      } else if (!var1.contains("permanent")) {
         if (!var1.contains("your account has been suspended from")) {
            if (!var1.contains("tu cuenta ha sido suspendida. al reconectarte, tendr")) {
               if (!var1.contains("compromised")) {
                  if (!var1.contains("gebannt")) {
                     long var4 = TimeUnit.DAYS.toMillis((long)this.method_23847(var1));
                     long var6 = TimeUnit.HOURS.toMillis((long)this.method_23845(var1));
                     long var8 = TimeUnit.MINUTES.toMillis((long)this.method_23850(var1));
                     long var10 = TimeUnit.SECONDS.toMillis((long)this.method_23848(var1));
                     if (var1.contains("§6 sentinel caught you cheating! (anticheat)") && var4 == 0L && var6 == 0L && var8 == 0L && var10 != 0L) {
                     }

                     return var1.contains("vous avez été banni") && var4 == 0L && var6 == 0L && var8 == 0L && var10 == 0L
                        ? Long.MAX_VALUE
                        : System.currentTimeMillis() + var4 + var6 + var8 + var10;
                  } else {
                     return Long.MAX_VALUE;
                  }
               } else {
                  return 9223372036854775806L;
               }
            } else {
               return Long.MAX_VALUE;
            }
         } else {
            return Long.MAX_VALUE;
         }
      } else {
         return Long.MAX_VALUE;
      }
   }

   private int method_23847(String var1) {
      String[] var4 = new String[]{"day", "jour", "tage", "día", "dia"};

      for (String var8 : var4) {
         Pattern var9 = Pattern.compile("([0-9]+)(?:d| " + var8 + "s|" + var8 + "s| " + var8 + "|" + var8 + ")[ |\\n]");
         Matcher var10 = var9.matcher(var1);
         if (var10.find()) {
            return Integer.parseInt(var10.group(1));
         }
      }

      return 0;
   }

   private int method_23845(String var1) {
      String[] var4 = new String[]{"hour", "heure", "uhr", "hora"};

      for (String var8 : var4) {
         Pattern var9 = Pattern.compile("([0-9]+)(?:h| " + var8 + "s|" + var8 + "s| " + var8 + "|" + var8 + ")[ |\\n]");
         Matcher var10 = var9.matcher(var1);
         if (var10.find()) {
            return Integer.parseInt(var10.group(1));
         }
      }

      return 0;
   }

   private int method_23850(String var1) {
      String[] var4 = new String[]{"minute", "min", "minuto", "mínuto"};

      for (String var8 : var4) {
         Pattern var9 = Pattern.compile("([0-9]+)(?:m| " + var8 + "s|" + var8 + "s| " + var8 + "|" + var8 + ")[ |\\n]");
         Matcher var10 = var9.matcher(var1);
         if (var10.find()) {
            return Integer.parseInt(var10.group(1));
         }
      }

      return 0;
   }

   private int method_23848(String var1) {
      String[] var4 = new String[]{"second", "sec", "seconde", "sekunde", "segundo"};

      for (String var8 : var4) {
         Pattern var9 = Pattern.compile("([0-9]+)(?:s| " + var8 + "s|" + var8 + "s| " + var8 + "|" + var8 + ")[ |\\n]");
         Matcher var10 = var9.matcher(var1);
         if (var10.find()) {
            return Integer.parseInt(var10.group(1));
         }
      }

      return 0;
   }
}
