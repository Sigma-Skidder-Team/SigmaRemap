package com.mentalfrostbyte.jello.settings;

import com.mentalfrostbyte.jello.unmapped.SettingType;
import mapped.Class9792;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public abstract class Setting<T> {
    public final SettingType settingType;
    public final String name;
    public final String description;
    private final List<Class9792> observers = new ArrayList<Class9792>();
    public T currentValue;
    public T defaultValue;

    public Setting(String name, String description, SettingType settingType, T defaultValue) {
        this.settingType = settingType;
        this.currentValue = this.defaultValue = defaultValue;
        this.name = name;
        this.description = description;
    }

    public abstract JSONObject loadCurrentValueFromJSONObject(JSONObject jsonObject);

    public JSONObject addDataToJSONObject(JSONObject jsonObject) {
        jsonObject.put("name", this.getName());
        jsonObject.put("value", this.currentValue);
        return jsonObject;
    }

    public void resetToDefault() {
        this.currentValue = this.defaultValue;
    }

    public final Setting<T> addObserver(Class9792 observer) {
        this.observers.add(observer);
        return this;
    }

    public final void notifyObservers() {
        for (Class9792 observer : this.observers) {
            observer.method38603(this);
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
