package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import javax.annotation.Nullable;

import net.minecraft.client.renderer.texture.NativeImage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class1771 implements Class1768 {
   private static String[] field9591;
   private static final Logger field9592 = LogManager.getLogger();
   private final NativeImage field9593;
   private final Int2ObjectMap<Class2055> field9594;
   private boolean field9595 = false;
   private float field9596 = -1.0F;

   public Class1771(NativeImage var1, Int2ObjectMap<Class2055> var2) {
      this.field9593 = var1;
      this.field9594 = var2;
   }

   @Override
   public void close() {
      this.field9593.close();
   }

   @Nullable
   @Override
   public Class2051 method7734(int var1) {
      return (Class2051)this.field9594.get(var1);
   }

   @Override
   public IntSet method7735() {
      return IntSets.unmodifiable(this.field9594.keySet());
   }

   public boolean method7748() {
      return this.field9595;
   }

   public float method7749() {
      return this.field9596;
   }

   // $VF: synthetic method
   public static Logger method7750() {
      return field9592;
   }

   // $VF: synthetic method
   public static boolean method7751(Class1771 var0, boolean var1) {
      return var0.field9595 = var1;
   }

   // $VF: synthetic method
   public static float method7752(Class1771 var0, float var1) {
      return var0.field9596 = var1;
   }
}
