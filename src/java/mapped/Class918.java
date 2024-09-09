package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class Class918 extends AbstractMinecartEntity {
   private static final DataParameter<String> field5232 = EntityDataManager.<String>createKey(Class918.class, DataSerializers.field33393);
   private static final DataParameter<ITextComponent> field5233 = EntityDataManager.<ITextComponent>createKey(Class918.class, DataSerializers.field33394);
   private final CommandBlockLogic field5234 = new Class912(this);
   private int field5235;

   public Class918(EntityType<? extends Class918> var1, World var2) {
      super(var1, var2);
   }

   public Class918(World var1, double var2, double var4, double var6) {
      super(EntityType.field41052, var1, var2, var4, var6);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.getDataManager().register(field5232, "");
      this.getDataManager().register(field5233, StringTextComponent.EMPTY);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.field5234.method3561(var1);
      this.getDataManager().method35446(field5232, this.method3614().method3563());
      this.getDataManager().method35446(field5233, this.method3614().method3559());
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      this.field5234.method3560(var1);
   }

   @Override
   public MinecartType getMinecartType() {
      return MinecartType.COMMAND_BLOCK;
   }

   @Override
   public BlockState method3604() {
      return Blocks.COMMAND_BLOCK.method11579();
   }

   public CommandBlockLogic method3614() {
      return this.field5234;
   }

   @Override
   public void method3589(int var1, int var2, int var3, boolean var4) {
      if (var4 && this.ticksExisted - this.field5235 >= 4) {
         this.method3614().method3564(this.world);
         this.field5235 = this.ticksExisted;
      }
   }

   @Override
   public ActionResultType processInitialInteract(PlayerEntity var1, Hand var2) {
      return this.field5234.method3572(var1);
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      super.notifyDataManagerChange(var1);
      if (field5233.equals(var1)) {
         try {
            this.field5234.method3569(this.getDataManager().<ITextComponent>method35445(field5233));
         } catch (Throwable var5) {
         }
      } else if (field5232.equals(var1)) {
         this.field5234.method3562(this.getDataManager().<String>method35445(field5232));
      }
   }

   @Override
   public boolean method3404() {
      return true;
   }

   // $VF: synthetic method
   public static DataParameter method3615() {
      return field5232;
   }

   // $VF: synthetic method
   public static DataParameter method3616() {
      return field5233;
   }
}
