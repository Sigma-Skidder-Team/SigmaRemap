package mapped;

import com.mentalfrostbyte.jello.viaversion.ViaVersionLoader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class Class8982 {
   private final ViaVersionLoader field40988;
   private HashMap<BlockPos, BlockState> field40989 = new HashMap<BlockPos, BlockState>();
   private HashMap<BlockPos, BlockState> field40990 = new HashMap<BlockPos, BlockState>();
   private Set<Class6490> field40991 = new HashSet<Class6490>();
   private Set<Class8189> field40992 = new HashSet<Class8189>();
   private Set<Class8189> field40993 = new HashSet<Class8189>();
   private List<Runnable> field40994 = new ArrayList<Runnable>();

   public Class8982(ViaVersionLoader var1) {
      this.field40988 = var1;
      this.method33173();
   }

   private void method33172(Class6490 var1) {
      this.field40991.add(var1);
   }

   private void method33173() {
      this.method33172(new Class6499());
      this.method33172(new Class6494());
      this.method33172(new Class6491());
      this.method33172(new Class6496());
      this.method33172(new Class6497());
      this.method33172(new Class6489());
      this.method33172(new Class6493());
      this.method33172(new Class6498());
      this.method33172(new Class6495());
      this.method33172(new Class6492());
   }

   public void method33174() {
      for (Entry var4 : this.field40989.entrySet()) {
         this.method33178((BlockPos)var4.getKey(), (BlockState)var4.getValue());
      }

      this.field40989.clear();
   }

   public void method33175() {
      for (Entry var4 : this.field40990.entrySet()) {
         this.method33181((BlockPos)var4.getKey(), (BlockState)var4.getValue());
      }

      this.field40990.clear();
   }

   public void method33176() {
      this.field40992.clear();
      this.field40989.clear();
   }

   public void method33177() {
      for (Class8189 var4 : this.field40993) {
         Minecraft.getInstance().world.setBlockState(var4.field35207, var4.field35208);
      }

      this.field40993.clear();
      int var5 = this.field40994.size();

      for (int var6 = 0; var6 < var5; var6++) {
         this.field40994.get(var6).run();
         this.field40994.remove(var6);
         var6--;
         var5--;
      }
   }

   private void method33178(BlockPos var1, BlockState var2) {
      Class6490 var5 = this.method33179(var2);
      if (var5 != null) {
         try {
            this.field40992.addAll(var5.method19687(var1, var2, this));
         } catch (ArrayIndexOutOfBoundsException | NullPointerException var7) {
            var7.printStackTrace();
         }
      }
   }

   private Class6490 method33179(BlockState var1) {
      for (Class6490 var5 : this.field40991) {
         if (var5.field28458 == var1.getBlock().getClass()) {
            return var5;
         }
      }

      return null;
   }

   public Packet method33180(Packet var1) {
      HashMap var4 = new HashMap();
      HashMap var5 = new HashMap();
      if (!(var1 instanceof Class5549)) {
         if (var1 instanceof Class5607) {
            Class5607 var6 = (Class5607)var1;
            if (!this.method33182(var6.method17631())) {
               var5.put(var6.method17632(), var6.method17631());
            } else {
               var4.put(var6.method17632(), new Class8189(var6.method17632(), var6.method17631()));
            }
         }
      } else {
         Class5549 var9 = (Class5549)var1;

         for (int var7 = 0; var7 < var9.field24643.length; var7++) {
            BlockPos var8 = var9.field24642.method8405(var9.field24643[var7]);
            if (!this.method33182(var9.field24644[var7])) {
               var5.put(var8, var9.field24644[var7]);
            } else {
               var4.put(var8, new Class8189(var8, var9.field24644[var7]));
            }
         }
      }

      for (Class8189 var12 : this.field40992) {
         var4.put(var12.field35207, new Class8189(var12.field35207, var12.field35208));
      }

      this.field40992.clear();
      Class1503 var11 = new Class1503(this, var4, var5);
      this.field40994.add(var11);
      return null;
   }

   private void method33181(BlockPos var1, BlockState var2) {
      Class6490 var5 = this.method33179(var2);
      if (var5 != null) {
         this.field40993.addAll(var5.method19688(var1, var2, this));
      }
   }

   public boolean method33182(BlockState var1) {
      return this.method33179(var1) != null;
   }

   public void method33183(BlockPos var1, BlockState var2) {
      this.field40989.put(var1, var2);
      this.field40990.put(var1, var2);
   }

   public BlockState method33184(BlockPos var1) {
      if (!this.field40989.containsKey(var1)) {
         return !this.field40990.containsKey(var1) ? Minecraft.getInstance().world.getBlockState(var1) : this.field40990.get(var1);
      } else {
         return this.field40989.get(var1);
      }
   }

   public void method33185(Chunk var1) {
      for (Class8189 var5 : this.field40992) {
         var1.setBlockState(var5.field35207, var5.field35208, false);
      }

      this.field40992.clear();
   }
}
