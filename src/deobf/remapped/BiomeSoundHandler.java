package remapped;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import java.util.Random;

public class BiomeSoundHandler implements IAmbientSoundHandler {
   private static String[] field_34966;
   private final ClientPlayerEntity field_34963;
   private final class_3541 field_34964;
   private final class_859 field_34960;
   private final Random field_34961;
   private Object2ObjectArrayMap<class_6325, class_7311> field_34967 = new Object2ObjectArrayMap();
   private Optional<class_3161> field_34962 = Optional.<class_3161>empty();
   private Optional<class_3902> field_34965 = Optional.<class_3902>empty();
   private float field_34959;
   private class_6325 field_34958;

   public BiomeSoundHandler(ClientPlayerEntity var1, class_3541 var2, class_859 var3) {
      this.field_34961 = var1.world.method_43360();
      this.field_34963 = var1;
      this.field_34964 = var2;
      this.field_34960 = var3;
   }

   public float method_31088() {
      return this.field_34959;
   }

   @Override
   public void tick() {
      this.field_34967.values().removeIf(class_6165::method_29512);
      class_6325 var3 = this.field_34960.method_3724(this.field_34963.getPosX(), this.field_34963.method_37309(), this.field_34963.getPosZ());
      if (var3 != this.field_34958) {
         this.field_34958 = var3;
         this.field_34962 = var3.method_28878();
         this.field_34965 = var3.method_28885();
         this.field_34967.values().forEach(class_7311::method_33354);
         var3.method_28876().ifPresent(var2 -> {
            class_7311 var5 = (class_7311)this.field_34967.compute(var3, (var2x, var3x) -> {
               if (var3x == null) {
                  var3x = new class_7311(var2);
                  this.field_34964.play(var3x);
               }

               var3x.method_33353();
               return var3x;
            });
         });
      }

      this.field_34965.ifPresent(var1 -> {
         if (this.field_34961.nextDouble() < var1.method_18054()) {
            this.field_34964.play(class_4949.method_22681(var1.method_18056()));
         }
      });
      this.field_34962
         .ifPresent(
            var1 -> {
               World var4 = this.field_34963.world;
               int var5 = var1.method_14589() * 2 + 1;
               BlockPos var6 = new BlockPos(
                  this.field_34963.getPosX() + (double)this.field_34961.nextInt(var5) - (double)var1.method_14589(),
                  this.field_34963.method_37388() + (double)this.field_34961.nextInt(var5) - (double)var1.method_14589(),
                  this.field_34963.getPosZ() + (double)this.field_34961.nextInt(var5) - (double)var1.method_14589()
               );
               int var7 = var4.method_25266(class_2957.field_14437, var6);
               if (var7 <= 0) {
                  this.field_34959 = this.field_34959 - (float)(var4.method_25266(class_2957.field_14440, var6) - 1) / (float)var1.method_14590();
               } else {
                  this.field_34959 = this.field_34959 - (float)var7 / (float)var4.method_28255() * 0.001F;
               }

               if (!(this.field_34959 >= 1.0F)) {
                  this.field_34959 = Math.max(this.field_34959, 0.0F);
               } else {
                  double var8 = (double)var6.method_12173() + 0.5;
                  double var10 = (double)var6.method_12165() + 0.5;
                  double var12 = (double)var6.method_12185() + 0.5;
                  double var14 = var8 - this.field_34963.getPosX();
                  double var16 = var10 - this.field_34963.method_37388();
                  double var18 = var12 - this.field_34963.getPosZ();
                  double var20 = (double)class_9299.method_42842(var14 * var14 + var16 * var16 + var18 * var18);
                  double var22 = var20 + var1.method_14591();
                  class_4949 var24 = class_4949.method_22677(
                     var1.method_14592(),
                     this.field_34963.getPosX() + var14 / var20 * var22,
                     this.field_34963.method_37388() + var16 / var20 * var22,
                     this.field_34963.getPosZ() + var18 / var20 * var22
                  );
                  this.field_34964.play(var24);
                  this.field_34959 = 0.0F;
               }
            }
         );
   }
}
