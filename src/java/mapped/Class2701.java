package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.EnumSet;

public class Class2701 extends Class2699 {
   private static String[] field17165;
   private final LlamaEntity field17166;
   private LivingEntity field17167;
   private int field17168;
   public final TraderLlamaEntity field17169;

   public Class2701(TraderLlamaEntity var1, LlamaEntity var2) {
      super(var2, false);
      this.field17169 = var1;
      this.field17166 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14660));
   }

   @Override
   public boolean method10803() {
      if (this.field17166.method4296()) {
         Entity var3 = this.field17166.method4297();
         if (!(var3 instanceof WanderingTraderEntity)) {
            return false;
         } else {
            WanderingTraderEntity var4 = (WanderingTraderEntity)var3;
            this.field17167 = var4.method3014();
            int var5 = var4.method3015();
            return var5 != this.field17168 && this.method10915(this.field17167, Class8522.field38240);
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      this.field17153.method4233(this.field17167);
      Entity var3 = this.field17166.method4297();
      if (var3 instanceof WanderingTraderEntity) {
         this.field17168 = ((WanderingTraderEntity)var3).method3015();
      }

      super.method10804();
   }
}
