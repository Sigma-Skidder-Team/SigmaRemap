package mapped;

import net.minecraft.util.Util;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class TropicalFishEntity extends AbstractGroupFishEntity {
   private static final DataParameter<Integer> field5813 = EntityDataManager.<Integer>createKey(TropicalFishEntity.class, DataSerializers.VARINT);
   private static final ResourceLocation[] field5814 = new ResourceLocation[]{
      new ResourceLocation("textures/entity/fish/tropical_a.png"), new ResourceLocation("textures/entity/fish/tropical_b.png")
   };
   private static final ResourceLocation[] field5815 = new ResourceLocation[]{
      new ResourceLocation("textures/entity/fish/tropical_a_pattern_1.png"),
      new ResourceLocation("textures/entity/fish/tropical_a_pattern_2.png"),
      new ResourceLocation("textures/entity/fish/tropical_a_pattern_3.png"),
      new ResourceLocation("textures/entity/fish/tropical_a_pattern_4.png"),
      new ResourceLocation("textures/entity/fish/tropical_a_pattern_5.png"),
      new ResourceLocation("textures/entity/fish/tropical_a_pattern_6.png")
   };
   private static final ResourceLocation[] field5816 = new ResourceLocation[]{
      new ResourceLocation("textures/entity/fish/tropical_b_pattern_1.png"),
      new ResourceLocation("textures/entity/fish/tropical_b_pattern_2.png"),
      new ResourceLocation("textures/entity/fish/tropical_b_pattern_3.png"),
      new ResourceLocation("textures/entity/fish/tropical_b_pattern_4.png"),
      new ResourceLocation("textures/entity/fish/tropical_b_pattern_5.png"),
      new ResourceLocation("textures/entity/fish/tropical_b_pattern_6.png")
   };
   public static final int[] field5817 = new int[]{
      method4812(Class1964.field12805, Class112.field387, Class112.field393),
      method4812(Class1964.field12804, Class112.field393, Class112.field393),
      method4812(Class1964.field12804, Class112.field393, Class112.field397),
      method4812(Class1964.field12809, Class112.field386, Class112.field393),
      method4812(Class1964.field12799, Class112.field397, Class112.field393),
      method4812(Class1964.field12798, Class112.field387, Class112.field386),
      method4812(Class1964.field12803, Class112.field392, Class112.field389),
      method4812(Class1964.field12807, Class112.field396, Class112.field390),
      method4812(Class1964.field12809, Class112.field386, Class112.field400),
      method4812(Class1964.field12803, Class112.field386, Class112.field390),
      method4812(Class1964.field12806, Class112.field386, Class112.field393),
      method4812(Class1964.field12809, Class112.field386, Class112.field387),
      method4812(Class1964.field12801, Class112.field395, Class112.field392),
      method4812(Class1964.field12802, Class112.field391, Class112.field389),
      method4812(Class1964.field12808, Class112.field400, Class112.field386),
      method4812(Class1964.field12800, Class112.field393, Class112.field400),
      method4812(Class1964.field12807, Class112.field400, Class112.field386),
      method4812(Class1964.field12804, Class112.field386, Class112.field390),
      method4812(Class1964.field12798, Class112.field400, Class112.field386),
      method4812(Class1964.field12799, Class112.field393, Class112.field386),
      method4812(Class1964.field12801, Class112.field395, Class112.field390),
      method4812(Class1964.field12804, Class112.field390, Class112.field390)
   };
   private boolean field5818 = true;

   private static int method4812(Class1964 var0, Class112 var1, Class112 var2) {
      return var0.method8237() & 0xFF | (var0.method8238() & 0xFF) << 8 | (var1.method309() & 0xFF) << 16 | (var2.method309() & 0xFF) << 24;
   }

   public TropicalFishEntity(EntityType<? extends TropicalFishEntity> var1, World var2) {
      super(var1, var2);
   }

   public static String method4813(int var0) {
      return "entity.minecraft.tropical_fish.predefined." + var0;
   }

   public static Class112 method4814(int var0) {
      return Class112.method315(method4819(var0));
   }

   public static Class112 method4815(int var0) {
      return Class112.method315(method4821(var0));
   }

   public static String method4816(int var0) {
      int var3 = method4823(var0);
      int var4 = method4825(var0);
      return "entity.minecraft.tropical_fish.type." + Class1964.method8239(var3, var4);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5813, 0);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("Variant", this.method4818());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method4817(var1.getInt("Variant"));
   }

   public void method4817(int var1) {
      this.dataManager.method35446(field5813, var1);
   }

   @Override
   public boolean method4268(int var1) {
      return !this.field5818;
   }

   public int method4818() {
      return this.dataManager.<Integer>method35445(field5813);
   }

   @Override
   public void method4795(ItemStack var1) {
      super.method4795(var1);
      CompoundNBT var4 = var1.getOrCreateTag();
      var4.putInt("BucketVariantTag", this.method4818());
   }

   @Override
   public ItemStack getFishBucket() {
      return new ItemStack(Items.field37895);
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field27160;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27161;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27163;
   }

   @Override
   public SoundEvent getFlopSound() {
      return SoundEvents.field27162;
   }

   private static int method4819(int var0) {
      return (var0 & 0xFF0000) >> 16;
   }

   public float[] method4820() {
      return Class112.method315(method4819(this.method4818())).method311();
   }

   private static int method4821(int var0) {
      return (var0 & 0xFF000000) >> 24;
   }

   public float[] method4822() {
      return Class112.method315(method4821(this.method4818())).method311();
   }

   public static int method4823(int var0) {
      return Math.min(var0 & 0xFF, 1);
   }

   public int method4824() {
      return method4823(this.method4818());
   }

   private static int method4825(int var0) {
      return Math.min((var0 & 0xFF00) >> 8, 5);
   }

   public ResourceLocation method4826() {
      return method4823(this.method4818()) != 0 ? field5816[method4825(this.method4818())] : field5815[method4825(this.method4818())];
   }

   public ResourceLocation method4827() {
      return field5814[method4823(this.method4818())];
   }

   @Nullable
   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      var4 = super.method4276(var1, var2, var3, var4, var5);
      if (var5 != null && var5.contains("BucketVariantTag", 3)) {
         this.method4817(var5.getInt("BucketVariantTag"));
         return var4;
      } else {
         int var8;
         int var9;
         int var10;
         int var11;
         if (!(var4 instanceof Class5095)) {
            if (!((double)this.rand.nextFloat() < 0.9)) {
               this.field5818 = false;
               var8 = this.rand.nextInt(2);
               var9 = this.rand.nextInt(6);
               var10 = this.rand.nextInt(15);
               var11 = this.rand.nextInt(15);
            } else {
               int var12 = Util.getRandomInt(field5817, this.rand);
               var8 = var12 & 0xFF;
               var9 = (var12 & 0xFF00) >> 8;
               var10 = (var12 & 0xFF0000) >> 16;
               var11 = (var12 & 0xFF000000) >> 24;
               var4 = new Class5095(this, var8, var9, var10, var11);
            }
         } else {
            Class5095 var14 = (Class5095)var4;
            var8 = Class5095.method15576(var14);
            var9 = Class5095.method15577(var14);
            var10 = Class5095.method15578(var14);
            var11 = Class5095.method15579(var14);
         }

         this.method4817(var8 | var9 << 8 | var10 << 16 | var11 << 24);
         return var4;
      }
   }
}
