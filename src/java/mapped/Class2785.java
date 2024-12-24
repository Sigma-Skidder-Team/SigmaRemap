package mapped;

import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.List;

public class Class2785 extends Class2595 {
   private static String[] field17405;
   private static final Class8522 field17406 = new Class8522().method30203(8.0).method30204().method30205().method30206();
   public final AnimalEntity field17407;
   private final Class<? extends AnimalEntity> field17408;
   public final World field17409;
   public AnimalEntity field17410;
   private int field17411;
   private final double field17412;

   public Class2785(AnimalEntity var1, double var2) {
      this(var1, var2, (Class<? extends AnimalEntity>)var1.getClass());
   }

   public Class2785(AnimalEntity var1, double var2, Class<? extends AnimalEntity> var4) {
      this.field17407 = var1;
      this.field17409 = var1.world;
      this.field17408 = var4;
      this.field17412 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      if (this.field17407.method4507()) {
         this.field17410 = this.method10978();
         return this.field17410 != null;
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return this.field17410.isAlive() && this.field17410.method4507() && this.field17411 < 60;
   }

   @Override
   public void method10807() {
      this.field17410 = null;
      this.field17411 = 0;
   }

   @Override
   public void method10805() {
      this.field17407.method4227().method28040(this.field17410, 10.0F, (float)this.field17407.method4259());
      this.field17407.method4230().method21655(this.field17410, this.field17412);
      this.field17411++;
      if (this.field17411 >= 60 && this.field17407.getDistanceSq(this.field17410) < 9.0) {
         this.method10979();
      }
   }

   @Nullable
   private AnimalEntity method10978() {
      List<AnimalEntity> var3 = this.field17409.method7195(this.field17408, field17406, this.field17407, this.field17407.getBoundingBox().grow(8.0));
      double var4 = Double.MAX_VALUE;
      AnimalEntity var6 = null;

      for (AnimalEntity var8 : var3) {
         if (this.field17407.method4386(var8) && this.field17407.getDistanceSq(var8) < var4) {
            var6 = var8;
            var4 = this.field17407.getDistanceSq(var8);
         }
      }

      return var6;
   }

   public void method10979() {
      this.field17407.method4509((ServerWorld)this.field17409, this.field17410);
   }
}
