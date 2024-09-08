package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Direction;

public interface Class6226 {
   Class6226 field27722 = (var0, var1) -> var1;

   ItemStack method19196(Class2956 var1, ItemStack var2);

   static void method19200() {
      Class3357.method11931(Items.field37797, new Class6246());
      Class3357.method11931(Items.field38117, new Class6248());
      Class3357.method11931(Items.field38116, new Class6216());
      Class3357.method11931(Items.field37904, new Class6250());
      Class3357.method11931(Items.field37888, new Class6249());
      Class3357.method11931(Items.field38045, new Class6247());
      Class3357.method11931(Items.field38115, new Class6227());
      Class3357.method11931(Items.field38118, new Class6228());
      Class6220 var2 = new Class6220();

      for (SpawnEggItem var4 : SpawnEggItem.method11854()) {
         Class3357.method11931(var4, var2);
      }

      Class3357.method11931(Items.ARMOR_STAND, new Class6221());
      Class3357.method11931(Items.field37886, new Class6237());
      Class6242 var10 = new Class6242();
      Class3357.method11931(Items.field38086, var10);
      Class3357.method11931(Items.field38083, var10);
      Class3357.method11931(Items.field38084, var10);
      Class3357.method11931(Items.field38085, var10);
      Class3357.method11931(Items.field37572, var10);
      Class3357.method11931(Items.field37573, var10);
      Class3357.method11931(Items.field37581, var10);
      Class3357.method11931(Items.field37583, var10);
      Class3357.method11931(Items.field37584, var10);
      Class3357.method11931(Items.field37587, var10);
      Class3357.method11931(Items.field37579, var10);
      Class3357.method11931(Items.field37585, var10);
      Class3357.method11931(Items.field37575, var10);
      Class3357.method11931(Items.field37580, var10);
      Class3357.method11931(Items.field37577, var10);
      Class3357.method11931(Items.field37574, var10);
      Class3357.method11931(Items.field37578, var10);
      Class3357.method11931(Items.field37582, var10);
      Class3357.method11931(Items.field37586, var10);
      Class3357.method11931(Items.field37576, var10);
      Class3357.method11931(Items.field37402, new Class6231());
      Class3357.method11931(Items.field38068, new Class6223());
      Class3357.method11931(Items.field38046, new Class6222());
      Class3357.method11931(Items.field37889, new Class6225(Class2099.field13680));
      Class3357.method11931(Items.field38121, new Class6225(Class2099.field13681));
      Class3357.method11931(Items.field38122, new Class6225(Class2099.field13682));
      Class3357.method11931(Items.field38123, new Class6225(Class2099.field13683));
      Class3357.method11931(Items.field38125, new Class6225(Class2099.field13685));
      Class3357.method11931(Items.field38124, new Class6225(Class2099.field13684));
      Class6229 var11 = new Class6229();
      Class3357.method11931(Items.field37884, var11);
      Class3357.method11931(Items.field37883, var11);
      Class3357.method11931(Items.SALMON_BUCKET, var11);
      Class3357.method11931(Items.field37894, var11);
      Class3357.method11931(Items.field37892, var11);
      Class3357.method11931(Items.field37895, var11);
      Class3357.method11931(Items.field37882, new Class6243());
      Class3357.method11931(Items.field37794, new Class6234());
      Class3357.method11931(Items.field37934, new Class6241());
      Class3357.method11931(Blocks.TNT, new Class6219());
      Class6239 var5 = new Class6239();
      Class3357.method11931(Items.field38062, var5);
      Class3357.method11931(Items.field38061, var5);
      Class3357.method11931(Items.field38063, var5);
      Class3357.method11931(Items.field38058, var5);
      Class3357.method11931(Items.field38060, var5);
      Class3357.method11931(Items.field38059, new Class6238());
      Class3357.method11931(Blocks.field36589, new Class6235());
      Class3357.method11931(Blocks.field36896.method11581(), new Class6240());

      for (Class112 var9 : Class112.values()) {
         Class3357.method11931(Class3368.method11956(var9).method11581(), new Class6240());
      }

      Class3357.method11931(Items.field37972.method11581(), new Class6236());
      Class3357.method11931(Items.field37446, new Class6232());
      Class3357.method11931(Items.field37956.method11581(), new Class6233());
   }

   static void method19201(Class2956 var0, Entity var1, Direction var2) {
      var1.setPosition(
         var0.getX() + (double)var2.method539() * (0.5000099999997474 - (double)var1.method3429() / 2.0),
         var0.getY() + (double)var2.method540() * (0.5000099999997474 - (double)var1.method3430() / 2.0) - (double)var1.method3430() / 2.0,
         var0.getZ() + (double)var2.method541() * (0.5000099999997474 - (double)var1.method3429() / 2.0)
      );
   }
}
