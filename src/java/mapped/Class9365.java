package mapped;

import org.newdawn.slick.Color;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;
import lol.TextureImpl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Class9365 {
   public SGL field43448 = Renderer.get();
   public static final int field43449 = 1;
   public static final int field43450 = 2;
   private static final int field43451 = 100;
   private ArrayList field43452 = new ArrayList();
   public Map<Class6135, Class9808> field43453 = new HashMap();
   public int field43454;
   public ArrayList field43455 = new ArrayList();
   public Class4536 field43456;
   private int field43457 = 2;
   private int field43458;
   private boolean field43459;
   private float field43460;
   private float field43461;
   private boolean field43462 = true;
   private Image field43463;
   private boolean field43464 = true;
   private String field43465;
   private Color field43466;

   public static void method35464(String var0) {
      Class6134.method18935(var0);
   }

   public Class9365(Image var1) {
      this(var1, 100);
   }

   public Class9365(String var1) {
      this(var1, 100);
   }

   public void method35465() {
      for (Class9808 var4 : this.field43453.values()) {
         var4.method38684(this);
      }

      for (int var6 = 0; var6 < this.field43455.size(); var6++) {
         Class6135 var5 = (Class6135)this.field43455.get(var6);
         var5.method18957();
      }
   }

   public boolean method35466() {
      return this.field43464;
   }

   public void method35467(boolean var1) {
      this.field43464 = var1;
   }

   public void method35468(boolean var1) {
      this.field43462 = var1;
   }

   public void method35469(boolean var1) {
      this.field43459 = var1;
   }

   public boolean method35470() {
      return this.field43459;
   }

   public Class9365(String var1, int var2) {
      this(var1, var2, null);
   }

   public Class9365(String var1, int var2, Color var3) {
      this.field43454 = var2;
      this.field43466 = var3;
      this.method35471(var1);
      this.field43456 = this.method35473(this);
   }

   public Class9365(Image var1, int var2) {
      this.field43454 = var2;
      this.field43463 = var1;
      this.field43456 = this.method35473(this);
   }

   public void method35471(String var1) {
      this.field43465 = var1;
      this.field43463 = null;
   }

   public int method35472() {
      return this.field43457;
   }

   public Class4536 method35473(Class9365 var1) {
      return new Class4536(var1);
   }

   public void method35474(int var1) {
      this.field43457 = var1;
   }

   public int method35475() {
      return this.field43455.size();
   }

   public Class6135 method35476(int var1) {
      return (Class6135)this.field43455.get(var1);
   }

   public void method35477(Class6135 var1) {
      this.field43455.add(var1);
      Class9808 var4 = new Class9808(this, this, this.field43454);
      this.field43453.put(var1, var4);
   }

   public void method35478(Class6135 var1) {
      this.field43455.remove(var1);
      this.field43453.remove(var1);
   }

   public void method35479() {
      for (int var3 = 0; var3 < this.field43455.size(); var3++) {
         this.method35478((Class6135)this.field43455.get(var3));
         var3--;
      }
   }

   public float method35480() {
      return this.field43460;
   }

   public float method35481() {
      return this.field43461;
   }

   public void method35482(float var1, float var2) {
      this.field43460 = var1;
      this.field43461 = var2;
   }

   public void method35483() {
      this.method35484(this.field43460, this.field43461);
   }

   public void method35484(float var1, float var2) {
      if (this.field43463 == null && this.field43465 != null) {
         this.method35485();
      }

      if (this.field43464) {
         this.field43448.glTranslatef(var1, var2, 0.0F);
         if (this.field43457 == 1) {
            this.field43448.glBlendFunc(770, 1);
         }

         if (this.method35470()) {
            this.field43448.glEnable(2832);
            TextureImpl.bindNone();
         }

         for (int var5 = 0; var5 < this.field43455.size(); var5++) {
            Class6135 var6 = (Class6135)this.field43455.get(var5);
            if (var6.method18942()) {
               if (var6.method18952()) {
                  this.field43448.glBlendFunc(770, 1);
               }

               Class9808 var7 = (Class9808)this.field43453.get(var6);
               Image var8 = var6.method18955();
               if (var8 == null) {
                  var8 = this.field43463;
               }

               if (!var6.method18953() && !var6.method18954(this)) {
                  var8.method23509();
               }

               for (int var9 = 0; var9 < var7.field45839.length; var9++) {
                  if (var7.field45839[var9].method14470()) {
                     var7.field45839[var9].method14471();
                  }
               }

               if (!var6.method18953() && !var6.method18954(this)) {
                  var8.method23508();
               }

               if (var6.method18952()) {
                  this.field43448.glBlendFunc(770, 771);
               }
            }
         }

         if (this.method35470()) {
            this.field43448.glDisable(2832);
         }

         if (this.field43457 == 1) {
            this.field43448.glBlendFunc(770, 771);
         }

         Color.field16442.method10392();
         this.field43448.glTranslatef(-var1, -var2, 0.0F);
      }
   }

   private void method35485() {
      AccessController.doPrivileged(new Class2541(this));
   }

   public void method35486(int var1) {
      if (this.field43463 == null && this.field43465 != null) {
         this.method35485();
      }

      this.field43452.clear();
      ArrayList var4 = new ArrayList(this.field43455);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         Class6135 var6 = (Class6135)var4.get(var5);
         if (var6.method18942()) {
            var6.method18944(this, var1);
            if (this.field43462 && var6.method18946()) {
               this.field43452.add(var6);
               this.field43453.remove(var6);
            }
         }
      }

      this.field43455.removeAll(this.field43452);
      this.field43458 = 0;
      if (!this.field43453.isEmpty()) {
         for (Class6135 var10 : this.field43453.keySet()) {
            if (var10.method18942()) {
               Class9808 var7 = (Class9808)this.field43453.get(var10);

               for (int var8 = 0; var8 < var7.field45839.length; var8++) {
                  if (var7.field45839[var8].field21865 > 0.0F) {
                     var7.field45839[var8].method14472(var1);
                     this.field43458++;
                  }
               }
            }
         }
      }
   }

   public int method35487() {
      return this.field43458;
   }

   public Class4536 method35488(Class6135 var1, float var2) {
      Class9808 var5 = (Class9808)this.field43453.get(var1);
      ArrayList var6 = var5.field45840;
      if (var6.size() <= 0) {
         Log.warn("Ran out of particles (increase the limit)!");
         return this.field43456;
      } else {
         Class4536 var7 = (Class4536)var6.remove(var6.size() - 1);
         var7.method14473(var1, var2);
         var7.method14467(this.field43463);
         return var7;
      }
   }

   public void method35489(Class4536 var1) {
      if (var1 != this.field43456) {
         Class9808 var4 = (Class9808)this.field43453.get(var1.method14491());
         var4.field45840.add(var1);
      }
   }

   public void method35490(Class6135 var1) {
      if (!this.field43453.isEmpty()) {
         for (Class9808 var5 : this.field43453.values()) {
            for (int var6 = 0; var6 < var5.field45839.length; var6++) {
               if (var5.field45839[var6].method14470() && var5.field45839[var6].method14491() == var1) {
                  var5.field45839[var6].method14479(-1.0F);
                  this.method35489(var5.field45839[var6]);
               }
            }
         }
      }
   }

   public void method35491(Class6135 var1, float var2, float var3) {
      Class9808 var6 = (Class9808)this.field43453.get(var1);

      for (int var7 = 0; var7 < var6.field45839.length; var7++) {
         if (var6.field45839[var7].method14470()) {
            var6.field45839[var7].method14464(var2, var3);
         }
      }
   }

   public Class9365 method35492() throws Class2451 {
      for (int var3 = 0; var3 < this.field43455.size(); var3++) {
         if (!(this.field43455.get(var3) instanceof Class6134)) {
            throw new Class2451("Only systems contianing configurable emitters can be duplicated");
         }
      }

      Object var7 = null;

      try {
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         Class8273.method28892(var4, this);
         ByteArrayInputStream var5 = new ByteArrayInputStream(var4.toByteArray());
         return Class8273.method28886(var5);
      } catch (IOException var6) {
         Log.error("Failed to duplicate particle system");
         throw new Class2451("Unable to duplicated particle system", var6);
      }
   }

   // $VF: synthetic method
   public static Color method35493(Class9365 var0) {
      return var0.field43466;
   }

   // $VF: synthetic method
   public static Image method35494(Class9365 var0, Image var1) {
      return var0.field43463 = var1;
   }

   // $VF: synthetic method
   public static String method35495(Class9365 var0) {
      return var0.field43465;
   }

   // $VF: synthetic method
   public static String method35496(Class9365 var0, String var1) {
      return var0.field43465 = var1;
   }
}
