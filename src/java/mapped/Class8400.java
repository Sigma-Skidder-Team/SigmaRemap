package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;

import java.util.Map.Entry;
import javax.annotation.Nullable;

public class Class8400 {
   private static String[] field36046;
   public final Int2ObjectMap<Class1997> field36047 = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<IBakedModel> field36048 = new Int2ObjectOpenHashMap(256);
   private final ModelManager field36049;

   public Class8400(ModelManager var1) {
      this.field36049 = var1;
   }

   public TextureAtlasSprite method29490(IItemProvider var1) {
      return this.method29491(new ItemStack(var1));
   }

   public TextureAtlasSprite method29491(ItemStack var1) {
      IBakedModel var4 = this.method29492(var1);
      return var4 == this.field36049.getMissingModel() && var1.getItem() instanceof BlockItem
         ? this.field36049.method1025().getTexture(((BlockItem)var1.getItem()).method11845().getDefaultState())
         : var4.getParticleTexture();
   }

   public IBakedModel method29492(ItemStack var1) {
      IBakedModel var4 = this.method29493(var1.getItem());
      return var4 != null ? var4 : this.field36049.getMissingModel();
   }

   @Nullable
   public IBakedModel method29493(Item var1) {
      return (IBakedModel)this.field36048.get(method29494(var1));
   }

   private static int method29494(Item var0) {
      return Item.getIdFromItem(var0);
   }

   public void method29495(Item var1, Class1997 var2) {
      this.field36047.put(method29494(var1), var2);
   }

   public ModelManager method29496() {
      return this.field36049;
   }

   public void method29497() {
      this.field36048.clear();
      ObjectIterator var3 = this.field36047.entrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         this.field36048.put((Integer)var4.getKey(), this.field36049.method1023((Class1997)var4.getValue()));
      }
   }
}
