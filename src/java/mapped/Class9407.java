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

   private void method35804(Block var1) {
      this.field43644.accept(var1.method11581());
   }

   private void method35805(Block var1, ResourceLocation var2) {
      this.field43643.accept(Class9060.method33724(var1.method11581()), new Class5149(var2));
   }

   private void method35806(Class3257 var1, ResourceLocation var2) {
      this.field43643.accept(Class9060.method33724(var1), new Class5149(var2));
   }

   private void method35807(Class3257 var1) {
      Class9756.field45623.method34808(Class9060.method33724(var1), Class7287.method23038(var1), this.field43643);
   }

   private void method35808(Block var1) {
      Class3257 var4 = var1.method11581();
      if (var4 != Class8514.field37222) {
         Class9756.field45623.method34808(Class9060.method33724(var4), Class7287.method23039(var1), this.field43643);
      }
   }

   private void method35809(Block var1, String var2) {
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

   private static Class5148 method35814(Block var0, ResourceLocation var1) {
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

   private static Class5148 method35816(Block var0, ResourceLocation var1, ResourceLocation var2) {
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

   private void method35818(Block var1) {
      ResourceLocation var4 = Class7524.field32271.method25591(var1, this.field43643);
      ResourceLocation var5 = Class7524.field32272.method25591(var1, this.field43643);
      this.field43642.accept(method35816(var1, var4, var5));
   }

   private void method35819(Block var1) {
      ResourceLocation var4 = Class7524.field32271.method25591(var1, this.field43643);
      this.field43642.accept(method35814(var1, var4));
   }

   private static Class5146 method35820(Block var0, ResourceLocation var1, ResourceLocation var2) {
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

   private static Class5146 method35822(Block var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3, ResourceLocation var4) {
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

   private static Class5146 method35823(Block var0, ResourceLocation var1, ResourceLocation var2) {
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

   private static Class5146 method35824(Block var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
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

   private static Class5146 method35825(Block var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3, ResourceLocation var4) {
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

   private static Class5146 method35826(Block var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
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

   private static Class5146 method35827(Block var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
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

   private static Class5146 method35828(Block var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
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

   private static Class5148 method35829(Block var0, ResourceLocation var1) {
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

   private static Class5146 method35831(Block var0, ResourceLocation var1) {
      return Class5148.method15942(var0, Class5138.method15912().method15911(Class6891.field29864, var1)).method15939(method35830());
   }

   private void method35832(Block var1, ResourceLocation var2) {
      this.field43642.accept(method35831(var1, var2));
   }

   private void method35833(Block var1, Class7732 var2) {
      ResourceLocation var5 = var2.method25591(var1, this.field43643);
      this.field43642.accept(method35831(var1, var5));
   }

   private void method35834(Block var1, Class7732 var2) {
      ResourceLocation var5 = var2.method25591(var1, this.field43643);
      this.field43642.accept(Class5148.method15942(var1, Class5138.method15912().method15911(Class6891.field29864, var5)).method15939(method35810()));
   }

   private static Class5146 method35835(Block var0, ResourceLocation var1, ResourceLocation var2) {
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

   private void method35836(Block var1, Class7732 var2, Class7732 var3) {
      ResourceLocation var6 = var2.method25591(var1, this.field43643);
      ResourceLocation var7 = var3.method25591(var1, this.field43643);
      this.field43642.accept(method35835(var1, var6, var7));
   }

   private ResourceLocation method35837(Block var1, String var2, Class9253 var3, Function<ResourceLocation, Class7287> var4) {
      return var3.method34806(var1, var2, (Class7287)var4.apply(Class7287.method23042(var1, var2)), this.field43643);
   }

   private static Class5146 method35838(Block var0, ResourceLocation var1, ResourceLocation var2) {
      return Class5148.method15941(var0).method15939(method35817(Class8820.field39704, var2, var1));
   }

   private static Class5146 method35839(Block var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
      return Class5148.method15941(var0)
         .method15939(
            Class3629.<Class86>method12310(Class8820.field39770)
               .method12320(Class86.field219, Class5138.method15912().method15911(Class6891.field29864, var1))
               .method12320(Class86.field218, Class5138.method15912().method15911(Class6891.field29864, var2))
               .method12320(Class86.field220, Class5138.method15912().method15911(Class6891.field29864, var3))
         );
   }

   private void method35840(Block var1) {
      this.method35841(var1, Class7524.field32271);
   }

   private void method35841(Block var1, Class7732 var2) {
      this.field43642.accept(method35829(var1, var2.method25591(var1, this.field43643)));
   }

   private void method35842(Block var1, Class7287 var2, Class9253 var3) {
      ResourceLocation var6 = var3.method34805(var1, var2, this.field43643);
      this.field43642.accept(method35829(var1, var6));
   }

   private Class8659 method35843(Block var1, Class7524 var2) {
      return new Class8659(this, var2.method24560()).method31165(var1, var2.method24559());
   }

   private Class8659 method35844(Block var1, Class7732 var2) {
      Class7524 var5 = var2.method25590(var1);
      return new Class8659(this, var5.method24560()).method31165(var1, var5.method24559());
   }

   private Class8659 method35845(Block var1) {
      return this.method35844(var1, Class7524.field32271);
   }

   private Class8659 method35846(Class7287 var1) {
      return new Class8659(this, var1);
   }

   private void method35847(Block var1) {
      Class7287 var4 = Class7287.method23021(var1);
      ResourceLocation var5 = Class9756.field45549.method34805(var1, var4, this.field43643);
      ResourceLocation var6 = Class9756.field45550.method34805(var1, var4, this.field43643);
      ResourceLocation var7 = Class9756.field45551.method34805(var1, var4, this.field43643);
      ResourceLocation var8 = Class9756.field45552.method34805(var1, var4, this.field43643);
      this.method35807(var1.method11581());
      this.field43642.accept(method35822(var1, var5, var6, var7, var8));
   }

   private void method35848(Block var1) {
      Class7287 var4 = Class7287.method22997(var1);
      ResourceLocation var5 = Class9756.field45576.method34805(var1, var4, this.field43643);
      ResourceLocation var6 = Class9756.field45577.method34805(var1, var4, this.field43643);
      ResourceLocation var7 = Class9756.field45578.method34805(var1, var4, this.field43643);
      this.field43642.accept(method35827(var1, var5, var6, var7));
      this.method35805(var1, var6);
   }

   private void method35849(Block var1) {
      Class7287 var4 = Class7287.method22997(var1);
      ResourceLocation var5 = Class9756.field45573.method34805(var1, var4, this.field43643);
      ResourceLocation var6 = Class9756.field45574.method34805(var1, var4, this.field43643);
      ResourceLocation var7 = Class9756.field45575.method34805(var1, var4, this.field43643);
      this.field43642.accept(method35828(var1, var5, var6, var7));
      this.method35805(var1, var6);
   }

   private Class9483 method35850(Block var1) {
      return new Class9483(this, Class7287.method23016(var1));
   }

   private void method35851(Block var1) {
      this.method35852(var1, var1);
   }

   private void method35852(Block var1, Block var2) {
      this.field43642.accept(method35829(var1, Class9060.method33723(var2)));
   }

   private void method35853(Block var1, Class1958 var2) {
      this.method35808(var1);
      this.method35855(var1, var2);
   }

   private void method35854(Block var1, Class1958 var2, Class7287 var3) {
      this.method35808(var1);
      this.method35856(var1, var2, var3);
   }

   private void method35855(Block var1, Class1958 var2) {
      Class7287 var5 = Class7287.method23000(var1);
      this.method35856(var1, var2, var5);
   }

   private void method35856(Block var1, Class1958 var2, Class7287 var3) {
      ResourceLocation var6 = var2.method8223().method34805(var1, var3, this.field43643);
      this.field43642.accept(method35829(var1, var6));
   }

   private void method35857(Block var1, Block var2, Class1958 var3) {
      this.method35853(var1, var3);
      Class7287 var6 = Class7287.method23002(var1);
      ResourceLocation var7 = var3.method8224().method34805(var2, var6, this.field43643);
      this.field43642.accept(method35829(var2, var7));
   }

   private void method35858(Block var1, Block var2) {
      Class7524 var5 = Class7524.field32281.method25590(var1);
      ResourceLocation var6 = var5.method24562(var1, this.field43643);
      this.field43642.accept(method35829(var1, var6));
      ResourceLocation var7 = Class9756.field45589.method34805(var2, var5.method24560(), this.field43643);
      this.field43642.accept(Class5148.method15942(var2, Class5138.method15912().method15911(Class6891.field29864, var7)).method15939(method35810()));
      this.method35808(var1);
   }

   private void method35859(Block var1, Block var2) {
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

   private void method35860(Block var1, Block var2, Block var3, Block var4, Block var5, Block var6, Block var7, Block var8) {
      this.method35853(var1, Class1958.field12763);
      this.method35853(var2, Class1958.field12763);
      this.method35840(var3);
      this.method35840(var4);
      this.method35858(var5, var7);
      this.method35858(var6, var8);
   }

   private void method35861(Block var1, Class1958 var2) {
      this.method35809(var1, "_top");
      ResourceLocation var5 = this.method35837(var1, "_top", var2.method8223(), Class7287::method23001);
      ResourceLocation var6 = this.method35837(var1, "_bottom", var2.method8223(), Class7287::method23001);
      this.method35864(var1, var5, var6);
   }

   private void method35862() {
      this.method35809(Blocks.SUNFLOWER, "_front");
      ResourceLocation var3 = Class9060.method33722(Blocks.SUNFLOWER, "_top");
      ResourceLocation var4 = this.method35837(Blocks.SUNFLOWER, "_bottom", Class1958.field12763.method8223(), Class7287::method23001);
      this.method35864(Blocks.SUNFLOWER, var3, var4);
   }

   private void method35863() {
      ResourceLocation var3 = this.method35837(Blocks.TALL_SEAGRASS, "_top", Class9756.field45617, Class7287::method22998);
      ResourceLocation var4 = this.method35837(Blocks.TALL_SEAGRASS, "_bottom", Class9756.field45617, Class7287::method22998);
      this.method35864(Blocks.TALL_SEAGRASS, var3, var4);
   }

   private void method35864(Block var1, ResourceLocation var2, ResourceLocation var3) {
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

   private void method35865(Block var1) {
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

   private void method35866(Block var1) {
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

   private Class7928 method35867(ResourceLocation var1, Block var2) {
      return new Class7928(this, var1, var2);
   }

   private Class7928 method35868(Block var1, Block var2) {
      return new Class7928(this, Class9060.method33723(var1), var2);
   }

   private void method35869(Block var1, Class3257 var2) {
      ResourceLocation var5 = Class9756.field45566.method34805(var1, Class7287.method23029(var2), this.field43643);
      this.field43642.accept(method35829(var1, var5));
   }

   private void method35870(Block var1, ResourceLocation var2) {
      ResourceLocation var5 = Class9756.field45566.method34805(var1, Class7287.method23023(var2), this.field43643);
      this.field43642.accept(method35829(var1, var5));
   }

   private void method35871(Block var1, Block var2) {
      this.method35841(var1, Class7524.field32271);
      ResourceLocation var5 = Class7524.field32279.method25590(var1).method24562(var2, this.field43643);
      this.field43642.accept(method35829(var2, var5));
   }

   private void method35872(Class7732 var1, Block... var2) {
      for (Block var8 : var2) {
         ResourceLocation var9 = var1.method25591(var8, this.field43643);
         this.field43642.accept(method35814(var8, var9));
      }
   }

   private void method35873(Class7732 var1, Block... var2) {
      for (Block var8 : var2) {
         ResourceLocation var9 = var1.method25591(var8, this.field43643);
         this.field43642.accept(Class5148.method15942(var8, Class5138.method15912().method15911(Class6891.field29864, var9)).method15939(method35811()));
      }
   }

   private void method35874(Block var1, Block var2) {
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

   private void method35875(Block var1) {
      Class7287 var4 = Class7287.method23030(var1);
      ResourceLocation var5 = Class9756.field45598.method34805(var1, var4, this.field43643);
      ResourceLocation var6 = this.method35837(var1, "_conditional", Class9756.field45598, var1x -> var4.method22995(Class9588.field44833, var1x));
      this.field43642.accept(Class5148.method15941(var1).method15939(method35817(Class8820.field39684, var6, var5)).method15939(method35813()));
   }

   private void method35876(Block var1) {
      ResourceLocation var4 = Class7524.field32283.method25591(var1, this.field43643);
      this.field43642.accept(method35829(var1, var4).method15939(method35811()));
   }

   private List<Class5138> method35877(int var1) {
      String var4 = "_age" + var1;
      return IntStream.range(1, 5)
         .<Class5138>mapToObj(var1x -> Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field37009, var1x + var4)))
         .collect(Collectors.<Class5138>toList());
   }

   private void method35878() {
      this.method35804(Blocks.field37009);
      this.field43642
         .accept(
            Class5147.method15932(Blocks.field37009)
               .method15935(Class5141.method15919().method15924(Class8820.field39738, 0), this.method35877(0))
               .method15935(Class5141.method15919().method15924(Class8820.field39738, 1), this.method35877(1))
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39773, Class181.field643),
                  Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field37009, "_small_leaves"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39773, Class181.field644),
                  Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field37009, "_large_leaves"))
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
      ResourceLocation var3 = Class7287.method23042(Blocks.field37055, "_top_open");
      this.field43642
         .accept(
            Class5148.method15941(Blocks.field37055)
               .method15939(this.method35879())
               .method15939(
                  Class3629.<Boolean>method12310(Class8820.field39702)
                     .method12320(
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class7524.field32275.method25591(Blocks.field37055, this.field43643))
                     )
                     .method12320(
                        true,
                        Class5138.method15912()
                           .method15911(
                              Class6891.field29864,
                              Class7524.field32275
                                 .method25590(Blocks.field37055)
                                 .method24561(var1 -> var1.method22991(Class9588.field44830, var3))
                                 .method24563(Blocks.field37055, "_open", this.field43643)
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

   private void method35882(Block var1, Function<Block, Class7287> var2) {
      Class7287 var5 = ((Class7287)var2.apply(var1)).method22993(Class9588.field44833, Class9588.field44827);
      Class7287 var6 = var5.method22995(Class9588.field44831, Class7287.method23042(var1, "_front_honey"));
      ResourceLocation var7 = Class9756.field45544.method34805(var1, var5, this.field43643);
      ResourceLocation var8 = Class9756.field45544.method34806(var1, "_honey", var6, this.field43643);
      this.field43642.accept(Class5148.method15941(var1).method15939(method35810()).method15939(method35881(Class8820.field39754, 5, var8, var7)));
   }

   private void method35883(Block var1, Class8550<Integer> var2, int... var3) {
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
      ResourceLocation var3 = Class9060.method33722(Blocks.field37064, "_floor");
      ResourceLocation var4 = Class9060.method33722(Blocks.field37064, "_ceiling");
      ResourceLocation var5 = Class9060.method33722(Blocks.field37064, "_wall");
      ResourceLocation var6 = Class9060.method33722(Blocks.field37064, "_between_walls");
      this.method35807(Class8514.field38167);
      this.field43642
         .accept(
            Class5148.method15941(Blocks.field37064)
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
            Class5148.method15942(Blocks.field37060, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33723(Blocks.field37060)))
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

   private void method35886(Block var1, Class7732 var2) {
      ResourceLocation var5 = var2.method25591(var1, this.field43643);
      ResourceLocation var6 = Class7287.method23042(var1, "_front_on");
      ResourceLocation var7 = var2.method25590(var1).method24561(var1x -> var1x.method22991(Class9588.field44831, var6)).method24563(var1, "_on", this.field43643);
      this.field43642.accept(Class5148.method15941(var1).method15939(method35817(Class8820.field39699, var7, var5)).method15939(method35810()));
   }

   private void method35887(Block... var1) {
      ResourceLocation var4 = Class9060.method33720("campfire_off");

      for (Block var8 : var1) {
         ResourceLocation var9 = Class9756.field45609.method34805(var8, Class7287.method23037(var8), this.field43643);
         this.method35807(var8.method11581());
         this.field43642.accept(Class5148.method15941(var8).method15939(method35817(Class8820.field39699, var9, var4)).method15939(method35811()));
      }
   }

   private void method35888() {
      Class7287 var3 = Class7287.method23017(Class7287.method23041(Blocks.field36525), Class7287.method23041(Blocks.field36400));
      ResourceLocation var4 = Class9756.field45539.method34805(Blocks.field36525, var3, this.field43643);
      this.field43642.accept(method35829(Blocks.field36525, var4));
   }

   private void method35889() {
      this.method35807(Class8514.field37887);
      this.field43642
         .accept(
            Class5147.method15932(Blocks.REDSTONE_WIRE)
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
            Class5148.method15941(Blocks.field36719)
               .method15939(method35811())
               .method15939(
                  Class3629.<Class105, Boolean>method12311(Class8820.field39766, Class8820.field39704)
                     .method12300(
                        Class105.field325, false, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33723(Blocks.field36719))
                     )
                     .method12300(
                        Class105.field325, true, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field36719, "_on"))
                     )
                     .method12300(
                        Class105.field326,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field36719, "_subtract"))
                     )
                     .method12300(
                        Class105.field326,
                        true,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field36719, "_on_subtract"))
                     )
               )
         );
   }

   private void method35891() {
      Class7287 var3 = Class7287.method22996(Blocks.field36858);
      Class7287 var4 = Class7287.method23017(Class7287.method23042(Blocks.field36846, "_side"), var3.method22994(Class9588.field44830));
      ResourceLocation var5 = Class9756.field45567.method34805(Blocks.field36846, var4, this.field43643);
      ResourceLocation var6 = Class9756.field45568.method34805(Blocks.field36846, var4, this.field43643);
      ResourceLocation var7 = Class9756.field45539.method34807(Blocks.field36846, "_double", var4, this.field43643);
      this.field43642.accept(method35839(Blocks.field36846, var5, var6, var7));
      this.field43642.accept(method35829(Blocks.field36858, Class9756.field45537.method34805(Blocks.field36858, var3, this.field43643)));
   }

   private void method35892() {
      this.method35807(Class8514.field37977);
      this.field43642
         .accept(
            Class5147.method15932(Blocks.field36647)
               .method15934(Class5138.method15912().method15911(Class6891.field29864, Class7287.method23041(Blocks.field36647)))
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39692, true),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Blocks.field36647, "_bottle0"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39693, true),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Blocks.field36647, "_bottle1"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39694, true),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Blocks.field36647, "_bottle2"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39692, false),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Blocks.field36647, "_empty0"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39693, false),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Blocks.field36647, "_empty1"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39694, false),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Blocks.field36647, "_empty2"))
               )
         );
   }

   private void method35893(Block var1) {
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
            Class5148.method15941(Blocks.field36591)
               .method15939(
                  Class3629.<Integer>method12310(Class8820.field39745)
                     .method12320(0, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33723(Blocks.field36591)))
                     .method12320(1, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field36591, "_slice1")))
                     .method12320(2, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field36591, "_slice2")))
                     .method12320(3, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field36591, "_slice3")))
                     .method12320(4, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field36591, "_slice4")))
                     .method12320(5, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field36591, "_slice5")))
                     .method12320(6, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field36591, "_slice6")))
               )
         );
   }

   private void method35895() {
      Class7287 var3 = new Class7287()
         .method22991(Class9588.field44827, Class7287.method23042(Blocks.field37058, "_side3"))
         .method22991(Class9588.field44839, Class7287.method23041(Blocks.field36405))
         .method22991(Class9588.field44838, Class7287.method23042(Blocks.field37058, "_top"))
         .method22991(Class9588.field44834, Class7287.method23042(Blocks.field37058, "_side3"))
         .method22991(Class9588.field44836, Class7287.method23042(Blocks.field37058, "_side3"))
         .method22991(Class9588.field44835, Class7287.method23042(Blocks.field37058, "_side1"))
         .method22991(Class9588.field44837, Class7287.method23042(Blocks.field37058, "_side2"));
      this.field43642.accept(method35829(Blocks.field37058, Class9756.field45535.method34805(Blocks.field37058, var3, this.field43643)));
   }

   private void method35896() {
      Class7287 var3 = new Class7287()
         .method22991(Class9588.field44827, Class7287.method23042(Blocks.field37062, "_front"))
         .method22991(Class9588.field44839, Class7287.method23042(Blocks.field37062, "_bottom"))
         .method22991(Class9588.field44838, Class7287.method23042(Blocks.field37062, "_top"))
         .method22991(Class9588.field44834, Class7287.method23042(Blocks.field37062, "_front"))
         .method22991(Class9588.field44835, Class7287.method23042(Blocks.field37062, "_front"))
         .method22991(Class9588.field44836, Class7287.method23042(Blocks.field37062, "_side"))
         .method22991(Class9588.field44837, Class7287.method23042(Blocks.field37062, "_side"));
      this.field43642.accept(method35829(Blocks.field37062, Class9756.field45535.method34805(Blocks.field37062, var3, this.field43643)));
   }

   private void method35897(Block var1, Block var2, BiFunction<Block, Block, Class7287> var3) {
      Class7287 var6 = (Class7287)var3.apply(var1, var2);
      this.field43642.accept(method35829(var1, Class9756.field45535.method34805(var1, var6, this.field43643)));
   }

   private void method35898() {
      Class7287 var3 = Class7287.method23014(Blocks.PUMPKIN);
      this.field43642.accept(method35829(Blocks.PUMPKIN, Class9060.method33723(Blocks.PUMPKIN)));
      this.method35899(Blocks.field36589, var3);
      this.method35899(Blocks.field36590, var3);
   }

   private void method35899(Block var1, Class7287 var2) {
      ResourceLocation var5 = Class9756.field45543.method34805(var1, var2.method22995(Class9588.field44831, Class7287.method23041(var1)), this.field43643);
      this.field43642.accept(Class5148.method15942(var1, Class5138.method15912().method15911(Class6891.field29864, var5)).method15939(method35810()));
   }

   private void method35900() {
      this.method35807(Class8514.field37978);
      this.field43642
         .accept(
            Class5148.method15941(Blocks.field36648)
               .method15939(
                  Class3629.<Integer>method12310(Class8820.field39751)
                     .method12320(0, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33723(Blocks.field36648)))
                     .method12320(1, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field36648, "_level1")))
                     .method12320(2, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field36648, "_level2")))
                     .method12320(3, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field36648, "_level3")))
               )
         );
   }

   private void method35901(Block var1, Block var2) {
      Class7287 var5 = new Class7287()
         .method22991(Class9588.field44828, Class7287.method23042(var2, "_top"))
         .method22991(Class9588.field44833, Class7287.method23041(var1));
      this.method35842(var1, var5, Class9756.field45539);
   }

   private void method35902() {
      Class7287 var3 = Class7287.method22997(Blocks.field36879);
      ResourceLocation var4 = Class9756.field45591.method34805(Blocks.field36879, var3, this.field43643);
      ResourceLocation var5 = this.method35837(Blocks.field36879, "_dead", Class9756.field45591, var1 -> var3.method22995(Class9588.field44826, var1));
      this.field43642.accept(Class5148.method15941(Blocks.field36879).method15939(method35881(Class8820.field39741, 5, var5, var4)));
   }

   private void method35903(Block var1) {
      Class7287 var4 = new Class7287()
         .method22991(Class9588.field44830, Class7287.method23042(Blocks.FURNACE, "_top"))
         .method22991(Class9588.field44833, Class7287.method23042(Blocks.FURNACE, "_side"))
         .method22991(Class9588.field44831, Class7287.method23042(var1, "_front"));
      Class7287 var5 = new Class7287()
         .method22991(Class9588.field44833, Class7287.method23042(Blocks.FURNACE, "_top"))
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
      ResourceLocation var3 = Class9060.method33723(Blocks.field36650);
      ResourceLocation var4 = Class9060.method33722(Blocks.field36650, "_filled");
      this.field43642
         .accept(
            Class5148.method15941(Blocks.field36650)
               .method15939(
                  Class3629.<Boolean>method12310(Class8820.field39689)
                     .method12320(false, Class5138.method15912().method15911(Class6891.field29864, var3))
                     .method12320(true, Class5138.method15912().method15911(Class6891.field29864, var4))
               )
               .method15939(method35811())
         );
   }

   private void method35905() {
      ResourceLocation var3 = Class9060.method33722(Blocks.field36878, "_side");
      ResourceLocation var4 = Class9060.method33722(Blocks.field36878, "_noside");
      ResourceLocation var5 = Class9060.method33722(Blocks.field36878, "_noside1");
      ResourceLocation var6 = Class9060.method33722(Blocks.field36878, "_noside2");
      ResourceLocation var7 = Class9060.method33722(Blocks.field36878, "_noside3");
      this.field43642
         .accept(
            Class5147.method15932(Blocks.field36878)
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
            Class5147.method15932(Blocks.field37115)
               .method15934(Class5138.method15912().method15911(Class6891.field29864, Class7287.method23041(Blocks.field37115)))
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 1),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Blocks.field37115, "_contents1"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 2),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Blocks.field37115, "_contents2"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 3),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Blocks.field37115, "_contents3"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 4),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Blocks.field37115, "_contents4"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 5),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Blocks.field37115, "_contents5"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 6),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Blocks.field37115, "_contents6"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 7),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Blocks.field37115, "_contents7"))
               )
               .method15937(
                  Class5141.method15919().method15924(Class8820.field39752, 8),
                  Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Blocks.field37115, "_contents_ready"))
               )
         );
   }

   private void method35907(Block var1) {
      Class7287 var4 = new Class7287()
         .method22991(Class9588.field44829, Class7287.method23041(Blocks.NETHERRACK))
         .method22991(Class9588.field44830, Class7287.method23041(var1))
         .method22991(Class9588.field44833, Class7287.method23042(var1, "_side"));
      this.field43642.accept(method35829(var1, Class9756.field45542.method34805(var1, var4, this.field43643)));
   }

   private void method35908() {
      ResourceLocation var3 = Class7287.method23042(Blocks.field36720, "_side");
      Class7287 var4 = new Class7287()
         .method22991(Class9588.field44830, Class7287.method23042(Blocks.field36720, "_top"))
         .method22991(Class9588.field44833, var3);
      Class7287 var5 = new Class7287()
         .method22991(Class9588.field44830, Class7287.method23042(Blocks.field36720, "_inverted_top"))
         .method22991(Class9588.field44833, var3);
      this.field43642
         .accept(
            Class5148.method15941(Blocks.field36720)
               .method15939(
                  Class3629.<Boolean>method12310(Class8820.field39697)
                     .method12320(
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9756.field45592.method34805(Blocks.field36720, var4, this.field43643))
                     )
                     .method12320(
                        true,
                        Class5138.method15912()
                           .method15911(
                              Class6891.field29864,
                              Class9756.field45592.method34808(Class9060.method33722(Blocks.field36720, "_inverted"), var5, this.field43643)
                           )
                     )
               )
         );
   }

   private void method35909(Block var1) {
      this.field43642
         .accept(
            Class5148.method15942(var1, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33723(var1))).method15939(this.method35879())
         );
   }

   private void method35910() {
      Class7287 var3 = new Class7287()
         .method22991(Class9588.field44852, Class7287.method23041(Blocks.field36396))
         .method22991(Class9588.field44830, Class7287.method23041(Blocks.FARMLAND));
      Class7287 var4 = new Class7287()
         .method22991(Class9588.field44852, Class7287.method23041(Blocks.field36396))
         .method22991(Class9588.field44830, Class7287.method23042(Blocks.FARMLAND, "_moist"));
      ResourceLocation var5 = Class9756.field45603.method34805(Blocks.FARMLAND, var3, this.field43643);
      ResourceLocation var6 = Class9756.field45603.method34808(Class7287.method23042(Blocks.FARMLAND, "_moist"), var4, this.field43643);
      this.field43642.accept(Class5148.method15941(Blocks.FARMLAND).method15939(method35881(Class8820.field39756, 7, var6, var5)));
   }

   private List<ResourceLocation> method35911(Block var1) {
      ResourceLocation var4 = Class9756.field45604.method34808(Class9060.method33722(var1, "_floor0"), Class7287.method23024(var1), this.field43643);
      ResourceLocation var5 = Class9756.field45604.method34808(Class9060.method33722(var1, "_floor1"), Class7287.method23025(var1), this.field43643);
      return ImmutableList.of(var4, var5);
   }

   private List<ResourceLocation> method35912(Block var1) {
      ResourceLocation var4 = Class9756.field45605.method34808(Class9060.method33722(var1, "_side0"), Class7287.method23024(var1), this.field43643);
      ResourceLocation var5 = Class9756.field45605.method34808(Class9060.method33722(var1, "_side1"), Class7287.method23025(var1), this.field43643);
      ResourceLocation var6 = Class9756.field45606.method34808(Class9060.method33722(var1, "_side_alt0"), Class7287.method23024(var1), this.field43643);
      ResourceLocation var7 = Class9756.field45606.method34808(Class9060.method33722(var1, "_side_alt1"), Class7287.method23025(var1), this.field43643);
      return ImmutableList.of(var4, var5, var6, var7);
   }

   private List<ResourceLocation> method35913(Block var1) {
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
      List var4 = this.method35911(Blocks.FIRE);
      List var5 = this.method35912(Blocks.FIRE);
      List var6 = this.method35913(Blocks.FIRE);
      this.field43642
         .accept(
            Class5147.method15932(Blocks.FIRE)
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
      List var3 = this.method35911(Blocks.field36531);
      List var4 = this.method35912(Blocks.field36531);
      this.field43642
         .accept(
            Class5147.method15932(Blocks.field36531)
               .method15933(method35914(var3, var0 -> var0))
               .method15933(method35914(var4, var0 -> var0))
               .method15933(method35914(var4, var0 -> var0.method15911(Class6891.field29863, Class2120.field13817)))
               .method15933(method35914(var4, var0 -> var0.method15911(Class6891.field29863, Class2120.field13818)))
               .method15933(method35914(var4, var0 -> var0.method15911(Class6891.field29863, Class2120.field13819)))
         );
   }

   private void method35917(Block var1) {
      ResourceLocation var4 = Class7524.field32285.method25591(var1, this.field43643);
      ResourceLocation var5 = Class7524.field32286.method25591(var1, this.field43643);
      this.method35807(var1.method11581());
      this.field43642.accept(Class5148.method15941(var1).method15939(method35817(Class8820.field39691, var5, var4)));
   }

   private void method35918() {
      this.field43642
         .accept(
            Class5148.method15941(Blocks.field36889)
               .method15939(
                  Class3629.<Integer>method12310(Class8820.field39740)
                     .method12320(
                        0,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, this.method35837(Blocks.field36889, "_0", Class9756.field45537, Class7287::method22999))
                     )
                     .method12320(
                        1,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, this.method35837(Blocks.field36889, "_1", Class9756.field45537, Class7287::method22999))
                     )
                     .method12320(
                        2,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, this.method35837(Blocks.field36889, "_2", Class9756.field45537, Class7287::method22999))
                     )
                     .method12320(
                        3,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, this.method35837(Blocks.field36889, "_3", Class9756.field45537, Class7287::method22999))
                     )
               )
         );
   }

   private void method35919() {
      ResourceLocation var3 = Class7287.method23041(Blocks.field36396);
      Class7287 var4 = new Class7287()
         .method22991(Class9588.field44829, var3)
         .method22993(Class9588.field44829, Class9588.field44827)
         .method22991(Class9588.field44830, Class7287.method23042(Blocks.field36395, "_top"))
         .method22991(Class9588.field44833, Class7287.method23042(Blocks.field36395, "_snow"));
      Class5138 var5 = Class5138.method15912()
         .method15911(Class6891.field29864, Class9756.field45542.method34806(Blocks.field36395, "_snow", var4, this.field43643));
      this.method35920(Blocks.field36395, Class9060.method33723(Blocks.field36395), var5);
      ResourceLocation var6 = Class7524.field32275
         .method25590(Blocks.MYCELIUM)
         .method24561(var1 -> var1.method22991(Class9588.field44829, var3))
         .method24562(Blocks.MYCELIUM, this.field43643);
      this.method35920(Blocks.MYCELIUM, var6, var5);
      ResourceLocation var7 = Class7524.field32275
         .method25590(Blocks.field36398)
         .method24561(var1 -> var1.method22991(Class9588.field44829, var3))
         .method24562(Blocks.field36398, this.field43643);
      this.method35920(Blocks.field36398, var7, var5);
   }

   private void method35920(Block var1, ResourceLocation var2, Class5138 var3) {
      List var6 = Arrays.<Class5138>asList(method35815(var2));
      this.field43642
         .accept(Class5148.method15941(var1).method15939(Class3629.<Boolean>method12310(Class8820.field39707).method12320(true, var3).method12319(false, var6)));
   }

   private void method35921() {
      this.method35807(Class8514.field37916);
      this.field43642
         .accept(
            Class5148.method15941(Blocks.COCOA)
               .method15939(
                  Class3629.<Integer>method12310(Class8820.field39739)
                     .method12320(0, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.COCOA, "_stage0")))
                     .method12320(1, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.COCOA, "_stage1")))
                     .method12320(2, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.COCOA, "_stage2")))
               )
               .method15939(method35811())
         );
   }

   private void method35922() {
      this.field43642.accept(method35814(Blocks.field36885, Class9060.method33723(Blocks.field36885)));
   }

   private void method35923(Block var1, Block var2) {
      Class7287 var5 = Class7287.method22997(var2);
      ResourceLocation var6 = Class9756.field45564.method34805(var1, var5, this.field43643);
      ResourceLocation var7 = Class9756.field45565.method34805(var1, var5, this.field43643);
      this.field43642.accept(Class5148.method15941(var1).method15939(method35881(Class8820.field39759, 1, var7, var6)));
   }

   private void method35924() {
      ResourceLocation var3 = Class9060.method33723(Blocks.field36723);
      ResourceLocation var4 = Class9060.method33722(Blocks.field36723, "_side");
      this.method35807(Class8514.field37545);
      this.field43642
         .accept(
            Class5148.method15941(Blocks.field36723)
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

   private void method35925(Block var1, Block var2) {
      ResourceLocation var5 = Class9060.method33723(var1);
      this.field43642.accept(Class5148.method15942(var2, Class5138.method15912().method15911(Class6891.field29864, var5)));
      this.method35805(var2, var5);
   }

   private void method35926() {
      ResourceLocation var3 = Class9060.method33722(Blocks.IRON_BARS, "_post_ends");
      ResourceLocation var4 = Class9060.method33722(Blocks.IRON_BARS, "_post");
      ResourceLocation var5 = Class9060.method33722(Blocks.IRON_BARS, "_cap");
      ResourceLocation var6 = Class9060.method33722(Blocks.IRON_BARS, "_cap_alt");
      ResourceLocation var7 = Class9060.method33722(Blocks.IRON_BARS, "_side");
      ResourceLocation var8 = Class9060.method33722(Blocks.IRON_BARS, "_side_alt");
      this.field43642
         .accept(
            Class5147.method15932(Blocks.IRON_BARS)
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
      this.method35808(Blocks.IRON_BARS);
   }

   private void method35927(Block var1) {
      this.field43642
         .accept(Class5148.method15942(var1, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33723(var1))).method15939(method35810()));
   }

   private void method35928() {
      ResourceLocation var3 = Class9060.method33723(Blocks.LEVER);
      ResourceLocation var4 = Class9060.method33722(Blocks.LEVER, "_on");
      this.method35808(Blocks.LEVER);
      this.field43642
         .accept(
            Class5148.method15941(Blocks.LEVER)
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
      this.method35808(Blocks.LILY_PAD);
      this.field43642.accept(method35814(Blocks.LILY_PAD, Class9060.method33723(Blocks.LILY_PAD)));
   }

   private void method35930() {
      this.field43642
         .accept(
            Class5148.method15941(Blocks.field36588)
               .method15939(
                  Class3629.<Class113>method12310(Class8820.field39712)
                     .method12320(
                        Class113.field413, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field36588, "_ns"))
                     )
                     .method12320(
                        Class113.field415, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.field36588, "_ew"))
                     )
               )
         );
   }

   private void method35931() {
      ResourceLocation var3 = Class7524.field32271.method25591(Blocks.NETHERRACK, this.field43643);
      this.field43642
         .accept(
            Class5148.method15943(
               Blocks.NETHERRACK,
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
      ResourceLocation var3 = Class9060.method33723(Blocks.field36895);
      ResourceLocation var4 = Class9060.method33722(Blocks.field36895, "_on");
      this.field43642.accept(Class5148.method15941(Blocks.field36895).method15939(method35817(Class8820.field39704, var4, var3)).method15939(method35813()));
   }

   private void method35933() {
      Class7287 var3 = new Class7287()
         .method22991(Class9588.field44829, Class7287.method23042(Blocks.PISTON, "_bottom"))
         .method22991(Class9588.field44833, Class7287.method23042(Blocks.PISTON, "_side"));
      ResourceLocation var4 = Class7287.method23042(Blocks.PISTON, "_top_sticky");
      ResourceLocation var5 = Class7287.method23042(Blocks.PISTON, "_top");
      Class7287 var6 = var3.method22995(Class9588.field44855, var4);
      Class7287 var7 = var3.method22995(Class9588.field44855, var5);
      ResourceLocation var8 = Class9060.method33722(Blocks.PISTON, "_base");
      this.method35934(Blocks.PISTON, var8, var7);
      this.method35934(Blocks.STICKY_PISTON, var8, var6);
      ResourceLocation var9 = Class9756.field45542.method34806(Blocks.PISTON, "_inventory", var3.method22995(Class9588.field44830, var5), this.field43643);
      ResourceLocation var10 = Class9756.field45542.method34806(Blocks.STICKY_PISTON, "_inventory", var3.method22995(Class9588.field44830, var4), this.field43643);
      this.method35805(Blocks.PISTON, var9);
      this.method35805(Blocks.STICKY_PISTON, var10);
   }

   private void method35934(Block var1, ResourceLocation var2, Class7287 var3) {
      ResourceLocation var6 = Class9756.field45614.method34805(var1, var3, this.field43643);
      this.field43642.accept(Class5148.method15941(var1).method15939(method35817(Class8820.field39688, var2, var6)).method15939(method35813()));
   }

   private void method35935() {
      Class7287 var3 = new Class7287()
         .method22991(Class9588.field44856, Class7287.method23042(Blocks.PISTON, "_top"))
         .method22991(Class9588.field44833, Class7287.method23042(Blocks.PISTON, "_side"));
      Class7287 var4 = var3.method22995(Class9588.field44855, Class7287.method23042(Blocks.PISTON, "_top_sticky"));
      Class7287 var5 = var3.method22995(Class9588.field44855, Class7287.method23042(Blocks.PISTON, "_top"));
      this.field43642
         .accept(
            Class5148.method15941(Blocks.PISTON_HEAD)
               .method15939(
                  Class3629.<Boolean, Class180>method12311(Class8820.field39705, Class8820.field39769)
                     .method12300(
                        false,
                        Class180.field638,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9756.field45615.method34806(Blocks.PISTON, "_head", var5, this.field43643))
                     )
                     .method12300(
                        false,
                        Class180.field639,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9756.field45615.method34806(Blocks.PISTON, "_head_sticky", var4, this.field43643))
                     )
                     .method12300(
                        true,
                        Class180.field638,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9756.field45616.method34806(Blocks.PISTON, "_head_short", var5, this.field43643))
                     )
                     .method12300(
                        true,
                        Class180.field639,
                        Class5138.method15912()
                           .method15911(
                              Class6891.field29864, Class9756.field45616.method34806(Blocks.PISTON, "_head_short_sticky", var4, this.field43643)
                           )
                     )
               )
               .method15939(method35813())
         );
   }

   private void method35936() {
      ResourceLocation var3 = Class9060.method33722(Blocks.field37053, "_stable");
      ResourceLocation var4 = Class9060.method33722(Blocks.field37053, "_unstable");
      this.method35805(Blocks.field37053, var3);
      this.field43642.accept(Class5148.method15941(Blocks.field37053).method15939(method35817(Class8820.field39683, var4, var3)));
   }

   private void method35937() {
      ResourceLocation var3 = Class7524.field32271.method25591(Blocks.field36653, this.field43643);
      ResourceLocation var4 = this.method35837(Blocks.field36653, "_on", Class9756.field45537, Class7287::method22999);
      this.field43642.accept(Class5148.method15941(Blocks.field36653).method15939(method35817(Class8820.field39699, var4, var3)));
   }

   private void method35938(Block var1, Block var2) {
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
      Class7287 var3 = Class7287.method23027(Blocks.field36568);
      Class7287 var4 = Class7287.method23028(Class7287.method23042(Blocks.field36568, "_off"));
      ResourceLocation var5 = Class9756.field45612.method34805(Blocks.field36568, var3, this.field43643);
      ResourceLocation var6 = Class9756.field45612.method34806(Blocks.field36568, "_off", var4, this.field43643);
      this.field43642.accept(Class5148.method15941(Blocks.field36568).method15939(method35817(Class8820.field39699, var5, var6)));
      ResourceLocation var7 = Class9756.field45613.method34805(Blocks.field36569, var3, this.field43643);
      ResourceLocation var8 = Class9756.field45613.method34806(Blocks.field36569, "_off", var4, this.field43643);
      this.field43642.accept(Class5148.method15941(Blocks.field36569).method15939(method35817(Class8820.field39699, var7, var8)).method15939(method35812()));
      this.method35808(Blocks.field36568);
      this.method35804(Blocks.field36569);
   }

   private void method35940() {
      this.method35807(Class8514.field37788);
      this.field43642
         .accept(
            Class5148.method15941(Blocks.field36592)
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

                        return Class5138.method15912().method15911(Class6891.field29864, Class7287.method23042(Blocks.field36592, var5.toString()));
                     })
               )
               .method15939(method35811())
         );
   }

   private void method35941() {
      this.method35807(Class8514.field37315);
      this.field43642
         .accept(
            Class5148.method15941(Blocks.field37005)
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
      Class7287 var3 = Class7287.method22996(Blocks.SNOW);
      ResourceLocation var4 = Class9756.field45537.method34805(Blocks.SNOW_BLOCK, var3, this.field43643);
      this.field43642
         .accept(
            Class5148.method15941(Blocks.SNOW)
               .method15939(
                  Class3629.<Integer>method12310(Class8820.field39750)
                     .method12321(
                        var1 -> Class5138.method15912()
                              .method15911(Class6891.field29864, var1 >= 8 ? var4 : Class9060.method33722(Blocks.SNOW, "_height" + var1 * 2))
                     )
               )
         );
      this.method35805(Blocks.SNOW, Class9060.method33722(Blocks.SNOW, "_height2"));
      this.field43642.accept(method35829(Blocks.SNOW_BLOCK, var4));
   }

   private void method35943() {
      this.field43642
         .accept(
            Class5148.method15942(Blocks.field37063, Class5138.method15912().method15911(Class6891.field29864, Class9060.method33723(Blocks.field37063)))
               .method15939(method35810())
         );
   }

   private void method35944() {
      ResourceLocation var3 = Class7524.field32271.method25591(Blocks.field37113, this.field43643);
      this.method35805(Blocks.field37113, var3);
      this.field43642
         .accept(
            Class5148.method15941(Blocks.field37113)
               .method15939(
                  Class3629.<Class104>method12310(Class8820.field39772)
                     .method12321(
                        var1 -> Class5138.method15912()
                              .method15911(
                                 Class6891.field29864,
                                 this.method35837(Blocks.field37113, "_" + var1.method257(), Class9756.field45537, Class7287::method22999)
                              )
                     )
               )
         );
   }

   private void method35945() {
      this.method35807(Class8514.field38170);
      this.field43642
         .accept(
            Class5148.method15941(Blocks.field37069)
               .method15939(
                  Class3629.<Integer>method12310(Class8820.field39740)
                     .method12321(
                        var1 -> Class5138.method15912()
                              .method15911(
                                 Class6891.field29864, this.method35837(Blocks.field37069, "_stage" + var1, Class9756.field45579, Class7287::method23001)
                              )
                     )
               )
         );
   }

   private void method35946() {
      this.method35807(Class8514.field37838);
      this.field43642
         .accept(
            Class5148.method15941(Blocks.TRIPWIRE)
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
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_ns"))
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        false,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_n"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_n"))
                     )
                     .method12318(
                        false,
                        false,
                        false,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_n"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        false,
                        false,
                        false,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_n"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_ne"))
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_ne"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        false,
                        false,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_ne"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_ne"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_ns"))
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_ns"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_nse"))
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_nse"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_nse"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_nse"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        true,
                        true,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_nsew"))
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_ns"))
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_n"))
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_n"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        false,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_n"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_n"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_ne"))
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_ne"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_ne"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_ne"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_ns"))
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_ns"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_nse"))
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_nse"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_nse"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_nse"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        true,
                        true,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.TRIPWIRE, "_attached_nsew"))
                     )
               )
         );
   }

   private void method35947() {
      this.method35808(Blocks.TRIPWIRE_HOOK);
      this.field43642
         .accept(
            Class5148.method15941(Blocks.TRIPWIRE_HOOK)
               .method15939(
                  Class3629.<Boolean, Boolean>method12311(Class8820.field39682, Class8820.field39704)
                     .method12301(
                        (var0, var1) -> Class5138.method15912()
                              .method15911(Class6891.field29864, Class7287.method23042(Blocks.TRIPWIRE_HOOK, (!var0 ? "" : "_attached") + (!var1 ? "" : "_on")))
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
            return this.method35948(var1, "", Class7287.method22999(Class7287.method23041(Blocks.field36964)));
         case 1:
            return this.method35948(var1, "slightly_cracked_", Class7287.method22999(Class7287.method23042(Blocks.field36964, "_slightly_cracked")));
         case 2:
            return this.method35948(var1, "very_cracked_", Class7287.method22999(Class7287.method23042(Blocks.field36964, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void method35950() {
      this.method35807(Class8514.field37718);
      this.field43642
         .accept(
            Class5148.method15941(Blocks.field36964)
               .method15939(
                  Class3629.<Integer, Integer>method12311(Class8820.field39748, Class8820.field39749)
                     .method12302((var1, var2) -> Arrays.<Class5138>asList(method35815(this.method35949(var1, var2))))
               )
         );
   }

   private void method35951() {
      this.method35808(Blocks.VINE);
      this.field43642
         .accept(
            Class5148.method15941(Blocks.VINE)
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
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_1"))
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_1"))
                     )
                     .method12318(
                        false,
                        false,
                        false,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_1"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        false,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_1"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        false,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_1"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_2"))
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        false,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_2"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_2"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_2"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        false,
                        true,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_2_opposite"))
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        false,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_2_opposite"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        false,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_3"))
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_3"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_3"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        false,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_3"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        false,
                        true,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_4"))
                     )
                     .method12318(
                        false,
                        false,
                        false,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_u"))
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_1u"))
                     )
                     .method12318(
                        false,
                        false,
                        false,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_1u"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_1u"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_1u"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_2u"))
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_2u"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        false,
                        true,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_2u"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        false,
                        true,
                        false,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_2u"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        false,
                        false,
                        true,
                        true,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_2u_opposite"))
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        true,
                        false,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_2u_opposite"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        true,
                        false,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_3u"))
                     )
                     .method12318(
                        true,
                        false,
                        true,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_3u"))
                           .method15911(Class6891.field29863, Class2120.field13817)
                     )
                     .method12318(
                        false,
                        true,
                        true,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_3u"))
                           .method15911(Class6891.field29863, Class2120.field13818)
                     )
                     .method12318(
                        true,
                        true,
                        false,
                        true,
                        true,
                        Class5138.method15912()
                           .method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_3u"))
                           .method15911(Class6891.field29863, Class2120.field13819)
                     )
                     .method12318(
                        true,
                        true,
                        true,
                        true,
                        true,
                        Class5138.method15912().method15911(Class6891.field29864, Class9060.method33722(Blocks.VINE, "_4u"))
                     )
               )
         );
   }

   private void method35952() {
      this.field43642
         .accept(
            method35829(
               Blocks.field36890,
               Class9756.field45537.method34805(Blocks.field36890, Class7287.method22999(Class9060.method33720("magma")), this.field43643)
            )
         );
   }

   private void method35953(Block var1) {
      this.method35841(var1, Class7524.field32282);
      Class9756.field45626.method34808(Class9060.method33724(var1.method11581()), Class7287.method23022(var1), this.field43643);
   }

   private void method35954(Block var1, Block var2, Class1958 var3) {
      this.method35855(var1, var3);
      this.method35855(var2, var3);
   }

   private void method35955(Block var1, Block var2) {
      Class9756.field45627.method34808(Class9060.method33724(var1.method11581()), Class7287.method23022(var2), this.field43643);
   }

   private void method35956() {
      ResourceLocation var3 = Class9060.method33723(Blocks.STONE);
      ResourceLocation var4 = Class9060.method33722(Blocks.STONE, "_mirrored");
      this.field43642.accept(method35816(Blocks.field36619, var3, var4));
      this.method35805(Blocks.field36619, var3);
   }

   private void method35957(Block var1, Block var2) {
      this.method35853(var1, Class1958.field12763);
      Class7287 var5 = Class7287.method23003(Class7287.method23042(var1, "_pot"));
      ResourceLocation var6 = Class1958.field12763.method8224().method34805(var2, var5, this.field43643);
      this.field43642.accept(method35829(var2, var6));
   }

   private void method35958() {
      ResourceLocation var3 = Class7287.method23042(Blocks.field37124, "_bottom");
      ResourceLocation var4 = Class7287.method23042(Blocks.field37124, "_top_off");
      ResourceLocation var5 = Class7287.method23042(Blocks.field37124, "_top");
      ResourceLocation[] var6 = new ResourceLocation[5];

      for (int var7 = 0; var7 < 5; var7++) {
         Class7287 var8 = new Class7287()
            .method22991(Class9588.field44829, var3)
            .method22991(Class9588.field44830, var7 != 0 ? var5 : var4)
            .method22991(Class9588.field44833, Class7287.method23042(Blocks.field37124, "_side" + var7));
         var6[var7] = Class9756.field45542.method34806(Blocks.field37124, "_" + var7, var8, this.field43643);
      }

      this.field43642
         .accept(
            Class5148.method15941(Blocks.field37124)
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
      ResourceLocation var3 = Class7287.method23042(Blocks.field37114, "_top");
      ResourceLocation var4 = Class7287.method23042(Blocks.field37114, "_bottom");
      ResourceLocation var5 = Class7287.method23042(Blocks.field37114, "_side");
      ResourceLocation var6 = Class7287.method23042(Blocks.field37114, "_lock");
      Class7287 var7 = new Class7287()
         .method22991(Class9588.field44839, var5)
         .method22991(Class9588.field44837, var5)
         .method22991(Class9588.field44836, var5)
         .method22991(Class9588.field44827, var3)
         .method22991(Class9588.field44834, var3)
         .method22991(Class9588.field44835, var4)
         .method22991(Class9588.field44838, var6);
      ResourceLocation var8 = Class9756.field45536.method34805(Blocks.field37114, var7, this.field43643);
      this.field43642
         .accept(
            Class5148.method15942(Blocks.field37114, Class5138.method15912().method15911(Class6891.field29864, var8))
               .method15939(Class3629.<Class182>method12310(Class8820.field39723).method12321(var1 -> this.method35959(var1, Class5138.method15912())))
         );
   }

   public void method35961() {
      this.method35851(Blocks.AIR);
      this.method35852(Blocks.field37012, Blocks.AIR);
      this.method35852(Blocks.field37011, Blocks.AIR);
      this.method35851(Blocks.BEACON);
      this.method35851(Blocks.CACTUS);
      this.method35852(Blocks.field37013, Blocks.WATER);
      this.method35851(Blocks.field36652);
      this.method35851(Blocks.field36963);
      this.method35851(Blocks.ENCHANTING_TABLE);
      this.method35851(Blocks.FLOWER_POT);
      this.method35807(Class8514.field38051);
      this.method35851(Blocks.field37119);
      this.method35851(Blocks.WATER);
      this.method35851(Blocks.LAVA);
      this.method35851(Blocks.field36764);
      this.method35807(Class8514.field37470);
      this.method35851(Blocks.field37010);
      this.method35851(Blocks.field36692);
      this.method35869(Blocks.field36765, Class8514.field37569);
      this.method35807(Class8514.field37569);
      this.method35869(Blocks.field36894, Class8514.field37651);
      this.method35807(Class8514.field37651);
      this.method35870(Blocks.MOVING_PISTON, Class7287.method23042(Blocks.PISTON, "_side"));
      this.method35841(Blocks.field36420, Class7524.field32271);
      this.method35841(Blocks.field36795, Class7524.field32271);
      this.method35841(Blocks.field36536, Class7524.field32271);
      this.method35841(Blocks.field36537, Class7524.field32271);
      this.method35841(Blocks.EMERALD_ORE, Class7524.field32271);
      this.method35841(Blocks.EMERALD_BLOCK, Class7524.field32271);
      this.method35841(Blocks.field36418, Class7524.field32271);
      this.method35841(Blocks.field36421, Class7524.field32271);
      this.method35841(Blocks.field36521, Class7524.field32271);
      this.method35841(Blocks.field36419, Class7524.field32271);
      this.method35841(Blocks.field36522, Class7524.field32271);
      this.method35841(Blocks.field37122, Class7524.field32273);
      this.method35841(Blocks.field37121, Class7524.field32271);
      this.method35841(Blocks.field36455, Class7524.field32271);
      this.method35841(Blocks.field36456, Class7524.field32271);
      this.method35841(Blocks.field36722, Class7524.field32271);
      this.method35841(Blocks.field36567, Class7524.field32271);
      this.method35841(Blocks.field36721, Class7524.field32271);
      this.method35841(Blocks.field37141, Class7524.field32271);
      this.method35841(Blocks.field37006, Class7524.field32271);
      this.method35841(Blocks.field37147, Class7524.field32271);
      this.method35841(Blocks.CLAY, Class7524.field32271);
      this.method35841(Blocks.field36397, Class7524.field32271);
      this.method35841(Blocks.field37148, Class7524.field32271);
      this.method35841(Blocks.field36617, Class7524.field32271);
      this.method35841(Blocks.field37123, Class7524.field32271);
      this.method35841(Blocks.field36651, Class7524.field32271);
      this.method35841(Blocks.field36587, Class7524.field32271);
      this.method35841(Blocks.GRAVEL, Class7524.field32271);
      this.method35841(Blocks.field37120, Class7524.field32271);
      this.method35841(Blocks.ICE, Class7524.field32271);
      this.method35841(Blocks.JUKEBOX, Class7524.field32276);
      this.method35841(Blocks.field37129, Class7524.field32273);
      this.method35841(Blocks.MELON, Class7524.field32273);
      this.method35841(Blocks.field36891, Class7524.field32271);
      this.method35841(Blocks.NOTE_BLOCK, Class7524.field32271);
      this.method35841(Blocks.PACKED_ICE, Class7524.field32271);
      this.method35841(Blocks.field36527, Class7524.field32271);
      this.method35841(Blocks.field37149, Class7524.field32271);
      this.method35841(Blocks.field36776, Class7524.field32271);
      this.method35841(Blocks.field37085, Class7524.field32271);
      this.method35841(Blocks.SOUL_SAND, Class7524.field32271);
      this.method35841(Blocks.SOUL_SOIL, Class7524.field32271);
      this.method35841(Blocks.field36532, Class7524.field32271);
      this.method35841(Blocks.field36452, Class7524.field32271);
      this.method35841(Blocks.SEAGRASS, Class7524.field32287);
      this.method35807(Class8514.field37314);
      this.method35841(Blocks.TNT, Class7524.field32275);
      this.method35841(Blocks.field37116, Class7524.field32273);
      this.method35841(Blocks.field37076, Class7524.field32271);
      this.method35841(Blocks.field36453, Class7524.field32271);
      this.method35841(Blocks.field37136, Class7524.field32271);
      this.method35841(
         Blocks.field36725, Class7524.field32273.method25593(var0 -> var0.method22991(Class9588.field44833, Class7287.method23041(Blocks.field36725)))
      );
      this.method35841(Blocks.field36618, Class7524.field32271);
      this.method35901(Blocks.CHISELED_SANDSTONE, Blocks.SANDSTONE);
      this.method35901(Blocks.field36836, Blocks.field36835);
      this.method35841(Blocks.field37137, Class7524.field32271);
      this.method35923(Blocks.field36717, Blocks.field36521);
      this.method35923(Blocks.field36718, Blocks.field36522);
      this.method35888();
      this.method35892();
      this.method35894();
      this.method35887(Blocks.field37067, Blocks.field37068);
      this.method35895();
      this.method35900();
      this.method35902();
      this.method35905();
      this.method35906();
      this.method35908();
      this.method35904();
      this.method35909(Blocks.field36877);
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
      this.method35927(Blocks.LADDER);
      this.method35808(Blocks.LADDER);
      this.method35927(Blocks.field37061);
      this.method35938(Blocks.TORCH, Blocks.WALL_TORCH);
      this.method35938(Blocks.field36585, Blocks.field36586);
      this.method35897(Blocks.CRAFTING_TABLE, Blocks.field36400, Class7287::method23035);
      this.method35897(Blocks.field37059, Blocks.field36402, Class7287::method23036);
      this.method35907(Blocks.field37083);
      this.method35907(Blocks.field37074);
      this.method35903(Blocks.DISPENSER);
      this.method35903(Blocks.DROPPER);
      this.method35917(Blocks.field37065);
      this.method35917(Blocks.field37066);
      this.method35832(Blocks.CHAIN, Class9060.method33723(Blocks.CHAIN));
      this.method35833(Blocks.BASALT, Class7524.field32273);
      this.method35833(Blocks.POLISHED_BASALT, Class7524.field32273);
      this.method35833(Blocks.field36893, Class7524.field32273);
      this.method35819(Blocks.field36396);
      this.method35819(Blocks.SAND);
      this.method35819(Blocks.RED_SAND);
      this.method35818(Blocks.BEDROCK);
      this.method35836(Blocks.field36777, Class7524.field32273, Class7524.field32274);
      this.method35836(Blocks.field36881, Class7524.field32288, Class7524.field32289);
      this.method35836(Blocks.field36726, Class7524.field32288, Class7524.field32289);
      this.method35834(Blocks.field37054, Class7524.field32278);
      this.method35898();
      this.method35882(Blocks.field37117, Class7287::method23031);
      this.method35882(Blocks.field37118, Class7287::method23033);
      this.method35883(Blocks.field36884, Class8820.field39740, 0, 1, 2, 3);
      this.method35883(Blocks.field36693, Class8820.field39742, 0, 0, 1, 1, 2, 2, 2, 3);
      this.method35883(Blocks.NETHER_WART, Class8820.field39740, 0, 1, 1, 2);
      this.method35883(Blocks.field36694, Class8820.field39742, 0, 0, 1, 1, 2, 2, 2, 3);
      this.method35883(Blocks.field36539, Class8820.field39742, 0, 1, 2, 3, 4, 5, 6, 7);
      this.method35867(Class9060.method33720("banner"), Blocks.field36400)
         .method26608(
            Class9756.field45628,
            Blocks.field36803,
            Blocks.field36804,
            Blocks.field36805,
            Blocks.field36806,
            Blocks.field36807,
            Blocks.field36808,
            Blocks.field36809,
            Blocks.field36810,
            Blocks.field36811,
            Blocks.field36812,
            Blocks.field36813,
            Blocks.field36814,
            Blocks.field36815,
            Blocks.field36816,
            Blocks.field36817,
            Blocks.field36818
         )
         .method26607(
            Blocks.field36819,
            Blocks.field36820,
            Blocks.field36821,
            Blocks.field36822,
            Blocks.field36823,
            Blocks.field36824,
            Blocks.field36825,
            Blocks.field36826,
            Blocks.field36827,
            Blocks.field36828,
            Blocks.field36829,
            Blocks.field36830,
            Blocks.field36831,
            Blocks.field36832,
            Blocks.field36833,
            Blocks.field36834
         );
      this.method35867(Class9060.method33720("bed"), Blocks.field36400)
         .method26607(
            Blocks.WHITE_BED,
            Blocks.ORANGE_BED,
            Blocks.MAGENTA_BED,
            Blocks.LIGHT_BLUE_BED,
            Blocks.YELLOW_BED,
            Blocks.LIME_BED,
            Blocks.PINK_BED,
            Blocks.GRAY_BED,
            Blocks.LIGHT_GRAY_BED,
            Blocks.CYAN_BED,
            Blocks.PURPLE_BED,
            Blocks.BLUE_BED,
            Blocks.BROWN_RED,
            Blocks.GREEN_BED,
            Blocks.RED_BED,
            Blocks.BLACK_BED
         );
      this.method35955(Blocks.WHITE_BED, Blocks.WHITE_WOOL);
      this.method35955(Blocks.ORANGE_BED, Blocks.ORANGE_WOOL);
      this.method35955(Blocks.MAGENTA_BED, Blocks.MAGENTA_WOOL);
      this.method35955(Blocks.LIGHT_BLUE_BED, Blocks.LIGHT_BLUE_WOOL);
      this.method35955(Blocks.YELLOW_BED, Blocks.YELLOW_WOOL);
      this.method35955(Blocks.LIME_BED, Blocks.LIME_WOOL);
      this.method35955(Blocks.PINK_BED, Blocks.PINK_WOOL);
      this.method35955(Blocks.GRAY_BED, Blocks.GRAY_WOOL);
      this.method35955(Blocks.LIGHT_GRAY_BED, Blocks.LIGHT_GRAY_WOOL);
      this.method35955(Blocks.CYAN_BED, Blocks.CYAN_WOOL);
      this.method35955(Blocks.PURPLE_BED, Blocks.PURPLE_WOOL);
      this.method35955(Blocks.BLUE_BED, Blocks.BLUE_WOOL);
      this.method35955(Blocks.BROWN_RED, Blocks.BROWN_WOOL);
      this.method35955(Blocks.GREEN_BED, Blocks.GREEN_WOOL);
      this.method35955(Blocks.RED_BED, Blocks.RED_WOOL);
      this.method35955(Blocks.BLACK_BED, Blocks.BLACK_WOOL);
      this.method35867(Class9060.method33720("skull"), Blocks.SOUL_SAND)
         .method26608(Class9756.field45629, Blocks.field36709, Blocks.field36707, Blocks.field36705, Blocks.field36701, Blocks.field36703)
         .method26606(Blocks.field36711)
         .method26607(Blocks.field36710, Blocks.field36712, Blocks.field36708, Blocks.field36706, Blocks.field36702, Blocks.field36704);
      this.method35953(Blocks.field36896);
      this.method35953(Blocks.field36897);
      this.method35953(Blocks.field36898);
      this.method35953(Blocks.field36899);
      this.method35953(Blocks.field36900);
      this.method35953(Blocks.field36901);
      this.method35953(Blocks.field36902);
      this.method35953(Blocks.field36903);
      this.method35953(Blocks.field36904);
      this.method35953(Blocks.field36905);
      this.method35953(Blocks.field36906);
      this.method35953(Blocks.field36907);
      this.method35953(Blocks.field36908);
      this.method35953(Blocks.field36909);
      this.method35953(Blocks.field36910);
      this.method35953(Blocks.field36911);
      this.method35953(Blocks.field36912);
      this.method35841(Blocks.field37007, Class7524.field32282);
      this.method35804(Blocks.field37007);
      this.method35867(Class9060.method33720("chest"), Blocks.field36400).method26607(Blocks.CHEST, Blocks.TRAPPED_CHEST);
      this.method35867(Class9060.method33720("ender_chest"), Blocks.field36527).method26607(Blocks.ENDER_CHEST);
      this.method35868(Blocks.field36649, Blocks.field36527).method26606(Blocks.field36649, Blocks.field36886);
      this.method35840(Blocks.field36929);
      this.method35840(Blocks.field36930);
      this.method35840(Blocks.field36931);
      this.method35840(Blocks.field36932);
      this.method35840(Blocks.field36933);
      this.method35840(Blocks.field36934);
      this.method35840(Blocks.field36935);
      this.method35840(Blocks.field36936);
      this.method35840(Blocks.field36937);
      this.method35840(Blocks.field36938);
      this.method35840(Blocks.field36939);
      this.method35840(Blocks.field36940);
      this.method35840(Blocks.field36941);
      this.method35840(Blocks.field36942);
      this.method35840(Blocks.field36943);
      this.method35840(Blocks.field36944);
      this.method35872(
         Class7524.field32271,
         Blocks.field36945,
         Blocks.field36946,
         Blocks.field36947,
         Blocks.field36948,
         Blocks.field36949,
         Blocks.field36950,
         Blocks.field36951,
         Blocks.field36952,
         Blocks.field36953,
         Blocks.field36954,
         Blocks.field36955,
         Blocks.field36956,
         Blocks.field36957,
         Blocks.field36958,
         Blocks.field36959,
         Blocks.field36960
      );
      this.method35840(Blocks.field36794);
      this.method35840(Blocks.field36730);
      this.method35840(Blocks.field36731);
      this.method35840(Blocks.field36732);
      this.method35840(Blocks.field36733);
      this.method35840(Blocks.field36734);
      this.method35840(Blocks.field36735);
      this.method35840(Blocks.field36736);
      this.method35840(Blocks.field36737);
      this.method35840(Blocks.field36738);
      this.method35840(Blocks.field36739);
      this.method35840(Blocks.field36740);
      this.method35840(Blocks.field36741);
      this.method35840(Blocks.field36742);
      this.method35840(Blocks.field36743);
      this.method35840(Blocks.field36744);
      this.method35840(Blocks.field36745);
      this.method35874(Blocks.field36454, Blocks.GLASS_PANE);
      this.method35874(Blocks.field36593, Blocks.field36746);
      this.method35874(Blocks.field36594, Blocks.field36747);
      this.method35874(Blocks.field36595, Blocks.field36748);
      this.method35874(Blocks.field36596, Blocks.field36749);
      this.method35874(Blocks.field36597, Blocks.field36750);
      this.method35874(Blocks.field36598, Blocks.field36751);
      this.method35874(Blocks.field36599, Blocks.field36752);
      this.method35874(Blocks.field36600, Blocks.field36753);
      this.method35874(Blocks.field36601, Blocks.field36754);
      this.method35874(Blocks.field36602, Blocks.field36755);
      this.method35874(Blocks.field36603, Blocks.field36756);
      this.method35874(Blocks.field36604, Blocks.field36757);
      this.method35874(Blocks.field36605, Blocks.field36758);
      this.method35874(Blocks.field36606, Blocks.field36759);
      this.method35874(Blocks.field36607, Blocks.field36760);
      this.method35874(Blocks.field36608, Blocks.field36761);
      this.method35873(
         Class7524.field32280,
         Blocks.field36913,
         Blocks.field36914,
         Blocks.field36915,
         Blocks.field36916,
         Blocks.field36917,
         Blocks.field36918,
         Blocks.field36919,
         Blocks.field36920,
         Blocks.field36921,
         Blocks.field36922,
         Blocks.field36923,
         Blocks.field36924,
         Blocks.field36925,
         Blocks.field36926,
         Blocks.field36927,
         Blocks.field36928
      );
      this.method35871(Blocks.WHITE_WOOL, Blocks.WHITE_CARPET);
      this.method35871(Blocks.ORANGE_WOOL, Blocks.ORANGE_CARPET);
      this.method35871(Blocks.MAGENTA_WOOL, Blocks.MAGENTA_CARPET);
      this.method35871(Blocks.LIGHT_BLUE_WOOL, Blocks.LIGHT_BLUE_CARPET);
      this.method35871(Blocks.YELLOW_WOOL, Blocks.YELLOW_CARPET);
      this.method35871(Blocks.LIME_WOOL, Blocks.LIME_CARPET);
      this.method35871(Blocks.PINK_WOOL, Blocks.PINK_CARPET);
      this.method35871(Blocks.GRAY_WOOL, Blocks.GRAY_CARPET);
      this.method35871(Blocks.LIGHT_GRAY_WOOL, Blocks.LIGHT_GRAY_CARPET);
      this.method35871(Blocks.CYAN_WOOL, Blocks.CYAN_CARPET);
      this.method35871(Blocks.PURPLE_WOOL, Blocks.PURPLE_CARPET);
      this.method35871(Blocks.BLUE_WOOL, Blocks.BLUE_CARPET);
      this.method35871(Blocks.BROWN_WOOL, Blocks.BROWN_CARPET);
      this.method35871(Blocks.GREEN_WOOL, Blocks.GREEN_CARPET);
      this.method35871(Blocks.RED_WOOL, Blocks.RED_CARPET);
      this.method35871(Blocks.BLACK_WOOL, Blocks.BLACK_CARPET);
      this.method35857(Blocks.FERN, Blocks.field36675, Class1958.field12762);
      this.method35857(Blocks.DANDELION, Blocks.field36676, Class1958.field12763);
      this.method35857(Blocks.POPPY, Blocks.field36677, Class1958.field12763);
      this.method35857(Blocks.BLUE_ORCHID, Blocks.field36678, Class1958.field12763);
      this.method35857(Blocks.ALLIUM, Blocks.field36679, Class1958.field12763);
      this.method35857(Blocks.AZURE_BLUET, Blocks.field36680, Class1958.field12763);
      this.method35857(Blocks.RED_TULIP, Blocks.field36681, Class1958.field12763);
      this.method35857(Blocks.ORANGE_TULIP, Blocks.field36682, Class1958.field12763);
      this.method35857(Blocks.WHITE_TULIP, Blocks.field36683, Class1958.field12763);
      this.method35857(Blocks.PINK_TULIP, Blocks.field36684, Class1958.field12763);
      this.method35857(Blocks.OXEYE_DAISY, Blocks.field36685, Class1958.field12763);
      this.method35857(Blocks.CORNFLOWER, Blocks.field36686, Class1958.field12763);
      this.method35857(Blocks.LILY_OF_THE_VALLEY, Blocks.field36687, Class1958.field12763);
      this.method35857(Blocks.WITHER_ROSE, Blocks.field36688, Class1958.field12763);
      this.method35857(Blocks.RED_MUSHROOM, Blocks.field36689, Class1958.field12763);
      this.method35857(Blocks.BROWN_MUSHROOM, Blocks.field36690, Class1958.field12763);
      this.method35857(Blocks.DEAD_BUSH, Blocks.field36691, Class1958.field12763);
      this.method35893(Blocks.BROWN_MUSHROOM_BLOCK);
      this.method35893(Blocks.RED_MUSHROOM_BLOCK);
      this.method35893(Blocks.MUSHROOM_STEM);
      this.method35853(Blocks.GRASS, Class1958.field12762);
      this.method35855(Blocks.SUGAR_CANE, Class1958.field12762);
      this.method35807(Class8514.field37355);
      this.method35954(Blocks.field36961, Blocks.field36962, Class1958.field12762);
      this.method35807(Class8514.field37356);
      this.method35804(Blocks.field36962);
      this.method35954(Blocks.field37086, Blocks.field37087, Class1958.field12763);
      this.method35954(Blocks.field37088, Blocks.field37089, Class1958.field12763);
      this.method35809(Blocks.field37086, "_plant");
      this.method35804(Blocks.field37087);
      this.method35809(Blocks.field37088, "_plant");
      this.method35804(Blocks.field37089);
      this.method35854(Blocks.field37008, Class1958.field12762, Class7287.method23001(Class7287.method23042(Blocks.field37009, "_stage0")));
      this.method35878();
      this.method35853(Blocks.COBWEB, Class1958.field12763);
      this.method35861(Blocks.LILAC, Class1958.field12763);
      this.method35861(Blocks.ROSE_BUSH, Class1958.field12763);
      this.method35861(Blocks.field36800, Class1958.field12763);
      this.method35861(Blocks.TALL_GRASS, Class1958.field12762);
      this.method35861(Blocks.field36802, Class1958.field12762);
      this.method35862();
      this.method35863();
      this.method35860(
         Blocks.field36980,
         Blocks.field36975,
         Blocks.field36970,
         Blocks.field36965,
         Blocks.field36990,
         Blocks.field36985,
         Blocks.field37000,
         Blocks.field36995
      );
      this.method35860(
         Blocks.field36981,
         Blocks.field36976,
         Blocks.field36971,
         Blocks.field36966,
         Blocks.field36991,
         Blocks.field36986,
         Blocks.field37001,
         Blocks.field36996
      );
      this.method35860(
         Blocks.field36982,
         Blocks.field36977,
         Blocks.field36972,
         Blocks.field36967,
         Blocks.field36992,
         Blocks.field36987,
         Blocks.field37002,
         Blocks.field36997
      );
      this.method35860(
         Blocks.field36983,
         Blocks.field36978,
         Blocks.field36973,
         Blocks.field36968,
         Blocks.field36993,
         Blocks.field36988,
         Blocks.field37003,
         Blocks.field36998
      );
      this.method35860(
         Blocks.field36984,
         Blocks.field36979,
         Blocks.field36974,
         Blocks.field36969,
         Blocks.field36994,
         Blocks.field36989,
         Blocks.field37004,
         Blocks.field36999
      );
      this.method35859(Blocks.MELON_STEM, Blocks.ATTACHED_MELON_STEM);
      this.method35859(Blocks.PUMPKIN_STEM, Blocks.ATTACHED_PUMPKIN_STEM);
      this.method35845(Blocks.field36404)
         .method31167(Blocks.field36699)
         .method31169(Blocks.field36870)
         .method31170(Blocks.field36865)
         .method31171(Blocks.field36565)
         .method31172(Blocks.ACACIA_SIGN, Blocks.ACACIA_WALL_SIGN)
         .method31173(Blocks.field36843)
         .method31174(Blocks.field36762);
      this.method35847(Blocks.field36875);
      this.method35848(Blocks.ACACIA_TRAPDOOR);
      this.method35850(Blocks.field36426).method36613(Blocks.field36426).method36611(Blocks.field36438);
      this.method35850(Blocks.field36431).method36613(Blocks.field36431).method36611(Blocks.field36444);
      this.method35857(Blocks.ACACIA_SAPLING, Blocks.field36673, Class1958.field12763);
      this.method35841(Blocks.field36450, Class7524.field32284);
      this.method35845(Blocks.field36402)
         .method31167(Blocks.field36697)
         .method31169(Blocks.field36868)
         .method31170(Blocks.field36863)
         .method31171(Blocks.field36563)
         .method31172(Blocks.BIRCH_SIGN, Blocks.BIRCH_WALL_SIGN)
         .method31173(Blocks.field36841)
         .method31174(Blocks.field36662);
      this.method35847(Blocks.field36873);
      this.method35848(Blocks.field36611);
      this.method35850(Blocks.field36424).method36613(Blocks.field36424).method36611(Blocks.field36436);
      this.method35850(Blocks.field36429).method36613(Blocks.field36429).method36611(Blocks.field36442);
      this.method35857(Blocks.BIRCH_SAPLING, Blocks.POTTED_BIRCH_SAPLING, Class1958.field12763);
      this.method35841(Blocks.field36448, Class7524.field32284);
      this.method35845(Blocks.field36400)
         .method31167(Blocks.field36695)
         .method31169(Blocks.OAK_FENCE)
         .method31170(Blocks.OAK_FENCE_GATE)
         .method31171(Blocks.field36561)
         .method31172(Blocks.OAK_SIGN, Blocks.OAK_WALL_SIGN)
         .method31173(Blocks.field36839)
         .method31173(Blocks.field36849)
         .method31174(Blocks.field36533);
      this.method35847(Blocks.OAK_DOOR);
      this.method35849(Blocks.field36609);
      this.method35850(Blocks.field36422).method36613(Blocks.field36422).method36611(Blocks.field36434);
      this.method35850(Blocks.field36433).method36613(Blocks.field36433).method36611(Blocks.field36440);
      this.method35857(Blocks.field36406, Blocks.POTTED_OAK_SAPLING, Class1958.field12763);
      this.method35841(Blocks.field36446, Class7524.field32284);
      this.method35845(Blocks.field36401)
         .method31167(Blocks.field36696)
         .method31169(Blocks.field36867)
         .method31170(Blocks.field36862)
         .method31171(Blocks.field36562)
         .method31172(Blocks.SPRUCE_SIGN, Blocks.SPRUCE_WALL_SIGN)
         .method31173(Blocks.field36840)
         .method31174(Blocks.SPRUCE_STAIRS);
      this.method35847(Blocks.field36872);
      this.method35848(Blocks.field36610);
      this.method35850(Blocks.field36423).method36613(Blocks.field36423).method36611(Blocks.field36435);
      this.method35850(Blocks.field36428).method36613(Blocks.field36428).method36611(Blocks.field36441);
      this.method35857(Blocks.SPRUCE_SAPLING, Blocks.POTTED_SPRUCE_SAPLING, Class1958.field12763);
      this.method35841(Blocks.field36447, Class7524.field32284);
      this.method35845(Blocks.field36405)
         .method31167(Blocks.field36700)
         .method31169(Blocks.field36871)
         .method31170(Blocks.field36866)
         .method31171(Blocks.field36566)
         .method31172(Blocks.DARK_OAK_SIGN, Blocks.DARK_OAK_WALL_SIGN)
         .method31173(Blocks.field36844)
         .method31174(Blocks.field36763);
      this.method35847(Blocks.field36876);
      this.method35849(Blocks.field36614);
      this.method35850(Blocks.field36427).method36613(Blocks.field36427).method36611(Blocks.field36439);
      this.method35850(Blocks.field36432).method36613(Blocks.field36432).method36611(Blocks.field36445);
      this.method35857(Blocks.DARK_OAK_SAPLING, Blocks.POTTED_DARK_OAK_SAPLING, Class1958.field12763);
      this.method35841(Blocks.field36451, Class7524.field32284);
      this.method35845(Blocks.field36403)
         .method31167(Blocks.field36698)
         .method31169(Blocks.field36869)
         .method31170(Blocks.field36864)
         .method31171(Blocks.field36564)
         .method31172(Blocks.JUNGLE_SIGN, Blocks.JUNGLE_WALL_SIGN)
         .method31173(Blocks.field36842)
         .method31174(Blocks.field36663);
      this.method35847(Blocks.field36874);
      this.method35848(Blocks.field36612);
      this.method35850(Blocks.field36425).method36613(Blocks.field36425).method36611(Blocks.field36437);
      this.method35850(Blocks.field36430).method36613(Blocks.field36430).method36611(Blocks.field36443);
      this.method35857(Blocks.JUNGLE_SAPLING, Blocks.POTTED_JUNGLE_SAPLING, Class1958.field12763);
      this.method35841(Blocks.field36449, Class7524.field32284);
      this.method35845(Blocks.field37091)
         .method31167(Blocks.field37105)
         .method31169(Blocks.field37097)
         .method31170(Blocks.field37101)
         .method31171(Blocks.field37095)
         .method31172(Blocks.field37109, Blocks.field37111)
         .method31173(Blocks.field37093)
         .method31174(Blocks.field37103);
      this.method35847(Blocks.field37107);
      this.method35848(Blocks.field37099);
      this.method35850(Blocks.field37079).method36612(Blocks.field37079).method36611(Blocks.field37081);
      this.method35850(Blocks.field37080).method36612(Blocks.field37080).method36611(Blocks.field37082);
      this.method35857(Blocks.field37084, Blocks.field37125, Class1958.field12763);
      this.method35957(Blocks.field37090, Blocks.field37127);
      this.method35845(Blocks.field37092)
         .method31167(Blocks.field37106)
         .method31169(Blocks.field37098)
         .method31170(Blocks.field37102)
         .method31171(Blocks.field37096)
         .method31172(Blocks.field37110, Blocks.field37112)
         .method31173(Blocks.field37094)
         .method31174(Blocks.field37104);
      this.method35847(Blocks.field37108);
      this.method35848(Blocks.field37100);
      this.method35850(Blocks.field37070).method36612(Blocks.field37070).method36611(Blocks.field37072);
      this.method35850(Blocks.field37071).method36612(Blocks.field37071).method36611(Blocks.field37073);
      this.method35857(Blocks.field37075, Blocks.field37126, Class1958.field12763);
      this.method35957(Blocks.field37077, Blocks.field37128);
      this.method35855(Blocks.field37078, Class1958.field12763);
      this.method35807(Class8514.field37352);
      this.method35846(Class7287.method22996(Blocks.STONE)).method31166(var1 -> {
         ResourceLocation var4 = Class9756.field45537.method34805(Blocks.STONE, var1, this.field43643);
         ResourceLocation var5 = Class9756.field45538.method34805(Blocks.STONE, var1, this.field43643);
         this.field43642.accept(method35816(Blocks.STONE, var4, var5));
         return var4;
      }).method31173(Blocks.field36845).method31171(Blocks.field36559).method31167(Blocks.STONE_BUTTON).method31174(Blocks.field37020);
      this.method35847(Blocks.IRON_DOOR);
      this.method35849(Blocks.field36766);
      this.method35845(Blocks.field36615).method31168(Blocks.field37046).method31174(Blocks.STONE_BRICK_STAIRS).method31173(Blocks.field36852);
      this.method35845(Blocks.field36616).method31168(Blocks.field37044).method31174(Blocks.field37016).method31173(Blocks.field37030);
      this.method35845(Blocks.field36399).method31168(Blocks.COBBLESTONE_WALL).method31174(Blocks.COBBLESTONE_STAIRS).method31173(Blocks.field36850);
      this.method35845(Blocks.field36526).method31168(Blocks.MOSSY_COBBLESTONE_WALL).method31174(Blocks.field37018).method31173(Blocks.field37032);
      this.method35845(Blocks.field36767).method31168(Blocks.field37042).method31174(Blocks.field36770).method31173(Blocks.field36773);
      this.method35845(Blocks.field36768).method31174(Blocks.field36771).method31173(Blocks.field36774);
      this.method35845(Blocks.field36769).method31174(Blocks.field36772).method31173(Blocks.field36775);
      this.method35844(Blocks.SANDSTONE, Class7524.field32290)
         .method31168(Blocks.field37050)
         .method31174(Blocks.SANDSTONE_STAIRS)
         .method31173(Blocks.field36847);
      this.method35843(Blocks.field36859, Class7524.method24565(Class7287.method23042(Blocks.SANDSTONE, "_top")))
         .method31173(Blocks.field37034)
         .method31174(Blocks.field37021);
      this.method35843(
            Blocks.CUT_SANDSTONE,
            Class7524.field32273
               .method25590(Blocks.SANDSTONE)
               .method24561(var0 -> var0.method22991(Class9588.field44833, Class7287.method23041(Blocks.CUT_SANDSTONE)))
         )
         .method31173(Blocks.field36848);
      this.method35844(Blocks.field36835, Class7524.field32290)
         .method31168(Blocks.field37043)
         .method31174(Blocks.field36838)
         .method31173(Blocks.field36855);
      this.method35843(Blocks.field36861, Class7524.method24565(Class7287.method23042(Blocks.field36835, "_top")))
         .method31173(Blocks.field37029)
         .method31174(Blocks.field37015);
      this.method35843(
            Blocks.field36837,
            Class7524.field32273
               .method25590(Blocks.field36835)
               .method24561(var0 -> var0.method22991(Class9588.field44833, Class7287.method23041(Blocks.field36837)))
         )
         .method31173(Blocks.field36856);
      this.method35845(Blocks.field36523).method31168(Blocks.field37041).method31174(Blocks.BRICK_STAIRS).method31173(Blocks.field36851);
      this.method35845(Blocks.NETHER_BRICKS)
         .method31169(Blocks.NETHER_BRICK_FENCE)
         .method31168(Blocks.field37047)
         .method31174(Blocks.NETHER_BRICK_STAIRS)
         .method31173(Blocks.field36853);
      this.method35845(Blocks.field36880).method31174(Blocks.field36882).method31173(Blocks.field36857);
      this.method35845(Blocks.DIORITE).method31168(Blocks.field37052).method31174(Blocks.field37027).method31173(Blocks.field37040);
      this.method35845(Blocks.POLISHED_DIORITE).method31174(Blocks.field37017).method31173(Blocks.field37031);
      this.method35845(Blocks.GRANITE).method31168(Blocks.field37045).method31174(Blocks.field37023).method31173(Blocks.field37036);
      this.method35845(Blocks.POLISHED_GRANITE).method31174(Blocks.field37014).method31173(Blocks.field37028);
      this.method35845(Blocks.ANDESITE).method31168(Blocks.field37048).method31174(Blocks.field37024).method31173(Blocks.field37037);
      this.method35845(Blocks.POLISHED_ANDESITE).method31174(Blocks.field37026).method31173(Blocks.field37039);
      this.method35845(Blocks.field36883).method31168(Blocks.field37051).method31174(Blocks.field37019).method31173(Blocks.field37033);
      this.method35844(Blocks.field36724, Class7524.field32273).method31174(Blocks.field36727).method31173(Blocks.field36854);
      this.method35843(Blocks.field36860, Class7524.method24565(Class7287.method23042(Blocks.field36724, "_bottom")))
         .method31174(Blocks.field37022)
         .method31173(Blocks.field37035);
      this.method35845(Blocks.field36892).method31173(Blocks.field37038).method31174(Blocks.field37025).method31168(Blocks.field37049);
      this.method35844(Blocks.field37130, Class7524.field32291)
         .method31168(Blocks.field37132)
         .method31174(Blocks.field37131)
         .method31173(Blocks.field37133);
      this.method35845(Blocks.field37135).method31168(Blocks.field37140).method31174(Blocks.field37139).method31173(Blocks.field37138);
      this.method35845(Blocks.field37134)
         .method31168(Blocks.field37146)
         .method31171(Blocks.field37144)
         .method31167(Blocks.field37145)
         .method31174(Blocks.field37142)
         .method31173(Blocks.field37143);
      this.method35891();
      this.method35865(Blocks.RAIL);
      this.method35866(Blocks.POWERED_RAIL);
      this.method35866(Blocks.DETECTOR_RAIL);
      this.method35866(Blocks.field36728);
      this.method35890();
      this.method35875(Blocks.COMMAND_BLOCK);
      this.method35875(Blocks.field36887);
      this.method35875(Blocks.field36888);
      this.method35876(Blocks.ANVIL);
      this.method35876(Blocks.field36714);
      this.method35876(Blocks.field36715);
      this.method35880();
      this.method35884();
      this.method35886(Blocks.FURNACE, Class7524.field32277);
      this.method35886(Blocks.field37057, Class7524.field32277);
      this.method35886(Blocks.field37056, Class7524.field32278);
      this.method35889();
      this.method35958();
      this.method35925(Blocks.field36618, Blocks.field36624);
      this.method35925(Blocks.field36399, Blocks.field36620);
      this.method35925(Blocks.field36617, Blocks.field36623);
      this.method35925(Blocks.field36616, Blocks.field36622);
      this.method35956();
      this.method35925(Blocks.field36615, Blocks.field36621);
      Class3311.method11854().forEach(var1 -> this.method35806(var1, Class9060.method33721("template_spawn_egg")));
   }

   // $VF: synthetic method
   public static BiConsumer method35999(Class9407 var0) {
      return var0.field43643;
   }

   // $VF: synthetic method
   public static Class5148 method36000(Block var0, ResourceLocation var1) {
      return method35829(var0, var1);
   }

   // $VF: synthetic method
   public static Consumer method36001(Class9407 var0) {
      return var0.field43642;
   }

   // $VF: synthetic method
   public static Class5146 method36002(Block var0, ResourceLocation var1, ResourceLocation var2) {
      return method35820(var0, var1, var2);
   }

   // $VF: synthetic method
   public static void method36003(Class9407 var0, Block var1, ResourceLocation var2) {
      var0.method35805(var1, var2);
   }

   // $VF: synthetic method
   public static Class5146 method36004(Block var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
      return method35824(var0, var1, var2, var3);
   }

   // $VF: synthetic method
   public static Class5146 method36005(Block var0, ResourceLocation var1, ResourceLocation var2) {
      return method35823(var0, var1, var2);
   }

   // $VF: synthetic method
   public static Class5146 method36006(Block var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3, ResourceLocation var4) {
      return method35825(var0, var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static Class5146 method36007(Block var0, ResourceLocation var1, ResourceLocation var2) {
      return method35838(var0, var1, var2);
   }

   // $VF: synthetic method
   public static void method36008(Class9407 var0, Class3257 var1) {
      var0.method35807(var1);
   }

   // $VF: synthetic method
   public static void method36009(Class9407 var0, Block var1) {
      var0.method35804(var1);
   }

   // $VF: synthetic method
   public static Class5146 method36010(Block var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
      return method35839(var0, var1, var2, var3);
   }

   // $VF: synthetic method
   public static Class5146 method36011(Block var0, ResourceLocation var1, ResourceLocation var2, ResourceLocation var3) {
      return method35826(var0, var1, var2, var3);
   }

   // $VF: synthetic method
   public static Class5146 method36012(Block var0, ResourceLocation var1) {
      return method35831(var0, var1);
   }

   // $VF: synthetic method
   public static Class5146 method36013(Block var0, ResourceLocation var1, ResourceLocation var2) {
      return method35835(var0, var1, var2);
   }
}
