package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.vector.Vector3d;

import java.util.EnumSet;
import java.util.List;

public class Class2780 extends Class2595 {
   private static String[] field17381;
   public final LlamaEntity field17382;
   private double field17383;
   private int field17384;

   public Class2780(LlamaEntity var1, double var2) {
      this.field17382 = var1;
      this.field17383 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (!this.field17382.method4296() && !this.field17382.method4914()) {
         List<Entity> var3 = this.field17382.world.getEntitiesInAABBexcluding(this.field17382, this.field17382.getBoundingBox().grow(9.0, 4.0, 9.0), var0 -> {
            EntityType var3x = var0.getType();
            return var3x == EntityType.LLAMA || var3x == EntityType.TRADER_LLAMA;
         });
         LlamaEntity var4 = null;
         double var5 = Double.MAX_VALUE;

         for (Entity var8 : var3) {
            LlamaEntity var9 = (LlamaEntity)var8;
            if (var9.method4914() && !var9.method4913()) {
               double var10 = this.field17382.getDistanceSq(var9);
               if (!(var10 > var5)) {
                  var5 = var10;
                  var4 = var9;
               }
            }
         }

         if (var4 == null) {
            for (Entity var13 : var3) {
               LlamaEntity var14 = (LlamaEntity)var13;
               if (var14.method4296() && !var14.method4913()) {
                  double var15 = this.field17382.getDistanceSq(var14);
                  if (!(var15 > var5)) {
                     var5 = var15;
                     var4 = var14;
                  }
               }
            }
         }

         if (var4 == null) {
            return false;
         } else if (var5 < 4.0) {
            return false;
         } else if (!var4.method4296() && !this.method10971(var4, 1)) {
            return false;
         } else {
            this.field17382.method4912(var4);
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      if (this.field17382.method4914() && this.field17382.method4915().isAlive() && this.method10971(this.field17382, 0)) {
         double var3 = this.field17382.getDistanceSq(this.field17382.method4915());
         if (var3 > 676.0) {
            if (this.field17383 <= 3.0) {
               this.field17383 *= 1.2;
               this.field17384 = 40;
               return true;
            }

            if (this.field17384 == 0) {
               return false;
            }
         }

         if (this.field17384 > 0) {
            this.field17384--;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method10807() {
      this.field17382.method4911();
      this.field17383 = 2.1;
   }

   @Override
   public void method10805() {
      if (this.field17382.method4914() && !(this.field17382.method4297() instanceof LeashKnotEntity)) {
         LlamaEntity var3 = this.field17382.method4915();
         double var4 = (double)this.field17382.getDistance(var3);
         float var6 = 2.0F;
         Vector3d var7 = new Vector3d(
               var3.getPosX() - this.field17382.getPosX(),
               var3.getPosY() - this.field17382.getPosY(),
               var3.getPosZ() - this.field17382.getPosZ()
            )
            .method11333()
            .scale(Math.max(var4 - 2.0, 0.0));
         this.field17382
            .method4230()
            .method21654(
               this.field17382.getPosX() + var7.x,
               this.field17382.getPosY() + var7.y,
               this.field17382.getPosZ() + var7.z,
               this.field17383
            );
      }
   }

   private boolean method10971(LlamaEntity var1, int var2) {
      if (var2 <= 8) {
         if (!var1.method4914()) {
            return false;
         } else if (!var1.method4915().method4296()) {
            LlamaEntity var5 = var1.method4915();
            return this.method10971(var5, ++var2);
         } else {
            return true;
         }
      } else {
         return false;
      }
   }
}
