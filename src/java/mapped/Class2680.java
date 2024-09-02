package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

import java.util.EnumSet;

public class Class2680 extends Class2595 {
   private static final Class8522 field17078 = new Class8522().method30203(10.0).method30204().method30205().method30207().method30206();
   public final Class1046 field17079;
   private final double field17080;
   private double field17081;
   private double field17082;
   private double field17083;
   private double field17084;
   private double field17085;
   public PlayerEntity field17086;
   private int field17087;
   private boolean field17088;
   private final Class120 field17089;
   private final boolean field17090;

   public Class2680(Class1046 var1, double var2, Class120 var4, boolean var5) {
      this(var1, var2, var5, var4);
   }

   public Class2680(Class1046 var1, double var2, boolean var4, Class120 var5) {
      this.field17079 = var1;
      this.field17080 = var2;
      this.field17089 = var5;
      this.field17090 = var4;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
      if (!(var1.method4230() instanceof Class6991) && !(var1.method4230() instanceof Class6995)) {
         throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
      }
   }

   @Override
   public boolean method10803() {
      if (this.field17087 <= 0) {
         this.field17086 = this.field17079.world.method7188(field17078, this.field17079);
         return this.field17086 == null ? false : this.method10898(this.field17086.getHeldItemMainhand()) || this.method10898(this.field17086.method3091());
      } else {
         this.field17087--;
         return false;
      }
   }

   public boolean method10898(ItemStack var1) {
      return this.field17089.test(var1);
   }

   @Override
   public boolean method10806() {
      if (this.method10899()) {
         if (!(this.field17079.getDistanceSq(this.field17086) < 36.0)) {
            this.field17081 = this.field17086.getPosX();
            this.field17082 = this.field17086.getPosY();
            this.field17083 = this.field17086.getPosZ();
         } else {
            if (this.field17086.method3276(this.field17081, this.field17082, this.field17083) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.field17086.rotationPitch - this.field17084) > 5.0 || Math.abs((double)this.field17086.rotationYaw - this.field17085) > 5.0) {
               return false;
            }
         }

         this.field17084 = (double)this.field17086.rotationPitch;
         this.field17085 = (double)this.field17086.rotationYaw;
      }

      return this.method10803();
   }

   public boolean method10899() {
      return this.field17090;
   }

   @Override
   public void method10804() {
      this.field17081 = this.field17086.getPosX();
      this.field17082 = this.field17086.getPosY();
      this.field17083 = this.field17086.getPosZ();
      this.field17088 = true;
   }

   @Override
   public void method10807() {
      this.field17086 = null;
      this.field17079.method4230().method21666();
      this.field17087 = 100;
      this.field17088 = false;
   }

   @Override
   public void method10805() {
      this.field17079.method4227().method28040(this.field17086, (float)(this.field17079.method4260() + 20), (float)this.field17079.method4259());
      if (!(this.field17079.getDistanceSq(this.field17086) < 6.25)) {
         this.field17079.method4230().method21655(this.field17086, this.field17080);
      } else {
         this.field17079.method4230().method21666();
      }
   }

   public boolean method10900() {
      return this.field17088;
   }
}
