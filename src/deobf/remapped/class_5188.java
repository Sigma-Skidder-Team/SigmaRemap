package remapped;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5188 implements class_2578 {
   private static final Logger field_26695 = LogManager.getLogger();
   private static final class_4608 field_26693 = new class_883();
   private static final Splitter field_26699 = Splitter.on('\u001e');
   private static final Comparator<Entry<String, class_8728>> field_26697 = Entry.<String, class_8728>comparingByValue(
         Comparator.comparingLong(var0 -> class_8728.method_40080(var0))
      )
      .reversed();
   private final Map<String, ? extends class_4608> field_26692;
   private final long field_26698;
   private final int field_26701;
   private final long field_26700;
   private final int field_26694;
   private final int field_26696;

   public class_5188(Map<String, ? extends class_4608> var1, long var2, int var4, long var5, int var7) {
      this.field_26692 = var1;
      this.field_26698 = var2;
      this.field_26701 = var4;
      this.field_26700 = var5;
      this.field_26694 = var7;
      this.field_26696 = var7 - var4;
   }

   private class_4608 method_23834(String var1) {
      class_4608 var4 = this.field_26692.get(var1);
      return var4 == null ? field_26693 : var4;
   }

   public List<class_692> 홵랾醧ぶ哝挐(String var1) {
      String var4 = var1;
      class_4608 var5 = this.method_23834("root");
      long var6 = var5.method_21362();
      class_4608 var8 = this.method_23834(var1);
      long var9 = var8.method_21362();
      long var11 = var8.method_21361();
      ArrayList var13 = Lists.newArrayList();
      if (!var1.isEmpty()) {
         var1 = var1 + '\u001e';
      }

      long var14 = 0L;

      for (String var17 : this.field_26692.keySet()) {
         if (method_23841(var1, var17)) {
            var14 += this.method_23834(var17).method_21362();
         }
      }

      float var27 = (float)var14;
      if (var14 < var9) {
         var14 = var9;
      }

      if (var6 < var14) {
         var6 = var14;
      }

      for (String var18 : this.field_26692.keySet()) {
         if (method_23841(var1, var18)) {
            class_4608 var19 = this.method_23834(var18);
            long var20 = var19.method_21362();
            double var22 = (double)var20 * 100.0 / (double)var14;
            double var24 = (double)var20 * 100.0 / (double)var6;
            String var26 = var18.substring(var1.length());
            var13.add(new class_692(var26, var22, var24, var19.method_21361()));
         }
      }

      if ((float)var14 > var27) {
         var13.add(
            new class_692("unspecified", (double)((float)var14 - var27) * 100.0 / (double)var14, (double)((float)var14 - var27) * 100.0 / (double)var6, var11)
         );
      }

      Collections.sort(var13);
      var13.add(0, new class_692(var4, 100.0, (double)var14 * 100.0 / (double)var6, var11));
      return var13;
   }

   private static boolean method_23841(String var0, String var1) {
      return var1.length() > var0.length() && var1.startsWith(var0) && var1.indexOf(30, var0.length() + 1) < 0;
   }

   private Map<String, class_8728> method_23836() {
      TreeMap var3 = Maps.newTreeMap();
      this.field_26692.forEach((var1, var2) -> {
         Object2LongMap var5 = var2.method_21360();
         if (!var5.isEmpty()) {
            List var6 = field_26699.splitToList(var1);
            var5.forEach((var2x, var3x) -> var3.computeIfAbsent(var2x, var0xx -> new class_8728(null)).method_40083(var6.iterator(), var3x));
         }
      });
      return var3;
   }

   public long 藸汌䈔嶗Ⱋ㕠() {
      return this.field_26698;
   }

   public int 髾殢堧髾䈔顸() {
      return this.field_26701;
   }

   public long 弻婯쇼붃㐖鶲() {
      return this.field_26700;
   }

   public int 硙붃ᔎ捉蚳쬷() {
      return this.field_26694;
   }

   public boolean 낛圭䕦콗쇽鶊(File var1) {
      var1.getParentFile().mkdirs();
      OutputStreamWriter var4 = null;

      boolean var6;
      try {
         var4 = new OutputStreamWriter(new FileOutputStream(var1), StandardCharsets.UTF_8);
         var4.write(this.method_23840(this.粤卒蛊웎ၝ敤(), this.뚔ಽ洝埙콵ใ()));
         return true;
      } catch (Throwable var10) {
         field_26695.error("Could not save profiler results to {}", var1, var10);
         var6 = false;
      } finally {
         IOUtils.closeQuietly(var4);
      }

      return var6;
   }

   public String method_23840(long var1, int var3) {
      StringBuilder var6 = new StringBuilder();
      var6.append("---- Minecraft Profiler Results ----\n");
      var6.append("// ");
      var6.append(method_23842());
      var6.append("\n\n");
      var6.append("Version: ").append(class_7665.method_34674().getId()).append('\n');
      var6.append("Time span: ").append(var1 / 1000000L).append(" ms\n");
      var6.append("Tick span: ").append(var3).append(" ticks\n");
      var6.append("// This is approximately ")
         .append(String.format(Locale.ROOT, "%.2f", (float)var3 / ((float)var1 / 1.0E9F)))
         .append(" ticks per second. It should be ")
         .append(20)
         .append(" ticks per second\n\n");
      var6.append("--- BEGIN PROFILE DUMP ---\n\n");
      this.method_23833(0, "root", var6);
      var6.append("--- END PROFILE DUMP ---\n\n");
      Map var7 = this.method_23836();
      if (!var7.isEmpty()) {
         var6.append("--- BEGIN COUNTER DUMP ---\n\n");
         this.method_23839(var7, var6, var3);
         var6.append("--- END COUNTER DUMP ---\n\n");
      }

      return var6.toString();
   }

   private static StringBuilder method_23838(StringBuilder var0, int var1) {
      var0.append(String.format("[%02d] ", var1));

      for (int var4 = 0; var4 < var1; var4++) {
         var0.append("|   ");
      }

      return var0;
   }

   private void method_23833(int var1, String var2, StringBuilder var3) {
      List var6 = this.홵랾醧ぶ哝挐(var2);
      Object2LongMap var7 = ((class_4608)ObjectUtils.firstNonNull(new class_4608[]{this.field_26692.get(var2), field_26693})).method_21360();
      var7.forEach(
         (var3x, var4) -> method_23838(var3, var1)
               .append('#')
               .append(var3x)
               .append(' ')
               .append(var4)
               .append('/')
               .append(var4 / (long)this.field_26696)
               .append('\n')
      );
      if (var6.size() >= 3) {
         for (int var8 = 1; var8 < var6.size(); var8++) {
            class_692 var9 = (class_692)var6.get(var8);
            method_23838(var3, var1)
               .append(var9.field_3801)
               .append('(')
               .append(var9.field_3799)
               .append('/')
               .append(String.format(Locale.ROOT, "%.0f", (float)var9.field_3799 / (float)this.field_26696))
               .append(')')
               .append(" - ")
               .append(String.format(Locale.ROOT, "%.2f", var9.field_3803))
               .append("%/")
               .append(String.format(Locale.ROOT, "%.2f", var9.field_3802))
               .append("%\n");
            if (!"unspecified".equals(var9.field_3801)) {
               try {
                  this.method_23833(var1 + 1, var2 + '\u001e' + var9.field_3801, var3);
               } catch (Exception var11) {
                  var3.append("[[ EXCEPTION ").append(var11).append(" ]]");
               }
            }
         }
      }
   }

   private void method_23837(int var1, String var2, class_8728 var3, int var4, StringBuilder var5) {
      method_23838(var5, var1)
         .append(var2)
         .append(" total:")
         .append(class_8728.method_40084(var3))
         .append('/')
         .append(class_8728.method_40080(var3))
         .append(" average: ")
         .append(class_8728.method_40084(var3) / (long)var4)
         .append('/')
         .append(class_8728.method_40080(var3) / (long)var4)
         .append('\n');
      class_8728.method_40082(var3)
         .entrySet()
         .stream()
         .sorted(field_26697)
         .forEach(var4x -> this.method_23837(var1 + 1, var4x.getKey(), var4x.getValue(), var4, var5));
   }

   private void method_23839(Map<String, class_8728> var1, StringBuilder var2, int var3) {
      var1.forEach((var3x, var4) -> {
         var2.append("-- Counter: ").append(var3x).append(" --\n");
         this.method_23837(0, "root", (class_8728)class_8728.method_40082(var4).get("root"), var3, var2);
         var2.append("\n\n");
      });
   }

   private static String method_23842() {
      String[] var2 = new String[]{
         "Shiny numbers!",
         "Am I not running fast enough? :(",
         "I'm working as hard as I can!",
         "Will I ever be good enough for you? :(",
         "Speedy. Zoooooom!",
         "Hello world",
         "40% better than a crash report.",
         "Now with extra numbers",
         "Now with less numbers",
         "Now with the same numbers",
         "You should add flames to things, it makes them go faster!",
         "Do you feel the need for... optimization?",
         "*cracks redstone whip*",
         "Maybe if you treated it better then it'll have more motivation to work faster! Poor server."
      };

      try {
         return var2[(int)(Util.getMeasuringTimeNano() % (long)var2.length)];
      } catch (Throwable var4) {
         return "Witty comment unavailable :(";
      }
   }

   public int 뚔ಽ洝埙콵ใ() {
      return this.field_26696;
   }
}
