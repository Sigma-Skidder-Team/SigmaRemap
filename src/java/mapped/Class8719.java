package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Class8719 {
   private static String[] field39340;
   private final Class313 field39341;
   private final List<Class1810> field39342;
   private final List<Class1810> field39343;
   private final Function<Class1810, ResourceLocation> field39344;
   private final Runnable field39345;
   private final Consumer<Class313> field39346;

   public Class8719(Runnable var1, Function<Class1810, ResourceLocation> var2, Class313 var3, Consumer<Class313> var4) {
      this.field39345 = var1;
      this.field39344 = var2;
      this.field39341 = var3;
      this.field39342 = Lists.newArrayList(var3.method1270());
      Collections.reverse(this.field39342);
      this.field39343 = Lists.newArrayList(var3.method1268());
      this.field39343.removeAll(this.field39342);
      this.field39346 = var4;
   }

   public Stream<Class4681> method31448() {
      return this.field39343.stream().<Class4681>map(var1 -> new Class4679(this, var1));
   }

   public Stream<Class4681> method31449() {
      return this.field39342.stream().<Class4681>map(var1 -> new Class4682(this, var1));
   }

   public void method31450() {
      this.field39341.method1264(Lists.reverse(this.field39342).stream().<String>map(Class1810::method7951).collect(ImmutableList.toImmutableList()));
      this.field39346.accept(this.field39341);
   }

   public void method31451() {
      this.field39341.method1262();
      this.field39342.retainAll(this.field39341.method1268());
      this.field39343.clear();
      this.field39343.addAll(this.field39341.method1268());
      this.field39343.removeAll(this.field39342);
   }

   // $VF: synthetic method
   public static Function method31454(Class8719 var0) {
      return var0.field39344;
   }

   // $VF: synthetic method
   public static Runnable method31455(Class8719 var0) {
      return var0.field39345;
   }

   // $VF: synthetic method
   public static List method31456(Class8719 var0) {
      return var0.field39343;
   }

   // $VF: synthetic method
   public static List method31457(Class8719 var0) {
      return var0.field39342;
   }
}