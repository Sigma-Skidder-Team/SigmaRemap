package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Class4258 extends Class4247 {
   private List<String> field20641 = new ArrayList<String>();
   private Class4339 field20642;
   private Class4281 field20643;
   private boolean field20644;

   public Class4258(Class4305 var1, String var2, int var3, int var4, int var5, int var6, boolean var7, String... var8) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20644 = var7;
      this.method13230(this.field20643 = new Class4281(this, "textbox", 0, 0, var5, 32, Class4281.field20741, "", "Search...", ResourceRegistry.JelloLightFont14));
      this.field20643.method13306(ResourceRegistry.JelloLightFont18);
      this.field20643.method13151(var1x -> this.method13069(this.field20643.method13303()));
      this.method13071(var8);
      this.method13069("");
   }

   public void method13069(String var1) {
      this.method13222(() -> {
         if (this.field20642 != null) {
            this.method13236(this.field20642);
         }

         this.method13230(this.field20642 = new Class4339(this, "scrollview", 0, 40, this.field20897, this.field20898 - 40));
         byte var4 = 40;
         ArrayList<Class3257> var5 = new ArrayList();

         for (Class3257 var7 : Registry.field16075) {
            var5.add(var7);
         }

         var5.add(new Class3292(Blocks.field36588, new Class5643().method17779(Class7401.field31669)));
         var5.add(new Class3292(Blocks.field36649, new Class5643().method17779(Class7401.field31669)));

         for (Class3257 var13 : method13070(var5, var1)) {
            if (var13 != Class8514.field37222 && (!this.field20644 || var13 instanceof Class3292)) {
               ResourceLocation var8 = Registry.field16075.method9181(var13);
               String var9;
               if (var13 instanceof Class3292 && var8.method8292().equals("air")) {
                  var9 = Registry.field16072.method9181(((Class3292)var13).method11845()).toString();
               } else {
                  var9 = var8.toString();
               }

               Class4372 var10;
               this.field20642.method13230(var10 = new Class4372(this, "btn" + var9, 0, 0, var4, var4, var13.method11742()));
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

         this.field20642.method13517().method13246(new Class7260(0));
      });
   }

   public static List<Class3257> method13070(List<Class3257> var0, String var1) {
      var1 = var1.toLowerCase();
      if (var1.length() != 0) {
         ArrayList var4 = new ArrayList();
         Iterator var5 = var0.iterator();

         while (var5.hasNext()) {
            Class3257 var6 = (Class3257)var5.next();
            if (var6.method11717().getString().toLowerCase().startsWith(var1.toLowerCase())) {
               var4.add(var6);
               var5.remove();
            }
         }

         Iterator var9 = var0.iterator();

         while (var9.hasNext()) {
            Class3257 var7 = (Class3257)var9.next();
            if (var7.method11717().getString().toLowerCase().contains(var1.toLowerCase())) {
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
   public void method13027(float var1) {
      super.method13027(var1);
   }

   public void method13071(String... var1) {
      this.field20641.clear();
      this.field20641.addAll(Arrays.asList(var1));
   }

   public List<String> method13072() {
      return this.field20641;
   }
}
