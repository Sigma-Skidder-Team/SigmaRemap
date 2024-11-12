package com.mentalfrostbyte.jello.gui;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.gui.screens.*;
import com.mentalfrostbyte.jello.module.impl.gui.classic.TabGUI;
import com.mentalfrostbyte.jello.unmapped.*;
import com.mentalfrostbyte.jello.util.FileUtil;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.MultiplayerScreen;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import totalcross.json.JSONException;
import totalcross.json.JSONObject;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GuiManager {
    public static final Map<Class<? extends net.minecraft.client.gui.screen.Screen>, String> field41338 = new HashMap<Class<? extends net.minecraft.client.gui.screen.Screen>, String>();
    private static final Map<Class<? extends net.minecraft.client.gui.screen.Screen>, Class<? extends Screen>> field41337 = new HashMap<Class<? extends net.minecraft.client.gui.screen.Screen>, Class<? extends Screen>>();
    public static long field41344;
    public static long field41345;
    public static long field41346;
    public static float scaleFactor = 1.0F;
    private static boolean field41351 = true;

    static {
        field41337.put(VanillaMainMenuScreen.class, JelloMainMenuScreen.class);
        field41337.put(ClickGui.class, JelloClickGUI.class);
        field41337.put(Class1144.class, JelloKeyboardScreen.class);
        field41337.put(Maps.class, JelloMaps.class);
        field41337.put(Snake.class, SnakeGameScreen.class);
        field41337.put(Bird.class, BirdGameScreen.class);
        field41337.put(SpotLight.class, SearchBar.class);
        field41337.put(Class1309.class, JelloInGameOptions.class);
        field41337.put(Class1133.class, CreditsToCreators.class);
        field41338.put(ClickGui.class, "Click GUI");
        field41338.put(Class1144.class, "Keybind Manager");
        field41338.put(Maps.class, "Jello Maps");
        field41338.put(Snake.class, "Snake");
        field41338.put(Bird.class, "Bird");
        field41338.put(SpotLight.class, "Spotlight");
    }

    public double field41347;
    public int[] field41354 = new int[2];
    public boolean field41357;
    private final List<Integer> field41339 = new ArrayList<Integer>();
    private final List<Integer> field41340 = new ArrayList<Integer>();
    private final List<Integer> field41341 = new ArrayList<Integer>();
    private final List<Integer> field41342 = new ArrayList<Integer>();
    private final List<Integer> field41343 = new ArrayList<Integer>();
    private boolean field41349 = true;
    private boolean field41350 = true;
    private Screen screen;

    public GuiManager() {
        field41344 = GLFW.glfwCreateStandardCursor(221185);
        field41345 = GLFW.glfwCreateStandardCursor(221188);
        field41346 = GLFW.glfwCreateStandardCursor(221186);
        GLFW.glfwSetCursor(Minecraft.getInstance().mainWindow.getHandle(), field41344);
        scaleFactor = (float) (Minecraft.getInstance().mainWindow.getFramebufferHeight() / Minecraft.getInstance().mainWindow.getHeight());
    }

    public static boolean method33457(net.minecraft.client.gui.screen.Screen var0) {
        if (var0 instanceof MultiplayerScreen && !(var0 instanceof JelloPortalScreen)) {
            Minecraft.getInstance().currentScreen = null;
            Minecraft.getInstance().displayGuiScreen(new JelloPortalScreen(((MultiplayerScreen) var0).parentScreen));
            return true;
        } else if (var0 instanceof IngameMenuScreen && !(var0 instanceof JelloForSigmaOptions)) {
            Minecraft.getInstance().currentScreen = null;
            Minecraft.getInstance().displayGuiScreen(new JelloForSigmaOptions());
            return true;
        } else if (Client.getInstance().getClientMode() == ClientMode.NOADDONS && var0 instanceof VanillaMainMenuScreen && !(var0 instanceof NoAddOnnScreenMenu)) {
            Minecraft.getInstance().currentScreen = null;
            Minecraft.getInstance().displayGuiScreen(new NoAddOnnScreenMenu());
            return true;
        } else {
            return false;
        }
    }

    public static Screen handleScreen(net.minecraft.client.gui.screen.Screen var0) {
        if (var0 == null) {
            return null;
        } else if (Client.getInstance().getClientMode() == ClientMode.PREMIUM) {
            return new GuiSwitch();
        } else if (method33457(var0)) {
            return null;
        } else if (!field41337.containsKey(var0.getClass())) {
            return null;
        } else {
            try {
                return field41337.get(var0.getClass()).newInstance();
            } catch (InstantiationException | IllegalAccessException var4) {
                var4.printStackTrace();
            }

            return null;
        }
    }

    public static void method33475() {
        Minecraft.getInstance();
        if (Minecraft.IS_RUNNING_ON_MAC) {
            try {
                JSONObject var2 = FileUtil.readFile(new File(Client.getInstance().getFile() + "/config.json"));
                if (var2.has("hidpicocoa")) {
                    field41351 = var2.getBoolean("hidpicocoa");
                }

                GLFW.glfwWindowHint(143361, field41351 ? 1 : 0);
            } catch (IOException var3) {
                var3.printStackTrace();
            }
        }
    }

    public void method33452() {
        field41337.clear();
        field41337.put(VanillaMainMenuScreen.class, ClassicMainScreen.class);
        field41337.put(ClickGui.class, ClassicScreenk.class);
    }

    public void method33453(int var1, int var2) {
        if (var2 == 1 || var2 == 2) {
            this.field41339.add(var1);
        } else if (var2 == 0) {
            this.field41340.add(var1);
        }
    }

    public void method33454(int var1, int var2) {
        this.field41343.add(var1);
    }

    public void method33455(double var1, double var3) {
        this.field41347 += var3;
    }

    public void method33456(int var1, int var2) {
        if (var2 != 1) {
            if (var2 == 0) {
                this.field41342.add(var1);
            }
        } else {
            this.field41341.add(var1);
        }
    }

    public void endTick() {
        if (this.screen != null) {
            this.field41354[0] = Math.max(0, Math.min(Minecraft.getInstance().mainWindow.getWidth(), (int) Minecraft.getInstance().mouseHelper.getMouseX()));
            this.field41354[1] = Math.max(0, Math.min(Minecraft.getInstance().mainWindow.getHeight(), (int) Minecraft.getInstance().mouseHelper.getMouseY()));

            for (Integer var4 : this.field41339) {
                this.method33463(var4);
            }

            for (Integer var9 : this.field41340) {
                this.method33461(var9);
            }

            for (Integer var10 : this.field41341) {
                this.method33466(this.field41354[0], this.field41354[1], var10);
            }

            for (Integer var11 : this.field41342) {
                this.method33467(this.field41354[0], this.field41354[1], var11);
            }

            for (Integer var12 : this.field41343) {
                this.method33462((char) var12.intValue());
            }

            this.field41339.clear();
            this.field41340.clear();
            this.field41341.clear();
            this.field41342.clear();
            this.field41343.clear();
            if (this.field41347 == 0.0) {
                this.field41357 = false;
            } else {
                this.method33465((float) this.field41347);
                this.field41347 = 0.0;
                this.field41357 = true;
            }

            if (this.screen != null) {
                this.screen.method13028(this.field41354[0], this.field41354[1]);
            }
        }
    }

    public void method33461(int var1) {
        if (this.screen != null) {
            this.screen.method13103(var1);
        }
    }

    public void method33462(char var1) {
        if (this.screen != null) {
            this.screen.charTyped(var1);
        }
    }

    public void method33463(int var1) {
        if (this.screen != null) {
            this.screen.keyPressed(var1);
        }
    }

    public void method33464() {
        if (Minecraft.getInstance().world != null) {
            GL11.glDisable(2896);
            int var3 = 0;
            int var4 = 0;
            int var5 = 170;

            if (Minecraft.getInstance().gameSettings.showDebugInfo) {
                var3 = Minecraft.getInstance().mainWindow.getWidth() / 2 - var5 / 2;
            }

            if (Client.getInstance().getClientMode() != ClientMode.JELLO) {
                float var7 = 0.5F + TabGUI.animationProgress.calcPercent() * 0.5F;
                GL11.glAlphaFunc(516, 0.1F);
                RenderUtil.renderBackgroundBox(4.0F, 2.0F, 106.0F, 28.0F, MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.color, 0.6F * var7));
                RenderUtil.drawString(ResourceList.bold22, 9.0F, 2.0F, "Sigma", MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.color, 0.5F * var7));
                RenderUtil.drawString(
                        ResourceList.bold22, 8.0F, 1.0F, "Sigma", MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, Math.min(1.0F, var7 * 1.2F))
                );
                int var8 = Color.getHSBColor((float) (System.currentTimeMillis() % 4000L) / 4000.0F, 1.0F, 1.0F).getRGB();
                RenderUtil.drawString(ResourceList.bold14, 73.0F, 2.0F, "5.0.0", MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.color, 0.5F));
                RenderUtil.drawString(ResourceList.bold14, 72.0F, 1.0F, "5.0.0", MultiUtilities.applyAlpha(var8, Math.min(1.0F, var7 * 1.4F)));
            } else {
                GL11.glAlphaFunc(519, 0.0F);
                RenderUtil.method11455((float) var3, var4, 170.0F, 104.0F, !(scaleFactor > 1.0F) ? ResourceList.jelloWatermarkPNG : ResourceList.jelloWatermark2xPNG);
            }

            Client.getInstance().getEventManager().call(new EventRender());
        }

        if (this.screen != null && Minecraft.getInstance().loadingGui == null) {
            this.screen.draw(1.0F);
        }
    }

    public void method33465(float var1) {
        if (this.screen != null && Minecraft.getInstance().loadingGui == null) {
            this.screen.method13079(var1);
        }
    }

    public void method33466(int var1, int var2, int var3) {
        if (this.screen != null && Minecraft.getInstance().loadingGui == null) {
            this.screen.method13078(var1, var2, var3);
        }
    }

    public void method33467(int var1, int var2, int var3) {
        if (this.screen != null && Minecraft.getInstance().loadingGui == null) {
            this.screen.method13095(var1, var2, var3);
        }
    }

    public JSONObject method33468(JSONObject var1) {
        if (this.screen != null) {
            JSONObject var4 = this.screen.method13160(new JSONObject());
            if (var4.length() != 0) {
                var1.put(this.screen.method13257(), var4);
            }
        }

        var1.put("guiBlur", this.field41349);
        var1.put("hqIngameBlur", this.field41350);
        var1.put("hidpicocoa", field41351);
        return var1;
    }

    public void method33469(boolean var1) {
        this.field41349 = var1;
    }

    public boolean method33470() {
        return this.field41349;
    }

    public void method33471(boolean var1) {
        this.field41350 = var1;
    }

    public boolean method33472() {
        return this.field41350;
    }

    public void method33473(boolean var1) {
        field41351 = var1;
    }

    public boolean method33474() {
        return field41351;
    }

    public void method33476(JSONObject var1) {
        if (this.screen != null) {
            JSONObject var4 = null;

            try {
                var4 = Client.getInstance().getConfig().getJSONObject(this.screen.method13257());
            } catch (Exception var9) {
                var4 = new JSONObject();
            } finally {
                this.screen.method13161(var4);
            }
        }

        if (var1.has("guiBlur")) {
            this.field41349 = var1.getBoolean("guiBlur");
        }

        if (var1.has("hqIngameBlur")) {
            this.field41350 = var1.getBoolean("hqIngameBlur");
        }
    }

    public Class<? extends net.minecraft.client.gui.screen.Screen> method33477(String var1) {
        for (Entry var5 : field41338.entrySet()) {
            if (var1.equals(var5.getValue())) {
                return (Class<? extends net.minecraft.client.gui.screen.Screen>) var5.getKey();
            }
        }

        return null;
    }

    public String method33478(Class<? extends net.minecraft.client.gui.screen.Screen> var1) {
        if (var1 == null) {
            return "";
        } else {
            for (Entry var5 : field41338.entrySet()) {
                if (var1 == var5.getKey()) {
                    return (String) var5.getValue();
                }
            }

            return "";
        }
    }

    public void onResize() throws JSONException {
        if (this.screen != null) {
            this.method33468(Client.getInstance().getConfig());

            try {
                this.screen = this.screen.getClass().newInstance();
            } catch (IllegalAccessException | InstantiationException var4) {
                var4.printStackTrace();
            }

            this.method33476(Client.getInstance().getConfig());
        }

        if (Minecraft.getInstance().mainWindow.getWidth() != 0 && Minecraft.getInstance().mainWindow.getHeight() != 0) {
            scaleFactor = (float) Math.max(
                    Minecraft.getInstance().mainWindow.getFramebufferWidth() / Minecraft.getInstance().mainWindow.getWidth(),
                    Minecraft.getInstance().mainWindow.getFramebufferHeight() / Minecraft.getInstance().mainWindow.getHeight()
            );
        }
    }

    public Screen method33480() {
        return this.screen;
    }

    public void method33481() throws JSONException {
        this.method33482(handleScreen(Minecraft.getInstance().currentScreen));
    }

    public void method33482(Screen var1) {
        if (this.screen != null) {
            this.method33468(Client.getInstance().getConfig());
        }

        this.screen = var1;
        this.method33476(Client.getInstance().getConfig());
        if (this.screen != null) {
            this.screen.method13028(this.field41354[0], this.field41354[1]);
        }

        if (Client.getInstance().getModuleManager() != null) {
            Client.getInstance().getModuleManager().getMacOSTouchBar().method13734(null);
        }
    }

    public boolean method33484(net.minecraft.client.gui.screen.Screen var1) {
        return field41337.containsKey(var1.getClass());
    }
}
