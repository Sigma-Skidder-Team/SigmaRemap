package remapped;

import java.util.EnumSet;
import java.util.List;
import java.util.Random;

public class class_646<T extends class_4607> extends class_3599 {
   private static String[] field_3614;
   private final T field_3618;
   private final double field_3616;
   private final double field_3617;
   private long field_3615;

   public class_646(T var1, double var2, double var4) {
      this.field_3618 = (T)var1;
      this.field_3616 = var2;
      this.field_3617 = var4;
      this.field_3615 = -1L;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   @Override
   public boolean method_16795() {
      boolean var3 = this.field_3618.world.method_29546() < this.field_3615;
      return this.field_3618.method_21352()
         && this.field_3618.getAttackTarget() == null
         && !this.field_3618.method_37151()
         && this.field_3618.method_21353()
         && !var3;
   }

   @Override
   public void method_16796() {
   }

   @Override
   public void method_16793() {
   }

   @Override
   public void method_16794() {
      boolean var3 = this.field_3618.method_21359();
      PathNavigator var4 = this.field_3618.method_26927();
      if (var4.method_5591()) {
         List var5 = this.method_2974();
         if (this.field_3618.method_21352() && var5.isEmpty()) {
            this.field_3618.method_21351(false);
         } else if (var3 && this.field_3618.method_21358().method_12170(this.field_3618.method_37245(), 10.0)) {
            this.field_3618.method_21356();
         } else {
            Vector3d var6 = Vector3d.method_6200(this.field_3618.method_21358());
            Vector3d var7 = this.field_3618.method_37245();
            Vector3d var8 = var7.method_6194(var6);
            var6 = var8.method_6192(90.0F).method_6209(0.4).method_6215(var6);
            Vector3d var9 = var6.method_6194(var7).method_6213().method_6209(10.0).method_6215(var7);
            BlockPos var10 = new BlockPos(var9);
            var10 = this.field_3618.world.method_22563(class_3801.field_18590, var10);
            if (var4.method_5595(
               (double)var10.getX(), (double)var10.getY(), (double)var10.getZ(), !var3 ? this.field_3616 : this.field_3617
            )) {
               if (var3) {
                  for (class_4607 var12 : var5) {
                     var12.method_21349(var10);
                  }
               }
            } else {
               this.method_2973();
               this.field_3615 = this.field_3618.world.method_29546() + 200L;
            }
         }
      }
   }

   private List<class_4607> method_2974() {
      return this.field_3618
         .world
         .<class_4607>method_25869(
            class_4607.class, this.field_3618.getBoundingBox().grow(16.0), var1 -> var1.method_21350() && !var1.method_37171(this.field_3618)
         );
   }

   private boolean method_2973() {
      Random var3 = this.field_3618.method_26594();
      BlockPos var4 = this.field_3618
         .world
         .method_22563(class_3801.field_18590, this.field_3618.method_37075().method_6104(-8 + var3.nextInt(16), 0, -8 + var3.nextInt(16)));
      return this.field_3618.method_26927().method_5595((double)var4.getX(), (double)var4.getY(), (double)var4.getZ(), this.field_3616);
   }
}
