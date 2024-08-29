package mapped;

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
import java.util.Map.Entry;

import net.minecraft.client.util.Util;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7741 implements IProfileResult {
   private static final Logger field33237 = LogManager.getLogger();
   private static final Class6705 field33238 = new Class6704();
   private static final Splitter field33239 = Splitter.on('\u001e');
   private static final Comparator<Entry<String, Class9526>> field33240 = Entry.<String, Class9526>comparingByValue(
         Comparator.comparingLong(var0 -> Class9526.method36810(var0))
      )
      .reversed();
   private final Map<String, ? extends Class6705> field33241;
   private final long field33242;
   private final int field33243;
   private final long field33244;
   private final int field33245;
   private final int field33246;

   public Class7741(Map<String, ? extends Class6705> var1, long var2, int var4, long var5, int var7) {
      this.field33241 = var1;
      this.field33242 = var2;
      this.field33243 = var4;
      this.field33244 = var5;
      this.field33245 = var7;
      this.field33246 = var7 - var4;
   }

   private Class6705 method25635(String var1) {
      Class6705 var4 = this.field33241.get(var1);
      return var4 == null ? field33238 : var4;
   }

   @Override
   public List<DataPoint> getDataPoints(String var1) {
      String var4 = var1;
      Class6705 var5 = this.method25635("root");
      long var6 = var5.method20440();
      Class6705 var8 = this.method25635(var1);
      long var9 = var8.method20440();
      long var11 = var8.method20441();
      ArrayList var13 = Lists.newArrayList();
      if (!var1.isEmpty()) {
         var1 = var1 + '\u001e';
      }

      long var14 = 0L;

      for (String var17 : this.field33241.keySet()) {
         if (method25636(var1, var17)) {
            var14 += this.method25635(var17).method20440();
         }
      }

      float var27 = (float)var14;
      if (var14 < var9) {
         var14 = var9;
      }

      if (var6 < var14) {
         var6 = var14;
      }

      for (String var18 : this.field33241.keySet()) {
         if (method25636(var1, var18)) {
            Class6705 var19 = this.method25635(var18);
            long var20 = var19.method20440();
            double var22 = (double)var20 * 100.0 / (double)var14;
            double var24 = (double)var20 * 100.0 / (double)var6;
            String var26 = var18.substring(var1.length());
            var13.add(new DataPoint(var26, var22, var24, var19.method20441()));
         }
      }

      if ((float)var14 > var27) {
         var13.add(
            new DataPoint("unspecified", (double)((float)var14 - var27) * 100.0 / (double)var14, (double)((float)var14 - var27) * 100.0 / (double)var6, var11)
         );
      }

      Collections.sort(var13);
      var13.add(0, new DataPoint(var4, 100.0, (double)var14 * 100.0 / (double)var6, var11));
      return var13;
   }

   private static boolean method25636(String var0, String var1) {
      return var1.length() > var0.length() && var1.startsWith(var0) && var1.indexOf(30, var0.length() + 1) < 0;
   }

   private Map<String, Class9526> method25637() {
      Map<String, Class9526> var3 = Maps.newTreeMap();
      this.field33241.forEach((var1, var2) -> {
         Object2LongMap<String> var5 = var2.method20442();
         if (!var5.isEmpty()) {
            List<String> var6 = field33239.splitToList(var1);
            var5.forEach((var2x, var3x) -> var3.computeIfAbsent(var2x, var0xx -> new Class9526(null)).method36808(var6.iterator(), var3x));
         }
      });
      return var3;
   }

   @Override
   public long method25628() {
      return this.field33242;
   }

   @Override
   public int method25629() {
      return this.field33243;
   }

   @Override
   public long method25630() {
      return this.field33244;
   }

   @Override
   public int method25631() {
      return this.field33245;
   }

   @Override
   public boolean method25627(File var1) {
      var1.getParentFile().mkdirs();
      OutputStreamWriter var4 = null;

      boolean var6;
      try {
         var4 = new OutputStreamWriter(new FileOutputStream(var1), StandardCharsets.UTF_8);
         var4.write(this.method25638(this.method25632(), this.method25633()));
         return true;
      } catch (Throwable var10) {
         field33237.error("Could not save profiler results to {}", var1, var10);
         var6 = false;
      } finally {
         IOUtils.closeQuietly(var4);
      }

      return var6;
   }

   public String method25638(long var1, int var3) {
      StringBuilder var6 = new StringBuilder();
      var6.append("---- Minecraft Profiler Results ----\n");
      var6.append("// ");
      var6.append(method25643());
      var6.append("\n\n");
      var6.append("Version: ").append(SharedConstants.getVersion().getId()).append('\n');
      var6.append("Time span: ").append(var1 / 1000000L).append(" ms\n");
      var6.append("Tick span: ").append(var3).append(" ticks\n");
      var6.append("// This is approximately ")
         .append(String.format(Locale.ROOT, "%.2f", (float)var3 / ((float)var1 / 1.0E9F)))
         .append(" ticks per second. It should be ")
         .append(20)
         .append(" ticks per second\n\n");
      var6.append("--- BEGIN PROFILE DUMP ---\n\n");
      this.method25640(0, "root", var6);
      var6.append("--- END PROFILE DUMP ---\n\n");
      Map var7 = this.method25637();
      if (!var7.isEmpty()) {
         var6.append("--- BEGIN COUNTER DUMP ---\n\n");
         this.method25642(var7, var6, var3);
         var6.append("--- END COUNTER DUMP ---\n\n");
      }

      return var6.toString();
   }

   private static StringBuilder method25639(StringBuilder var0, int var1) {
      var0.append(String.format("[%02d] ", var1));

      for (int var4 = 0; var4 < var1; var4++) {
         var0.append("|   ");
      }

      return var0;
   }

   private void method25640(int var1, String var2, StringBuilder var3) {
      List var6 = this.getDataPoints(var2);
      Object2LongMap<String> var7 = ((Class6705)ObjectUtils.firstNonNull(new Class6705[]{this.field33241.get(var2), field33238})).method20442();
      var7.forEach(
         (var3x, var4) -> method25639(var3, var1)
               .append('#')
               .append(var3x)
               .append(' ')
               .append(var4)
               .append('/')
               .append(var4 / (long)this.field33246)
               .append('\n')
      );
      if (var6.size() >= 3) {
         for (int var8 = 1; var8 < var6.size(); var8++) {
            DataPoint var9 = (DataPoint)var6.get(var8);
            method25639(var3, var1)
               .append(var9.name)
               .append('(')
               .append(var9.field13084)
               .append('/')
               .append(String.format(Locale.ROOT, "%.0f", (float)var9.field13084 / (float)this.field33246))
               .append(')')
               .append(" - ")
               .append(String.format(Locale.ROOT, "%.2f", var9.relTime))
               .append("%/")
               .append(String.format(Locale.ROOT, "%.2f", var9.field13083))
               .append("%\n");
            if (!"unspecified".equals(var9.name)) {
               try {
                  this.method25640(var1 + 1, var2 + '\u001e' + var9.name, var3);
               } catch (Exception var11) {
                  var3.append("[[ EXCEPTION ").append(var11).append(" ]]");
               }
            }
         }
      }
   }

   private void method25641(int var1, String var2, Class9526 var3, int var4, StringBuilder var5) {
      method25639(var5, var1)
         .append(var2)
         .append(" total:")
         .append(Class9526.method36811(var3))
         .append('/')
         .append(Class9526.method36810(var3))
         .append(" average: ")
         .append(Class9526.method36811(var3) / (long)var4)
         .append('/')
         .append(Class9526.method36810(var3) / (long)var4)
         .append('\n');
      Class9526.method36812(var3)
         .entrySet()
         .stream()
         .sorted(field33240)
         .forEach(var4x -> this.method25641(var1 + 1, var4x.getKey(), var4x.getValue(), var4, var5));
   }

   private void method25642(Map<String, Class9526> var1, StringBuilder var2, int var3) {
      var1.forEach((var3x, var4) -> {
         var2.append("-- Counter: ").append(var3x).append(" --\n");
         this.method25641(0, "root", (Class9526)Class9526.method36812(var4).get("root"), var3, var2);
         var2.append("\n\n");
      });
   }

   private static String method25643() {
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
         return var2[(int)(Util.nanoTime() % (long)var2.length)];
      } catch (Throwable var4) {
         return "Witty comment unavailable :(";
      }
   }

   @Override
   public int method25633() {
      return this.field33246;
   }
}
