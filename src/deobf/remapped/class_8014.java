package remapped;

public class class_8014 {
   private final ItemStack field_41051;
   private final ItemStack field_41050;
   private final ItemStack field_41052;
   private int field_41048;
   private final int field_41047;
   private boolean field_41053 = true;
   private int field_41045;
   private int field_41046;
   private float field_41044;
   private int field_41049 = 1;

   public class_8014(CompoundNBT var1) {
      this.field_41051 = ItemStack.method_28015(var1.getCompound("buy"));
      this.field_41050 = ItemStack.method_28015(var1.getCompound("buyB"));
      this.field_41052 = ItemStack.method_28015(var1.getCompound("sell"));
      this.field_41048 = var1.method_25947("uses");
      if (!var1.contains("maxUses", 99)) {
         this.field_41047 = 4;
      } else {
         this.field_41047 = var1.method_25947("maxUses");
      }

      if (var1.contains("rewardExp", 1)) {
         this.field_41053 = var1.getBoolean("rewardExp");
      }

      if (var1.contains("xp", 3)) {
         this.field_41049 = var1.method_25947("xp");
      }

      if (var1.contains("priceMultiplier", 5)) {
         this.field_41044 = var1.getFloat("priceMultiplier");
      }

      this.field_41045 = var1.method_25947("specialPrice");
      this.field_41046 = var1.method_25947("demand");
   }

   public class_8014(ItemStack var1, ItemStack var2, int var3, int var4, float var5) {
      this(var1, ItemStack.EMPTY, var2, var3, var4, var5);
   }

   public class_8014(ItemStack var1, ItemStack var2, ItemStack var3, int var4, int var5, float var6) {
      this(var1, var2, var3, 0, var4, var5, var6);
   }

   public class_8014(ItemStack var1, ItemStack var2, ItemStack var3, int var4, int var5, int var6, float var7) {
      this(var1, var2, var3, var4, var5, var6, var7, 0);
   }

   public class_8014(ItemStack var1, ItemStack var2, ItemStack var3, int var4, int var5, int var6, float var7, int var8) {
      this.field_41051 = var1;
      this.field_41050 = var2;
      this.field_41052 = var3;
      this.field_41048 = var4;
      this.field_41047 = var5;
      this.field_41049 = var6;
      this.field_41044 = var7;
      this.field_41046 = var8;
   }

   public ItemStack method_36365() {
      return this.field_41051;
   }

   public ItemStack method_36372() {
      int var3 = this.field_41051.method_27997();
      ItemStack var4 = this.field_41051.method_27973();
      int var5 = Math.max(0, class_9299.method_42848((float)(var3 * this.field_41046) * this.field_41044));
      var4.method_28017(class_9299.method_42829(var3 + var5 + this.field_41045, 1, this.field_41051.method_27960().method_11245()));
      return var4;
   }

   public ItemStack method_36377() {
      return this.field_41050;
   }

   public ItemStack method_36362() {
      return this.field_41052;
   }

   public void method_36382() {
      this.field_41046 = this.field_41046 + this.field_41048 - (this.field_41047 - this.field_41048);
   }

   public ItemStack method_36371() {
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

   public CompoundNBT method_36383() {
      CompoundNBT var3 = new CompoundNBT();
      var3.put("buy", this.field_41051.method_27998(new CompoundNBT()));
      var3.put("sell", this.field_41052.method_27998(new CompoundNBT()));
      var3.put("buyB", this.field_41050.method_27998(new CompoundNBT()));
      var3.method_25931("uses", this.field_41048);
      var3.method_25931("maxUses", this.field_41047);
      var3.putBoolean("rewardExp", this.field_41053);
      var3.method_25931("xp", this.field_41049);
      var3.putFloat("priceMultiplier", this.field_41044);
      var3.method_25931("specialPrice", this.field_41045);
      var3.method_25931("demand", this.field_41046);
      return var3;
   }

   public boolean method_36373(ItemStack var1, ItemStack var2) {
      return this.method_36369(var1, this.method_36372())
         && var1.method_27997() >= this.method_36372().method_27997()
         && this.method_36369(var2, this.field_41050)
         && var2.method_27997() >= this.field_41050.method_27997();
   }

   private boolean method_36369(ItemStack var1, ItemStack var2) {
      if (var2.method_28022() && var1.method_28022()) {
         return true;
      } else {
         ItemStack var5 = var1.method_27973();
         if (var5.method_27960().method_11210()) {
            var5.method_27999(var5.method_28026());
         }

         return ItemStack.method_28019(var5, var2)
            && (!var2.method_28002() || var5.method_28002() && class_4338.method_20182(var2.method_27990(), var5.method_27990(), false));
      }
   }

   public boolean method_36375(ItemStack var1, ItemStack var2) {
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
