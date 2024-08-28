package mapped;

import com.google.common.collect.ImmutableList;
import com.google.gson.JsonElement;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Class9407 {
   private final Consumer<Class5146> field43642;
   private final BiConsumer<ResourceLocation, Supplier<JsonElement>> field43643;
   private final Consumer<Class3257> field43644;

   public Class9407(Consumer<Class5146> var1, BiConsumer<ResourceLocation, Supplier<JsonElement>> var2, Consumer<Class3257> var3) {
      this.field43642 = var1;
      this.field43643 = var2;
      this.field43644 = var3;
   }

   private void method35804(Class3209 var1) {
      this.field43644.accept(var1.method11581());
   }

   private void method35805(Class3209 var1, ResourceLocation var2) {
      this.field43643.accept(Class9060.method33724(var1.method11581()), new Class5149(var2));
   }

   private void method35806(Class3257 var1, ResourceLocation var2) {
      this.field43643.accept(Class9060.method33724(var1), new Class5149(var2));
   }

   private void method35807(Class3257 var1) {
      Class9756.field45623.method34808(Class9060.method33724(var1), Class7287.method23038(var1), this.field43643);
   }

   private void method35808(Class3209 var1) {
      Class3257 var4 = var1.method11581();
      if (var4 != Class8514.field37222) {
         Class9756.field45623.method34808(Class9060.method33724(var4), Class7287.method23039(var1), this.field43643);
      }
   }

   private void method35809(Class3209 var1, String var2) {
      Class3257 var5 = var1.method11581();
      Class9756.field45623.method34808(Class9060.method33724(var5), Class7287.method23040(Class7287.method23042(var1, var2)), this.field43643);
   }

   private static Class3629 method35810() {
      return Class3629.<Direction>method12310(Class8820.field39722)
         .method12320(Direction.EAST, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13817))
         .method12320(Direction.SOUTH, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13818))
         .method12320(Direction.WEST, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13819))
         .method12320(Direction.NORTH, Class5138.method15912());
   }

   private static Class3629 method35811() {
      return Class3629.<Direction>method12310(Class8820.field39722)
         .method12320(Direction.SOUTH, Class5138.method15912())
         .method12320(Direction.WEST, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13817))
         .method12320(Direction.NORTH, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13818))
         .method12320(Direction.EAST, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13819));
   }

   private static Class3629 method35812() {
      return Class3629.<Direction>method12310(Class8820.field39722)
         .method12320(Direction.EAST, Class5138.method15912())
         .method12320(Direction.SOUTH, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13817))
         .method12320(Direction.WEST, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13818))
         .method12320(Direction.NORTH, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13819));
   }

   private static Class3629 method35813() {
      return Class3629.<Direction>method12310(Class8820.field39720)
         .method12320(Direction.field672, Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817))
         .method12320(Direction.field673, Class5138.method15912().method15911(Class6891.field29862, Class2120.field13819))
         .method12320(Direction.NORTH, Class5138.method15912())
         .method12320(Direction.SOUTH, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13818))
         .method12320(Direction.WEST, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13819))
         .method12320(Direction.EAST, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13817));
   }

   private static Class5148 method35814(Class3209 var0, ResourceLocation var1) {
      return Class5148.method15943(var0, method35815(var1));
   }

   private static Class5138[] method35815(ResourceLocation var0) {
      return new Class5138[]{
         Class5138.method15912().method15911(Class6891.field29864, var0),
         Class5138.method15912().method15911(Class6891.field29864, var0).method15911(Class6891.field29863, Class2120.field13817),
         Class5138.method15912().method15911(Class6891.field29864, var0).method15911(Class6891.field29863, Class2120.field13818),
         Class5138.method15912().method15911(Class6891.field29864, var0).method15911(Class6891.field29863, Class2120.field13819)
      };
   }

   private static Class5148 method35816(Class3209 var0, ResourceLocation var1, ResourceLocation var2) {
      return Class5148.method15943(
         var0,
         Class5138.method15912().method15911(Class6891.field29864, var1),
         Class5138.method15912().method15911(Class6891.field29864, var2),
         Class5138.method15912().method15911(Class6891.field29864, var1).method15911(Class6891.field29863, Class2120.field13818),
         Class5138.method15912().method15911(Class6891.field29864, var2).method15911(Class6891.field29863, Class2120.field13818)
      );
   }

   private static Class3629 method35817(Class8551 var0, ResourceLocation var1, ResourceLocation var2) {
      return Class3629.<Boolean>method12310(var0)
         .method12320(true, Class5138.method15912().method15911(Class6891.field29864, var1))
         .method12320(false, Class5138.method15912().method15911(Class6891.field29864, var2));
   }

   private void method35818(Class3209 var1) {
      ResourceLocation var4 = Class7524.field32271.method25591(var1, this.field43643);
      ResourceLocation var5 = Class7524.field32272.method25591(var1, this.field43643);
      this.field43642.accept(method35816(var1, var4, var5));
   }

   private void method35819(Class3209 var1) {
      ResourceLocation var4 = Class7524.field32271.method25591(var1, this.field43643);
      this.field43642.accept(method35814(var1, var4));
   }

   private static Class5146 method35820(Class3209 var0, ResourceLocation var1, ResourceLocation var2) {
      return Class5148.method15941(var0)
         .method15939(
            Class3629.<Boolean>method12310(Class8820.field39704)
               .method12320(false, Class5138.method15912().method15911(Class6891.field29864, var1))
               .method12320(true, Class5138.method15912().method15911(Class6891.field29864, var2))
         )
         .method15939(
            Class3629.<Class103, Direction>method12311(Class8820.field39724, Class8820.field39722)
               .method12300(Class103.field313, Direction.EAST, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13817))
               .method12300(Class103.field313, Direction.WEST, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13819))
               .method12300(Class103.field313, Direction.SOUTH, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13818))
               .method12300(Class103.field313, Direction.NORTH, Class5138.method15912())
               .method12300(
                  Class103.field314,
                  Direction.EAST,
                  Class5138.method15912()
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29862, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method12300(
                  Class103.field314,
                  Direction.WEST,
                  Class5138.method15912()
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29862, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method12300(
                  Class103.field314,
                  Direction.SOUTH,
                  Class5138.method15912()
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29862, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method12300(
                  Class103.field314,
                  Direction.NORTH,
                  Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817).method15911(Class6891.field29865, true)
               )
               .method12300(
                  Class103.field315,
                  Direction.EAST,
                  Class5138.method15912().method15911(Class6891.field29863, Class2120.field13819).method15911(Class6891.field29862, Class2120.field13818)
               )
               .method12300(
                  Class103.field315,
                  Direction.WEST,
                  Class5138.method15912().method15911(Class6891.field29863, Class2120.field13817).method15911(Class6891.field29862, Class2120.field13818)
               )
               .method12300(Class103.field315, Direction.SOUTH, Class5138.method15912().method15911(Class6891.field29862, Class2120.field13818))
               .method12300(
                  Class103.field315,
                  Direction.NORTH,
                  Class5138.method15912().method15911(Class6891.field29863, Class2120.field13818).method15911(Class6891.field29862, Class2120.field13818)
               )
         );
   }

   private static Class3632<Direction, Class84, Class183, Boolean> method35821(
           Class3632<Direction, Class84, Class183, Boolean> var0, Class84 var1, ResourceLocation var2, ResourceLocation var3
   ) {
      return var0.method12324(Direction.EAST, var1, Class183.field664, false, Class5138.method15912().method15911(Class6891.field29864, var2))
         .method12324(
            Direction.SOUTH,
            var1,
            Class183.field664,
            false,
            Class5138.method15912().method15911(Class6891.field29864, var2).method15911(Class6891.field29863, Class2120.field13817)
         )
         .method12324(
            Direction.WEST,
            var1,
            Class183.field664,
            false,
            Class5138.method15912().method15911(Class6891.field29864, var2).method15911(Class6891.field29863, Class2120.field13818)
         )
         .method12324(
            Direction.NORTH,
            var1,
            Class183.field664,
            false,
            Class5138.method15912().method15911(Class6891.field29864, var2).method15911(Class6891.field29863, Class2120.field13819)
         )
         .method12324(Direction.EAST, var1, Class183.field665, false, Class5138.method15912().method15911(Class6891.field29864, var3))
         .method12324(
            Direction.SOUTH,
            var1,
            Class183.field665,
            false,
            Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13817)
         )
         .method12324(
            Direction.WEST,
            var1,
            Class183.field665,
            false,
            Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13818)
         )
         .method12324(
            Direction.NORTH,
            var1,
            Class183.field665,
            false,
            Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13819)
         )
         .method12324(
            Direction.EAST,
            var1,
            Class183.field664,
            true,
            Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13817)
         )
         .method12324(
            Direction.SOUTH,
            var1,
            Class183.field664,
            true,
            Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13818)
         )
         .method12324(
            Direction.WEST,
            var1,
            Class183.field664,
            true,
            Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13819)
         )
         .method12324(Direction.NORTH, var1, Class183.field664, true, Class5138.method15912().method15911(Class6891.field29864, var3))
         .method12324(
            Direction.EAST,
            var1,
            Class183.field665,
            true,
            Class5138.method15912().method15911(Class6891.field29864, var2).method15911(Class6891.field29863, Class2120.field13819)
         )
         .method12324(Direction.SOUTH, var1, Class183.field665, true, Class5138.method15912().method15911(Class6891.field29864, var2))
         .method12324(
            Direction.WEST,
            var1,
            Class183.field665,
            true,
            Class5138.method15912().method15911(Class6891.field29864, var2).method15911(Class6891.field29863, Class2120.field13817)
         )
         .method12324(
            Direction.NORTH,
            var1,
            Class183.field665,
            true,
            Class5138.method15912().method15911(Class6891.field29864, var2).method15911(Class6891.field29863, Class2120.field13818)
         );
   }

   private static Class5146 method35822(Class3209 var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3, ResourceLocation var4) {
      return Class5148.method15941(var0)
         .method15939(
            method35821(
               method35821(
                  Class3629.<Direction, Class84, Class183, Boolean>method12313(
                     Class8820.field39722, Class8820.field39734, Class8820.field39767, Class8820.field39702
                  ),
                  Class84.field210,
                  var1,
                  var2
               ),
               Class84.field209,
               var3,
               var4
            )
         );
   }

   private static Class5146 method35823(Class3209 var0, ResourceLocation var1, ResourceLocation var2) {
      return Class5147.method15932(var0)
         .method15934(Class5138.method15912().method15911(Class6891.field29864, var1))
         .method15937(
            Class5141.method15919().method15924(Class8820.field39716, true),
            Class5138.method15912().method15911(Class6891.field29864, var2).method15911(Class6891.field29865, true)
         )
         .method15937(
            Class5141.method15919().method15924(Class8820.field39717, true),
            Class5138.method15912()
               .method15911(Class6891.field29864, var2)
               .method15911(Class6891.field29863, Class2120.field13817)
               .method15911(Class6891.field29865, true)
         )
         .method15937(
            Class5141.method15919().method15924(Class8820.field39718, true),
            Class5138.method15912()
               .method15911(Class6891.field29864, var2)
               .method15911(Class6891.field29863, Class2120.field13818)
               .method15911(Class6891.field29865, true)
         )
         .method15937(
            Class5141.method15919().method15924(Class8820.field39719, true),
            Class5138.method15912()
               .method15911(Class6891.field29864, var2)
               .method15911(Class6891.field29863, Class2120.field13819)
               .method15911(Class6891.field29865, true)
         );
   }

   private static Class5146 method35824(Class3209 var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
      return Class5147.method15932(var0)
         .method15937(Class5141.method15919().method15924(Class8820.field39714, true), Class5138.method15912().method15911(Class6891.field29864, var1))
         .method15937(
            Class5141.method15919().method15924(Class8820.field39727, Class184.field668),
            Class5138.method15912().method15911(Class6891.field29864, var2).method15911(Class6891.field29865, true)
         )
         .method15937(
            Class5141.method15919().method15924(Class8820.field39726, Class184.field668),
            Class5138.method15912()
               .method15911(Class6891.field29864, var2)
               .method15911(Class6891.field29863, Class2120.field13817)
               .method15911(Class6891.field29865, true)
         )
         .method15937(
            Class5141.method15919().method15924(Class8820.field39728, Class184.field668),
            Class5138.method15912()
               .method15911(Class6891.field29864, var2)
               .method15911(Class6891.field29863, Class2120.field13818)
               .method15911(Class6891.field29865, true)
         )
         .method15937(
            Class5141.method15919().method15924(Class8820.field39729, Class184.field668),
            Class5138.method15912()
               .method15911(Class6891.field29864, var2)
               .method15911(Class6891.field29863, Class2120.field13819)
               .method15911(Class6891.field29865, true)
         )
         .method15937(
            Class5141.method15919().method15924(Class8820.field39727, Class184.field669),
            Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29865, true)
         )
         .method15937(
            Class5141.method15919().method15924(Class8820.field39726, Class184.field669),
            Class5138.method15912()
               .method15911(Class6891.field29864, var3)
               .method15911(Class6891.field29863, Class2120.field13817)
               .method15911(Class6891.field29865, true)
         )
         .method15937(
            Class5141.method15919().method15924(Class8820.field39728, Class184.field669),
            Class5138.method15912()
               .method15911(Class6891.field29864, var3)
               .method15911(Class6891.field29863, Class2120.field13818)
               .method15911(Class6891.field29865, true)
         )
         .method15937(
            Class5141.method15919().method15924(Class8820.field39729, Class184.field669),
            Class5138.method15912()
               .method15911(Class6891.field29864, var3)
               .method15911(Class6891.field29863, Class2120.field13819)
               .method15911(Class6891.field29865, true)
         );
   }

   private static Class5146 method35825(Class3209 var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3, ResourceLocation var4) {
      return Class5148.method15942(var0, Class5138.method15912().method15911(Class6891.field29865, true))
         .method15939(method35811())
         .method15939(
            Class3629.<Boolean, Boolean>method12311(Class8820.field39698, Class8820.field39702)
               .method12300(false, false, Class5138.method15912().method15911(Class6891.field29864, var2))
               .method12300(true, false, Class5138.method15912().method15911(Class6891.field29864, var4))
               .method12300(false, true, Class5138.method15912().method15911(Class6891.field29864, var1))
               .method12300(true, true, Class5138.method15912().method15911(Class6891.field29864, var3))
         );
   }

   private static Class5146 method35826(Class3209 var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
      return Class5148.method15941(var0)
         .method15939(
            Class3629.<Direction, Class99, Class106>method12312(Class8820.field39722, Class8820.field39735, Class8820.field39771)
               .method12326(Direction.EAST, Class99.field271, Class106.field329, Class5138.method15912().method15911(Class6891.field29864, var2))
               .method12326(
                  Direction.WEST,
                  Class99.field271,
                  Class106.field329,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var2)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.SOUTH,
                  Class99.field271,
                  Class106.field329,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var2)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.NORTH,
                  Class99.field271,
                  Class106.field329,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var2)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(Direction.EAST, Class99.field271, Class106.field333, Class5138.method15912().method15911(Class6891.field29864, var3))
               .method12326(
                  Direction.WEST,
                  Class99.field271,
                  Class106.field333,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.SOUTH,
                  Class99.field271,
                  Class106.field333,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.NORTH,
                  Class99.field271,
                  Class106.field333,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.EAST,
                  Class99.field271,
                  Class106.field332,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.WEST,
                  Class99.field271,
                  Class106.field332,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(Direction.SOUTH, Class99.field271, Class106.field332, Class5138.method15912().method15911(Class6891.field29864, var3))
               .method12326(
                  Direction.NORTH,
                  Class99.field271,
                  Class106.field332,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(Direction.EAST, Class99.field271, Class106.field331, Class5138.method15912().method15911(Class6891.field29864, var1))
               .method12326(
                  Direction.WEST,
                  Class99.field271,
                  Class106.field331,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var1)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.SOUTH,
                  Class99.field271,
                  Class106.field331,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var1)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.NORTH,
                  Class99.field271,
                  Class106.field331,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var1)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.EAST,
                  Class99.field271,
                  Class106.field330,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var1)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.WEST,
                  Class99.field271,
                  Class106.field330,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var1)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(Direction.SOUTH, Class99.field271, Class106.field330, Class5138.method15912().method15911(Class6891.field29864, var1))
               .method12326(
                  Direction.NORTH,
                  Class99.field271,
                  Class106.field330,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var1)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.EAST,
                  Class99.field270,
                  Class106.field329,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var2)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.WEST,
                  Class99.field270,
                  Class106.field329,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var2)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.SOUTH,
                  Class99.field270,
                  Class106.field329,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var2)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.NORTH,
                  Class99.field270,
                  Class106.field329,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var2)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.EAST,
                  Class99.field270,
                  Class106.field333,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.WEST,
                  Class99.field270,
                  Class106.field333,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.SOUTH,
                  Class99.field270,
                  Class106.field333,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.NORTH,
                  Class99.field270,
                  Class106.field333,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.EAST,
                  Class99.field270,
                  Class106.field332,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.WEST,
                  Class99.field270,
                  Class106.field332,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.SOUTH,
                  Class99.field270,
                  Class106.field332,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.NORTH,
                  Class99.field270,
                  Class106.field332,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.EAST,
                  Class99.field270,
                  Class106.field331,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var1)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.WEST,
                  Class99.field270,
                  Class106.field331,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var1)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.SOUTH,
                  Class99.field270,
                  Class106.field331,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var1)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.NORTH,
                  Class99.field270,
                  Class106.field331,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var1)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.EAST,
                  Class99.field270,
                  Class106.field330,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var1)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.WEST,
                  Class99.field270,
                  Class106.field330,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var1)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.SOUTH,
                  Class99.field270,
                  Class106.field330,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var1)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method12326(
                  Direction.NORTH,
                  Class99.field270,
                  Class106.field330,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var1)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
         );
   }

   private static Class5146 method35827(Class3209 var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
      return Class5148.method15941(var0)
         .method15939(
            Class3629.<Direction, Class99, Boolean>method12312(Class8820.field39722, Class8820.field39735, Class8820.field39702)
               .method12326(Direction.NORTH, Class99.field271, false, Class5138.method15912().method15911(Class6891.field29864, var2))
               .method12326(
                  Direction.SOUTH,
                  Class99.field271,
                  false,
                  Class5138.method15912().method15911(Class6891.field29864, var2).method15911(Class6891.field29863, Class2120.field13818)
               )
               .method12326(
                  Direction.EAST,
                  Class99.field271,
                  false,
                  Class5138.method15912().method15911(Class6891.field29864, var2).method15911(Class6891.field29863, Class2120.field13817)
               )
               .method12326(
                  Direction.WEST,
                  Class99.field271,
                  false,
                  Class5138.method15912().method15911(Class6891.field29864, var2).method15911(Class6891.field29863, Class2120.field13819)
               )
               .method12326(Direction.NORTH, Class99.field270, false, Class5138.method15912().method15911(Class6891.field29864, var1))
               .method12326(
                  Direction.SOUTH,
                  Class99.field270,
                  false,
                  Class5138.method15912().method15911(Class6891.field29864, var1).method15911(Class6891.field29863, Class2120.field13818)
               )
               .method12326(
                  Direction.EAST,
                  Class99.field270,
                  false,
                  Class5138.method15912().method15911(Class6891.field29864, var1).method15911(Class6891.field29863, Class2120.field13817)
               )
               .method12326(
                  Direction.WEST,
                  Class99.field270,
                  false,
                  Class5138.method15912().method15911(Class6891.field29864, var1).method15911(Class6891.field29863, Class2120.field13819)
               )
               .method12326(Direction.NORTH, Class99.field271, true, Class5138.method15912().method15911(Class6891.field29864, var3))
               .method12326(
                  Direction.SOUTH,
                  Class99.field271,
                  true,
                  Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13818)
               )
               .method12326(
                  Direction.EAST,
                  Class99.field271,
                  true,
                  Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13817)
               )
               .method12326(
                  Direction.WEST,
                  Class99.field271,
                  true,
                  Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13819)
               )
               .method12326(
                  Direction.NORTH,
                  Class99.field270,
                  true,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13818)
               )
               .method12326(
                  Direction.SOUTH,
                  Class99.field270,
                  true,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13816)
               )
               .method12326(
                  Direction.EAST,
                  Class99.field270,
                  true,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13819)
               )
               .method12326(
                  Direction.WEST,
                  Class99.field270,
                  true,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29862, Class2120.field13818)
                     .method15911(Class6891.field29863, Class2120.field13817)
               )
         );
   }

   private static Class5146 method35828(Class3209 var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
      return Class5148.method15941(var0)
         .method15939(
            Class3629.<Direction, Class99, Boolean>method12312(Class8820.field39722, Class8820.field39735, Class8820.field39702)
               .method12326(Direction.NORTH, Class99.field271, false, Class5138.method15912().method15911(Class6891.field29864, var2))
               .method12326(Direction.SOUTH, Class99.field271, false, Class5138.method15912().method15911(Class6891.field29864, var2))
               .method12326(Direction.EAST, Class99.field271, false, Class5138.method15912().method15911(Class6891.field29864, var2))
               .method12326(Direction.WEST, Class99.field271, false, Class5138.method15912().method15911(Class6891.field29864, var2))
               .method12326(Direction.NORTH, Class99.field270, false, Class5138.method15912().method15911(Class6891.field29864, var1))
               .method12326(Direction.SOUTH, Class99.field270, false, Class5138.method15912().method15911(Class6891.field29864, var1))
               .method12326(Direction.EAST, Class99.field270, false, Class5138.method15912().method15911(Class6891.field29864, var1))
               .method12326(Direction.WEST, Class99.field270, false, Class5138.method15912().method15911(Class6891.field29864, var1))
               .method12326(Direction.NORTH, Class99.field271, true, Class5138.method15912().method15911(Class6891.field29864, var3))
               .method12326(
                  Direction.SOUTH,
                  Class99.field271,
                  true,
                  Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13818)
               )
               .method12326(
                  Direction.EAST,
                  Class99.field271,
                  true,
                  Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13817)
               )
               .method12326(
                  Direction.WEST,
                  Class99.field271,
                  true,
                  Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13819)
               )
               .method12326(Direction.NORTH, Class99.field270, true, Class5138.method15912().method15911(Class6891.field29864, var3))
               .method12326(
                  Direction.SOUTH,
                  Class99.field270,
                  true,
                  Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13818)
               )
               .method12326(
                  Direction.EAST,
                  Class99.field270,
                  true,
                  Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13817)
               )
               .method12326(
                  Direction.WEST,
                  Class99.field270,
                  true,
                  Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13819)
               )
         );
   }

   private static Class5148 method35829(Class3209 var0, ResourceLocation var1) {
      return Class5148.method15942(var0, Class5138.method15912().method15911(Class6891.field29864, var1));
   }

   private static Class3629 method35830() {
      return Class3629.<Class113>method12310(Class8820.field39713)
         .method12320(Class113.field414, Class5138.method15912())
         .method12320(Class113.field415, Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817))
         .method12320(
            Class113.field413,
            Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817).method15911(Class6891.field29863, Class2120.field13817)
         );
   }

   private static Class5146 method35831(Class3209 var0, ResourceLocation var1) {
      return Class5148.method15942(var0, Class5138.method15912().method15911(Class6891.field29864, var1)).method15939(method35830());
   }

   private void method35832(Class3209 var1, ResourceLocation var2) {
      this.field43642.accept(method35831(var1, var2));
   }

   private void method35833(Class3209 var1, Class7732 var2) {
      ResourceLocation var5 = var2.method25591(var1, this.field43643);
      this.field43642.accept(method35831(var1, var5));
   }

   private void method35834(Class3209 var1, Class7732 var2) {
      ResourceLocation var5 = var2.method25591(var1, this.field43643);
      this.field43642.accept(Class5148.method15942(var1, Class5138.method15912().method15911(Class6891.field29864, var5)).method15939(method35810()));
   }

   private static Class5146 method35835(Class3209 var0, ResourceLocation var1, ResourceLocation var2) {
      return Class5148.method15941(var0)
         .method15939(
            Class3629.<Class113>method12310(Class8820.field39713)
               .method12320(Class113.field414, Class5138.method15912().method15911(Class6891.field29864, var1))
               .method12320(
                  Class113.field415, Class5138.method15912().method15911(Class6891.field29864, var2).method15911(Class6891.field29862, Class2120.field13817)
               )
               .method12320(
                  Class113.field413,
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var2)
                     .method15911(Class6891.field29862, Class2120.field13817)
                     .method15911(Class6891.field29863, Class2120.field13817)
               )
         );
   }

   private void method35836(Class3209 var1, Class7732 var2, Class7732 var3) {
      ResourceLocation var6 = var2.method25591(var1, this.field43643);
      ResourceLocation var7 = var3.method25591(var1, this.field43643);
      this.field43642.accept(method35835(var1, var6, var7));
   }

   private ResourceLocation method35837(Class3209 var1, String var2, Class9253 var3, Function<ResourceLocation, Class7287> var4) {
      return var3.method34806(var1, var2, (Class7287)var4.apply(Class7287.method23042(var1, var2)), this.field43643);
   }

   private static Class5146 method35838(Class3209 var0, ResourceLocation var1, ResourceLocation var2) {
      return Class5148.method15941(var0).method15939(method35817(Class8820.field39704, var2, var1));
   }

   private static Class5146 method35839(Class3209 var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
      return Class5148.method15941(var0)
         .method15939(
            Class3629.<Class86>method12310(Class8820.field39770)
               .method12320(Class86.field219, Class5138.method15912().method15911(Class6891.field29864, var1))
               .method12320(Class86.field218, Class5138.method15912().method15911(Class6891.field29864, var2))
               .method12320(Class86.field220, Class5138.method15912().method15911(Class6891.field29864, var3))
         );
   }

   private void method35840(Class3209 var1) {
      this.method35841(var1, Class7524.field32271);
   }

   private void method35841(Class3209 var1, Class7732 var2) {
      this.field43642.accept(method35829(var1, var2.method25591(var1, this.field43643)));
   }

   private void method35842(Class3209 var1, Class7287 var2, Class9253 var3) {
      ResourceLocation var6 = var3.method34805(var1, var2, this.field43643);
      this.field43642.accept(method35829(var1, var6));
   }

   private Class8659 method35843(Class3209 var1, Class7524 var2) {
      return new Class8659(this, var2.method24560()).method31165(var1, var2.method24559());
   }

   private Class8659 method35844(Class3209 var1, Class7732 var2) {
      Class7524 var5 = var2.method25590(var1);
      return new Class8659(this, var5.method24560()).method31165(var1, var5.method24559());
   }

   private Class8659 method35845(Class3209 var1) {
      return this.method35844(var1, Class7524.field32271);
   }

   private Class8659 method35846(Class7287 var1) {
      return new Class8659(this, var1);
   }

   private void method35847(Class3209 var1) {
      Class7287 var4 = Class7287.method23021(var1);
      ResourceLocation var5 = Class9756.field45549.method34805(var1, var4, this.field43643);
      ResourceLocation var6 = Class9756.field45550.method34805(var1, var4, this.field43643);
      ResourceLocation var7 = Class9756.field45551.method34805(var1, var4, this.field43643);
      ResourceLocation var8 = Class9756.field45552.method34805(var1, var4, this.field43643);
      this.method35807(var1.method11581());
      this.field43642.accept(method35822(var1, var5, var6, var7, var8));
   }

   private void method35848(Class3209 var1) {
      Class7287 var4 = Class7287.method22997(var1);
      ResourceLocation var5 = Class9756.field45576.method34805(var1, var4, this.field43643);
      ResourceLocation var6 = Class9756.field45577.method34805(var1, var4, this.field43643);
      ResourceLocation var7 = Class9756.field45578.method34805(var1, var4, this.field43643);
      this.field43642.accept(method35827(var1, var5, var6, var7));
      this.method35805(var1, var6);
   }

   private void method35849(Class3209 var1) {
      Class7287 var4 = Class7287.method22997(var1);
      ResourceLocation var5 = Class9756.field45573.method34805(var1, var4, this.field43643);
      ResourceLocation var6 = Class9756.field45574.method34805(var1, var4, this.field43643);
      ResourceLocation var7 = Class9756.field45575.method34805(var1, var4, this.field43643);
      this.field43642.accept(method35828(var1, var5, var6, var7));
      this.method35805(var1, var6);
   }

   private Class9483 method35850(Class3209 var1) {
      return new Class9483(this, Class7287.method23016(var1));
   }

   private void method35851(Class3209 var1) {
      this.method35852(var1, var1);
   }

   private void method35852(Class3209 var1, Class3209 var2) {
      this.field43642.accept(method35829(var1, Class9060.method33723(var2)));
   }

   private void method35853(Class3209 var1, Class1958 var2) {
      this.method35808(var1);
      this.method35855(var1, var2);
   }

   private void method35854(Class3209 var1, Class1958 var2, Class7287 var3) {
      this.method35808(var1);
      this.method35856(var1, var2, var3);
   }

   private void method35855(Class3209 var1, Class1958 var2) {
      Class7287 var5 = Class7287.method23000(var1);
      this.method35856(var1, var2, var5);
   }

   private void method35856(Class3209 var1, Class1958 var2, Class7287 var3) {
      ResourceLocation var6 = var2.method8223().method34805(var1, var3, this.field43643);
      this.field43642.accept(method35829(var1, var6));
   }

   private void method35857(Class3209 var1, Class3209 var2, Class1958 var3) {
      this.method35853(var1, var3);
      Class7287 var6 = Class7287.method23002(var1);
      ResourceLocation var7 = var3.method8224().method34805(var2, var6, this.field43643);
      this.field43642.accept(method35829(var2, var7));
   }

   private void method35858(Class3209 var1, Class3209 var2) {
      Class7524 var5 = Class7524.field32281.method25590(var1);
      ResourceLocation var6 = var5.method24562(var1, this.field43643);
      this.field43642.accept(method35829(var1, var6));
      ResourceLocation var7 = Class9756.field45589.method34805(var2, var5.method24560(), this.field43643);
      this.field43642.accept(Class5148.method15942(var2, Class5138.method15912().method15911(Class6891.field29864, var7)).method15939(method35810()));
      this.method35808(var1);
   }

   private void method35859(Class3209 var1, Class3209 var2) {
      this.method35807(var1.method11581());
      Class7287 var5 = Class7287.method23007(var1);
      Class7287 var6 = Class7287.method23008(var1, var2);
      ResourceLocation var7 = Class9756.field45601.method34805(var2, var6, this.field43643);
      this.field43642
         .accept(
            Class5148.method15942(var2, Class5138.method15912().method15911(Class6891.field29864, var7))
               .method15939(
                  Class3629.<Direction>method12310(Class8820.field39722)
                     .method12320(Direction.WEST, Class5138.method15912())
                     .method12320(Direction.SOUTH, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13819))
                     .method12320(Direction.NORTH, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13817))
                     .method12320(Direction.EAST, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13818))
               )
         );
      this.field43642
         .accept(
            Class5148.method15941(var1)
               .method15939(
                  Class3629.<Integer>method12310(Class8820.field39742)
                     .method12321(
                        var3 -> Class5138.method15912().method15911(Class6891.field29864, Class9756.field45600[var3].method34805(var1, var5, this.field43643))
                     )
               )
         );
   }

   private void method35860(Class3209 var1, Class3209 var2, Class3209 var3, Class3209 var4, Class3209 var5, Class3209 var6, Class3209 var7, Class3209 var8) {
      this.method35853(var1, Class1958.field12763);
      this.method35853(var2, Class1958.field12763);
      this.method35840(var3);
      this.method35840(var4);
      this.method35858(var5, var7);
      this.method35858(var6, var8);
   }

   private void method35861(Class3209 var1, Class1958 var2) {
      this.method35809(var1, "_top");
      ResourceLocation var5 = this.method35837(var1, "_top", var2.method8223(), Class7287::method23001);
      ResourceLocation var6 = this.method35837(var1, "_bottom", var2.method8223(), Class7287::method23001);
      this.method35864(var1, var5, var6);
   }

   private void method35862() {
      this.method35809(Class8487.field36797, "_front");
      ResourceLocation var3 = Class9060.method33722(Class8487.field36797, "_top");
      ResourceLocation var4 = this.method35837(Class8487.field36797, "_bottom", Class1958.field12763.method8223(), Class7287::method23001);
      this.method35864(Class8487.field36797, var3, var4);
   }

   private void method35863() {
      ResourceLocation var3 = this.method35837(Class8487.field36486, "_top", Class9756.field45617, Class7287::method22998);
      ResourceLocation var4 = this.method35837(Class8487.field36486, "_bottom", Class9756.field45617, Class7287::method22998);
      this.method35864(Class8487.field36486, var3, var4);
   }

   private void method35864(Class3209 var1, ResourceLocation var2, ResourceLocation var3) {
      this.field43642
         .accept(
            Class5148.method15941(var1)
               .method15939(
                  Class3629.<Class84>method12310(Class8820.field39734)
                     .method12320(Class84.field210, Class5138.method15912().method15911(Class6891.field29864, var3))
                     .method12320(Class84.field209, Class5138.method15912().method15911(Class6891.field29864, var2))
               )
         );
   }

   private void method35865(Class3209 var1) {
      Class7287 var4 = Class7287.method23004(var1);
      Class7287 var5 = Class7287.method23005(Class7287.method23042(var1, "_corner"));
      ResourceLocation var6 = Class9756.field45583.method34805(var1, var4, this.field43643);
      ResourceLocation var7 = Class9756.field45584.method34805(var1, var5, this.field43643);
      ResourceLocation var8 = Class9756.field45585.method34805(var1, var4, this.field43643);
      ResourceLocation var9 = Class9756.field45586.method34805(var1, var4, this.field43643);
      this.method35808(var1);
      this.field43642
         .accept(
            Class5148.method15941(var1)
               .method15939(
                  Class3629.<Class96>method12310(Class8820.field39736)
                     .method12320(Class96.field247, Class5138.method15912().method15911(Class6891.field29864, var6))
                     .method12320(
                        Class96.field248,
                        Class5138.method15912().method15911(Class6891.field29864, var6).method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12320(
                        Class96.field249,
                        Class5138.method15912().method15911(Class6891.field29864, var8).method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12320(
                        Class96.field250,
                        Class5138.method15912().method15911(Class6891.field29864, var9).method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12320(Class96.field251, Class5138.method15912().method15911(Class6891.field29864, var8))
                     .method12320(Class96.field252, Class5138.method15912().method15911(Class6891.field29864, var9))
                     .method12320(Class96.field253, Class5138.method15912().method15911(Class6891.field29864, var7))
                     .method12320(
                        Class96.field254,
                        Class5138.method15912().method15911(Class6891.field29864, var7).method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12320(
                        Class96.field255,
                        Class5138.method15912().method15911(Class6891.field29864, var7).method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12320(
                        Class96.field256,
                        Class5138.method15912().method15911(Class6891.field29864, var7).method15911(Class6891.field29863, Class2120.field13819)
                     )
               )
         );
   }

   private void method35866(Class3209 var1) {
      ResourceLocation var4 = this.method35837(var1, "", Class9756.field45583, Class7287::method23005);
      ResourceLocation var5 = this.method35837(var1, "", Class9756.field45585, Class7287::method23005);
      ResourceLocation var6 = this.method35837(var1, "", Class9756.field45586, Class7287::method23005);
      ResourceLocation var7 = this.method35837(var1, "_on", Class9756.field45583, Class7287::method23005);
      ResourceLocation var8 = this.method35837(var1, "_on", Class9756.field45585, Class7287::method23005);
      ResourceLocation var9 = this.method35837(var1, "_on", Class9756.field45586, Class7287::method23005);
      Class3629 var10 = Class3629.<Boolean, Class96>method12311(Class8820.field39704, Class8820.field39737).method12301((var6x, var7x) -> {
         switch (Class8902.field40295[var7x.ordinal()]) {
            case 1:
               return Class5138.method15912().method15911(Class6891.field29864, var6x ? var7 : var4);
            case 2:
               return Class5138.method15912().method15911(Class6891.field29864, var6x ? var7 : var4).method15911(Class6891.field29863, Class2120.field13817);
            case 3:
               return Class5138.method15912().method15911(Class6891.field29864, var6x ? var8 : var5).method15911(Class6891.field29863, Class2120.field13817);
            case 4:
               return Class5138.method15912().method15911(Class6891.field29864, var6x ? var9 : var6).method15911(Class6891.field29863, Class2120.field13817);
            case 5:
               return Class5138.method15912().method15911(Class6891.field29864, var6x ? var8 : var5);
            case 6:
               return Class5138.method15912().method15911(Class6891.field29864, var6x ? var9 : var6);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.method35808(var1);
      this.field43642.accept(Class5148.method15941(var1).method15939(var10));
   }

   private Class7928 method35867(ResourceLocation var1, Class3209 var2) {
      return new Class7928(this, var1, var2);
   }

   private Class7928 method35868(Class3209 var1, Class3209 var2) {
      return new Class7928(this, Class9060.method33723(var1), var2);
   }

   private void method35869(Class3209 var1, Class3257 var2) {
      ResourceLocation var5 = Class9756.field45566.method34805(var1, Class7287.method23029(var2), this.field43643);
      this.field43642.accept(method35829(var1, var5));
   }

   private void method35870(Class3209 var1, ResourceLocation var2) {
      ResourceLocation var5 = Class9756.field45566.method34805(var1, Class7287.method23023(var2), this.field43643);
      this.field43642.accept(method35829(var1, var5));
   }

   private void method35871(Class3209 var1, Class3209 var2) {
      this.method35841(var1, Class7524.field32271);
      ResourceLocation var5 = Class7524.field32279.method25590(var1).method24562(var2, this.field43643);
      this.field43642.accept(method35829(var2, var5));
   }

   private void method35872(Class7732 var1, Class3209... var2) {
      for (Class3209 var8 : var2) {
         ResourceLocation var9 = var1.method25591(var8, this.field43643);
         this.field43642.accept(method35814(var8, var9));
      }
   }

   private void method35873(Class7732 var1, Class3209... var2) {
      for (Class3209 var8 : var2) {
         ResourceLocation var9 = var1.method25591(var8, this.field43643);
         this.field43642.accept(Class5148.method15942(var8, Class5138.method15912().method15911(Class6891.field29864, var9)).method15939(method35811()));
      }
   }

   private void method35874(Class3209 var1, Class3209 var2) {
      this.method35840(var1);
      Class7287 var5 = Class7287.method23012(var1, var2);
      ResourceLocation var6 = Class9756.field45595.method34805(var2, var5, this.field43643);
      ResourceLocation var7 = Class9756.field45596.method34805(var2, var5, this.field43643);
      ResourceLocation var8 = Class9756.field45597.method34805(var2, var5, this.field43643);
      ResourceLocation var9 = Class9756.field45593.method34805(var2, var5, this.field43643);
      ResourceLocation var10 = Class9756.field45594.method34805(var2, var5, this.field43643);
      Class3257 var11 = var2.method11581();
      Class9756.field45623.method34808(Class9060.method33724(var11), Class7287.method23039(var1), this.field43643);
      this.field43642
         .accept(
            Class5147.method15932(var2)
               .method15934(Class5138.method15912().method15911(Class6891.field29864, var6))
               .method15937(Class5141.method15919().method15924(Class8820.field39716, true), Class5138.method15912().method15911(Class6891.field29864, var7))
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39717, true),
                  Class5138.method15912().method15911(Class6891.field29864, var7).method15911(Class6891.field29863, Class2120.field13817)
               )
               .method15937(Class5141.method15919().method15924(Class8820.field39718, true), Class5138.method15912().method15911(Class6891.field29864, var8))
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39719, true),
                  Class5138.method15912().method15911(Class6891.field29864, var8).method15911(Class6891.field29863, Class2120.field13817)
               )
               .method15937(Class5141.method15919().method15924(Class8820.field39716, false), Class5138.method15912().method15911(Class6891.field29864, var9))
               .method15937(Class5141.method15919().method15924(Class8820.field39717, false), Class5138.method15912().method15911(Class6891.field29864, var10))
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39718, false),
                  Class5138.method15912().method15911(Class6891.field29864, var10).method15911(Class6891.field29863, Class2120.field13817)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39719, false),
                  Class5138.method15912().method15911(Class6891.field29864, var9).method15911(Class6891.field29863, Class2120.field13819)
               )
         );
   }

   private void method35875(Class3209 var1) {
      Class7287 var4 = Class7287.method23030(var1);
      ResourceLocation var5 = Class9756.field45598.method34805(var1, var4, this.field43643);
      ResourceLocation var6 = this.method35837(var1, "_conditional", Class9756.field45598, var1x -> var4.method22995(Class9588.field44833, var1x));
      this.field43642.accept(Class5148.method15941(var1).method15939(method35817(Class8820.field39684, var6, var5)).method15939(method35813()));
   }

   private void method35876(Class3209 var1) {
      ResourceLocation var4 = Class7524.field32283.method25591(var1, this.field43643);
      this.field43642.accept(method35829(var1, var4).method15939(method35811()));
   }

   private List<Class5138> method35877(int var1) {
      String var4 = "_age" + var1;
      return IntStream.range(1, 5)
         .<Class5138>mapToObj(var1x -> Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field37009, var1x + var4)))
         .collect(Collectors.<Class5138>toList());
   }

   private void method35878() {
      this.method35804(Class8487.field37009);
      this.field43642
         .accept(
            Class5147.method15932(Class8487.field37009)
               .method15935(Class5141.method15919().method15924(Class8820.field39738, 0), this.method35877(0))
               .method15935(Class5141.method15919().method15924(Class8820.field39738, 1), this.method35877(1))
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39773, Class181.field643),
                  Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field37009, "_small_leaves"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39773, Class181.field644),
                  Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field37009, "_large_leaves"))
               )
         );
   }

   private Class3629 method35879() {
      return Class3629.<Direction>method12310(Class8820.field39720)
         .method12320(Direction.field672, Class5138.method15912().method15911(Class6891.field29862, Class2120.field13818))
         .method12320(Direction.field673, Class5138.method15912())
         .method12320(Direction.NORTH, Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817))
         .method12320(
            Direction.SOUTH,
            Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817).method15911(Class6891.field29863, Class2120.field13818)
         )
         .method12320(
            Direction.WEST,
            Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817).method15911(Class6891.field29863, Class2120.field13819)
         )
         .method12320(
            Direction.EAST,
            Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817).method15911(Class6891.field29863, Class2120.field13817)
         );
   }

   private void method35880() {
      ResourceLocation var3 = Class7287.method23042(Class8487.field37055, "_top_open");
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field37055)
               .method15939(this.method35879())
               .method15939(
                  Class3629.<Boolean>method12310(Class8820.field39702)
                     .method12320(
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class7524.field32275.method25591(Class8487.field37055, this.field43643))
                     )
                     .method12320(
                        true,
                        Class5138.method15912()
                           .method15911(
                              Class6891.field29864,
                              Class7524.field32275
                                 .method25590(Class8487.field37055)
                                 .method24561(var1 -> var1.method22991(Class9588.field44830, var3))
                                 .method24563(Class8487.field37055, "_open", this.field43643)
                           )
                     )
               )
         );
   }

   private static <T extends Comparable<T>> Class3629 method35881(Class8550<T> var0, T var1, ResourceLocation var2, ResourceLocation var3) {
      Class5138 var6 = Class5138.method15912().method15911(Class6891.field29864, var2);
      Class5138 var7 = Class5138.method15912().method15911(Class6891.field29864, var3);
      return Class3629.method12310(var0).method12321(var3x -> {
         boolean var6x = var3x.compareTo(var1) >= 0;
         return !var6x ? var7 : var6;
      });
   }

   private void method35882(Class3209 var1, Function<Class3209, Class7287> var2) {
      Class7287 var5 = ((Class7287)var2.apply(var1)).method22993(Class9588.field44833, Class9588.field44827);
      Class7287 var6 = var5.method22995(Class9588.field44831, Class7287.method23042(var1, "_front_honey"));
      ResourceLocation var7 = Class9756.field45544.method34805(var1, var5, this.field43643);
      ResourceLocation var8 = Class9756.field45544.method34806(var1, "_honey", var6, this.field43643);
      this.field43642.accept(Class5148.method15941(var1).method15939(method35810()).method15939(method35881(Class8820.field39754, 5, var8, var7)));
   }

   private void method35883(Class3209 var1, Class8550<Integer> var2, int... var3) {
      if (var2.method30474().size() == var3.length) {
         Int2ObjectOpenHashMap var6 = new Int2ObjectOpenHashMap();
         Class3629 var7 = Class3629.<Integer>method12310(var2)
            .method12321(
               var4 -> {
                  int var7x = var3[var4];
                  ResourceLocation var8 = (ResourceLocation)var6.computeIfAbsent(
                     var7x, var3xx -> this.method35837(var1, "_stage" + var7x, Class9756.field45602, Class7287::method23011)
                  );
                  return Class5138.method15912().method15911(Class6891.field29864, var8);
               }
            );
         this.method35807(var1.method11581());
         this.field43642.accept(Class5148.method15941(var1).method15939(var7));
      } else {
         throw new IllegalArgumentException();
      }
   }

   private void method35884() {
      ResourceLocation var3 = Class9060.method33722(Class8487.field37064, "_floor");
      ResourceLocation var4 = Class9060.method33722(Class8487.field37064, "_ceiling");
      ResourceLocation var5 = Class9060.method33722(Class8487.field37064, "_wall");
      ResourceLocation var6 = Class9060.method33722(Class8487.field37064, "_between_walls");
      this.method35807(Class8514.field38167);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field37064)
               .method15939(
                  Class3629.<Direction, Class85>method12311(Class8820.field39722, Class8820.field39725)
                     .method12300(Direction.NORTH, Class85.field212, Class5138.method15912().method15911(Class6891.field29864, var3))
                     .method12300(
                        Direction.SOUTH,
                        Class85.field212,
                        Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12300(
                        Direction.EAST,
                        Class85.field212,
                        Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12300(
                        Direction.WEST,
                        Class85.field212,
                        Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12300(Direction.NORTH, Class85.field213, Class5138.method15912().method15911(Class6891.field29864, var4))
                     .method12300(
                        Direction.SOUTH,
                        Class85.field213,
                        Class5138.method15912().method15911(Class6891.field29864, var4).method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12300(
                        Direction.EAST,
                        Class85.field213,
                        Class5138.method15912().method15911(Class6891.field29864, var4).method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12300(
                        Direction.WEST,
                        Class85.field213,
                        Class5138.method15912().method15911(Class6891.field29864, var4).method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12300(
                        Direction.NORTH,
                        Class85.field214,
                        Class5138.method15912().method15911(Class6891.field29864, var5).method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12300(
                        Direction.SOUTH,
                        Class85.field214,
                        Class5138.method15912().method15911(Class6891.field29864, var5).method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12300(Direction.EAST, Class85.field214, Class5138.method15912().method15911(Class6891.field29864, var5))
                     .method12300(
                        Direction.WEST,
                        Class85.field214,
                        Class5138.method15912().method15911(Class6891.field29864, var5).method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12300(
                        Direction.SOUTH,
                        Class85.field215,
                        Class5138.method15912().method15911(Class6891.field29864, var6).method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12300(
                        Direction.NORTH,
                        Class85.field215,
                        Class5138.method15912().method15911(Class6891.field29864, var6).method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12300(Direction.EAST, Class85.field215, Class5138.method15912().method15911(Class6891.field29864, var6))
                     .method12300(
                        Direction.WEST,
                        Class85.field215,
                        Class5138.method15912().method15911(Class6891.field29864, var6).method15911(Class6891.field29863, Class2120.field13818)
                     )
               )
         );
   }

   private void method35885() {
      this.field43642
         .accept(
            Class5148.method15942(Class8487.field37060, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33723(Class8487.field37060)))
               .method15939(
                  Class3629.<Class103, Direction>method12311(Class8820.field39724, Class8820.field39722)
                     .method12300(Class103.field313, Direction.NORTH, Class5138.method15912())
                     .method12300(Class103.field313, Direction.EAST, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13817))
                     .method12300(Class103.field313, Direction.SOUTH, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13818))
                     .method12300(Class103.field313, Direction.WEST, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13819))
                     .method12300(Class103.field314, Direction.NORTH, Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817))
                     .method12300(
                        Class103.field314,
                        Direction.EAST,
                        Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817).method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12300(
                        Class103.field314,
                        Direction.SOUTH,
                        Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817).method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12300(
                        Class103.field314,
                        Direction.WEST,
                        Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817).method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12300(Class103.field315, Direction.SOUTH, Class5138.method15912().method15911(Class6891.field29862, Class2120.field13818))
                     .method12300(
                        Class103.field315,
                        Direction.WEST,
                        Class5138.method15912().method15911(Class6891.field29862, Class2120.field13818).method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12300(
                        Class103.field315,
                        Direction.NORTH,
                        Class5138.method15912().method15911(Class6891.field29862, Class2120.field13818).method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12300(
                        Class103.field315,
                        Direction.EAST,
                        Class5138.method15912().method15911(Class6891.field29862, Class2120.field13818).method15911(Class6891.field29863, Class2120.field13819)
                     )
               )
         );
   }

   private void method35886(Class3209 var1, Class7732 var2) {
      ResourceLocation var5 = var2.method25591(var1, this.field43643);
      ResourceLocation var6 = Class7287.method23042(var1, "_front_on");
      ResourceLocation var7 = var2.method25590(var1).method24561(var1x -> var1x.method22991(Class9588.field44831, var6)).method24563(var1, "_on", this.field43643);
      this.field43642.accept(Class5148.method15941(var1).method15939(method35817(Class8820.field39699, var7, var5)).method15939(method35810()));
   }

   private void method35887(Class3209... var1) {
      ResourceLocation var4 = Class9060.method33720("campfire_off");

      for (Class3209 var8 : var1) {
         ResourceLocation var9 = Class9756.field45609.method34805(var8, Class7287.method23037(var8), this.field43643);
         this.method35807(var8.method11581());
         this.field43642.accept(Class5148.method15941(var8).method15939(method35817(Class8820.field39699, var9, var4)).method15939(method35811()));
      }
   }

   private void method35888() {
      Class7287 var3 = Class7287.method23017(Class7287.method23041(Class8487.field36525), Class7287.method23041(Class8487.field36400));
      ResourceLocation var4 = Class9756.field45539.method34805(Class8487.field36525, var3, this.field43643);
      this.field43642.accept(method35829(Class8487.field36525, var4));
   }

   private void method35889() {
      this.method35807(Class8514.field37887);
      this.field43642
         .accept(
            Class5147.method15932(Class8487.field36535)
               .method15937(
                  Class5141.method15920(
                     Class5141.method15919()
                        .method15924(Class8820.field39731, Class98.field267)
                        .method15924(Class8820.field39730, Class98.field267)
                        .method15924(Class8820.field39732, Class98.field267)
                        .method15924(Class8820.field39733, Class98.field267),
                     Class5141.method15919()
                        .method15925(Class8820.field39731, Class98.field266, Class98.field265)
                        .method15925(Class8820.field39730, Class98.field266, Class98.field265),
                     Class5141.method15919()
                        .method15925(Class8820.field39730, Class98.field266, Class98.field265)
                        .method15925(Class8820.field39732, Class98.field266, Class98.field265),
                     Class5141.method15919()
                        .method15925(Class8820.field39732, Class98.field266, Class98.field265)
                        .method15925(Class8820.field39733, Class98.field266, Class98.field265),
                     Class5141.method15919()
                        .method15925(Class8820.field39733, Class98.field266, Class98.field265)
                        .method15925(Class8820.field39731, Class98.field266, Class98.field265)
                  ),
                  Class5138.method15912().method15911(Class6891.field29864, Class9060.method33720("redstone_dust_dot"))
               )
               .method15937(
                  Class5141.method15919().method15925(Class8820.field39731, Class98.field266, Class98.field265),
                  Class5138.method15912().method15911(Class6891.field29864, Class9060.method33720("redstone_dust_side0"))
               )
               .method15937(
                  Class5141.method15919().method15925(Class8820.field39732, Class98.field266, Class98.field265),
                  Class5138.method15912().method15911(Class6891.field29864, Class9060.method33720("redstone_dust_side_alt0"))
               )
               .method15937(
                  Class5141.method15919().method15925(Class8820.field39730, Class98.field266, Class98.field265),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, Class9060.method33720("redstone_dust_side_alt1"))
                     .method15911(Class6891.field29863, Class2120.field13819)
               )
               .method15937(
                  Class5141.method15919().method15925(Class8820.field39733, Class98.field266, Class98.field265),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, Class9060.method33720("redstone_dust_side1"))
                     .method15911(Class6891.field29863, Class2120.field13819)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39731, Class98.field265),
                  Class5138.method15912().method15911(Class6891.field29864, Class9060.method33720("redstone_dust_up"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39730, Class98.field265),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, Class9060.method33720("redstone_dust_up"))
                     .method15911(Class6891.field29863, Class2120.field13817)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39732, Class98.field265),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, Class9060.method33720("redstone_dust_up"))
                     .method15911(Class6891.field29863, Class2120.field13818)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39733, Class98.field265),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, Class9060.method33720("redstone_dust_up"))
                     .method15911(Class6891.field29863, Class2120.field13819)
               )
         );
   }

   private void method35890() {
      this.method35807(Class8514.field37789);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36719)
               .method15939(method35811())
               .method15939(
                  Class3629.<Class105, Boolean>method12311(Class8820.field39766, Class8820.field39704)
                     .method12300(
                        Class105.field325, false, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33723(Class8487.field36719))
                     )
                     .method12300(
                        Class105.field325, true, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36719, "_on"))
                     )
                     .method12300(
                        Class105.field326,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36719, "_subtract"))
                     )
                     .method12300(
                        Class105.field326,
                        true,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36719, "_on_subtract"))
                     )
               )
         );
   }

   private void method35891() {
      Class7287 var3 = Class7287.method22996(Class8487.field36858);
      Class7287 var4 = Class7287.method23017(Class7287.method23042(Class8487.field36846, "_side"), var3.method22994(Class9588.field44830));
      ResourceLocation var5 = Class9756.field45567.method34805(Class8487.field36846, var4, this.field43643);
      ResourceLocation var6 = Class9756.field45568.method34805(Class8487.field36846, var4, this.field43643);
      ResourceLocation var7 = Class9756.field45539.method34807(Class8487.field36846, "_double", var4, this.field43643);
      this.field43642.accept(method35839(Class8487.field36846, var5, var6, var7));
      this.field43642.accept(method35829(Class8487.field36858, Class9756.field45537.method34805(Class8487.field36858, var3, this.field43643)));
   }

   private void method35892() {
      this.method35807(Class8514.field37977);
      this.field43642
         .accept(
            Class5147.method15932(Class8487.field36647)
               .method15934(Class5138.method15912().method15911(Class6891.field29864, Class7287.method23041(Class8487.field36647)))
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39692, true),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Class8487.field36647, "_bottle0"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39693, true),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Class8487.field36647, "_bottle1"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39694, true),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Class8487.field36647, "_bottle2"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39692, false),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Class8487.field36647, "_empty0"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39693, false),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Class8487.field36647, "_empty1"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39694, false),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Class8487.field36647, "_empty2"))
               )
         );
   }

   private void method35893(Class3209 var1) {
      ResourceLocation var4 = Class9756.field45622.method34805(var1, Class7287.method22997(var1), this.field43643);
      ResourceLocation var5 = Class9060.method33720("mushroom_block_inside");
      this.field43642
         .accept(
            Class5147.method15932(var1)
               .method15937(Class5141.method15919().method15924(Class8820.field39716, true), Class5138.method15912().method15911(Class6891.field29864, var4))
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39717, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var4)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39718, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var4)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39719, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var4)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39714, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var4)
                     .method15911(Class6891.field29862, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39715, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var4)
                     .method15911(Class6891.field29862, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method15937(Class5141.method15919().method15924(Class8820.field39716, false), Class5138.method15912().method15911(Class6891.field29864, var5))
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39717, false),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var5)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, false)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39718, false),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var5)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, false)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39719, false),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var5)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, false)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39714, false),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var5)
                     .method15911(Class6891.field29862, Class2120.field13819)
                     .method15911(Class6891.field29865, false)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39715, false),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var5)
                     .method15911(Class6891.field29862, Class2120.field13817)
                     .method15911(Class6891.field29865, false)
               )
         );
      this.method35805(var1, Class7524.field32271.method25592(var1, "_inventory", this.field43643));
   }

   private void method35894() {
      this.method35807(Class8514.field37937);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36591)
               .method15939(
                  Class3629.<Integer>method12310(Class8820.field39745)
                     .method12320(0, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33723(Class8487.field36591)))
                     .method12320(1, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36591, "_slice1")))
                     .method12320(2, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36591, "_slice2")))
                     .method12320(3, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36591, "_slice3")))
                     .method12320(4, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36591, "_slice4")))
                     .method12320(5, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36591, "_slice5")))
                     .method12320(6, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36591, "_slice6")))
               )
         );
   }

   private void method35895() {
      Class7287 var3 = new Class7287()
         .method22991(Class9588.field44827, Class7287.method23042(Class8487.field37058, "_side3"))
         .method22991(Class9588.field44839, Class7287.method23041(Class8487.field36405))
         .method22991(Class9588.field44838, Class7287.method23042(Class8487.field37058, "_top"))
         .method22991(Class9588.field44834, Class7287.method23042(Class8487.field37058, "_side3"))
         .method22991(Class9588.field44836, Class7287.method23042(Class8487.field37058, "_side3"))
         .method22991(Class9588.field44835, Class7287.method23042(Class8487.field37058, "_side1"))
         .method22991(Class9588.field44837, Class7287.method23042(Class8487.field37058, "_side2"));
      this.field43642.accept(method35829(Class8487.field37058, Class9756.field45535.method34805(Class8487.field37058, var3, this.field43643)));
   }

   private void method35896() {
      Class7287 var3 = new Class7287()
         .method22991(Class9588.field44827, Class7287.method23042(Class8487.field37062, "_front"))
         .method22991(Class9588.field44839, Class7287.method23042(Class8487.field37062, "_bottom"))
         .method22991(Class9588.field44838, Class7287.method23042(Class8487.field37062, "_top"))
         .method22991(Class9588.field44834, Class7287.method23042(Class8487.field37062, "_front"))
         .method22991(Class9588.field44835, Class7287.method23042(Class8487.field37062, "_front"))
         .method22991(Class9588.field44836, Class7287.method23042(Class8487.field37062, "_side"))
         .method22991(Class9588.field44837, Class7287.method23042(Class8487.field37062, "_side"));
      this.field43642.accept(method35829(Class8487.field37062, Class9756.field45535.method34805(Class8487.field37062, var3, this.field43643)));
   }

   private void method35897(Class3209 var1, Class3209 var2, BiFunction<Class3209, Class3209, Class7287> var3) {
      Class7287 var6 = (Class7287)var3.apply(var1, var2);
      this.field43642.accept(method35829(var1, Class9756.field45535.method34805(var1, var6, this.field43643)));
   }

   private void method35898() {
      Class7287 var3 = Class7287.method23014(Class8487.field36579);
      this.field43642.accept(method35829(Class8487.field36579, Class9060.method33723(Class8487.field36579)));
      this.method35899(Class8487.field36589, var3);
      this.method35899(Class8487.field36590, var3);
   }

   private void method35899(Class3209 var1, Class7287 var2) {
      ResourceLocation var5 = Class9756.field45543.method34805(var1, var2.method22995(Class9588.field44831, Class7287.method23041(var1)), this.field43643);
      this.field43642.accept(Class5148.method15942(var1, Class5138.method15912().method15911(Class6891.field29864, var5)).method15939(method35810()));
   }

   private void method35900() {
      this.method35807(Class8514.field37978);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36648)
               .method15939(
                  Class3629.<Integer>method12310(Class8820.field39751)
                     .method12320(0, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33723(Class8487.field36648)))
                     .method12320(1, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36648, "_level1")))
                     .method12320(2, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36648, "_level2")))
                     .method12320(3, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36648, "_level3")))
               )
         );
   }

   private void method35901(Class3209 var1, Class3209 var2) {
      Class7287 var5 = new Class7287()
         .method22991(Class9588.field44828, Class7287.method23042(var2, "_top"))
         .method22991(Class9588.field44833, Class7287.method23041(var1));
      this.method35842(var1, var5, Class9756.field45539);
   }

   private void method35902() {
      Class7287 var3 = Class7287.method22997(Class8487.field36879);
      ResourceLocation var4 = Class9756.field45591.method34805(Class8487.field36879, var3, this.field43643);
      ResourceLocation var5 = this.method35837(Class8487.field36879, "_dead", Class9756.field45591, var1 -> var3.method22995(Class9588.field44826, var1));
      this.field43642.accept(Class5148.method15941(Class8487.field36879).method15939(method35881(Class8820.field39741, 5, var5, var4)));
   }

   private void method35903(Class3209 var1) {
      Class7287 var4 = new Class7287()
         .method22991(Class9588.field44830, Class7287.method23042(Class8487.field36541, "_top"))
         .method22991(Class9588.field44833, Class7287.method23042(Class8487.field36541, "_side"))
         .method22991(Class9588.field44831, Class7287.method23042(var1, "_front"));
      Class7287 var5 = new Class7287()
         .method22991(Class9588.field44833, Class7287.method23042(Class8487.field36541, "_top"))
         .method22991(Class9588.field44831, Class7287.method23042(var1, "_front_vertical"));
      ResourceLocation var6 = Class9756.field45543.method34805(var1, var4, this.field43643);
      ResourceLocation var7 = Class9756.field45545.method34805(var1, var5, this.field43643);
      this.field43642
         .accept(
            Class5148.method15941(var1)
               .method15939(
                  Class3629.<Direction>method12310(Class8820.field39720)
                     .method12320(
                        Direction.field672,
                        Class5138.method15912().method15911(Class6891.field29864, var7).method15911(Class6891.field29862, Class2120.field13818)
                     )
                     .method12320(Direction.field673, Class5138.method15912().method15911(Class6891.field29864, var7))
                     .method12320(Direction.NORTH, Class5138.method15912().method15911(Class6891.field29864, var6))
                     .method12320(
                        Direction.EAST,
                        Class5138.method15912().method15911(Class6891.field29864, var6).method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12320(
                        Direction.SOUTH,
                        Class5138.method15912().method15911(Class6891.field29864, var6).method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12320(
                        Direction.WEST,
                        Class5138.method15912().method15911(Class6891.field29864, var6).method15911(Class6891.field29863, Class2120.field13819)
                     )
               )
         );
   }

   private void method35904() {
      ResourceLocation var3 = Class9060.method33723(Class8487.field36650);
      ResourceLocation var4 = Class9060.method33722(Class8487.field36650, "_filled");
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36650)
               .method15939(
                  Class3629.<Boolean>method12310(Class8820.field39689)
                     .method12320(false, Class5138.method15912().method15911(Class6891.field29864, var3))
                     .method12320(true, Class5138.method15912().method15911(Class6891.field29864, var4))
               )
               .method15939(method35811())
         );
   }

   private void method35905() {
      ResourceLocation var3 = Class9060.method33722(Class8487.field36878, "_side");
      ResourceLocation var4 = Class9060.method33722(Class8487.field36878, "_noside");
      ResourceLocation var5 = Class9060.method33722(Class8487.field36878, "_noside1");
      ResourceLocation var6 = Class9060.method33722(Class8487.field36878, "_noside2");
      ResourceLocation var7 = Class9060.method33722(Class8487.field36878, "_noside3");
      this.field43642
         .accept(
            Class5147.method15932(Class8487.field36878)
               .method15937(Class5141.method15919().method15924(Class8820.field39716, true), Class5138.method15912().method15911(Class6891.field29864, var3))
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39717, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39718, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39719, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39714, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29862, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39715, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var3)
                     .method15911(Class6891.field29862, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method15936(
                  Class5141.method15919().method15924(Class8820.field39716, false),
                  Class5138.method15912().method15911(Class6891.field29864, var4).method15911(Class6891.field29866, 2),
                  Class5138.method15912().method15911(Class6891.field29864, var5),
                  Class5138.method15912().method15911(Class6891.field29864, var6),
                  Class5138.method15912().method15911(Class6891.field29864, var7)
               )
               .method15936(
                  Class5141.method15919().method15924(Class8820.field39717, false),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var5)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var6)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var7)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var4)
                     .method15911(Class6891.field29866, 2)
                     .method15911(Class6891.field29863, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
               .method15936(
                  Class5141.method15919().method15924(Class8820.field39718, false),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var6)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var7)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var4)
                     .method15911(Class6891.field29866, 2)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var5)
                     .method15911(Class6891.field29863, Class2120.field13818)
                     .method15911(Class6891.field29865, true)
               )
               .method15936(
                  Class5141.method15919().method15924(Class8820.field39719, false),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var7)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var4)
                     .method15911(Class6891.field29866, 2)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var5)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var6)
                     .method15911(Class6891.field29863, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
               .method15936(
                  Class5141.method15919().method15924(Class8820.field39714, false),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var4)
                     .method15911(Class6891.field29866, 2)
                     .method15911(Class6891.field29862, Class2120.field13819)
                     .method15911(Class6891.field29865, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var7)
                     .method15911(Class6891.field29862, Class2120.field13819)
                     .method15911(Class6891.field29865, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var5)
                     .method15911(Class6891.field29862, Class2120.field13819)
                     .method15911(Class6891.field29865, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var6)
                     .method15911(Class6891.field29862, Class2120.field13819)
                     .method15911(Class6891.field29865, true)
               )
               .method15936(
                  Class5141.method15919().method15924(Class8820.field39715, false),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var7)
                     .method15911(Class6891.field29862, Class2120.field13817)
                     .method15911(Class6891.field29865, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var6)
                     .method15911(Class6891.field29862, Class2120.field13817)
                     .method15911(Class6891.field29865, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var5)
                     .method15911(Class6891.field29862, Class2120.field13817)
                     .method15911(Class6891.field29865, true),
                  Class5138.method15912()
                     .method15911(Class6891.field29864, var4)
                     .method15911(Class6891.field29866, 2)
                     .method15911(Class6891.field29862, Class2120.field13817)
                     .method15911(Class6891.field29865, true)
               )
         );
   }

   private void method35906() {
      this.field43642
         .accept(
            Class5147.method15932(Class8487.field37115)
               .method15934(Class5138.method15912().method15911(Class6891.field29864, Class7287.method23041(Class8487.field37115)))
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 1),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Class8487.field37115, "_contents1"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 2),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Class8487.field37115, "_contents2"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 3),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Class8487.field37115, "_contents3"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 4),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Class8487.field37115, "_contents4"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 5),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Class8487.field37115, "_contents5"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 6),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Class8487.field37115, "_contents6"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 7),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Class8487.field37115, "_contents7"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 8),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Class8487.field37115, "_contents_ready"))
               )
         );
   }

   private void method35907(Class3209 var1) {
      Class7287 var4 = new Class7287()
         .method22991(Class9588.field44829, Class7287.method23041(Class8487.field36580))
         .method22991(Class9588.field44830, Class7287.method23041(var1))
         .method22991(Class9588.field44833, Class7287.method23042(var1, "_side"));
      this.field43642.accept(method35829(var1, Class9756.field45542.method34805(var1, var4, this.field43643)));
   }

   private void method35908() {
      ResourceLocation var3 = Class7287.method23042(Class8487.field36720, "_side");
      Class7287 var4 = new Class7287()
         .method22991(Class9588.field44830, Class7287.method23042(Class8487.field36720, "_top"))
         .method22991(Class9588.field44833, var3);
      Class7287 var5 = new Class7287()
         .method22991(Class9588.field44830, Class7287.method23042(Class8487.field36720, "_inverted_top"))
         .method22991(Class9588.field44833, var3);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36720)
               .method15939(
                  Class3629.<Boolean>method12310(Class8820.field39697)
                     .method12320(
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9756.field45592.method34805(Class8487.field36720, var4, this.field43643))
                     )
                     .method12320(
                        true,
                        Class5138.method15912()
                           .method15911(
                              Class6891.field29864,
                              Class9756.field45592.method34808(Class9060.method33722(Class8487.field36720, "_inverted"), var5, this.field43643)
                           )
                     )
               )
         );
   }

   private void method35909(Class3209 var1) {
      this.field43642
         .accept(
            Class5148.method15942(var1, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33723(var1))).method15939(this.method35879())
         );
   }

   private void method35910() {
      Class7287 var3 = new Class7287()
         .method22991(Class9588.field44852, Class7287.method23041(Class8487.field36396))
         .method22991(Class9588.field44830, Class7287.method23041(Class8487.field36540));
      Class7287 var4 = new Class7287()
         .method22991(Class9588.field44852, Class7287.method23041(Class8487.field36396))
         .method22991(Class9588.field44830, Class7287.method23042(Class8487.field36540, "_moist"));
      ResourceLocation var5 = Class9756.field45603.method34805(Class8487.field36540, var3, this.field43643);
      ResourceLocation var6 = Class9756.field45603.method34808(Class7287.method23042(Class8487.field36540, "_moist"), var4, this.field43643);
      this.field43642.accept(Class5148.method15941(Class8487.field36540).method15939(method35881(Class8820.field39756, 7, var6, var5)));
   }

   private List<ResourceLocation> method35911(Class3209 var1) {
      ResourceLocation var4 = Class9756.field45604.method34808(Class9060.method33722(var1, "_floor0"), Class7287.method23024(var1), this.field43643);
      ResourceLocation var5 = Class9756.field45604.method34808(Class9060.method33722(var1, "_floor1"), Class7287.method23025(var1), this.field43643);
      return ImmutableList.of(var4, var5);
   }

   private List<ResourceLocation> method35912(Class3209 var1) {
      ResourceLocation var4 = Class9756.field45605.method34808(Class9060.method33722(var1, "_side0"), Class7287.method23024(var1), this.field43643);
      ResourceLocation var5 = Class9756.field45605.method34808(Class9060.method33722(var1, "_side1"), Class7287.method23025(var1), this.field43643);
      ResourceLocation var6 = Class9756.field45606.method34808(Class9060.method33722(var1, "_side_alt0"), Class7287.method23024(var1), this.field43643);
      ResourceLocation var7 = Class9756.field45606.method34808(Class9060.method33722(var1, "_side_alt1"), Class7287.method23025(var1), this.field43643);
      return ImmutableList.of(var4, var5, var6, var7);
   }

   private List<ResourceLocation> method35913(Class3209 var1) {
      ResourceLocation var4 = Class9756.field45607.method34808(Class9060.method33722(var1, "_up0"), Class7287.method23024(var1), this.field43643);
      ResourceLocation var5 = Class9756.field45607.method34808(Class9060.method33722(var1, "_up1"), Class7287.method23025(var1), this.field43643);
      ResourceLocation var6 = Class9756.field45608.method34808(Class9060.method33722(var1, "_up_alt0"), Class7287.method23024(var1), this.field43643);
      ResourceLocation var7 = Class9756.field45608.method34808(Class9060.method33722(var1, "_up_alt1"), Class7287.method23025(var1), this.field43643);
      return ImmutableList.of(var4, var5, var6, var7);
   }

   private static List<Class5138> method35914(List<ResourceLocation> var0, UnaryOperator<Class5138> var1) {
      return var0.stream()
         .<Class5138>map(var0x -> Class5138.method15912().method15911(Class6891.field29864, var0x))
         .<Class5138>map(var1)
         .collect(Collectors.<Class5138>toList());
   }

   private void method35915() {
      Class5142 var3 = Class5141.method15919()
         .method15924(Class8820.field39716, false)
         .method15924(Class8820.field39717, false)
         .method15924(Class8820.field39718, false)
         .method15924(Class8820.field39719, false)
         .method15924(Class8820.field39714, false);
      List var4 = this.method35911(Class8487.field36530);
      List var5 = this.method35912(Class8487.field36530);
      List var6 = this.method35913(Class8487.field36530);
      this.field43642
         .accept(
            Class5147.method15932(Class8487.field36530)
               .method15935(var3, method35914(var4, var0 -> var0))
               .method15935(Class5141.method15920(Class5141.method15919().method15924(Class8820.field39716, true), var3), method35914(var5, var0 -> var0))
               .method15935(
                  Class5141.method15920(Class5141.method15919().method15924(Class8820.field39717, true), var3),
                  method35914(var5, var0 -> var0.method15911(Class6891.field29863, Class2120.field13817))
               )
               .method15935(
                  Class5141.method15920(Class5141.method15919().method15924(Class8820.field39718, true), var3),
                  method35914(var5, var0 -> var0.method15911(Class6891.field29863, Class2120.field13818))
               )
               .method15935(
                  Class5141.method15920(Class5141.method15919().method15924(Class8820.field39719, true), var3),
                  method35914(var5, var0 -> var0.method15911(Class6891.field29863, Class2120.field13819))
               )
               .method15935(Class5141.method15919().method15924(Class8820.field39714, true), method35914(var6, var0 -> var0))
         );
   }

   private void method35916() {
      List var3 = this.method35911(Class8487.field36531);
      List var4 = this.method35912(Class8487.field36531);
      this.field43642
         .accept(
            Class5147.method15932(Class8487.field36531)
               .method15933(method35914(var3, var0 -> var0))
               .method15933(method35914(var4, var0 -> var0))
               .method15933(method35914(var4, var0 -> var0.method15911(Class6891.field29863, Class2120.field13817)))
               .method15933(method35914(var4, var0 -> var0.method15911(Class6891.field29863, Class2120.field13818)))
               .method15933(method35914(var4, var0 -> var0.method15911(Class6891.field29863, Class2120.field13819)))
         );
   }

   private void method35917(Class3209 var1) {
      ResourceLocation var4 = Class7524.field32285.method25591(var1, this.field43643);
      ResourceLocation var5 = Class7524.field32286.method25591(var1, this.field43643);
      this.method35807(var1.method11581());
      this.field43642.accept(Class5148.method15941(var1).method15939(method35817(Class8820.field39691, var5, var4)));
   }

   private void method35918() {
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36889)
               .method15939(
                  Class3629.<Integer>method12310(Class8820.field39740)
                     .method12320(
                        0,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, this.method35837(Class8487.field36889, "_0", Class9756.field45537, Class7287::method22999))
                     )
                     .method12320(
                        1,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, this.method35837(Class8487.field36889, "_1", Class9756.field45537, Class7287::method22999))
                     )
                     .method12320(
                        2,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, this.method35837(Class8487.field36889, "_2", Class9756.field45537, Class7287::method22999))
                     )
                     .method12320(
                        3,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, this.method35837(Class8487.field36889, "_3", Class9756.field45537, Class7287::method22999))
                     )
               )
         );
   }

   private void method35919() {
      ResourceLocation var3 = Class7287.method23041(Class8487.field36396);
      Class7287 var4 = new Class7287()
         .method22991(Class9588.field44829, var3)
         .method22993(Class9588.field44829, Class9588.field44827)
         .method22991(Class9588.field44830, Class7287.method23042(Class8487.field36395, "_top"))
         .method22991(Class9588.field44833, Class7287.method23042(Class8487.field36395, "_snow"));
      Class5138 var5 = Class5138.method15912()
         .method15911(Class6891.field29864, Class9756.field45542.method34806(Class8487.field36395, "_snow", var4, this.field43643));
      this.method35920(Class8487.field36395, Class9060.method33723(Class8487.field36395), var5);
      ResourceLocation var6 = Class7524.field32275
         .method25590(Class8487.field36640)
         .method24561(var1 -> var1.method22991(Class9588.field44829, var3))
         .method24562(Class8487.field36640, this.field43643);
      this.method35920(Class8487.field36640, var6, var5);
      ResourceLocation var7 = Class7524.field32275
         .method25590(Class8487.field36398)
         .method24561(var1 -> var1.method22991(Class9588.field44829, var3))
         .method24562(Class8487.field36398, this.field43643);
      this.method35920(Class8487.field36398, var7, var5);
   }

   private void method35920(Class3209 var1, ResourceLocation var2, Class5138 var3) {
      List var6 = Arrays.<Class5138>asList(method35815(var2));
      this.field43642
         .accept(Class5148.method15941(var1).method15939(Class3629.<Boolean>method12310(Class8820.field39707).method12320(true, var3).method12319(false, var6)));
   }

   private void method35921() {
      this.method35807(Class8514.field37916);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36654)
               .method15939(
                  Class3629.<Integer>method12310(Class8820.field39739)
                     .method12320(0, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36654, "_stage0")))
                     .method12320(1, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36654, "_stage1")))
                     .method12320(2, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36654, "_stage2")))
               )
               .method15939(method35811())
         );
   }

   private void method35922() {
      this.field43642.accept(method35814(Class8487.field36885, Class9060.method33723(Class8487.field36885)));
   }

   private void method35923(Class3209 var1, Class3209 var2) {
      Class7287 var5 = Class7287.method22997(var2);
      ResourceLocation var6 = Class9756.field45564.method34805(var1, var5, this.field43643);
      ResourceLocation var7 = Class9756.field45565.method34805(var1, var5, this.field43643);
      this.field43642.accept(Class5148.method15941(var1).method15939(method35881(Class8820.field39759, 1, var7, var6)));
   }

   private void method35924() {
      ResourceLocation var3 = Class9060.method33723(Class8487.field36723);
      ResourceLocation var4 = Class9060.method33722(Class8487.field36723, "_side");
      this.method35807(Class8514.field37545);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36723)
               .method15939(
                  Class3629.<Direction>method12310(Class8820.field39721)
                     .method12320(Direction.field672, Class5138.method15912().method15911(Class6891.field29864, var3))
                     .method12320(Direction.NORTH, Class5138.method15912().method15911(Class6891.field29864, var4))
                     .method12320(
                        Direction.EAST,
                        Class5138.method15912().method15911(Class6891.field29864, var4).method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12320(
                        Direction.SOUTH,
                        Class5138.method15912().method15911(Class6891.field29864, var4).method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12320(
                        Direction.WEST,
                        Class5138.method15912().method15911(Class6891.field29864, var4).method15911(Class6891.field29863, Class2120.field13819)
                     )
               )
         );
   }

   private void method35925(Class3209 var1, Class3209 var2) {
      ResourceLocation var5 = Class9060.method33723(var1);
      this.field43642.accept(Class5148.method15942(var2, Class5138.method15912().method15911(Class6891.field29864, var5)));
      this.method35805(var2, var5);
   }

   private void method35926() {
      ResourceLocation var3 = Class9060.method33722(Class8487.field36628, "_post_ends");
      ResourceLocation var4 = Class9060.method33722(Class8487.field36628, "_post");
      ResourceLocation var5 = Class9060.method33722(Class8487.field36628, "_cap");
      ResourceLocation var6 = Class9060.method33722(Class8487.field36628, "_cap_alt");
      ResourceLocation var7 = Class9060.method33722(Class8487.field36628, "_side");
      ResourceLocation var8 = Class9060.method33722(Class8487.field36628, "_side_alt");
      this.field43642
         .accept(
            Class5147.method15932(Class8487.field36628)
               .method15934(Class5138.method15912().method15911(Class6891.field29864, var3))
               .method15937(
                  Class5141.method15919()
                     .method15924(Class8820.field39716, false)
                     .method15924(Class8820.field39717, false)
                     .method15924(Class8820.field39718, false)
                     .method15924(Class8820.field39719, false),
                  Class5138.method15912().method15911(Class6891.field29864, var4)
               )
               .method15937(
                  Class5141.method15919()
                     .method15924(Class8820.field39716, true)
                     .method15924(Class8820.field39717, false)
                     .method15924(Class8820.field39718, false)
                     .method15924(Class8820.field39719, false),
                  Class5138.method15912().method15911(Class6891.field29864, var5)
               )
               .method15937(
                  Class5141.method15919()
                     .method15924(Class8820.field39716, false)
                     .method15924(Class8820.field39717, true)
                     .method15924(Class8820.field39718, false)
                     .method15924(Class8820.field39719, false),
                  Class5138.method15912().method15911(Class6891.field29864, var5).method15911(Class6891.field29863, Class2120.field13817)
               )
               .method15937(
                  Class5141.method15919()
                     .method15924(Class8820.field39716, false)
                     .method15924(Class8820.field39717, false)
                     .method15924(Class8820.field39718, true)
                     .method15924(Class8820.field39719, false),
                  Class5138.method15912().method15911(Class6891.field29864, var6)
               )
               .method15937(
                  Class5141.method15919()
                     .method15924(Class8820.field39716, false)
                     .method15924(Class8820.field39717, false)
                     .method15924(Class8820.field39718, false)
                     .method15924(Class8820.field39719, true),
                  Class5138.method15912().method15911(Class6891.field29864, var6).method15911(Class6891.field29863, Class2120.field13817)
               )
               .method15937(Class5141.method15919().method15924(Class8820.field39716, true), Class5138.method15912().method15911(Class6891.field29864, var7))
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39717, true),
                  Class5138.method15912().method15911(Class6891.field29864, var7).method15911(Class6891.field29863, Class2120.field13817)
               )
               .method15937(Class5141.method15919().method15924(Class8820.field39718, true), Class5138.method15912().method15911(Class6891.field29864, var8))
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39719, true),
                  Class5138.method15912().method15911(Class6891.field29864, var8).method15911(Class6891.field29863, Class2120.field13817)
               )
         );
      this.method35808(Class8487.field36628);
   }

   private void method35927(Class3209 var1) {
      this.field43642
         .accept(Class5148.method15942(var1, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33723(var1))).method15939(method35810()));
   }

   private void method35928() {
      ResourceLocation var3 = Class9060.method33723(Class8487.field36558);
      ResourceLocation var4 = Class9060.method33722(Class8487.field36558, "_on");
      this.method35808(Class8487.field36558);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36558)
               .method15939(method35817(Class8820.field39704, var3, var4))
               .method15939(
                  Class3629.<Class103, Direction>method12311(Class8820.field39724, Class8820.field39722)
                     .method12300(
                        Class103.field315,
                        Direction.NORTH,
                        Class5138.method15912().method15911(Class6891.field29862, Class2120.field13818).method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12300(
                        Class103.field315,
                        Direction.EAST,
                        Class5138.method15912().method15911(Class6891.field29862, Class2120.field13818).method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12300(Class103.field315, Direction.SOUTH, Class5138.method15912().method15911(Class6891.field29862, Class2120.field13818))
                     .method12300(
                        Class103.field315,
                        Direction.WEST,
                        Class5138.method15912().method15911(Class6891.field29862, Class2120.field13818).method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12300(Class103.field313, Direction.NORTH, Class5138.method15912())
                     .method12300(Class103.field313, Direction.EAST, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13817))
                     .method12300(Class103.field313, Direction.SOUTH, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13818))
                     .method12300(Class103.field313, Direction.WEST, Class5138.method15912().method15911(Class6891.field29863, Class2120.field13819))
                     .method12300(Class103.field314, Direction.NORTH, Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817))
                     .method12300(
                        Class103.field314,
                        Direction.EAST,
                        Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817).method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12300(
                        Class103.field314,
                        Direction.SOUTH,
                        Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817).method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12300(
                        Class103.field314,
                        Direction.WEST,
                        Class5138.method15912().method15911(Class6891.field29862, Class2120.field13817).method15911(Class6891.field29863, Class2120.field13819)
                     )
               )
         );
   }

   private void method35929() {
      this.method35808(Class8487.field36641);
      this.field43642.accept(method35814(Class8487.field36641, Class9060.method33723(Class8487.field36641)));
   }

   private void method35930() {
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36588)
               .method15939(
                  Class3629.<Class113>method12310(Class8820.field39712)
                     .method12320(
                        Class113.field413, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36588, "_ns"))
                     )
                     .method12320(
                        Class113.field415, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36588, "_ew"))
                     )
               )
         );
   }

   private void method35931() {
      ResourceLocation var3 = Class7524.field32271.method25591(Class8487.field36580, this.field43643);
      this.field43642
         .accept(
            Class5148.method15943(
               Class8487.field36580,
               Class5138.method15912().method15911(Class6891.field29864, var3),
               Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29862, Class2120.field13817),
               Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29862, Class2120.field13818),
               Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29862, Class2120.field13819),
               Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13817),
               Class5138.method15912()
                  .method15911(Class6891.field29864, var3)
                  .method15911(Class6891.field29863, Class2120.field13817)
                  .method15911(Class6891.field29862, Class2120.field13817),
               Class5138.method15912()
                  .method15911(Class6891.field29864, var3)
                  .method15911(Class6891.field29863, Class2120.field13817)
                  .method15911(Class6891.field29862, Class2120.field13818),
               Class5138.method15912()
                  .method15911(Class6891.field29864, var3)
                  .method15911(Class6891.field29863, Class2120.field13817)
                  .method15911(Class6891.field29862, Class2120.field13819),
               Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13818),
               Class5138.method15912()
                  .method15911(Class6891.field29864, var3)
                  .method15911(Class6891.field29863, Class2120.field13818)
                  .method15911(Class6891.field29862, Class2120.field13817),
               Class5138.method15912()
                  .method15911(Class6891.field29864, var3)
                  .method15911(Class6891.field29863, Class2120.field13818)
                  .method15911(Class6891.field29862, Class2120.field13818),
               Class5138.method15912()
                  .method15911(Class6891.field29864, var3)
                  .method15911(Class6891.field29863, Class2120.field13818)
                  .method15911(Class6891.field29862, Class2120.field13819),
               Class5138.method15912().method15911(Class6891.field29864, var3).method15911(Class6891.field29863, Class2120.field13819),
               Class5138.method15912()
                  .method15911(Class6891.field29864, var3)
                  .method15911(Class6891.field29863, Class2120.field13819)
                  .method15911(Class6891.field29862, Class2120.field13817),
               Class5138.method15912()
                  .method15911(Class6891.field29864, var3)
                  .method15911(Class6891.field29863, Class2120.field13819)
                  .method15911(Class6891.field29862, Class2120.field13818),
               Class5138.method15912()
                  .method15911(Class6891.field29864, var3)
                  .method15911(Class6891.field29863, Class2120.field13819)
                  .method15911(Class6891.field29862, Class2120.field13819)
            )
         );
   }

   private void method35932() {
      ResourceLocation var3 = Class9060.method33723(Class8487.field36895);
      ResourceLocation var4 = Class9060.method33722(Class8487.field36895, "_on");
      this.field43642.accept(Class5148.method15941(Class8487.field36895).method15939(method35817(Class8820.field39704, var4, var3)).method15939(method35813()));
   }

   private void method35933() {
      Class7287 var3 = new Class7287()
         .method22991(Class9588.field44829, Class7287.method23042(Class8487.field36487, "_bottom"))
         .method22991(Class9588.field44833, Class7287.method23042(Class8487.field36487, "_side"));
      ResourceLocation var4 = Class7287.method23042(Class8487.field36487, "_top_sticky");
      ResourceLocation var5 = Class7287.method23042(Class8487.field36487, "_top");
      Class7287 var6 = var3.method22995(Class9588.field44855, var4);
      Class7287 var7 = var3.method22995(Class9588.field44855, var5);
      ResourceLocation var8 = Class9060.method33722(Class8487.field36487, "_base");
      this.method35934(Class8487.field36487, var8, var7);
      this.method35934(Class8487.field36480, var8, var6);
      ResourceLocation var9 = Class9756.field45542.method34806(Class8487.field36487, "_inventory", var3.method22995(Class9588.field44830, var5), this.field43643);
      ResourceLocation var10 = Class9756.field45542.method34806(Class8487.field36480, "_inventory", var3.method22995(Class9588.field44830, var4), this.field43643);
      this.method35805(Class8487.field36487, var9);
      this.method35805(Class8487.field36480, var10);
   }

   private void method35934(Class3209 var1, ResourceLocation var2, Class7287 var3) {
      ResourceLocation var6 = Class9756.field45614.method34805(var1, var3, this.field43643);
      this.field43642.accept(Class5148.method15941(var1).method15939(method35817(Class8820.field39688, var2, var6)).method15939(method35813()));
   }

   private void method35935() {
      Class7287 var3 = new Class7287()
         .method22991(Class9588.field44856, Class7287.method23042(Class8487.field36487, "_top"))
         .method22991(Class9588.field44833, Class7287.method23042(Class8487.field36487, "_side"));
      Class7287 var4 = var3.method22995(Class9588.field44855, Class7287.method23042(Class8487.field36487, "_top_sticky"));
      Class7287 var5 = var3.method22995(Class9588.field44855, Class7287.method23042(Class8487.field36487, "_top"));
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36488)
               .method15939(
                  Class3629.<Boolean, Class180>method12311(Class8820.field39705, Class8820.field39769)
                     .method12300(
                        false,
                        Class180.field638,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9756.field45615.method34806(Class8487.field36487, "_head", var5, this.field43643))
                     )
                     .method12300(
                        false,
                        Class180.field639,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9756.field45615.method34806(Class8487.field36487, "_head_sticky", var4, this.field43643))
                     )
                     .method12300(
                        true,
                        Class180.field638,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9756.field45616.method34806(Class8487.field36487, "_head_short", var5, this.field43643))
                     )
                     .method12300(
                        true,
                        Class180.field639,
                        Class5138.method15912()
                           .method15911(
                              Class6891.field29864, Class9756.field45616.method34806(Class8487.field36487, "_head_short_sticky", var4, this.field43643)
                           )
                     )
               )
               .method15939(method35813())
         );
   }

   private void method35936() {
      ResourceLocation var3 = Class9060.method33722(Class8487.field37053, "_stable");
      ResourceLocation var4 = Class9060.method33722(Class8487.field37053, "_unstable");
      this.method35805(Class8487.field37053, var3);
      this.field43642.accept(Class5148.method15941(Class8487.field37053).method15939(method35817(Class8820.field39683, var4, var3)));
   }

   private void method35937() {
      ResourceLocation var3 = Class7524.field32271.method25591(Class8487.field36653, this.field43643);
      ResourceLocation var4 = this.method35837(Class8487.field36653, "_on", Class9756.field45537, Class7287::method22999);
      this.field43642.accept(Class5148.method15941(Class8487.field36653).method15939(method35817(Class8820.field39699, var4, var3)));
   }

   private void method35938(Class3209 var1, Class3209 var2) {
      Class7287 var5 = Class7287.method23027(var1);
      this.field43642.accept(method35829(var1, Class9756.field45612.method34805(var1, var5, this.field43643)));
      this.field43642
         .accept(
            Class5148.method15942(
                  var2, Class5138.method15912().method15911(Class6891.field29864, Class9756.field45613.method34805(var2, var5, this.field43643))
               )
               .method15939(method35812())
         );
      this.method35808(var1);
      this.method35804(var2);
   }

   private void method35939() {
      Class7287 var3 = Class7287.method23027(Class8487.field36568);
      Class7287 var4 = Class7287.method23028(Class7287.method23042(Class8487.field36568, "_off"));
      ResourceLocation var5 = Class9756.field45612.method34805(Class8487.field36568, var3, this.field43643);
      ResourceLocation var6 = Class9756.field45612.method34806(Class8487.field36568, "_off", var4, this.field43643);
      this.field43642.accept(Class5148.method15941(Class8487.field36568).method15939(method35817(Class8820.field39699, var5, var6)));
      ResourceLocation var7 = Class9756.field45613.method34805(Class8487.field36569, var3, this.field43643);
      ResourceLocation var8 = Class9756.field45613.method34806(Class8487.field36569, "_off", var4, this.field43643);
      this.field43642.accept(Class5148.method15941(Class8487.field36569).method15939(method35817(Class8820.field39699, var7, var8)).method15939(method35812()));
      this.method35808(Class8487.field36568);
      this.method35804(Class8487.field36569);
   }

   private void method35940() {
      this.method35807(Class8514.field37788);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36592)
               .method15939(
                  Class3629.<Integer, Boolean, Boolean>method12312(Class8820.field39746, Class8820.field39700, Class8820.field39704)
                     .method12327((var0, var1, var2) -> {
                        StringBuilder var5 = new StringBuilder();
                        var5.append('_').append(var0).append("tick");
                        if (var2) {
                           var5.append("_on");
                        }

                        if (var1) {
                           var5.append("_locked");
                        }

                        return Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Class8487.field36592, var5.toString()));
                     })
               )
               .method15939(method35811())
         );
   }

   private void method35941() {
      this.method35807(Class8514.field37315);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field37005)
               .method15939(
                  Class3629.<Integer, Boolean>method12311(Class8820.field39758, Class8820.field39710)
                     .method12299(1, false, Arrays.<Class5138>asList(method35815(Class9060.method33720("dead_sea_pickle"))))
                     .method12299(2, false, Arrays.<Class5138>asList(method35815(Class9060.method33720("two_dead_sea_pickles"))))
                     .method12299(3, false, Arrays.<Class5138>asList(method35815(Class9060.method33720("three_dead_sea_pickles"))))
                     .method12299(4, false, Arrays.<Class5138>asList(method35815(Class9060.method33720("four_dead_sea_pickles"))))
                     .method12299(1, true, Arrays.<Class5138>asList(method35815(Class9060.method33720("sea_pickle"))))
                     .method12299(2, true, Arrays.<Class5138>asList(method35815(Class9060.method33720("two_sea_pickles"))))
                     .method12299(3, true, Arrays.<Class5138>asList(method35815(Class9060.method33720("three_sea_pickles"))))
                     .method12299(4, true, Arrays.<Class5138>asList(method35815(Class9060.method33720("four_sea_pickles"))))
               )
         );
   }

   private void method35942() {
      Class7287 var3 = Class7287.method22996(Class8487.field36571);
      ResourceLocation var4 = Class9756.field45537.method34805(Class8487.field36573, var3, this.field43643);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36571)
               .method15939(
                  Class3629.<Integer>method12310(Class8820.field39750)
                     .method12321(
                        var1 -> Class5138.method15912()
                              .method15911(Class6891.field29864, var1 >= 8 ? var4 : Class9060.method33722(Class8487.field36571, "_height" + var1 * 2))
                     )
               )
         );
      this.method35805(Class8487.field36571, Class9060.method33722(Class8487.field36571, "_height2"));
      this.field43642.accept(method35829(Class8487.field36573, var4));
   }

   private void method35943() {
      this.field43642
         .accept(
            Class5148.method15942(Class8487.field37063, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33723(Class8487.field37063)))
               .method15939(method35810())
         );
   }

   private void method35944() {
      ResourceLocation var3 = Class7524.field32271.method25591(Class8487.field37113, this.field43643);
      this.method35805(Class8487.field37113, var3);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field37113)
               .method15939(
                  Class3629.<Class104>method12310(Class8820.field39772)
                     .method12321(
                        var1 -> Class5138.method15912()
                              .method15911(
                                 Class6891.field29864,
                                 this.method35837(Class8487.field37113, "_" + var1.method257(), Class9756.field45537, Class7287::method22999)
                              )
                     )
               )
         );
   }

   private void method35945() {
      this.method35807(Class8514.field38170);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field37069)
               .method15939(
                  Class3629.<Integer>method12310(Class8820.field39740)
                     .method12321(
                        var1 -> Class5138.method15912()
                              .method15911(
                                 Class6891.field29864, this.method35837(Class8487.field37069, "_stage" + var1, Class9756.field45579, Class7287::method23001)
                              )
                     )
               )
         );
   }

   private void method35946() {
      this.method35807(Class8514.field37838);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36659)
               .method15939(
                  Class3629.<Boolean, Boolean, Boolean, Boolean, Boolean>method12314(
                        Class8820.field39682, Class8820.field39717, Class8820.field39716, Class8820.field39718, Class8820.field39719
                     )
                     .method12318(
                        false,
                        false,
                        false,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_ns"))
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        false,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_n"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_n"))
                     )
                     .method12318(
                        false,
                        false,
                        false,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_n"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        false,
                        false,
                        false,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_n"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_ne"))
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_ne"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        false,
                        false,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_ne"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_ne"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_ns"))
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_ns"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_nse"))
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_nse"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_nse"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_nse"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        true,
                        true,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_nsew"))
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_ns"))
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_n"))
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_n"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        false,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_n"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_n"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_ne"))
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_ne"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_ne"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_ne"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_ns"))
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_ns"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_nse"))
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_nse"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_nse"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_nse"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        true,
                        true,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36659, "_attached_nsew"))
                     )
               )
         );
   }

   private void method35947() {
      this.method35808(Class8487.field36658);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36658)
               .method15939(
                  Class3629.<Boolean, Boolean>method12311(Class8820.field39682, Class8820.field39704)
                     .method12301(
                        (var0, var1) -> Class5138.method15912()
                              .method15911(Class6891.field29864, Class7287.method23042(Class8487.field36658, (!var0 ? "" : "_attached") + (!var1 ? "" : "_on")))
                     )
               )
               .method15939(method35810())
         );
   }

   private ResourceLocation method35948(int var1, String var2, Class7287 var3) {
      switch (var1) {
         case 1:
            return Class9756.field45618.method34808(Class9060.method33720(var2 + "turtle_egg"), var3, this.field43643);
         case 2:
            return Class9756.field45619.method34808(Class9060.method33720("two_" + var2 + "turtle_eggs"), var3, this.field43643);
         case 3:
            return Class9756.field45620.method34808(Class9060.method33720("three_" + var2 + "turtle_eggs"), var3, this.field43643);
         case 4:
            return Class9756.field45621.method34808(Class9060.method33720("four_" + var2 + "turtle_eggs"), var3, this.field43643);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private ResourceLocation method35949(Integer var1, Integer var2) {
      switch (var2) {
         case 0:
            return this.method35948(var1, "", Class7287.method22999(Class7287.method23041(Class8487.field36964)));
         case 1:
            return this.method35948(var1, "slightly_cracked_", Class7287.method22999(Class7287.method23042(Class8487.field36964, "_slightly_cracked")));
         case 2:
            return this.method35948(var1, "very_cracked_", Class7287.method22999(Class7287.method23042(Class8487.field36964, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void method35950() {
      this.method35807(Class8514.field37718);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36964)
               .method15939(
                  Class3629.<Integer, Integer>method12311(Class8820.field39748, Class8820.field39749)
                     .method12302((var1, var2) -> Arrays.<Class5138>asList(method35815(this.method35949(var1, var2))))
               )
         );
   }

   private void method35951() {
      this.method35808(Class8487.field36636);
      this.field43642
         .accept(
            Class5148.method15941(Class8487.field36636)
               .method15939(
                  Class3629.<Boolean, Boolean, Boolean, Boolean, Boolean>method12314(
                        Class8820.field39717, Class8820.field39716, Class8820.field39718, Class8820.field39714, Class8820.field39719
                     )
                     .method12318(
                        false,
                        false,
                        false,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_1"))
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_1"))
                     )
                     .method12318(
                        false,
                        false,
                        false,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_1"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        false,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_1"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        false,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_1"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_2"))
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        false,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_2"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_2"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_2"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        false,
                        true,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_2_opposite"))
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        false,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_2_opposite"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_3"))
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_3"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_3"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_3"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        false,
                        true,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_4"))
                     )
                     .method12318(
                        false,
                        false,
                        false,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_u"))
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_1u"))
                     )
                     .method12318(
                        false,
                        false,
                        false,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_1u"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_1u"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_1u"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_2u"))
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_2u"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_2u"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_2u"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        true,
                        true,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_2u_opposite"))
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_2u_opposite"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_3u"))
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_3u"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_3u"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_3u"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        true,
                        true,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Class8487.field36636, "_4u"))
                     )
               )
         );
   }

   private void method35952() {
      this.field43642
         .accept(
            method35829(
               Class8487.field36890,
               Class9756.field45537.method34805(Class8487.field36890, Class7287.method22999(Class9060.method33720("magma")), this.field43643)
            )
         );
   }

   private void method35953(Class3209 var1) {
      this.method35841(var1, Class7524.field32282);
      Class9756.field45626.method34808(Class9060.method33724(var1.method11581()), Class7287.method23022(var1), this.field43643);
   }

   private void method35954(Class3209 var1, Class3209 var2, Class1958 var3) {
      this.method35855(var1, var3);
      this.method35855(var2, var3);
   }

   private void method35955(Class3209 var1, Class3209 var2) {
      Class9756.field45627.method34808(Class9060.method33724(var1.method11581()), Class7287.method23022(var2), this.field43643);
   }

   private void method35956() {
      ResourceLocation var3 = Class9060.method33723(Class8487.field36388);
      ResourceLocation var4 = Class9060.method33722(Class8487.field36388, "_mirrored");
      this.field43642.accept(method35816(Class8487.field36619, var3, var4));
      this.method35805(Class8487.field36619, var3);
   }

   private void method35957(Class3209 var1, Class3209 var2) {
      this.method35853(var1, Class1958.field12763);
      Class7287 var5 = Class7287.method23003(Class7287.method23042(var1, "_pot"));
      ResourceLocation var6 = Class1958.field12763.method8224().method34805(var2, var5, this.field43643);
      this.field43642.accept(method35829(var2, var6));
   }

   private void method35958() {
      ResourceLocation var3 = Class7287.method23042(Class8487.field37124, "_bottom");
      ResourceLocation var4 = Class7287.method23042(Class8487.field37124, "_top_off");
      ResourceLocation var5 = Class7287.method23042(Class8487.field37124, "_top");
      ResourceLocation[] var6 = new ResourceLocation[5];

      for (int var7 = 0; var7 < 5; var7++) {
         Class7287 var8 = new Class7287()
            .method22991(Class9588.field44829, var3)
            .method22991(Class9588.field44830, var7 != 0 ? var5 : var4)
            .method22991(Class9588.field44833, Class7287.method23042(Class8487.field37124, "_side" + var7));
         var6[var7] = Class9756.field45542.method34806(Class8487.field37124, "_" + var7, var8, this.field43643);
      }

      this.field43642
         .accept(
            Class5148.method15941(Class8487.field37124)
               .method15939(
                  Class3629.<Integer>method12310(Class8820.field39762)
                     .method12321(var1 -> Class5138.method15912().method15911(Class6891.field29864, var6[var1]))
               )
         );
      this.method35806(Class8514.field38197, var6[0]);
   }

   private Class5138 method35959(Class182 var1, Class5138 var2) {
      switch (Class8902.field40294[var1.ordinal()]) {
         case 1:
            return var2.method15911(Class6891.field29862, Class2120.field13817);
         case 2:
            return var2.method15911(Class6891.field29862, Class2120.field13817).method15911(Class6891.field29863, Class2120.field13818);
         case 3:
            return var2.method15911(Class6891.field29862, Class2120.field13817).method15911(Class6891.field29863, Class2120.field13819);
         case 4:
            return var2.method15911(Class6891.field29862, Class2120.field13817).method15911(Class6891.field29863, Class2120.field13817);
         case 5:
            return var2.method15911(Class6891.field29862, Class2120.field13819).method15911(Class6891.field29863, Class2120.field13818);
         case 6:
            return var2.method15911(Class6891.field29862, Class2120.field13819);
         case 7:
            return var2.method15911(Class6891.field29862, Class2120.field13819).method15911(Class6891.field29863, Class2120.field13817);
         case 8:
            return var2.method15911(Class6891.field29862, Class2120.field13819).method15911(Class6891.field29863, Class2120.field13819);
         case 9:
            return var2;
         case 10:
            return var2.method15911(Class6891.field29863, Class2120.field13818);
         case 11:
            return var2.method15911(Class6891.field29863, Class2120.field13819);
         case 12:
            return var2.method15911(Class6891.field29863, Class2120.field13817);
         default:
            throw new UnsupportedOperationException("Rotation " + var1 + " can't be expressed with existing x and y values");
      }
   }

   private void method35960() {
      ResourceLocation var3 = Class7287.method23042(Class8487.field37114, "_top");
      ResourceLocation var4 = Class7287.method23042(Class8487.field37114, "_bottom");
      ResourceLocation var5 = Class7287.method23042(Class8487.field37114, "_side");
      ResourceLocation var6 = Class7287.method23042(Class8487.field37114, "_lock");
      Class7287 var7 = new Class7287()
         .method22991(Class9588.field44839, var5)
         .method22991(Class9588.field44837, var5)
         .method22991(Class9588.field44836, var5)
         .method22991(Class9588.field44827, var3)
         .method22991(Class9588.field44834, var3)
         .method22991(Class9588.field44835, var4)
         .method22991(Class9588.field44838, var6);
      ResourceLocation var8 = Class9756.field45536.method34805(Class8487.field37114, var7, this.field43643);
      this.field43642
         .accept(
            Class5148.method15942(Class8487.field37114, Class5138.method15912().method15911(Class6891.field29864, var8))
               .method15939(Class3629.<Class182>method12310(Class8820.field39723).method12321(var1 -> this.method35959(var1, Class5138.method15912())))
         );
   }

   public void method35961() {
      this.method35851(Class8487.field36387);
      this.method35852(Class8487.field37012, Class8487.field36387);
      this.method35852(Class8487.field37011, Class8487.field36387);
      this.method35851(Class8487.field36665);
      this.method35851(Class8487.field36574);
      this.method35852(Class8487.field37013, Class8487.field36413);
      this.method35851(Class8487.field36652);
      this.method35851(Class8487.field36963);
      this.method35851(Class8487.field36646);
      this.method35851(Class8487.field36668);
      this.method35807(Class8514.field38051);
      this.method35851(Class8487.field37119);
      this.method35851(Class8487.field36413);
      this.method35851(Class8487.field36414);
      this.method35851(Class8487.field36764);
      this.method35807(Class8514.field37470);
      this.method35851(Class8487.field37010);
      this.method35851(Class8487.field36692);
      this.method35869(Class8487.field36765, Class8514.field37569);
      this.method35807(Class8514.field37569);
      this.method35869(Class8487.field36894, Class8514.field37651);
      this.method35807(Class8514.field37651);
      this.method35870(Class8487.field36505, Class7287.method23042(Class8487.field36487, "_side"));
      this.method35841(Class8487.field36420, Class7524.field32271);
      this.method35841(Class8487.field36795, Class7524.field32271);
      this.method35841(Class8487.field36536, Class7524.field32271);
      this.method35841(Class8487.field36537, Class7524.field32271);
      this.method35841(Class8487.field36656, Class7524.field32271);
      this.method35841(Class8487.field36660, Class7524.field32271);
      this.method35841(Class8487.field36418, Class7524.field32271);
      this.method35841(Class8487.field36421, Class7524.field32271);
      this.method35841(Class8487.field36521, Class7524.field32271);
      this.method35841(Class8487.field36419, Class7524.field32271);
      this.method35841(Class8487.field36522, Class7524.field32271);
      this.method35841(Class8487.field37122, Class7524.field32273);
      this.method35841(Class8487.field37121, Class7524.field32271);
      this.method35841(Class8487.field36455, Class7524.field32271);
      this.method35841(Class8487.field36456, Class7524.field32271);
      this.method35841(Class8487.field36722, Class7524.field32271);
      this.method35841(Class8487.field36567, Class7524.field32271);
      this.method35841(Class8487.field36721, Class7524.field32271);
      this.method35841(Class8487.field37141, Class7524.field32271);
      this.method35841(Class8487.field37006, Class7524.field32271);
      this.method35841(Class8487.field37147, Class7524.field32271);
      this.method35841(Class8487.field36575, Class7524.field32271);
      this.method35841(Class8487.field36397, Class7524.field32271);
      this.method35841(Class8487.field37148, Class7524.field32271);
      this.method35841(Class8487.field36617, Class7524.field32271);
      this.method35841(Class8487.field37123, Class7524.field32271);
      this.method35841(Class8487.field36651, Class7524.field32271);
      this.method35841(Class8487.field36587, Class7524.field32271);
      this.method35841(Class8487.field36417, Class7524.field32271);
      this.method35841(Class8487.field37120, Class7524.field32271);
      this.method35841(Class8487.field36572, Class7524.field32271);
      this.method35841(Class8487.field36577, Class7524.field32276);
      this.method35841(Class8487.field37129, Class7524.field32273);
      this.method35841(Class8487.field36631, Class7524.field32273);
      this.method35841(Class8487.field36891, Class7524.field32271);
      this.method35841(Class8487.field36461, Class7524.field32271);
      this.method35841(Class8487.field36796, Class7524.field32271);
      this.method35841(Class8487.field36527, Class7524.field32271);
      this.method35841(Class8487.field37149, Class7524.field32271);
      this.method35841(Class8487.field36776, Class7524.field32271);
      this.method35841(Class8487.field37085, Class7524.field32271);
      this.method35841(Class8487.field36581, Class7524.field32271);
      this.method35841(Class8487.field36582, Class7524.field32271);
      this.method35841(Class8487.field36532, Class7524.field32271);
      this.method35841(Class8487.field36452, Class7524.field32271);
      this.method35841(Class8487.field36485, Class7524.field32287);
      this.method35807(Class8514.field37314);
      this.method35841(Class8487.field36524, Class7524.field32275);
      this.method35841(Class8487.field37116, Class7524.field32273);
      this.method35841(Class8487.field37076, Class7524.field32271);
      this.method35841(Class8487.field36453, Class7524.field32271);
      this.method35841(Class8487.field37136, Class7524.field32271);
      this.method35841(
         Class8487.field36725, Class7524.field32273.method25593(var0 -> var0.method22991(Class9588.field44833, Class7287.method23041(Class8487.field36725)))
      );
      this.method35841(Class8487.field36618, Class7524.field32271);
      this.method35901(Class8487.field36459, Class8487.field36458);
      this.method35901(Class8487.field36836, Class8487.field36835);
      this.method35841(Class8487.field37137, Class7524.field32271);
      this.method35923(Class8487.field36717, Class8487.field36521);
      this.method35923(Class8487.field36718, Class8487.field36522);
      this.method35888();
      this.method35892();
      this.method35894();
      this.method35887(Class8487.field37067, Class8487.field37068);
      this.method35895();
      this.method35900();
      this.method35902();
      this.method35905();
      this.method35906();
      this.method35908();
      this.method35904();
      this.method35909(Class8487.field36877);
      this.method35910();
      this.method35915();
      this.method35916();
      this.method35918();
      this.method35919();
      this.method35921();
      this.method35922();
      this.method35885();
      this.method35924();
      this.method35926();
      this.method35928();
      this.method35929();
      this.method35930();
      this.method35931();
      this.method35932();
      this.method35933();
      this.method35935();
      this.method35936();
      this.method35939();
      this.method35937();
      this.method35940();
      this.method35941();
      this.method35896();
      this.method35942();
      this.method35943();
      this.method35944();
      this.method35945();
      this.method35946();
      this.method35947();
      this.method35950();
      this.method35951();
      this.method35952();
      this.method35960();
      this.method35927(Class8487.field36549);
      this.method35808(Class8487.field36549);
      this.method35927(Class8487.field37061);
      this.method35938(Class8487.field36528, Class8487.field36529);
      this.method35938(Class8487.field36585, Class8487.field36586);
      this.method35897(Class8487.field36538, Class8487.field36400, Class7287::method23035);
      this.method35897(Class8487.field37059, Class8487.field36402, Class7287::method23036);
      this.method35907(Class8487.field37083);
      this.method35907(Class8487.field37074);
      this.method35903(Class8487.field36457);
      this.method35903(Class8487.field36729);
      this.method35917(Class8487.field37065);
      this.method35917(Class8487.field37066);
      this.method35832(Class8487.field36629, Class9060.method33723(Class8487.field36629));
      this.method35833(Class8487.field36583, Class7524.field32273);
      this.method35833(Class8487.field36584, Class7524.field32273);
      this.method35833(Class8487.field36893, Class7524.field32273);
      this.method35819(Class8487.field36396);
      this.method35819(Class8487.field36415);
      this.method35819(Class8487.field36416);
      this.method35818(Class8487.field36412);
      this.method35836(Class8487.field36777, Class7524.field32273, Class7524.field32274);
      this.method35836(Class8487.field36881, Class7524.field32288, Class7524.field32289);
      this.method35836(Class8487.field36726, Class7524.field32288, Class7524.field32289);
      this.method35834(Class8487.field37054, Class7524.field32278);
      this.method35898();
      this.method35882(Class8487.field37117, Class7287::method23031);
      this.method35882(Class8487.field37118, Class7287::method23033);
      this.method35883(Class8487.field36884, Class8820.field39740, 0, 1, 2, 3);
      this.method35883(Class8487.field36693, Class8820.field39742, 0, 0, 1, 1, 2, 2, 2, 3);
      this.method35883(Class8487.field36645, Class8820.field39740, 0, 1, 1, 2);
      this.method35883(Class8487.field36694, Class8820.field39742, 0, 0, 1, 1, 2, 2, 2, 3);
      this.method35883(Class8487.field36539, Class8820.field39742, 0, 1, 2, 3, 4, 5, 6, 7);
      this.method35867(Class9060.method33720("banner"), Class8487.field36400)
         .method26608(
            Class9756.field45628,
            Class8487.field36803,
            Class8487.field36804,
            Class8487.field36805,
            Class8487.field36806,
            Class8487.field36807,
            Class8487.field36808,
            Class8487.field36809,
            Class8487.field36810,
            Class8487.field36811,
            Class8487.field36812,
            Class8487.field36813,
            Class8487.field36814,
            Class8487.field36815,
            Class8487.field36816,
            Class8487.field36817,
            Class8487.field36818
         )
         .method26607(
            Class8487.field36819,
            Class8487.field36820,
            Class8487.field36821,
            Class8487.field36822,
            Class8487.field36823,
            Class8487.field36824,
            Class8487.field36825,
            Class8487.field36826,
            Class8487.field36827,
            Class8487.field36828,
            Class8487.field36829,
            Class8487.field36830,
            Class8487.field36831,
            Class8487.field36832,
            Class8487.field36833,
            Class8487.field36834
         );
      this.method35867(Class9060.method33720("bed"), Class8487.field36400)
         .method26607(
            Class8487.field36462,
            Class8487.field36463,
            Class8487.field36464,
            Class8487.field36465,
            Class8487.field36466,
            Class8487.field36467,
            Class8487.field36468,
            Class8487.field36469,
            Class8487.field36470,
            Class8487.field36471,
            Class8487.field36472,
            Class8487.field36473,
            Class8487.field36474,
            Class8487.field36475,
            Class8487.field36476,
            Class8487.field36477
         );
      this.method35955(Class8487.field36462, Class8487.field36489);
      this.method35955(Class8487.field36463, Class8487.field36490);
      this.method35955(Class8487.field36464, Class8487.field36491);
      this.method35955(Class8487.field36465, Class8487.field36492);
      this.method35955(Class8487.field36466, Class8487.field36493);
      this.method35955(Class8487.field36467, Class8487.field36494);
      this.method35955(Class8487.field36468, Class8487.field36495);
      this.method35955(Class8487.field36469, Class8487.field36496);
      this.method35955(Class8487.field36470, Class8487.field36497);
      this.method35955(Class8487.field36471, Class8487.field36498);
      this.method35955(Class8487.field36472, Class8487.field36499);
      this.method35955(Class8487.field36473, Class8487.field36500);
      this.method35955(Class8487.field36474, Class8487.field36501);
      this.method35955(Class8487.field36475, Class8487.field36502);
      this.method35955(Class8487.field36476, Class8487.field36503);
      this.method35955(Class8487.field36477, Class8487.field36504);
      this.method35867(Class9060.method33720("skull"), Class8487.field36581)
         .method26608(Class9756.field45629, Class8487.field36709, Class8487.field36707, Class8487.field36705, Class8487.field36701, Class8487.field36703)
         .method26606(Class8487.field36711)
         .method26607(Class8487.field36710, Class8487.field36712, Class8487.field36708, Class8487.field36706, Class8487.field36702, Class8487.field36704);
      this.method35953(Class8487.field36896);
      this.method35953(Class8487.field36897);
      this.method35953(Class8487.field36898);
      this.method35953(Class8487.field36899);
      this.method35953(Class8487.field36900);
      this.method35953(Class8487.field36901);
      this.method35953(Class8487.field36902);
      this.method35953(Class8487.field36903);
      this.method35953(Class8487.field36904);
      this.method35953(Class8487.field36905);
      this.method35953(Class8487.field36906);
      this.method35953(Class8487.field36907);
      this.method35953(Class8487.field36908);
      this.method35953(Class8487.field36909);
      this.method35953(Class8487.field36910);
      this.method35953(Class8487.field36911);
      this.method35953(Class8487.field36912);
      this.method35841(Class8487.field37007, Class7524.field32282);
      this.method35804(Class8487.field37007);
      this.method35867(Class9060.method33720("chest"), Class8487.field36400).method26607(Class8487.field36534, Class8487.field36716);
      this.method35867(Class9060.method33720("ender_chest"), Class8487.field36527).method26607(Class8487.field36657);
      this.method35868(Class8487.field36649, Class8487.field36527).method26606(Class8487.field36649, Class8487.field36886);
      this.method35840(Class8487.field36929);
      this.method35840(Class8487.field36930);
      this.method35840(Class8487.field36931);
      this.method35840(Class8487.field36932);
      this.method35840(Class8487.field36933);
      this.method35840(Class8487.field36934);
      this.method35840(Class8487.field36935);
      this.method35840(Class8487.field36936);
      this.method35840(Class8487.field36937);
      this.method35840(Class8487.field36938);
      this.method35840(Class8487.field36939);
      this.method35840(Class8487.field36940);
      this.method35840(Class8487.field36941);
      this.method35840(Class8487.field36942);
      this.method35840(Class8487.field36943);
      this.method35840(Class8487.field36944);
      this.method35872(
         Class7524.field32271,
         Class8487.field36945,
         Class8487.field36946,
         Class8487.field36947,
         Class8487.field36948,
         Class8487.field36949,
         Class8487.field36950,
         Class8487.field36951,
         Class8487.field36952,
         Class8487.field36953,
         Class8487.field36954,
         Class8487.field36955,
         Class8487.field36956,
         Class8487.field36957,
         Class8487.field36958,
         Class8487.field36959,
         Class8487.field36960
      );
      this.method35840(Class8487.field36794);
      this.method35840(Class8487.field36730);
      this.method35840(Class8487.field36731);
      this.method35840(Class8487.field36732);
      this.method35840(Class8487.field36733);
      this.method35840(Class8487.field36734);
      this.method35840(Class8487.field36735);
      this.method35840(Class8487.field36736);
      this.method35840(Class8487.field36737);
      this.method35840(Class8487.field36738);
      this.method35840(Class8487.field36739);
      this.method35840(Class8487.field36740);
      this.method35840(Class8487.field36741);
      this.method35840(Class8487.field36742);
      this.method35840(Class8487.field36743);
      this.method35840(Class8487.field36744);
      this.method35840(Class8487.field36745);
      this.method35874(Class8487.field36454, Class8487.field36630);
      this.method35874(Class8487.field36593, Class8487.field36746);
      this.method35874(Class8487.field36594, Class8487.field36747);
      this.method35874(Class8487.field36595, Class8487.field36748);
      this.method35874(Class8487.field36596, Class8487.field36749);
      this.method35874(Class8487.field36597, Class8487.field36750);
      this.method35874(Class8487.field36598, Class8487.field36751);
      this.method35874(Class8487.field36599, Class8487.field36752);
      this.method35874(Class8487.field36600, Class8487.field36753);
      this.method35874(Class8487.field36601, Class8487.field36754);
      this.method35874(Class8487.field36602, Class8487.field36755);
      this.method35874(Class8487.field36603, Class8487.field36756);
      this.method35874(Class8487.field36604, Class8487.field36757);
      this.method35874(Class8487.field36605, Class8487.field36758);
      this.method35874(Class8487.field36606, Class8487.field36759);
      this.method35874(Class8487.field36607, Class8487.field36760);
      this.method35874(Class8487.field36608, Class8487.field36761);
      this.method35873(
         Class7524.field32280,
         Class8487.field36913,
         Class8487.field36914,
         Class8487.field36915,
         Class8487.field36916,
         Class8487.field36917,
         Class8487.field36918,
         Class8487.field36919,
         Class8487.field36920,
         Class8487.field36921,
         Class8487.field36922,
         Class8487.field36923,
         Class8487.field36924,
         Class8487.field36925,
         Class8487.field36926,
         Class8487.field36927,
         Class8487.field36928
      );
      this.method35871(Class8487.field36489, Class8487.field36778);
      this.method35871(Class8487.field36490, Class8487.field36779);
      this.method35871(Class8487.field36491, Class8487.field36780);
      this.method35871(Class8487.field36492, Class8487.field36781);
      this.method35871(Class8487.field36493, Class8487.field36782);
      this.method35871(Class8487.field36494, Class8487.field36783);
      this.method35871(Class8487.field36495, Class8487.field36784);
      this.method35871(Class8487.field36496, Class8487.field36785);
      this.method35871(Class8487.field36497, Class8487.field36786);
      this.method35871(Class8487.field36498, Class8487.field36787);
      this.method35871(Class8487.field36499, Class8487.field36788);
      this.method35871(Class8487.field36500, Class8487.field36789);
      this.method35871(Class8487.field36501, Class8487.field36790);
      this.method35871(Class8487.field36502, Class8487.field36791);
      this.method35871(Class8487.field36503, Class8487.field36792);
      this.method35871(Class8487.field36504, Class8487.field36793);
      this.method35857(Class8487.field36483, Class8487.field36675, Class1958.field12762);
      this.method35857(Class8487.field36506, Class8487.field36676, Class1958.field12763);
      this.method35857(Class8487.field36507, Class8487.field36677, Class1958.field12763);
      this.method35857(Class8487.field36508, Class8487.field36678, Class1958.field12763);
      this.method35857(Class8487.field36509, Class8487.field36679, Class1958.field12763);
      this.method35857(Class8487.field36510, Class8487.field36680, Class1958.field12763);
      this.method35857(Class8487.field36511, Class8487.field36681, Class1958.field12763);
      this.method35857(Class8487.field36512, Class8487.field36682, Class1958.field12763);
      this.method35857(Class8487.field36513, Class8487.field36683, Class1958.field12763);
      this.method35857(Class8487.field36514, Class8487.field36684, Class1958.field12763);
      this.method35857(Class8487.field36515, Class8487.field36685, Class1958.field12763);
      this.method35857(Class8487.field36516, Class8487.field36686, Class1958.field12763);
      this.method35857(Class8487.field36518, Class8487.field36687, Class1958.field12763);
      this.method35857(Class8487.field36517, Class8487.field36688, Class1958.field12763);
      this.method35857(Class8487.field36520, Class8487.field36689, Class1958.field12763);
      this.method35857(Class8487.field36519, Class8487.field36690, Class1958.field12763);
      this.method35857(Class8487.field36484, Class8487.field36691, Class1958.field12763);
      this.method35893(Class8487.field36625);
      this.method35893(Class8487.field36626);
      this.method35893(Class8487.field36627);
      this.method35853(Class8487.field36482, Class1958.field12762);
      this.method35855(Class8487.field36576, Class1958.field12762);
      this.method35807(Class8514.field37355);
      this.method35954(Class8487.field36961, Class8487.field36962, Class1958.field12762);
      this.method35807(Class8514.field37356);
      this.method35804(Class8487.field36962);
      this.method35954(Class8487.field37086, Class8487.field37087, Class1958.field12763);
      this.method35954(Class8487.field37088, Class8487.field37089, Class1958.field12763);
      this.method35809(Class8487.field37086, "_plant");
      this.method35804(Class8487.field37087);
      this.method35809(Class8487.field37088, "_plant");
      this.method35804(Class8487.field37089);
      this.method35854(Class8487.field37008, Class1958.field12762, Class7287.method23001(Class7287.method23042(Class8487.field37009, "_stage0")));
      this.method35878();
      this.method35853(Class8487.field36481, Class1958.field12763);
      this.method35861(Class8487.field36798, Class1958.field12763);
      this.method35861(Class8487.field36799, Class1958.field12763);
      this.method35861(Class8487.field36800, Class1958.field12763);
      this.method35861(Class8487.field36801, Class1958.field12762);
      this.method35861(Class8487.field36802, Class1958.field12762);
      this.method35862();
      this.method35863();
      this.method35860(
         Class8487.field36980,
         Class8487.field36975,
         Class8487.field36970,
         Class8487.field36965,
         Class8487.field36990,
         Class8487.field36985,
         Class8487.field37000,
         Class8487.field36995
      );
      this.method35860(
         Class8487.field36981,
         Class8487.field36976,
         Class8487.field36971,
         Class8487.field36966,
         Class8487.field36991,
         Class8487.field36986,
         Class8487.field37001,
         Class8487.field36996
      );
      this.method35860(
         Class8487.field36982,
         Class8487.field36977,
         Class8487.field36972,
         Class8487.field36967,
         Class8487.field36992,
         Class8487.field36987,
         Class8487.field37002,
         Class8487.field36997
      );
      this.method35860(
         Class8487.field36983,
         Class8487.field36978,
         Class8487.field36973,
         Class8487.field36968,
         Class8487.field36993,
         Class8487.field36988,
         Class8487.field37003,
         Class8487.field36998
      );
      this.method35860(
         Class8487.field36984,
         Class8487.field36979,
         Class8487.field36974,
         Class8487.field36969,
         Class8487.field36994,
         Class8487.field36989,
         Class8487.field37004,
         Class8487.field36999
      );
      this.method35859(Class8487.field36635, Class8487.field36633);
      this.method35859(Class8487.field36634, Class8487.field36632);
      this.method35845(Class8487.field36404)
         .method31167(Class8487.field36699)
         .method31169(Class8487.field36870)
         .method31170(Class8487.field36865)
         .method31171(Class8487.field36565)
         .method31172(Class8487.field36545, Class8487.field36555)
         .method31173(Class8487.field36843)
         .method31174(Class8487.field36762);
      this.method35847(Class8487.field36875);
      this.method35848(Class8487.field36613);
      this.method35850(Class8487.field36426).method36613(Class8487.field36426).method36611(Class8487.field36438);
      this.method35850(Class8487.field36431).method36613(Class8487.field36431).method36611(Class8487.field36444);
      this.method35857(Class8487.field36410, Class8487.field36673, Class1958.field12763);
      this.method35841(Class8487.field36450, Class7524.field32284);
      this.method35845(Class8487.field36402)
         .method31167(Class8487.field36697)
         .method31169(Class8487.field36868)
         .method31170(Class8487.field36863)
         .method31171(Class8487.field36563)
         .method31172(Class8487.field36544, Class8487.field36554)
         .method31173(Class8487.field36841)
         .method31174(Class8487.field36662);
      this.method35847(Class8487.field36873);
      this.method35848(Class8487.field36611);
      this.method35850(Class8487.field36424).method36613(Class8487.field36424).method36611(Class8487.field36436);
      this.method35850(Class8487.field36429).method36613(Class8487.field36429).method36611(Class8487.field36442);
      this.method35857(Class8487.field36408, Class8487.field36671, Class1958.field12763);
      this.method35841(Class8487.field36448, Class7524.field32284);
      this.method35845(Class8487.field36400)
         .method31167(Class8487.field36695)
         .method31169(Class8487.field36578)
         .method31170(Class8487.field36637)
         .method31171(Class8487.field36561)
         .method31172(Class8487.field36542, Class8487.field36552)
         .method31173(Class8487.field36839)
         .method31173(Class8487.field36849)
         .method31174(Class8487.field36533);
      this.method35847(Class8487.field36548);
      this.method35849(Class8487.field36609);
      this.method35850(Class8487.field36422).method36613(Class8487.field36422).method36611(Class8487.field36434);
      this.method35850(Class8487.field36433).method36613(Class8487.field36433).method36611(Class8487.field36440);
      this.method35857(Class8487.field36406, Class8487.field36669, Class1958.field12763);
      this.method35841(Class8487.field36446, Class7524.field32284);
      this.method35845(Class8487.field36401)
         .method31167(Class8487.field36696)
         .method31169(Class8487.field36867)
         .method31170(Class8487.field36862)
         .method31171(Class8487.field36562)
         .method31172(Class8487.field36543, Class8487.field36553)
         .method31173(Class8487.field36840)
         .method31174(Class8487.field36661);
      this.method35847(Class8487.field36872);
      this.method35848(Class8487.field36610);
      this.method35850(Class8487.field36423).method36613(Class8487.field36423).method36611(Class8487.field36435);
      this.method35850(Class8487.field36428).method36613(Class8487.field36428).method36611(Class8487.field36441);
      this.method35857(Class8487.field36407, Class8487.field36670, Class1958.field12763);
      this.method35841(Class8487.field36447, Class7524.field32284);
      this.method35845(Class8487.field36405)
         .method31167(Class8487.field36700)
         .method31169(Class8487.field36871)
         .method31170(Class8487.field36866)
         .method31171(Class8487.field36566)
         .method31172(Class8487.field36547, Class8487.field36557)
         .method31173(Class8487.field36844)
         .method31174(Class8487.field36763);
      this.method35847(Class8487.field36876);
      this.method35849(Class8487.field36614);
      this.method35850(Class8487.field36427).method36613(Class8487.field36427).method36611(Class8487.field36439);
      this.method35850(Class8487.field36432).method36613(Class8487.field36432).method36611(Class8487.field36445);
      this.method35857(Class8487.field36411, Class8487.field36674, Class1958.field12763);
      this.method35841(Class8487.field36451, Class7524.field32284);
      this.method35845(Class8487.field36403)
         .method31167(Class8487.field36698)
         .method31169(Class8487.field36869)
         .method31170(Class8487.field36864)
         .method31171(Class8487.field36564)
         .method31172(Class8487.field36546, Class8487.field36556)
         .method31173(Class8487.field36842)
         .method31174(Class8487.field36663);
      this.method35847(Class8487.field36874);
      this.method35848(Class8487.field36612);
      this.method35850(Class8487.field36425).method36613(Class8487.field36425).method36611(Class8487.field36437);
      this.method35850(Class8487.field36430).method36613(Class8487.field36430).method36611(Class8487.field36443);
      this.method35857(Class8487.field36409, Class8487.field36672, Class1958.field12763);
      this.method35841(Class8487.field36449, Class7524.field32284);
      this.method35845(Class8487.field37091)
         .method31167(Class8487.field37105)
         .method31169(Class8487.field37097)
         .method31170(Class8487.field37101)
         .method31171(Class8487.field37095)
         .method31172(Class8487.field37109, Class8487.field37111)
         .method31173(Class8487.field37093)
         .method31174(Class8487.field37103);
      this.method35847(Class8487.field37107);
      this.method35848(Class8487.field37099);
      this.method35850(Class8487.field37079).method36612(Class8487.field37079).method36611(Class8487.field37081);
      this.method35850(Class8487.field37080).method36612(Class8487.field37080).method36611(Class8487.field37082);
      this.method35857(Class8487.field37084, Class8487.field37125, Class1958.field12763);
      this.method35957(Class8487.field37090, Class8487.field37127);
      this.method35845(Class8487.field37092)
         .method31167(Class8487.field37106)
         .method31169(Class8487.field37098)
         .method31170(Class8487.field37102)
         .method31171(Class8487.field37096)
         .method31172(Class8487.field37110, Class8487.field37112)
         .method31173(Class8487.field37094)
         .method31174(Class8487.field37104);
      this.method35847(Class8487.field37108);
      this.method35848(Class8487.field37100);
      this.method35850(Class8487.field37070).method36612(Class8487.field37070).method36611(Class8487.field37072);
      this.method35850(Class8487.field37071).method36612(Class8487.field37071).method36611(Class8487.field37073);
      this.method35857(Class8487.field37075, Class8487.field37126, Class1958.field12763);
      this.method35957(Class8487.field37077, Class8487.field37128);
      this.method35855(Class8487.field37078, Class1958.field12763);
      this.method35807(Class8514.field37352);
      this.method35846(Class7287.method22996(Class8487.field36388)).method31166(var1 -> {
         ResourceLocation var4 = Class9756.field45537.method34805(Class8487.field36388, var1, this.field43643);
         ResourceLocation var5 = Class9756.field45538.method34805(Class8487.field36388, var1, this.field43643);
         this.field43642.accept(method35816(Class8487.field36388, var4, var5));
         return var4;
      }).method31173(Class8487.field36845).method31171(Class8487.field36559).method31167(Class8487.field36570).method31174(Class8487.field37020);
      this.method35847(Class8487.field36560);
      this.method35849(Class8487.field36766);
      this.method35845(Class8487.field36615).method31168(Class8487.field37046).method31174(Class8487.field36639).method31173(Class8487.field36852);
      this.method35845(Class8487.field36616).method31168(Class8487.field37044).method31174(Class8487.field37016).method31173(Class8487.field37030);
      this.method35845(Class8487.field36399).method31168(Class8487.field36666).method31174(Class8487.field36551).method31173(Class8487.field36850);
      this.method35845(Class8487.field36526).method31168(Class8487.field36667).method31174(Class8487.field37018).method31173(Class8487.field37032);
      this.method35845(Class8487.field36767).method31168(Class8487.field37042).method31174(Class8487.field36770).method31173(Class8487.field36773);
      this.method35845(Class8487.field36768).method31174(Class8487.field36771).method31173(Class8487.field36774);
      this.method35845(Class8487.field36769).method31174(Class8487.field36772).method31173(Class8487.field36775);
      this.method35844(Class8487.field36458, Class7524.field32290)
         .method31168(Class8487.field37050)
         .method31174(Class8487.field36655)
         .method31173(Class8487.field36847);
      this.method35843(Class8487.field36859, Class7524.method24565(Class7287.method23042(Class8487.field36458, "_top")))
         .method31173(Class8487.field37034)
         .method31174(Class8487.field37021);
      this.method35843(
            Class8487.field36460,
            Class7524.field32273
               .method25590(Class8487.field36458)
               .method24561(var0 -> var0.method22991(Class9588.field44833, Class7287.method23041(Class8487.field36460)))
         )
         .method31173(Class8487.field36848);
      this.method35844(Class8487.field36835, Class7524.field32290)
         .method31168(Class8487.field37043)
         .method31174(Class8487.field36838)
         .method31173(Class8487.field36855);
      this.method35843(Class8487.field36861, Class7524.method24565(Class7287.method23042(Class8487.field36835, "_top")))
         .method31173(Class8487.field37029)
         .method31174(Class8487.field37015);
      this.method35843(
            Class8487.field36837,
            Class7524.field32273
               .method25590(Class8487.field36835)
               .method24561(var0 -> var0.method22991(Class9588.field44833, Class7287.method23041(Class8487.field36837)))
         )
         .method31173(Class8487.field36856);
      this.method35845(Class8487.field36523).method31168(Class8487.field37041).method31174(Class8487.field36638).method31173(Class8487.field36851);
      this.method35845(Class8487.field36642)
         .method31169(Class8487.field36643)
         .method31168(Class8487.field37047)
         .method31174(Class8487.field36644)
         .method31173(Class8487.field36853);
      this.method35845(Class8487.field36880).method31174(Class8487.field36882).method31173(Class8487.field36857);
      this.method35845(Class8487.field36391).method31168(Class8487.field37052).method31174(Class8487.field37027).method31173(Class8487.field37040);
      this.method35845(Class8487.field36392).method31174(Class8487.field37017).method31173(Class8487.field37031);
      this.method35845(Class8487.field36389).method31168(Class8487.field37045).method31174(Class8487.field37023).method31173(Class8487.field37036);
      this.method35845(Class8487.field36390).method31174(Class8487.field37014).method31173(Class8487.field37028);
      this.method35845(Class8487.field36393).method31168(Class8487.field37048).method31174(Class8487.field37024).method31173(Class8487.field37037);
      this.method35845(Class8487.field36394).method31174(Class8487.field37026).method31173(Class8487.field37039);
      this.method35845(Class8487.field36883).method31168(Class8487.field37051).method31174(Class8487.field37019).method31173(Class8487.field37033);
      this.method35844(Class8487.field36724, Class7524.field32273).method31174(Class8487.field36727).method31173(Class8487.field36854);
      this.method35843(Class8487.field36860, Class7524.method24565(Class7287.method23042(Class8487.field36724, "_bottom")))
         .method31174(Class8487.field37022)
         .method31173(Class8487.field37035);
      this.method35845(Class8487.field36892).method31173(Class8487.field37038).method31174(Class8487.field37025).method31168(Class8487.field37049);
      this.method35844(Class8487.field37130, Class7524.field32291)
         .method31168(Class8487.field37132)
         .method31174(Class8487.field37131)
         .method31173(Class8487.field37133);
      this.method35845(Class8487.field37135).method31168(Class8487.field37140).method31174(Class8487.field37139).method31173(Class8487.field37138);
      this.method35845(Class8487.field37134)
         .method31168(Class8487.field37146)
         .method31171(Class8487.field37144)
         .method31167(Class8487.field37145)
         .method31174(Class8487.field37142)
         .method31173(Class8487.field37143);
      this.method35891();
      this.method35865(Class8487.field36550);
      this.method35866(Class8487.field36478);
      this.method35866(Class8487.field36479);
      this.method35866(Class8487.field36728);
      this.method35890();
      this.method35875(Class8487.field36664);
      this.method35875(Class8487.field36887);
      this.method35875(Class8487.field36888);
      this.method35876(Class8487.field36713);
      this.method35876(Class8487.field36714);
      this.method35876(Class8487.field36715);
      this.method35880();
      this.method35884();
      this.method35886(Class8487.field36541, Class7524.field32277);
      this.method35886(Class8487.field37057, Class7524.field32277);
      this.method35886(Class8487.field37056, Class7524.field32278);
      this.method35889();
      this.method35958();
      this.method35925(Class8487.field36618, Class8487.field36624);
      this.method35925(Class8487.field36399, Class8487.field36620);
      this.method35925(Class8487.field36617, Class8487.field36623);
      this.method35925(Class8487.field36616, Class8487.field36622);
      this.method35956();
      this.method35925(Class8487.field36615, Class8487.field36621);
      Class3311.method11854().forEach(var1 -> this.method35806(var1, Class9060.method33721("template_spawn_egg")));
   }

   // $VF: synthetic method
   public static BiConsumer method35999(Class9407 var0) {
      return var0.field43643;
   }

   // $VF: synthetic method
   public static Class5148 method36000(Class3209 var0, ResourceLocation var1) {
      return method35829(var0, var1);
   }

   // $VF: synthetic method
   public static Consumer method36001(Class9407 var0) {
      return var0.field43642;
   }

   // $VF: synthetic method
   public static Class5146 method36002(Class3209 var0, ResourceLocation var1, ResourceLocation var2) {
      return method35820(var0, var1, var2);
   }

   // $VF: synthetic method
   public static void method36003(Class9407 var0, Class3209 var1, ResourceLocation var2) {
      var0.method35805(var1, var2);
   }

   // $VF: synthetic method
   public static Class5146 method36004(Class3209 var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
      return method35824(var0, var1, var2, var3);
   }

   // $VF: synthetic method
   public static Class5146 method36005(Class3209 var0, ResourceLocation var1, ResourceLocation var2) {
      return method35823(var0, var1, var2);
   }

   // $VF: synthetic method
   public static Class5146 method36006(Class3209 var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3, ResourceLocation var4) {
      return method35825(var0, var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static Class5146 method36007(Class3209 var0, ResourceLocation var1, ResourceLocation var2) {
      return method35838(var0, var1, var2);
   }

   // $VF: synthetic method
   public static void method36008(Class9407 var0, Class3257 var1) {
      var0.method35807(var1);
   }

   // $VF: synthetic method
   public static void method36009(Class9407 var0, Class3209 var1) {
      var0.method35804(var1);
   }

   // $VF: synthetic method
   public static Class5146 method36010(Class3209 var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
      return method35839(var0, var1, var2, var3);
   }

   // $VF: synthetic method
   public static Class5146 method36011(Class3209 var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
      return method35826(var0, var1, var2, var3);
   }

   // $VF: synthetic method
   public static Class5146 method36012(Class3209 var0, ResourceLocation var1) {
      return method35831(var0, var1);
   }

   // $VF: synthetic method
   public static Class5146 method36013(Class3209 var0, ResourceLocation var1, ResourceLocation var2) {
      return method35835(var0, var1, var2);
   }
}
