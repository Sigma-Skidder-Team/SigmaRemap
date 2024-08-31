package mapped;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

public class Class1279 extends Class1274<Class1156> {
   private static final Logger field6820 = LogManager.getLogger();
   private static final ThreadPoolExecutor field6821 = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new Class6030(field6820)).build()
   );
   private static final ResourceLocation field6822 = new ResourceLocation("textures/misc/unknown_server.png");
   private static final ResourceLocation field6823 = new ResourceLocation("textures/gui/server_selection.png");
   private static final ITextComponent field6824 = new TranslationTextComponent("lanServer.scanning");
   private static final ITextComponent field6825 = new TranslationTextComponent("multiplayer.status.cannot_resolve").mergeStyle(TextFormatting.DARK_RED);
   private static final ITextComponent field6826 = new TranslationTextComponent("multiplayer.status.cannot_connect").mergeStyle(TextFormatting.DARK_RED);
   private static final ITextComponent field6827 = new TranslationTextComponent("multiplayer.status.incompatible");
   private static final ITextComponent field6828 = new TranslationTextComponent("multiplayer.status.no_connection");
   private static final ITextComponent field6829 = new TranslationTextComponent("multiplayer.status.pinging");
   private final MultiplayerScreen field6830;
   private final List<Class1157> field6831 = Lists.newArrayList();
   private final Class1156 field6832 = new Class1159();
   private final List<Class1158> field6833 = Lists.newArrayList();

   public Class1279(MultiplayerScreen var1, Minecraft var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6830 = var1;
   }

   private void method6080() {
      this.method6027();
      this.field6831.forEach(this::method6030);
      this.method6030(this.field6832);
      this.field6833.forEach(this::method6030);
   }

   public void method6024(Class1156 var1) {
      super.method6024(var1);
      if (this.method6023() instanceof Class1157) {
         NarratorChatListener.INSTANCE
            .say(new TranslationTextComponent("narrator.select", Class1157.method5554((Class1157)this.method6023()).field33188).getString());
      }

      this.field6830.method6239();
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      Class1156 var6 = this.method6023();
      return var6 != null && var6.keyPressed(var1, var2, var3) || super.keyPressed(var1, var2, var3);
   }

   @Override
   public void method6049(Class2220 var1) {
      this.method6051(var1, var0 -> !(var0 instanceof Class1159));
   }

   public void method6081(Class7970 var1) {
      this.field6831.clear();

      for (int var4 = 0; var4 < var1.method27099(); var4++) {
         this.field6831.add(new Class1157(this, this.field6830, var1.method27096(var4)));
      }

      this.method6080();
   }

   public void method6082(List<Class9162> var1) {
      this.field6833.clear();

      for (Class9162 var5 : var1) {
         this.field6833.add(new Class1158(this.field6830, var5));
      }

      this.method6080();
   }

   @Override
   public int method6048() {
      return super.method6048() + 30;
   }

   @Override
   public int method6022() {
      return super.method6022() + 85;
   }

   @Override
   public boolean method6057() {
      return this.field6830.method5533() == this;
   }

   // $VF: synthetic method
   public static ITextComponent method6084() {
      return field6824;
   }

   // $VF: synthetic method
   public static ThreadPoolExecutor method6085() {
      return field6821;
   }

   // $VF: synthetic method
   public static ITextComponent method6086() {
      return field6827;
   }

   // $VF: synthetic method
   public static ITextComponent method6087() {
      return field6828;
   }

   // $VF: synthetic method
   public static ITextComponent method6088() {
      return field6829;
   }

   // $VF: synthetic method
   public static ResourceLocation method6089() {
      return field6822;
   }

   // $VF: synthetic method
   public static ResourceLocation method6090() {
      return field6823;
   }

   // $VF: synthetic method
   public static Logger method6091() {
      return field6820;
   }

   // $VF: synthetic method
   public static void method6092(Class1279 var0, Class1156 var1) {
      var0.method6042(var1);
   }

   // $VF: synthetic method
   public static int method6093(Class1279 var0, int var1) {
      return var0.method6055(var1);
   }

   // $VF: synthetic method
   public static ITextComponent method6094() {
      return field6825;
   }

   // $VF: synthetic method
   public static ITextComponent method6095() {
      return field6826;
   }
}
