package mapped;

import java.util.List;

public class Class1106 extends Class1105 {
   private static String[] field6077;
   public static final float field6078 = EntityType.field41022.method33213() / EntityType.field41036.method33213();

   public Class1106(EntityType<? extends Class1106> var1, World var2) {
      super(var1, var2);
      this.method4278();
      if (this.field6076 != null) {
         this.field6076.method10945(400);
      }
   }

   public static Class7037 method5314() {
      return Class1105.method5300().method21849(Class9173.field42108, 0.3F).method21849(Class9173.field42110, 8.0).method21849(Class9173.field42105, 80.0);
   }

   @Override
   public int method5303() {
      return 60;
   }

   @Override
   public Class9455 method4241() {
      return !this.method3255() ? Sounds.field26525 : Sounds.field26524;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return !this.method3255() ? Sounds.field26531 : Sounds.field26530;
   }

   @Override
   public Class9455 method2880() {
      return !this.method3255() ? Sounds.field26528 : Sounds.field26527;
   }

   @Override
   public Class9455 method5307() {
      return Sounds.field26529;
   }

   @Override
   public void method4258() {
      super.method4258();
      short var3 = 1200;
      if ((this.ticksExisted + this.method3205()) % 1200 == 0) {
         Class7144 var4 = Class8254.field35470;
         List<ServerPlayerEntity> var5 = ((ServerWorld)this.world).method6914(var1 -> this.getDistanceSq(var1) < 2500.0 && var1.field4857.method33865());

         for (ServerPlayerEntity var10 : var5) {
            if (!var10.method3033(var4) || var10.method3034(var4).method8629() < 2 || var10.method3034(var4).method8628() < 1200) {
               var10.field4855.sendPacket(new Class5534(Class5534.field24570, !this.method3245() ? 1.0F : 0.0F));
               var10.method3035(new Class2023(var4, 6000, 2));
            }
         }
      }

      if (!this.method4291()) {
         this.method4288(this.getPosition(), 16);
      }
   }
}
