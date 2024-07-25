package remapped;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.newdawn.slick.SlickException;

public class class_4518 {
   private int field_22064 = 12;
   private boolean field_22073 = false;
   private boolean field_22069 = false;
   private int field_22065;
   private int field_22070;
   private int field_22071;
   private int field_22061;
   private int field_22062;
   private int field_22067;
   private int field_22072 = 512;
   private int field_22066 = 512;
   private final List field_22068 = new ArrayList();

   public class_4518() {
   }

   public class_4518(String var1) throws SlickException {
      this(class_8975.method_41153(var1));
   }

   public class_4518(InputStream var1) throws SlickException {
      try {
         BufferedReader var4 = new BufferedReader(new InputStreamReader(var1));

         while (true) {
            String var5 = var4.readLine();
            if (var5 == null) {
               var4.close();
               return;
            }

            var5 = var5.trim();
            if (var5.length() != 0) {
               String[] var6 = var5.split("=", 2);
               String var7 = var6[0].trim();
               String var8 = var6[1];
               if (var7.equals("font.size")) {
                  this.field_22064 = Integer.parseInt(var8);
               } else if (var7.equals("font.bold")) {
                  this.field_22073 = Boolean.valueOf(var8);
               } else if (var7.equals("font.italic")) {
                  this.field_22069 = Boolean.valueOf(var8);
               } else if (var7.equals("pad.top")) {
                  this.field_22065 = Integer.parseInt(var8);
               } else if (var7.equals("pad.right")) {
                  this.field_22061 = Integer.parseInt(var8);
               } else if (var7.equals("pad.bottom")) {
                  this.field_22071 = Integer.parseInt(var8);
               } else if (var7.equals("pad.left")) {
                  this.field_22070 = Integer.parseInt(var8);
               } else if (var7.equals("pad.advance.x")) {
                  this.field_22062 = Integer.parseInt(var8);
               } else if (var7.equals("pad.advance.y")) {
                  this.field_22067 = Integer.parseInt(var8);
               } else if (var7.equals("glyph.page.width")) {
                  this.field_22072 = Integer.parseInt(var8);
               } else if (var7.equals("glyph.page.height")) {
                  this.field_22066 = Integer.parseInt(var8);
               } else if (var7.equals("effect.class")) {
                  try {
                     this.field_22068.add(Class.forName(var8).newInstance());
                  } catch (Exception var13) {
                     throw new class_1162("Unable to create effect instance: " + var8, var13);
                  }
               } else if (var7.startsWith("effect.")) {
                  var7 = var7.substring(7);
                  class_9167 var9 = (class_9167)this.field_22068.get(this.field_22068.size() - 1);
                  List var10 = var9.method_42259();
                  Iterator var11 = var10.iterator();

                  while (true) {
                     if (var11.hasNext()) {
                        class_2278 var12 = (class_2278)var11.next();
                        if (!var12.method_10496().equals(var7)) {
                           continue;
                        }

                        var12.method_10497(var8);
                     }

                     var9.method_42258(var10);
                     break;
                  }
               }
            }
         }
      } catch (Exception var14) {
         throw new class_1162("Unable to load Hiero font file", var14);
      }
   }

   public int method_20994() {
      return this.field_22065;
   }

   public void method_21001(int var1) {
      this.field_22065 = var1;
   }

   public int method_21003() {
      return this.field_22070;
   }

   public void method_21009(int var1) {
      this.field_22070 = var1;
   }

   public int method_21012() {
      return this.field_22071;
   }

   public void method_20991(int var1) {
      this.field_22071 = var1;
   }

   public int method_20993() {
      return this.field_22061;
   }

   public void method_20990(int var1) {
      this.field_22061 = var1;
   }

   public int method_20999() {
      return this.field_22062;
   }

   public void method_21008(int var1) {
      this.field_22062 = var1;
   }

   public int method_21013() {
      return this.field_22067;
   }

   public void method_21010(int var1) {
      this.field_22067 = var1;
   }

   public int method_21004() {
      return this.field_22072;
   }

   public void method_21002(int var1) {
      this.field_22072 = var1;
   }

   public int method_21005() {
      return this.field_22066;
   }

   public void method_20996(int var1) {
      this.field_22066 = var1;
   }

   public int method_21006() {
      return this.field_22064;
   }

   public void method_21011(int var1) {
      this.field_22064 = var1;
   }

   public boolean method_21000() {
      return this.field_22073;
   }

   public void method_20997(boolean var1) {
      this.field_22073 = var1;
   }

   public boolean method_20989() {
      return this.field_22069;
   }

   public void method_20992(boolean var1) {
      this.field_22069 = var1;
   }

   public List method_21007() {
      return this.field_22068;
   }

   public void method_20998(File var1) throws IOException {
      PrintStream var4 = new PrintStream(new FileOutputStream(var1));
      var4.println("font.size=" + this.field_22064);
      var4.println("font.bold=" + this.field_22073);
      var4.println("font.italic=" + this.field_22069);
      var4.println();
      var4.println("pad.top=" + this.field_22065);
      var4.println("pad.right=" + this.field_22061);
      var4.println("pad.bottom=" + this.field_22071);
      var4.println("pad.left=" + this.field_22070);
      var4.println("pad.advance.x=" + this.field_22062);
      var4.println("pad.advance.y=" + this.field_22067);
      var4.println();
      var4.println("glyph.page.width=" + this.field_22072);
      var4.println("glyph.page.height=" + this.field_22066);
      var4.println();

      for (class_9167 var6 : this.field_22068) {
         var4.println("effect.class=" + var6.getClass().getName());

         for (class_2278 var8 : var6.method_42259()) {
            var4.println("effect." + var8.method_10496() + "=" + var8.method_10498());
         }

         var4.println();
      }

      var4.close();
   }
}
