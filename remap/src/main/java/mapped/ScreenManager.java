// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.io.IOException;
import java.io.File;
import java.awt.Color;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.mods.impl.gui.TabGUI;
import org.lwjgl.opengl.GL11;

import java.util.Iterator;

import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;

import org.lwjgl.glfw.GLFWKeyCallback;
import totalcross.json.JSONObject;

import java.util.List;
import java.util.Map;

public class ScreenManager {
    private static final Map<Class<? extends Screen>, Class<? extends Class4800>> replacements;
    public static final Map<Class<? extends Screen>, String> field37983;
    private final List<Integer> field37984;
    private final List<Integer> field37985;
    private final List<Integer> field37986;
    private final List<Integer> field37987;
    private final List<Integer> field37988;
    public static long field37989;
    public static long field37990;
    public static long field37991;
    public double field37992;
    public static float guiScale;
    private boolean field37994;
    private boolean field37995;
    private static boolean field37996;
    private Class4800 field37997;
    private GLFWKeyCallback field37998;
    public int[] field37999;
    private long field38000;
    private long field38001;
    public boolean field38002;

    public ScreenManager() {
        this.field37984 = new ArrayList<Integer>();
        this.field37985 = new ArrayList<Integer>();
        this.field37986 = new ArrayList<Integer>();
        this.field37987 = new ArrayList<Integer>();
        this.field37988 = new ArrayList<Integer>();
        this.field37994 = true;
        this.field37995 = true;
        this.field37999 = new int[2];
        this.field38000 = ScreenManager.field37989;
        this.field38001 = ScreenManager.field37989;
        ScreenManager.field37989 = GLFW.glfwCreateStandardCursor(221185);
        ScreenManager.field37990 = GLFW.glfwCreateStandardCursor(221188);
        ScreenManager.field37991 = GLFW.glfwCreateStandardCursor(221186);
        GLFW.glfwSetCursor(Minecraft.getInstance().window.getHandle(), ScreenManager.field37989);
        ScreenManager.guiScale = (float) (Minecraft.getInstance().window.method7693() / Minecraft.getInstance().window.method7695());
    }

    public void putClassicScreens() {
        ScreenManager.replacements.clear();
        ScreenManager.replacements.put(MainMenu.class, ClassicMainMenu.class);
        ScreenManager.replacements.put(ClickGuiHolder.class, ClassicClickGui.class);
    }

    public void method32127(final int n, final int n2) {
        if (n2 != 1 && n2 != 2) {
            if (n2 == 0) {
                this.field37985.add(n);
            }
        } else {
            this.field37984.add(n);
        }
    }

    public void method32128(final int i, final int n) {
        this.field37988.add(i);
    }

    public void method32129(final double n, final double n2) {
        this.field37992 += n2;
    }

    public void method32130(final int n, final int n2) {
        if (n2 != 1) {
            if (n2 == 0) {
                this.field37987.add(n);
            }
        } else {
            this.field37986.add(n);
        }
    }

    public static boolean method32131(final Screen class527) {
        if (class527 instanceof Class720 && !(class527 instanceof Class721)) {
            Minecraft.getInstance().currentScreen = null;
            Minecraft.getInstance().displayGuiScreen(new Class721(((Class720) class527).field3931));
            return true;
        }
        if (class527 instanceof Class551 && !(class527 instanceof Class552)) {
            Minecraft.getInstance().currentScreen = null;
            Minecraft.getInstance().displayGuiScreen(new Class552());
            return true;
        }
        if (Client.getInstance().getClientMode() == ClientMode.NOADDONS) {
            if (class527 instanceof MainMenu) {
                if (!(class527 instanceof Class549)) {
                    Minecraft.getInstance().currentScreen = null;
                    Minecraft.getInstance().displayGuiScreen(new Class549());
                    return true;
                }
            }
        }
        return false;
    }

    public static Class4800 method32132(final Screen class527) {
        if (class527 == null) {
            return null;
        }
        if (Client.getInstance().getClientMode() == ClientMode.INDETERMINATE) {
            return new Class4939();
        }
        if (method32131(class527)) {
            return null;
        }
        if (!ScreenManager.replacements.containsKey(class527.getClass())) {
            return null;
        }
        try {
            return ScreenManager.replacements.get(class527.getClass()).newInstance();
        } catch (final InstantiationException ex) {
            ex.printStackTrace();
        } catch (final IllegalAccessException ex2) {
            ex2.printStackTrace();
        }
        return null;
    }

    public void method32133(final long field38000) {
        this.field38000 = field38000;
    }

    public void method32134() {
        if (this.field37997 != null) {
            this.field37999[0] = Math.max(0, Math.min(Minecraft.getInstance().window.method7694(), (int) Minecraft.getInstance().field4650.method26959()));
            this.field37999[1] = Math.max(0, Math.min(Minecraft.getInstance().window.method7695(), (int) Minecraft.getInstance().field4650.method26960()));
            final Iterator<Integer> iterator = this.field37984.iterator();
            while (iterator.hasNext()) {
                this.method32137(iterator.next());
            }
            final Iterator<Integer> iterator2 = this.field37985.iterator();
            while (iterator2.hasNext()) {
                this.method32135(iterator2.next());
            }
            final Iterator<Integer> iterator3 = this.field37986.iterator();
            while (iterator3.hasNext()) {
                this.method32140(this.field37999[0], this.field37999[1], iterator3.next());
            }
            final Iterator<Integer> iterator4 = this.field37987.iterator();
            while (iterator4.hasNext()) {
                this.method32141(this.field37999[0], this.field37999[1], iterator4.next());
            }
            final Iterator<Integer> iterator5 = this.field37988.iterator();
            while (iterator5.hasNext()) {
                this.method32136((char) (int) iterator5.next());
            }
            this.field37984.clear();
            this.field37985.clear();
            this.field37986.clear();
            this.field37987.clear();
            this.field37988.clear();
            if (this.field37992 == 0.0) {
                this.field38002 = false;
            } else {
                this.method32139((float) this.field37992);
                this.field37992 = 0.0;
                this.field38002 = true;
            }
            if (this.field37997 != null) {
                this.field38000 = ScreenManager.field37989;
                this.field37997.method14200(this.field37999[0], this.field37999[1]);
            }
        }
    }

    public void method32135(final int n) {
        if (this.field37997 != null) {
            this.field37997.method14231(n);
        }
    }

    public void method32136(final char c) {
        if (this.field37997 != null) {
            this.field37997.method14232(c);
        }
    }

    public void method32137(final int n) {
        if (this.field37997 != null) {
            this.field37997.method14204(n);
        }
    }

    public void renderWatermark() {
        ClientAssets.gingerbread.bind();
        if (Minecraft.getInstance().world != null) {
            GL11.glDisable(2896);
            int n = 0;
            final int n2 = 0;
            final int n3 = 170;
            if (Minecraft.getInstance().gameSettings.field23466) {
                n = Minecraft.getInstance().window.method7694() / 2 - n3 / 2;
            }
            if (Client.getInstance().getClientMode() != ClientMode.JELLO) {
                final float n4 = 0.5f + TabGUI.field15637.calcPercent() * 0.5f;
                GL11.glAlphaFunc(516, 0.1f);
                RenderUtil.method26874(4.0f, 2.0f, 106.0f, 28.0f, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.6f * n4));
                RenderUtil.drawString(ClassicAssets.field40811, 9.0f, 2.0f, "Sigma", ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.5f * n4));
                RenderUtil.drawString(ClassicAssets.field40811, 8.0f, 1.0f, "Sigma", ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, Math.min(1.0f, n4 * 1.2f)));
                final int rgb = Color.getHSBColor(System.currentTimeMillis() % 4000L / 4000.0f, 1.0f, 1.0f).getRGB();
                RenderUtil.drawString(ClassicAssets.field40814, 73.0f, 2.0f, "5.0.0", ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.5f));
                RenderUtil.drawString(ClassicAssets.field40814, 72.0f, 1.0f, "5.0.0", ColorUtils.applyAlpha(rgb, Math.min(1.0f, n4 * 1.4f)));
            } else {
                GL11.glAlphaFunc(519, 0.0f);
                RenderUtil.method26905((float) n, (float) n2, 170.0f, 104.0f, (ScreenManager.guiScale <= 1.0f) ? ClientAssets.jello_watermark : ClientAssets.jello_watermark2x);
            }
            Client.getInstance().getEventBus().post(new Class5740());
        }
        if (this.field37997 != null) {
            if (Minecraft.getInstance().field4701 == null) {
                this.field37997.draw(1.0f);
            }
        }
    }

    public void method32139(final float n) {
        if (this.field37997 != null) {
            if (Minecraft.getInstance().field4701 == null) {
                this.field37997.method14235(n);
            }
        }
    }

    public void method32140(final int n, final int n2, final int n3) {
        if (this.field37997 != null) {
            if (Minecraft.getInstance().field4701 == null) {
                this.field37997.method14211(n, n2, n3);
            }
        }
    }

    public void method32141(final int n, final int n2, final int n3) {
        if (this.field37997 != null) {
            if (Minecraft.getInstance().field4701 == null) {
                this.field37997.method14233(n, n2, n3);
            }
        }
    }

    public JSONObject method32142(final JSONObject JSONObject) {
        if (this.field37997 != null) {
            final JSONObject method14202 = this.field37997.method14202(new JSONObject());
            if (method14202.length() != 0) {
                JSONObject.put(this.field37997.method14266(), method14202);
            }
        }
        JSONObject.put("guiBlur", this.field37994);
        JSONObject.put("hqIngameBlur", this.field37995);
        JSONObject.put("hidpicocoa", ScreenManager.field37996);
        return JSONObject;
    }

    public void method32143(final boolean field37994) {
        this.field37994 = field37994;
    }

    public boolean method32144() {
        return this.field37994;
    }

    public void method32145(final boolean field37995) {
        this.field37995 = field37995;
    }

    public boolean method32146() {
        return this.field37995;
    }

    public void method32147(final boolean field37996) {
        ScreenManager.field37996 = field37996;
    }

    public boolean method32148() {
        return ScreenManager.field37996;
    }

    public static void method32149() {
        Minecraft.getInstance();
        if (!Minecraft.field4623) {
            return;
        }
        try {
            final JSONObject method35586 = ConfigJsonUtil.method35586(new File(Client.getInstance().getFile() + "/config.json"));
            if (method35586.has("hidpicocoa")) {
                ScreenManager.field37996 = method35586.getBoolean("hidpicocoa");
            }
            GLFW.glfwWindowHint(143361, ScreenManager.field37996 ? 1 : 0);
        } catch (final IOException ex) {
            ex.printStackTrace();
        }
    }

    public void method32150(final JSONObject JSONObject) {
        if (this.field37997 != null) {
            JSONObject method13264 = null;
            try {
                method13264 = Client.getInstance().getConfig().getJSONObject(this.field37997.method14266());
            } catch (final Exception ex) {
                method13264 = new JSONObject();
            } finally {
                this.field37997.method14203(method13264);
            }
        }
        if (JSONObject.has("guiBlur")) {
            this.field37994 = JSONObject.getBoolean("guiBlur");
        }
        if (JSONObject.has("hqIngameBlur")) {
            this.field37995 = JSONObject.getBoolean("hqIngameBlur");
        }
    }

    public Class<? extends Screen> method32151(final String s) {
        for (final Map.Entry<K, Object> entry : ScreenManager.field37983.entrySet()) {
            if (!s.equals(entry.getValue())) {
                continue;
            }
            return (Class) entry.getKey();
        }
        return null;
    }

    public String method32152(final Class<? extends Screen> clazz) {
        if (clazz != null) {
            for (final Map.Entry entry : ScreenManager.field37983.entrySet()) {
                if (clazz != entry.getKey()) {
                    continue;
                }
                return (String) entry.getValue();
            }
            return "";
        }
        return "";
    }

    public void method32153() {
        if (this.field37997 != null) {
            this.method32142(Client.getInstance().getConfig());
            try {
                this.field37997 = this.field37997.getClass().newInstance();
            } catch (final InstantiationException | IllegalAccessException ex) {
                ex.printStackTrace();
            }
            this.method32150(Client.getInstance().getConfig());
        }
        if (Minecraft.getInstance().window.method7694() != 0 && Minecraft.getInstance().window.method7695() != 0) {
            ScreenManager.guiScale = (float) Math.max(Minecraft.getInstance().window.method7692() / Minecraft.getInstance().window.method7694(), Minecraft.getInstance().window.method7693() / Minecraft.getInstance().window.method7695());
        }
        RenderUtil.method26861(Minecraft.getInstance().window.method7694(), Minecraft.getInstance().window.method7695());
    }

    public Class4800 method32154() {
        return this.field37997;
    }

    public void method32155() {
        this.method32156(method32132(Minecraft.getInstance().currentScreen));
    }

    public void method32156(final Class4800 field37997) {
        if (this.field37997 != null) {
            this.method32142(Client.getInstance().getConfig());
        }
        this.field37997 = field37997;
        this.field38001 = ScreenManager.field37989;
        this.method32150(Client.getInstance().getConfig());
        if (this.field37997 != null) {
            this.field37997.method14200(this.field37999[0], this.field37999[1]);
        }
        if (Client.getInstance().moduleManager() != null) {
            Client.getInstance().moduleManager().getJelloTouch().method21965(null);
        }
    }

    public void method32157(final Screen class527) {
        if (class527 != null) {
            Minecraft.getInstance().currentScreen = null;
            Minecraft.getInstance().displayGuiScreen(class527);
        }
    }

    public boolean method32158(final Screen class527) {
        return ScreenManager.replacements.containsKey(class527.getClass());
    }

    static {
        replacements = new HashMap<Class<? extends Screen>, Class<? extends Class4800>>();
        field37983 = new HashMap<Class<? extends Screen>, String>();
        ScreenManager.replacements.put(MainMenu.class, MainMenuScreen.class);
        ScreenManager.replacements.put(ClickGuiHolder.class, Class4801.class);
        ScreenManager.replacements.put(Class531.class, Class4940.class);
        ScreenManager.replacements.put(Class739.class, Class4935.class);
        ScreenManager.replacements.put(Class560.class, Class4932.class);
        ScreenManager.replacements.put(Class553.class, Class4927.class);
        ScreenManager.replacements.put(Class555.class, Class4941.class);
        ScreenManager.replacements.put(Class718.class, Class4802.class);
        ScreenManager.field37983.put(ClickGuiHolder.class, "Click GUI");
        ScreenManager.field37983.put(Class531.class, "Keybind Manager");
        ScreenManager.field37983.put(Class739.class, "Jello Maps");
        ScreenManager.field37983.put(Class560.class, "Snake");
        ScreenManager.field37983.put(Class553.class, "Spotlight");
        ScreenManager.guiScale = 1.0f;
        ScreenManager.field37996 = true;
    }
}
