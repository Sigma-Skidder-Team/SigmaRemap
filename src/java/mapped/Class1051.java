package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class Class1051 extends Class1050 {
   private static String[] field5812;

   public Class1051(EntityType<? extends Class1051> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public ItemStack method4796() {
      return new ItemStack(Items.field37894);
   }

   @Override
   public SoundEvent method4241() {
      return Sounds.field26458;
   }

   @Override
   public SoundEvent method2880() {
      return Sounds.field26459;
   }

   @Override
   public SoundEvent method2879(Class8654 var1) {
      return Sounds.field26461;
   }

   @Override
   public SoundEvent method4798() {
      return Sounds.field26460;
   }
}
