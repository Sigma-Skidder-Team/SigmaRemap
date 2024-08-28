package mapped;

import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class997 extends Class995 {
   private static final Logger field5491 = LogManager.getLogger();
   private static final Class9289<ItemStack> field5492 = Class9361.<ItemStack>method35441(Class997.class, Class7784.field33396);
   private static final Class9289<Integer> field5493 = Class9361.<Integer>method35441(Class997.class, Class7784.field33391);
   private float field5494 = 1.0F;
   private boolean field5495;

   public Class997(Class8992<? extends Class997> var1, World var2) {
      super(var1, var2);
   }

   public Class997(World var1, BlockPos var2, Direction var3) {
      super(Class8992.field41043, var1, var2);
      this.method4077(var3);
   }

   @Override
   public float method3181(Class2090 var1, Class8847 var2) {
      return 0.0F;
   }

   @Override
   public void method2850() {
      this.method3210().method35442(field5492, ItemStack.EMPTY);
      this.method3210().method35442(field5493, 0);
   }

   @Override
   public void method4077(Direction var1) {
      Validate.notNull(var1);
      this.field5489 = var1;
      if (!var1.method544().method324()) {
         this.field5032 = (float)(-90 * var1.method535().method8150());
         this.field5031 = 0.0F;
      } else {
         this.field5032 = 0.0F;
         this.field5031 = (float)(this.field5489.method534() * 90);
      }

      this.field5034 = this.field5032;
      this.field5033 = this.field5031;
      this.method4078();
   }

   @Override
   public void method4078() {
      if (this.field5489 != null) {
         double var3 = 0.46875;
         double var5 = (double)this.field5488.method8304() + 0.5 - (double)this.field5489.method539() * 0.46875;
         double var7 = (double)this.field5488.getY() + 0.5 - (double)this.field5489.method540() * 0.46875;
         double var9 = (double)this.field5488.method8306() + 0.5 - (double)this.field5489.method541() * 0.46875;
         this.method3446(var5, var7, var9);
         double var11 = (double)this.method4081();
         double var13 = (double)this.method4082();
         double var15 = (double)this.method4081();
         Class113 var17 = this.field5489.method544();
         switch (Class9811.field45858[var17.ordinal()]) {
            case 1:
               var11 = 1.0;
               break;
            case 2:
               var13 = 1.0;
               break;
            case 3:
               var15 = 1.0;
         }

         var11 /= 32.0;
         var13 /= 32.0;
         var15 /= 32.0;
         this.method3391(new Class6488(var5 - var11, var7 - var13, var9 - var15, var5 + var11, var7 + var13, var9 + var15));
      }
   }

   @Override
   public boolean method4080() {
      if (!this.field5495) {
         if (!this.field5024.method7052(this)) {
            return false;
         } else {
            Class7380 var3 = this.field5024.method6738(this.field5488.method8349(this.field5489.method536()));
            return !var3.method23384().method31086() && (!this.field5489.method544().method324() || !Class3247.method11672(var3))
               ? false
               : this.field5024.method6770(this, this.method3389(), field5486).isEmpty();
         }
      } else {
         return true;
      }
   }

   @Override
   public void move(Class2107 var1, Vector3d var2) {
      if (!this.field5495) {
         super.move(var1, var2);
      }
   }

   @Override
   public void method3280(double var1, double var3, double var5) {
      if (!this.field5495) {
         super.method3280(var1, var3, var5);
      }
   }

   @Override
   public float method3319() {
      return 0.0F;
   }

   @Override
   public void method2995() {
      this.method4089(this.method4090());
      super.method2995();
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.field5495) {
         if (!this.method2760(var1)) {
            if (!var1.method31131() && !this.method4090().method32105()) {
               if (!this.field5024.field9020) {
                  this.method4088(var1.method31109(), false);
                  this.method2863(Class6067.field26711, 1.0F, 1.0F);
               }

               return true;
            } else {
               return super.method2741(var1, var2);
            }
         } else {
            return false;
         }
      } else {
         return var1 != Class8654.field39004 && !var1.method31146() ? false : super.method2741(var1, var2);
      }
   }

   @Override
   public int method4081() {
      return 12;
   }

   @Override
   public int method4082() {
      return 12;
   }

   @Override
   public boolean method3291(double var1) {
      double var5 = 16.0;
      var5 = var5 * 64.0 * method3377();
      return var1 < var5 * var5;
   }

   @Override
   public void method4083(Entity var1) {
      this.method2863(Class6067.field26709, 1.0F, 1.0F);
      this.method4088(var1, true);
   }

   @Override
   public void method4084() {
      this.method2863(Class6067.field26710, 1.0F, 1.0F);
   }

   private void method4088(Entity var1, boolean var2) {
      if (!this.field5495) {
         ItemStack var5 = this.method4090();
         this.method4091(ItemStack.EMPTY);
         if (this.field5024.method6789().method17135(Class5462.field24229)) {
            if (var1 instanceof PlayerEntity) {
               PlayerEntity var6 = (PlayerEntity)var1;
               if (var6.field4919.field29609) {
                  this.method4089(var5);
                  return;
               }
            }

            if (var2) {
               this.method3300(Class8514.field38050);
            }

            if (!var5.method32105()) {
               var5 = var5.copy();
               this.method4089(var5);
               if (this.field5054.nextFloat() < this.field5494) {
                  this.method3302(var5);
               }
            }
         } else if (var1 == null) {
            this.method4089(var5);
         }
      }
   }

   private void method4089(ItemStack var1) {
      if (var1.method32107() == Class8514.field37955) {
         Class7529 var4 = Class3316.method11861(var1, this.field5024);
         var4.method24602(this.field5488, this.method3205());
         var4.method24606(true);
      }

      var1.method32166((Entity)null);
   }

   public ItemStack method4090() {
      return this.method3210().<ItemStack>method35445(field5492);
   }

   public void method4091(ItemStack var1) {
      this.method4092(var1, true);
   }

   public void method4092(ItemStack var1, boolean var2) {
      if (!var1.method32105()) {
         var1 = var1.copy();
         var1.method32180(1);
         var1.method32166(this);
      }

      this.method3210().method35446(field5492, var1);
      if (!var1.method32105()) {
         this.method2863(Class6067.field26708, 1.0F, 1.0F);
      }

      if (var2 && this.field5488 != null) {
         this.field5024.method6806(this.field5488, Blocks.AIR);
      }
   }

   @Override
   public boolean method2963(int var1, ItemStack var2) {
      if (var1 != 0) {
         return false;
      } else {
         this.method4091(var2);
         return true;
      }
   }

   @Override
   public void method3155(Class9289<?> var1) {
      if (var1.equals(field5492)) {
         ItemStack var4 = this.method4090();
         if (!var4.method32105() && var4.method32167() != this) {
            var4.method32166(this);
         }
      }
   }

   public int method4093() {
      return this.method3210().<Integer>method35445(field5493);
   }

   public void method4094(int var1) {
      this.method4095(var1, true);
   }

   private void method4095(int var1, boolean var2) {
      this.method3210().method35446(field5493, var1 % 8);
      if (var2 && this.field5488 != null) {
         this.field5024.method6806(this.field5488, Blocks.AIR);
      }
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      if (!this.method4090().method32105()) {
         var1.method99("Item", this.method4090().method32112(new Class39()));
         var1.method100("ItemRotation", (byte)this.method4093());
         var1.method107("ItemDropChance", this.field5494);
      }

      var1.method100("Facing", (byte)this.field5489.method533());
      var1.method115("Invisible", this.method3342());
      var1.method115("Fixed", this.field5495);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      Class39 var4 = var1.method130("Item");
      if (var4 != null && !var4.method134()) {
         ItemStack var5 = ItemStack.method32104(var4);
         if (var5.method32105()) {
            field5491.warn("Unable to load item from: {}", var4);
         }

         ItemStack var6 = this.method4090();
         if (!var6.method32105() && !ItemStack.method32128(var5, var6)) {
            this.method4089(var6);
         }

         this.method4092(var5, false);
         this.method4095(var1.method120("ItemRotation"), false);
         if (var1.method119("ItemDropChance", 99)) {
            this.field5494 = var1.method124("ItemDropChance");
         }
      }

      this.method4077(Direction.method546(var1.method120("Facing")));
      this.method3347(var1.method132("Invisible"));
      this.field5495 = var1.method132("Fixed");
   }

   @Override
   public ActionResultType method3304(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      boolean var6 = !this.method4090().method32105();
      boolean var7 = !var5.method32105();
      if (!this.field5495) {
         if (!this.field5024.field9020) {
            if (var6) {
               this.method2863(Class6067.field26712, 1.0F, 1.0F);
               this.method4094(this.method4093() + 1);
            } else if (var7 && !this.field5041) {
               this.method4091(var5);
               if (!var1.field4919.field29609) {
                  var5.method32182(1);
               }
            }

            return ActionResultType.field14819;
         } else {
            return !var6 && !var7 ? ActionResultType.field14820 : ActionResultType.field14818;
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   public int method4096() {
      return !this.method4090().method32105() ? this.method4093() % 8 + 1 : 0;
   }

   @Override
   public Packet<?> method2835() {
      return new Class5487(this, this.method3204(), this.field5489.method533(), this.method4085());
   }
}