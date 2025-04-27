// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.thizzer.jtouchbar.common.Color;
import com.thizzer.jtouchbar.item.view.TouchBarButton$ButtonType;
import com.thizzer.jtouchbar.item.TouchBarItem;
import com.thizzer.jtouchbar.item.view.TouchBarTextField;
import mapped.*;
import org.lwjgl.glfw.GLFWNativeCocoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Set;
import com.thizzer.jtouchbar.item.view.TouchBarButton;
import java.util.HashMap;
import java.util.LinkedHashSet;
import com.thizzer.jtouchbar.JTouchBar;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

public class JelloTouch
{
    public JTouchBar field27848;
    private final LinkedHashSet<Class8879> field27849;
    public boolean field27850;
    public HashMap<Module, TouchBarButton> field27851;
    
    public JelloTouch() {
        this.field27849 = new LinkedHashSet<Class8879>();
        this.field27850 = false;
        this.field27851 = new HashMap<Module, TouchBarButton>();
        Client.getInstance().getEventBus().registerInstance(this);
        if (ConfigJsonUtil.field41028) {
            this.field27849.add(new Class8879(344, ClickGuiHolder.class));
        }
    }
    
    public Set<Class8879> method21955() {
        return this.field27849;
    }
    
    public void method21956(final int n, final Module class3167) {
        this.method21958(class3167);
        this.field27849.add(new Class8879(n, class3167));
        this.method21967();
    }
    
    public void method21957(final int n, final Class<? extends Screen> clazz) {
        this.method21958(clazz);
        this.field27849.add(new Class8879(n, clazz));
        this.method21967();
    }
    
    public void method21958(final Object obj) {
        final Iterator<Object> iterator = this.field27849.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method31232().equals(obj)) {
                continue;
            }
            iterator.remove();
        }
    }
    
    public int method21959(final Class<? extends Screen> clazz) {
        for (final Class8879 class8879 : this.field27849) {
            if (class8879.method31231() == Class2093.field12103 && class8879.method31233() == clazz) {
                return class8879.method31229();
            }
        }
        return -1;
    }
    
    public int method21960(final Module class3167) {
        for (final Class8879 class3168 : this.field27849) {
            if (class3168.method31231() == Class2093.field12102 && class3168.method31234() == class3167) {
                return class3168.method31229();
            }
        }
        return -1;
    }
    
    public Class8879 method21961(final int n) {
        if (n != -1) {
            for (final Class8879 class8879 : this.field27849) {
                if (class8879.method31229() != n) {
                    continue;
                }
                return class8879;
            }
            return null;
        }
        return null;
    }
    
    public JSONObject method21962(final JSONObject JSONObject) {
        final JSONArray class4406 = new JSONArray();
        for (final Class8879 class4407 : this.field27849) {
            if (class4407.method31229() == -1) {
                continue;
            }
            if (class4407.method31229() == 0) {
                continue;
            }
            class4406.put(class4407.method31227());
        }
        JSONObject.put("keybinds", class4406);
        return JSONObject;
    }
    
    public void method21963(final JSONObject JSONObject) {
        if (JSONObject.has("keybinds")) {
            final JSONArray method13263 = JSONObject.getJSONArray("keybinds");
            for (int i = 0; i < method13263.length(); ++i) {
                final Class8879 e = new Class8879(method13263.getJSONObject(i));
                if (e.method31228()) {
                    this.field27849.add(e);
                }
            }
        }
    }
    
    public List<Class8879> method21964(final int n) {
        final ArrayList list = new ArrayList();
        if (n != -1) {
            for (final Class8879 e : this.field27849) {
                if (e.method31229() != n) {
                    continue;
                }
                list.add(e);
            }
            return list;
        }
        return null;
    }
    
    @EventListener
    public void method21965(final EventPlayerTick eventPlayerTick) {
        if (Minecraft.getInstance().world == null && this.field27850) {
            this.method21969();
        }
        else if (Minecraft.getInstance().world != null) {
            if (!this.field27850) {
                this.method21967();
            }
        }
    }
    
    public boolean method21966() {
        if (Minecraft.field4623) {
            if (Client.getInstance().getClientMode() == ClientMode.JELLO) {
                if (!System.getProperty("os.version").startsWith("10.14")) {
                    if (!System.getProperty("os.version").startsWith("10.15")) {
                        return System.getProperty("os.version").startsWith("10.16");
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    public void method21967() {
        if (this.method21966()) {
            if (this.field27848 != null) {
                this.field27848.hide(GLFWNativeCocoa.glfwGetCocoaWindow(Minecraft.getInstance().window.getHandle()));
            }
            (this.field27848 = new JTouchBar()).setCustomizationIdentifier("JelloTouch");
            this.method21970();
            if (this.field27848.getItems().size() == 0) {
                final TouchBarTextField view = new TouchBarTextField();
                view.setStringValue(" Jello for Sigma 5.0   -   Open the keybind manager to add keybinds here!");
                this.field27848.addItem(new TouchBarItem("Jello", view, true));
            }
            this.field27848.show(GLFWNativeCocoa.glfwGetCocoaWindow(Minecraft.getInstance().window.getHandle()));
            this.field27850 = true;
        }
    }
    
    public void method21968(final Module class3167) {
        if (this.field27848 != null) {
            for (final TouchBarItem touchBarItem : this.field27848.getItems()) {
                if (!(touchBarItem.getView() instanceof TouchBarButton)) {
                    continue;
                }
                if (!class3167.getName().equals(touchBarItem.getIdentifier())) {
                    continue;
                }
                ((TouchBarButton)touchBarItem.getView()).setBezelColor(this.method21971(class3167));
                new Thread(() -> {
                    try {
                        Thread.sleep(200L);
                        ((TouchBarButton)touchBarItem2.getView()).setBezelColor(this.method21971(class3168));
                    }
                    catch (final InterruptedException ex) {}
                }).start();
            }
        }
    }
    
    public void method21969() {
        if (this.method21966()) {
            if (this.field27848 != null) {
                this.field27848.hide(GLFWNativeCocoa.glfwGetCocoaWindow(Minecraft.getInstance().window.getHandle()));
            }
            (this.field27848 = new JTouchBar()).setCustomizationIdentifier("JelloTouch");
            final TouchBarTextField view = new TouchBarTextField();
            view.setStringValue(" Jello for Sigma 5.0   -   © SIGMA Prod");
            this.field27848.addItem(new TouchBarItem("Jello", view, true));
            this.field27848.show(GLFWNativeCocoa.glfwGetCocoaWindow(Minecraft.getInstance().window.getHandle()));
            this.field27850 = false;
        }
    }
    
    public void method21970() {
        this.field27848.getItems().clear();
        this.field27851.clear();
        for (final Class8879 class8879 : this.field27849) {
            if (class8879.method31231() == Class2093.field12102) {
                if (class8879.method31229() <= 0) {
                    continue;
                }
                final TouchBarButton touchBarButton = new TouchBarButton();
                touchBarButton.setTitle(class8879.method31234().getName());
                touchBarButton.setBezelColor(this.method21971(class8879.method31234()));
                touchBarButton.setType(TouchBarButton$ButtonType.TOGGLE);
                touchBarButton.setAction(new Class2435(this, class8879));
                this.field27851.put(class8879.method31234(), touchBarButton);
                this.field27848.addItem(new TouchBarItem(class8879.method31234().getName(), touchBarButton, true));
            }
        }
    }
    
    public Color method21971(final Module class3167) {
        Color color = new Color(0.0f, 0.0f, 0.0f, 0.0f);
        if (class3167.getCategoryBasedOnMode() != Category.COMBAT) {
            if (class3167.getCategoryBasedOnMode() != Category.GUI) {
                if (class3167.getCategoryBasedOnMode() != Category.ITEM) {
                    if (class3167.getCategoryBasedOnMode() != Category.MISC) {
                        if (class3167.getCategoryBasedOnMode() != Category.MOVEMENT) {
                            if (class3167.getCategoryBasedOnMode() != Category.PLAYER) {
                                if (class3167.getCategoryBasedOnMode() != Category.RENDER) {
                                    if (class3167.getCategoryBasedOnMode() == Category.WORLD) {
                                        color = this.method21972(-5118535, class3167.isEnabled());
                                    }
                                }
                                else {
                                    color = this.method21972(-1710108, class3167.isEnabled());
                                }
                            }
                            else {
                                color = this.method21972(-4208147, class3167.isEnabled());
                            }
                        }
                        else {
                            color = this.method21972(-1587309, class3167.isEnabled());
                        }
                    }
                    else {
                        color = this.method21972(-1916956, class3167.isEnabled());
                    }
                }
                else {
                    color = this.method21972(-2899864, class3167.isEnabled());
                }
            }
            else {
                color = this.method21972(-2697514, class3167.isEnabled());
            }
        }
        else {
            color = this.method21972(-20561, class3167.isEnabled());
        }
        color.setAlpha(class3167.isEnabled() ? 1.0f : 0.35f);
        return color;
    }
    
    public Color method21972(final int n, final boolean b) {
        final float[] rgBtoHSB = java.awt.Color.RGBtoHSB(n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, null);
        final float hue = rgBtoHSB[0];
        float saturation = rgBtoHSB[1];
        float brightness = rgBtoHSB[2];
        if (b) {
            saturation *= 1.5f;
            brightness *= 0.6f;
        }
        final int hsBtoRGB = java.awt.Color.HSBtoRGB(hue, saturation, brightness);
        return new Color((hsBtoRGB >> 16 & 0xFF) / 255.0f, (hsBtoRGB >> 8 & 0xFF) / 255.0f, (hsBtoRGB & 0xFF) / 255.0f, (hsBtoRGB >> 24 & 0xFF) / 255.0f);
    }
}
