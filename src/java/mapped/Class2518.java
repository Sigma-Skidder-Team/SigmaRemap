package mapped;

import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Class2518 extends JComponent {
   private static final DecimalFormat field16657 = Util.<DecimalFormat>method38508(
      new DecimalFormat("########0.000"), var0 -> var0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT))
   );
   private final int[] field16658 = new int[256];
   private int field16659;
   private final String[] field16660 = new String[11];
   private final MinecraftServer field16661;
   private final javax.swing.Timer field16662; // wtf

   public Class2518(MinecraftServer var1) {
      this.field16661 = var1;
      this.setPreferredSize(new Dimension(456, 246));
      this.setMinimumSize(new Dimension(456, 246));
      this.setMaximumSize(new Dimension(456, 246));
      this.field16662 = new javax.swing.Timer(500, var1x -> this.method10562());
      this.field16662.start();
      this.setBackground(Color.BLACK);
   }

   private void method10562() {
      long var3 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
      this.field16660[0] = "Memory use: "
         + var3 / 1024L / 1024L
         + " mb ("
         + Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory()
         + "% free)";
      this.field16660[1] = "Avg tick: " + field16657.format(this.method10563(this.field16661.field1238) * 1.0E-6) + " ms";
      this.field16658[this.field16659++ & 0xFF] = (int)(var3 * 100L / Runtime.getRuntime().maxMemory());
      this.repaint();
   }

   private double method10563(long[] var1) {
      long var4 = 0L;

      for (long var9 : var1) {
         var4 += var9;
      }

      return (double)var4 / (double)var1.length;
   }

   @Override
   public void paint(Graphics var1) {
      var1.setColor(new Color(16777215));
      var1.fillRect(0, 0, 456, 246);

      for (int var4 = 0; var4 < 256; var4++) {
         int var5 = this.field16658[var4 + this.field16659 & 0xFF];
         var1.setColor(new Color(var5 + 28 << 16));
         var1.fillRect(var4, 100 - var5, 1, var5);
      }

      var1.setColor(Color.BLACK);

      for (int var6 = 0; var6 < this.field16660.length; var6++) {
         String var7 = this.field16660[var6];
         if (var7 != null) {
            var1.drawString(var7, 32, 116 + var6 * 16);
         }
      }
   }

   public void method10564() {
      this.field16662.stop();
   }
}
