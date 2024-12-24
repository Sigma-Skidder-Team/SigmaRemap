package mapped;

import com.google.common.collect.Lists;
import net.minecraft.item.Item;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tags.ITag;
import net.minecraft.util.IItemProvider;

import java.util.List;

public class Class9735 {
   private static String[] field45458;
   private final List<Class8605> field45459 = Lists.newArrayList();
   private final List<Class8605> field45460 = Lists.newArrayList();
   private Item field45461;
   private ITag<Item> field45462;
   private Class8840 field45463 = Class8840.field39936;
   private Class8840 field45464 = Class8840.field39936;
   private Class8812 field45465;
   private Class8811 field45466 = Class8811.field39645;

   private Class9735() {
   }

   public static Class9735 method38146() {
      return new Class9735();
   }

   public Class9735 method38147(IItemProvider var1) {
      this.field45461 = var1.asItem();
      return this;
   }

   public Class9735 method38148(ITag<Item> var1) {
      this.field45462 = var1;
      return this;
   }

   public Class9735 method38149(CompoundNBT var1) {
      this.field45466 = new Class8811(var1);
      return this;
   }

   public Class9735 method38150(Class8605 var1) {
      this.field45459.add(var1);
      return this;
   }

   public Class8634 method38151() {
      return new Class8634(
         this.field45462,
         this.field45461,
         this.field45463,
         this.field45464,
         this.field45459.<Class8605>toArray(Class8605.field38716),
         this.field45460.<Class8605>toArray(Class8605.field38716),
         this.field45465,
         this.field45466
      );
   }
}
