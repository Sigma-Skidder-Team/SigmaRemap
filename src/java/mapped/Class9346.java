package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public class Class9346 {
   private final ItemStack field43384;
   private final ItemStack field43385;
   private final ItemStack field43386;
   private int field43387;
   private final int field43388;
   private boolean field43389 = true;
   private int field43390;
   private int field43391;
   private float field43392;
   private int field43393 = 1;

   public Class9346(CompoundNBT var1) {
      this.field43384 = ItemStack.method32104(var1.getCompound("buy"));
      this.field43385 = ItemStack.method32104(var1.getCompound("buyB"));
      this.field43386 = ItemStack.method32104(var1.getCompound("sell"));
      this.field43387 = var1.getInt("uses");
      if (!var1.contains("maxUses", 99)) {
         this.field43388 = 4;
      } else {
         this.field43388 = var1.getInt("maxUses");
      }

      if (var1.contains("rewardExp", 1)) {
         this.field43389 = var1.getBoolean("rewardExp");
      }

      if (var1.contains("xp", 3)) {
         this.field43393 = var1.getInt("xp");
      }

      if (var1.contains("priceMultiplier", 5)) {
         this.field43392 = var1.getFloat("priceMultiplier");
      }

      this.field43390 = var1.getInt("specialPrice");
      this.field43391 = var1.getInt("demand");
   }

   public Class9346(ItemStack var1, ItemStack var2, int var3, int var4, float var5) {
      this(var1, ItemStack.EMPTY, var2, var3, var4, var5);
   }

   public Class9346(ItemStack var1, ItemStack var2, ItemStack var3, int var4, int var5, float var6) {
      this(var1, var2, var3, 0, var4, var5, var6);
   }

   public Class9346(ItemStack var1, ItemStack var2, ItemStack var3, int var4, int var5, int var6, float var7) {
      this(var1, var2, var3, var4, var5, var6, var7, 0);
   }

   public Class9346(ItemStack var1, ItemStack var2, ItemStack var3, int var4, int var5, int var6, float var7, int var8) {
      this.field43384 = var1;
      this.field43385 = var2;
      this.field43386 = var3;
      this.field43387 = var4;
      this.field43388 = var5;
      this.field43393 = var6;
      this.field43392 = var7;
      this.field43391 = var8;
   }

   public ItemStack method35365() {
      return this.field43384;
   }

   public ItemStack method35366() {
      int var3 = this.field43384.getCount();
      ItemStack var4 = this.field43384.copy();
      int var5 = Math.max(0, MathHelper.method37767((float)(var3 * this.field43391) * this.field43392));
      var4.method32180(MathHelper.method37775(var3 + var5 + this.field43390, 1, this.field43384.getItem().method11710()));
      return var4;
   }

   public ItemStack method35367() {
      return this.field43385;
   }

   public ItemStack method35368() {
      return this.field43386;
   }

   public void method35369() {
      this.field43391 = this.field43391 + this.field43387 - (this.field43388 - this.field43387);
   }

   public ItemStack method35370() {
      return this.field43386.copy();
   }

   public int method35371() {
      return this.field43387;
   }

   public void method35372() {
      this.field43387 = 0;
   }

   public int method35373() {
      return this.field43388;
   }

   public void method35374() {
      this.field43387++;
   }

   public int method35375() {
      return this.field43391;
   }

   public void method35376(int var1) {
      this.field43390 += var1;
   }

   public void method35377() {
      this.field43390 = 0;
   }

   public int method35378() {
      return this.field43390;
   }

   public void method35379(int var1) {
      this.field43390 = var1;
   }

   public float method35380() {
      return this.field43392;
   }

   public int method35381() {
      return this.field43393;
   }

   public boolean method35382() {
      return this.field43387 >= this.field43388;
   }

   public void method35383() {
      this.field43387 = this.field43388;
   }

   public boolean method35384() {
      return this.field43387 > 0;
   }

   public boolean method35385() {
      return this.field43389;
   }

   public CompoundNBT method35386() {
      CompoundNBT var3 = new CompoundNBT();
      var3.put("buy", this.field43384.method32112(new CompoundNBT()));
      var3.put("sell", this.field43386.method32112(new CompoundNBT()));
      var3.put("buyB", this.field43385.method32112(new CompoundNBT()));
      var3.putInt("uses", this.field43387);
      var3.putInt("maxUses", this.field43388);
      var3.putBoolean("rewardExp", this.field43389);
      var3.putInt("xp", this.field43393);
      var3.putFloat("priceMultiplier", this.field43392);
      var3.putInt("specialPrice", this.field43390);
      var3.putInt("demand", this.field43391);
      return var3;
   }

   public boolean method35387(ItemStack var1, ItemStack var2) {
      return this.method35388(var1, this.method35366())
         && var1.getCount() >= this.method35366().getCount()
         && this.method35388(var2, this.field43385)
         && var2.getCount() >= this.field43385.getCount();
   }

   private boolean method35388(ItemStack var1, ItemStack var2) {
      if (var2.isEmpty() && var1.isEmpty()) {
         return true;
      } else {
         ItemStack var5 = var1.copy();
         if (var5.getItem().method11712()) {
            var5.method32118(var5.method32117());
         }

         return ItemStack.method32130(var5, var2)
            && (!var2.method32141() || var5.method32141() && Class8354.method29280(var2.method32142(), var5.method32142(), false));
      }
   }

   public boolean method35389(ItemStack var1, ItemStack var2) {
      if (this.method35387(var1, var2)) {
         var1.method32182(this.method35366().getCount());
         if (!this.method35367().isEmpty()) {
            var2.method32182(this.method35367().getCount());
         }

         return true;
      } else {
         return false;
      }
   }
}
