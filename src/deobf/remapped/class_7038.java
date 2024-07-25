package remapped;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class class_7038 implements class_6482 {
   public String field_36268;
   public class_7038 field_36283;
   private final List<class_7038> field_36274 = new ArrayList<class_7038>();
   private final List<class_4726> field_36254 = new ArrayList<class_4726>();
   public int field_36270;
   public int field_36261;
   public int field_36278;
   public int field_36257;
   public float field_36286 = 1.0F;
   public float field_36280 = 1.0F;
   public int field_36281 = 0;
   public int field_36262 = 0;
   public boolean field_36260;
   public boolean field_36282;
   public boolean field_36276;
   public boolean field_36285;
   public boolean field_36277;
   public boolean field_36279;
   public boolean field_36267;
   public boolean field_36264;
   public boolean field_36255;
   public String field_36275;
   public class_3384 field_36258;
   public class_590 field_36272;
   private ArrayList<Runnable> field_36251 = new ArrayList<Runnable>();
   private final List<class_7038> field_36253 = new ArrayList<class_7038>();
   private boolean field_36259;
   private final List<class_7038> field_36252 = new ArrayList<class_7038>();
   private class_7038 field_36250;
   private final List<class_3022> field_36266 = new ArrayList<class_3022>();
   private final List<class_6204> field_36265 = new ArrayList<class_6204>();
   private final List<class_9680> field_36271 = new ArrayList<class_9680>();
   private final List<class_4613> field_36263 = new ArrayList<class_4613>();
   private final List<class_1874> field_36284 = new ArrayList<class_1874>();
   private int field_36256;
   private int field_36269;

   public class_7038(class_7038 var1, String var2) {
      this(var1, var2, 0, 0, 0, 0);
   }

   public class_7038(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      this(var1, var2, var3, var4, var5, var6, class_590.field_3421);
   }

   public class_7038(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7) {
      this(var1, var2, var3, var4, var5, var6, var7, null);
   }

   public class_7038(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, class_5320.field_27141);
   }

   public class_7038(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, class_3384 var9) {
      this.field_36268 = var2;
      this.field_36283 = var1;
      this.field_36270 = var3;
      this.field_36261 = var4;
      this.field_36278 = var5;
      this.field_36257 = var6;
      this.field_36275 = var8;
      this.field_36272 = var7;
      this.field_36258 = var9;
      this.field_36260 = true;
      this.field_36282 = true;
      this.field_36264 = true;
      this.field_36255 = false;
   }

   private void method_32149() {
      for (class_7038 var5 : new ArrayList<class_7038>(this.field_36274)) {
         if (var5.method_32096()) {
            this.field_36274.remove(var5);
            this.field_36274.add(var5);
         }

         if (var5.method_32114()) {
            this.field_36274.remove(var5);
            this.field_36274.add(0, var5);
         }
      }
   }

   public class_7038 method_32094(String var1) {
      for (class_7038 var5 : this.field_36274) {
         if (var5.method_32176().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   public void method_32102(Runnable var1) {
      synchronized (this) {
         if (var1 != null) {
            this.field_36251.add(var1);
         }
      }
   }

   private void method_32170() {
      for (class_7038 var4 : this.field_36252) {
         this.field_36274.remove(var4);
         if (this.field_36250 == var4) {
            this.field_36250 = null;
         }
      }

      this.field_36253.clear();

      for (class_7038 var6 : this.field_36253) {
         this.field_36274.add(var6);
      }

      this.field_36253.clear();
      if (this.field_36250 != null) {
         this.field_36274.remove(this.field_36250);
         this.field_36274.add(this.field_36250);
      }

      this.method_32149();
   }

   public void method_32145(int var1, int var2) {
      this.field_36269 = var2;
      this.field_36256 = var1;
      this.field_36279 = this.method_32147() && this.method_32156(var1, var2);

      for (int var5 = 0; var5 < this.field_36251.size(); var5++) {
         Runnable var6 = this.field_36251.get(var5);
         if (var6 != null) {
            var6.run();
         }
      }

      this.field_36251.clear();
      this.field_36259 = true;

      try {
         for (class_7038 var10 : this.field_36274) {
            var10.method_32145(var1, var2);
         }
      } catch (ConcurrentModificationException var7) {
         var7.printStackTrace();
         SigmaMainClass.method_3306().method_12864("FUCK! Why does this shit happen");
      }

      this.field_36267 = this.field_36267 & this.field_36279;

      for (class_4726 var11 : this.method_32123()) {
         if (this.field_36260) {
            var11.method_21840(this, this.method_32167());
         }
      }

      this.method_32170();
      this.field_36259 = false;
   }

   public void method_32190() {
      GL11.glTranslatef((float)(this.method_32132() + this.method_32109() / 2), (float)(this.method_32173() + this.method_32137() / 2), 0.0F);
      GL11.glScalef(this.method_32191(), this.method_32152(), 0.0F);
      GL11.glTranslatef((float)(-this.method_32132() - this.method_32109() / 2), (float)(-this.method_32173() - this.method_32137() / 2), 0.0F);
   }

   public void method_32130() {
      GL11.glTranslatef((float)this.method_32181(), (float)this.method_32164(), 0.0F);
   }

   public void method_32178(float var1) {
      this.method_32182(var1);
   }

   public final void method_32182(float var1) {
      class_1920.method_8741();
      GL11.glAlphaFunc(519, 0.0F);
      GL11.glTranslatef((float)this.method_32132(), (float)this.method_32173(), 0.0F);

      for (class_7038 var5 : this.field_36274) {
         if (var5.method_32126()) {
            GL11.glPushMatrix();
            var5.method_32178(var1);
            GL11.glPopMatrix();
         }
      }
   }

   public boolean method_32121() {
      for (class_7038 var4 : this.method_32134()) {
         if (var4 instanceof class_3004 && var4.field_36276) {
            return true;
         }

         if (var4.method_32121()) {
            return true;
         }
      }

      return false;
   }

   public void method_32110(int var1) {
      for (class_7038 var5 : this.field_36274) {
         if (var5.method_32140() && var5.method_32126()) {
            var5.method_32110(var1);
         }
      }
   }

   @Override
   public void method_29507(char var1) {
      for (class_7038 var5 : this.field_36274) {
         if (var5.method_32140() && var5.method_32126()) {
            var5.method_29507(var1);
         }
      }

      this.method_32168(var1);
   }

   @Override
   public void method_29509(int var1) {
      for (class_7038 var5 : this.field_36274) {
         if (var5.method_32140() && var5.method_32126()) {
            var5.method_29509(var1);
         }
      }

      this.method_32122(var1);
   }

   @Override
   public boolean method_29508(int var1, int var2, int var3) {
      boolean var6 = false;

      for (int var7 = this.field_36274.size() - 1; var7 >= 0; var7--) {
         class_7038 var8 = this.field_36274.get(var7);
         boolean var9 = var8.method_32167() != null
            && var8.method_32167() instanceof class_2612
            && var8.method_32167().method_32120(var1, var2)
            && var8.method_32167().method_32126()
            && var8.method_32167().method_32140();
         if (var6 || !var8.method_32140() || !var8.method_32126() || !var8.method_32120(var1, var2) && !var9) {
            var8.method_32177(false);
            if (var8 != null) {
               for (class_7038 var12 : var8.method_32134()) {
                  var12.method_32177(false);
               }
            }
         } else {
            var8.method_29508(var1, var2, var3);
            var6 = !var9;
         }
      }

      if (!var6) {
         this.field_36267 = this.field_36279 = true;
         this.method_32162();
         this.method_32151(var3);
         return false;
      } else {
         return true;
      }
   }

   @Override
   public void method_29505(int var1, int var2, int var3) {
      this.field_36279 = this.method_32120(var1, var2);

      for (class_7038 var7 : this.field_36274) {
         if (var7.method_32140() && var7.method_32126()) {
            var7.method_29505(var1, var2, var3);
         }
      }

      this.method_32171(var3);
      if (this.method_32185() && this.method_32183()) {
         this.method_29506(var1, var2, var3);
      }

      this.field_36267 = false;
   }

   @Override
   public void method_29506(int var1, int var2, int var3) {
      this.method_32154(var3);
   }

   @Override
   public void method_29510(float var1) {
      for (class_7038 var5 : this.field_36274) {
         if (var5.method_32140() && var5.method_32126()) {
            var5.method_29510(var1);
         }
      }
   }

   public boolean method_32120(int var1, int var2) {
      var1 -= this.method_32155();
      var2 -= this.method_32093();
      return var1 >= 0 && var1 <= this.field_36278 && var2 >= 0 && var2 <= this.field_36257;
   }

   public boolean method_32157(int var1, int var2, boolean var3) {
      boolean var6 = this.method_32120(var1, var2);
      if (var6 && this.field_36283 != null) {
         if (var3) {
            for (class_7038 var8 : this.method_32134()) {
               if (var8.method_32126() && var8.method_32120(var1, var2)) {
                  return false;
               }
            }
         }

         class_7038 var11 = this;

         for (class_7038 var12 = this.method_32167(); var12 != null; var12 = var12.method_32167()) {
            for (int var9 = var12.method_32092(var11) + 1; var9 < var12.method_32134().size(); var9++) {
               class_7038 var10 = var12.method_32134().get(var9);
               if (var10 != var11 && var10.method_32126() && var10.method_32120(var1, var2)) {
                  return false;
               }
            }

            var11 = var12;
         }
      }

      return var6;
   }

   public boolean method_32156(int var1, int var2) {
      return this.method_32157(var1, var2, true);
   }

   public void method_32148(class_7038 var1) {
      if (var1 != null) {
         for (class_7038 var5 : this.method_32134()) {
            if (var5.method_32176().equals(var1.method_32176())) {
               throw new RuntimeException(
                  "Children with duplicate IDs! Child with id \"" + var5.method_32176() + "\" already exists in view \"" + this.method_32176() + "\"!"
               );
            }
         }

         var1.method_32192(this);
         if (this.field_36259) {
            this.field_36253.add(var1);
         } else {
            try {
               this.field_36274.add(var1);
            } catch (ConcurrentModificationException var6) {
               this.field_36253.add(var1);
            }
         }
      }
   }

   public boolean method_32115(String var1) {
      for (class_7038 var5 : this.method_32134()) {
         if (var5.method_32176().equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public void method_32095(class_7038 var1) {
      if (var1 != null) {
         for (class_7038 var5 : this.method_32134()) {
            if (var5.method_32176().equals(var1.method_32176())) {
               throw new RuntimeException("Children with duplicate IDs!");
            }
         }

         var1.method_32192(this);
         this.field_36253.add(var1);
      }
   }

   public void method_32150(class_7038 var1) {
      if (var1 != null) {
         for (class_7038 var5 : this.method_32134()) {
            if (var5.method_32176().equals(var1.method_32176())) {
               throw new RuntimeException("Children with duplicate IDs!");
            }
         }

         var1.method_32192(this);

         try {
            this.field_36274.add(var1);
         } catch (ConcurrentModificationException var6) {
         }
      }
   }

   public void method_32101(class_7038 var1) {
      if (this.field_36259) {
         this.field_36252.add(var1);
      } else {
         this.method_32179(var1);
      }
   }

   public void method_32174(class_7038 var1) {
      this.field_36252.add(var1);
   }

   public void method_32179(class_7038 var1) {
      this.field_36274.remove(var1);
      if (this.field_36250 != null && this.field_36250.equals(var1)) {
         this.field_36250 = null;
      }

      if (this.field_36253.contains(var1)) {
         this.field_36253.remove(var1);
      }
   }

   public void method_32106(class_7038 var1) {
      for (class_7038 var5 : this.method_32134()) {
         if (var5.field_36268.equals(var1.field_36268)) {
            this.method_32101(var5);
         }
      }
   }

   public void method_32161() {
      this.field_36274.clear();
   }

   public boolean method_32116(class_7038 var1) {
      return this.field_36274.contains(var1);
   }

   public int method_32092(class_7038 var1) {
      return this.field_36274.indexOf(var1);
   }

   public List<class_7038> method_32134() {
      return this.field_36274;
   }

   public void method_32162() {
      this.method_32177(true);
      if (this.field_36283 != null) {
         this.field_36283.field_36250 = this;
         this.field_36283.method_32162();
      }
   }

   public void method_32141() {
      for (class_7038 var4 : this.field_36283.method_32134()) {
         if (var4 == this) {
            return;
         }

         var4.method_32162();
      }
   }

   public void method_32107() {
      this.field_36274.clear();
   }

   public class_1293 method_32180(class_1293 var1) {
      if (this.method_32166()) {
         var1.method_5820("id", this.method_32176());
         var1.method_5818("x", this.method_32132());
         var1.method_5818("y", this.method_32173());
         if (this.method_32099()) {
            var1.method_5818("width", this.method_32109());
            var1.method_5818("height", this.method_32137());
         }

         var1.method_5818("index", this.field_36283 == null ? 0 : this.field_36283.method_32092(this));
         return this.method_32125(var1);
      } else {
         return var1;
      }
   }

   public final class_1293 method_32125(class_1293 var1) {
      class_1336 var4 = new class_1336();

      for (class_7038 var6 : this.field_36274) {
         if (var6.method_32166()) {
            class_1293 var7 = var6.method_32180(new class_1293());
            if (var7.method_5806() > 0) {
               var4.method_6159(var7);
            }
         }
      }

      var1.method_5820("children", var4);
      return var1;
   }

   public void method_32159(class_1293 var1) {
      if (this.method_32166()) {
         this.field_36270 = class_3332.method_15289(var1, "x", this.field_36270);
         this.field_36261 = class_3332.method_15289(var1, "y", this.field_36261);
         if (this.method_32099()) {
            this.field_36278 = class_3332.method_15289(var1, "width", this.field_36278);
            this.field_36257 = class_3332.method_15289(var1, "height", this.field_36257);
         }

         class_1336 var4 = class_3332.method_15293(var1, "children");
         Iterator var5 = var1.method_5831().iterator();
         if (var4 != null) {
            ArrayList var6 = new ArrayList<class_7038>(this.field_36274);

            for (int var7 = 0; var7 < var4.method_6142(); var7++) {
               class_1293 var8 = var4.method_6143(var7);
               String var9 = class_3332.method_15291(var8, "id", null);
               int var10 = class_3332.method_15289(var8, "index", -1);

               for (class_7038 var12 : var6) {
                  if (var12.method_32176().equals(var9)) {
                     var12.method_32159(var8);
                     if (var10 >= 0) {
                        this.field_36274.remove(var12);
                        if (var10 > this.field_36274.size()) {
                           this.field_36274.add(var12);
                        } else {
                           this.field_36274.add(var10, var12);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_7038)) {
            return false;
         } else {
            class_7038 var4 = (class_7038)var1;
            return this.field_36268.equals(var4.field_36268) && (this.method_32167() == null || this.method_32167().equals(var4.method_32167()));
         }
      } else {
         return true;
      }
   }

   public void method_32153(class_4617 var1) {
      var1.method_21389(this);
   }

   public final class_7038 method_32184(class_3022 var1) {
      this.field_36266.add(var1);
      return this;
   }

   public void method_32151(int var1) {
      for (class_3022 var5 : this.field_36266) {
         var5.method_13805(this, var1);
      }
   }

   public class_7038 method_32136(class_6204 var1) {
      this.field_36265.add(var1);
      return this;
   }

   public void method_32171(int var1) {
      for (class_6204 var5 : this.field_36265) {
         var5.method_28398(this, var1);
      }
   }

   public class_7038 method_32100(class_9680 var1) {
      this.field_36271.add(var1);
      return this;
   }

   public void method_32154(int var1) {
      for (class_9680 var5 : this.field_36271) {
         var5.method_44753(this, var1);
      }
   }

   public final class_7038 method_32143(class_4613 var1) {
      this.field_36263.add(var1);
      return this;
   }

   public void method_32122(int var1) {
      for (class_4613 var5 : this.field_36263) {
         var5.method_21380(this, var1);
      }
   }

   public final class_7038 method_32131(class_1874 var1) {
      this.field_36284.add(var1);
      return this;
   }

   public void method_32168(char var1) {
      for (class_1874 var5 : this.field_36284) {
         var5.method_8378(var1);
      }
   }

   public String method_32176() {
      return this.field_36268;
   }

   public class_7038 method_32167() {
      return this.field_36283;
   }

   public void method_32192(class_7038 var1) {
      this.field_36283 = var1;
   }

   public List<class_4726> method_32123() {
      return this.field_36254;
   }

   public void method_32135(class_4726 var1) {
      this.field_36254.add(var1);
   }

   public void method_32169(class_4726 var1) {
      this.field_36254.remove(var1);
   }

   public int method_32132() {
      return this.field_36270;
   }

   public void method_32175(int var1) {
      this.field_36270 = var1;
   }

   public int method_32173() {
      return this.field_36261;
   }

   public void method_32117(int var1) {
      this.field_36261 = var1;
   }

   public int method_32109() {
      return this.field_36278;
   }

   public void method_32142(int var1) {
      this.field_36278 = var1;
   }

   public int method_32137() {
      return this.field_36257;
   }

   public void method_32158(int var1) {
      this.field_36257 = var1;
   }

   public int method_32155() {
      return this.field_36283 == null ? this.field_36270 : this.field_36283.method_32155() + this.field_36270;
   }

   public int method_32093() {
      return this.field_36283 == null ? this.field_36261 : this.field_36283.method_32093() + this.field_36261;
   }

   public float method_32191() {
      return this.field_36286;
   }

   public float method_32160() {
      return this.method_32167() == null ? this.method_32191() : this.method_32167().method_32160() * this.method_32191();
   }

   public float method_32152() {
      return this.field_36280;
   }

   public float method_32172() {
      return this.method_32167() == null ? this.method_32152() : this.method_32167().method_32172() * this.method_32152();
   }

   public void method_32133(float var1) {
      this.field_36286 = var1;
   }

   public void method_32146(float var1) {
      this.field_36280 = var1;
   }

   public void method_32111(float var1, float var2) {
      this.field_36286 = var1;
      this.field_36280 = var2;
   }

   public int method_32181() {
      return this.field_36281;
   }

   public int method_32112() {
      return this.method_32167() == null ? this.method_32181() : this.method_32167().method_32112() * this.method_32181();
   }

   public int method_32164() {
      return this.field_36262;
   }

   public int method_32108() {
      return this.method_32167() == null ? this.method_32164() : this.method_32167().method_32108() * this.method_32164();
   }

   public void method_32188(int var1) {
      this.field_36281 = var1;
   }

   public void method_32124(int var1) {
      this.field_36262 = var1;
   }

   public void method_32138(int var1, int var2) {
      this.field_36281 = var1;
      this.field_36262 = var2;
   }

   public boolean method_32126() {
      return this.field_36260;
   }

   public void method_32104(boolean var1) {
      this.field_36260 = var1;
   }

   public boolean method_32147() {
      return this.field_36283 == null ? this.field_36260 : this.field_36260 && this.field_36283.method_32147();
   }

   public void method_32128(boolean var1) {
      this.field_36260 = var1;
      if (this.field_36283 != null) {
         this.field_36283.method_32128(var1);
      }
   }

   public boolean method_32096() {
      return this.field_36285;
   }

   public void method_32187(boolean var1) {
      this.field_36285 = var1;
   }

   public boolean method_32114() {
      return this.field_36277;
   }

   public void method_32091(boolean var1) {
      this.field_36277 = var1;
   }

   public boolean method_32140() {
      return this.field_36282;
   }

   public void method_32119(boolean var1) {
      this.field_36282 = var1;
   }

   public boolean method_32098() {
      return this.field_36276;
   }

   public void method_32177(boolean var1) {
      this.field_36276 = var1;
   }

   public boolean method_32183() {
      return this.field_36279;
   }

   public boolean method_32185() {
      return this.field_36267;
   }

   public boolean method_32166() {
      return this.field_36264;
   }

   public void method_32105(boolean var1) {
      this.field_36264 = var1;
   }

   public boolean method_32099() {
      return this.field_36255;
   }

   public void method_32103(boolean var1) {
      this.field_36255 = var1;
   }

   public String method_32165() {
      return this.field_36275;
   }

   public void method_32186(String var1) {
      this.field_36275 = var1;
   }

   public class_3384 method_32097() {
      return this.field_36258;
   }

   public void method_32144(class_3384 var1) {
      this.field_36258 = var1;
   }

   public class_590 method_32139() {
      return this.field_36272;
   }

   public void method_32113(class_590 var1) {
      this.field_36272 = var1;
   }

   public int method_32189() {
      return this.field_36256;
   }

   public int method_32129() {
      return this.field_36269;
   }

   public void method_32127(int var1) {
      this.field_36256 = var1;
   }

   public void method_32118(int var1) {
      this.field_36269 = var1;
   }
}
