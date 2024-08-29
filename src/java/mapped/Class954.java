package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.util.text.*;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;

import javax.annotation.Nullable;
import java.util.function.Function;

public class Class954 extends TileEntity {
   private final ITextComponent[] field5356 = new ITextComponent[]{
      StringTextComponent.EMPTY, StringTextComponent.EMPTY, StringTextComponent.EMPTY, StringTextComponent.EMPTY
   };
   private boolean field5357 = true;
   private PlayerEntity field5358;
   private final Class9125[] field5359 = new Class9125[4];
   private Class112 field5360 = Class112.field401;

   public Class954() {
      super(Class4387.field21428);
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);

      for (int var4 = 0; var4 < 4; var4++) {
         String var5 = ITextComponent$Serializer.toJson(this.field5356[var4]);
         var1.method109("Text" + (var4 + 1), var5);
      }

      var1.method109("Color", this.field5360.method310());
      return var1;
   }

   @Override
   public void method3645(BlockState var1, CompoundNBT var2) {
      this.field5357 = false;
      super.method3645(var1, var2);
      this.field5360 = Class112.method316(var2.method126("Color"), Class112.field401);

      for (int var5 = 0; var5 < 4; var5++) {
         String var6 = var2.method126("Text" + (var5 + 1));
         IFormattableTextComponent var7 = ITextComponent$Serializer.func_240643_a_(var6.isEmpty() ? "\"\"" : var6);
         if (this.field5324 instanceof ServerWorld) {
            try {
               this.field5356[var5] = TextComponentUtils.func_240645_a_(this.method3843((ServerPlayerEntity)null), var7, (Entity)null, 0);
            } catch (CommandSyntaxException var9) {
               this.field5356[var5] = var7;
            }
         } else {
            this.field5356[var5] = var7;
         }

         this.field5359[var5] = null;
      }
   }

   public ITextComponent method3835(int var1) {
      return this.field5356[var1];
   }

   public void method3836(int var1, ITextComponent var2) {
      this.field5356[var1] = var2;
      this.field5359[var1] = null;
   }

   @Nullable
   public Class9125 method3837(int var1, Function<ITextComponent, Class9125> var2) {
      if (this.field5359[var1] == null && this.field5356[var1] != null) {
         this.field5359[var1] = (Class9125)var2.apply(this.field5356[var1]);
      }

      return this.field5359[var1];
   }

   @Nullable
   @Override
   public Class5610 method3776() {
      return new Class5610(this.field5325, 9, this.method3777());
   }

   @Override
   public CompoundNBT method3777() {
      return this.write(new CompoundNBT());
   }

   @Override
   public boolean method3783() {
      return true;
   }

   public boolean method3838() {
      return this.field5357;
   }

   public void method3839(boolean var1) {
      this.field5357 = var1;
      if (!var1) {
         this.field5358 = null;
      }
   }

   public void method3840(PlayerEntity var1) {
      this.field5358 = var1;
   }

   public PlayerEntity method3841() {
      return this.field5358;
   }

   public boolean method3842(PlayerEntity var1) {
      for (ITextComponent var7 : this.field5356) {
         Style var8 = var7 != null ? var7.getStyle() : null;
         if (var8 != null && var8.getClickEvent() != null) {
            ClickEvent var9 = var8.getClickEvent();
            if (var9.getAction() == ClickEvent$Action.RUN_COMMAND) {
               var1.method3396().getCommandManager().handleCommand(this.method3843((ServerPlayerEntity)var1), var9.getValue());
            }
         }
      }

      return true;
   }

   public Class6619 method3843(ServerPlayerEntity var1) {
      String var4 = var1 != null ? var1.getName().getString() : "Sign";
      Object var5 = var1 != null ? var1.getDisplayName() : new StringTextComponent("Sign");
      return new Class6619(
         Class909.field5189,
         Vector3d.method11328(this.field5325),
         Class8513.field37212,
         (ServerWorld)this.field5324,
         2,
         var4,
         (ITextComponent)var5,
         this.field5324.method6715(),
         var1
      );
   }

   public Class112 method3844() {
      return this.field5360;
   }

   public boolean method3845(Class112 var1) {
      if (var1 == this.method3844()) {
         return false;
      } else {
         this.field5360 = var1;
         this.method3622();
         this.field5324.method6731(this.getPos(), this.method3775(), this.method3775(), 3);
         return true;
      }
   }
}
