package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ActionResultType;

import java.util.Collection;

public class Class1081 extends Class1009 implements Class1080 {
   private static final DataParameter<Integer> field5938 = EntityDataManager.<Integer>method35441(Class1081.class, Class7784.field33391);
   private static final DataParameter<Boolean> field5939 = EntityDataManager.<Boolean>method35441(Class1081.class, Class7784.field33398);
   private static final DataParameter<Boolean> field5940 = EntityDataManager.<Boolean>method35441(Class1081.class, Class7784.field33398);
   private int field5941;
   private int field5942;
   private int field5943 = 30;
   private int field5944 = 3;
   private int field5945;

   public Class1081(EntityType<? extends Class1081> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      this.field5600.method20002(1, new Class2603(this));
      this.field5600.method20002(2, new Class2627(this));
      this.field5600.method20002(3, new Class2770<Class1090>(this, Class1090.class, 6.0F, 1.0, 1.2));
      this.field5600.method20002(3, new Class2770<Class1098>(this, Class1098.class, 6.0F, 1.0, 1.2));
      this.field5600.method20002(4, new Class2647(this, 1.0, false));
      this.field5600.method20002(5, new Class2737(this, 0.8));
      this.field5600.method20002(6, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(6, new Class2668(this));
      this.field5601.method20002(1, new Class2709<PlayerEntity>(this, PlayerEntity.class, true));
      this.field5601.method20002(2, new Class2704(this));
   }

   public static Class7037 method5018() {
      return Class1009.method4343().method21849(Attributes.MOVEMENT_SPEED, 0.25);
   }

   @Override
   public int method3370() {
      return this.method4232() != null ? 3 + (int)(this.getHealth() - 1.0F) : 3;
   }

   @Override
   public boolean method2921(float var1, float var2) {
      boolean var5 = super.method2921(var1, var2);
      this.field5942 = (int)((float)this.field5942 + var1 * 1.5F);
      if (this.field5942 > this.field5943 - 5) {
         this.field5942 = this.field5943 - 5;
      }

      return var5;
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5938, -1);
      this.dataManager.register(field5939, false);
      this.dataManager.register(field5940, false);
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      if (this.dataManager.<Boolean>method35445(field5939)) {
         var1.method115("powered", true);
      }

      var1.method101("Fuse", (short)this.field5943);
      var1.method100("ExplosionRadius", (byte)this.field5944);
      var1.method115("ignited", this.method5024());
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.dataManager.method35446(field5939, var1.method132("powered"));
      if (var1.method119("Fuse", 99)) {
         this.field5943 = var1.method121("Fuse");
      }

      if (var1.method119("ExplosionRadius", 99)) {
         this.field5944 = var1.method120("ExplosionRadius");
      }

      if (var1.method132("ignited")) {
         this.method5025();
      }
   }

   @Override
   public void tick() {
      if (this.isAlive()) {
         this.field5941 = this.field5942;
         if (this.method5024()) {
            this.method5021(1);
         }

         int var3 = this.method5020();
         if (var3 > 0 && this.field5942 == 0) {
            this.method2863(Sounds.field26484, 1.0F, 0.5F);
         }

         this.field5942 += var3;
         if (this.field5942 < 0) {
            this.field5942 = 0;
         }

         if (this.field5942 >= this.field5943) {
            this.field5942 = this.field5943;
            this.method5022();
         }
      }

      super.tick();
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Sounds.field26483;
   }

   @Override
   public Class9455 method2880() {
      return Sounds.field26482;
   }

   @Override
   public void method3054(Class8654 var1, int var2, boolean var3) {
      super.method3054(var1, var2, var3);
      Entity var6 = var1.method31109();
      if (var6 != this && var6 instanceof Class1081) {
         Class1081 var7 = (Class1081)var6;
         if (var7.method5026()) {
            var7.method5027();
            this.method3300(Items.field38062);
         }
      }
   }

   @Override
   public boolean method3114(Entity var1) {
      return true;
   }

   @Override
   public boolean method5016() {
      return this.dataManager.<Boolean>method35445(field5939);
   }

   public float method5019(float var1) {
      return MathHelper.lerp(var1, (float)this.field5941, (float)this.field5942) / (float)(this.field5943 - 2);
   }

   public int method5020() {
      return this.dataManager.<Integer>method35445(field5938);
   }

   public void method5021(int var1) {
      this.dataManager.method35446(field5938, var1);
   }

   @Override
   public void method3353(ServerWorld var1, Class906 var2) {
      super.method3353(var1, var2);
      this.dataManager.method35446(field5939, true);
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (var5.getItem() != Items.field37794) {
         return super.method4285(var1, var2);
      } else {
         this.world
            .method6743(
               var1,
               this.getPosX(),
               this.getPosY(),
               this.getPosZ(),
               Sounds.field26587,
               this.method2864(),
               1.0F,
               this.rand.nextFloat() * 0.4F + 0.8F
            );
         if (!this.world.isRemote) {
            this.method5025();
            var5.method32121(1, var1, var1x -> var1x.method3185(var2));
         }

         return ActionResultType.method9002(this.world.isRemote);
      }
   }

   private void method5022() {
      if (!this.world.isRemote) {
         Class2141 var3 = !this.world.method6789().method17135(Class5462.field24224) ? Class2141.field14014 : Class2141.field14016;
         float var4 = !this.method5016() ? 1.0F : 2.0F;
         this.field4972 = true;
         this.world.method6755(this, this.getPosX(), this.getPosY(), this.getPosZ(), (float)this.field5944 * var4, var3);
         this.method2904();
         this.method5023();
      }
   }

   private void method5023() {
      Collection<Class2023> var3 = this.method3031();
      if (!var3.isEmpty()) {
         Class999 var4 = new Class999(this.world, this.getPosX(), this.getPosY(), this.getPosZ());
         var4.method4097(2.5F);
         var4.method4110(-0.5F);
         var4.method4112(10);
         var4.method4109(var4.method4108() / 2);
         var4.method4111(-var4.method4098() / (float)var4.method4108());

         for (Class2023 var6 : var3) {
            var4.method4101(new Class2023(var6));
         }

         this.world.method6916(var4);
      }
   }

   public boolean method5024() {
      return this.dataManager.<Boolean>method35445(field5940);
   }

   public void method5025() {
      this.dataManager.method35446(field5940, true);
   }

   public boolean method5026() {
      return this.method5016() && this.field5945 < 1;
   }

   public void method5027() {
      this.field5945++;
   }
}
