package mapped;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import lol.Log;
import lol.ResourceLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Class9466 {
   private static boolean field43979;
   public int field43980;
   public int field43981;
   public int field43982;
   public int field43983;
   public String field43984;
   public Properties field43985;
   public ArrayList field43986 = new ArrayList();
   public ArrayList field43987 = new ArrayList();
   public ArrayList field43988 = new ArrayList();
   public static final int field43989 = 1;
   public static final int field43990 = 2;
   public int field43991;
   private boolean field43992 = true;

   private static void method36461(boolean var0) {
      field43979 = var0;
   }

   public Class9466(String var1) throws Class2451 {
      this(var1, true);
   }

   public Class9466(String var1, boolean var2) throws Class2451 {
      this.field43992 = var2;
      var1 = var1.replace('\\', '/');
      this.method36482(ResourceLoader.getResourceAsStream(var1), var1.substring(0, var1.lastIndexOf("/")));
   }

   public Class9466(String var1, String var2) throws Class2451 {
      this.method36482(ResourceLoader.getResourceAsStream(var1), var2);
   }

   public Class9466(InputStream var1) throws Class2451 {
      this.method36482(var1, "");
   }

   public Class9466(InputStream var1, String var2) throws Class2451 {
      this.method36482(var1, var2);
   }

   public String method36462() {
      return this.field43984;
   }

   public int method36463(String var1) {
      boolean var4 = false;

      for (int var5 = 0; var5 < this.field43987.size(); var5++) {
         Class8818 var6 = (Class8818)this.field43987.get(var5);
         if (var6.field39674.equals(var1)) {
            return var5;
         }
      }

      return -1;
   }

   public Image method36464(int var1, int var2, int var3) {
      Class8818 var6 = (Class8818)this.field43987.get(var3);
      int var7 = var6.field39675[var1][var2][0];
      if (var7 >= 0 && var7 < this.field43986.size()) {
         Class7590 var8 = (Class7590)this.field43986.get(var7);
         int var9 = var8.method24854(var6.field39675[var1][var2][1]);
         int var10 = var8.method24855(var6.field39675[var1][var2][1]);
         return var8.field32584.method23504(var9, var10);
      } else {
         return null;
      }
   }

   public int method36465() {
      return this.field43980;
   }

   public int method36466() {
      return this.field43981;
   }

   public int method36467() {
      return this.field43983;
   }

   public int method36468() {
      return this.field43982;
   }

   public int method36469(int var1, int var2, int var3) {
      Class8818 var6 = (Class8818)this.field43987.get(var3);
      return var6.method31844(var1, var2);
   }

   public void method36470(int var1, int var2, int var3, int var4) {
      Class8818 var7 = (Class8818)this.field43987.get(var3);
      var7.method31845(var1, var2, var4);
   }

   public String method36471(String var1, String var2) {
      return this.field43985 != null ? this.field43985.getProperty(var1, var2) : var2;
   }

   public String method36472(int var1, String var2, String var3) {
      Class8818 var6 = (Class8818)this.field43987.get(var1);
      return var6 != null && var6.field39678 != null ? var6.field39678.getProperty(var2, var3) : var3;
   }

   public String method36473(int var1, String var2, String var3) {
      if (var1 != 0) {
         Class7590 var6 = this.method36486(var1);
         Properties var7 = var6.method24853(var1);
         return var7 != null ? var7.getProperty(var2, var3) : var3;
      } else {
         return var3;
      }
   }

   public void method36474(int var1, int var2) {
      this.method36478(var1, var2, 0, 0, this.field43980, this.field43981, false);
   }

   public void method36475(int var1, int var2, int var3) {
      this.method36477(var1, var2, 0, 0, this.method36465(), this.method36466(), var3, false);
   }

   public void method36476(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method36478(var1, var2, var3, var4, var5, var6, false);
   }

   public void method36477(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      Class8818 var11 = (Class8818)this.field43987.get(var7);
      switch (this.field43991) {
         case 1:
            for (int var12 = 0; var12 < var6; var12++) {
               var11.method31846(var1, var2, var3, var4, var5, var12, var8, this.field43982, this.field43983);
            }
            break;
         case 2:
            this.method36479(var1, var2, var3, var4, var5, var6, var11, var8);
      }
   }

   public void method36478(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      switch (this.field43991) {
         case 1:
            for (int var10 = 0; var10 < var6; var10++) {
               for (int var11 = 0; var11 < this.field43987.size(); var11++) {
                  Class8818 var12 = (Class8818)this.field43987.get(var11);
                  var12.method31846(var1, var2, var3, var4, var5, var10, var7, this.field43982, this.field43983);
               }
            }
            break;
         case 2:
            this.method36479(var1, var2, var3, var4, var5, var6, null, var7);
      }
   }

   public void method36479(int var1, int var2, int var3, int var4, int var5, int var6, Class8818 var7, boolean var8) {
      ArrayList var11 = this.field43987;
      if (var7 != null) {
         var11 = new ArrayList();
         var11.add(var7);
      }

      int var12 = var5 * var6;
      int var13 = 0;
      boolean var14 = false;
      int var15 = var1;
      int var16 = var2;
      int var17 = 0;
      int var18 = 0;

      while (!var14) {
         int var19 = var17;
         int var20 = var18;
         int var21 = var15;
         int var22 = 0;
         if (var6 <= var5) {
            var22 = var18 >= var6 - 1 ? (var5 - var17 >= var6 ? var6 - 1 : var5 - var17 - 1) : var18;
         } else {
            var22 = var18 >= var5 - 1 ? (var5 - var17 >= var6 ? var5 - 1 : var5 - var17 - 1) : var18;
         }

         for (int var23 = 0; var23 <= var22; var23++) {
            for (int var24 = 0; var24 < var11.size(); var24++) {
               Class8818 var25 = (Class8818)var11.get(var24);
               var25.method31846(var21, var16, var19, var20, 1, 0, var8, this.field43982, this.field43983);
            }

            var21 += this.field43982;
            var13++;
            var19++;
            var20--;
         }

         if (var18 >= var6 - 1) {
            var17++;
            var15 += this.field43982 / 2;
            var16 += this.field43983 / 2;
         } else {
            var18++;
            var15 -= this.field43982 / 2;
            var16 += this.field43983 / 2;
         }

         if (var13 >= var12) {
            var14 = true;
         }
      }
   }

   public int method36480() {
      return this.field43987.size();
   }

   private int method36481(String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var5) {
         return 0;
      }
   }

   private void method36482(InputStream var1, String var2) throws Class2451 {
      this.field43984 = var2;

      try {
         DocumentBuilderFactory var5 = DocumentBuilderFactory.newInstance();
         var5.setValidating(false);
         DocumentBuilder var6 = var5.newDocumentBuilder();
         var6.setEntityResolver(new Class7705(this));
         Document var7 = var6.parse(var1);
         Element var8 = var7.getDocumentElement();
         if (var8.getAttribute("orientation").equals("orthogonal")) {
            this.field43991 = 1;
         } else {
            this.field43991 = 2;
         }

         this.field43980 = this.method36481(var8.getAttribute("width"));
         this.field43981 = this.method36481(var8.getAttribute("height"));
         this.field43982 = this.method36481(var8.getAttribute("tilewidth"));
         this.field43983 = this.method36481(var8.getAttribute("tileheight"));
         Element var9 = (Element)var8.getElementsByTagName("properties").item(0);
         if (var9 != null) {
            NodeList var10 = var9.getElementsByTagName("property");
            if (var10 != null) {
               this.field43985 = new Properties();

               for (int var11 = 0; var11 < var10.getLength(); var11++) {
                  Element var12 = (Element)var10.item(var11);
                  String var13 = var12.getAttribute("name");
                  String var14 = var12.getAttribute("value");
                  this.field43985.setProperty(var13, var14);
               }
            }
         }

         if (this.field43992) {
            Class7590 var16 = null;
            Class7590 var19 = null;
            NodeList var22 = var8.getElementsByTagName("tileset");

            for (int var25 = 0; var25 < var22.getLength(); var25++) {
               Element var28 = (Element)var22.item(var25);
               var16 = new Class7590(this, var28, !field43979);
               var16.field32578 = var25;
               if (var19 != null) {
                  var19.method24856(var16.field32580 - 1);
               }

               var19 = var16;
               this.field43986.add(var16);
            }
         }

         NodeList var18 = var8.getElementsByTagName("layer");

         for (int var20 = 0; var20 < var18.getLength(); var20++) {
            Element var23 = (Element)var18.item(var20);
            Class8818 var26 = new Class8818(this, var23);
            var26.field39673 = var20;
            this.field43987.add(var26);
         }

         NodeList var21 = var8.getElementsByTagName("objectgroup");

         for (int var24 = 0; var24 < var21.getLength(); var24++) {
            Element var27 = (Element)var21.item(var24);
            Class8573 var29 = new Class8573(this, var27);
            var29.field38538 = var24;
            this.field43988.add(var29);
         }
      } catch (Exception var15) {
         Log.method25661(var15);
         throw new Class2451("Failed to parse tilemap", var15);
      }
   }

   public int method36483() {
      return this.field43986.size();
   }

   public Class7590 method36484(int var1) {
      return (Class7590)this.field43986.get(var1);
   }

   public Class7590 method36485(int var1) {
      for (int var4 = 0; var4 < this.field43986.size(); var4++) {
         Class7590 var5 = (Class7590)this.field43986.get(var4);
         if (var5.method24857(var1)) {
            return var5;
         }
      }

      return null;
   }

   public Class7590 method36486(int var1) {
      for (int var4 = 0; var4 < this.field43986.size(); var4++) {
         Class7590 var5 = (Class7590)this.field43986.get(var4);
         if (var5.method24857(var1)) {
            return var5;
         }
      }

      return null;
   }

   public void method36487(int var1, int var2, int var3) {
   }

   public int method36488() {
      return this.field43988.size();
   }

   public int method36489(int var1) {
      if (var1 >= 0 && var1 < this.field43988.size()) {
         Class8573 var4 = (Class8573)this.field43988.get(var1);
         return var4.field38540.size();
      } else {
         return -1;
      }
   }

   public String method36490(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field43988.size()) {
         Class8573 var5 = (Class8573)this.field43988.get(var1);
         if (var2 >= 0 && var2 < var5.field38540.size()) {
            Class7724 var6 = (Class7724)var5.field38540.get(var2);
            return var6.field33161;
         }
      }

      return null;
   }

   public String method36491(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field43988.size()) {
         Class8573 var5 = (Class8573)this.field43988.get(var1);
         if (var2 >= 0 && var2 < var5.field38540.size()) {
            Class7724 var6 = (Class7724)var5.field38540.get(var2);
            return var6.field33162;
         }
      }

      return null;
   }

   public int method36492(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field43988.size()) {
         Class8573 var5 = (Class8573)this.field43988.get(var1);
         if (var2 >= 0 && var2 < var5.field38540.size()) {
            Class7724 var6 = (Class7724)var5.field38540.get(var2);
            return var6.field33163;
         }
      }

      return -1;
   }

   public int method36493(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field43988.size()) {
         Class8573 var5 = (Class8573)this.field43988.get(var1);
         if (var2 >= 0 && var2 < var5.field38540.size()) {
            Class7724 var6 = (Class7724)var5.field38540.get(var2);
            return var6.field33164;
         }
      }

      return -1;
   }

   public int method36494(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field43988.size()) {
         Class8573 var5 = (Class8573)this.field43988.get(var1);
         if (var2 >= 0 && var2 < var5.field38540.size()) {
            Class7724 var6 = (Class7724)var5.field38540.get(var2);
            return var6.field33165;
         }
      }

      return -1;
   }

   public int method36495(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field43988.size()) {
         Class8573 var5 = (Class8573)this.field43988.get(var1);
         if (var2 >= 0 && var2 < var5.field38540.size()) {
            Class7724 var6 = (Class7724)var5.field38540.get(var2);
            return var6.field33166;
         }
      }

      return -1;
   }

   public String method36496(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field43988.size()) {
         Class8573 var5 = (Class8573)this.field43988.get(var1);
         if (var2 >= 0 && var2 < var5.field38540.size()) {
            Class7724 var6 = (Class7724)var5.field38540.get(var2);
            if (var6 != null) {
               return Class7724.method25543(var6);
            }

            return null;
         }
      }

      return null;
   }

   public String method36497(int var1, int var2, String var3, String var4) {
      if (var1 >= 0 && var1 < this.field43988.size()) {
         Class8573 var7 = (Class8573)this.field43988.get(var1);
         if (var2 >= 0 && var2 < var7.field38540.size()) {
            Class7724 var8 = (Class7724)var7.field38540.get(var2);
            if (var8 != null) {
               if (var8.field33168 != null) {
                  return var8.field33168.getProperty(var3, var4);
               }

               return var4;
            }

            return var4;
         }
      }

      return var4;
   }
}
