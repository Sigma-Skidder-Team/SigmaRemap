package mapped;

public class Class8080 implements IAmbientSoundHandler {
   private static String[] field34729;
   private final ClientPlayerEntity field34730;
   private boolean field34731;
   private boolean field34732 = true;

   public Class8080(ClientPlayerEntity var1) {
      this.field34730 = var1;
   }

   @Override
   public void tick() {
      World var3 = this.field34730.world;
      BlockState var4 = var3.method7004(this.field34730.method3389().method19663(0.0, -0.4F, 0.0).method19679(0.001))
         .filter(var0 -> var0.method23448(Blocks.field37013))
         .findFirst()
         .orElse((BlockState)null);
      if (var4 == null) {
         this.field34731 = false;
      } else {
         if (!this.field34731 && !this.field34732 && var4.method23448(Blocks.field37013) && !this.field34730.isSpectator()) {
            boolean var5 = var4.<Boolean>method23463(Class3406.field19084);
            if (!var5) {
               this.field34730.method2863(Class6067.field26423, 1.0F, 1.0F);
            } else {
               this.field34730.method2863(Class6067.field26425, 1.0F, 1.0F);
            }
         }

         this.field34731 = true;
      }

      this.field34732 = false;
   }
}
