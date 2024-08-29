package com.mentalfrostbyte.jello.gui;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.unmapped.*;
import com.mentalfrostbyte.jello.util.FileUtil;
import mapped.*;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.opengl.GL11;
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
    public static final Map<Class<? extends Screen>, String> field41338 = new HashMap<Class<? extends Screen>, String>();
    private static final Map<Class<? extends Screen>, Class<? extends Class4307>> field41337 = new HashMap<Class<? extends Screen>, Class<? extends Class4307>>();
    public static long field41344;
    public static long field41345;
    public static long field41346;
    public static float field41348 = 1.0F;
    private static boolean field41351 = true;

    static {
        field41337.put(MainMenuScreen.class, Class4310.class);
        field41337.put(Class1145.class, Class4308.class);
        field41337.put(Class1144.class, Class4309.class);
        field41337.put(Class1319.class, Class4315.class);
        field41337.put(Class836.class, SnakeGameScreen.class);
        field41337.put(BirdGui.class, BirdGameScreen.class);
        field41337.put(Class833.class, Class4324.class);
        field41337.put(Class1309.class, Class4325.class);
        field41337.put(Class1133.class, Class4320.class);
        field41338.put(Class1145.class, "Click GUI");
        field41338.put(Class1144.class, "Keybind Manager");
        field41338.put(Class1319.class, "Jello Maps");
        field41338.put(Class836.class, "Snake");
        field41338.put(BirdGui.class, "Bird");
        field41338.put(Class833.class, "Spotlight");
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
    private Class4307 field41352;
    private GLFWKeyCallback field41353;
    private long field41355;
    private long field41356;

    public GuiManager() {
        this.field41355 = field41344;
        this.field41356 = field41344;
        field41344 = GLFW.glfwCreateStandardCursor(221185);
        field41345 = GLFW.glfwCreateStandardCursor(221188);
        field41346 = GLFW.glfwCreateStandardCursor(221186);
        GLFW.glfwSetCursor(Minecraft.getInstance().mainWindow.getHandle(), field41344);
        field41348 = (float) (Minecraft.getInstance().mainWindow.getFramebufferHeight() / Minecraft.getInstance().mainWindow.method8044());
    }

    public static boolean method33457(Screen var0) {
        if (var0 instanceof MultiplayerScreen && !(var0 instanceof Class1317)) {
            Minecraft.getInstance().currentScreen = null;
            Minecraft.getInstance().displayGuiScreen(new Class1317(((MultiplayerScreen) var0).field6948));
            return true;
        } else if (var0 instanceof IngameMenuScreen && !(var0 instanceof Class835)) {
            Minecraft.getInstance().currentScreen = null;
            Minecraft.getInstance().displayGuiScreen(new Class835());
            return true;
        } else if (Client.getInstance().getClientMode() == ClientMode.NOADDONS && var0 instanceof MainMenuScreen && !(var0 instanceof Class850)) {
            Minecraft.getInstance().currentScreen = null;
            Minecraft.getInstance().displayGuiScreen(new Class850());
            return true;
        } else {
            return false;
        }
    }

    public static Class4307 method33458(Screen var0) {
        if (var0 == null) {
            return null;
        } else if (Client.getInstance().getClientMode() == ClientMode.PREMIUM) {
            return new Class4318();
        } else if (method33457(var0)) {
            return null;
        } else if (!field41337.containsKey(var0.getClass())) {
            return null;
        } else {
            try {
                return field41337.get(var0.getClass()).newInstance();
            } catch (InstantiationException var4) {
                var4.printStackTrace();
            } catch (IllegalAccessException var5) {
                var5.printStackTrace();
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
                    field41351 = var2.method21763("hidpicocoa");
                }

                GLFW.glfwWindowHint(143361, field41351 ? 1 : 0);
            } catch (IOException var3) {
                var3.printStackTrace();
            }
        }
    }

    public void method33452() {
        field41337.clear();
        field41337.put(MainMenuScreen.class, Class4323.class);
        field41337.put(Class1145.class, Class4321.class);
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

    public void method33459(long var1) {
        this.field41355 = var1;
    }

    public void method33460() {
        if (this.field41352 != null) {
            this.field41354[0] = Math.max(0, Math.min(Minecraft.getInstance().mainWindow.method8043(), (int) Minecraft.getInstance().mouseHelper.method36738()));
            this.field41354[1] = Math.max(0, Math.min(Minecraft.getInstance().mainWindow.method8044(), (int) Minecraft.getInstance().mouseHelper.method36739()));

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

            if (this.field41352 != null) {
                this.field41355 = field41344;
                this.field41352.method13028(this.field41354[0], this.field41354[1]);
            }
        }
    }

    public void method33461(int var1) {
        if (this.field41352 != null) {
            this.field41352.method13103(var1);
        }
    }

    public void method33462(char var1) {
        if (this.field41352 != null) {
            this.field41352.method13150(var1);
        }
    }

    public void method33463(int var1) {
        if (this.field41352 != null) {
            this.field41352.method13065(var1);
        }
    }

    public void method33464() {
        ResourcesDecrypter.gingerbreadIconPNG.bind();
        if (Minecraft.getInstance().world != null) {
            GL11.glDisable(2896);
            int var3 = 0;
            int var4 = 0;
            short var5 = 170;

            if (Minecraft.getInstance().gameSettings.showDebugInfo) {
                var3 = Minecraft.getInstance().mainWindow.method8043() / 2 - var5 / 2;
            }

            if (Client.getInstance().getClientMode() != ClientMode.JELLO) {
                float var7 = 0.5F + Class5151.field23380.calcPercent() * 0.5F;
                GL11.glAlphaFunc(516, 0.1F);
                Class3192.method11424(4.0F, 2.0F, 106.0F, 28.0F, Class5628.method17688(Class1979.field12891.field12910, 0.6F * var7));
                Class3192.method11439(ClassicDecryption.bold22, 9.0F, 2.0F, "Sigma", Class5628.method17688(Class1979.field12891.field12910, 0.5F * var7));
                Class3192.method11439(
                        ClassicDecryption.bold22, 8.0F, 1.0F, "Sigma", Class5628.method17688(Class1979.field12896.field12910, Math.min(1.0F, var7 * 1.2F))
                );
                int var8 = Color.getHSBColor((float) (System.currentTimeMillis() % 4000L) / 4000.0F, 1.0F, 1.0F).getRGB();
                Class3192.method11439(ClassicDecryption.bold14, 73.0F, 2.0F, "5.0.0", Class5628.method17688(Class1979.field12891.field12910, 0.5F));
                Class3192.method11439(ClassicDecryption.bold14, 72.0F, 1.0F, "5.0.0", Class5628.method17688(var8, Math.min(1.0F, var7 * 1.4F)));
            } else {
                GL11.glAlphaFunc(519, 0.0F);
                Class3192.method11455((float) var3, var4, 170.0F, 104.0F, !(field41348 > 1.0F) ? ResourcesDecrypter.jelloWatermarkPNG : ResourcesDecrypter.jelloWatermark2xPNG);
            }

            Client.getInstance().getEventManager().call(new Class4415());
        }

        if (this.field41352 != null && Minecraft.getInstance().loadingGui == null) {
            this.field41352.method13027(1.0F);
        }
    }

    public void method33465(float var1) {
        if (this.field41352 != null && Minecraft.getInstance().loadingGui == null) {
            this.field41352.method13079(var1);
        }
    }

    public void method33466(int var1, int var2, int var3) {
        if (this.field41352 != null && Minecraft.getInstance().loadingGui == null) {
            this.field41352.method13078(var1, var2, var3);
        }
    }

    public void method33467(int var1, int var2, int var3) {
        if (this.field41352 != null && Minecraft.getInstance().loadingGui == null) {
            this.field41352.method13095(var1, var2, var3);
        }
    }

    public JSONObject method33468(JSONObject var1) {
        if (this.field41352 != null) {
            JSONObject var4 = this.field41352.method13160(new JSONObject());
            if (var4.method21779() != 0) {
                var1.put(this.field41352.method13257(), var4);
            }
        }

        var1.method21800("guiBlur", this.field41349);
        var1.method21800("hqIngameBlur", this.field41350);
        var1.method21800("hidpicocoa", field41351);
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
        if (this.field41352 != null) {
            JSONObject var4 = null;

            try {
                var4 = Client.getInstance().getConfig().method21769(this.field41352.method13257());
            } catch (Exception var9) {
                var4 = new JSONObject();
            } finally {
                this.field41352.method13161(var4);
            }
        }

        if (var1.has("guiBlur")) {
            this.field41349 = var1.method21763("guiBlur");
        }

        if (var1.has("hqIngameBlur")) {
            this.field41350 = var1.method21763("hqIngameBlur");
        }
    }

    public Class<? extends Screen> method33477(String var1) {
        for (Entry var5 : field41338.entrySet()) {
            if (var1.equals(var5.getValue())) {
                return (Class<? extends Screen>) var5.getKey();
            }
        }

        return null;
    }

    public String method33478(Class<? extends Screen> var1) {
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

    public void onResize() {
        if (this.field41352 != null) {
            this.method33468(Client.getInstance().getConfig());

            try {
                this.field41352 = this.field41352.getClass().newInstance();
            } catch (IllegalAccessException | InstantiationException var4) {
                var4.printStackTrace();
            }

            this.method33476(Client.getInstance().getConfig());
        }

        if (Minecraft.getInstance().mainWindow.method8043() != 0 && Minecraft.getInstance().mainWindow.method8044() != 0) {
            field41348 = (float) Math.max(
                    Minecraft.getInstance().mainWindow.getFramebufferWidth() / Minecraft.getInstance().mainWindow.method8043(),
                    Minecraft.getInstance().mainWindow.getFramebufferHeight() / Minecraft.getInstance().mainWindow.method8044()
            );
        }

        Class3192.method11411(Minecraft.getInstance().mainWindow.method8043(), Minecraft.getInstance().mainWindow.method8044());
    }

    public Class4307 method33480() {
        return this.field41352;
    }

    public void method33481() {
        this.method33482(method33458(Minecraft.getInstance().currentScreen));
    }

    public void method33482(Class4307 var1) {
        if (this.field41352 != null) {
            this.method33468(Client.getInstance().getConfig());
        }

        this.field41352 = var1;
        this.field41356 = field41344;
        this.method33476(Client.getInstance().getConfig());
        if (this.field41352 != null) {
            this.field41352.method13028(this.field41354[0], this.field41354[1]);
        }

        if (Client.getInstance().getModuleManager() != null) {
            Client.getInstance().getModuleManager().method14668().method13734(null);
        }
    }

    public void method33483(Screen var1) {
        if (var1 != null) {
            Minecraft.getInstance().currentScreen = null;
            Minecraft.getInstance().displayGuiScreen(var1);
        }
    }

    public boolean method33484(Screen var1) {
        return field41337.containsKey(var1.getClass());
    }
}
