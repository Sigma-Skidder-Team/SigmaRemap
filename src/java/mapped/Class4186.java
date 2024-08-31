package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class4186 extends Class4180 {
   private final String field20473;
   private final Class80 field20474;
   private final boolean field20475;

   public Class4186(Class8761 var1, String var2, BlockPos var3, Class80 var4, boolean var5) {
      super(Class7792.field33475, 0);
      this.field20473 = var2;
      this.field20455 = var3;
      this.field20474 = var4;
      this.field20475 = var5;
      this.method12965(var1);
   }

   public Class4186(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33475, var2);
      this.field20473 = var2.method126("Template");
      this.field20474 = Class80.valueOf(var2.method126("Rot"));
      this.field20475 = var2.method132("OW");
      this.method12965(var1);
   }

   private void method12965(Class8761 var1) {
      Class8969 var4 = var1.method31603(new ResourceLocation("end_city/" + this.field20473));
      Class9463 var5 = (!this.field20475 ? Class9489.method36653() : Class9489.method36652()).method36424().method36426(this.field20474);
      this.method12943(var4, this.field20455, var5);
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.method109("Template", this.field20473);
      var1.method109("Rot", this.field20474.name());
      var1.method115("OW", this.field20475);
   }

   @Override
   public void method12944(String var1, BlockPos var2, Class1659 var3, Random var4, Class9764 var5) {
      if (!var1.startsWith("Chest")) {
         if (!var1.startsWith("Sentry")) {
            if (var1.startsWith("Elytra")) {
               ItemFrameEntity var8 = new ItemFrameEntity(var3.method6970(), var2, this.field20474.method252(Direction.SOUTH));
               var8.method4092(new ItemStack(Items.field38120), false);
               var3.method6916(var8);
            }
         } else {
            Class1057 var9 = EntityType.field41075.method33215(var3.method6970());
            var9.setPosition((double)var2.getX() + 0.5, (double)var2.getY() + 0.5, (double)var2.getZ() + 0.5);
            var9.method4850(var2);
            var3.method6916(var9);
         }
      } else {
         BlockPos var10 = var2.down();
         if (var5.method38396(var10)) {
            Class939.method3740(var3, var4, var10, Class8793.field39535);
         }
      }
   }
}
