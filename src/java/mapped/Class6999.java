package mapped;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.CharStreams;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Class6999 {
   private final Map<String, List<String>> field30274 = Maps.newConcurrentMap();
   private final char field30275;
   private final int field30276;
   private List<String> field30277 = Lists.newArrayList();

   public Class6999(char var1, int var2) {
      this.field30275 = var1;
      this.field30276 = var2;
   }

   public void method21687(String... var1) {
      this.field30277 = Arrays.<String>asList(var1);
   }

   public List<String> method21688() {
      return this.field30277;
   }

   public void method21689(String var1, String... var2) {
      this.field30274.put(var1, Arrays.<String>asList(var2));
   }

   public List<String> method21690(String var1) {
      return this.field30274.get(var1);
   }

   public void method21691(InputStream var1) throws IOException {
      InputStreamReader var4 = new InputStreamReader(var1);

      String var5;
      try {
         var5 = CharStreams.toString(var4);
      } finally {
         var4.close();
      }

      StringBuilder var6 = new StringBuilder();
      String var7 = Character.toString(this.field30275);
      int var8 = 0;
      String var9 = "";
      ArrayList var10 = Lists.newArrayList();

      for (String var14 : var5.split("\n")) {
         if (!var14.isEmpty()) {
            int var15 = this.method21695(var14, ' ');
            String var16 = var15 > 0 ? var14.substring(var15) : var14;
            if (var16.startsWith("#")) {
               if (var16.startsWith("#>")) {
                  String var17 = var16.startsWith("#> ") ? var16.substring(3) : var16.substring(2);
                  this.field30277.add(var17);
               } else {
                  String var22 = var16.startsWith("# ") ? var16.substring(2) : var16.substring(1);
                  var10.add(var22);
               }
            } else {
               int var23 = var15 / this.field30276;
               if (var23 <= var8) {
                  String[] var18 = var9.split(Pattern.quote(var7));
                  int var19 = var8 - var23 + 1;
                  var9 = this.method21694(var18, this.field30275, 0, var18.length - var19);
               }

               String var24 = var9.length() > 0 ? var7 : "";
               String var25 = var14.contains(":") ? var14.split(Pattern.quote(":"))[0] : var14;
               var9 = var9 + var24 + var25.substring(var15);
               var8 = var23;
               var6.append(var14).append('\n');
               if (!var10.isEmpty()) {
                  this.field30274.put(var9, var10);
                  var10 = Lists.newArrayList();
               }
            }
         }
      }
   }

   public void method21692(String var1, File var2) throws IOException {
      int var5 = this.field30276;
      String var6 = Character.toString(this.field30275);
      StringBuilder var7 = new StringBuilder();
      int var8 = 0;
      String var9 = "";

      for (String var11 : this.field30277) {
         var7.append("#> ").append(var11).append('\n');
      }

      for (String var13 : var1.split("\n")) {
         if (!var13.isEmpty()) {
            int var14 = this.method21695(var13, ' ');
            int var15 = var14 / var5;
            String var16 = var14 > 0 ? var13.substring(0, var14) : "";
            if (var15 <= var8) {
               String[] var17 = var9.split(Pattern.quote(var6));
               int var18 = var8 - var15 + 1;
               var9 = this.method21694(var17, this.field30275, 0, var17.length - var18);
            }

            String var31 = var9.length() > 0 ? var6 : "";
            String var32 = var13.contains(":") ? var13.split(Pattern.quote(":"))[0] : var13;
            var9 = var9 + var31 + var32.substring(var14);
            var8 = var15;
            List var19 = this.field30274.get(var9);
            String var20 = var19 != null ? this.method21693(var19, var16) : "";
            var7.append(var20).append(var13).append('\n');
         }
      }

      FileWriter var29 = null;

      try {
         var29 = new FileWriter(var2);
         var29.write(var7.toString());
         var29.flush();
      } finally {
         if (var29 != null) {
            try {
               var29.close();
            } catch (IOException var26) {
            }
         }
      }
   }

   private String method21693(List<String> var1, String var2) {
      StringBuilder var5 = new StringBuilder();

      for (String var7 : var1) {
         var5.append(var2).append("# ").append(var7).append('\n');
      }

      return var5.toString();
   }

   private String method21694(String[] var1, char var2, int var3, int var4) {
      String[] var7 = new String[var4 - var3];
      System.arraycopy(var1, var3, var7, 0, var4 - var3);
      return Joiner.on(var2).join(var7);
   }

   private int method21695(String var1, char var2) {
      int var5 = 0;

      for (int var6 = 0; var6 < var1.length() && var1.charAt(var6) == var2; var6++) {
         var5++;
      }

      return var5;
   }
}
