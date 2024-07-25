package com.sun.jna;

import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Window;

public class Native$class_16 {
   private Native$class_16() {
   }

   public static long getWindowID(Window w) throws HeadlessException {
      return getComponentID(w);
   }

   public static long getComponentID(Object o) throws HeadlessException {
      if (GraphicsEnvironment.isHeadless()) {
         throw new HeadlessException("No native windows when headless");
      } else {
         Component var3 = (Component)o;
         if (var3.isLightweight()) {
            throw new IllegalArgumentException("Component must be heavyweight");
         } else if (!var3.isDisplayable()) {
            throw new IllegalStateException("Component must be displayable");
         } else if (Platform.isX11() && System.getProperty("java.version").startsWith("1.4") && !var3.isVisible()) {
            throw new IllegalStateException("Component must be visible");
         } else {
            return Native.getWindowHandle0(var3);
         }
      }
   }
}
