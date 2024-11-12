package mapped;

import org.newdawn.slick.util.ResourceLoader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;;

public class Class8415 {
   private int field36074 = 12;
   private boolean field36075 = false;
   private boolean field36076 = false;
   private int field36077;
   private int field36078;
   private int field36079;
   private int field36080;
   private int field36081;
   private int field36082;
   private int field36083 = 512;
   private int field36084 = 512;
   private final List<Class7184> field36085 = new ArrayList<>();

   public Class8415() {
   }

   public Class8415(String var1) throws Class2451 {
      this(ResourceLoader.getResourceAsStream(var1));
   }

   public Class8415(InputStream var1) throws Class2451 {
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
                  this.field36074 = Integer.parseInt(var8);
               } else if (var7.equals("font.bold")) {
                  this.field36075 = Boolean.valueOf(var8);
               } else if (var7.equals("font.italic")) {
                  this.field36076 = Boolean.valueOf(var8);
               } else if (var7.equals("pad.top")) {
                  this.field36077 = Integer.parseInt(var8);
               } else if (var7.equals("pad.right")) {
                  this.field36080 = Integer.parseInt(var8);
               } else if (var7.equals("pad.bottom")) {
                  this.field36079 = Integer.parseInt(var8);
               } else if (var7.equals("pad.left")) {
                  this.field36078 = Integer.parseInt(var8);
               } else if (var7.equals("pad.advance.x")) {
                  this.field36081 = Integer.parseInt(var8);
               } else if (var7.equals("pad.advance.y")) {
                  this.field36082 = Integer.parseInt(var8);
               } else if (var7.equals("glyph.page.width")) {
                  this.field36083 = Integer.parseInt(var8);
               } else if (var7.equals("glyph.page.height")) {
                  this.field36084 = Integer.parseInt(var8);
               } else if (var7.equals("effect.class")) {
                  try {
                     this.field36085.add((Class7184) Class.forName(var8).newInstance());
                  } catch (Exception var13) {
                     throw new Class2451("Unable to create effect instance: " + var8, var13);
                  }
               } else if (var7.startsWith("effect.")) {
                  var7 = var7.substring(7);
                  Class7184 var9 = (Class7184)this.field36085.get(this.field36085.size() - 1);
                  List var10 = var9.method22540();
                  Iterator var11 = var10.iterator();

                  while (true) {
                     if (var11.hasNext()) {
                        Class5438 var12 = (Class5438)var11.next();
                        if (!var12.method17103().equals(var7)) {
                           continue;
                        }

                        var12.method17101(var8);
                     }

                     var9.method22541(var10);
                     break;
                  }
               }
            }
         }
      } catch (Exception var14) {
         throw new Class2451("Unable to load Hiero font file", var14);
      }
   }

   public int method29547() {
      return this.field36077;
   }

   public void method29548(int var1) {
      this.field36077 = var1;
   }

   public int method29549() {
      return this.field36078;
   }

   public void method29550(int var1) {
      this.field36078 = var1;
   }

   public int method29551() {
      return this.field36079;
   }

   public void method29552(int var1) {
      this.field36079 = var1;
   }

   public int method29553() {
      return this.field36080;
   }

   public void method29554(int var1) {
      this.field36080 = var1;
   }

   public int method29555() {
      return this.field36081;
   }

   public void method29556(int var1) {
      this.field36081 = var1;
   }

   public int method29557() {
      return this.field36082;
   }

   public void method29558(int var1) {
      this.field36082 = var1;
   }

   public int method29559() {
      return this.field36083;
   }

   public void method29560(int var1) {
      this.field36083 = var1;
   }

   public int method29561() {
      return this.field36084;
   }

   public void method29562(int var1) {
      this.field36084 = var1;
   }

   public int method29563() {
      return this.field36074;
   }

   public void method29564(int var1) {
      this.field36074 = var1;
   }

   public boolean method29565() {
      return this.field36075;
   }

   public void method29566(boolean var1) {
      this.field36075 = var1;
   }

   public boolean method29567() {
      return this.field36076;
   }

   public void method29568(boolean var1) {
      this.field36076 = var1;
   }

   public List method29569() {
      return this.field36085;
   }

   public void method29570(File var1) throws IOException {
      PrintStream var4 = new PrintStream(new FileOutputStream(var1));
      var4.println("font.size=" + this.field36074);
      var4.println("font.bold=" + this.field36075);
      var4.println("font.italic=" + this.field36076);
      var4.println();
      var4.println("pad.top=" + this.field36077);
      var4.println("pad.right=" + this.field36080);
      var4.println("pad.bottom=" + this.field36079);
      var4.println("pad.left=" + this.field36078);
      var4.println("pad.advance.x=" + this.field36081);
      var4.println("pad.advance.y=" + this.field36082);
      var4.println();
      var4.println("glyph.page.width=" + this.field36083);
      var4.println("glyph.page.height=" + this.field36084);
      var4.println();

      for (Class7184 var6 : this.field36085) {
         var4.println("effect.class=" + var6.getClass().getName());

         for (Class5438 var8 : var6.method22540()) {
            var4.println("effect." + var8.method17103() + "=" + var8.method17102());
         }

         var4.println();
      }

      var4.close();
   }
}
