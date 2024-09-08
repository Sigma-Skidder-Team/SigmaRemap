package mapped;

import com.mojang.authlib.GameProfile;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import org.apache.commons.lang3.StringUtils;

public class Class9809 {
   private static final Class940[] field45842 = Arrays.<Class112>stream(Class112.values())
      .sorted(Comparator.comparingInt(Class112::method309))
      .<Class940>map(Class940::new)
      .<Class940>toArray(Class940[]::new);
   private static final Class940 field45843 = new Class940((Class112)null);
   public static final Class9809 field45844 = new Class9809();
   private final Class941 field45845 = new Class941();
   private final Class941 field45846 = new Class970();
   private final Class943 field45847 = new Class943();
   private final Class958 field45848 = new Class958();
   private final Class967 field45849 = new Class967();
   private final Class959 field45850 = new Class959();
   private final Class2853 field45851 = new Class2853();
   private final Class2842 field45852 = new Class2842();

   public void method38685(ItemStack var1, Class2327 var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      if (Class8564.method30588()) {
         Class8564.method30590();
      }

      this.method38686(var1, var3, var4, var5, var6);
      if (Class8564.method30588()) {
         if (Class8564.method30594()) {
            Class8564.method30595();
            this.method38686(var1, var3, var4, Class1699.field9258, var6);
            Class8564.method30597();
         }

         Class8564.method30598();
      }
   }

   public void method38686(ItemStack var1, MatrixStack var2, Class7733 var3, int var4, int var5) {
      Item var8 = var1.getItem();
      if (!(var8 instanceof Class3292)) {
         if (var8 != Items.field38119) {
            if (var8 == Items.field38144) {
               var2.push();
               var2.method35292(1.0F, -1.0F, -1.0F);
               Class5422 var9 = ItemRenderer.method786(var3, this.field45852.method11028(Class2842.field17638), false, var1.method32159());
               this.field45852.method11016(var2, var9, var4, var5, 1.0F, 1.0F, 1.0F, 1.0F);
               var2.pop();
            }
         } else {
            boolean var13 = var1.method32145("BlockEntityTag") != null;
            var2.push();
            var2.method35292(1.0F, -1.0F, -1.0F);
            Class7826 var11 = !var13 ? ModelBakery.field40515 : ModelBakery.field40514;
            Class5422 var10 = var11.getSprite()
               .method7474(ItemRenderer.method786(var3, this.field45851.method11028(var11.method26196()), true, var1.method32159()));
            this.field45851.method11182().method22681(var2, var10, var4, var5, 1.0F, 1.0F, 1.0F, 1.0F);
            if (!var13) {
               this.field45851.method11181().method22681(var2, var10, var4, var5, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
               List var12 = Class958.method3891(Class3334.method11882(var1), Class958.method3886(var1));
               Class5948.method18479(var2, var3, var4, var5, this.field45851.method11181(), var11, false, var12, var1.method32159());
            }

            var2.pop();
         }
      } else {
         Block var14 = ((Class3292)var8).method11845();
         if (!(var14 instanceof Class3251)) {
            Object var17;
            if (!(var14 instanceof Class3359)) {
               if (!(var14 instanceof Class3250)) {
                  if (var14 != Blocks.field37007) {
                     if (var14 != Blocks.CHEST) {
                        if (var14 != Blocks.ENDER_CHEST) {
                           if (var14 != Blocks.TRAPPED_CHEST) {
                              if (!(var14 instanceof Class3368)) {
                                 return;
                              }

                              Class112 var15 = Class3368.method11954(var8);
                              if (var15 != null) {
                                 var17 = field45842[var15.method309()];
                              } else {
                                 var17 = field45843;
                              }
                           } else {
                              var17 = this.field45846;
                           }
                        } else {
                           var17 = this.field45847;
                        }
                     } else {
                        var17 = this.field45845;
                     }
                  } else {
                     var17 = this.field45850;
                  }
               } else {
                  this.field45849.method4001(((Class3250)var14).method11690());
                  var17 = this.field45849;
               }
            } else {
               this.field45848.method3887(var1, ((Class3359)var14).method11936());
               var17 = this.field45848;
            }

            TileEntityRendererDispatcher.instance.method27964((TileEntity)var17, var2, var3, var4, var5);
         } else {
            GameProfile var18 = null;
            if (var1.method32141()) {
               CompoundNBT var16 = var1.method32142();
               if (!var16.contains("SkullOwner", 10)) {
                  if (var16.contains("SkullOwner", 8) && !StringUtils.isBlank(var16.getString("SkullOwner"))) {
                     GameProfile var19 = new GameProfile((UUID)null, var16.getString("SkullOwner"));
                     var18 = SkullTileEntity.method4008(var19);
                     var16.method133("SkullOwner");
                     var16.put("SkullOwner", Class8354.method29279(new CompoundNBT(), var18));
                  }
               } else {
                  var18 = Class8354.method29278(var16.getCompound("SkullOwner"));
               }
            }

            Class5952.method18482((Direction)null, 180.0F, ((Class3251)var14).method11696(), var18, 0.0F, var2, var3, var4);
         }
      }
   }
}
