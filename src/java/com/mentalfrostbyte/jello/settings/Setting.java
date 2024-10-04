package com.mentalfrostbyte.jello.settings;

import com.mentalfrostbyte.jello.settings.interfaces.SettingObserver;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public abstract class Setting<T> {
    public final SettingType settingType;
    public final String name;
    public final String description;
    private final List<SettingObserver> observers = new ArrayList<SettingObserver>();
    public T currentValue;
    public T defaultValue;

    public Setting(String name, String description, SettingType settingType, T defaultValue) {
        this.settingType = settingType;
        this.currentValue = this.defaultValue = defaultValue;
        this.name = name;
        this.description = description;
    }

    public abstract JSONObject loadCurrentValueFromJSONObject(JSONObject jsonObject);

    public JSONObject buildUpSettingData(JSONObject jsonObject) {
        jsonObject.put("name", this.getName());
        jsonObject.put("value", this.currentValue);
        return jsonObject;
    }

    public void resetToDefault() {
        this.currentValue = this.defaultValue;
    }

    public final Setting<T> addObserver(SettingObserver observer) {
        this.observers.add(observer);
        return this;
    }

    public final void notifyObservers() {
        for (SettingObserver observer : this.observers) {
            observer.observe(this);
        }
    }

    public SettingType getSettingType() {
        return this.settingType;
    }

    public T getCurrentValue() {
        return this.currentValue;
    }

    public void setCurrentValue(T value) {
        this.updateCurrentValue(value, true);
    }

    public void updateCurrentValue(T value, boolean notify) {
        if (this.currentValue != value) {
            this.currentValue = value;
            if (notify) {
                this.notifyObservers();
            }
        }
    }

    public void clearPremiumModes() {
    }

    public boolean hasPremiumSettings() {
        return false;
    }

    public T getDefaultValue() {
        return this.defaultValue;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return this.getCurrentValue().toString();
    }
}
