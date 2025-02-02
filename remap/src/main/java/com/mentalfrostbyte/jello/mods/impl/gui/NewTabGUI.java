// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.gui;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.awt.Color;

public class NewTabGUI extends Module
{
    private static final int field15800 = 3;
    private Color[] field15801;
    private Color[] field15802;
    private Color[] field15803;
    private Color[] field15804;
    private Color[] field15805;
    private int field15806;
    private int field15807;
    private int field15808;
    private int field15809;
    public List<Category> field15810;
    public HashMap<Category, Float> field15811;
    public HashMap<Module, Float> field15812;
    private int field15813;
    private int field15814;
    private int field15815;
    private int field15816;
    private int field15817;
    private float field15818;
    public boolean field15819;
    private Category field15820;
    private int field15821;
    private int field15822;
    private Module field15823;
    private int field15824;
    private float field15825;
    public static NewTabGUI field15826;
    public ArrayList<Class8479> field15827;
    public int field15828;
    public int field15829;
    public List<Category> field15830;
    public int field15831;
    
    public NewTabGUI() {
        super(Category.GUI, "TabGUI", "Manage mods without opening the ClickGUI");
        this.field15801 = new Color[3];
        this.field15802 = new Color[3];
        this.field15803 = new Color[3];
        this.field15804 = new Color[3];
        this.field15805 = new Color[3];
        this.field15806 = 10;
        this.field15807 = 90;
        this.field15808 = 150;
        this.field15809 = 150;
        this.field15810 = new ArrayList<Category>();
        this.field15811 = new HashMap<Category, Float>();
        this.field15812 = new HashMap<Module, Float>();
        this.field15813 = 0;
        this.field15814 = 0;
        this.field15815 = 0;
        this.field15816 = 30;
        this.field15817 = 4;
        this.field15818 = 1.0f;
        this.field15819 = false;
        this.field15821 = 0;
        this.field15824 = 170;
        this.field15825 = 0.0f;
        this.field15827 = new ArrayList<Class8479>();
        this.field15828 = ColorUtils.applyAlpha(ClientColors.field1273.color, 0.0625f);
        this.field15829 = ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.3f);
        this.field15830 = this.getCategories();
        this.field15831 = ColorUtils.applyAlpha(ClientColors.field1281.color, 0.05f);
        this.method9915(false);
        NewTabGUI.field15826 = this;
    }
    
    @EventListener
    @Class6763
    private void method10388(final Class5741 class5741) {
        if (!this.isEnabled() || NewTabGUI.mc.player == null) {
            return;
        }
        if (!Client.getInstance().method35193().method32146()) {
            return;
        }
        if (Minecraft.method5277().gameSettings.field23466) {
            return;
        }
        if (!Minecraft.method5277().gameSettings.field23464) {
            Class8707.method29896(this.field15806, this.field15807, this.field15808, this.field15809);
            if (this.field15819) {
                Class8707.method29896(170, this.field15807, this.field15824, this.field15821);
            }
        }
    }
    
    @EventListener
    @Class6763
    private void method10389(final Class5740 class5740) {
        if (this.isEnabled()) {
            if (NewTabGUI.mc.player != null) {
                if (NewTabGUI.mc.world != null) {
                    if (Minecraft.method5277().gameSettings.field23466) {
                        return;
                    }
                    if (!Minecraft.method5277().gameSettings.field23464) {
                        this.field15809 = 5 * this.field15816 + this.field15817;
                        final float abs = Math.abs(this.method10390() - this.field15825);
                        this.field15825 += Math.min(abs, abs * 0.14f * this.field15818) * ((this.method10390() - this.field15825 < 0.0f) ? -1 : 1);
                        this.field15807 = class5740.method17028();
                        this.method10398(this.field15806, this.field15807, this.field15808, this.field15809, this.field15801, null, this.field15802, 1.0f);
                        RenderUtil.method26869((float)this.field15806, (float)this.field15807, (float)this.field15808, (float)this.field15809);
                        this.method10394(this.field15806, this.field15807 - Math.round(this.field15825), this.field15830.size() * this.field15816 + this.field15817, this.field15808, this.field15813, false, 1.0f);
                        this.method10393(this.field15806, this.field15807 - Math.round(this.field15825), this.field15830);
                        RenderUtil.method26872();
                        if (this.field15819) {
                            this.field15821 = this.method10391(this.field15820).size() * this.field15816 + this.field15817;
                            this.method10398(170, this.field15807, this.field15824, this.field15821, this.field15803, this.field15805, this.field15804, 1.0f);
                            this.method10394(170, this.field15807, this.field15821, this.field15824, this.field15822, true, 1.0f);
                            this.method10392(170, this.field15807, this.method10391(this.field15820), 1.0f);
                        }
                        class5740.method17030(this.field15809 + 10);
                    }
                }
            }
        }
    }
    
    private int method10390() {
        return Math.max(this.field15813 * this.field15816 - 4 * this.field15816, 0);
    }
    
    private List<Module> method10391(final Category class8013) {
        final ArrayList list = new ArrayList();
        final Iterator<Module> iterator = Client.getInstance().method35189().method21554(class8013).iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }
    
    private void method10392(final int n, final int n2, final List<Module> list, final float n3) {
        int n4 = 0;
        for (final Module key : list) {
            if (this.field15822 == n4) {
                this.field15823 = key;
            }
            if (!this.field15812.containsKey(key)) {
                this.field15812.put(key, 0.0f);
            }
            if (this.field15822 == n4 && this.field15812.get(key) < 14.0f) {
                this.field15812.put(key, this.field15812.get(key) + this.field15818);
            }
            else if (this.field15822 != n4) {
                if (this.field15812.get(key) > 0.0f) {
                    this.field15812.put(key, this.field15812.get(key) - this.field15818);
                }
            }
            if (key.isEnabled()) {
                RenderUtil.drawString(ClientFonts.JelloMedium20, n + 11 + this.field15812.get(key), (float)(n2 + this.field15816 / 2 - ClientFonts.JelloMedium20.getHeight() / 2 + 3 + n4 * this.field15816), key.getName(), ClientColors.LIGHT_GREYISH_BLUE.color);
            }
            else {
                RenderUtil.drawString(ClientFonts.JelloLight20, n + 11 + this.field15812.get(key), (float)(n2 + this.field15816 / 2 - ClientFonts.JelloLight20.getHeight() / 2 + 2 + n4 * this.field15816), key.getName(), ClientColors.LIGHT_GREYISH_BLUE.color);
            }
            ++n4;
        }
    }
    
    private void method10393(final int n, final int n2, final List<Category> list) {
        int n3 = 0;
        for (final Category class8013 : list) {
            if (this.field15813 == n3) {
                this.field15820 = class8013;
            }
            if (!this.field15811.containsKey(class8013)) {
                this.field15811.put(class8013, 0.0f);
            }
            if (this.field15813 == n3 && this.field15811.get(class8013) < 14.0f) {
                this.field15811.put(class8013, this.field15811.get(class8013) + this.field15818);
            }
            else if (this.field15813 != n3) {
                if (this.field15811.get(class8013) > 0.0f) {
                    this.field15811.put(class8013, this.field15811.get(class8013) - this.field15818);
                }
            }
            RenderUtil.drawString(ClientFonts.JelloLight20, n + 11 + this.field15811.get(class8013), (float)(n2 + this.field15816 / 2 - ClientFonts.JelloLight20.getHeight() / 2 + 2 + n3 * this.field15816), class8013.toString(), -1);
            ++n3;
        }
    }
    
    private void method10394(final int n, final int n2, final int n3, final int n4, final int n5, final boolean b, final float n6) {
        int n7 = 0;
        if (b) {
            if (b) {
                final float n8 = (float)(n5 * this.field15816 - this.field15815);
                if (this.field15815 > n5 * this.field15816) {
                    this.field15815 += (int)((n8 * 0.14f * this.field15818 < 1.0f) ? (n8 * 0.14f * this.field15818) : (-this.field15818));
                }
                if (this.field15815 < n5 * this.field15816) {
                    this.field15815 += (int)((n8 * 0.14f * this.field15818 > 1.0f) ? (n8 * 0.14f * this.field15818) : this.field15818);
                }
                if (n8 > 0.0f) {
                    if (this.field15815 > n5 * this.field15816) {
                        this.field15815 = n5 * this.field15816;
                    }
                }
                if (n8 < 0.0f) {
                    if (this.field15815 < n5 * this.field15816) {
                        this.field15815 = n5 * this.field15816;
                    }
                }
                n7 = this.field15815;
            }
        }
        else {
            final float n9 = (float)(n5 * this.field15816 - this.field15814);
            if (this.field15814 > n5 * this.field15816) {
                this.field15814 += (int)((n9 * 0.14f * this.field15818 < 1.0f) ? (n9 * 0.14f * this.field15818) : (-this.field15818));
            }
            if (this.field15814 < n5 * this.field15816) {
                this.field15814 += (int)((n9 * 0.14f * this.field15818 > 1.0f) ? (n9 * 0.14f * this.field15818) : this.field15818);
            }
            if (n9 > 0.0f) {
                if (this.field15814 > n5 * this.field15816) {
                    this.field15814 = n5 * this.field15816;
                }
            }
            if (n9 < 0.0f) {
                if (this.field15814 < n5 * this.field15816) {
                    this.field15814 = n5 * this.field15816;
                }
            }
            n7 = this.field15814;
        }
        if (Math.round(this.field15825) > 0) {
            if (this.field15814 > 120) {
                this.field15814 = Math.max(this.field15814, 120 + Math.round(this.field15825));
            }
        }
        RenderUtil.method26876((float)n, (n7 >= 0) ? ((float)(n7 + n2)) : ((float)n2), (float)(n + n4), (n7 + this.field15817 + this.field15816 <= n3) ? ((float)(n7 + n2 + this.field15816 + this.field15817)) : ((float)(n2 + n3 + this.field15817)), this.field15828);
        RenderUtil.method26899((float)n, (n7 + this.field15817 + this.field15816 <= n3) ? ((float)(n7 + n2 + this.field15816 - 10)) : ((float)(n2 + n3 - 10)), (float)n4, 14.0f, ClientAssets.shadow_top, this.field15829);
        RenderUtil.method26899((float)n, (n7 >= 0) ? ((float)(n7 + n2)) : ((float)n2), (float)n4, 14.0f, ClientAssets.shadow_bottom, this.field15829);
        RenderUtil.method26870(n, (n7 >= 0) ? (n7 + n2) : n2, n + n4, (n7 + this.field15817 + this.field15816 <= n3) ? (n7 + n2 + this.field15816 + this.field15817) : (n2 + n3 + this.field15817));
        final Iterator<Class8479> iterator = this.field15827.iterator();
        while (iterator.hasNext()) {
            final Class8479 class8479 = iterator.next();
            if (class8479.field34795 == b) {
                final float method35858 = class8479.field34796.calcPercent();
                int n10 = ColorUtils.applyAlpha(-5658199, (1.0f - method35858 * (0.5f + method35858 * 0.5f)) * 0.8f);
                if (Client.getInstance().method35193().method32146()) {
                    n10 = ColorUtils.applyAlpha(-1, (1.0f - method35858) * 0.14f);
                }
                RenderUtil.method26886((float)n, (n7 >= 0) ? ((float)(n7 + n2 + 14)) : ((float)n2), n4 * Class7791.method25030(method35858, 0.0f, 1.0f, 1.0f) + 4.0f, n10);
                if (class8479.field34796.calcPercent() != 1.0f) {
                    continue;
                }
                iterator.remove();
            }
        }
        RenderUtil.method26872();
    }
    
    private List<Category> getCategories() {
        final ArrayList list = new ArrayList();
        list.add(Category.MOVEMENT);
        list.add(Category.PLAYER);
        list.add(Category.COMBAT);
        list.add(Category.ITEM);
        list.add(Category.RENDER);
        list.add(Category.WORLD);
        list.add(Category.MISC);
        return list;
    }
    
    @EventListener
    private void method10396(final Class5739 class5739) {
        if (this.isEnabled() && NewTabGUI.mc.player != null) {
            this.method10399();
            final float n = 6.0f;
            final Minecraft field15514 = NewTabGUI.mc;
            this.field15818 = (float)Math.max(Math.round(n - Minecraft.method5338() / 10.0f), 1);
        }
    }
    
    @EventListener
    private void method10397(final Class5752 class5752) {
        if (!this.isEnabled()) {
            return;
        }
        switch (class5752.method17061()) {
            case 265: {
                if (!this.field15819) {
                    --this.field15813;
                    this.field15822 = 0;
                    break;
                }
                --this.field15822;
                break;
            }
            case 264: {
                if (!this.field15819) {
                    ++this.field15813;
                    this.field15822 = 0;
                    break;
                }
                ++this.field15822;
                break;
            }
            case 263: {
                this.field15819 = false;
                break;
            }
            case 262: {
                this.field15827.add(new Class8479(this, this.field15819));
                if (this.field15819) {
                    this.field15823.method9910();
                }
                this.field15819 = true;
                break;
            }
            case 257: {
                if (this.field15819) {
                    this.field15823.method9910();
                    this.field15827.add(new Class8479(this, this.field15819));
                    break;
                }
                break;
            }
            default: {
                return;
            }
        }
        if (this.field15813 >= this.field15830.size()) {
            this.field15813 = 0;
            this.field15814 = this.field15813 * this.field15816 - this.field15816;
        }
        else if (this.field15813 < 0) {
            this.field15813 = this.field15830.size() - 1;
            this.field15814 = this.field15813 * this.field15816 + this.field15816;
        }
        if (this.field15822 >= this.method10391(this.field15820).size()) {
            this.field15822 = this.method10391(this.field15820).size() - 1;
        }
        else if (this.field15822 < 0) {
            this.field15822 = 0;
        }
    }
    
    private void method10398(final int n, final int n2, final int n3, final int n4, final Color[] array, final Color[] array2, final Color[] array3, final float n5) {
        final boolean method32146 = Client.getInstance().method35193().method32146();
        int n6 = ColorUtils.method19110(array).getRGB();
        int n7 = ColorUtils.method19110(array3).getRGB();
        if (array2 != null) {
            final int rgb = ColorUtils.method19110(array2).getRGB();
            n6 = ColorUtils.method19120(n6, rgb, 0.75f);
            n7 = ColorUtils.method19120(n7, rgb, 0.75f);
        }
        if (!method32146) {
            RenderUtil.method26881(n, n2, n + n3, n2 + n4, n6, n7);
        }
        else {
            RenderUtil.method26869((float)n, (float)n2, (float)n3, (float)n4);
            Class8707.method29899();
            RenderUtil.method26872();
            RenderUtil.method26876((float)n, (float)n2, (float)(n + n3), (float)(n2 + n4), this.field15831);
        }
        RenderUtil.method26913((float)n, (float)n2, (float)n3, (float)n4, 8.0f, 0.7f * n5);
    }
    
    private void method10399() {
        if (Client.getInstance().method35193().method32146()) {
            return;
        }
        if (Minecraft.method5277().gameSettings.field23466) {
            return;
        }
        if (!Minecraft.method5277().gameSettings.field23464) {
            for (int i = 0; i < 3; ++i) {
                this.field15801[i] = this.method10400(this.field15806 + this.field15808 / 3 * i, this.field15807, this.field15801[i]);
                this.field15802[i] = this.method10400(this.field15806 + this.field15808 / 3 * i, this.field15807 + this.field15809, this.field15802[i]);
                this.field15803[i] = this.method10400(this.field15806 + this.field15808 + 56 * i, this.field15807, this.field15803[i]);
                this.field15804[i] = this.method10400(this.field15806 + this.field15808 + 56 * i, this.field15807 + this.field15821, this.field15804[i]);
                this.field15805[i] = this.method10400(this.field15806 + this.field15808 + 56 * i, this.field15807 + this.field15821 / 2, this.field15805[i]);
            }
        }
    }
    
    private Color method10400(final int n, final int n2, final Color color) {
        Color color2 = RenderUtil.method26930(n, n2, color);
        if (color != null) {
            color2 = ColorUtils.method19109(color2, color, 0.08f * this.field15818);
        }
        return color2;
    }
}
