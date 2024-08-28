package mapped;

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

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4418;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.util.FileUtil;
import totalcross.json.JSONArray;
import org.lwjgl.BufferUtils;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

public class WaypointsManager {
   private Minecraft field36365 = Minecraft.getInstance();
   private List<Class7481> field36366 = new ArrayList<Class7481>();
   private List<Class7481> field36367 = new ArrayList<Class7481>();
   private List<Class8351> field36368 = new ArrayList<Class8351>();
   private boolean field36369 = false;
   private int field36370 = 10;
   private String field36371 = null;
   public HashMap<Long, Class7927> field36372 = new HashMap<Long, Class7927>();
   public int field36373 = 0;
   public List<Class2531> field36374 = new ArrayList<Class2531>();
   public HashMap<Long, ByteBuffer> field36375 = new HashMap<Long, ByteBuffer>();
   public ByteBuffer field36376 = BufferUtils.createByteBuffer(this.field36370 * 16 * this.field36370 * 16 * 3);

   public void method29988() {
      Client.getInstance().getEventManager().register(this);
      int var3 = -7687425;

      for (int var4 = 0; var4 < 16; var4++) {
         for (int var5 = 0; var5 < 16; var5++) {
            this.field36376.put((byte)(var3 >> 16 & 0xFF));
            this.field36376.put((byte)(var3 >> 8 & 0xFF));
            this.field36376.put((byte)(var3 & 0xFF));
         }
      }

      ((Buffer)this.field36376).flip();
   }

   public List<Class8351> method29989() {
      if (!this.field36369) {
         this.method29992();
      }

      return this.field36368;
   }

   public void method29990(Class8351 var1) {
      this.field36368.add(var1);
      this.method29991();
   }

   public void method29991() {
      if (this.field36371 != null) {
         File var3 = new File(this.field36371 + "/waypoints.json");
         JSONArray var4 = new JSONArray();

         for (Class8351 var6 : this.field36368) {
            var4.put(var6.method29263());
         }

         JSONObject var8 = new JSONObject();
         var8.put("waypoints", var4);

         try {
            FileUtil.save(var8, var3);
         } catch (IOException | JSONException2 var7) {
            Client.getInstance().getLogger().error(var7.getMessage());
         }
      }
   }

   private void method29992() {
      File var3 = new File(this.field36371 + "/waypoints.json");

      try {
         JSONObject var4 = FileUtil.readFile(var3);
         if (!var4.has("waypoints")) {
            var4.put("waypoints", new JSONArray());
         }

         for (Object var6 : var4.getJSONArray("waypoints")) {
            this.field36368.add(new Class8351((JSONObject)var6));
         }

         this.field36369 = true;
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }

   public void method29993(Class8351 var1) {
      this.field36368.remove(var1);
   }

   @EventTarget
   public void method29994(Class4418 var1) {
      try {
         this.method29991();
         this.method29997();
      } catch (IOException var5) {
         var5.printStackTrace();
      }

      this.field36371 = this.method29999();
      this.field36372.clear();
      this.field36366.clear();
      this.field36367.clear();
      this.field36369 = false;
      this.field36368.clear();
   }

   @EventTarget
   private void method29995(TickEvent var1) {
      if (this.field36365.world != null) {
         if (this.field36371 != null) {
            boolean var4 = false;
            if (!var4) {
               if (this.field36365.player.field5055 % 140 == 0) {
                  Class2531 var5 = Class7927.method26605(this.field36365.world.method7011(this.field36365.player.method3432()).method7072());
                  Iterator var6 = this.field36372.entrySet().iterator();

                  while (var6.hasNext()) {
                     Entry var7 = (Entry)var6.next();
                     Class2531 var8 = new Class2531((Long)var7.getKey());
                     double var9 = (double)(var5.field16734 - var8.field16734);
                     double var11 = (double)(var5.field16735 - var8.field16735);
                     double var13 = Math.sqrt(var9 * var9 + var11 * var11);
                     if (var13 > 2.0) {
                        try {
                           ObjectOutputStream var15 = new ObjectOutputStream(
                              new FileOutputStream(this.method30001(this.field36371, (Class7927)var7.getValue()))
                           );
                           ((Class7927)var7.getValue()).method26603(var15);
                           var15.close();
                        } catch (IOException var22) {
                           var22.printStackTrace();
                        }

                        this.field36373 = Math.max(0, this.field36373 - ((Class7927)var7.getValue()).field33959.size());
                        var6.remove();
                     }
                  }
               }

               new ArrayList();
               String var23 = this.field36371;
               int var24 = 0;

               for (int var25 = 0; var25 < this.field36365.world.method6883().field9291.field39654.length(); var25++) {
                  Class1674 var17 = this.field36365.world.method6883().field9291.field39654.get(var25);
                  if (var17 != null) {
                     boolean var18 = this.field36366.contains(var17.method7072());
                     boolean var19 = this.field36367.contains(var17.method7072());
                     if ((!var18 || var19)
                        && !var17.method7141()
                        && this.field36365.world.method6883().method7352(var17.method7072())
                        && this.field36365.world.method6813() == World.field8999) {
                        if (!var18) {
                           this.field36366.add(var17.method7072());
                        }

                        boolean var20 = this.method30004(var17);
                        if (!var20 && !var19) {
                           this.field36367.add(var17.method7072());
                        } else if (var20 && var19) {
                           this.field36367.remove(var17.method7072());
                        } else if (!var20 && var19) {
                           continue;
                        }

                        new Thread(() -> {
                           try {
                              new File(var23).mkdirs();
                              File var5x = new File(this.method30002(var23, var17));
                              Class2531 var6x = Class7927.method26605(var17.method7072());
                              Class7927 var7x = this.field36372.get(var6x.method10678());
                              ByteBuffer var8x = this.method30005(var17, this.method30004(var17));
                              if (var7x != null) {
                                 var7x.method26599(var8x, var17.method7072());
                              } else if (!var5x.exists()) {
                                 var7x = new Class7927(var6x.field16734, var6x.field16735);
                                 var7x.method26599(var8x, var17.method7072());
                                 this.field36372.put(var6x.method10678(), var7x);
                                 this.field36374.clear();
                              } else if (this.method29996(var6x)) {
                                 var7x = this.field36372.get(var6x.method10678());
                                 var7x.method26599(var8x, var17.method7072());
                              }

                              this.field36373++;
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

               if (this.field36373 > 32) {
                  this.field36373 = 0;

                  try {
                     this.method29997();
                  } catch (IOException var21) {
                     var21.printStackTrace();
                  }
               }
            }
         }
      }
   }

   public boolean method29996(Class2531 var1) throws IOException {
      if (!this.field36374.contains(var1)) {
         String var4 = this.field36371;
         File var5 = new File(this.method30000(var4, var1));
         if (var5.exists()) {
            FileInputStream var6 = new FileInputStream(var5);
            ObjectInputStream var7 = new ObjectInputStream(var6);
            Class7927 var8 = new Class7927(var1.field16734, var1.field16735);
            var8.method26604(var7);
            this.field36372.put(var1.method10678(), var8);
            return true;
         } else {
            this.field36374.add(var1);
            return false;
         }
      } else {
         return false;
      }
   }

   public void method29997() throws FileNotFoundException, IOException {
      if (this.field36371 != null) {
         String var3 = this.field36371;

         try {
            for (Entry var5 : this.field36372.entrySet()) {
               ObjectOutputStream var6 = new ObjectOutputStream(new FileOutputStream(this.method30001(var3, (Class7927)var5.getValue())));
               ((Class7927)var5.getValue()).method26603(var6);
               var6.close();
            }
         } catch (ConcurrentModificationException var7) {
         }
      }
   }

   public String method29998() {
      String var3 = "local/local";
      if (this.field36365.method1531() == null && this.field36365.method1528() != null) {
         var3 = "server/" + this.field36365.method1528().field33189.replace("/", ":");
      } else if (this.field36365.method1531() != null) {
         var3 = "local/" + this.field36365.method1531().method1436().method20054();
      }

      return var3;
   }

   public String method29999() {
      return new File("jello") + "/maps/" + this.method29998();
   }

   public String method30000(String var1, Class2531 var2) throws FileNotFoundException {
      return var1 + "/" + var2.field16734 + "c" + var2.field16735 + ".jmap";
   }

   public String method30001(String var1, Class7927 var2) throws FileNotFoundException {
      return var1 + "/" + var2.field33957 + "c" + var2.field33958 + ".jmap";
   }

   public String method30002(String var1, Class1674 var2) throws FileNotFoundException {
      Class2531 var5 = Class7927.method26605(var2.method7072());
      return var1 + "/" + var5.field16734 + "c" + var5.field16735 + ".jmap";
   }

   public Class7101 method30003(Class7481 var1, int var2) {
      List<Class7481> var5 = new ArrayList<>();

      for (int var6 = -var2 / 2; var6 < var2 / 2; var6++) {
         for (int var7 = -var2 / 2; var7 < var2 / 2; var7++) {
            var5.add(new Class7481(var1.field32174 + var6, var1.field32175 + var7));
         }
      }

      ByteBuffer var21 = BufferUtils.createByteBuffer(var2 * 16 * var2 * 16 * 3);
      int var22 = 0;
      int var8 = var21.position();
      String var9 = this.field36371;

      for (Class7481 var11 : var5) {
         ByteBuffer var12 = this.field36376.duplicate();
         Long var13 = Class7481.method24353(var11.field32174, var11.field32175);
         ((Buffer)var12).position(0);
         Class2531 var14 = Class7927.method26605(var11);
         Class7927 var15 = this.field36372.get(var14.method10678());
         if (var15 != null) {
            ByteBuffer var16 = var15.method26600(var11);
            if (var16 != null) {
               var12 = var16.duplicate();
            }
         } else {
            try {
               if (this.method29996(var14)) {
                  var15 = this.field36372.get(var14.method10678());
                  ByteBuffer var24 = var15.method26600(var11);
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
      return new Class7101(var21, 16 * var2, 16 * var2);
   }

   private boolean method30004(Class1674 var1) {
      Class1674 var4 = this.field36365.world.method6824(var1.method7072().field32174, var1.method7072().field32175 + 1);
      Class1674 var5 = this.field36365.world.method6824(var1.method7072().field32174, var1.method7072().field32175 - 1);
      return var4 != null && !var4.method7141() && var5 != null && !var5.method7141();
   }

   public ByteBuffer method30005(Class1674 var1, boolean var2) {
      ByteBuffer var5 = BufferUtils.createByteBuffer(768);
      int var6 = var1.method7072().field32174 * 16;
      int var7 = var1.method7072().field32175 * 16;

      for (int var8 = 0; var8 < 16; var8++) {
         for (int var9 = 0; var9 < 16; var9++) {
            BlockPos var10 = new BlockPos(var6 + var8, 64, var7 + var9);
            int var11 = this.method30006(
               new BlockPos(var10.method8304(), var1.method7070(Class101.field296).method24579(var8, var9) - 1, var10.method8306()), var2
            );
            var5.put((byte)(var11 >> 16 & 0xFF));
            var5.put((byte)(var11 >> 8 & 0xFF));
            var5.put((byte)(var11 & 0xFF));
         }
      }

      ((Buffer)var5).flip();
      return var5;
   }

   public int method30006(BlockPos var1, boolean var2) {
      if (this.field36365.world.method6738(var1).method23383() == Blocks.AIR) {
         var1 = var1.method8313();
      }

      Class7210 var5 = this.field36365.world.method6738(var1).method23384().method31092();
      int var6 = var5.field31006;
      Class8649 var7 = this.field36365.world.method6738(var1.method8311()).method23384();
      if (var7 != Class8649.field38944) {
         if (var7 == Class8649.field38943) {
            var6 = var7.method31092().field31006;
         }
      } else {
         var6 = -1;
      }

      if (this.field36365.world.method6738(var1).method23462(Class8820.field39710)) {
         var6 = Class8649.field38941.method31092().field31006;
      }

      int var8 = (var6 & 0xFF0000) >> 16;
      int var9 = (var6 & 0xFF00) >> 8;
      int var10 = var6 & 0xFF;
      var6 = new Color(var8, var9, var10).getRGB();
      boolean var11 = Math.abs(var1.method8306() % 16) != 15 && Math.abs(var1.method8306() % 16) != 0;
      if (var1.method8306() < 0) {
         var11 = Math.abs(var1.method8306() % 16) != 16 && Math.abs(var1.method8306() % 16) != 0;
      }

      if (var2 || var11) {
         Class8649 var12 = this.field36365.world.method6738(var1.method8341()).method23384();
         Class8649 var13 = this.field36365.world.method6738(var1.method8343()).method23384();
         if (var12 == Class8649.field38932 || var12 == Class8649.field38944) {
            var6 = Class5628.method17681(new Color(var6, true), Color.BLACK, 0.6F).getRGB();
         } else if (var13 == Class8649.field38932 || var13 == Class8649.field38944) {
            var6 = Class5628.method17681(new Color(var6, true), Color.WHITE, 0.6F).getRGB();
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
