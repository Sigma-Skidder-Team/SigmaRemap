package mapped;

import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Class7524 {
   private static String[] field32270;
   public static final Class7732 field32271 = method24564(Class7287::method22996, Class9756.field45537);
   public static final Class7732 field32272 = method24564(Class7287::method22996, Class9756.field45538);
   public static final Class7732 field32273 = method24564(Class7287::method23014, Class9756.field45539);
   public static final Class7732 field32274 = method24564(Class7287::method23014, Class9756.field45540);
   public static final Class7732 field32275 = method24564(Class7287::method23018, Class9756.field45542);
   public static final Class7732 field32276 = method24564(Class7287::method23015, Class9756.field45541);
   public static final Class7732 field32277 = method24564(Class7287::method23032, Class9756.field45543);
   public static final Class7732 field32278 = method24564(Class7287::method23031, Class9756.field45544);
   public static final Class7732 field32279 = method24564(Class7287::method23006, Class9756.field45587);
   public static final Class7732 field32280 = method24564(Class7287::method23009, Class9756.field45590);
   public static final Class7732 field32281 = method24564(Class7287::method23010, Class9756.field45588);
   public static final Class7732 field32282 = method24564(Class7287::method23022, Class9756.field45566);
   public static final Class7732 field32283 = method24564(Class7287::method23034, Class9756.field45599);
   public static final Class7732 field32284 = method24564(Class7287::method22996, Class9756.field45569);
   public static final Class7732 field32285 = method24564(Class7287::method23026, Class9756.field45610);
   public static final Class7732 field32286 = method24564(Class7287::method23026, Class9756.field45611);
   public static final Class7732 field32287 = method24564(Class7287::method22997, Class9756.field45617);
   public static final Class7732 field32288 = method24564(Class7287::method23016, Class9756.field45539);
   public static final Class7732 field32289 = method24564(Class7287::method23016, Class9756.field45540);
   public static final Class7732 field32290 = method24564(Class7287::method23019, Class9756.field45542);
   public static final Class7732 field32291 = method24564(Class7287::method23020, Class9756.field45539);
   private final Class7287 field32292;
   private final Class9253 field32293;

   private Class7524(Class7287 var1, Class9253 var2) {
      this.field32292 = var1;
      this.field32293 = var2;
   }

   public Class9253 method24559() {
      return this.field32293;
   }

   public Class7287 method24560() {
      return this.field32292;
   }

   public Class7524 method24561(Consumer<Class7287> var1) {
      var1.accept(this.field32292);
      return this;
   }

   public ResourceLocation method24562(Block var1, BiConsumer<ResourceLocation, Supplier<JsonElement>> var2) {
      return this.field32293.method34805(var1, this.field32292, var2);
   }

   public ResourceLocation method24563(Block var1, String var2, BiConsumer<ResourceLocation, Supplier<JsonElement>> var3) {
      return this.field32293.method34806(var1, var2, this.field32292, var3);
   }

   private static Class7732 method24564(Function<Block, Class7287> var0, Class9253 var1) {
      return var2 -> new Class7524((Class7287)var0.apply(var2), var1);
   }

   public static Class7524 method24565(ResourceLocation var0) {
      return new Class7524(Class7287.method22999(var0), Class9756.field45537);
   }
}
