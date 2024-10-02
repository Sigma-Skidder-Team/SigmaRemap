package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.command.CommandSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.GameRules;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class FunctionManager {
   private static final ResourceLocation field31179 = new ResourceLocation("tick");
   private static final ResourceLocation field31180 = new ResourceLocation("load");
   private final MinecraftServer field31181;
   private boolean field31182;
   private final ArrayDeque<Class7159> field31183 = new ArrayDeque<Class7159>();
   private final List<Class7159> field31184 = Lists.newArrayList();
   private final List<Class7744> field31185 = Lists.newArrayList();
   private boolean field31186;
   private Class301 field31187;

   public FunctionManager(MinecraftServer var1, Class301 var2) {
      this.field31181 = var1;
      this.field31187 = var2;
      this.method22827(var2);
   }

   public int method22821() {
      return this.field31181.getGameRules().method17136(GameRules.field24244);
   }

   public CommandDispatcher<CommandSource> method22822() {
      return this.field31181.getCommandManager().method18842();
   }

   public void method22823() {
      this.method22824(this.field31185, field31179);
      if (this.field31186) {
         this.field31186 = false;
         List var3 = this.field31187.method1179().method27132(field31180).getAllElements();
         this.method22824(var3, field31180);
      }
   }

   private void method22824(Collection<Class7744> var1, ResourceLocation var2) {
      this.field31181.method1420().method22504(var2::toString);

      for (Class7744 var6 : var1) {
         this.method22825(var6, this.method22828());
      }

      this.field31181.method1420().endSection();
   }

   public int method22825(Class7744 var1, CommandSource var2) {
      int var5 = this.method22821();
      if (this.field31182) {
         if (this.field31183.size() + this.field31184.size() < var5) {
            this.field31184.add(new Class7159(this, var2, new Class6798(var1)));
         }

         return 0;
      } else {
         int var18;
         try {
            this.field31182 = true;
            int var6 = 0;
            Class6797[] var7 = var1.method25653();

            for (int var8 = var7.length - 1; var8 >= 0; var8--) {
               this.field31183.push(new Class7159(this, var2, var7[var8]));
            }

            do {
               if (this.field31183.isEmpty()) {
                  return var6;
               }

               try {
                  Class7159 var17 = this.field31183.removeFirst();
                  this.field31181.method1420().method22504(var17::toString);
                  var17.method22399(this.field31183, var5);
                  if (!this.field31184.isEmpty()) {
                     Lists.reverse(this.field31184).forEach(this.field31183::addFirst);
                     this.field31184.clear();
                  }
               } finally {
                  this.field31181.method1420().endSection();
               }
            } while (++var6 < var5);

            var18 = var6;
         } finally {
            this.field31183.clear();
            this.field31184.clear();
            this.field31182 = false;
         }

         return var18;
      }
   }

   public void setFunctionReloader(Class301 var1) {
      this.field31187 = var1;
      this.method22827(var1);
   }

   private void method22827(Class301 var1) {
      this.field31185.clear();
      this.field31185.addAll(var1.method1179().method27132(field31179).getAllElements());
      this.field31186 = true;
   }

   public CommandSource method22828() {
      return this.field31181.getCommandSource().method20163(2).method20162();
   }

   public Optional<Class7744> method22829(ResourceLocation var1) {
      return this.field31187.method1177(var1);
   }

   public ITag<Class7744> method22830(ResourceLocation var1) {
      return this.field31187.method1180(var1);
   }

   public Iterable<ResourceLocation> method22831() {
      return this.field31187.method1178().keySet();
   }

   public Iterable<ResourceLocation> method22832() {
      return this.field31187.method1179().method27137();
   }
}
