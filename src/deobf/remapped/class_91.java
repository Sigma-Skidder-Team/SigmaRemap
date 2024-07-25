package remapped;

import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_91 extends Entity {
   private static final class_7821<ItemStack> field_180 = class_8073.<ItemStack>method_36641(class_91.class, class_2734.field_13357);
   private int field_178;
   private int field_174;
   private int field_177 = 5;
   private UUID field_176;
   private UUID field_179;
   public final float field_173;

   public class_91(EntityType<? extends class_91> var1, World var2) {
      super(var1, var2);
      this.field_173 = (float)(Math.random() * Math.PI * 2.0);
   }

   public class_91(World var1, double var2, double var4, double var6) {
      this(EntityType.field_34208, var1);
      this.method_37256(var2, var4, var6);
      this.rotationYaw = this.field_41717.nextFloat() * 360.0F;
      this.method_37214(this.field_41717.nextDouble() * 0.2 - 0.1, 0.2, this.field_41717.nextDouble() * 0.2 - 0.1);
   }

   public class_91(World var1, double var2, double var4, double var6, ItemStack var8) {
      this(var1, var2, var4, var6);
      this.method_248(var8);
   }

   private class_91(class_91 var1) {
      super(var1.getType(), var1.world);
      this.method_248(var1.method_264().method_27973());
      this.method_37299(var1);
      this.field_178 = var1.field_178;
      this.field_173 = var1.field_173;
   }

   @Override
   public boolean method_37126() {
      return false;
   }

   @Override
   public void method_37329() {
      this.method_37372().method_36634(field_180, ItemStack.EMPTY);
   }

   @Override
   public void method_37123() {
      if (!this.method_264().method_28022()) {
         super.method_37123();
         if (this.field_174 > 0 && this.field_174 != 32767) {
            this.field_174--;
         }

         this.field_41767 = this.getPosX();
         this.field_41698 = this.method_37309();
         this.field_41725 = this.getPosZ();
         class_1343 var3 = this.method_37098();
         float var4 = this.method_37277() - 0.11111111F;
         if (this.method_37285() && this.method_37284(class_6503.field_33094) > (double)var4) {
            this.method_262();
         } else if (this.method_37370() && this.method_37284(class_6503.field_33095) > (double)var4) {
            this.method_251();
         } else if (!this.method_37078()) {
            this.method_37215(this.method_37098().method_6214(0.0, -0.04, 0.0));
         }

         if (!this.world.field_33055) {
            this.field_41731 = !this.world.method_6682(this);
            if (this.field_41731) {
               this.method_37160(this.getPosX(), (this.method_37241().field_19937 + this.method_37241().field_19939) / 2.0, this.getPosZ());
            }
         } else {
            this.field_41731 = false;
         }

         if (!this.onGround || method_37266(this.method_37098()) > 1.0E-5F || (this.field_41697 + this.method_37145()) % 4 == 0) {
            this.method_37226(class_7412.field_37839, this.method_37098());
            float var5 = 0.98F;
            if (this.onGround) {
               var5 = this.world
                     .method_28262(new BlockPos(this.getPosX(), this.method_37309() - 1.0, this.getPosZ()))
                     .method_8360()
                     .method_29308()
                  * 0.98F;
            }

            this.method_37215(this.method_37098().method_6210((double)var5, 0.98, (double)var5));
            if (this.onGround) {
               class_1343 var6 = this.method_37098();
               if (var6.field_7333 < 0.0) {
                  this.method_37215(var6.method_6210(1.0, -0.5, 1.0));
               }
            }
         }

         boolean var9 = class_9299.method_42847(this.field_41767) != class_9299.method_42847(this.getPosX())
            || class_9299.method_42847(this.field_41698) != class_9299.method_42847(this.method_37309())
            || class_9299.method_42847(this.field_41725) != class_9299.method_42847(this.getPosZ());
         int var10 = !var9 ? 40 : 2;
         if (this.field_41697 % var10 == 0) {
            if (this.world.method_28258(this.method_37075()).method_22007(class_6503.field_33095) && !this.method_37087()) {
               this.method_37155(class_463.field_2912, 0.4F, 2.0F + this.field_41717.nextFloat() * 0.4F);
            }

            if (!this.world.field_33055 && this.method_261()) {
               this.method_255();
            }
         }

         if (this.field_178 != -32768) {
            this.field_178++;
         }

         this.field_41763 = this.field_41763 | this.method_37228();
         if (!this.world.field_33055) {
            double var7 = this.method_37098().method_6194(var3).method_6221();
            if (var7 > 0.01) {
               this.field_41763 = true;
            }
         }

         if (!this.world.field_33055 && this.field_178 >= 6000) {
            this.method_37204();
         }
      } else {
         this.method_37204();
      }
   }

   private void method_262() {
      class_1343 var3 = this.method_37098();
      this.method_37214(var3.field_7336 * 0.99F, var3.field_7333 + (double)(!(var3.field_7333 < 0.06F) ? 0.0F : 5.0E-4F), var3.field_7334 * 0.99F);
   }

   private void method_251() {
      class_1343 var3 = this.method_37098();
      this.method_37214(var3.field_7336 * 0.95F, var3.field_7333 + (double)(!(var3.field_7333 < 0.06F) ? 0.0F : 5.0E-4F), var3.field_7334 * 0.95F);
   }

   private void method_255() {
      if (this.method_261()) {
         for (class_91 var4 : this.world
            .<class_91>method_25869(class_91.class, this.method_37241().method_18899(0.5, 0.0, 0.5), var1 -> var1 != this && var1.method_261())) {
            if (var4.method_261()) {
               this.method_263(var4);
               if (this.field_41751) {
                  break;
               }
            }
         }
      }
   }

   private boolean method_261() {
      ItemStack var3 = this.method_264();
      return this.isAlive() && this.field_174 != 32767 && this.field_178 != -32768 && this.field_178 < 6000 && var3.method_27997() < var3.method_28016();
   }

   private void method_263(class_91 var1) {
      ItemStack var4 = this.method_264();
      ItemStack var5 = var1.method_264();
      if (Objects.equals(this.method_266(), var1.method_266()) && method_249(var4, var5)) {
         if (var5.method_27997() >= var4.method_27997()) {
            method_268(var1, var5, this, var4);
         } else {
            method_268(this, var4, var1, var5);
         }
      }
   }

   public static boolean method_249(ItemStack var0, ItemStack var1) {
      if (var1.method_27960() != var0.method_27960()) {
         return false;
      } else if (var1.method_27997() + var0.method_27997() <= var1.method_28016()) {
         return var1.method_28002() ^ var0.method_28002() ? false : !var1.method_28002() || var1.method_27990().equals(var0.method_27990());
      } else {
         return false;
      }
   }

   public static ItemStack method_247(ItemStack var0, ItemStack var1, int var2) {
      int var5 = Math.min(Math.min(var0.method_28016(), var2) - var0.method_27997(), var1.method_27997());
      ItemStack var6 = var0.method_27973();
      var6.method_28030(var5);
      var1.method_27970(var5);
      return var6;
   }

   private static void method_256(class_91 var0, ItemStack var1, ItemStack var2) {
      ItemStack var5 = method_247(var1, var2, 64);
      var0.method_248(var5);
   }

   private static void method_268(class_91 var0, ItemStack var1, class_91 var2, ItemStack var3) {
      method_256(var0, var1, var3);
      var0.field_174 = Math.max(var0.field_174, var2.field_174);
      var0.field_178 = Math.min(var0.field_178, var2.field_178);
      if (var3.method_28022()) {
         var2.method_37204();
      }
   }

   @Override
   public boolean method_37087() {
      return this.method_264().method_27960().method_11208() || super.method_37087();
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (!this.method_37180(var1)) {
         if (!this.method_264().method_28022() && this.method_264().method_27960() == class_4897.field_24381 && var1.method_28367()) {
            return false;
         } else if (this.method_264().method_27960().method_11211(var1)) {
            this.method_37138();
            this.field_177 = (int)((float)this.field_177 - var2);
            if (this.field_177 <= 0) {
               this.method_37204();
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      var1.method_25958("Health", (short)this.field_177);
      var1.method_25958("Age", (short)this.field_178);
      var1.method_25958("PickupDelay", (short)this.field_174);
      if (this.method_253() != null) {
         var1.method_25964("Thrower", this.method_253());
      }

      if (this.method_266() != null) {
         var1.method_25964("Owner", this.method_266());
      }

      if (!this.method_264().method_28022()) {
         var1.put("Item", this.method_264().method_27998(new CompoundNBT()));
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      this.field_177 = var1.method_25956("Health");
      this.field_178 = var1.method_25956("Age");
      if (var1.method_25938("PickupDelay")) {
         this.field_174 = var1.method_25956("PickupDelay");
      }

      if (var1.method_25954("Owner")) {
         this.field_179 = var1.method_25926("Owner");
      }

      if (var1.method_25954("Thrower")) {
         this.field_176 = var1.method_25926("Thrower");
      }

      CompoundNBT var4 = var1.getCompound("Item");
      this.method_248(ItemStack.method_28015(var4));
      if (this.method_264().method_28022()) {
         this.method_37204();
      }
   }

   @Override
   public void method_37347(PlayerEntity var1) {
      if (!this.world.field_33055) {
         ItemStack var4 = this.method_264();
         class_2451 var5 = var4.method_27960();
         int var6 = var4.method_27997();
         if (this.field_174 == 0 && (this.field_179 == null || this.field_179.equals(var1.method_37328())) && var1.inventory.method_32414(var4)) {
            var1.method_26467(this, var6);
            if (var4.method_28022()) {
               this.method_37204();
               var4.method_28017(var6);
            }

            var1.method_3212(class_6234.field_31849.method_43790(var5), var6);
            var1.method_26562(this);
         }
      }
   }

   @Override
   public ITextComponent method_45509() {
      ITextComponent var3 = this.method_45508();
      return (ITextComponent)(var3 == null ? new TranslationTextComponent(this.method_264().method_27958()) : var3);
   }

   @Override
   public boolean method_37394() {
      return false;
   }

   @Nullable
   @Override
   public Entity method_37326(class_6331 var1) {
      Entity var4 = super.method_37326(var1);
      if (!this.world.field_33055 && var4 instanceof class_91) {
         ((class_91)var4).method_255();
      }

      return var4;
   }

   public ItemStack method_264() {
      return this.method_37372().<ItemStack>method_36640(field_180);
   }

   public void method_248(ItemStack var1) {
      this.method_37372().method_36633(field_180, var1);
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      super.method_37191(var1);
      if (field_180.equals(var1)) {
         this.method_264().method_27992(this);
      }
   }

   @Nullable
   public UUID method_266() {
      return this.field_179;
   }

   public void method_252(UUID var1) {
      this.field_179 = var1;
   }

   @Nullable
   public UUID method_253() {
      return this.field_176;
   }

   public void method_265(UUID var1) {
      this.field_176 = var1;
   }

   public int method_260() {
      return this.field_178;
   }

   public void method_257() {
      this.field_174 = 10;
   }

   public void method_250() {
      this.field_174 = 0;
   }

   public void method_267() {
      this.field_174 = 32767;
   }

   public void method_254(int var1) {
      this.field_174 = var1;
   }

   public boolean method_258() {
      return this.field_174 > 0;
   }

   public void method_244() {
      this.field_178 = -6000;
   }

   public void method_246() {
      this.method_267();
      this.field_178 = 5999;
   }

   public float method_245(float var1) {
      return ((float)this.method_260() + var1) / 20.0F + this.field_173;
   }

   @Override
   public Packet<?> method_37142() {
      return new class_6589(this);
   }

   public class_91 method_259() {
      return new class_91(this);
   }
}
