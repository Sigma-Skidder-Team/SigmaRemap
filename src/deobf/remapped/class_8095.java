package remapped;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashMap;
import org.newdawn.slick.SlickException;

public class class_8095 {
   public class_1299 field_41472 = class_3980.method_18363();
   public static final int field_41462 = 1;
   public static final int field_41463 = 2;
   private static final int field_41469 = 100;
   private ArrayList field_41471 = new ArrayList();
   public HashMap field_41474 = new HashMap();
   public int field_41473;
   public ArrayList field_41468 = new ArrayList();
   public class_168 field_41475;
   private int field_41479 = 2;
   private int field_41467;
   private boolean field_41465;
   private float field_41477;
   private float field_41461;
   private boolean field_41464 = true;
   private class_8112 field_41466;
   private boolean field_41460 = true;
   private String field_41476;
   private class_8709 field_41478;

   public static void method_36749(String var0) {
      class_487.method_2295(var0);
   }

   public class_8095(class_8112 var1) {
      this(var1, 100);
   }

   public class_8095(String var1) {
      this(var1, 100);
   }

   public void method_36775() {
      for (class_9755 var4 : this.field_41474.values()) {
         var4.method_45030(this);
      }

      for (int var6 = 0; var6 < this.field_41468.size(); var6++) {
         class_3377 var5 = (class_3377)this.field_41468.get(var6);
         var5.method_15567();
      }
   }

   public boolean method_36763() {
      return this.field_41460;
   }

   public void method_36762(boolean var1) {
      this.field_41460 = var1;
   }

   public void method_36753(boolean var1) {
      this.field_41464 = var1;
   }

   public void method_36750(boolean var1) {
      this.field_41465 = var1;
   }

   public boolean method_36760() {
      return this.field_41465;
   }

   public class_8095(String var1, int var2) {
      this(var1, var2, null);
   }

   public class_8095(String var1, int var2, class_8709 var3) {
      this.field_41473 = var2;
      this.field_41478 = var3;
      this.method_36764(var1);
      this.field_41475 = this.method_36774(this);
   }

   public class_8095(class_8112 var1, int var2) {
      this.field_41473 = var2;
      this.field_41466 = var1;
      this.field_41475 = this.method_36774(this);
   }

   public void method_36764(String var1) {
      this.field_41476 = var1;
      this.field_41466 = null;
   }

   public int method_36761() {
      return this.field_41479;
   }

   public class_168 method_36774(class_8095 var1) {
      return new class_168(var1);
   }

   public void method_36747(int var1) {
      this.field_41479 = var1;
   }

   public int method_36770() {
      return this.field_41468.size();
   }

   public class_3377 method_36778(int var1) {
      return (class_3377)this.field_41468.get(var1);
   }

   public void method_36752(class_3377 var1) {
      this.field_41468.add(var1);
      class_9755 var4 = new class_9755(this, this, this.field_41473);
      this.field_41474.put(var1, var4);
   }

   public void method_36769(class_3377 var1) {
      this.field_41468.remove(var1);
      this.field_41474.remove(var1);
   }

   public void method_36759() {
      for (int var3 = 0; var3 < this.field_41468.size(); var3++) {
         this.method_36769((class_3377)this.field_41468.get(var3));
         var3--;
      }
   }

   public float method_36777() {
      return this.field_41477;
   }

   public float method_36773() {
      return this.field_41461;
   }

   public void method_36758(float var1, float var2) {
      this.field_41477 = var1;
      this.field_41461 = var2;
   }

   public void method_36755() {
      this.method_36756(this.field_41477, this.field_41461);
   }

   public void method_36756(float var1, float var2) {
      if (this.field_41466 == null && this.field_41476 != null) {
         this.method_36768();
      }

      if (this.field_41460) {
         this.field_41472.method_5902(var1, var2, 0.0F);
         if (this.field_41479 == 1) {
            this.field_41472.method_5927(770, 1);
         }

         if (this.method_36760()) {
            this.field_41472.method_5911(2832);
            class_9162.method_42217();
         }

         for (int var5 = 0; var5 < this.field_41468.size(); var5++) {
            class_3377 var6 = (class_3377)this.field_41468.get(var5);
            if (var6.method_15577()) {
               if (var6.method_15572()) {
                  this.field_41472.method_5927(770, 1);
               }

               class_9755 var7 = (class_9755)this.field_41474.get(var6);
               class_8112 var8 = var6.method_15570();
               if (var8 == null) {
                  var8 = this.field_41466;
               }

               if (!var6.method_15573() && !var6.method_15568(this)) {
                  var8.method_36880();
               }

               for (int var9 = 0; var9 < var7.field_49557.length; var9++) {
                  if (var7.field_49557[var9].method_686()) {
                     var7.field_49557[var9].method_684();
                  }
               }

               if (!var6.method_15573() && !var6.method_15568(this)) {
                  var8.method_36878();
               }

               if (var6.method_15572()) {
                  this.field_41472.method_5927(770, 771);
               }
            }
         }

         if (this.method_36760()) {
            this.field_41472.method_5938(2832);
         }

         if (this.field_41479 == 1) {
            this.field_41472.method_5927(770, 771);
         }

         class_8709.field_44646.method_40021();
         this.field_41472.method_5902(-var1, -var2, 0.0F);
      }
   }

   private void method_36768() {
      AccessController.doPrivileged(new class_219(this));
   }

   public void method_36766(int var1) {
      if (this.field_41466 == null && this.field_41476 != null) {
         this.method_36768();
      }

      this.field_41471.clear();
      ArrayList var4 = new ArrayList(this.field_41468);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         class_3377 var6 = (class_3377)var4.get(var5);
         if (var6.method_15577()) {
            var6.method_15576(this, var1);
            if (this.field_41464 && var6.method_15569()) {
               this.field_41471.add(var6);
               this.field_41474.remove(var6);
            }
         }
      }

      this.field_41468.removeAll(this.field_41471);
      this.field_41467 = 0;
      if (!this.field_41474.isEmpty()) {
         for (class_3377 var10 : this.field_41474.keySet()) {
            if (var10.method_15577()) {
               class_9755 var7 = (class_9755)this.field_41474.get(var10);

               for (int var8 = 0; var8 < var7.field_49557.length; var8++) {
                  if (var7.field_49557[var8].field_518 > 0.0F) {
                     var7.field_49557[var8].method_699(var1);
                     this.field_41467++;
                  }
               }
            }
         }
      }
   }

   public int method_36779() {
      return this.field_41467;
   }

   public class_168 method_36765(class_3377 var1, float var2) {
      class_9755 var5 = (class_9755)this.field_41474.get(var1);
      ArrayList var6 = var5.field_49558;
      if (var6.size() <= 0) {
         class_2598.method_11777("Ran out of particles (increase the limit)!");
         return this.field_41475;
      } else {
         class_168 var7 = (class_168)var6.remove(var6.size() - 1);
         var7.method_670(var1, var2);
         var7.method_674(this.field_41466);
         return var7;
      }
   }

   public void method_36776(class_168 var1) {
      if (var1 != this.field_41475) {
         class_9755 var4 = (class_9755)this.field_41474.get(var1.method_697());
         var4.field_49558.add(var1);
      }
   }

   public void method_36754(class_3377 var1) {
      if (!this.field_41474.isEmpty()) {
         for (class_9755 var5 : this.field_41474.values()) {
            for (int var6 = 0; var6 < var5.field_49557.length; var6++) {
               if (var5.field_49557[var6].method_686() && var5.field_49557[var6].method_697() == var1) {
                  var5.field_49557[var6].method_671(-1.0F);
                  this.method_36776(var5.field_49557[var6]);
               }
            }
         }
      }
   }

   public void method_36767(class_3377 var1, float var2, float var3) {
      class_9755 var6 = (class_9755)this.field_41474.get(var1);

      for (int var7 = 0; var7 < var6.field_49557.length; var7++) {
         if (var6.field_49557[var7].method_686()) {
            var6.field_49557[var7].method_698(var2, var3);
         }
      }
   }

   public class_8095 method_36751() throws SlickException {
      for (int var3 = 0; var3 < this.field_41468.size(); var3++) {
         if (!(this.field_41468.get(var3) instanceof class_487)) {
            throw new class_1162("Only systems contianing configurable emitters can be duplicated");
         }
      }

      Object var7 = null;

      try {
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         class_4125.method_19165(var4, this);
         ByteArrayInputStream var5 = new ByteArrayInputStream(var4.toByteArray());
         return class_4125.method_19157(var5);
      } catch (IOException var6) {
         class_2598.method_11783("Failed to duplicate particle system");
         throw new class_1162("Unable to duplicated particle system", var6);
      }
   }
}
