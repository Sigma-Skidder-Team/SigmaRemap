package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

import net.minecraft.client.Minecraft;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9016 {
   private static final Logger field41228 = LogManager.getLogger();
   private final PriorityQueue<Class2009> field41229 = Queues.newPriorityQueue();
   private final Queue<Class7828> field41230;
   private final Queue<Runnable> field41231 = Queues.newConcurrentLinkedQueue();
   private volatile int field41232;
   private volatile int field41233;
   private final Class7828 field41234;
   private final Class322<Runnable> field41235;
   private final Executor field41236;
   private World field41237;
   private final WorldRenderer field41238;
   private Vector3d field41239 = Vector3d.ZERO;
   private int field41240;
   private List<Class7828> field41241 = new ArrayList<Class7828>();
   public static final RenderType[] field41242 = RenderType.method14349().<RenderType>toArray(new RenderType[0]);
   private static final boolean field41243 = Class9299.field42864.method20245();
   private static final boolean field41244 = Class9299.field42940.method20214();
   private static final boolean field41245 = Class9299.field42940.method20214();
   private static final boolean field41246 = Class9299.field42895.method20214();
   public static int field41247;

   public Class9016(World var1, WorldRenderer var2, Executor var3, boolean var4, Class7828 var5) {
      this(var1, var2, var3, var4, var5, -1);
   }

   public Class9016(World var1, WorldRenderer var2, Executor var3, boolean var4, Class7828 var5, int var6) {
      this.field41237 = var1;
      this.field41238 = var2;
      int var9 = Math.max(
         1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / (RenderType.method14349().stream().mapToInt(RenderType::method14350).sum() * 4) - 1
      );
      int var10 = Runtime.getRuntime().availableProcessors();
      int var11 = var4 ? var10 : Math.min(var10, 4);
      int var12 = Math.max(1, Math.min(var11, var9));
      if (var6 > 0) {
         var12 = var6;
      }

      this.field41234 = var5;
      ArrayList var13 = Lists.newArrayListWithExpectedSize(var12);

      try {
         for (int var14 = 0; var14 < var12; var14++) {
            var13.add(new Class7828());
         }
      } catch (OutOfMemoryError var17) {
         field41228.warn("Allocated only {}/{} buffers", var13.size(), var12);
         int var15 = Math.min(var13.size() * 2 / 3, var13.size() - 1);

         for (int var16 = 0; var16 < var15; var16++) {
            var13.remove(var13.size() - 1);
         }

         System.gc();
      }

      this.field41230 = Queues.newArrayDeque(var13);
      this.field41233 = this.field41230.size();
      this.field41240 = this.field41233;
      this.field41236 = var3;
      this.field41235 = Class322.method1650(var3, "Chunk Renderer");
      this.field41235.method1641(this::method33319);
   }

   public void method33318(World var1) {
      this.field41237 = var1;
   }

   private void method33319() {
      if (!this.field41230.isEmpty()) {
         Class2009 var3 = this.field41229.poll();
         if (var3 != null) {
            Class7828 var4 = this.field41230.poll();
            this.field41232 = this.field41229.size();
            this.field41233 = this.field41230.size();
            CompletableFuture.runAsync(() -> {
            }, this.field41236).<Class2046>thenCompose(var2 -> var3.method8527(var4)).whenComplete((var2, var3x) -> {
               if (var3x == null) {
                  this.field41235.method1641(() -> {
                     if (var2 != Class2046.field13358) {
                        var4.method26205();
                     } else {
                        var4.method26204();
                     }

                     this.field41230.add(var4);
                     this.field41233 = this.field41230.size();
                     this.method33319();
                  });
               } else {
                  CrashReport var6 = CrashReport.makeCrashReport(var3x, "Batching chunks");
                  Minecraft.getInstance().crashed(Minecraft.getInstance().addGraphicsAndWorldToCrashReport(var6));
               }
            });
         }
      }
   }

   public String method33320() {
      return String.format("pC: %03d, pU: %02d, aB: %02d", this.field41232, this.field41231.size(), this.field41233);
   }

   public void method33321(Vector3d var1) {
      this.field41239 = var1;
   }

   public Vector3d method33322() {
      return this.field41239;
   }

   public boolean method33323() {
      boolean var3;
      Runnable var4;
      for (var3 = false; (var4 = this.field41231.poll()) != null; var3 = true) {
         var4.run();
      }

      return var3;
   }

   public void method33324(Class8066 var1) {
      var1.method27729();
   }

   public void method33325() {
      this.method33329();
   }

   public void method33326(Class2009 var1) {
      this.field41235.method1641(() -> {
         this.field41229.offer(var1);
         this.field41232 = this.field41229.size();
         this.method33319();
      });
   }

   public CompletableFuture<Void> method33327(BufferBuilder var1, Class1698 var2) {
      return CompletableFuture.runAsync(() -> {
      }, this.field41231::add).<Void>thenCompose(var3 -> this.method33328(var1, var2));
   }

   private CompletableFuture<Void> method33328(BufferBuilder var1, Class1698 var2) {
      return var2.method7304(var1);
   }

   private void method33329() {
      while (!this.field41229.isEmpty()) {
         Class2009 var3 = this.field41229.poll();
         if (var3 != null) {
            var3.method8528();
         }
      }

      this.field41232 = 0;
   }

   public boolean method33330() {
      return this.field41232 == 0 && this.field41231.isEmpty();
   }

   public void method33331() {
      this.method33329();
      this.field41235.close();
      this.field41230.clear();
   }

   public void method33332() {
      while (this.field41241.size() != this.field41240) {
         this.method33323();
         Class7828 var3 = this.field41230.poll();
         if (var3 != null) {
            this.field41241.add(var3);
         }
      }
   }

   public void method33333() {
      this.field41230.addAll(this.field41241);
      this.field41241.clear();
   }

   public boolean method33334(Class8066 var1) {
      this.method33324(var1);
      return true;
   }

   public boolean method33335(Class8066 var1) {
      if (!this.field41230.isEmpty()) {
         var1.method27727(this);
         return true;
      } else {
         return false;
      }
   }

   public boolean method33336(Class8066 var1) {
      return !this.field41230.isEmpty() ? var1.method27724(Class9025.field41291, this) : false;
   }

   // $VF: synthetic method
   public static World method33344(Class9016 var0) {
      return var0.field41237;
   }

   // $VF: synthetic method
   public static boolean method33345() {
      return field41243;
   }

   // $VF: synthetic method
   public static WorldRenderer method33346(Class9016 var0) {
      return var0.field41238;
   }

   // $VF: synthetic method
   public static Class7828 method33347(Class9016 var0) {
      return var0.field41234;
   }

   // $VF: synthetic method
   public static boolean method33348() {
      return field41245;
   }

   // $VF: synthetic method
   public static boolean method33349() {
      return field41244;
   }

   // $VF: synthetic method
   public static boolean method33350() {
      return field41246;
   }
}
