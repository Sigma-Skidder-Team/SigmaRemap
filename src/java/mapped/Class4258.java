package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Class4258 extends Class4247 {
   private List<String> field20641 = new ArrayList<String>();
   private Class4339 field20642;
   private UIInput field20643;
   private boolean field20644;

   public Class4258(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, boolean var7, String... var8) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20644 = var7;
      this.addToList(this.field20643 = new UIInput(this, "textbox", 0, 0, var5, 32, UIInput.field20741, "", "Search...", ResourceRegistry.JelloLightFont14));
      this.field20643.setFont(ResourceRegistry.JelloLightFont18);
      this.field20643.method13151(var1x -> this.method13069(this.field20643.getTypedText()));
      this.method13071(var8);
      this.method13069("");
   }

   public void method13069(String var1) {
      this.method13222(() -> {
         if (this.field20642 != null) {
            this.method13236(this.field20642);
         }

         this.addToList(this.field20642 = new Class4339(this, "scrollview", 0, 40, this.widthA, this.heightA - 40));
         byte var4 = 40;
         ArrayList<Item> var5 = new ArrayList();

         for (Item var7 : Registry.ITEM) {
            var5.add(var7);
         }

         var5.add(new BlockItem(Blocks.field36588, new Item.Properties().method17779(ItemGroup.field31669)));
         var5.add(new BlockItem(Blocks.field36649, new Item.Properties().method17779(ItemGroup.field31669)));

         for (Item var13 : method13070(var5, var1)) {
            if (var13 != Items.AIR && (!this.field20644 || var13 instanceof BlockItem)) {
               ResourceLocation var8 = Registry.ITEM.getKey(var13);
               String var9;
               if (var13 instanceof BlockItem && var8.getPath().equals("air")) {
                  var9 = Registry.BLOCK.getKey(((BlockItem)var13).method11845()).toString();
               } else {
                  var9 = var8.toString();
               }

               Class4372 var10;
               this.field20642.addToList(var10 = new Class4372(this, "btn" + var9, 0, 0, var4, var4, var13.getDefaultInstance()));
               var10.method13702(this.field20641.contains(var9), false);
               var10.method13036(var3 -> {
                  int var6 = this.field20641.size();
                  this.field20641.remove(var9);
                  if (var10.method13700()) {
                     this.field20641.add(var9);
                  }

                  if (var6 != this.field20641.size()) {
                     this.method13037();
                  }
               });
            }
         }

         this.field20642.getButton().method13246(new Class7260(0));
      });
   }

   public static List<Item> method13070(List<Item> var0, String var1) {
      var1 = var1.toLowerCase();
      if (var1.length() != 0) {
         ArrayList var4 = new ArrayList();
         Iterator var5 = var0.iterator();

         while (var5.hasNext()) {
            Item var6 = (Item)var5.next();
            if (var6.getName().getString().toLowerCase().startsWith(var1.toLowerCase())) {
               var4.add(var6);
               var5.remove();
            }
         }

         Iterator var9 = var0.iterator();

         while (var9.hasNext()) {
            Item var7 = (Item)var9.next();
            if (var7.getName().getString().toLowerCase().contains(var1.toLowerCase())) {
               var4.add(var7);
               var9.remove();
            }
         }

         var4.addAll(var0);
         return var4;
      } else {
         return var0;
      }
   }

   @Override
   public void draw(float var1) {
      super.draw(var1);
   }

   public void method13071(String... var1) {
      this.field20641.clear();
      this.field20641.addAll(Arrays.asList(var1));
   }

   public List<String> method13072() {
      return this.field20641;
   }
}
