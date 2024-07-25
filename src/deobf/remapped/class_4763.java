package remapped;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.lwjgl.BufferUtils;

public class class_4763 {
   private class_1893 field_23056 = class_1893.method_8510();
   private List<class_2034> field_23063 = new ArrayList<class_2034>();
   private List<class_2034> field_23062 = new ArrayList<class_2034>();
   private List<class_4333> field_23053 = new ArrayList<class_4333>();
   private boolean field_23054 = false;
   private int field_23057 = 10;
   private String field_23065 = null;
   public HashMap<Long, class_3058> field_23061 = new HashMap<Long, class_3058>();
   public int field_23055 = 0;
   public List<class_4985> field_23060 = new ArrayList<class_4985>();
   public HashMap<Long, ByteBuffer> field_23058 = new HashMap<Long, ByteBuffer>();
   public ByteBuffer field_23059 = BufferUtils.createByteBuffer(this.field_23057 * 16 * this.field_23057 * 16 * 3);

   public void method_21976() {
      SigmaMainClass.method_3328().method_3302().method_7908(this);
      int var3 = -7687425;

      for (int var4 = 0; var4 < 16; var4++) {
         for (int var5 = 0; var5 < 16; var5++) {
            this.field_23059.put((byte)(var3 >> 16 & 0xFF));
            this.field_23059.put((byte)(var3 >> 8 & 0xFF));
            this.field_23059.put((byte)(var3 & 0xFF));
         }
      }

      ((Buffer)this.field_23059).flip();
   }

   public List<class_4333> method_21960() {
      if (!this.field_23054) {
         this.method_21965();
      }

      return this.field_23053;
   }

   public void method_21973(class_4333 var1) {
      this.field_23053.add(var1);
      this.method_21964();
   }

   public void method_21964() {
      if (this.field_23065 != null) {
         File var3 = new File(this.field_23065 + "/waypoints.json");
         class_1336 var4 = new class_1336();

         for (class_4333 var6 : this.field_23053) {
            var4.method_6159(var6.method_20159());
         }

         class_1293 var8 = new class_1293();
         var8.method_5820("waypoints", var4);

         try {
            class_357.method_1791(var8, var3);
         } catch (IOException | class_7584 var7) {
            SigmaMainClass.method_3328().method_3326().method_12864(var7.getMessage());
         }
      }
   }

   private void method_21965() {
      File var3 = new File(this.field_23065 + "/waypoints.json");

      try {
         class_1293 var4 = class_357.method_1789(var3);
         if (!var4.method_5850("waypoints")) {
            var4.method_5820("waypoints", new class_1336());
         }

         for (Object var6 : var4.method_5849("waypoints")) {
            this.field_23053.add(new class_4333((class_1293)var6));
         }

         this.field_23054 = true;
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }

   public void method_21972(class_4333 var1) {
      this.field_23053.remove(var1);
   }

   @class_9148
   public void method_21970(class_717 var1) {
      try {
         this.method_21964();
         this.method_21963();
      } catch (IOException var5) {
         var5.printStackTrace();
      }

      this.field_23065 = this.method_21959();
      this.field_23061.clear();
      this.field_23063.clear();
      this.field_23062.clear();
      this.field_23054 = false;
      this.field_23053.clear();
   }

   @class_9148
   private void method_21961(class_5596 var1) {
      if (this.field_23056.field_9601 != null) {
         if (this.field_23065 != null) {
            boolean var4 = false;
            if (!var4) {
               if (this.field_23056.field_9632.field_41697 % 140 == 0) {
                  class_4985 var5 = class_3058.method_13961(this.field_23056.field_9601.method_22556(this.field_23056.field_9632.method_37075()).method_27352());
                  Iterator var6 = this.field_23061.entrySet().iterator();

                  while (var6.hasNext()) {
                     Entry var7 = (Entry)var6.next();
                     class_4985 var8 = new class_4985((Long)var7.getKey());
                     double var9 = (double)(var5.field_25814 - var8.field_25814);
                     double var11 = (double)(var5.field_25815 - var8.field_25815);
                     double var13 = Math.sqrt(var9 * var9 + var11 * var11);
                     if (var13 > 2.0) {
                        try {
                           ObjectOutputStream var15 = new ObjectOutputStream(
                              new FileOutputStream(this.method_21967(this.field_23065, (class_3058)var7.getValue()))
                           );
                           ((class_3058)var7.getValue()).method_13962(var15);
                           var15.close();
                        } catch (IOException var22) {
                           var22.printStackTrace();
                        }

                        this.field_23055 = Math.max(0, this.field_23055 - ((class_3058)var7.getValue()).field_15021.size());
                        var6.remove();
                     }
                  }
               }

               new ArrayList();
               String var23 = this.field_23065;
               int var24 = 0;

               for (int var25 = 0; var25 < this.field_23056.field_9601.method_745().field_27356.field_30586.length(); var25++) {
                  class_2654 var17 = this.field_23056.field_9601.method_745().field_27356.field_30586.get(var25);
                  if (var17 != null) {
                     boolean var18 = this.field_23063.contains(var17.method_27352());
                     boolean var19 = this.field_23062.contains(var17.method_27352());
                     if ((!var18 || var19)
                        && !var17.method_12003()
                        && this.field_23056.field_9601.method_745().method_14823(var17.method_27352())
                        && this.field_23056.field_9601.method_29545() == class_6486.field_33048) {
                        if (!var18) {
                           this.field_23063.add(var17.method_27352());
                        }

                        boolean var20 = this.method_21969(var17);
                        if (!var20 && !var19) {
                           this.field_23062.add(var17.method_27352());
                        } else if (var20 && var19) {
                           this.field_23062.remove(var17.method_27352());
                        } else if (!var20 && var19) {
                           continue;
                        }

                        new Thread(() -> {
                           try {
                              new File(var23).mkdirs();
                              File var5x = new File(this.method_21966(var23, var17));
                              class_4985 var6x = class_3058.method_13961(var17.method_27352());
                              class_3058 var7x = this.field_23061.get(var6x.method_22946());
                              ByteBuffer var8x = this.method_21971(var17, this.method_21969(var17));
                              if (var7x != null) {
                                 var7x.method_13960(var8x, var17.method_27352());
                              } else if (!var5x.exists()) {
                                 var7x = new class_3058(var6x.field_25814, var6x.field_25815);
                                 var7x.method_13960(var8x, var17.method_27352());
                                 this.field_23061.put(var6x.method_22946(), var7x);
                                 this.field_23060.clear();
                              } else if (this.method_21962(var6x)) {
                                 var7x = this.field_23061.get(var6x.method_22946());
                                 var7x.method_13960(var8x, var17.method_27352());
                              }

                              this.field_23055++;
                           } catch (IOException var9x) {
                              var9x.printStackTrace();
                           }
                        }).start();
                        if (++var24 > 6) {
                           break;
                        }
                     }
                  }
               }

               if (this.field_23055 > 32) {
                  this.field_23055 = 0;

                  try {
                     this.method_21963();
                  } catch (IOException var21) {
                     var21.printStackTrace();
                  }
               }
            }
         }
      }
   }

   public boolean method_21962(class_4985 var1) throws IOException {
      if (!this.field_23060.contains(var1)) {
         String var4 = this.field_23065;
         File var5 = new File(this.method_21968(var4, var1));
         if (var5.exists()) {
            FileInputStream var6 = new FileInputStream(var5);
            ObjectInputStream var7 = new ObjectInputStream(var6);
            class_3058 var8 = new class_3058(var1.field_25814, var1.field_25815);
            var8.method_13958(var7);
            this.field_23061.put(var1.method_22946(), var8);
            return true;
         } else {
            this.field_23060.add(var1);
            return false;
         }
      } else {
         return false;
      }
   }

   public void method_21963() throws FileNotFoundException, IOException {
      if (this.field_23065 != null) {
         String var3 = this.field_23065;

         try {
            for (Entry var5 : this.field_23061.entrySet()) {
               ObjectOutputStream var6 = new ObjectOutputStream(new FileOutputStream(this.method_21967(var3, (class_3058)var5.getValue())));
               ((class_3058)var5.getValue()).method_13962(var6);
               var6.close();
            }
         } catch (ConcurrentModificationException var7) {
         }
      }
   }

   public String method_21978() {
      String var3 = "local/local";
      if (this.field_23056.method_8515() == null && this.field_23056.method_8530() != null) {
         var3 = "server/" + this.field_23056.method_8530().field_12675.replace("/", ":");
      } else if (this.field_23056.method_8515() != null) {
         var3 = "local/" + this.field_23056.method_8515().method_1601().method_25716();
      }

      return var3;
   }

   public String method_21959() {
      return new File("jello") + "/maps/" + this.method_21978();
   }

   public String method_21968(String var1, class_4985 var2) throws FileNotFoundException {
      return var1 + "/" + var2.field_25814 + "c" + var2.field_25815 + ".jmap";
   }

   public String method_21967(String var1, class_3058 var2) throws FileNotFoundException {
      return var1 + "/" + var2.field_15019 + "c" + var2.field_15018 + ".jmap";
   }

   public String method_21966(String var1, class_2654 var2) throws FileNotFoundException {
      class_4985 var5 = class_3058.method_13961(var2.method_27352());
      return var1 + "/" + var5.field_25814 + "c" + var5.field_25815 + ".jmap";
   }

   public class_1376 method_21974(class_2034 var1, int var2) {
      ArrayList var5 = new ArrayList();

      for (int var6 = -var2 / 2; var6 < var2 / 2; var6++) {
         for (int var7 = -var2 / 2; var7 < var2 / 2; var7++) {
            var5.add(new class_2034(var1.field_10328 + var6, var1.field_10327 + var7));
         }
      }

      ByteBuffer var21 = BufferUtils.createByteBuffer(var2 * 16 * var2 * 16 * 3);
      int var22 = 0;
      int var8 = var21.position();
      String var9 = this.field_23065;

      for (class_2034 var11 : var5) {
         ByteBuffer var12 = this.field_23059.duplicate();
         Long var13 = class_2034.method_9540(var11.field_10328, var11.field_10327);
         ((Buffer)var12).position(0);
         class_4985 var14 = class_3058.method_13961(var11);
         class_3058 var15 = this.field_23061.get(var14.method_22946());
         if (var15 != null) {
            ByteBuffer var16 = var15.method_13963(var11);
            if (var16 != null) {
               var12 = var16.duplicate();
            }
         } else {
            try {
               if (this.method_21962(var14)) {
                  var15 = this.field_23061.get(var14.method_22946());
                  ByteBuffer var24 = var15.method_13963(var11);
                  if (var24 != null) {
                     var12 = var24.duplicate();
                  }
               }
            } catch (IOException var20) {
               var20.printStackTrace();
            }
         }

         int var25 = var21.position();
         int var17 = var21.position();

         for (int var18 = 0; var18 < 16; var18++) {
            for (int var19 = 0; var19 < 16; var19++) {
               var21.put(var12.get());
               var21.put(var12.get());
               var21.put(var12.get());
            }

            var25 += 16 * var2 * 3;
            if (var25 < var21.limit()) {
               ((Buffer)var21).position(var25);
            }
         }

         var8 += 48;
         if (var17 + 48 < var21.limit()) {
            ((Buffer)var21).position(var17 + 48);
         }

         if (var22 != var8 / (48 * var2)) {
            var22 = var8 / (48 * var2);
            if (256 * var2 * 3 * var22 < var21.limit()) {
               ((Buffer)var21).position(256 * var2 * 3 * var22);
            }
         }

         ((Buffer)var12).position(0);
      }

      ((Buffer)var21).position(16 * var2 * 16 * var2 * 3);
      ((Buffer)var21).flip();
      return new class_1376(var21, 16 * var2, 16 * var2);
   }

   private boolean method_21969(class_2654 var1) {
      class_2654 var4 = this.field_23056.field_9601.method_29554(var1.method_27352().field_10328, var1.method_27352().field_10327 + 1);
      class_2654 var5 = this.field_23056.field_9601.method_29554(var1.method_27352().field_10328, var1.method_27352().field_10327 - 1);
      return var4 != null && !var4.method_12003() && var5 != null && !var5.method_12003();
   }

   public ByteBuffer method_21971(class_2654 var1, boolean var2) {
      ByteBuffer var5 = BufferUtils.createByteBuffer(768);
      int var6 = var1.method_27352().field_10328 * 16;
      int var7 = var1.method_27352().field_10327 * 16;

      for (int var8 = 0; var8 < 16; var8++) {
         for (int var9 = 0; var9 < 16; var9++) {
            class_1331 var10 = new class_1331(var6 + var8, 64, var7 + var9);
            int var11 = this.method_21975(
               new class_1331(var10.method_12173(), var1.method_27353(class_3801.field_18592).method_9957(var8, var9) - 1, var10.method_12185()), var2
            );
            var5.put((byte)(var11 >> 16 & 0xFF));
            var5.put((byte)(var11 >> 8 & 0xFF));
            var5.put((byte)(var11 & 0xFF));
         }
      }

      ((Buffer)var5).flip();
      return var5;
   }

   public int method_21975(class_1331 var1, boolean var2) {
      if (this.field_23056.field_9601.method_28262(var1).method_8360() == class_4783.field_23184) {
         var1 = var1.method_6100();
      }

      class_1513 var5 = this.field_23056.field_9601.method_28262(var1).method_8362().method_24501();
      int var6 = var5.field_8060;
      class_5371 var7 = this.field_23056.field_9601.method_28262(var1.method_6081()).method_8362();
      if (var7 != class_5371.field_27415) {
         if (var7 == class_5371.field_27413) {
            var6 = var7.method_24501().field_8060;
         }
      } else {
         var6 = -1;
      }

      if (this.field_23056.field_9601.method_28262(var1).method_10307(class_6023.field_30719)) {
         var6 = class_5371.field_27439.method_24501().field_8060;
      }

      int var8 = (var6 & 0xFF0000) >> 16;
      int var9 = (var6 & 0xFF00) >> 8;
      int var10 = var6 & 0xFF;
      var6 = new Color(var8, var9, var10).getRGB();
      boolean var11 = Math.abs(var1.method_12185() % 16) != 15 && Math.abs(var1.method_12185() % 16) != 0;
      if (var1.method_12185() < 0) {
         var11 = Math.abs(var1.method_12185() % 16) != 16 && Math.abs(var1.method_12185() % 16) != 0;
      }

      if (var2 || var11) {
         class_5371 var12 = this.field_23056.field_9601.method_28262(var1.method_6094()).method_8362();
         class_5371 var13 = this.field_23056.field_9601.method_28262(var1.method_6073()).method_8362();
         if (var12 == class_5371.field_27403 || var12 == class_5371.field_27415) {
            var6 = class_314.method_1388(new Color(var6, true), Color.BLACK, 0.6F).getRGB();
         } else if (var13 == class_5371.field_27403 || var13 == class_5371.field_27415) {
            var6 = class_314.method_1388(new Color(var6, true), Color.WHITE, 0.6F).getRGB();
         }
      }

      if (var6 != -16777216) {
         var6 = new Color(var6, true).getRGB();
      } else {
         var6 = -7687425;
      }

      return var6;
   }
}
