package mapped;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.stats.Stats;
import net.minecraft.world.server.ServerWorld;

public class Class2786 extends Class2785 {
   private static String[] field17405;
   public final Class1095 field17413;

   public Class2786(Class1095 var1, double var2) {
      super(var1, var2);
      this.field17413 = var1;
   }

   @Override
   public void method10804() {
      Class1095.method5167((Class1095)this.field17407);
      Class1095.method5167((Class1095)this.field17410);
      super.method10804();
   }

   @Override
   public void method10979() {
      ServerWorld var3 = (ServerWorld)this.field17409;
      Class1095 var4 = (Class1095)this.field17407.method4389(var3, this.field17410);
      if (var4 != null) {
         ServerPlayerEntity var5 = this.field17407.method4506();
         ServerPlayerEntity var6 = this.field17410.method4506();
         ServerPlayerEntity var7 = var5;
         if (var5 == null) {
            var7 = var6;
         } else {
            Class1095.method5171(var4, var5.getUniqueID());
         }

         if (var6 != null && var5 != var6) {
            Class1095.method5171(var4, var6.getUniqueID());
         }

         if (var7 != null) {
            var7.method2911(Stats.field40136);
            CriteriaTriggers.field44479.method15112(var7, this.field17407, this.field17410, var4);
         }

         this.field17407.method4770(6000);
         this.field17410.method4770(6000);
         this.field17407.method4508();
         this.field17410.method4508();
         var4.method4770(-24000);
         var4.setLocationAndAngles(this.field17407.getPosX(), this.field17407.getPosY(), this.field17407.getPosZ(), 0.0F, 0.0F);
         var3.method6995(var4);
         this.field17409.setEntityState(this.field17407, (byte)18);
         if (this.field17409.getGameRules().getBoolean(Class5462.field24227)) {
            this.field17409
               .addEntity(
                  new ExperienceOrbEntity(
                     this.field17409,
                     this.field17407.getPosX(),
                     this.field17407.getPosY(),
                     this.field17407.getPosZ(),
                     this.field17407.getRNG().nextInt(7) + 1
                  )
               );
         }
      }
   }
}
