package remapped;

public class class_8014 {
   private final class_6098 field_41051;
   private final class_6098 field_41050;
   private final class_6098 field_41052;
   private int field_41048;
   private final int field_41047;
   private boolean field_41053 = true;
   private int field_41045;
   private int field_41046;
   private float field_41044;
   private int field_41049 = 1;

   public class_8014(class_5734 var1) {
      this.field_41051 = class_6098.method_28015(var1.method_25937("buy"));
      this.field_41050 = class_6098.method_28015(var1.method_25937("buyB"));
      this.field_41052 = class_6098.method_28015(var1.method_25937("sell"));
      this.field_41048 = var1.method_25947("uses");
      if (!var1.method_25939("maxUses", 99)) {
         this.field_41047 = 4;
      } else {
         this.field_41047 = var1.method_25947("maxUses");
      }

      if (var1.method_25939("rewardExp", 1)) {
         this.field_41053 = var1.method_25933("rewardExp");
      }

      if (var1.method_25939("xp", 3)) {
         this.field_41049 = var1.method_25947("xp");
      }

      if (var1.method_25939("priceMultiplier", 5)) {
         this.field_41044 = var1.method_25955("priceMultiplier");
      }

      this.field_41045 = var1.method_25947("specialPrice");
      this.field_41046 = var1.method_25947("demand");
   }

   public class_8014(class_6098 var1, class_6098 var2, int var3, int var4, float var5) {
      this(var1, class_6098.field_31203, var2, var3, var4, var5);
   }

   public class_8014(class_6098 var1, class_6098 var2, class_6098 var3, int var4, int var5, float var6) {
      this(var1, var2, var3, 0, var4, var5, var6);
   }

   public class_8014(class_6098 var1, class_6098 var2, class_6098 var3, int var4, int var5, int var6, float var7) {
      this(var1, var2, var3, var4, var5, var6, var7, 0);
   }

   public class_8014(class_6098 var1, class_6098 var2, class_6098 var3, int var4, int var5, int var6, float var7, int var8) {
      this.field_41051 = var1;
      this.field_41050 = var2;
      this.field_41052 = var3;
      this.field_41048 = var4;
      this.field_41047 = var5;
      this.field_41049 = var6;
      this.field_41044 = var7;
      this.field_41046 = var8;
   }

   public class_6098 method_36365() {
      return this.field_41051;
   }

   public class_6098 method_36372() {
      int var3 = this.field_41051.method_27997();
      class_6098 var4 = this.field_41051.method_27973();
      int var5 = Math.max(0, class_9299.method_42848((float)(var3 * this.field_41046) * this.field_41044));
      var4.method_28017(class_9299.method_42829(var3 + var5 + this.field_41045, 1, this.field_41051.method_27960().method_11245()));
      return var4;
   }

   public class_6098 method_36377() {
      return this.field_41050;
   }

   public class_6098 method_36362() {
      return this.field_41052;
   }

   public void method_36382() {
      this.field_41046 = this.field_41046 + this.field_41048 - (this.field_41047 - this.field_41048);
   }

   public class_6098 method_36371() {
      return this.field_41052.method_27973();
   }

   public int method_36366() {
      return this.field_41048;
   }

   public void method_36381() {
      this.field_41048 = 0;
   }

   public int method_36380() {
      return this.field_41047;
   }

   public void method_36358() {
      this.field_41048++;
   }

   public int method_36367() {
      return this.field_41046;
   }

   public void method_36370(int var1) {
      this.field_41045 += var1;
   }

   public void method_36360() {
      this.field_41045 = 0;
   }

   public int method_36379() {
      return this.field_41045;
   }

   public void method_36359(int var1) {
      this.field_41045 = var1;
   }

   public float method_36376() {
      return this.field_41044;
   }

   public int method_36363() {
      return this.field_41049;
   }

   public boolean method_36378() {
      return this.field_41048 >= this.field_41047;
   }

   public void method_36364() {
      this.field_41048 = this.field_41047;
   }

   public boolean method_36368() {
      return this.field_41048 > 0;
   }

   public boolean method_36374() {
      return this.field_41053;
   }

   public class_5734 method_36383() {
      class_5734 var3 = new class_5734();
      var3.method_25946("buy", this.field_41051.method_27998(new class_5734()));
      var3.method_25946("sell", this.field_41052.method_27998(new class_5734()));
      var3.method_25946("buyB", this.field_41050.method_27998(new class_5734()));
      var3.method_25931("uses", this.field_41048);
      var3.method_25931("maxUses", this.field_41047);
      var3.method_25934("rewardExp", this.field_41053);
      var3.method_25931("xp", this.field_41049);
      var3.method_25920("priceMultiplier", this.field_41044);
      var3.method_25931("specialPrice", this.field_41045);
      var3.method_25931("demand", this.field_41046);
      return var3;
   }

   public boolean method_36373(class_6098 var1, class_6098 var2) {
      return this.method_36369(var1, this.method_36372())
         && var1.method_27997() >= this.method_36372().method_27997()
         && this.method_36369(var2, this.field_41050)
         && var2.method_27997() >= this.field_41050.method_27997();
   }

   private boolean method_36369(class_6098 var1, class_6098 var2) {
      if (var2.method_28022() && var1.method_28022()) {
         return true;
      } else {
         class_6098 var5 = var1.method_27973();
         if (var5.method_27960().method_11210()) {
            var5.method_27999(var5.method_28026());
         }

         return class_6098.method_28019(var5, var2)
            && (!var2.method_28002() || var5.method_28002() && class_4338.method_20182(var2.method_27990(), var5.method_27990(), false));
      }
   }

   public boolean method_36375(class_6098 var1, class_6098 var2) {
      if (this.method_36373(var1, var2)) {
         var1.method_27970(this.method_36372().method_27997());
         if (!this.method_36377().method_28022()) {
            var2.method_27970(this.method_36377().method_27997());
         }

         return true;
      } else {
         return false;
      }
   }
}