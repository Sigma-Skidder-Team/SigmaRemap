package mapped;

import net.minecraft.util.Util;

import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class StatsComponent extends JComponent {
   private static final DecimalFormat FORMATTER = Util.make(
      new DecimalFormat("########0.000"), var0 -> var0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT))
   );
   private final int[] values = new int[256];
   private int vp;
   private final String[] msgs = new String[11];
   private final MinecraftServer server;
   private final javax.swing.Timer field_219054_f; // wtf

   public StatsComponent(MinecraftServer var1) {
      this.server = var1;
      this.setPreferredSize(new java.awt.Dimension(456, 246));
      this.setMinimumSize(new java.awt.Dimension(456, 246));
      this.setMaximumSize(new java.awt.Dimension(456, 246));
      this.field_219054_f = new javax.swing.Timer(500, var1x -> this.tick());
      this.field_219054_f.start();
      this.setBackground(Color.BLACK);
   }

   private void tick() {
      long i = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
      this.msgs[0] = "Memory use: "
         + i / 1024L / 1024L
         + " mb ("
         + Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory()
         + "% free)";
      this.msgs[1] = "Avg tick: " + FORMATTER.format(this.mean(this.server.tickTimeArray) * 1.0E-6) + " ms";
      this.values[this.vp++ & 0xFF] = (int)(i * 100L / Runtime.getRuntime().maxMemory());
      this.repaint();
   }

   private double mean(long[] values) {
      long i = 0L;

      for (long j : values)
      {
         i += j;
      }

      return (double)i / (double)values.length;
   }

   @Override
   public void paint(Graphics p_paint_1_) {
      p_paint_1_.setColor(new Color(16777215));
      p_paint_1_.fillRect(0, 0, 456, 246);

      for (int i = 0; i < 256; ++i)
      {
         int j = this.values[i + this.vp & 255];
         p_paint_1_.setColor(new Color(j + 28 << 16));
         p_paint_1_.fillRect(i, 100 - j, 1, j);
      }

      p_paint_1_.setColor(Color.BLACK);

      for (int k = 0; k < this.msgs.length; ++k)
      {
         String s = this.msgs[k];

         if (s != null)
         {
            p_paint_1_.drawString(s, 32, 116 + k * 16);
         }
      }
   }

   public void func_219053_a() {
      this.field_219054_f.stop();
   }
}
