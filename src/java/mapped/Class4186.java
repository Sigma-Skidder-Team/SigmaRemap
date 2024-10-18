package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.feature.structure.EndCityPieces;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;

public class Class4186 extends Class4180 {
   private final String field20473;
   private final Rotation field20474;
   private final boolean field20475;

   public Class4186(TemplateManager var1, String var2, BlockPos var3, Rotation var4, boolean var5) {
      super(Class7792.field33475, 0);
      this.field20473 = var2;
      this.field20455 = var3;
      this.field20474 = var4;
      this.field20475 = var5;
      this.method12965(var1);
   }

   public Class4186(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33475, var2);
      this.field20473 = var2.getString("Template");
      this.field20474 = Rotation.valueOf(var2.getString("Rot"));
      this.field20475 = var2.getBoolean("OW");
      this.method12965(var1);
   }

   private void method12965(TemplateManager var1) {
      Class8969 var4 = var1.method31603(new ResourceLocation("end_city/" + this.field20473));
      Class9463 var5 = (!this.field20475 ? EndCityPieces.method36653() : EndCityPieces.method36652()).method36424().method36426(this.field20474);
      this.method12943(var4, this.field20455, var5);
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.method109("Template", this.field20473);
      var1.method109("Rot", this.field20474.name());
      var1.putBoolean("OW", this.field20475);
   }

   @Override
   public void method12944(String var1, BlockPos var2, Class1659 var3, Random var4, MutableBoundingBox var5) {
      if (!var1.startsWith("Chest")) {
         if (!var1.startsWith("Sentry")) {
            if (var1.startsWith("Elytra")) {
               ItemFrameEntity var8 = new ItemFrameEntity(var3.method6970(), var2, this.field20474.rotate(Direction.SOUTH));
               var8.method4092(new ItemStack(Items.field38120), false);
               var3.addEntity(var8);
            }
         } else {
            Class1057 var9 = EntityType.SHULKER.create(var3.method6970());
            var9.setPosition((double)var2.getX() + 0.5, (double)var2.getY() + 0.5, (double)var2.getZ() + 0.5);
            var9.method4850(var2);
            var3.addEntity(var9);
         }
      } else {
         BlockPos var10 = var2.down();
         if (var5.method38396(var10)) {
            Class939.method3740(var3, var4, var10, Class8793.field39535);
         }
      }
   }
}
