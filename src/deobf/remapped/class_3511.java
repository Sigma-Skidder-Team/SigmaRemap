package remapped;

import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class class_3511 {
   public final AtomicReference<class_8845> field_17205;
   private class_7886 field_17204;
   private class_7240 field_17217;
   private final Set<class_3757> field_17216;
   private final Map<class_3581, class_7995> field_17199;
   public class_4092 field_17221;
   private int field_17213;
   private boolean field_17210;
   private final class_2921 field_17223;
   private final class_2921[] field_17209;
   private boolean field_17227;
   private final boolean field_17226;
   private final boolean field_17214;
   private boolean field_17218;
   private boolean field_17212;
   public int field_17207;
   public int field_17222;
   private int field_17202;
   private int field_17203;
   private int field_17211;
   private final class_3511[] field_17219;
   private boolean field_17200;
   private class_2654 field_17198;
   private class_3511[] field_17224;
   private class_3511[] field_17215;
   private boolean field_17220;
   private class_1261 field_17208;
   public class_682 field_17201;

   public class_3511(class_6705 var1) {
      this.field_17225 = var1;
      this.field_17205 = new AtomicReference<class_8845>(class_8845.field_45235);
      this.field_17216 = Sets.newHashSet();
      this.field_17199 = class_3581.method_16770().stream().collect(Collectors.toMap(var0 -> (class_3581)var0, var0 -> new class_7995(class_7985.field_40918)));
      this.field_17213 = -1;
      this.field_17210 = true;
      this.field_17223 = new class_2921(-1, -1, -1);
      this.field_17209 = Util.<class_2921[]>method_44659(new class_2921[6], var0 -> {
         for (int var3 = 0; var3 < var0.length; var3++) {
            var0[var3] = new class_2921();
         }
      });
      this.field_17226 = class_3111.method_14397();
      this.field_17214 = !class_7860.field_40181.method_45472();
      this.field_17218 = false;
      this.field_17212 = class_3111.method_14351();
      this.field_17219 = new class_3511[6];
      this.field_17200 = false;
      this.field_17224 = new class_3511[class_240.field_803.length];
      this.field_17215 = new class_3511[class_240.field_803.length];
      this.field_17220 = false;
      this.field_17208 = new class_1261(this, (class_240)null, 0);
   }

   private boolean method_16158(class_1331 var1) {
      return class_6705.method_30723(this.field_17225).method_22555(var1.method_12173() >> 4, var1.method_12185() >> 4, class_7335.field_37514, false) != null;
   }

   public boolean method_16154() {
      byte var3 = 24;
      if (Math.sqrt(this.method_16184()) <= (double)(MinecraftClient.getInstance().field_9577.field_45537 * 16)
         && SigmaMainClass.method_3328().method_3313().method_8231()) {
         return true;
      } else {
         return !(this.method_16184() > 576.0)
            ? true
            : this.method_16158(this.field_17209[class_240.field_809.ordinal()])
               && this.method_16158(this.field_17209[class_240.field_818.ordinal()])
               && this.method_16158(this.field_17209[class_240.field_804.ordinal()])
               && this.method_16158(this.field_17209[class_240.field_800.ordinal()]);
      }
   }

   public boolean method_16187(int var1) {
      if (this.field_17213 != var1) {
         this.field_17213 = var1;
         return true;
      } else {
         return false;
      }
   }

   public class_7995 method_16180(class_3581 var1) {
      return this.field_17199.get(var1);
   }

   public void method_16163(int var1, int var2, int var3) {
      if (var1 != this.field_17223.method_12173() || var2 != this.field_17223.method_12165() || var3 != this.field_17223.method_12185()) {
         this.method_16176();
         this.field_17223.method_13362(var1, var2, var3);
         if (this.field_17212) {
            byte var6 = 8;
            this.field_17207 = var1 >> var6 << var6;
            this.field_17222 = var3 >> var6 << var6;
            this.field_17202 = var1 - this.field_17207;
            this.field_17203 = var2;
            this.field_17211 = var3 - this.field_17222;
         }

         this.field_17221 = new class_4092((double)var1, (double)var2, (double)var3, (double)(var1 + 16), (double)(var2 + 16), (double)(var3 + 16));

         for (class_240 var9 : class_240.field_803) {
            this.field_17209[var9.ordinal()].method_13364(this.field_17223).method_13369(var9, 16);
         }

         this.field_17200 = false;
         this.field_17220 = false;

         for (int var11 = 0; var11 < this.field_17224.length; var11++) {
            class_3511 var12 = this.field_17224[var11];
            if (var12 != null) {
               var12.field_17220 = false;
            }
         }

         this.field_17198 = null;
         this.field_17201 = null;
      }
   }

   public double method_16184() {
      class_9071 var3 = MinecraftClient.getInstance().gameRenderer.method_35949();
      double var4 = this.field_17221.field_19941 + 8.0 - var3.method_41627().field_7336;
      double var6 = this.field_17221.field_19937 + 8.0 - var3.method_41627().field_7333;
      double var8 = this.field_17221.field_19938 + 8.0 - var3.method_41627().field_7334;
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   private void method_16161(class_9633 var1) {
      var1.method_44471(7, class_7985.field_40918);
   }

   public class_8845 method_16150() {
      return this.field_17205.get();
   }

   private void method_16176() {
      this.method_16162();
      this.field_17205.set(class_8845.field_45235);
      this.field_17210 = true;
   }

   public void method_16167() {
      this.method_16176();
      this.field_17199.values().forEach(class_7995::close);
   }

   public class_1331 method_16189() {
      return this.field_17223;
   }

   public void method_16169(boolean var1) {
      boolean var4 = this.field_17210;
      this.field_17210 = true;
      this.field_17227 = var1 | (var4 && this.field_17227);
      if (this.method_16168()) {
         this.field_17218 = true;
      }
   }

   public void method_16135() {
      this.field_17210 = false;
      this.field_17227 = false;
      this.field_17218 = false;
   }

   public boolean method_16181() {
      return this.field_17210;
   }

   public boolean method_16137() {
      return this.field_17210 && this.field_17227;
   }

   public class_1331 method_16143(class_240 var1) {
      return this.field_17209[var1.ordinal()];
   }

   public boolean method_16157(class_3581 var1, class_6705 var2) {
      class_8845 var5 = this.method_16150();
      if (this.field_17217 != null) {
         this.field_17217.method_19131();
      }

      if (class_8845.method_40701(var5).contains(var1)) {
         if (!class_6705.method_30745()) {
            this.field_17217 = new class_7240(this, this.method_16184(), var5);
         } else {
            this.field_17217 = new class_7240(this, new class_2034(this.method_16189()), this.method_16184(), var5);
         }

         var2.method_30735(this.field_17217);
         return true;
      } else {
         return false;
      }
   }

   public void method_16162() {
      if (this.field_17204 != null) {
         this.field_17204.method_19131();
         this.field_17204 = null;
      }

      if (this.field_17217 != null) {
         this.field_17217.method_19131();
         this.field_17217 = null;
      }
   }

   public class_4117 method_16142() {
      this.method_16162();
      class_1331 var3 = this.field_17223.method_6072();
      boolean var4 = true;
      Object var5 = null;
      if (!class_6705.method_30745()) {
         this.field_17204 = new class_7886(this, this.method_16184(), (class_7850)var5);
      } else {
         this.field_17204 = new class_7886(this, new class_2034(this.method_16189()), this.method_16184(), (class_7850)var5);
      }

      return this.field_17204;
   }

   public void method_16185(class_6705 var1) {
      class_4117 var4 = this.method_16142();
      var1.method_30735(var4);
   }

   private void method_16178(Set<class_3757> var1) {
      HashSet var4 = Sets.newHashSet(var1);
      HashSet var5 = Sets.newHashSet(this.field_17216);
      var4.removeAll(this.field_17216);
      var5.removeAll(var1);
      this.field_17216.clear();
      this.field_17216.addAll(var1);
      class_6705.method_30741(this.field_17225).method_20007(var5, var4);
   }

   public void method_16147() {
      class_4117 var3 = this.method_16142();
      var3.method_19129(class_6705.method_30738(this.field_17225));
   }

   private boolean method_16168() {
      if (!(class_6705.method_30723(this.field_17225) instanceof class_174)) {
         return false;
      } else {
         class_174 var3 = (class_174)class_6705.method_30723(this.field_17225);
         return var3.method_747();
      }
   }

   public boolean method_16160() {
      return this.field_17218;
   }

   private class_3581[] method_16141(class_4774 var1, class_3581[] var2) {
      if (!class_6705.method_30746()) {
         var2[0] = class_6416.method_29333(var1);
         return var2;
      } else {
         return class_6705.field_34622;
      }
   }

   private class_3581[] method_16146(class_2522 var1, class_3581[] var2) {
      if (!class_6705.method_30734()) {
         var2[0] = class_6416.method_29330(var1);
         return var2;
      } else {
         return class_6705.field_34622;
      }
   }

   private class_3581 method_16164(class_6163 var1, class_2522 var2, class_1331 var3, class_3581 var4) {
      if (class_1303.method_5952()) {
         class_3581 var7 = class_1303.method_5950(var1, var2, var3);
         if (var7 != null) {
            return var7;
         }
      }

      if (this.field_17214) {
         if (!this.field_17226) {
            if (var4 == class_6727.field_34746) {
               return class_6727.field_34743;
            }
         } else if (var4 == class_6727.field_34743) {
            class_6414 var8 = var2.method_8360();
            if (!(var8 instanceof class_9301)) {
               if (!(var8 instanceof class_4309)) {
                  return class_6727.field_34746;
               }

               return var4;
            }

            return var4;
         }

         return var4;
      } else {
         return var4;
      }
   }

   private void method_16151(class_2848 var1, class_8845 var2) {
      this.method_16171(class_6727.field_34743, var1, var2);
      this.method_16171(class_6727.field_34746, var1, var2);
      this.method_16171(class_6727.field_34740, var1, var2);
   }

   private void method_16171(class_3581 var1, class_2848 var2, class_8845 var3) {
      class_9633 var6 = var2.method_12956(var1);
      if (var6.method_44474()) {
         var3.method_40689(var1);
         if (var6.method_44478() > 0) {
            var3.method_40697(var1);
         }
      }
   }

   private class_1680 method_16172(class_1331 var1) {
      class_1331 var4 = var1.method_6104(-1, -1, -1);
      class_1331 var5 = var1.method_6104(16, 16, 16);
      class_7850 var6 = this.method_16173(class_6705.method_30723(this.field_17225), var4, var5, 1);
      return new class_1680(var6, var4, var5, 1);
   }

   public class_7850 method_16173(class_6486 var1, class_1331 var2, class_1331 var3, int var4) {
      return class_7850.method_35516(var1, var2, var3, var4, false);
   }

   public class_3511 method_16138(class_7626 var1, class_240 var2) {
      if (!this.field_17200) {
         for (int var5 = 0; var5 < class_240.field_803.length; var5++) {
            class_240 var6 = class_240.field_803[var5];
            class_1331 var7 = this.method_16143(var6);
            this.field_17219[var5] = var1.method_34563(var7);
         }

         this.field_17200 = true;
      }

      return this.field_17219[var2.ordinal()];
   }

   public class_2654 method_16174() {
      return this.method_16175(this.field_17223);
   }

   private class_2654 method_16175(class_1331 var1) {
      class_2654 var4 = this.field_17198;
      if (var4 != null && class_5475.method_24889(var4)) {
         return var4;
      } else {
         var4 = class_6705.method_30723(this.field_17225).method_29542(var1);
         this.field_17198 = var4;
         return var4;
      }
   }

   public boolean method_16182() {
      return this.method_16183(this.field_17223);
   }

   private boolean method_16183(class_1331 var1) {
      int var4 = var1.method_12165();
      int var5 = var4 + 15;
      return this.method_16175(var1).method_27368(var4, var5);
   }

   public void method_16139(class_240 var1, class_3511 var2) {
      this.field_17224[var1.ordinal()] = var2;
      this.field_17215[var1.ordinal()] = var2;
   }

   public class_3511 method_16165(class_240 var1) {
      if (!this.field_17220) {
         this.method_16186();
      }

      return this.field_17215[var1.ordinal()];
   }

   public class_1261 method_16166() {
      return this.field_17208;
   }

   private void method_16186() {
      int var3 = this.method_16189().method_12173();
      int var4 = this.method_16189().method_12185();
      int var5 = class_240.field_818.ordinal();
      int var6 = class_240.field_800.ordinal();
      int var7 = class_240.field_809.ordinal();
      int var8 = class_240.field_804.ordinal();
      this.field_17215[var5] = this.field_17224[var5].method_16189().method_12185() != var4 - 16 ? null : this.field_17224[var5];
      this.field_17215[var6] = this.field_17224[var6].method_16189().method_12185() != var4 + 16 ? null : this.field_17224[var6];
      this.field_17215[var7] = this.field_17224[var7].method_16189().method_12173() != var3 - 16 ? null : this.field_17224[var7];
      this.field_17215[var8] = this.field_17224[var8].method_16189().method_12173() != var3 + 16 ? null : this.field_17224[var8];
      this.field_17220 = true;
   }

   public boolean method_16156(class_2336 var1, int var2) {
      return !this.method_16155().method_3097(var1, var2) ? var1.method_10689(this.field_17221) : true;
   }

   public class_682 method_16155() {
      if (this.field_17201 == null) {
         class_1331 var3 = this.method_16189();
         int var4 = var3.method_12173();
         int var5 = var3.method_12165();
         int var6 = var3.method_12185();
         byte var7 = 5;
         int var8 = var4 >> var7 << var7;
         int var9 = var5 >> var7 << var7;
         int var10 = var6 >> var7 << var7;
         if (var8 != var4 || var9 != var5 || var10 != var6) {
            class_682 var11 = class_6705.method_30741(this.field_17225).method_20068(new class_1331(var8, var9, var10)).method_16155();
            if (var11 != null && var11.field_19941 == (double)var8 && var11.field_19937 == (double)var9 && var11.field_19938 == (double)var10) {
               this.field_17201 = var11;
            }
         }

         if (this.field_17201 == null) {
            int var12 = 1 << var7;
            this.field_17201 = new class_682((double)var8, (double)var9, (double)var10, (double)(var8 + var12), (double)(var9 + var12), (double)(var10 + var12));
         }
      }

      return this.field_17201;
   }

   @Override
   public String toString() {
      return "pos: " + this.method_16189() + ", frameIndex: " + this.field_17213;
   }
}
