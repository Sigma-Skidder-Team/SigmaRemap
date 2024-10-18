package mapped;

import java.util.Objects;
import javax.annotation.Nullable;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.BannerTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.world.IBlockReader;

public class Class7468 {
   private final BlockPos field32104;
   private final Class112 field32105;
   private final ITextComponent field32106;

   public Class7468(BlockPos var1, Class112 var2, ITextComponent var3) {
      this.field32104 = var1;
      this.field32105 = var2;
      this.field32106 = var3;
   }

   public static Class7468 method24183(CompoundNBT var0) {
      BlockPos var3 = Class8354.method29283(var0.getCompound("Pos"));
      Class112 var4 = Class112.method316(var0.getString("Color"), Class112.field386);
      IFormattableTextComponent var5 = !var0.contains("Name") ? null : ITextComponent$Serializer.getComponentFromJson(var0.getString("Name"));
      return new Class7468(var3, var4, var5);
   }

   @Nullable
   public static Class7468 method24184(IBlockReader var0, BlockPos var1) {
      TileEntity var4 = var0.getTileEntity(var1);
      if (!(var4 instanceof BannerTileEntity)) {
         return null;
      } else {
         BannerTileEntity var5 = (BannerTileEntity)var4;
         Class112 var6 = var5.method3894(() -> var0.getBlockState(var1));
         ITextComponent var7 = !var5.method3381() ? null : var5.method3380();
         return new Class7468(var1, var6, var7);
      }
   }

   public BlockPos method24185() {
      return this.field32104;
   }

   public MapDecorationType method24186() {
      switch (Class7178.field30861[this.field32105.ordinal()]) {
         case 1:
            return MapDecorationType.BANNER_WHITE;
         case 2:
            return MapDecorationType.BANNER_ORANGE;
         case 3:
            return MapDecorationType.BANNER_MAGENTA;
         case 4:
            return MapDecorationType.BANNER_LIGHT_BLUE;
         case 5:
            return MapDecorationType.BANNER_YELLOW;
         case 6:
            return MapDecorationType.BANNER_LIME;
         case 7:
            return MapDecorationType.BANNER_PINK;
         case 8:
            return MapDecorationType.BANNER_GRAY;
         case 9:
            return MapDecorationType.BANNER_LIGHT_GRAY;
         case 10:
            return MapDecorationType.BANNER_CYAN;
         case 11:
            return MapDecorationType.BANNER_PURPLE;
         case 12:
            return MapDecorationType.BANNER_BLUE;
         case 13:
            return MapDecorationType.BANNER_BROWN;
         case 14:
            return MapDecorationType.BANNER_GREEN;
         case 15:
            return MapDecorationType.BANNER_RED;
         case 16:
         default:
            return MapDecorationType.BANNER_BLACK;
      }
   }

   @Nullable
   public ITextComponent method24187() {
      return this.field32106;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Class7468 var4 = (Class7468)var1;
         return Objects.equals(this.field32104, var4.field32104) && this.field32105 == var4.field32105 && Objects.equals(this.field32106, var4.field32106);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field32104, this.field32105, this.field32106);
   }

   public CompoundNBT method24188() {
      CompoundNBT var3 = new CompoundNBT();
      var3.put("Pos", Class8354.method29284(this.field32104));
      var3.method109("Color", this.field32105.method310());
      if (this.field32106 != null) {
         var3.method109("Name", ITextComponent$Serializer.toJson(this.field32106));
      }

      return var3;
   }

   public String method24189() {
      return "banner-" + this.field32104.getX() + "," + this.field32104.getY() + "," + this.field32104.getZ();
   }
}
