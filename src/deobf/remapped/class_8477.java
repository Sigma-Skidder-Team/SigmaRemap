package remapped;

import javax.annotation.Nullable;

public class class_8477 extends class_8574 {
   private static final class_7821<Integer> field_43436 = class_8073.<Integer>method_36641(class_8477.class, class_2734.field_13366);
   private static final Identifier[] field_43433 = new Identifier[]{
      new Identifier("textures/entity/fish/tropical_a.png"), new Identifier("textures/entity/fish/tropical_b.png")
   };
   private static final Identifier[] field_43437 = new Identifier[]{
      new Identifier("textures/entity/fish/tropical_a_pattern_1.png"),
      new Identifier("textures/entity/fish/tropical_a_pattern_2.png"),
      new Identifier("textures/entity/fish/tropical_a_pattern_3.png"),
      new Identifier("textures/entity/fish/tropical_a_pattern_4.png"),
      new Identifier("textures/entity/fish/tropical_a_pattern_5.png"),
      new Identifier("textures/entity/fish/tropical_a_pattern_6.png")
   };
   private static final Identifier[] field_43435 = new Identifier[]{
      new Identifier("textures/entity/fish/tropical_b_pattern_1.png"),
      new Identifier("textures/entity/fish/tropical_b_pattern_2.png"),
      new Identifier("textures/entity/fish/tropical_b_pattern_3.png"),
      new Identifier("textures/entity/fish/tropical_b_pattern_4.png"),
      new Identifier("textures/entity/fish/tropical_b_pattern_5.png"),
      new Identifier("textures/entity/fish/tropical_b_pattern_6.png")
   };
   public static final int[] field_43434 = new int[]{
      method_39028(class_8922.field_45754, class_9077.field_46486, class_9077.field_46498),
      method_39028(class_8922.field_45740, class_9077.field_46498, class_9077.field_46498),
      method_39028(class_8922.field_45740, class_9077.field_46498, class_9077.field_46487),
      method_39028(class_8922.field_45746, class_9077.field_46493, class_9077.field_46498),
      method_39028(class_8922.field_45748, class_9077.field_46487, class_9077.field_46498),
      method_39028(class_8922.field_45745, class_9077.field_46486, class_9077.field_46493),
      method_39028(class_8922.field_45743, class_9077.field_46495, class_9077.field_46491),
      method_39028(class_8922.field_45747, class_9077.field_46499, class_9077.field_46477),
      method_39028(class_8922.field_45746, class_9077.field_46493, class_9077.field_46494),
      method_39028(class_8922.field_45743, class_9077.field_46493, class_9077.field_46477),
      method_39028(class_8922.field_45741, class_9077.field_46493, class_9077.field_46498),
      method_39028(class_8922.field_45746, class_9077.field_46493, class_9077.field_46486),
      method_39028(class_8922.field_45750, class_9077.field_46501, class_9077.field_46495),
      method_39028(class_8922.field_45739, class_9077.field_46489, class_9077.field_46491),
      method_39028(class_8922.field_45738, class_9077.field_46494, class_9077.field_46493),
      method_39028(class_8922.field_45749, class_9077.field_46498, class_9077.field_46494),
      method_39028(class_8922.field_45747, class_9077.field_46494, class_9077.field_46493),
      method_39028(class_8922.field_45740, class_9077.field_46493, class_9077.field_46477),
      method_39028(class_8922.field_45745, class_9077.field_46494, class_9077.field_46493),
      method_39028(class_8922.field_45748, class_9077.field_46498, class_9077.field_46493),
      method_39028(class_8922.field_45750, class_9077.field_46501, class_9077.field_46477),
      method_39028(class_8922.field_45740, class_9077.field_46477, class_9077.field_46477)
   };
   private boolean field_43432 = true;

   private static int method_39028(class_8922 var0, class_9077 var1, class_9077 var2) {
      return var0.method_41025() & 0xFF | (var0.method_41028() & 0xFF) << 8 | (var1.method_41794() & 0xFF) << 16 | (var2.method_41794() & 0xFF) << 24;
   }

   public class_8477(EntityType<? extends class_8477> var1, World var2) {
      super(var1, var2);
   }

   public static String method_39023(int var0) {
      return "entity.minecraft.tropical_fish.predefined." + var0;
   }

   public static class_9077 method_39026(int var0) {
      return class_9077.method_41789(method_39017(var0));
   }

   public static class_9077 method_39015(int var0) {
      return class_9077.method_41789(method_39024(var0));
   }

   public static String method_39016(int var0) {
      int var3 = method_39027(var0);
      int var4 = method_39022(var0);
      return "entity.minecraft.tropical_fish.type." + class_8922.method_41024(var3, var4);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_43436, 0);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("Variant", this.method_39018());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method_39025(var1.method_25947("Variant"));
   }

   public void method_39025(int var1) {
      this.field_41735.method_36633(field_43436, var1);
   }

   @Override
   public boolean method_26841(int var1) {
      return !this.field_43432;
   }

   public int method_39018() {
      return this.field_41735.<Integer>method_36640(field_43436);
   }

   @Override
   public void method_16630(ItemStack var1) {
      super.method_16630(var1);
      CompoundNBT var4 = var1.method_27994();
      var4.putInt("BucketVariantTag", this.method_39018());
   }

   @Override
   public ItemStack method_16633() {
      return new ItemStack(class_4897.field_25286);
   }

   @Override
   public SoundEvent method_26918() {
      return SoundEvents.field_2749;
   }

   @Override
   public SoundEvent method_26599() {
      return SoundEvents.field_2555;
   }

   @Override
   public SoundEvent method_26541(DamageSource var1) {
      return SoundEvents.field_2493;
   }

   @Override
   public SoundEvent method_16632() {
      return SoundEvents.field_2297;
   }

   private static int method_39017(int var0) {
      return (var0 & 0xFF0000) >> 16;
   }

   public float[] method_39030() {
      return class_9077.method_41789(method_39017(this.method_39018())).method_41792();
   }

   private static int method_39024(int var0) {
      return (var0 & 0xFF000000) >> 24;
   }

   public float[] method_39019() {
      return class_9077.method_41789(method_39024(this.method_39018())).method_41792();
   }

   public static int method_39027(int var0) {
      return Math.min(var0 & 0xFF, 1);
   }

   public int method_39021() {
      return method_39027(this.method_39018());
   }

   private static int method_39022(int var0) {
      return Math.min((var0 & 0xFF00) >> 8, 5);
   }

   public Identifier method_39020() {
      return method_39027(this.method_39018()) != 0 ? field_43435[method_39022(this.method_39018())] : field_43437[method_39022(this.method_39018())];
   }

   public Identifier method_39029() {
      return field_43433[method_39027(this.method_39018())];
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      var4 = super.method_26864(var1, var2, var3, var4, var5);
      if (var5 != null && var5.contains("BucketVariantTag", 3)) {
         this.method_39025(var5.method_25947("BucketVariantTag"));
         return var4;
      } else {
         int var8;
         int var9;
         int var10;
         int var11;
         if (!(var4 instanceof class_3419)) {
            if (!((double)this.field_41717.nextFloat() < 0.9)) {
               this.field_43432 = false;
               var8 = this.field_41717.nextInt(2);
               var9 = this.field_41717.nextInt(6);
               var10 = this.field_41717.nextInt(15);
               var11 = this.field_41717.nextInt(15);
            } else {
               int var12 = Util.method_44676(field_43434, this.field_41717);
               var8 = var12 & 0xFF;
               var9 = (var12 & 0xFF00) >> 8;
               var10 = (var12 & 0xFF0000) >> 16;
               var11 = (var12 & 0xFF000000) >> 24;
               var4 = new class_3419(this, var8, var9, var10, var11, null);
            }
         } else {
            class_3419 var14 = (class_3419)var4;
            var8 = class_3419.method_15777(var14);
            var9 = class_3419.method_15775(var14);
            var10 = class_3419.method_15778(var14);
            var11 = class_3419.method_15776(var14);
         }

         this.method_39025(var8 | var9 << 8 | var10 << 16 | var11 << 24);
         return var4;
      }
   }
}
