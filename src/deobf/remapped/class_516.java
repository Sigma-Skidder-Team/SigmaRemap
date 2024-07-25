package remapped;

public abstract class class_516 extends class_5886 {
   public class_516(class_6629<? extends class_516> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      return false;
   }

   @Override
   public void method_37105(double var1, boolean var3, class_2522 var4, BlockPos var5) {
   }

   @Override
   public void method_26431(class_1343 var1) {
      if (!this.method_37285()) {
         if (!this.method_37370()) {
            float var4 = 0.91F;
            if (this.onGround) {
               var4 = this.world
                     .method_28262(new BlockPos(this.getPosX(), this.method_37309() - 1.0, this.getPosZ()))
                     .method_8360()
                     .method_29308()
                  * 0.91F;
            }

            float var5 = 0.16277137F / (var4 * var4 * var4);
            var4 = 0.91F;
            if (this.onGround) {
               var4 = this.world
                     .method_28262(new BlockPos(this.getPosX(), this.method_37309() - 1.0, this.getPosZ()))
                     .method_8360()
                     .method_29308()
                  * 0.91F;
            }

            this.method_37092(!this.onGround ? 0.02F : 0.1F * var5, var1);
            this.method_37226(class_7412.field_37839, this.method_37098());
            this.method_37215(this.method_37098().method_6209((double)var4));
         } else {
            this.method_37092(0.02F, var1);
            this.method_37226(class_7412.field_37839, this.method_37098());
            this.method_37215(this.method_37098().method_6209(0.5));
         }
      } else {
         this.method_37092(0.02F, var1);
         this.method_37226(class_7412.field_37839, this.method_37098());
         this.method_37215(this.method_37098().method_6209(0.8F));
      }

      this.method_26418(this, false);
   }

   @Override
   public boolean method_26505() {
      return false;
   }
}
